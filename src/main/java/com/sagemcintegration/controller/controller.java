package com.sagemcintegration.controller;

import com.sagemcintegration.dto.requestDTO;
import com.sagemcintegration.dto.responseDTO;
import com.sagemcintegration.service.TransactionProcessingService;
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

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class controller {

    private final JavaMailSender mailSender;
   private final TransactionProcessingService transactionProcessingService;

    @PostMapping("/Transaction/PostGLTxn")
    public ResponseEntity<responseDTO> postGlTransaction(@RequestBody requestDTO requestDTO) {
        try {
          return transactionProcessingService.processTransaction(requestDTO);
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
                request.getTransactionDate().isEmpty();

    }
     /* if (Objects.equals(requestDTO.getDocType(), "1")){
               //helper function to check if account belongs to holiday inn or intercontinental hotel
                // helper function to process Invoice and Credit Notes

            }
            else{
                //helper function to check if account belongs to holiday inn or intercontinental hotel
                // helper function to process Stock Transactions
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
                        String btch = todaysBatch.replaceAll("^0+(?!$)", "");
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
                } else {

                    Integer batchInt = service.getBatchID();
                    String batch = String.valueOf(batchInt);
                    if (!Objects.equals(requestDTO.getDocType(), "1")) {
                        if (service.insertGjbctl(requestDTO, batch, batchdesc) && service.insertGljeh(requestDTO, batch, "00001") && service.insertGljed(requestDTO, batch)) {
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
                        if (apoblRepo.findByIdinvc(formatInvoiceNumber(requestDTO.getTransactionReference().trim())).isPresent()){
                            /*if (service.updateInvoice(requestDTO)){
                                service.insertProcessedTransaction(requestDTO, getClientIp());
                                responseDTO response = responseDTO.builder()
                                        .responseCode(HttpStatus.OK.value())
                                        .responseMessage("Request processed successfully.")
                                        .build();
                                return new ResponseEntity<>(response, HttpStatus.OK);
                            }
                            else{
                                responseDTO response = responseDTO.builder()
                                        .responseCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                                        .responseMessage("An Error saving the transaction has occured.")
                                        .build();
                                return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
                            }
                            responseDTO response = responseDTO.builder()
                                    .responseCode(HttpStatus.ALREADY_REPORTED.value())
                                    .responseMessage("Transaction could not be saved.")
                                    .build();
                            return new ResponseEntity<>(response, HttpStatus.ALREADY_REPORTED);
                            }
                        else{
                            if (service.createInvoice(requestDTO)) {
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
                }
             else if (hiservice.findByAccountIdHI(requestDTO)) {
                com.sagemcintegration.model.mssql.hi.ap.Apven obj = HI_apven_repo.findByVendorid(requestDTO.getCreditAccountId());
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
                } else {

                Integer batchInt = hiservice.getBatchID();
                String batch = String.valueOf(batchInt);
                if (!Objects.equals(requestDTO.getDocType(), "1")) {
                    if (hiservice.insertGjbctlHI(requestDTO, batch, batchdesc) && hiservice.insertGljehHI(requestDTO, batch, "00001") && hiservice.insertGljedHI(requestDTO, batch)) {
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
                } else {
                    {
                        if (hi_apoblRepo.findByIdinvc(formatInvoiceNumber(requestDTO.getTransactionReference())).isPresent()) {
                            /*if(hiservice.updateInvoice(requestDTO)){
                                hiservice.updateBatchNumberHI();
                                service.insertProcessedTransaction(requestDTO, getClientIp());
                                responseDTO response = responseDTO.builder()
                                        .responseCode(HttpStatus.OK.value())
                                        .responseMessage("Request processed successfully.")
                                        .build();
                                return new ResponseEntity<>(response, HttpStatus.OK);
                            } else {

                            responseDTO response = responseDTO.builder()
                                    .responseCode( HttpStatus.ALREADY_REPORTED.value())
                                    .responseMessage("Transaction could not be saved.")
                                    .build();
                            return new ResponseEntity<>(response, HttpStatus.ALREADY_REPORTED);

                        } else {
                            if (hiservice.createInvoice(requestDTO)) {
                                hiservice.updateBatchNumberHI();
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
            }
            else {
                responseDTO response = responseDTO.builder()
                        .responseCode(HttpStatus.UNAUTHORIZED.value())
                        .responseMessage("Invalid Account ID")
                        .build();
                return new ResponseEntity<>(response, HttpStatus.OK);
            }*/
}
