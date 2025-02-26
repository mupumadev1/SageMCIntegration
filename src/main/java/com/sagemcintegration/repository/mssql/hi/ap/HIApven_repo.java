package com.sagemcintegration.repository.mssql.hi.ap;

import com.sagemcintegration.model.mssql.hi.ap.Apven;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HIApven_repo extends JpaRepository<Apven,Integer> {
    Optional<Apven> findByVendorid(String accId);
}
