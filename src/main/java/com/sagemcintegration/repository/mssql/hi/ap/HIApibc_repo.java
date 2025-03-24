package com.sagemcintegration.repository.mssql.hi.ap;


import com.sagemcintegration.model.mssql.hi.ap.Apibc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HIApibc_repo extends JpaRepository<Apibc,Integer> {
    Optional<Apibc> findByBtchdescContainingAndBtchstts(String desc, short btchstts);
}
