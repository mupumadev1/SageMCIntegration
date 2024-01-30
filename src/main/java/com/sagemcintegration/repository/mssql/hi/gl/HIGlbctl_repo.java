package com.sagemcintegration.repository.mssql.hi.gl;
import com.sagemcintegration.model.mssql.hi.gl.Glbctl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HIGlbctl_repo extends JpaRepository<Glbctl,Integer> {
    @Query("SELECT MAX(batchid) FROM  Glbctl ")
    Long findMaxBatchId();
    public Glbctl findByBtchdesc(String batchid);
    //public Optional<Glbctl> findByBtchdesc(String batchdesc);
    public Glbctl findBatchIdByBtchdesc(String batchdesc);
}
