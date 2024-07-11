package com.sagemcintegration.controller;

import com.sagemcintegration.dto.requestDTO;
import com.sagemcintegration.dto.responseDTO;
import com.sagemcintegration.model.mssql.hi.gl.*;
import com.sagemcintegration.model.mssql.ic.ap.Apven;
import com.sagemcintegration.model.mssql.ic.gl.*;
import com.sagemcintegration.model.mssql.ic.gl.Glbctl;
import com.sagemcintegration.model.mssql.ic.gl.Gljeh;
import com.sagemcintegration.repository.mssql.hi.ap.HIApven_repo;
import com.sagemcintegration.repository.mssql.ic.ap.Apven_repo;
import com.sagemcintegration.service.hiservice;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class controller {
    private HttpServletRequest request;
    private final Apven_repo apven_repo;
    private final HIApven_repo HIApven_repo;
    private final com.sagemcintegration.service.service service;
    //private final hiservice hiservice;
    private final JavaMailSender mailSender;

    private String getClientIp() {
        String remoteAddr = "";
        if (request != null) {
            remoteAddr = request.getHeader("X-FORWARDED-FOR");
            if (remoteAddr == null || "".equals(remoteAddr)) {
                remoteAddr = request.getRemoteAddr();
            }
        }

        return remoteAddr;
    }

    public String getBatchNumber(int num) {

        return String.format("%05d", num);

    }

    private static final int CONSTANT_1 = 20;
    private static final int CONSTANT_2 = 40;

    public static String[] generateTransactionNumber(int num) {
        int num1 = (num - 1) * 40 + 20;
        int num2 = (num - 1) * 40 + 40;
        num1 = num1 + (num1 % 2); // Ensure that num1 is even
        num2 = num2 + (num2 % 2);

        String[] transactionNumbers = new String[2];
        transactionNumbers[0] = String.format("%010d", num1);
        transactionNumbers[1] = String.format("%010d", num2);

        return transactionNumbers;
    }


    @PostMapping("/Transaction/PostGLTxn")
    public ResponseEntity<responseDTO> postGlTransction(@RequestBody requestDTO requestDTO) {
        try {
            if (isAnyFieldEmpty(requestDTO)) {
                responseDTO response = responseDTO.builder()
                        .responseCode(HttpStatus.BAD_REQUEST.value())
                        .responseMessage("One or more fields are empty.")
                        .build();
                return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
            }

            if (service.findByAccountId(requestDTO)) {
                //Apven obj = apven_repo.findByBankid(requestDTO.getCreditAccountId());
                //requestDTO.setCreditAccountId(obj.getBankid());
                String datestr = requestDTO.getTransactionDate();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate date = LocalDate.parse(datestr, formatter);
                String batchdesc = "Materials Control Entries for-" + date;
                requestDTO.setTransactionDate(String.valueOf(date));
                /*if (service.findBatchDesc(batchdesc)) {
                    Glbctl entity = service.findGlbctlByBatchdesc(batchdesc);
                    String todaysBatch = entity.getBatchid();
                    Gljeh gljeh = service.findGljehByBatchid(todaysBatch);

                    int detailCount = service.detailCount(todaysBatch);//use batch description to get detail count
                    int newDetailCount = detailCount + 2;
                    int count = detailCount / 2;
                    count = count + 1;
                    String transactionNumber1 = generateTransactionNumber(count)[0];
                    String transactionNumber2 = generateTransactionNumber(count)[1];
                    if (service.updateGlbctl(entity, requestDTO) && service.updateGljeh(gljeh, newDetailCount, requestDTO) && service.insertGljed(requestDTO, todaysBatch, transactionNumber1, transactionNumber2)) {
                        service.insertProcessedTransaction(requestDTO, getClientIp());
                        String strPattern = "^0+(?!$)";
                        String btch = todaysBatch.replaceAll(strPattern, "");
                        int intBatch = Integer.parseInt(btch);
                        service.updateNextBatchNo(intBatch + 1);
                        responseDTO response = responseDTO.builder()
                                .responseCode(HttpStatus.OK.value())
                                .responseMessage("Request processed successfully.")
                                .build();
                        return new ResponseEntity<>(response, HttpStatus.OK);
                    } else {
                        responseDTO response = responseDTO.builder()
                                .responseCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                                .responseMessage("An Error saving the transaction has occured.")
                                .build();
                        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
                    }
                } else {*/
                    String transactionNumber1 = generateTransactionNumber(1)[0];
                    String transactionNumber2 = generateTransactionNumber(1)[1];
                    Integer batchInt = service.getBatchID();
                    String batch = String.valueOf(batchInt);
                    if (!Objects.equals(requestDTO.getDocType(), "1")) {
                        if (service.insertGjbctl(requestDTO, batch, batchdesc) && service.insertGljeh(requestDTO, batch, "00001") && service.insertGljed(requestDTO, batch, transactionNumber1, transactionNumber2)) {
                            service.insertProcessedTransaction(requestDTO, getClientIp());
                            responseDTO response = responseDTO.builder()
                                    .responseCode(HttpStatus.OK.value())
                                    .responseMessage("Request processed successfully.")
                                    .build();
                            return new ResponseEntity<>(response, HttpStatus.OK);
                        } else {
                            responseDTO response = responseDTO.builder()
                                    .responseCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                                    .responseMessage("An Error saving the transaction has occured.")
                                    .build();
                            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
                        }

                    }
                    else
                    {
                        if (service.insertGjbctl(requestDTO, batch, batchdesc) && service.insertGljeh(requestDTO, batch, "00001") && service.insertGljed(requestDTO, batch, transactionNumber1, transactionNumber2) &&
                                service.insertApibh(requestDTO) && service.insertApibc(requestDTO) && service.insertApibs(requestDTO) && service.insertApibd(requestDTO)) {
                            service.updateBatchNumber();
                            service.insertProcessedTransaction(requestDTO, getClientIp());
                            responseDTO response = responseDTO.builder()
                                    .responseCode(HttpStatus.OK.value())
                                    .responseMessage("Request processed successfully.")
                                    .build();
                            return new ResponseEntity<>(response, HttpStatus.OK);
                        } else {

                            responseDTO response = responseDTO.builder()
                                    .responseCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                                    .responseMessage("An Error saving the transaction has occured.")
                                    .build();
                            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
                        }
                    }
                }
             else if (service.findByAccountIdHI(requestDTO)&&service.checkVendorAccountHI(requestDTO)) {
                com.sagemcintegration.model.mssql.hi.ap.Apven obj = HIApven_repo.findByBankid(requestDTO.getCreditAccountId());
                requestDTO.setCreditAccountId(obj.getBankid());
                String datestr = requestDTO.getTransactionDate();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate date = LocalDate.parse(datestr, formatter);
                String batchdesc = "Materials Control Entries for-" + date;
                requestDTO.setTransactionDate(String.valueOf(date));
                /*if (service.findBatchDescHI(batchdesc)) {
                    com.sagemcintegration.model.mssql.hi.gl.Glbctl entity = service.findGlbctlByBatchdescHI(batchdesc);
                    String todaysBatch = entity.getBatchid();
                    com.sagemcintegration.model.mssql.hi.gl.Gljeh gljeh = service.findGljehByBatchidHI(todaysBatch);

                    int detailCount = service.detailCountHI(todaysBatch);//use batch description to get detail count
                    int newDetailCount = detailCount + 2;
                    int count = detailCount / 2;
                    count = count + 1;
                    String transactionNumber1 = generateTransactionNumber(count)[0];
                    String transactionNumber2 = generateTransactionNumber(count)[1];
                    if (service.updateGlbctlHI(entity, requestDTO) && service.updateGljehHI(gljeh, newDetailCount, requestDTO) && service.insertGljedHI(requestDTO, todaysBatch, transactionNumber1, transactionNumber2)) {
                        if (Objects.equals(requestDTO.getDocType(), "1")) {
                            if (service.insertApibhHI(requestDTO) && service.insertApibcHI(requestDTO) && service.insertApibsHI(requestDTO) && service.insertApibdHI(requestDTO)) {
                                service.updateBatchNumberHI();

                            }
                        }
                        service.insertProcessedTransaction(requestDTO, getClientIp());
                        String strPattern = "^0+(?!$)";
                        String btch = todaysBatch.replaceAll(strPattern, "");
                        int intBatch = Integer.parseInt(btch);
                        service.updateNextBatchNoHI(intBatch + 1);
                        responseDTO response = responseDTO.builder()
                                .responseCode(HttpStatus.OK.value())
                                .responseMessage("Request processed successfully.")
                                .build();
                        return new ResponseEntity<>(response, HttpStatus.OK);
                    } else {
                        responseDTO response = responseDTO.builder()
                                .responseCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                                .responseMessage("An Error saving the transaction has occured.")
                                .build();
                        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
                    }
                } else {*/
                    String transactionNumber1 = generateTransactionNumber(1)[0];
                    String transactionNumber2 = generateTransactionNumber(1)[1];
                    Integer batchInt = service.getBatchID();
                    String batch = String.valueOf(batchInt);
                if (!Objects.equals(requestDTO.getDocType(), "1")) {
                    if (service.insertGjbctlHI(requestDTO, batch, batchdesc) && service.insertGljehHI(requestDTO, batch, "00001") && service.insertGljedHI(requestDTO, batch, transactionNumber1, transactionNumber2)) {
                        service.insertProcessedTransaction(requestDTO, getClientIp());
                        responseDTO response = responseDTO.builder()
                                .responseCode(HttpStatus.OK.value())
                                .responseMessage("Request processed successfully.")
                                .build();
                        return new ResponseEntity<>(response, HttpStatus.OK);

                    } else {
                        responseDTO response = responseDTO.builder()
                                .responseCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                                .responseMessage("An Error saving the transaction has occured.")
                                .build();
                        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
                    }
                }else{
                    {
                        if (service.insertGjbctlHI(requestDTO, batch, batchdesc) && service.insertGljehHI(requestDTO, batch, "00001") && service.insertGljedHI(requestDTO, batch, transactionNumber1, transactionNumber2) &&
                                service.insertApibhHI(requestDTO) && service.insertApibcHI(requestDTO) && service.insertApibsHI(requestDTO) && service.insertApibdHI(requestDTO)) {
                            service.updateBatchNumberHI();
                            service.insertProcessedTransaction(requestDTO, getClientIp());
                            responseDTO response = responseDTO.builder()
                                    .responseCode(HttpStatus.OK.value())
                                    .responseMessage("Request processed successfully.")
                                    .build();
                            return new ResponseEntity<>(response, HttpStatus.OK);
                        } else {

                            responseDTO response = responseDTO.builder()
                                    .responseCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                                    .responseMessage("An Error saving the transaction has occured.")
                                    .build();
                            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
                        }
                    }

                }
                }
            else {
                responseDTO response = responseDTO.builder()
                        .responseCode(HttpStatus.UNAUTHORIZED.value())
                        .responseMessage("Invalid Account ID")
                        .build();
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
        } catch (Exception e) {
            System.out.print(e);
            responseDTO response = responseDTO.builder()
                    .responseCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                    .responseMessage("Internal Server Error")
                    .build();
            SimpleMailMessage msg = new SimpleMailMessage();
            msg.setText("Error Code: 500 " +
                    "Error Details: " + e);
            msg.setTo("seriterkunda@mupuma.co.zm");
            msg.setSubject("Intercontinental Sage Service Error");
            mailSender.send(msg);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }

    }

    private boolean isAnyFieldEmpty(requestDTO request) {
        return request.getTransactionDescription() == null ||
                request.getTransactionReference() == null ||
                request.getDebitAccountId() == null ||
                request.getCreditAccountId() == null ||
                request.getCreditAmount() == null ||
                request.getDebitAmount() == null ||
                request.getTransactionDate() == null ||
                request.getTransactionDescription().isEmpty() ||
                request.getTransactionReference().isEmpty() ||
                request.getDebitAccountId().isEmpty() ||
                request.getCreditAccountId().isEmpty() ||
                request.getCreditAmount().isEmpty() ||
                request.getDebitAmount().isEmpty() ||
                request.getTransactionDate().isEmpty();

    }
}
