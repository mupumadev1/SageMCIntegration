package com.sagemcintegration.repository.mssql.ic.gl;
import com.sagemcintegration.model.mssql.ic.gl.Gljed;
import com.sagemcintegration.model.mssql.ic.gl.GljedPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface Gljed_repo extends JpaRepository<Gljed, GljedPK> {
     @Query(value = "select * from Gljed where batchid = :batchid", nativeQuery = true)
     Gljed findByBatchnbr(String batchid);


     Optional<Gljed> findFirstByTransref(String transref);
}
