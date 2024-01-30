package com.sagemcintegration.repository.mssql.hi.gl;
import com.sagemcintegration.model.mssql.hi.gl.Gljed;
import com.sagemcintegration.model.mssql.hi.gl.GljedPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HIGljed_repo extends JpaRepository<Gljed, GljedPK> {
     @Query(value = "select * from Gljed where batchid = :batchid", nativeQuery = true)
     Gljed findByBatchnbr(String batchid);


}
