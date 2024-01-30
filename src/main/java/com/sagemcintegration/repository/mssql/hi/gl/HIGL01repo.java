package com.sagemcintegration.repository.mssql.hi.gl;

import com.sagemcintegration.model.mssql.hi.gl.Gl01;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HIGL01repo extends JpaRepository<Gl01, Integer> {

    /* @Modifying
     @Query("UPDATE Gl01 g SET g.nextbtchno = :nextBatchNo WHERE g.optionid = :optionId")
     public void updateNextBatchNoByOptionId(@Param("nextBatchNo") String optionId, @Param("optionId") Integer nextBatchNo);
     */
    public Optional<Gl01> findByOptionid(String opt);
}