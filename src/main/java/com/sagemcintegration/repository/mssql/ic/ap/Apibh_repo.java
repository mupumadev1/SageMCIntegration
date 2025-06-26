package com.sagemcintegration.repository.mssql.ic.ap;

import com.sagemcintegration.model.mssql.ic.ap.Apibh;
import com.sagemcintegration.model.mssql.ic.ap.ApibhPK;
import com.sagemcintegration.model.mssql.ic.ap.Apobl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface Apibh_repo extends JpaRepository<Apibh, ApibhPK> {
    @Query("SELECT b FROM Apibh b WHERE RTRIM(b.idinvc) = RTRIM(:idinvc) AND RTRIM(b.idvend) = RTRIM(:idvend)")
    List<Apibh> findByIdInvcAndIdVend(@Param("idinvc") String idinvc, @Param("idvend") String idvend);
}
