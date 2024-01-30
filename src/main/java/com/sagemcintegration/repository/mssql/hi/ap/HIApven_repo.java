package com.sagemcintegration.repository.mssql.hi.ap;

import com.sagemcintegration.model.mssql.hi.ap.Apven;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HIApven_repo extends JpaRepository<Apven,Integer> {
    Apven findByBankid(String accId);
}
