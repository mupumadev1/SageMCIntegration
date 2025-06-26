package com.sagemcintegration.repository.mssql.ic.ap;


import com.sagemcintegration.model.mssql.ic.ap.Apibc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface Apibc_repo extends JpaRepository<Apibc,Integer> {
    List<Apibc> findByBtchdescContainingAndBtchsttsIn(String btchdesc, List<Short> btchstts);
    // Add these methods to your Apibc repository
    List<Apibc> findByBtchdescContaining(String btchdesc);
}
