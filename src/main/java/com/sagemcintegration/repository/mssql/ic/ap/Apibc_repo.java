package com.sagemcintegration.repository.mssql.ic.ap;


import com.sagemcintegration.model.mssql.ic.ap.Apibc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface Apibc_repo extends JpaRepository<Apibc,Integer> {
    Optional<Apibc> findByBtchdescContainingAndBtchstts(String btchdesc, short btchstts);
    Optional<Apibc> findByBtchdescAndBtchstts(String btchdesc, short btchstts);
    List<Apibc> findByBtchdescContaining(String btchdesc);
}
