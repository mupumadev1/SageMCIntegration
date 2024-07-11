package com.sagemcintegration.repository.mssql.ic.ap;

import com.sagemcintegration.model.mssql.ic.ap.Apven;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Apven_repo extends JpaRepository<Apven,Integer> {
    Apven findByBankid(String accId);
}
