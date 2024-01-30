package com.sagemcintegration.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class requestDTO {
    private String transactionDescription;
    private String currency;

    private String transactionReference;

    private String debitAccountId;

    private String creditAccountId;

    private String creditAmount;

    private String debitAmount;

    private String docType;

    private String transactionDate;

    public void setCreditAmount(String creditAmountStr) {
        BigDecimal creditAmount = new BigDecimal(creditAmountStr);
        if (creditAmount.compareTo(BigDecimal.ZERO) < 0) {
            this.creditAmount = String.valueOf(creditAmount.abs());
        } else {
            this.creditAmount = String.valueOf(creditAmount);
        }
    }

    public void setDebitAmount(String debitAmountStr) {
        BigDecimal debitAmount = new BigDecimal(debitAmountStr);
        if (debitAmount != null && debitAmount.compareTo(BigDecimal.ZERO) < 0) {
            this.debitAmount = String.valueOf(debitAmount.abs());
        } else {
            this.debitAmount = String.valueOf(debitAmount);
        }
    }
}