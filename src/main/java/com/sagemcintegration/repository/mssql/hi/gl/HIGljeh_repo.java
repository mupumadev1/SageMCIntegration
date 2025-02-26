package com.sagemcintegration.repository.mssql.hi.gl;

import com.sagemcintegration.model.mssql.hi.gl.Gljeh;
import com.sagemcintegration.model.mssql.hi.gl.GljehPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface HIGljeh_repo extends JpaRepository<Gljeh, GljehPK> {
    @Query(value = "select * from Gljeh where batchid = :batchid", nativeQuery = true)
    Gljeh findByBatchid(String batchid);

    @Query(value = "select max(btchentry) from Gljeh where batchid = :batchid", nativeQuery = true)
    String findBatchEntry(@Param("batchid") String batchid);
}