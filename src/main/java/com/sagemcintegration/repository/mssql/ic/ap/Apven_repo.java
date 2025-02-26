package com.sagemcintegration.repository.mssql.ic.ap;

import com.sagemcintegration.model.mssql.ic.ap.Apven;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Apven_repo extends JpaRepository<Apven,Integer> {
    Optional<Apven> findByVendorid(String accId);
}
