package com.sagemcintegration.service;

import com.sagemcintegration.dto.infoDTO;
import com.sagemcintegration.dto.requestDTO;
import com.sagemcintegration.dto.responseDTO;
import com.sagemcintegration.model.mssql.ic.ap.Apibc;
import com.sagemcintegration.model.mssql.ic.ap.Apibh;
import com.sagemcintegration.repository.mssql.hi.ap.HIApibc_repo;
import com.sagemcintegration.repository.mssql.hi.ap.HIApibh_repo;
import com.sagemcintegration.repository.mssql.hi.ap.HIApobl_repo;
import com.sagemcintegration.repository.mssql.hi.ap.HIApven_repo;
import com.sagemcintegration.repository.mssql.ic.ap.Apibc_repo;
import com.sagemcintegration.repository.mssql.ic.ap.Apibh_repo;
import com.sagemcintegration.repository.mssql.ic.ap.Apobl_repo;
import com.sagemcintegration.repository.mssql.ic.ap.Apven_repo;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

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
                return buildErrorResponse(HttpStatus.UNAUTHORIZED, "Invalid Account ID");

                //return processTransactionForHIService(requestDTO);
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
                return buildErrorResponse(HttpStatus.EXPECTATION_FAILED, "Error processing transaction for Service: ");

                // Helper function to process Stock Transactions for Service
                /*if(service.findGLAccountId(requestDTO)) {
                    return processStockTransactionForService(requestDTO);
                }
                else{
                    return buildErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Error processing transaction GL account not found");

                }*/
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
               // return processStockTransactionForHIService(requestDTO);
                return buildErrorResponse(HttpStatus.EXPECTATION_FAILED, "Error processing transaction for Service: ");

            }
        } catch (Exception e) {
            e.printStackTrace();
            return buildErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Error processing transaction for HIService: " + e.getMessage());
        }
    }
    @Autowired
    private Apibc_repo apibc_repo;
    // Helper function to process Invoice and Credit Notes for Service
 /*   private ResponseEntity<responseDTO> processInvoiceCreditNoteForService(requestDTO requestDTO) throws Exception {
        System.out.println(requestDTO);
        String batchDescBase = "Materials Control Invoices ";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date today = new Date();
        String date = sdf.format(today);
        String batchDesc = batchDescBase + date;
        Optional<Apibc> obj = apibc_repo.findByBtchdescContainingAndBtchstts(batchDescBase, (short) 1);
        if (obj.isPresent()) {
            if (apibh_repo.findByIdinvcContaining(requestDTO.getTransactionReference().trim()).isEmpty()) {
                if (service.updateInvoice(requestDTO, obj)) {
                    service.insertProcessedTransaction(requestDTO, getClientIp());
                    return buildSuccessResponse("Request processed successfully.");
                } else {
                    throw new Exception("An Error saving the transaction has occurred.");
                }
            }
        } else {
            if (apibh_repo.findByIdinvcContaining(requestDTO.getTransactionReference().trim()).isEmpty()) {

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
        throw new Exception("An Error saving the tra" +
                "nsaction has occurred.");
    }
*/
    // Helper function to process Stock Transactions for Service
    private static final Logger log = LoggerFactory.getLogger(service.class);
    public BigDecimal bigDecimalValue(String amt) {
        double doubleValue = Double.parseDouble(amt);
        return BigDecimal.valueOf(doubleValue).setScale(2, RoundingMode.HALF_UP).abs();
    }
    private ResponseEntity<responseDTO> processInvoiceCreditNoteForService(requestDTO requestDTO) throws Exception {
        log.info("Processing invoice request: {}", requestDTO);

        // Validate input
        if (requestDTO.getTransactionDate() == null || requestDTO.getTransactionDate().trim().isEmpty()) {
            throw new IllegalArgumentException("Transaction date cannot be null or empty");
        }

        if (requestDTO.getTransactionReference() == null || requestDTO.getTransactionReference().trim().isEmpty()) {
            throw new IllegalArgumentException("Transaction reference cannot be null or empty");
        }

        // Parse and format the date string
        String formattedDate;
        int dateAsInteger;
        try {
            // Assuming input date is in format "yyyy-MM-dd" or similar
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Adjust based on your actual input format
            LocalDate date = LocalDate.parse(requestDTO.getPostedDate().trim(), inputFormatter);

            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            formattedDate = date.format(outputFormatter);

            // Convert to integer format for database query (yyyyMMdd)
            LocalDate transactionDate = LocalDate.parse(requestDTO.getTransactionDate().trim(), inputFormatter);
            DateTimeFormatter intFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
            dateAsInteger = Integer.parseInt(transactionDate.format(intFormatter));

        } catch (DateTimeParseException e) {
            log.error("Failed to parse transaction date: {}", requestDTO.getTransactionDate(), e);
            throw new IllegalArgumentException("Invalid date format. Expected format: yyyy-MM-dd", e);
        }

        // Create batch description - this should be the COMPLETE description used for both search and creation
        final String COMPLETE_BATCH_DESC = "Materials Control Invoices " + formattedDate;

        // Trim transaction reference once
        String transactionRef = requestDTO.getTransactionReference().trim();
        boolean isCreditNote = isCreditNote(requestDTO); // You'll need to implement this logic
        String vendorId;

        if (isCreditNote) {
            // For credit notes, the vendor is debited, so look in the debits array
            vendorId = extractVendorFromDebits(requestDTO);
            log.info("Processing credit note - vendor found in debits: {}", vendorId);
        } else {
            // For regular invoices, the vendor is credited
            vendorId = requestDTO.getCreditAccountId();
            log.info("Processing regular invoice - vendor from creditAccountId: {}", vendorId);
        }

        if (vendorId == null || vendorId.trim().isEmpty()) {
            throw new IllegalArgumentException("Vendor ID not found in transaction");
        }

        vendorId = vendorId.trim();

        log.info("Checking for existing transaction with invoice: {} and vendor: {}", transactionRef, vendorId);

        // Check if transaction already exists using invoice ID and vendor ID only
        // This prevents duplicates regardless of amount changes
        List<Apibh> existingTransactions = apibh_repo.findByIdInvcAndIdVend(transactionRef, vendorId);

        if (!existingTransactions.isEmpty()) {
            log.warn("Transaction already exists: {} with vendor: {}", transactionRef, vendorId);
            throw new Exception("Transaction has already been processed: " + transactionRef + " for vendor: " + vendorId);
        }

        // Rest of your existing batch processing logic remains the same...
        List<Short> updatableStatuses = Arrays.asList((short)1, (short)7);
        List<Apibc> updatableBatches = apibc_repo.findByBtchdescContainingAndBtchsttsIn(COMPLETE_BATCH_DESC, updatableStatuses);

        // Check if Posted (3) or Deleted (4) batches exist (to do nothing)
        List<Short> nonUpdatableStatuses = Arrays.asList((short)3, (short)4);
        List<Apibc> nonUpdatableBatches = apibc_repo.findByBtchdescContainingAndBtchsttsIn(COMPLETE_BATCH_DESC, nonUpdatableStatuses);

        // Check for Post In Progress batches separately
        List<Short> postInProgressStatus = Arrays.asList((short)5);
        List<Apibc> postInProgressBatches = apibc_repo.findByBtchdescContainingAndBtchsttsIn(COMPLETE_BATCH_DESC, postInProgressStatus);

        if (!updatableBatches.isEmpty()) {
            // If multiple updatable batches exist, use the newest one
            Apibc existingBatch;
            if (updatableBatches.size() > 1) {
                log.warn("Multiple updatable batches found for {}, selecting the newest one", COMPLETE_BATCH_DESC);
                // Assuming you have a creation date/time field to determine "newest"
                // Replace getBtchcrtdt() with your actual date field name
                existingBatch = updatableBatches.stream()
                        .max(Comparator.comparing(Apibc::getDatebtch)) // Replace with your actual date field
                        .orElse(updatableBatches.get(0));
            } else {
                existingBatch = updatableBatches.get(0);
            }

            log.info("Processing with existing updatable batch: {} with status: {}", COMPLETE_BATCH_DESC, existingBatch.getBtchstts());

            if (service.updateInvoice(requestDTO, Optional.of(existingBatch))) {
                service.insertProcessedTransaction(requestDTO, getClientIp());
                log.info("Successfully processed transaction with existing batch: {}", transactionRef);
                return buildSuccessResponse("Request processed successfully.");
            } else {
                log.error("Failed to update invoice for transaction: {}", transactionRef);
                throw new Exception("An error occurred saving the transaction.");
            }
        } else if (!nonUpdatableBatches.isEmpty()) {

            // Batch exists but is Posted or Deleted - do nothing
            log.info("Batch exists but is in non-updatable status (Posted/Deleted): {}", COMPLETE_BATCH_DESC);
            return buildSuccessResponse("Batch exists but cannot be updated due to its status.");
        } else if (!postInProgressBatches.isEmpty()) {
            // Post In Progress batches exist - create new batch (treat like no batch exists)
            log.info("Batch exists but is Post In Progress - creating new batch: {}", COMPLETE_BATCH_DESC);
            int batch = service.getAPBatchNumber();
            if (service.createInvoice(requestDTO, COMPLETE_BATCH_DESC, 1, batch)) {
                service.updateBatchNumber();
                service.insertProcessedTransaction(requestDTO, getClientIp());
                log.info("Successfully processed transaction with new batch (Post In Progress existed): {}", transactionRef);
                return buildSuccessResponse("Request processed successfully.");
            } else {
                log.error("Failed to create invoice for transaction: {}", transactionRef);
                throw new Exception("An error occurred saving the transaction.");
            }
        } else {
            // No batch exists - create new one
            log.info("Creating new batch: {}", COMPLETE_BATCH_DESC);
            int batch = service.getAPBatchNumber();
            if (service.createInvoice(requestDTO, COMPLETE_BATCH_DESC, 1, batch)) {
                service.updateBatchNumber();
                service.insertProcessedTransaction(requestDTO, getClientIp());
                log.info("Successfully processed transaction with new batch: {}", transactionRef);
                return buildSuccessResponse("Request processed successfully.");
            } else {
                log.error("Failed to create invoice for transaction: {}", transactionRef);
                throw new Exception("An error occurred saving the transaction.");
            }
        }
    }
    private String getNextAvailableBatchDescription(String baseBatchDesc) {
        // First, try the base description without any suffix
        if (!batchDescriptionExists(baseBatchDesc)) {
            return baseBatchDesc;
        }

        // If base description exists, find the next available number
        int sequenceNumber = 1;
        String candidateDesc;

        do {
            candidateDesc = baseBatchDesc + " (" + sequenceNumber + ")";
            sequenceNumber++;
        } while (batchDescriptionExists(candidateDesc));

        return candidateDesc;
    }

    // Helper method to check if a batch description already exists
    private boolean batchDescriptionExists(String batchDesc) {
        // Check if any batch with this exact description exists (regardless of status)
        List<Apibc> existingBatches = apibc_repo.findByBtchdescContaining(batchDesc);
        return !existingBatches.isEmpty();
    }
    private boolean isCreditNote(requestDTO requestDTO) {

        // Or check if credit amount is negative
        if (Float.parseFloat(requestDTO.getCreditAmount() )< 0.0) {
            return true;
        }

        return false;
    }

    // Helper method to extract vendor ID from debits array
    private String extractVendorFromDebits(requestDTO requestDTO) {
        if (requestDTO.getDebits() == null || requestDTO.getDebits().isEmpty()) {
            return null;
        }

        // Look for vendor account in debits
        // You might need to identify vendor accounts by pattern or lookup
        for (infoDTO debit : requestDTO.getDebits()) {
            String accountId = debit.getAccountId();
            if (isVendorAccount(accountId)) {
                return accountId;
            }
        }

        return null;
    }

    // Helper method to identify if an account is a vendor account
    private boolean isVendorAccount(String accountId) {

        if (accountId != null) {
            return true;
        }



        return false;
    }
    @Autowired
private HIApibc_repo hiApibc_repo;
    @Autowired
private HIApibh_repo hiApibh_repo;
    // Helper function to process Invoice and Credit Notes for HIService
   private ResponseEntity<responseDTO> processInvoiceCreditNoteForHIService(requestDTO requestDTO) throws Exception {
        String batchDescBase = "Materials Control Invoices ";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date today = new Date();
        String date = sdf.format(today);
        String batchDesc = batchDescBase + date;
        Optional<com.sagemcintegration.model.mssql.hi.ap.Apibc> obj = hiApibc_repo.findByBtchdescContainingAndBtchstts(batchDescBase, (short) 1);
        if (obj.isPresent()) {
            if (hiApibh_repo.findByIdinvcContainingAndDateinvcAndAmtgrosdst(requestDTO.getTransactionReference().trim(),Integer.parseInt(requestDTO.getTransactionDate().replace("-", "")),bigDecimalValue(requestDTO.getCreditAmount())).isEmpty()) {
                if (hiService.updateInvoice(requestDTO,obj)) {
                    service.insertProcessedTransaction(requestDTO, getClientIp());
                    return buildSuccessResponse("Request processed successfully.");
                } else {
                    throw new Exception("An Error saving the transaction has occurred.");
                }
            }
        }
        else{
            if (hiApibh_repo.findByIdinvcContainingAndDateinvcAndAmtgrosdst(requestDTO.getTransactionReference().trim(),Integer.parseInt(requestDTO.getTransactionDate().replace("-", "")),bigDecimalValue(requestDTO.getCreditAmount())).isEmpty()) {
                int batch = hiService.getBatchID();
                if (hiService.createInvoice(requestDTO, batchDesc,1,batch)) {
                    hiService.updateBatchNumberHI();
                    service.insertProcessedTransaction(requestDTO, getClientIp());
                    return buildSuccessResponse("Request processed successfully.");
                } else {
                    throw new Exception("An Error saving the transaction has occurred.");
                }
            }
        }
        throw new Exception("An Error saving the transaction has occurred.");
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

