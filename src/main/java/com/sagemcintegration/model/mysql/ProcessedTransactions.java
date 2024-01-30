package com.sagemcintegration.model.mysql;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProcessedTransactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Column(name = "ip_address")
    private String ipAddress;

    @Column(name = "transaction_description")
    private String transactionDescription;

    @Column(name = "transaction_reference")
    private String transactionReference;

    @Column(name = "debit_account_id")
    private String debitAccountId;

    @Column(name = "credit_account_id")
    private String creditAccountId;

    @Column(name="credit_amount")
    private String creditAmount;

    @Column(name = "debit_amount")
    private String debitAmount;

    @Column(name = "transaction_date")
    private String transactionDate;

    @Column(name= "entry_date")
    @CreationTimestamp
    private Date entryDate;

}

