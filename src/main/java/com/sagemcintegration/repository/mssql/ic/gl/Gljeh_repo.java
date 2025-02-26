package com.sagemcintegration.repository.mssql.ic.gl;

import com.sagemcintegration.model.mssql.ic.gl.Gljeh;
import com.sagemcintegration.model.mssql.ic.gl.GljehPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface Gljeh_repo extends JpaRepository<Gljeh, GljehPK> {
    @Query(value = "select * from Gljeh where batchid = :batchid", nativeQuery = true)
    Optional<Gljeh> findByBatchid(String batchid);
    @Query(value = "select max(btchentry) from Gljeh where batchid = :batchid", nativeQuery = true)
    String findBatchEntry(@Param("batchid") String batchid);


}
