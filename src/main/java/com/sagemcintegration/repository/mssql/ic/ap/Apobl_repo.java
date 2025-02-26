package com.sagemcintegration.repository.mssql.ic.ap;

import com.sagemcintegration.model.mssql.ic.ap.Apobl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface Apobl_repo extends JpaRepository<Apobl,String> {
    @Query("SELECT cntbtch as lines, dateinvcdu as postdate,idponbr as ponumber,audtdate as date,fiscyr as fiscyear,fiscper as fiscperiod,idinvc as invoicenumber," +
            "cntbtch as invsheq, idvend as vendorcode,descinvc as descrption,codecurn as currency,amtinvctc as termdueamt,idinvc as itemno,descinvc as itemdesc," +
            "cntitem as detailnum from Apobl where dateinvcdu = :id")
    List<Apobl>findSageReceiptByDate(int id);
    List<Apobl>findByDateinvcdu(int id);
    Optional<Apobl> findByIdinvc(String idinvc);

}
