package com.sagemcintegration.service;

import com.sagemcintegration.dto.requestDTO;
import com.sagemcintegration.dto.responseDTO;
import com.sagemcintegration.model.mssql.ic.ap.Apibc;
import com.sagemcintegration.repository.mssql.hi.ap.HIApobl_repo;
import com.sagemcintegration.repository.mssql.hi.ap.HIApven_repo;
import com.sagemcintegration.repository.mssql.ic.ap.Apibc_repo;
import com.sagemcintegration.repository.mssql.ic.ap.Apibh_repo;
import com.sagemcintegration.repository.mssql.ic.ap.Apobl_repo;
import com.sagemcintegration.repository.mssql.ic.ap.Apven_repo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;

@Service
public class TransactionProcessingService {

    @Autowired
    private service service;
    @Autowired
    private hiservice hiService;

    private final Apobl_repo apoblRepo;
    @Autowired
    private Apibh_repo apibh_repo;
    private HttpServletRequest request;

    private final HIApobl_repo hi_apoblRepo;
    @Autowired
    public TransactionProcessingService(Apobl_repo apoblRepo, HIApobl_repo hi_apoblRepo) {
        this.apoblRepo = apoblRepo;
        this.hi_apoblRepo = hi_apoblRepo;
    }

    @Transactional
    public ResponseEntity<responseDTO> processTransaction(requestDTO requestDTO) {
        try {
            if (service.findByAccountId(requestDTO)) {
                return processTransactionForService(requestDTO);
            } else if (hiService.findByAccountIdHI(requestDTO)) {
                return processTransactionForHIService(requestDTO);
            } else {
                return buildErrorResponse(HttpStatus.UNAUTHORIZED, "Invalid Account ID");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return buildErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, "An unexpected error occurred: " + e.getMessage());
        }
    }

    private ResponseEntity<responseDTO> processTransactionForService(requestDTO requestDTO) {
        try {
            // Data transformation logic

            LocalDate date = LocalDate.parse(requestDTO.getTransactionDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            requestDTO.setTransactionDate(String.valueOf(date));

            if (Objects.equals(requestDTO.getDocType(), "1")) {
                // Helper function to process Invoice and Credit Notes for Service
                return processInvoiceCreditNoteForService(requestDTO);
            } else {
                // Helper function to process Stock Transactions for Service
                if(service.findGLAccountId(requestDTO)) {
                    return processStockTransactionForService(requestDTO);
                }
                else{
                    return buildErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Error processing transaction GL account not found");

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return buildErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Error processing transaction for Service: " + e.getMessage());
        }
    }

    private ResponseEntity<responseDTO> processTransactionForHIService(requestDTO requestDTO) {
        try {
            // Data transformation logic

            LocalDate date = LocalDate.parse(requestDTO.getTransactionDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            requestDTO.setTransactionDate(String.valueOf(date));

            if (Objects.equals(requestDTO.getDocType(), "1")) {
                // Helper function to process Invoice and Credit Notes for HIService
                return processInvoiceCreditNoteForHIService(requestDTO);
            } else {
                // Helper function to process Stock Transactions for HIService
                return processStockTransactionForHIService(requestDTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return buildErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Error processing transaction for HIService: " + e.getMessage());
        }
    }
    private Apibc_repo apibc_repo;
    // Helper function to process Invoice and Credit Notes for Service
    private ResponseEntity<responseDTO> processInvoiceCreditNoteForService(requestDTO requestDTO) throws Exception {
        String batchDescBase = "Materials Control Invoices ";
        Date today = new Date();
        String date = today.toString();
        String batchDesc = batchDescBase + date;
        Optional<Apibc> obj = apibc_repo.findByBtchdescContainingAndBtchstts(batchDescBase, (short) 1);
        if (obj.isPresent()) {
            if (apibh_repo.findByIdinvc(formatInvoiceNumber(requestDTO.getTransactionReference().trim())).isEmpty()) {
                if (service.updateInvoice(requestDTO, obj)) {
                    service.insertProcessedTransaction(requestDTO, getClientIp());
                    return buildSuccessResponse("Request processed successfully.");
                } else {
                    throw new Exception("An Error saving the transaction has occurred.");
                }
            }
        } else {
            if (apibh_repo.findByIdinvc(formatInvoiceNumber(requestDTO.getTransactionReference().trim())).isPresent()) {
                return buildErrorResponse(HttpStatus.ALREADY_REPORTED, "Transaction could not be saved.");
            } else {
                int batch = service.getAPBatchNumber();
                if (service.createInvoice(requestDTO, batchDesc,1,batch)) {
                    service.updateBatchNumber();
                    service.insertProcessedTransaction(requestDTO, getClientIp());
                    return buildSuccessResponse("Request processed successfully.");
                } else {
                    throw new Exception("An Error saving the transaction has occurred.");
                }
            }
        }
        throw new Exception("An Error saving the transaction has occurred.");
    }

    // Helper function to process Stock Transactions for Service
    private ResponseEntity<responseDTO> processStockTransactionForService(requestDTO requestDTO) throws Exception {
        String batchdesc = "Materials Control Entries for-" + requestDTO.getTransactionDate();
        Integer batchInt = service.getBatchID();
        String batch = String.valueOf(batchInt);
        Optional<com.sagemcintegration.model.mssql.ic.gl.Glbctl> glObj = service.checkJournalDuplicates(batchdesc);
        if (glObj.isPresent()){
            if (!service.checkJournalDetailsDuplicates(requestDTO.getTransactionReference())){
                com.sagemcintegration.model.mssql.ic.gl.Glbctl obj = glObj.get();
                String nextBtchEntry = service.getBatchNextEntry(obj.getBatchid());
                service.updateGlbctl(obj,requestDTO);
                service.insertGljeh(requestDTO,obj.getBatchid(),nextBtchEntry);
                service.insertGljed(requestDTO,obj.getBatchid(),nextBtchEntry);
            }
            else{
                return buildErrorResponse(HttpStatus.ALREADY_REPORTED, "Transaction could not be saved.");
            }

        }
        else{
        if (service.insertGjbctl(requestDTO, batch, batchdesc) && service.insertGljeh(requestDTO, batch, "00001") && service.insertGljed(requestDTO, batch,"00001")) {
            service.updateNextBatchNo(batch);
            service.insertProcessedTransaction(requestDTO, getClientIp());
            return buildSuccessResponse("Request processed successfully.");
        } else {
            throw new Exception("An Error saving the transaction has occurred.");
        }
        }
        return buildErrorResponse(HttpStatus.EXPECTATION_FAILED, "Transaction could not be saved.");

    }

    // Helper function to process Invoice and Credit Notes for HIService
    private ResponseEntity<responseDTO> processInvoiceCreditNoteForHIService(requestDTO requestDTO) throws Exception {
        if (hi_apoblRepo.findByIdinvc(formatInvoiceNumber(requestDTO.getTransactionReference())).isPresent()) {
            return buildErrorResponse(HttpStatus.ALREADY_REPORTED, "Transaction could not be saved.");
        } else {
            if (hiService.createInvoice(requestDTO)) {
                hiService.updateBatchNumberHI();
                service.insertProcessedTransaction(requestDTO, getClientIp());
                return buildSuccessResponse("Request processed successfully.");
            } else {
                throw new Exception("An Error saving the transaction has occurred.");
            }
        }
    }

    // Helper function to process Stock Transactions for HIService
    private ResponseEntity<responseDTO> processStockTransactionForHIService(requestDTO requestDTO) throws Exception {
        String batchdesc = "Materials Control Entries for-" + requestDTO.getTransactionDate();
        Integer batchInt = hiService.getBatchID();
        String batch = String.valueOf(batchInt);
        Optional<com.sagemcintegration.model.mssql.hi.gl.Glbctl> glObj =  hiService.checkJournalDuplicatesHi(batchdesc);
        if(glObj.isPresent()){
            if(!hiService.checkJournalDetailsDuplicatesHi(requestDTO.getTransactionReference())){
                com.sagemcintegration.model.mssql.hi.gl.Glbctl obj = glObj.get();
                String nextBtchEntry = hiService.getBatchNextEntryHI(obj.getBatchid());
                hiService.updateGlbctlHI(obj,requestDTO);
                hiService.insertGljehHI(requestDTO,obj.getBatchid(),nextBtchEntry);
                hiService.insertGljedHI(requestDTO,obj.getBatchid(),nextBtchEntry);
            }
        }
        if (hiService.insertGjbctlHI(requestDTO, batch, batchdesc) && hiService.insertGljehHI(requestDTO, batch, "00001") && hiService.insertGljedHI(requestDTO, batch,"00001")) {
            service.insertProcessedTransaction(requestDTO, getClientIp());
            hiService.updateNextBatchNoHI(batch);
            return buildSuccessResponse("Request processed successfully.");
        } else {
            throw new Exception("An Error saving the transaction has occurred.");
        }
    }

    //region Response Builders
    private ResponseEntity<responseDTO> buildSuccessResponse(String message) {
        responseDTO response = responseDTO.builder()
                .responseCode(HttpStatus.OK.value())
                .responseMessage(message)
                .build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    private ResponseEntity<responseDTO> buildErrorResponse(HttpStatus status, String message) {
        responseDTO response = responseDTO.builder()
                .responseCode(status.value())
                .responseMessage(message)
                .build();
        return new ResponseEntity<>(response, new HttpHeaders(), status);
    }
    //endregion
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
    public String formatInvoiceNumber(String rawInv){
        String formattedInv = "INV" + rawInv;
        // Calculate the number of zeros needed to reach 13 characters
        int requiredLength = 13;
        int currentLength = formattedInv.length();
        // If the current length is less than required, pad with zeros
        if (currentLength < requiredLength) {
            // Calculate how many zeros are needed
            int zerosNeeded = requiredLength - currentLength;
            // Create a string of zeros
            return formattedInv + "0".repeat(zerosNeeded) // Append zeros at the end
                    ;
        } else if (currentLength > requiredLength) {
            // If the length exceeds, truncate to keep only the last 13 characters
            return formattedInv.substring(currentLength - requiredLength);
        } else {
            // If already 13 characters long, return as is
            return formattedInv;
        }
    }
}

