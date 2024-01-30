package com.sagemcintegration.repository.mssql.hi.gl;

import com.sagemcintegration.model.mssql.hi.gl.Glafs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface HIGlafs_repo extends JpaRepository<Glafs,Integer> {
        public Optional<Glafs> findByAcctidAndFscsyr(String acctid, String year);

        @Query(value = "SELECT g FROM Glafs g WHERE g." + "NETPERD" + " = :value", nativeQuery = true)
        Optional<Glafs> findByNetperd(@Param("value") String value);


}
