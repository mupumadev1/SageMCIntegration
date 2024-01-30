package com.sagemcintegration.repository.mysql;

import com.sagemcintegration.model.mysql.ProcessedTransactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface processedTransactions_repo extends JpaRepository<ProcessedTransactions,Long> {
}
