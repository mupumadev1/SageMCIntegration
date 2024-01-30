package com.sagemcintegration.repository.mssql.ic.ap;

import com.sagemcintegration.model.mssql.ic.ap.App02;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface App02_repo extends JpaRepository<App02,String> {

    @Query("SELECT invcbtch FROM App02 where recid02 = 'APP02'")
    Integer findbatchid();
    Optional<App02> findByRecid02(String recid02);

}
