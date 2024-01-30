package com.sagemcintegration.model.mssql.hi.ap;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
public class Apibh implements Serializable {
    @EmbeddedId
    private ApibhPK apibhPK;
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
    @Column(name = "IDVEND", nullable = false, length = 12)
    private String idvend;
    @Basic
    @Column(name = "IDINVC", nullable = false, length = 22)
    private String idinvc;
    @Basic
    @Column(name = "IDRMITTO", nullable = false, length = 6)
    private String idrmitto;
    @Basic
    @Column(name = "TEXTTRX", nullable = false)
    private short texttrx;
    @Basic
    @Column(name = "IDTRX", nullable = false)
    private short idtrx;
    @Basic
    @Column(name = "INVCSTTS", nullable = false)
    private short invcstts;
    @Basic
    @Column(name = "ORDRNBR", nullable = false, length = 22)
    private String ordrnbr;
    @Basic
    @Column(name = "PONBR", nullable = false, length = 22)
    private String ponbr;
    @Basic
    @Column(name = "INVCDESC", nullable = false, length = 60)
    private String invcdesc;
    @Basic
    @Column(name = "SWPRTINVC", nullable = false)
    private short swprtinvc;
    @Basic
    @Column(name = "INVCAPPLTO", nullable = false, length = 22)
    private String invcapplto;
    @Basic
    @Column(name = "IDACCTSET", nullable = false, length = 6)
    private String idacctset;
    @Basic
    @Column(name = "DATEINVC", nullable = false, precision = 0)
    private int dateinvc;
    @Basic
    @Column(name = "DATEASOF", nullable = false, precision = 0)
    private int dateasof;
    @Basic
    @Column(name = "FISCYR", nullable = false, length = 4)
    private String fiscyr;
    @Basic
    @Column(name = "FISCPER", nullable = false, length = 2)
    private String fiscper;
    @Basic
    @Column(name = "CODECURN", nullable = false, length = 3)
    private String codecurn;
    @Basic
    @Column(name = "RATETYPE", nullable = false, length = 2)
    private String ratetype;
    @Basic
    @Column(name = "SWMANRTE", nullable = false)
    private short swmanrte;
    @Basic
    @Column(name = "EXCHRATEHC", nullable = false, precision = 7)
    private BigDecimal exchratehc;
    @Basic
    @Column(name = "ORIGRATEHC", nullable = false, precision = 7)
    private BigDecimal origratehc;
    @Basic
    @Column(name = "TERMCODE", nullable = false, length = 6)
    private String termcode;
    @Basic
    @Column(name = "SWTERMOVRD", nullable = false)
    private short swtermovrd;
    @Basic
    @Column(name = "DATEDUE", nullable = false, precision = 0)
    private int datedue;
    @Basic
    @Column(name = "DATEDISC", nullable = false, precision = 0)
    private int datedisc;
    @Basic
    @Column(name = "PCTDISC", nullable = false, precision = 5)
    private BigDecimal pctdisc;
    @Basic
    @Column(name = "AMTDISCAVL", nullable = false, precision = 3)
    private BigDecimal amtdiscavl;
    @Basic
    @Column(name = "LASTLINE", nullable = false, precision = 0)
    private int lastline;
    @Basic
    @Column(name = "SWTAXBL", nullable = false)
    private short swtaxbl;
    @Basic
    @Column(name = "SWCALCTX", nullable = false)
    private short swcalctx;
    @Basic
    @Column(name = "CODETAXGRP", nullable = false, length = 12)
    private String codetaxgrp;
    @Basic
    @Column(name = "CODETAX1", nullable = false, length = 12)
    private String codetax1;
    @Basic
    @Column(name = "CODETAX2", nullable = false, length = 12)
    private String codetax2;
    @Basic
    @Column(name = "CODETAX3", nullable = false, length = 12)
    private String codetax3;
    @Basic
    @Column(name = "CODETAX4", nullable = false, length = 12)
    private String codetax4;
    @Basic
    @Column(name = "CODETAX5", nullable = false, length = 12)
    private String codetax5;
    @Basic
    @Column(name = "TAXCLASS1", nullable = false)
    private short taxclass1;
    @Basic
    @Column(name = "TAXCLASS2", nullable = false)
    private short taxclass2;
    @Basic
    @Column(name = "TAXCLASS3", nullable = false)
    private short taxclass3;
    @Basic
    @Column(name = "TAXCLASS4", nullable = false)
    private short taxclass4;
    @Basic
    @Column(name = "TAXCLASS5", nullable = false)
    private short taxclass5;
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
    @Column(name = "AMT1099", nullable = false, precision = 3)
    private BigDecimal amt1099;
    @Basic
    @Column(name = "AMTDISTSET", nullable = false, precision = 3)
    private BigDecimal amtdistset;
    @Basic
    @Column(name = "AMTTAXDIST", nullable = false, precision = 3)
    private BigDecimal amttaxdist;
    @Basic
    @Column(name = "AMTINVCTOT", nullable = false, precision = 3)
    private BigDecimal amtinvctot;
    @Basic
    @Column(name = "AMTALLOCTX", nullable = false, precision = 3)
    private BigDecimal amtalloctx;
    @Basic
    @Column(name = "CNTPAYMSCH", nullable = false, precision = 0)
    private int cntpaymsch;
    @Basic
    @Column(name = "AMTTOTDIST", nullable = false, precision = 3)
    private BigDecimal amttotdist;
    @Basic
    @Column(name = "AMTGROSDST", nullable = false, precision = 3)
    private BigDecimal amtgrosdst;
    @Basic
    @Column(name = "IDPPD", nullable = false, length = 22)
    private String idppd;
    @Basic
    @Column(name = "TEXTRMIT", nullable = false, length = 60)
    private String textrmit;
    @Basic
    @Column(name = "TEXTSTE1", nullable = false, length = 60)
    private String textste1;
    @Basic
    @Column(name = "TEXTSTE2", nullable = false, length = 60)
    private String textste2;
    @Basic
    @Column(name = "TEXTSTE3", nullable = false, length = 60)
    private String textste3;
    @Basic
    @Column(name = "TEXTSTE4", nullable = false, length = 60)
    private String textste4;
    @Basic
    @Column(name = "NAMECITY", nullable = false, length = 30)
    private String namecity;
    @Basic
    @Column(name = "CODESTTE", nullable = false, length = 30)
    private String codestte;
    @Basic
    @Column(name = "CODEPSTL", nullable = false, length = 20)
    private String codepstl;
    @Basic
    @Column(name = "CODECTRY", nullable = false, length = 30)
    private String codectry;
    @Basic
    @Column(name = "NAMECTAC", nullable = false, length = 60)
    private String namectac;
    @Basic
    @Column(name = "TEXTPHON", nullable = false, length = 30)
    private String textphon;
    @Basic
    @Column(name = "TEXTFAX", nullable = false, length = 30)
    private String textfax;
    @Basic
    @Column(name = "DATERATE", nullable = false, precision = 0)
    private int daterate;
    @Basic
    @Column(name = "AMTRECTAX", nullable = false, precision = 3)
    private BigDecimal amtrectax;
    @Basic
    @Column(name = "CODEPAYPPD", nullable = false, precision = 0)
    private int codepayppd;
    @Basic
    @Column(name = "CODEVNDGRP", nullable = false, length = 6)
    private String codevndgrp;
    @Basic
    @Column(name = "TERMSDESC", nullable = false, length = 60)
    private String termsdesc;
    @Basic
    @Column(name = "IDDISTSET", nullable = false, length = 6)
    private String iddistset;
    @Basic
    @Column(name = "ID1099CLAS", nullable = false, length = 6)
    private String id1099Clas;
    @Basic
    @Column(name = "AMTTAXTOT", nullable = false, precision = 3)
    private BigDecimal amttaxtot;
    @Basic
    @Column(name = "AMTGROSTOT", nullable = false, precision = 3)
    private BigDecimal amtgrostot;
    @Basic
    @Column(name = "SWTAXINCL1", nullable = false)
    private short swtaxincl1;
    @Basic
    @Column(name = "SWTAXINCL2", nullable = false)
    private short swtaxincl2;
    @Basic
    @Column(name = "SWTAXINCL3", nullable = false)
    private short swtaxincl3;
    @Basic
    @Column(name = "SWTAXINCL4", nullable = false)
    private short swtaxincl4;
    @Basic
    @Column(name = "SWTAXINCL5", nullable = false)
    private short swtaxincl5;
    @Basic
    @Column(name = "AMTEXPTAX", nullable = false, precision = 3)
    private BigDecimal amtexptax;
    @Basic
    @Column(name = "AMTAXTOBE", nullable = false, precision = 3)
    private BigDecimal amtaxtobe;
    @Basic
    @Column(name = "TAXOUTBAL", nullable = false, precision = 3)
    private BigDecimal taxoutbal;
    @Basic
    @Column(name = "CODEOPER", nullable = false)
    private short codeoper;
    @Basic
    @Column(name = "ACCTREC1", nullable = false, length = 45)
    private String acctrec1;
    @Basic
    @Column(name = "ACCTREC2", nullable = false, length = 45)
    private String acctrec2;
    @Basic
    @Column(name = "ACCTREC3", nullable = false, length = 45)
    private String acctrec3;
    @Basic
    @Column(name = "ACCTREC4", nullable = false, length = 45)
    private String acctrec4;
    @Basic
    @Column(name = "ACCTREC5", nullable = false, length = 45)
    private String acctrec5;
    @Basic
    @Column(name = "ACCTEXP1", nullable = false, length = 45)
    private String acctexp1;
    @Basic
    @Column(name = "ACCTEXP2", nullable = false, length = 45)
    private String acctexp2;
    @Basic
    @Column(name = "ACCTEXP3", nullable = false, length = 45)
    private String acctexp3;
    @Basic
    @Column(name = "ACCTEXP4", nullable = false, length = 45)
    private String acctexp4;
    @Basic
    @Column(name = "ACCTEXP5", nullable = false, length = 45)
    private String acctexp5;
    @Basic
    @Column(name = "DRILLAPP", nullable = false, length = 2)
    private String drillapp;
    @Basic
    @Column(name = "DRILLTYPE", nullable = false)
    private short drilltype;
    @Basic
    @Column(name = "DRILLDWNLK", nullable = false, precision = 0)
    private int drilldwnlk;
    @Basic
    @Column(name = "SWJOB", nullable = false)
    private short swjob;
    @Basic
    @Column(name = "AMTRECDIST", nullable = false, precision = 3)
    private BigDecimal amtrecdist;
    @Basic
    @Column(name = "AMTEXPDIST", nullable = false, precision = 3)
    private BigDecimal amtexpdist;
    @Basic
    @Column(name = "ERRBATCH", nullable = false)
    private int errbatch;
    @Basic
    @Column(name = "ERRENTRY", nullable = false)
    private int errentry;
    @Basic
    @Column(name = "EMAIL", nullable = false, length = 50)
    private String email;
    @Basic
    @Column(name = "CTACPHONE", nullable = false, length = 30)
    private String ctacphone;
    @Basic
    @Column(name = "CTACFAX", nullable = false, length = 30)
    private String ctacfax;
    @Basic
    @Column(name = "CTACEMAIL", nullable = false, length = 50)
    private String ctacemail;
    @Basic
    @Column(name = "AMTPPD", nullable = false, precision = 3)
    private BigDecimal amtppd;
    @Basic
    @Column(name = "IDSTDINVC", nullable = false, length = 16)
    private String idstdinvc;
    @Basic
    @Column(name = "DATEPRCS", nullable = false, precision = 0)
    private int dateprcs;
    @Basic
    @Column(name = "AMTDSBWTAX", nullable = false, precision = 3)
    private BigDecimal amtdsbwtax;
    @Basic
    @Column(name = "AMTDSBNTAX", nullable = false, precision = 3)
    private BigDecimal amtdsbntax;
    @Basic
    @Column(name = "AMTDSCBASE", nullable = false, precision = 3)
    private BigDecimal amtdscbase;
    @Basic
    @Column(name = "SWRTGINVC", nullable = false)
    private short swrtginvc;
    @Basic
    @Column(name = "RTGAPPLYTO", nullable = false, length = 22)
    private String rtgapplyto;
    @Basic
    @Column(name = "SWRTG", nullable = false)
    private short swrtg;
    @Basic
    @Column(name = "RTGAMT", nullable = false, precision = 3)
    private BigDecimal rtgamt;
    @Basic
    @Column(name = "RTGPERCENT", nullable = false, precision = 5)
    private BigDecimal rtgpercent;
    @Basic
    @Column(name = "RTGDAYS", nullable = false)
    private short rtgdays;
    @Basic
    @Column(name = "RTGDATEDUE", nullable = false, precision = 0)
    private int rtgdatedue;
    @Basic
    @Column(name = "RTGTERMS", nullable = false, length = 6)
    private String rtgterms;
    @Basic
    @Column(name = "SWRTGDDTOV", nullable = false)
    private short swrtgddtov;
    @Basic
    @Column(name = "SWRTGAMTOV", nullable = false)
    private short swrtgamtov;
    @Basic
    @Column(name = "SWRTGRATE", nullable = false)
    private short swrtgrate;
    @Basic
    @Column(name = "SWTXBSECTL", nullable = false)
    private short swtxbsectl;
    @Basic
    @Column(name = "`VALUES`", nullable = false)
    private int values;
    @Basic
    @Column(name = "ORIGCOMP", nullable = false, length = 6)
    private String origcomp;
    @Basic
    @Column(name = "DETAILCNT", nullable = false)
    private int detailcnt;
    @Basic
    @Column(name = "SRCEAPPL", nullable = false, length = 2)
    private String srceappl;
    @Basic
    @Column(name = "SWHOLD", nullable = false)
    private short swhold;
    @Basic
    @Column(name = "APVERSION", nullable = false, length = 3)
    private String apversion;
    @Basic
    @Column(name = "TAXVERSION", nullable = false)
    private int taxversion;
    @Basic
    @Column(name = "SWTXRTGRPT", nullable = false)
    private short swtxrtgrpt;
    @Basic
    @Column(name = "CODECURNRC", nullable = false, length = 3)
    private String codecurnrc;
    @Basic
    @Column(name = "SWTXCTLRC", nullable = false)
    private short swtxctlrc;
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
    @Column(name = "SWRATERC", nullable = false)
    private short swraterc;
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
    @Column(name = "TXTOTRC", nullable = false, precision = 3)
    private BigDecimal txtotrc;
    @Basic
    @Column(name = "TXALLRC", nullable = false, precision = 3)
    private BigDecimal txallrc;
    @Basic
    @Column(name = "TXEXPRC", nullable = false, precision = 3)
    private BigDecimal txexprc;
    @Basic
    @Column(name = "TXRECRC", nullable = false, precision = 3)
    private BigDecimal txrecrc;
    @Basic
    @Column(name = "TXBSERT1TC", nullable = false, precision = 3)
    private BigDecimal txbsert1Tc;
    @Basic
    @Column(name = "TXBSERT2TC", nullable = false, precision = 3)
    private BigDecimal txbsert2Tc;
    @Basic
    @Column(name = "TXBSERT3TC", nullable = false, precision = 3)
    private BigDecimal txbsert3Tc;
    @Basic
    @Column(name = "TXBSERT4TC", nullable = false, precision = 3)
    private BigDecimal txbsert4Tc;
    @Basic
    @Column(name = "TXBSERT5TC", nullable = false, precision = 3)
    private BigDecimal txbsert5Tc;
    @Basic
    @Column(name = "TXAMTRT1TC", nullable = false, precision = 3)
    private BigDecimal txamtrt1Tc;
    @Basic
    @Column(name = "TXAMTRT2TC", nullable = false, precision = 3)
    private BigDecimal txamtrt2Tc;
    @Basic
    @Column(name = "TXAMTRT3TC", nullable = false, precision = 3)
    private BigDecimal txamtrt3Tc;
    @Basic
    @Column(name = "TXAMTRT4TC", nullable = false, precision = 3)
    private BigDecimal txamtrt4Tc;
    @Basic
    @Column(name = "TXAMTRT5TC", nullable = false, precision = 3)
    private BigDecimal txamtrt5Tc;
    @Basic
    @Column(name = "TXBSE1HC", nullable = false, precision = 3)
    private BigDecimal txbse1Hc;
    @Basic
    @Column(name = "TXBSE2HC", nullable = false, precision = 3)
    private BigDecimal txbse2Hc;
    @Basic
    @Column(name = "TXBSE3HC", nullable = false, precision = 3)
    private BigDecimal txbse3Hc;
    @Basic
    @Column(name = "TXBSE4HC", nullable = false, precision = 3)
    private BigDecimal txbse4Hc;
    @Basic
    @Column(name = "TXBSE5HC", nullable = false, precision = 3)
    private BigDecimal txbse5Hc;
    @Basic
    @Column(name = "TXAMT1HC", nullable = false, precision = 3)
    private BigDecimal txamt1Hc;
    @Basic
    @Column(name = "TXAMT2HC", nullable = false, precision = 3)
    private BigDecimal txamt2Hc;
    @Basic
    @Column(name = "TXAMT3HC", nullable = false, precision = 3)
    private BigDecimal txamt3Hc;
    @Basic
    @Column(name = "TXAMT4HC", nullable = false, precision = 3)
    private BigDecimal txamt4Hc;
    @Basic
    @Column(name = "TXAMT5HC", nullable = false, precision = 3)
    private BigDecimal txamt5Hc;
    @Basic
    @Column(name = "AMTGROSHC", nullable = false, precision = 3)
    private BigDecimal amtgroshc;
    @Basic
    @Column(name = "RTGAMTHC", nullable = false, precision = 3)
    private BigDecimal rtgamthc;
    @Basic
    @Column(name = "AMTDISCHC", nullable = false, precision = 3)
    private BigDecimal amtdischc;
    @Basic
    @Column(name = "AMT1099HC", nullable = false, precision = 3)
    private BigDecimal amt1099Hc;
    @Basic
    @Column(name = "AMTPPDHC", nullable = false, precision = 3)
    private BigDecimal amtppdhc;
    @Basic
    @Column(name = "AMTDUETC", nullable = false, precision = 3)
    private BigDecimal amtduetc;
    @Basic
    @Column(name = "AMTDUEHC", nullable = false, precision = 3)
    private BigDecimal amtduehc;
    @Basic
    @Column(name = "TEXTVEN", nullable = false, length = 60)
    private String textven;
    @Basic
    @Column(name = "ENTEREDBY", nullable = false, length = 8)
    private String enteredby;
    @Basic
    @Column(name = "DATEBUS", nullable = false, precision = 0)
    private int datebus;
    @Basic
    @Column(name = "IDN", nullable = false, length = 30)
    private String idn;
    @Basic
    @Column(name = "AMTWHT1TC", nullable = false, precision = 3)
    private BigDecimal amtwht1Tc;
    @Basic
    @Column(name = "AMTWHT2TC", nullable = false, precision = 3)
    private BigDecimal amtwht2Tc;
    @Basic
    @Column(name = "AMTWHT3TC", nullable = false, precision = 3)
    private BigDecimal amtwht3Tc;
    @Basic
    @Column(name = "AMTWHT4TC", nullable = false, precision = 3)
    private BigDecimal amtwht4Tc;
    @Basic
    @Column(name = "AMTWHT5TC", nullable = false, precision = 3)
    private BigDecimal amtwht5Tc;
    @Basic
    @Column(name = "AMTCXBS1TC", nullable = false, precision = 3)
    private BigDecimal amtcxbs1Tc;
    @Basic
    @Column(name = "AMTCXBS2TC", nullable = false, precision = 3)
    private BigDecimal amtcxbs2Tc;
    @Basic
    @Column(name = "AMTCXBS3TC", nullable = false, precision = 3)
    private BigDecimal amtcxbs3Tc;
    @Basic
    @Column(name = "AMTCXBS4TC", nullable = false, precision = 3)
    private BigDecimal amtcxbs4Tc;
    @Basic
    @Column(name = "AMTCXBS5TC", nullable = false, precision = 3)
    private BigDecimal amtcxbs5Tc;
    @Basic
    @Column(name = "AMTCXTX1TC", nullable = false, precision = 3)
    private BigDecimal amtcxtx1Tc;
    @Basic
    @Column(name = "AMTCXTX2TC", nullable = false, precision = 3)
    private BigDecimal amtcxtx2Tc;
    @Basic
    @Column(name = "AMTCXTX3TC", nullable = false, precision = 3)
    private BigDecimal amtcxtx3Tc;
    @Basic
    @Column(name = "AMTCXTX4TC", nullable = false, precision = 3)
    private BigDecimal amtcxtx4Tc;
    @Basic
    @Column(name = "AMTCXTX5TC", nullable = false, precision = 3)
    private BigDecimal amtcxtx5Tc;

    public ApibhPK getApibhPK() {
        return apibhPK;
    }

    public void setApibhPK(ApibhPK apibhPK) {
        this.apibhPK = apibhPK;
    }

    public int getAudtdate() {
        return audtdate;
    }

    public void setAudtdate(int audtdate) {
        this.audtdate = audtdate;
    }

    public int getAudttime() {
        return audttime;
    }

    public void setAudttime(int audttime) {
        this.audttime = audttime;
    }

    public String getAudtuser() {
        return audtuser;
    }

    public void setAudtuser(String audtuser) {
        this.audtuser = audtuser;
    }

    public String getAudtorg() {
        return audtorg;
    }

    public void setAudtorg(String audtorg) {
        this.audtorg = audtorg;
    }

    public String getIdvend() {
        return idvend;
    }

    public void setIdvend(String idvend) {
        this.idvend = idvend;
    }

    public String getIdinvc() {
        return idinvc;
    }

    public void setIdinvc(String idinvc) {
        this.idinvc = idinvc;
    }

    public String getIdrmitto() {
        return idrmitto;
    }

    public void setIdrmitto(String idrmitto) {
        this.idrmitto = idrmitto;
    }

    public short getTexttrx() {
        return texttrx;
    }

    public void setTexttrx(short texttrx) {
        this.texttrx = texttrx;
    }

    public short getIdtrx() {
        return idtrx;
    }

    public void setIdtrx(short idtrx) {
        this.idtrx = idtrx;
    }

    public short getInvcstts() {
        return invcstts;
    }

    public void setInvcstts(short invcstts) {
        this.invcstts = invcstts;
    }

    public String getOrdrnbr() {
        return ordrnbr;
    }

    public void setOrdrnbr(String ordrnbr) {
        this.ordrnbr = ordrnbr;
    }

    public String getPonbr() {
        return ponbr;
    }

    public void setPonbr(String ponbr) {
        this.ponbr = ponbr;
    }

    public String getInvcdesc() {
        return invcdesc;
    }

    public void setInvcdesc(String invcdesc) {
        this.invcdesc = invcdesc;
    }

    public short getSwprtinvc() {
        return swprtinvc;
    }

    public void setSwprtinvc(short swprtinvc) {
        this.swprtinvc = swprtinvc;
    }

    public String getInvcapplto() {
        return invcapplto;
    }

    public void setInvcapplto(String invcapplto) {
        this.invcapplto = invcapplto;
    }

    public String getIdacctset() {
        return idacctset;
    }

    public void setIdacctset(String idacctset) {
        this.idacctset = idacctset;
    }

    public int getDateinvc() {
        return dateinvc;
    }

    public void setDateinvc(int dateinvc) {
        this.dateinvc = dateinvc;
    }

    public int getDateasof() {
        return dateasof;
    }

    public void setDateasof(int dateasof) {
        this.dateasof = dateasof;
    }

    public String getFiscyr() {
        return fiscyr;
    }

    public void setFiscyr(String fiscyr) {
        this.fiscyr = fiscyr;
    }

    public String getFiscper() {
        return fiscper;
    }

    public void setFiscper(String fiscper) {
        this.fiscper = fiscper;
    }

    public String getCodecurn() {
        return codecurn;
    }

    public void setCodecurn(String codecurn) {
        this.codecurn = codecurn;
    }

    public String getRatetype() {
        return ratetype;
    }

    public void setRatetype(String ratetype) {
        this.ratetype = ratetype;
    }

    public short getSwmanrte() {
        return swmanrte;
    }

    public void setSwmanrte(short swmanrte) {
        this.swmanrte = swmanrte;
    }

    public BigDecimal getExchratehc() {
        return exchratehc;
    }

    public void setExchratehc(BigDecimal exchratehc) {
        this.exchratehc = exchratehc;
    }

    public BigDecimal getOrigratehc() {
        return origratehc;
    }

    public void setOrigratehc(BigDecimal origratehc) {
        this.origratehc = origratehc;
    }

    public String getTermcode() {
        return termcode;
    }

    public void setTermcode(String termcode) {
        this.termcode = termcode;
    }

    public short getSwtermovrd() {
        return swtermovrd;
    }

    public void setSwtermovrd(short swtermovrd) {
        this.swtermovrd = swtermovrd;
    }

    public int getDatedue() {
        return datedue;
    }

    public void setDatedue(int datedue) {
        this.datedue = datedue;
    }

    public int getDatedisc() {
        return datedisc;
    }

    public void setDatedisc(int datedisc) {
        this.datedisc = datedisc;
    }

    public BigDecimal getPctdisc() {
        return pctdisc;
    }

    public void setPctdisc(BigDecimal pctdisc) {
        this.pctdisc = pctdisc;
    }

    public BigDecimal getAmtdiscavl() {
        return amtdiscavl;
    }

    public void setAmtdiscavl(BigDecimal amtdiscavl) {
        this.amtdiscavl = amtdiscavl;
    }

    public int getLastline() {
        return lastline;
    }

    public void setLastline(int lastline) {
        this.lastline = lastline;
    }

    public short getSwtaxbl() {
        return swtaxbl;
    }

    public void setSwtaxbl(short swtaxbl) {
        this.swtaxbl = swtaxbl;
    }

    public short getSwcalctx() {
        return swcalctx;
    }

    public void setSwcalctx(short swcalctx) {
        this.swcalctx = swcalctx;
    }

    public String getCodetaxgrp() {
        return codetaxgrp;
    }

    public void setCodetaxgrp(String codetaxgrp) {
        this.codetaxgrp = codetaxgrp;
    }

    public String getCodetax1() {
        return codetax1;
    }

    public void setCodetax1(String codetax1) {
        this.codetax1 = codetax1;
    }

    public String getCodetax2() {
        return codetax2;
    }

    public void setCodetax2(String codetax2) {
        this.codetax2 = codetax2;
    }

    public String getCodetax3() {
        return codetax3;
    }

    public void setCodetax3(String codetax3) {
        this.codetax3 = codetax3;
    }

    public String getCodetax4() {
        return codetax4;
    }

    public void setCodetax4(String codetax4) {
        this.codetax4 = codetax4;
    }

    public String getCodetax5() {
        return codetax5;
    }

    public void setCodetax5(String codetax5) {
        this.codetax5 = codetax5;
    }

    public short getTaxclass1() {
        return taxclass1;
    }

    public void setTaxclass1(short taxclass1) {
        this.taxclass1 = taxclass1;
    }

    public short getTaxclass2() {
        return taxclass2;
    }

    public void setTaxclass2(short taxclass2) {
        this.taxclass2 = taxclass2;
    }

    public short getTaxclass3() {
        return taxclass3;
    }

    public void setTaxclass3(short taxclass3) {
        this.taxclass3 = taxclass3;
    }

    public short getTaxclass4() {
        return taxclass4;
    }

    public void setTaxclass4(short taxclass4) {
        this.taxclass4 = taxclass4;
    }

    public short getTaxclass5() {
        return taxclass5;
    }

    public void setTaxclass5(short taxclass5) {
        this.taxclass5 = taxclass5;
    }

    public BigDecimal getBasetax1() {
        return basetax1;
    }

    public void setBasetax1(BigDecimal basetax1) {
        this.basetax1 = basetax1;
    }

    public BigDecimal getBasetax2() {
        return basetax2;
    }

    public void setBasetax2(BigDecimal basetax2) {
        this.basetax2 = basetax2;
    }

    public BigDecimal getBasetax3() {
        return basetax3;
    }

    public void setBasetax3(BigDecimal basetax3) {
        this.basetax3 = basetax3;
    }

    public BigDecimal getBasetax4() {
        return basetax4;
    }

    public void setBasetax4(BigDecimal basetax4) {
        this.basetax4 = basetax4;
    }

    public BigDecimal getBasetax5() {
        return basetax5;
    }

    public void setBasetax5(BigDecimal basetax5) {
        this.basetax5 = basetax5;
    }

    public BigDecimal getAmttax1() {
        return amttax1;
    }

    public void setAmttax1(BigDecimal amttax1) {
        this.amttax1 = amttax1;
    }

    public BigDecimal getAmttax2() {
        return amttax2;
    }

    public void setAmttax2(BigDecimal amttax2) {
        this.amttax2 = amttax2;
    }

    public BigDecimal getAmttax3() {
        return amttax3;
    }

    public void setAmttax3(BigDecimal amttax3) {
        this.amttax3 = amttax3;
    }

    public BigDecimal getAmttax4() {
        return amttax4;
    }

    public void setAmttax4(BigDecimal amttax4) {
        this.amttax4 = amttax4;
    }

    public BigDecimal getAmttax5() {
        return amttax5;
    }

    public void setAmttax5(BigDecimal amttax5) {
        this.amttax5 = amttax5;
    }

    public BigDecimal getAmt1099() {
        return amt1099;
    }

    public void setAmt1099(BigDecimal amt1099) {
        this.amt1099 = amt1099;
    }

    public BigDecimal getAmtdistset() {
        return amtdistset;
    }

    public void setAmtdistset(BigDecimal amtdistset) {
        this.amtdistset = amtdistset;
    }

    public BigDecimal getAmttaxdist() {
        return amttaxdist;
    }

    public void setAmttaxdist(BigDecimal amttaxdist) {
        this.amttaxdist = amttaxdist;
    }

    public BigDecimal getAmtinvctot() {
        return amtinvctot;
    }

    public void setAmtinvctot(BigDecimal amtinvctot) {
        this.amtinvctot = amtinvctot;
    }

    public BigDecimal getAmtalloctx() {
        return amtalloctx;
    }

    public void setAmtalloctx(BigDecimal amtalloctx) {
        this.amtalloctx = amtalloctx;
    }

    public int getCntpaymsch() {
        return cntpaymsch;
    }

    public void setCntpaymsch(int cntpaymsch) {
        this.cntpaymsch = cntpaymsch;
    }

    public BigDecimal getAmttotdist() {
        return amttotdist;
    }

    public void setAmttotdist(BigDecimal amttotdist) {
        this.amttotdist = amttotdist;
    }

    public BigDecimal getAmtgrosdst() {
        return amtgrosdst;
    }

    public void setAmtgrosdst(BigDecimal amtgrosdst) {
        this.amtgrosdst = amtgrosdst;
    }

    public String getIdppd() {
        return idppd;
    }

    public void setIdppd(String idppd) {
        this.idppd = idppd;
    }

    public String getTextrmit() {
        return textrmit;
    }

    public void setTextrmit(String textrmit) {
        this.textrmit = textrmit;
    }

    public String getTextste1() {
        return textste1;
    }

    public void setTextste1(String textste1) {
        this.textste1 = textste1;
    }

    public String getTextste2() {
        return textste2;
    }

    public void setTextste2(String textste2) {
        this.textste2 = textste2;
    }

    public String getTextste3() {
        return textste3;
    }

    public void setTextste3(String textste3) {
        this.textste3 = textste3;
    }

    public String getTextste4() {
        return textste4;
    }

    public void setTextste4(String textste4) {
        this.textste4 = textste4;
    }

    public String getNamecity() {
        return namecity;
    }

    public void setNamecity(String namecity) {
        this.namecity = namecity;
    }

    public String getCodestte() {
        return codestte;
    }

    public void setCodestte(String codestte) {
        this.codestte = codestte;
    }

    public String getCodepstl() {
        return codepstl;
    }

    public void setCodepstl(String codepstl) {
        this.codepstl = codepstl;
    }

    public String getCodectry() {
        return codectry;
    }

    public void setCodectry(String codectry) {
        this.codectry = codectry;
    }

    public String getNamectac() {
        return namectac;
    }

    public void setNamectac(String namectac) {
        this.namectac = namectac;
    }

    public String getTextphon() {
        return textphon;
    }

    public void setTextphon(String textphon) {
        this.textphon = textphon;
    }

    public String getTextfax() {
        return textfax;
    }

    public void setTextfax(String textfax) {
        this.textfax = textfax;
    }

    public int getDaterate() {
        return daterate;
    }

    public void setDaterate(int daterate) {
        this.daterate = daterate;
    }

    public BigDecimal getAmtrectax() {
        return amtrectax;
    }

    public void setAmtrectax(BigDecimal amtrectax) {
        this.amtrectax = amtrectax;
    }

    public int getCodepayppd() {
        return codepayppd;
    }

    public void setCodepayppd(int codepayppd) {
        this.codepayppd = codepayppd;
    }

    public String getCodevndgrp() {
        return codevndgrp;
    }

    public void setCodevndgrp(String codevndgrp) {
        this.codevndgrp = codevndgrp;
    }

    public String getTermsdesc() {
        return termsdesc;
    }

    public void setTermsdesc(String termsdesc) {
        this.termsdesc = termsdesc;
    }

    public String getIddistset() {
        return iddistset;
    }

    public void setIddistset(String iddistset) {
        this.iddistset = iddistset;
    }

    public String getId1099Clas() {
        return id1099Clas;
    }

    public void setId1099Clas(String id1099Clas) {
        this.id1099Clas = id1099Clas;
    }

    public BigDecimal getAmttaxtot() {
        return amttaxtot;
    }

    public void setAmttaxtot(BigDecimal amttaxtot) {
        this.amttaxtot = amttaxtot;
    }

    public BigDecimal getAmtgrostot() {
        return amtgrostot;
    }

    public void setAmtgrostot(BigDecimal amtgrostot) {
        this.amtgrostot = amtgrostot;
    }

    public short getSwtaxincl1() {
        return swtaxincl1;
    }

    public void setSwtaxincl1(short swtaxincl1) {
        this.swtaxincl1 = swtaxincl1;
    }

    public short getSwtaxincl2() {
        return swtaxincl2;
    }

    public void setSwtaxincl2(short swtaxincl2) {
        this.swtaxincl2 = swtaxincl2;
    }

    public short getSwtaxincl3() {
        return swtaxincl3;
    }

    public void setSwtaxincl3(short swtaxincl3) {
        this.swtaxincl3 = swtaxincl3;
    }

    public short getSwtaxincl4() {
        return swtaxincl4;
    }

    public void setSwtaxincl4(short swtaxincl4) {
        this.swtaxincl4 = swtaxincl4;
    }

    public short getSwtaxincl5() {
        return swtaxincl5;
    }

    public void setSwtaxincl5(short swtaxincl5) {
        this.swtaxincl5 = swtaxincl5;
    }

    public BigDecimal getAmtexptax() {
        return amtexptax;
    }

    public void setAmtexptax(BigDecimal amtexptax) {
        this.amtexptax = amtexptax;
    }

    public BigDecimal getAmtaxtobe() {
        return amtaxtobe;
    }

    public void setAmtaxtobe(BigDecimal amtaxtobe) {
        this.amtaxtobe = amtaxtobe;
    }

    public BigDecimal getTaxoutbal() {
        return taxoutbal;
    }

    public void setTaxoutbal(BigDecimal taxoutbal) {
        this.taxoutbal = taxoutbal;
    }

    public short getCodeoper() {
        return codeoper;
    }

    public void setCodeoper(short codeoper) {
        this.codeoper = codeoper;
    }

    public String getAcctrec1() {
        return acctrec1;
    }

    public void setAcctrec1(String acctrec1) {
        this.acctrec1 = acctrec1;
    }

    public String getAcctrec2() {
        return acctrec2;
    }

    public void setAcctrec2(String acctrec2) {
        this.acctrec2 = acctrec2;
    }

    public String getAcctrec3() {
        return acctrec3;
    }

    public void setAcctrec3(String acctrec3) {
        this.acctrec3 = acctrec3;
    }

    public String getAcctrec4() {
        return acctrec4;
    }

    public void setAcctrec4(String acctrec4) {
        this.acctrec4 = acctrec4;
    }

    public String getAcctrec5() {
        return acctrec5;
    }

    public void setAcctrec5(String acctrec5) {
        this.acctrec5 = acctrec5;
    }

    public String getAcctexp1() {
        return acctexp1;
    }

    public void setAcctexp1(String acctexp1) {
        this.acctexp1 = acctexp1;
    }

    public String getAcctexp2() {
        return acctexp2;
    }

    public void setAcctexp2(String acctexp2) {
        this.acctexp2 = acctexp2;
    }

    public String getAcctexp3() {
        return acctexp3;
    }

    public void setAcctexp3(String acctexp3) {
        this.acctexp3 = acctexp3;
    }

    public String getAcctexp4() {
        return acctexp4;
    }

    public void setAcctexp4(String acctexp4) {
        this.acctexp4 = acctexp4;
    }

    public String getAcctexp5() {
        return acctexp5;
    }

    public void setAcctexp5(String acctexp5) {
        this.acctexp5 = acctexp5;
    }

    public String getDrillapp() {
        return drillapp;
    }

    public void setDrillapp(String drillapp) {
        this.drillapp = drillapp;
    }

    public short getDrilltype() {
        return drilltype;
    }

    public void setDrilltype(short drilltype) {
        this.drilltype = drilltype;
    }

    public int getDrilldwnlk() {
        return drilldwnlk;
    }

    public void setDrilldwnlk(int drilldwnlk) {
        this.drilldwnlk = drilldwnlk;
    }

    public short getSwjob() {
        return swjob;
    }

    public void setSwjob(short swjob) {
        this.swjob = swjob;
    }

    public BigDecimal getAmtrecdist() {
        return amtrecdist;
    }

    public void setAmtrecdist(BigDecimal amtrecdist) {
        this.amtrecdist = amtrecdist;
    }

    public BigDecimal getAmtexpdist() {
        return amtexpdist;
    }

    public void setAmtexpdist(BigDecimal amtexpdist) {
        this.amtexpdist = amtexpdist;
    }

    public int getErrbatch() {
        return errbatch;
    }

    public void setErrbatch(int errbatch) {
        this.errbatch = errbatch;
    }

    public int getErrentry() {
        return errentry;
    }

    public void setErrentry(int errentry) {
        this.errentry = errentry;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCtacphone() {
        return ctacphone;
    }

    public void setCtacphone(String ctacphone) {
        this.ctacphone = ctacphone;
    }

    public String getCtacfax() {
        return ctacfax;
    }

    public void setCtacfax(String ctacfax) {
        this.ctacfax = ctacfax;
    }

    public String getCtacemail() {
        return ctacemail;
    }

    public void setCtacemail(String ctacemail) {
        this.ctacemail = ctacemail;
    }

    public BigDecimal getAmtppd() {
        return amtppd;
    }

    public void setAmtppd(BigDecimal amtppd) {
        this.amtppd = amtppd;
    }

    public String getIdstdinvc() {
        return idstdinvc;
    }

    public void setIdstdinvc(String idstdinvc) {
        this.idstdinvc = idstdinvc;
    }

    public int getDateprcs() {
        return dateprcs;
    }

    public void setDateprcs(int dateprcs) {
        this.dateprcs = dateprcs;
    }

    public BigDecimal getAmtdsbwtax() {
        return amtdsbwtax;
    }

    public void setAmtdsbwtax(BigDecimal amtdsbwtax) {
        this.amtdsbwtax = amtdsbwtax;
    }

    public BigDecimal getAmtdsbntax() {
        return amtdsbntax;
    }

    public void setAmtdsbntax(BigDecimal amtdsbntax) {
        this.amtdsbntax = amtdsbntax;
    }

    public BigDecimal getAmtdscbase() {
        return amtdscbase;
    }

    public void setAmtdscbase(BigDecimal amtdscbase) {
        this.amtdscbase = amtdscbase;
    }

    public short getSwrtginvc() {
        return swrtginvc;
    }

    public void setSwrtginvc(short swrtginvc) {
        this.swrtginvc = swrtginvc;
    }

    public String getRtgapplyto() {
        return rtgapplyto;
    }

    public void setRtgapplyto(String rtgapplyto) {
        this.rtgapplyto = rtgapplyto;
    }

    public short getSwrtg() {
        return swrtg;
    }

    public void setSwrtg(short swrtg) {
        this.swrtg = swrtg;
    }

    public BigDecimal getRtgamt() {
        return rtgamt;
    }

    public void setRtgamt(BigDecimal rtgamt) {
        this.rtgamt = rtgamt;
    }

    public BigDecimal getRtgpercent() {
        return rtgpercent;
    }

    public void setRtgpercent(BigDecimal rtgpercent) {
        this.rtgpercent = rtgpercent;
    }

    public short getRtgdays() {
        return rtgdays;
    }

    public void setRtgdays(short rtgdays) {
        this.rtgdays = rtgdays;
    }

    public int getRtgdatedue() {
        return rtgdatedue;
    }

    public void setRtgdatedue(int rtgdatedue) {
        this.rtgdatedue = rtgdatedue;
    }

    public String getRtgterms() {
        return rtgterms;
    }

    public void setRtgterms(String rtgterms) {
        this.rtgterms = rtgterms;
    }

    public short getSwrtgddtov() {
        return swrtgddtov;
    }

    public void setSwrtgddtov(short swrtgddtov) {
        this.swrtgddtov = swrtgddtov;
    }

    public short getSwrtgamtov() {
        return swrtgamtov;
    }

    public void setSwrtgamtov(short swrtgamtov) {
        this.swrtgamtov = swrtgamtov;
    }

    public short getSwrtgrate() {
        return swrtgrate;
    }

    public void setSwrtgrate(short swrtgrate) {
        this.swrtgrate = swrtgrate;
    }

    public short getSwtxbsectl() {
        return swtxbsectl;
    }

    public void setSwtxbsectl(short swtxbsectl) {
        this.swtxbsectl = swtxbsectl;
    }

    public int getValues() {
        return values;
    }

    public void setValues(int values) {
        this.values = values;
    }

    public String getOrigcomp() {
        return origcomp;
    }

    public void setOrigcomp(String origcomp) {
        this.origcomp = origcomp;
    }

    public int getDetailcnt() {
        return detailcnt;
    }

    public void setDetailcnt(int detailcnt) {
        this.detailcnt = detailcnt;
    }

    public String getSrceappl() {
        return srceappl;
    }

    public void setSrceappl(String srceappl) {
        this.srceappl = srceappl;
    }

    public short getSwhold() {
        return swhold;
    }

    public void setSwhold(short swhold) {
        this.swhold = swhold;
    }

    public String getApversion() {
        return apversion;
    }

    public void setApversion(String apversion) {
        this.apversion = apversion;
    }

    public int getTaxversion() {
        return taxversion;
    }

    public void setTaxversion(int taxversion) {
        this.taxversion = taxversion;
    }

    public short getSwtxrtgrpt() {
        return swtxrtgrpt;
    }

    public void setSwtxrtgrpt(short swtxrtgrpt) {
        this.swtxrtgrpt = swtxrtgrpt;
    }

    public String getCodecurnrc() {
        return codecurnrc;
    }

    public void setCodecurnrc(String codecurnrc) {
        this.codecurnrc = codecurnrc;
    }

    public short getSwtxctlrc() {
        return swtxctlrc;
    }

    public void setSwtxctlrc(short swtxctlrc) {
        this.swtxctlrc = swtxctlrc;
    }

    public BigDecimal getRaterc() {
        return raterc;
    }

    public void setRaterc(BigDecimal raterc) {
        this.raterc = raterc;
    }

    public String getRatetyperc() {
        return ratetyperc;
    }

    public void setRatetyperc(String ratetyperc) {
        this.ratetyperc = ratetyperc;
    }

    public int getRatedaterc() {
        return ratedaterc;
    }

    public void setRatedaterc(int ratedaterc) {
        this.ratedaterc = ratedaterc;
    }

    public short getRateoprc() {
        return rateoprc;
    }

    public void setRateoprc(short rateoprc) {
        this.rateoprc = rateoprc;
    }

    public short getSwraterc() {
        return swraterc;
    }

    public void setSwraterc(short swraterc) {
        this.swraterc = swraterc;
    }

    public BigDecimal getTxamt1Rc() {
        return txamt1Rc;
    }

    public void setTxamt1Rc(BigDecimal txamt1Rc) {
        this.txamt1Rc = txamt1Rc;
    }

    public BigDecimal getTxamt2Rc() {
        return txamt2Rc;
    }

    public void setTxamt2Rc(BigDecimal txamt2Rc) {
        this.txamt2Rc = txamt2Rc;
    }

    public BigDecimal getTxamt3Rc() {
        return txamt3Rc;
    }

    public void setTxamt3Rc(BigDecimal txamt3Rc) {
        this.txamt3Rc = txamt3Rc;
    }

    public BigDecimal getTxamt4Rc() {
        return txamt4Rc;
    }

    public void setTxamt4Rc(BigDecimal txamt4Rc) {
        this.txamt4Rc = txamt4Rc;
    }

    public BigDecimal getTxamt5Rc() {
        return txamt5Rc;
    }

    public void setTxamt5Rc(BigDecimal txamt5Rc) {
        this.txamt5Rc = txamt5Rc;
    }

    public BigDecimal getTxtotrc() {
        return txtotrc;
    }

    public void setTxtotrc(BigDecimal txtotrc) {
        this.txtotrc = txtotrc;
    }

    public BigDecimal getTxallrc() {
        return txallrc;
    }

    public void setTxallrc(BigDecimal txallrc) {
        this.txallrc = txallrc;
    }

    public BigDecimal getTxexprc() {
        return txexprc;
    }

    public void setTxexprc(BigDecimal txexprc) {
        this.txexprc = txexprc;
    }

    public BigDecimal getTxrecrc() {
        return txrecrc;
    }

    public void setTxrecrc(BigDecimal txrecrc) {
        this.txrecrc = txrecrc;
    }

    public BigDecimal getTxbsert1Tc() {
        return txbsert1Tc;
    }

    public void setTxbsert1Tc(BigDecimal txbsert1Tc) {
        this.txbsert1Tc = txbsert1Tc;
    }

    public BigDecimal getTxbsert2Tc() {
        return txbsert2Tc;
    }

    public void setTxbsert2Tc(BigDecimal txbsert2Tc) {
        this.txbsert2Tc = txbsert2Tc;
    }

    public BigDecimal getTxbsert3Tc() {
        return txbsert3Tc;
    }

    public void setTxbsert3Tc(BigDecimal txbsert3Tc) {
        this.txbsert3Tc = txbsert3Tc;
    }

    public BigDecimal getTxbsert4Tc() {
        return txbsert4Tc;
    }

    public void setTxbsert4Tc(BigDecimal txbsert4Tc) {
        this.txbsert4Tc = txbsert4Tc;
    }

    public BigDecimal getTxbsert5Tc() {
        return txbsert5Tc;
    }

    public void setTxbsert5Tc(BigDecimal txbsert5Tc) {
        this.txbsert5Tc = txbsert5Tc;
    }

    public BigDecimal getTxamtrt1Tc() {
        return txamtrt1Tc;
    }

    public void setTxamtrt1Tc(BigDecimal txamtrt1Tc) {
        this.txamtrt1Tc = txamtrt1Tc;
    }

    public BigDecimal getTxamtrt2Tc() {
        return txamtrt2Tc;
    }

    public void setTxamtrt2Tc(BigDecimal txamtrt2Tc) {
        this.txamtrt2Tc = txamtrt2Tc;
    }

    public BigDecimal getTxamtrt3Tc() {
        return txamtrt3Tc;
    }

    public void setTxamtrt3Tc(BigDecimal txamtrt3Tc) {
        this.txamtrt3Tc = txamtrt3Tc;
    }

    public BigDecimal getTxamtrt4Tc() {
        return txamtrt4Tc;
    }

    public void setTxamtrt4Tc(BigDecimal txamtrt4Tc) {
        this.txamtrt4Tc = txamtrt4Tc;
    }

    public BigDecimal getTxamtrt5Tc() {
        return txamtrt5Tc;
    }

    public void setTxamtrt5Tc(BigDecimal txamtrt5Tc) {
        this.txamtrt5Tc = txamtrt5Tc;
    }

    public BigDecimal getTxbse1Hc() {
        return txbse1Hc;
    }

    public void setTxbse1Hc(BigDecimal txbse1Hc) {
        this.txbse1Hc = txbse1Hc;
    }

    public BigDecimal getTxbse2Hc() {
        return txbse2Hc;
    }

    public void setTxbse2Hc(BigDecimal txbse2Hc) {
        this.txbse2Hc = txbse2Hc;
    }

    public BigDecimal getTxbse3Hc() {
        return txbse3Hc;
    }

    public void setTxbse3Hc(BigDecimal txbse3Hc) {
        this.txbse3Hc = txbse3Hc;
    }

    public BigDecimal getTxbse4Hc() {
        return txbse4Hc;
    }

    public void setTxbse4Hc(BigDecimal txbse4Hc) {
        this.txbse4Hc = txbse4Hc;
    }

    public BigDecimal getTxbse5Hc() {
        return txbse5Hc;
    }

    public void setTxbse5Hc(BigDecimal txbse5Hc) {
        this.txbse5Hc = txbse5Hc;
    }

    public BigDecimal getTxamt1Hc() {
        return txamt1Hc;
    }

    public void setTxamt1Hc(BigDecimal txamt1Hc) {
        this.txamt1Hc = txamt1Hc;
    }

    public BigDecimal getTxamt2Hc() {
        return txamt2Hc;
    }

    public void setTxamt2Hc(BigDecimal txamt2Hc) {
        this.txamt2Hc = txamt2Hc;
    }

    public BigDecimal getTxamt3Hc() {
        return txamt3Hc;
    }

    public void setTxamt3Hc(BigDecimal txamt3Hc) {
        this.txamt3Hc = txamt3Hc;
    }

    public BigDecimal getTxamt4Hc() {
        return txamt4Hc;
    }

    public void setTxamt4Hc(BigDecimal txamt4Hc) {
        this.txamt4Hc = txamt4Hc;
    }

    public BigDecimal getTxamt5Hc() {
        return txamt5Hc;
    }

    public void setTxamt5Hc(BigDecimal txamt5Hc) {
        this.txamt5Hc = txamt5Hc;
    }

    public BigDecimal getAmtgroshc() {
        return amtgroshc;
    }

    public void setAmtgroshc(BigDecimal amtgroshc) {
        this.amtgroshc = amtgroshc;
    }

    public BigDecimal getRtgamthc() {
        return rtgamthc;
    }

    public void setRtgamthc(BigDecimal rtgamthc) {
        this.rtgamthc = rtgamthc;
    }

    public BigDecimal getAmtdischc() {
        return amtdischc;
    }

    public void setAmtdischc(BigDecimal amtdischc) {
        this.amtdischc = amtdischc;
    }

    public BigDecimal getAmt1099Hc() {
        return amt1099Hc;
    }

    public void setAmt1099Hc(BigDecimal amt1099Hc) {
        this.amt1099Hc = amt1099Hc;
    }

    public BigDecimal getAmtppdhc() {
        return amtppdhc;
    }

    public void setAmtppdhc(BigDecimal amtppdhc) {
        this.amtppdhc = amtppdhc;
    }

    public BigDecimal getAmtduetc() {
        return amtduetc;
    }

    public void setAmtduetc(BigDecimal amtduetc) {
        this.amtduetc = amtduetc;
    }

    public BigDecimal getAmtduehc() {
        return amtduehc;
    }

    public void setAmtduehc(BigDecimal amtduehc) {
        this.amtduehc = amtduehc;
    }

    public String getTextven() {
        return textven;
    }

    public void setTextven(String textven) {
        this.textven = textven;
    }

    public String getEnteredby() {
        return enteredby;
    }

    public void setEnteredby(String enteredby) {
        this.enteredby = enteredby;
    }

    public int getDatebus() {
        return datebus;
    }

    public void setDatebus(int datebus) {
        this.datebus = datebus;
    }

    public String getIdn() {
        return idn;
    }

    public void setIdn(String idn) {
        this.idn = idn;
    }

    public BigDecimal getAmtwht1Tc() {
        return amtwht1Tc;
    }

    public void setAmtwht1Tc(BigDecimal amtwht1Tc) {
        this.amtwht1Tc = amtwht1Tc;
    }

    public BigDecimal getAmtwht2Tc() {
        return amtwht2Tc;
    }

    public void setAmtwht2Tc(BigDecimal amtwht2Tc) {
        this.amtwht2Tc = amtwht2Tc;
    }

    public BigDecimal getAmtwht3Tc() {
        return amtwht3Tc;
    }

    public void setAmtwht3Tc(BigDecimal amtwht3Tc) {
        this.amtwht3Tc = amtwht3Tc;
    }

    public BigDecimal getAmtwht4Tc() {
        return amtwht4Tc;
    }

    public void setAmtwht4Tc(BigDecimal amtwht4Tc) {
        this.amtwht4Tc = amtwht4Tc;
    }

    public BigDecimal getAmtwht5Tc() {
        return amtwht5Tc;
    }

    public void setAmtwht5Tc(BigDecimal amtwht5Tc) {
        this.amtwht5Tc = amtwht5Tc;
    }

    public BigDecimal getAmtcxbs1Tc() {
        return amtcxbs1Tc;
    }

    public void setAmtcxbs1Tc(BigDecimal amtcxbs1Tc) {
        this.amtcxbs1Tc = amtcxbs1Tc;
    }

    public BigDecimal getAmtcxbs2Tc() {
        return amtcxbs2Tc;
    }

    public void setAmtcxbs2Tc(BigDecimal amtcxbs2Tc) {
        this.amtcxbs2Tc = amtcxbs2Tc;
    }

    public BigDecimal getAmtcxbs3Tc() {
        return amtcxbs3Tc;
    }

    public void setAmtcxbs3Tc(BigDecimal amtcxbs3Tc) {
        this.amtcxbs3Tc = amtcxbs3Tc;
    }

    public BigDecimal getAmtcxbs4Tc() {
        return amtcxbs4Tc;
    }

    public void setAmtcxbs4Tc(BigDecimal amtcxbs4Tc) {
        this.amtcxbs4Tc = amtcxbs4Tc;
    }

    public BigDecimal getAmtcxbs5Tc() {
        return amtcxbs5Tc;
    }

    public void setAmtcxbs5Tc(BigDecimal amtcxbs5Tc) {
        this.amtcxbs5Tc = amtcxbs5Tc;
    }

    public BigDecimal getAmtcxtx1Tc() {
        return amtcxtx1Tc;
    }

    public void setAmtcxtx1Tc(BigDecimal amtcxtx1Tc) {
        this.amtcxtx1Tc = amtcxtx1Tc;
    }

    public BigDecimal getAmtcxtx2Tc() {
        return amtcxtx2Tc;
    }

    public void setAmtcxtx2Tc(BigDecimal amtcxtx2Tc) {
        this.amtcxtx2Tc = amtcxtx2Tc;
    }

    public BigDecimal getAmtcxtx3Tc() {
        return amtcxtx3Tc;
    }

    public void setAmtcxtx3Tc(BigDecimal amtcxtx3Tc) {
        this.amtcxtx3Tc = amtcxtx3Tc;
    }

    public BigDecimal getAmtcxtx4Tc() {
        return amtcxtx4Tc;
    }

    public void setAmtcxtx4Tc(BigDecimal amtcxtx4Tc) {
        this.amtcxtx4Tc = amtcxtx4Tc;
    }

    public BigDecimal getAmtcxtx5Tc() {
        return amtcxtx5Tc;
    }

    public void setAmtcxtx5Tc(BigDecimal amtcxtx5Tc) {
        this.amtcxtx5Tc = amtcxtx5Tc;
    }

}
