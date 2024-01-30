package com.sagemcintegration.model.mssql.ic.gl;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class Gljeh implements Serializable {
   @EmbeddedId
   private GljehPK gljehPK;
    @Basic
    @Column(name = "AUDTDATE", nullable = false, precision = 0)
    private int audtdate;
    @Basic
    @Column(name = "AUDTTIME", nullable = false, precision = 0)
    private int audttime;
    @Basic
    @Column(name = "AUDTUSER", nullable = false, length = 8)
    private String audtuser;
    @Basic
    @Column(name = "AUDTORG", nullable = false, length = 6)
    private String audtorg;
    @Basic
    @Column(name = "SRCELEDGER", nullable = false, length = 2)
    private String srceledger;
    @Basic
    @Column(name = "SRCETYPE", nullable = false, length = 2)
    private String srcetype;
    @Basic
    @Column(name = "FSCSYR", nullable = false, length = 4)
    private String fscsyr;
    @Basic
    @Column(name = "FSCSPERD", nullable = false, length = 2)
    private String fscsperd;
    @Basic
    @Column(name = "SWEDIT", nullable = false)
    private short swedit;
    @Basic
    @Column(name = "SWREVERSE", nullable = false)
    private short swreverse;
    @Basic
    @Column(name = "JRNLDESC", nullable = false, length = 60)
    private String jrnldesc;
    @Basic
    @Column(name = "JRNLDR", nullable = false, precision = 3)
    private BigDecimal jrnldr;
    @Basic
    @Column(name = "JRNLCR", nullable = false, precision = 3)
    private BigDecimal jrnlcr;
    @Basic
    @Column(name = "JRNLQTY", nullable = false, precision = 3)
    private BigDecimal jrnlqty;
    @Basic
    @Column(name = "DATEENTRY", nullable = false, precision = 0)
    private int dateentry;
    @Basic
    @Column(name = "DRILSRCTY", nullable = false)
    private short drilsrcty;
    @Basic
    @Column(name = "DRILLDWNLK", nullable = false, precision = 0)
    private int drilldwnlk;
    @Basic
    @Column(name = "DRILAPP", nullable = false, length = 2)
    private String drilapp;
    @Basic
    @Column(name = "REVYR", nullable = false, length = 4)
    private String revyr;
    @Basic
    @Column(name = "REVPERD", nullable = false, length = 2)
    private String revperd;
    @Basic
    @Column(name = "ERRBATCH", nullable = false)
    private int errbatch;
    @Basic
    @Column(name = "ERRENTRY", nullable = false)
    private int errentry;
    @Basic
    @Column(name = "ORIGCOMP", nullable = false, length = 6)
    private String origcomp;
    @Basic
    @Column(name = "DETAILCNT", nullable = false, precision = 0)
    private int detailcnt;
    @Basic
    @Column(name = "ENTEREDBY", nullable = false, length = 8)
    private String enteredby;
    @Basic
    @Column(name = "DOCDATE", nullable = false, precision = 0)
    private int docdate;
    @Basic
    @Column(name = "CODETAXGRP", nullable = false, length = 12)
    private String codetaxgrp;
    @Basic
    @Column(name = "CLASSTYPE", nullable = false)
    private short classtype;
    @Basic
    @Column(name = "SWMANTX", nullable = false)
    private short swmantx;
    @Basic
    @Column(name = "CUSTVEND", nullable = false, length = 12)
    private String custvend;
    @Basic
    @Column(name = "DOCTYPE", nullable = false)
    private short doctype;
    @Basic
    @Column(name = "DOCNUMBER", nullable = false, length = 22)
    private String docnumber;
    @Basic
    @Column(name = "TAXAUTH1", nullable = false, length = 12)
    private String taxauth1;
    @Basic
    @Column(name = "TAXAUTH2", nullable = false, length = 12)
    private String taxauth2;
    @Basic
    @Column(name = "TAXAUTH3", nullable = false, length = 12)
    private String taxauth3;
    @Basic
    @Column(name = "TAXAUTH4", nullable = false, length = 12)
    private String taxauth4;
    @Basic
    @Column(name = "TAXAUTH5", nullable = false, length = 12)
    private String taxauth5;
    @Basic
    @Column(name = "TAXVCLSS1", nullable = false)
    private short taxvclss1;
    @Basic
    @Column(name = "TAXVCLSS2", nullable = false)
    private short taxvclss2;
    @Basic
    @Column(name = "TAXVCLSS3", nullable = false)
    private short taxvclss3;
    @Basic
    @Column(name = "TAXVCLSS4", nullable = false)
    private short taxvclss4;
    @Basic
    @Column(name = "TAXVCLSS5", nullable = false)
    private short taxvclss5;
    @Basic
    @Column(name = "TAXICLSS1", nullable = false)
    private short taxiclss1;
    @Basic
    @Column(name = "TAXICLSS2", nullable = false)
    private short taxiclss2;
    @Basic
    @Column(name = "TAXICLSS3", nullable = false)
    private short taxiclss3;
    @Basic
    @Column(name = "TAXICLSS4", nullable = false)
    private short taxiclss4;
    @Basic
    @Column(name = "TAXICLSS5", nullable = false)
    private short taxiclss5;
    @Basic
    @Column(name = "BASETAX1", nullable = false, precision = 3)
    private BigDecimal basetax1;
    @Basic
    @Column(name = "BASETAX2", nullable = false, precision = 3)
    private BigDecimal basetax2;
    @Basic
    @Column(name = "BASETAX3", nullable = false, precision = 3)
    private BigDecimal basetax3;
    @Basic
    @Column(name = "BASETAX4", nullable = false, precision = 3)
    private BigDecimal basetax4;
    @Basic
    @Column(name = "BASETAX5", nullable = false, precision = 3)
    private BigDecimal basetax5;
    @Basic
    @Column(name = "AMTTAX1", nullable = false, precision = 3)
    private BigDecimal amttax1;
    @Basic
    @Column(name = "AMTTAX2", nullable = false, precision = 3)
    private BigDecimal amttax2;
    @Basic
    @Column(name = "AMTTAX3", nullable = false, precision = 3)
    private BigDecimal amttax3;
    @Basic
    @Column(name = "AMTTAX4", nullable = false, precision = 3)
    private BigDecimal amttax4;
    @Basic
    @Column(name = "AMTTAX5", nullable = false, precision = 3)
    private BigDecimal amttax5;
    @Basic
    @Column(name = "AMTEXPENS1", nullable = false, precision = 3)
    private BigDecimal amtexpens1;
    @Basic
    @Column(name = "AMTEXPENS2", nullable = false, precision = 3)
    private BigDecimal amtexpens2;
    @Basic
    @Column(name = "AMTEXPENS3", nullable = false, precision = 3)
    private BigDecimal amtexpens3;
    @Basic
    @Column(name = "AMTEXPENS4", nullable = false, precision = 3)
    private BigDecimal amtexpens4;
    @Basic
    @Column(name = "AMTEXPENS5", nullable = false, precision = 3)
    private BigDecimal amtexpens5;
    @Basic
    @Column(name = "AMTRECVRB1", nullable = false, precision = 3)
    private BigDecimal amtrecvrb1;
    @Basic
    @Column(name = "AMTRECVRB2", nullable = false, precision = 3)
    private BigDecimal amtrecvrb2;
    @Basic
    @Column(name = "AMTRECVRB3", nullable = false, precision = 3)
    private BigDecimal amtrecvrb3;
    @Basic
    @Column(name = "AMTRECVRB4", nullable = false, precision = 3)
    private BigDecimal amtrecvrb4;
    @Basic
    @Column(name = "AMTRECVRB5", nullable = false, precision = 3)
    private BigDecimal amtrecvrb5;
    @Basic
    @Column(name = "AMTALLOC1", nullable = false, precision = 3)
    private BigDecimal amtalloc1;
    @Basic
    @Column(name = "AMTALLOC2", nullable = false, precision = 3)
    private BigDecimal amtalloc2;
    @Basic
    @Column(name = "AMTALLOC3", nullable = false, precision = 3)
    private BigDecimal amtalloc3;
    @Basic
    @Column(name = "AMTALLOC4", nullable = false, precision = 3)
    private BigDecimal amtalloc4;
    @Basic
    @Column(name = "AMTALLOC5", nullable = false, precision = 3)
    private BigDecimal amtalloc5;
    @Basic
    @Column(name = "TXAMT1RC", nullable = false, precision = 3)
    private BigDecimal txamt1Rc;
    @Basic
    @Column(name = "TXAMT2RC", nullable = false, precision = 3)
    private BigDecimal txamt2Rc;
    @Basic
    @Column(name = "TXAMT3RC", nullable = false, precision = 3)
    private BigDecimal txamt3Rc;
    @Basic
    @Column(name = "TXAMT4RC", nullable = false, precision = 3)
    private BigDecimal txamt4Rc;
    @Basic
    @Column(name = "TXAMT5RC", nullable = false, precision = 3)
    private BigDecimal txamt5Rc;
    @Basic
    @Column(name = "TXEXPNS1RC", nullable = false, precision = 3)
    private BigDecimal txexpns1Rc;
    @Basic
    @Column(name = "TXEXPNS2RC", nullable = false, precision = 3)
    private BigDecimal txexpns2Rc;
    @Basic
    @Column(name = "TXEXPNS3RC", nullable = false, precision = 3)
    private BigDecimal txexpns3Rc;
    @Basic
    @Column(name = "TXEXPNS4RC", nullable = false, precision = 3)
    private BigDecimal txexpns4Rc;
    @Basic
    @Column(name = "TXEXPNS5RC", nullable = false, precision = 3)
    private BigDecimal txexpns5Rc;
    @Basic
    @Column(name = "TXRECVB1RC", nullable = false, precision = 3)
    private BigDecimal txrecvb1Rc;
    @Basic
    @Column(name = "TXRECVB2RC", nullable = false, precision = 3)
    private BigDecimal txrecvb2Rc;
    @Basic
    @Column(name = "TXRECVB3RC", nullable = false, precision = 3)
    private BigDecimal txrecvb3Rc;
    @Basic
    @Column(name = "TXRECVB4RC", nullable = false, precision = 3)
    private BigDecimal txrecvb4Rc;
    @Basic
    @Column(name = "TXRECVB5RC", nullable = false, precision = 3)
    private BigDecimal txrecvb5Rc;
    @Basic
    @Column(name = "TXALLOC1RC", nullable = false, precision = 3)
    private BigDecimal txalloc1Rc;
    @Basic
    @Column(name = "TXALLOC2RC", nullable = false, precision = 3)
    private BigDecimal txalloc2Rc;
    @Basic
    @Column(name = "TXALLOC3RC", nullable = false, precision = 3)
    private BigDecimal txalloc3Rc;
    @Basic
    @Column(name = "TXALLOC4RC", nullable = false, precision = 3)
    private BigDecimal txalloc4Rc;
    @Basic
    @Column(name = "TXALLOC5RC", nullable = false, precision = 3)
    private BigDecimal txalloc5Rc;
    @Basic
    @Column(name = "CODECURNRC", nullable = false, length = 3)
    private String codecurnrc;
    @Basic
    @Column(name = "RATERC", nullable = false, precision = 7)
    private BigDecimal raterc;
    @Basic
    @Column(name = "RATETYPERC", nullable = false, length = 2)
    private String ratetyperc;
    @Basic
    @Column(name = "RATEDATERC", nullable = false, precision = 0)
    private int ratedaterc;
    @Basic
    @Column(name = "RATEOPRC", nullable = false)
    private short rateoprc;
    @Basic
    @Column(name = "EXPNSACNT1", nullable = false, length = 45)
    private String expnsacnt1;
    @Basic
    @Column(name = "EXPNSACNT2", nullable = false, length = 45)
    private String expnsacnt2;
    @Basic
    @Column(name = "EXPNSACNT3", nullable = false, length = 45)
    private String expnsacnt3;
    @Basic
    @Column(name = "EXPNSACNT4", nullable = false, length = 45)
    private String expnsacnt4;
    @Basic
    @Column(name = "EXPNSACNT5", nullable = false, length = 45)
    private String expnsacnt5;
    @Basic
    @Column(name = "RECBLACNT1", nullable = false, length = 45)
    private String recblacnt1;
    @Basic
    @Column(name = "RECBLACNT2", nullable = false, length = 45)
    private String recblacnt2;
    @Basic
    @Column(name = "RECBLACNT3", nullable = false, length = 45)
    private String recblacnt3;
    @Basic
    @Column(name = "RECBLACNT4", nullable = false, length = 45)
    private String recblacnt4;
    @Basic
    @Column(name = "RECBLACNT5", nullable = false, length = 45)
    private String recblacnt5;
    @Basic
    @Column(name = "TAXRATE1", nullable = false, precision = 7)
    private BigDecimal taxrate1;
    @Basic
    @Column(name = "TAXRATE2", nullable = false, precision = 7)
    private BigDecimal taxrate2;
    @Basic
    @Column(name = "TAXRATE3", nullable = false, precision = 7)
    private BigDecimal taxrate3;
    @Basic
    @Column(name = "TAXRATE4", nullable = false, precision = 7)
    private BigDecimal taxrate4;
    @Basic
    @Column(name = "TAXRATE5", nullable = false, precision = 7)
    private BigDecimal taxrate5;
    @Basic
    @Column(name = "FUNTXAMT1", nullable = false, precision = 3)
    private BigDecimal funtxamt1;
    @Basic
    @Column(name = "FUNTXAMT2", nullable = false, precision = 3)
    private BigDecimal funtxamt2;
    @Basic
    @Column(name = "FUNTXAMT3", nullable = false, precision = 3)
    private BigDecimal funtxamt3;
    @Basic
    @Column(name = "FUNTXAMT4", nullable = false, precision = 3)
    private BigDecimal funtxamt4;
    @Basic
    @Column(name = "FUNTXAMT5", nullable = false, precision = 3)
    private BigDecimal funtxamt5;
    @Basic
    @Column(name = "FUNTXBSE1", nullable = false, precision = 3)
    private BigDecimal funtxbse1;
    @Basic
    @Column(name = "FUNTXBSE2", nullable = false, precision = 3)
    private BigDecimal funtxbse2;
    @Basic
    @Column(name = "FUNTXBSE3", nullable = false, precision = 3)
    private BigDecimal funtxbse3;
    @Basic
    @Column(name = "FUNTXBSE4", nullable = false, precision = 3)
    private BigDecimal funtxbse4;
    @Basic
    @Column(name = "FUNTXBSE5", nullable = false, precision = 3)
    private BigDecimal funtxbse5;
    @Basic
    @Column(name = "FUNTXEXP1", nullable = false, precision = 3)
    private BigDecimal funtxexp1;
    @Basic
    @Column(name = "FUNTXEXP2", nullable = false, precision = 3)
    private BigDecimal funtxexp2;
    @Basic
    @Column(name = "FUNTXEXP3", nullable = false, precision = 3)
    private BigDecimal funtxexp3;
    @Basic
    @Column(name = "FUNTXEXP4", nullable = false, precision = 3)
    private BigDecimal funtxexp4;
    @Basic
    @Column(name = "FUNTXEXP5", nullable = false, precision = 3)
    private BigDecimal funtxexp5;
    @Basic
    @Column(name = "FUNTXRCB1", nullable = false, precision = 3)
    private BigDecimal funtxrcb1;
    @Basic
    @Column(name = "FUNTXRCB2", nullable = false, precision = 3)
    private BigDecimal funtxrcb2;
    @Basic
    @Column(name = "FUNTXRCB3", nullable = false, precision = 3)
    private BigDecimal funtxrcb3;
    @Basic
    @Column(name = "FUNTXRCB4", nullable = false, precision = 3)
    private BigDecimal funtxrcb4;
    @Basic
    @Column(name = "FUNTXRCB5", nullable = false, precision = 3)
    private BigDecimal funtxrcb5;
    @Basic
    @Column(name = "FUNTXALOC1", nullable = false, precision = 3)
    private BigDecimal funtxaloc1;
    @Basic
    @Column(name = "FUNTXALOC2", nullable = false, precision = 3)
    private BigDecimal funtxaloc2;
    @Basic
    @Column(name = "FUNTXALOC3", nullable = false, precision = 3)
    private BigDecimal funtxaloc3;
    @Basic
    @Column(name = "FUNTXALOC4", nullable = false, precision = 3)
    private BigDecimal funtxaloc4;
    @Basic
    @Column(name = "FUNTXALOC5", nullable = false, precision = 3)
    private BigDecimal funtxaloc5;
    @Basic
    @Column(name = "AMTINVCTC", nullable = false, precision = 3)
    private BigDecimal amtinvctc;
    @Basic
    @Column(name = "AMTINVCHC", nullable = false, precision = 3)
    private BigDecimal amtinvchc;


}
