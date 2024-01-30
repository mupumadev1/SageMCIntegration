package com.sagemcintegration.repository.mssql.ic.gl;

import com.sagemcintegration.model.mssql.ic.gl.Gljeh;
import com.sagemcintegration.model.mssql.ic.gl.GljehPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Gljeh_repo extends JpaRepository<Gljeh, GljehPK> {
    @Query(value = "select * from Gljeh where batchid = :batchid", nativeQuery = true)
    Gljeh findByBatchid(String batchid);
    @Query(value = "select detailcnt from Gljeh where batchid = :batchid", nativeQuery = true)
    Integer findDetailCount(@Param("batchid") String batchid);
}
