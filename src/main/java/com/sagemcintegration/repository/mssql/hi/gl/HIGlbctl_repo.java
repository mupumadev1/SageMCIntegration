package com.sagemcintegration.repository.mssql.hi.gl;
import com.sagemcintegration.model.mssql.hi.gl.Glbctl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface HIGlbctl_repo extends JpaRepository<Glbctl,Integer> {
    @Query("SELECT MAX(batchid) FROM  Glbctl ")
    Long findMaxBatchId();
    public Glbctl findByBtchdesc(String batchid);

    Optional<Glbctl> findByBtchdescAndBatchstat(String btchdesc, String batchstat);
    public Glbctl findBatchIdByBtchdesc(String batchdesc);
}
