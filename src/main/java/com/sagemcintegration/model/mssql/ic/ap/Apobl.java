package com.sagemcintegration.model.mssql.ic.ap;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@IdClass(ApoblPK.class)
public class Apobl {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDVEND", nullable = false, length = 12)
    private String idvend;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDINVC", nullable = false, length = 22)
    private String idinvc;
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
    @Column(name = "IDRMIT", nullable = false, length = 18)
    private String idrmit;
    @Basic
    @Column(name = "IDORDERNBR", nullable = false, length = 22)
    private String idordernbr;
    @Basic
    @Column(name = "IDPONBR", nullable = false, length = 22)
    private String idponbr;
    @Basic
    @Column(name = "DATEINVCDU", nullable = false, precision = 0)
    private int dateinvcdu;
    @Basic
    @Column(name = "IDRMITTO", nullable = false, length = 6)
    private String idrmitto;
    @Basic
    @Column(name = "IDTRXTYPE", nullable = false)
    private short idtrxtype;
    @Basic
    @Column(name = "TXTTRXTYPE", nullable = false)
    private short txttrxtype;
    @Basic
    @Column(name = "DATEBTCH", nullable = false, precision = 0)
    private int datebtch;
    @Basic
    @Column(name = "CNTBTCH", nullable = false, precision = 0)
    private int cntbtch;
    @Basic
    @Column(name = "CNTITEM", nullable = false, precision = 0)
    private int cntitem;
    @Basic
    @Column(name = "IDVENDGRP", nullable = false, length = 6)
    private String idvendgrp;
    @Basic
    @Column(name = "DESCINVC", nullable = false, length = 60)
    private String descinvc;
    @Basic
    @Column(name = "DATEINVC", nullable = false, precision = 0)
    private int dateinvc;
    @Basic
    @Column(name = "DATEASOF", nullable = false, precision = 0)
    private int dateasof;
    @Basic
    @Column(name = "CODETERM", nullable = false, length = 6)
    private String codeterm;
    @Basic
    @Column(name = "DATEDISC", nullable = false, precision = 0)
    private int datedisc;
    @Basic
    @Column(name = "CODECURN", nullable = false, length = 3)
    private String codecurn;
    @Basic
    @Column(name = "IDRATETYPE", nullable = false, length = 2)
    private String idratetype;
    @Basic
    @Column(name = "SWRATEOVRD", nullable = false)
    private short swrateovrd;
    @Basic
    @Column(name = "EXCHRATEHC", nullable = false, precision = 7)
    private BigDecimal exchratehc;
    @Basic
    @Column(name = "AMTINVCHC", nullable = false, precision = 3)
    private BigDecimal amtinvchc;
    @Basic
    @Column(name = "AMTDUEHC", nullable = false, precision = 3)
    private BigDecimal amtduehc;
    @Basic
    @Column(name = "AMTTXBLHC", nullable = false, precision = 3)
    private BigDecimal amttxblhc;
    @Basic
    @Column(name = "AMTNONTXHC", nullable = false, precision = 3)
    private BigDecimal amtnontxhc;
    @Basic
    @Column(name = "AMTTAXHC", nullable = false, precision = 3)
    private BigDecimal amttaxhc;
    @Basic
    @Column(name = "AMTDISCHC", nullable = false, precision = 3)
    private BigDecimal amtdischc;
    @Basic
    @Column(name = "AMTINVCTC", nullable = false, precision = 3)
    private BigDecimal amtinvctc;
    @Basic
    @Column(name = "AMTDUETC", nullable = false, precision = 3)
    private BigDecimal amtduetc;
    @Basic
    @Column(name = "AMTTXBLTC", nullable = false, precision = 3)
    private BigDecimal amttxbltc;
    @Basic
    @Column(name = "AMTNONTXTC", nullable = false, precision = 3)
    private BigDecimal amtnontxtc;
    @Basic
    @Column(name = "AMTTAXTC", nullable = false, precision = 3)
    private BigDecimal amttaxtc;
    @Basic
    @Column(name = "AMTDISCTC", nullable = false, precision = 3)
    private BigDecimal amtdisctc;
    @Basic
    @Column(name = "SWPAID", nullable = false)
    private short swpaid;
    @Basic
    @Column(name = "DATELSTACT", nullable = false, precision = 0)
    private int datelstact;
    @Basic
    @Column(name = "DATELSTSTM", nullable = false, precision = 0)
    private int datelststm;
    @Basic
    @Column(name = "CNTTOTPAYM", nullable = false, precision = 0)
    private int cnttotpaym;
    @Basic
    @Column(name = "CNTLSTPAYM", nullable = false, precision = 0)
    private int cntlstpaym;
    @Basic
    @Column(name = "CNTLSTPYST", nullable = false, precision = 0)
    private int cntlstpyst;
    @Basic
    @Column(name = "AMTREMIT", nullable = false, precision = 3)
    private BigDecimal amtremit;
    @Basic
    @Column(name = "CNTLASTSCH", nullable = false, precision = 0)
    private int cntlastsch;
    @Basic
    @Column(name = "SWTAXOVRD", nullable = false)
    private short swtaxovrd;
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
    @Column(name = "AMTBASE1HC", nullable = false, precision = 3)
    private BigDecimal amtbase1Hc;
    @Basic
    @Column(name = "AMTBASE2HC", nullable = false, precision = 3)
    private BigDecimal amtbase2Hc;
    @Basic
    @Column(name = "AMTBASE3HC", nullable = false, precision = 3)
    private BigDecimal amtbase3Hc;
    @Basic
    @Column(name = "AMTBASE4HC", nullable = false, precision = 3)
    private BigDecimal amtbase4Hc;
    @Basic
    @Column(name = "AMTBASE5HC", nullable = false, precision = 3)
    private BigDecimal amtbase5Hc;
    @Basic
    @Column(name = "AMTTAX1HC", nullable = false, precision = 3)
    private BigDecimal amttax1Hc;
    @Basic
    @Column(name = "AMTTAX2HC", nullable = false, precision = 3)
    private BigDecimal amttax2Hc;
    @Basic
    @Column(name = "AMTTAX3HC", nullable = false, precision = 3)
    private BigDecimal amttax3Hc;
    @Basic
    @Column(name = "AMTTAX4HC", nullable = false, precision = 3)
    private BigDecimal amttax4Hc;
    @Basic
    @Column(name = "AMTTAX5HC", nullable = false, precision = 3)
    private BigDecimal amttax5Hc;
    @Basic
    @Column(name = "AMTBASE1TC", nullable = false, precision = 3)
    private BigDecimal amtbase1Tc;
    @Basic
    @Column(name = "AMTBASE2TC", nullable = false, precision = 3)
    private BigDecimal amtbase2Tc;
    @Basic
    @Column(name = "AMTBASE3TC", nullable = false, precision = 3)
    private BigDecimal amtbase3Tc;
    @Basic
    @Column(name = "AMTBASE4TC", nullable = false, precision = 3)
    private BigDecimal amtbase4Tc;
    @Basic
    @Column(name = "AMTBASE5TC", nullable = false, precision = 3)
    private BigDecimal amtbase5Tc;
    @Basic
    @Column(name = "AMTTAX1TC", nullable = false, precision = 3)
    private BigDecimal amttax1Tc;
    @Basic
    @Column(name = "AMTTAX2TC", nullable = false, precision = 3)
    private BigDecimal amttax2Tc;
    @Basic
    @Column(name = "AMTTAX3TC", nullable = false, precision = 3)
    private BigDecimal amttax3Tc;
    @Basic
    @Column(name = "AMTTAX4TC", nullable = false, precision = 3)
    private BigDecimal amttax4Tc;
    @Basic
    @Column(name = "AMTTAX5TC", nullable = false, precision = 3)
    private BigDecimal amttax5Tc;
    @Basic
    @Column(name = "FISCYR", nullable = false, length = 4)
    private String fiscyr;
    @Basic
    @Column(name = "FISCPER", nullable = false, length = 2)
    private String fiscper;
    @Basic
    @Column(name = "IDPREPAY", nullable = false, length = 22)
    private String idprepay;
    @Basic
    @Column(name = "DATEBUS", nullable = false, precision = 0)
    private int datebus;
    @Basic
    @Column(name = "ID1099CLAS", nullable = false, length = 6)
    private String id1099Clas;
    @Basic
    @Column(name = "AMT1099ORG", nullable = false, precision = 3)
    private BigDecimal amt1099Org;
    @Basic
    @Column(name = "AMT1099REM", nullable = false, precision = 3)
    private BigDecimal amt1099Rem;
    @Basic
    @Column(name = "RATEDATE", nullable = false, precision = 0)
    private int ratedate;
    @Basic
    @Column(name = "RATEOP", nullable = false)
    private short rateop;
    @Basic
    @Column(name = "YPLASTACT", nullable = false, length = 6)
    private String yplastact;
    @Basic
    @Column(name = "IDBANK", nullable = false, length = 8)
    private String idbank;
    @Basic
    @Column(name = "LONGSERIAL", nullable = false)
    private long longserial;
    @Basic
    @Column(name = "POSTSEQNCE", nullable = false, precision = 0)
    private int postseqnce;
    @Basic
    @Column(name = "SWJOB", nullable = false)
    private short swjob;
    @Basic
    @Column(name = "SWRTG", nullable = false)
    private short swrtg;
    @Basic
    @Column(name = "SWRTGOUT", nullable = false)
    private short swrtgout;
    @Basic
    @Column(name = "RTGDATEDUE", nullable = false, precision = 0)
    private int rtgdatedue;
    @Basic
    @Column(name = "RTGOAMTHC", nullable = false, precision = 3)
    private BigDecimal rtgoamthc;
    @Basic
    @Column(name = "RTGAMTHC", nullable = false, precision = 3)
    private BigDecimal rtgamthc;
    @Basic
    @Column(name = "RTGOAMTTC", nullable = false, precision = 3)
    private BigDecimal rtgoamttc;
    @Basic
    @Column(name = "RTGAMTTC", nullable = false, precision = 3)
    private BigDecimal rtgamttc;
    @Basic
    @Column(name = "RTGTERMS", nullable = false, length = 6)
    private String rtgterms;
    @Basic
    @Column(name = "SWRTGRATE", nullable = false)
    private short swrtgrate;
    @Basic
    @Column(name = "RTGAPPLYTO", nullable = false, length = 22)
    private String rtgapplyto;
    @Basic
    @Column(name = "`VALUES`", nullable = false)
    private int values;
    @Basic
    @Column(name = "SRCEAPPL", nullable = false, length = 2)
    private String srceappl;
    @Basic
    @Column(name = "SWPYSTTS", nullable = false)
    private short swpystts;
    @Basic
    @Column(name = "DATEPYSTTS", nullable = false, precision = 0)
    private int datepystts;
    @Basic
    @Column(name = "APVERSION", nullable = false, length = 3)
    private String apversion;
    @Basic
    @Column(name = "TYPEBTCH", nullable = false, length = 2)
    private String typebtch;
    @Basic
    @Column(name = "CNTOBLJ", nullable = false)
    private int cntoblj;
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
    @Column(name = "SWRATERC", nullable = false)
    private short swraterc;
    @Basic
    @Column(name = "SWTXRTGRPT", nullable = false)
    private short swtxrtgrpt;
    @Basic
    @Column(name = "CODETAXGRP", nullable = false, length = 12)
    private String codetaxgrp;
    @Basic
    @Column(name = "TAXVERSION", nullable = false)
    private int taxversion;
    @Basic
    @Column(name = "SWTXBSECTL", nullable = false)
    private short swtxbsectl;
    @Basic
    @Column(name = "SWTXCTLRC", nullable = false)
    private short swtxctlrc;
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
    @Column(name = "DATEFRSTBK", nullable = false, precision = 0)
    private int datefrstbk;
    @Basic
    @Column(name = "DATELSTRVL", nullable = false, precision = 0)
    private int datelstrvl;
    @Basic
    @Column(name = "ORATE", nullable = false, precision = 7)
    private BigDecimal orate;
    @Basic
    @Column(name = "ORATETYPE", nullable = false, length = 2)
    private String oratetype;
    @Basic
    @Column(name = "ORATEDATE", nullable = false, precision = 0)
    private int oratedate;
    @Basic
    @Column(name = "ORATEOP", nullable = false)
    private short orateop;
    @Basic
    @Column(name = "OSWRATE", nullable = false)
    private short oswrate;
    @Basic
    @Column(name = "IDACCTSET", nullable = false, length = 6)
    private String idacctset;
    @Basic
    @Column(name = "DATEPAID", nullable = false, precision = 0)
    private int datepaid;
    @Basic
    @Column(name = "SWNONRCVBL", nullable = false)
    private short swnonrcvbl;
    @Basic
    @Column(name = "OAMTWHT1TC", nullable = false, precision = 3)
    private BigDecimal oamtwht1Tc;
    @Basic
    @Column(name = "OAMTWHT2TC", nullable = false, precision = 3)
    private BigDecimal oamtwht2Tc;
    @Basic
    @Column(name = "OAMTWHT3TC", nullable = false, precision = 3)
    private BigDecimal oamtwht3Tc;
    @Basic
    @Column(name = "OAMTWHT4TC", nullable = false, precision = 3)
    private BigDecimal oamtwht4Tc;
    @Basic
    @Column(name = "OAMTWHT5TC", nullable = false, precision = 3)
    private BigDecimal oamtwht5Tc;

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

    public String getIdrmit() {
        return idrmit;
    }

    public void setIdrmit(String idrmit) {
        this.idrmit = idrmit;
    }

    public String getIdordernbr() {
        return idordernbr;
    }

    public void setIdordernbr(String idordernbr) {
        this.idordernbr = idordernbr;
    }

    public String getIdponbr() {
        return idponbr;
    }

    public void setIdponbr(String idponbr) {
        this.idponbr = idponbr;
    }

    public int getDateinvcdu() {
        return dateinvcdu;
    }

    public void setDateinvcdu(int dateinvcdu) {
        this.dateinvcdu = dateinvcdu;
    }

    public String getIdrmitto() {
        return idrmitto;
    }

    public void setIdrmitto(String idrmitto) {
        this.idrmitto = idrmitto;
    }

    public short getIdtrxtype() {
        return idtrxtype;
    }

    public void setIdtrxtype(short idtrxtype) {
        this.idtrxtype = idtrxtype;
    }

    public short getTxttrxtype() {
        return txttrxtype;
    }

    public void setTxttrxtype(short txttrxtype) {
        this.txttrxtype = txttrxtype;
    }

    public int getDatebtch() {
        return datebtch;
    }

    public void setDatebtch(int datebtch) {
        this.datebtch = datebtch;
    }

    public int getCntbtch() {
        return cntbtch;
    }

    public void setCntbtch(int cntbtch) {
        this.cntbtch = cntbtch;
    }

    public int getCntitem() {
        return cntitem;
    }

    public void setCntitem(int cntitem) {
        this.cntitem = cntitem;
    }

    public String getIdvendgrp() {
        return idvendgrp;
    }

    public void setIdvendgrp(String idvendgrp) {
        this.idvendgrp = idvendgrp;
    }

    public String getDescinvc() {
        return descinvc;
    }

    public void setDescinvc(String descinvc) {
        this.descinvc = descinvc;
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

    public String getCodeterm() {
        return codeterm;
    }

    public void setCodeterm(String codeterm) {
        this.codeterm = codeterm;
    }

    public int getDatedisc() {
        return datedisc;
    }

    public void setDatedisc(int datedisc) {
        this.datedisc = datedisc;
    }

    public String getCodecurn() {
        return codecurn;
    }

    public void setCodecurn(String codecurn) {
        this.codecurn = codecurn;
    }

    public String getIdratetype() {
        return idratetype;
    }

    public void setIdratetype(String idratetype) {
        this.idratetype = idratetype;
    }

    public short getSwrateovrd() {
        return swrateovrd;
    }

    public void setSwrateovrd(short swrateovrd) {
        this.swrateovrd = swrateovrd;
    }

    public BigDecimal getExchratehc() {
        return exchratehc;
    }

    public void setExchratehc(BigDecimal exchratehc) {
        this.exchratehc = exchratehc;
    }

    public BigDecimal getAmtinvchc() {
        return amtinvchc;
    }

    public void setAmtinvchc(BigDecimal amtinvchc) {
        this.amtinvchc = amtinvchc;
    }

    public BigDecimal getAmtduehc() {
        return amtduehc;
    }

    public void setAmtduehc(BigDecimal amtduehc) {
        this.amtduehc = amtduehc;
    }

    public BigDecimal getAmttxblhc() {
        return amttxblhc;
    }

    public void setAmttxblhc(BigDecimal amttxblhc) {
        this.amttxblhc = amttxblhc;
    }

    public BigDecimal getAmtnontxhc() {
        return amtnontxhc;
    }

    public void setAmtnontxhc(BigDecimal amtnontxhc) {
        this.amtnontxhc = amtnontxhc;
    }

    public BigDecimal getAmttaxhc() {
        return amttaxhc;
    }

    public void setAmttaxhc(BigDecimal amttaxhc) {
        this.amttaxhc = amttaxhc;
    }

    public BigDecimal getAmtdischc() {
        return amtdischc;
    }

    public void setAmtdischc(BigDecimal amtdischc) {
        this.amtdischc = amtdischc;
    }

    public BigDecimal getAmtinvctc() {
        return amtinvctc;
    }

    public void setAmtinvctc(BigDecimal amtinvctc) {
        this.amtinvctc = amtinvctc;
    }

    public BigDecimal getAmtduetc() {
        return amtduetc;
    }

    public void setAmtduetc(BigDecimal amtduetc) {
        this.amtduetc = amtduetc;
    }

    public BigDecimal getAmttxbltc() {
        return amttxbltc;
    }

    public void setAmttxbltc(BigDecimal amttxbltc) {
        this.amttxbltc = amttxbltc;
    }

    public BigDecimal getAmtnontxtc() {
        return amtnontxtc;
    }

    public void setAmtnontxtc(BigDecimal amtnontxtc) {
        this.amtnontxtc = amtnontxtc;
    }

    public BigDecimal getAmttaxtc() {
        return amttaxtc;
    }

    public void setAmttaxtc(BigDecimal amttaxtc) {
        this.amttaxtc = amttaxtc;
    }

    public BigDecimal getAmtdisctc() {
        return amtdisctc;
    }

    public void setAmtdisctc(BigDecimal amtdisctc) {
        this.amtdisctc = amtdisctc;
    }

    public short getSwpaid() {
        return swpaid;
    }

    public void setSwpaid(short swpaid) {
        this.swpaid = swpaid;
    }

    public int getDatelstact() {
        return datelstact;
    }

    public void setDatelstact(int datelstact) {
        this.datelstact = datelstact;
    }

    public int getDatelststm() {
        return datelststm;
    }

    public void setDatelststm(int datelststm) {
        this.datelststm = datelststm;
    }

    public int getCnttotpaym() {
        return cnttotpaym;
    }

    public void setCnttotpaym(int cnttotpaym) {
        this.cnttotpaym = cnttotpaym;
    }

    public int getCntlstpaym() {
        return cntlstpaym;
    }

    public void setCntlstpaym(int cntlstpaym) {
        this.cntlstpaym = cntlstpaym;
    }

    public int getCntlstpyst() {
        return cntlstpyst;
    }

    public void setCntlstpyst(int cntlstpyst) {
        this.cntlstpyst = cntlstpyst;
    }

    public BigDecimal getAmtremit() {
        return amtremit;
    }

    public void setAmtremit(BigDecimal amtremit) {
        this.amtremit = amtremit;
    }

    public int getCntlastsch() {
        return cntlastsch;
    }

    public void setCntlastsch(int cntlastsch) {
        this.cntlastsch = cntlastsch;
    }

    public short getSwtaxovrd() {
        return swtaxovrd;
    }

    public void setSwtaxovrd(short swtaxovrd) {
        this.swtaxovrd = swtaxovrd;
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

    public BigDecimal getAmtbase1Hc() {
        return amtbase1Hc;
    }

    public void setAmtbase1Hc(BigDecimal amtbase1Hc) {
        this.amtbase1Hc = amtbase1Hc;
    }

    public BigDecimal getAmtbase2Hc() {
        return amtbase2Hc;
    }

    public void setAmtbase2Hc(BigDecimal amtbase2Hc) {
        this.amtbase2Hc = amtbase2Hc;
    }

    public BigDecimal getAmtbase3Hc() {
        return amtbase3Hc;
    }

    public void setAmtbase3Hc(BigDecimal amtbase3Hc) {
        this.amtbase3Hc = amtbase3Hc;
    }

    public BigDecimal getAmtbase4Hc() {
        return amtbase4Hc;
    }

    public void setAmtbase4Hc(BigDecimal amtbase4Hc) {
        this.amtbase4Hc = amtbase4Hc;
    }

    public BigDecimal getAmtbase5Hc() {
        return amtbase5Hc;
    }

    public void setAmtbase5Hc(BigDecimal amtbase5Hc) {
        this.amtbase5Hc = amtbase5Hc;
    }

    public BigDecimal getAmttax1Hc() {
        return amttax1Hc;
    }

    public void setAmttax1Hc(BigDecimal amttax1Hc) {
        this.amttax1Hc = amttax1Hc;
    }

    public BigDecimal getAmttax2Hc() {
        return amttax2Hc;
    }

    public void setAmttax2Hc(BigDecimal amttax2Hc) {
        this.amttax2Hc = amttax2Hc;
    }

    public BigDecimal getAmttax3Hc() {
        return amttax3Hc;
    }

    public void setAmttax3Hc(BigDecimal amttax3Hc) {
        this.amttax3Hc = amttax3Hc;
    }

    public BigDecimal getAmttax4Hc() {
        return amttax4Hc;
    }

    public void setAmttax4Hc(BigDecimal amttax4Hc) {
        this.amttax4Hc = amttax4Hc;
    }

    public BigDecimal getAmttax5Hc() {
        return amttax5Hc;
    }

    public void setAmttax5Hc(BigDecimal amttax5Hc) {
        this.amttax5Hc = amttax5Hc;
    }

    public BigDecimal getAmtbase1Tc() {
        return amtbase1Tc;
    }

    public void setAmtbase1Tc(BigDecimal amtbase1Tc) {
        this.amtbase1Tc = amtbase1Tc;
    }

    public BigDecimal getAmtbase2Tc() {
        return amtbase2Tc;
    }

    public void setAmtbase2Tc(BigDecimal amtbase2Tc) {
        this.amtbase2Tc = amtbase2Tc;
    }

    public BigDecimal getAmtbase3Tc() {
        return amtbase3Tc;
    }

    public void setAmtbase3Tc(BigDecimal amtbase3Tc) {
        this.amtbase3Tc = amtbase3Tc;
    }

    public BigDecimal getAmtbase4Tc() {
        return amtbase4Tc;
    }

    public void setAmtbase4Tc(BigDecimal amtbase4Tc) {
        this.amtbase4Tc = amtbase4Tc;
    }

    public BigDecimal getAmtbase5Tc() {
        return amtbase5Tc;
    }

    public void setAmtbase5Tc(BigDecimal amtbase5Tc) {
        this.amtbase5Tc = amtbase5Tc;
    }

    public BigDecimal getAmttax1Tc() {
        return amttax1Tc;
    }

    public void setAmttax1Tc(BigDecimal amttax1Tc) {
        this.amttax1Tc = amttax1Tc;
    }

    public BigDecimal getAmttax2Tc() {
        return amttax2Tc;
    }

    public void setAmttax2Tc(BigDecimal amttax2Tc) {
        this.amttax2Tc = amttax2Tc;
    }

    public BigDecimal getAmttax3Tc() {
        return amttax3Tc;
    }

    public void setAmttax3Tc(BigDecimal amttax3Tc) {
        this.amttax3Tc = amttax3Tc;
    }

    public BigDecimal getAmttax4Tc() {
        return amttax4Tc;
    }

    public void setAmttax4Tc(BigDecimal amttax4Tc) {
        this.amttax4Tc = amttax4Tc;
    }

    public BigDecimal getAmttax5Tc() {
        return amttax5Tc;
    }

    public void setAmttax5Tc(BigDecimal amttax5Tc) {
        this.amttax5Tc = amttax5Tc;
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

    public String getIdprepay() {
        return idprepay;
    }

    public void setIdprepay(String idprepay) {
        this.idprepay = idprepay;
    }

    public int getDatebus() {
        return datebus;
    }

    public void setDatebus(int datebus) {
        this.datebus = datebus;
    }

    public String getId1099Clas() {
        return id1099Clas;
    }

    public void setId1099Clas(String id1099Clas) {
        this.id1099Clas = id1099Clas;
    }

    public BigDecimal getAmt1099Org() {
        return amt1099Org;
    }

    public void setAmt1099Org(BigDecimal amt1099Org) {
        this.amt1099Org = amt1099Org;
    }

    public BigDecimal getAmt1099Rem() {
        return amt1099Rem;
    }

    public void setAmt1099Rem(BigDecimal amt1099Rem) {
        this.amt1099Rem = amt1099Rem;
    }

    public int getRatedate() {
        return ratedate;
    }

    public void setRatedate(int ratedate) {
        this.ratedate = ratedate;
    }

    public short getRateop() {
        return rateop;
    }

    public void setRateop(short rateop) {
        this.rateop = rateop;
    }

    public String getYplastact() {
        return yplastact;
    }

    public void setYplastact(String yplastact) {
        this.yplastact = yplastact;
    }

    public String getIdbank() {
        return idbank;
    }

    public void setIdbank(String idbank) {
        this.idbank = idbank;
    }

    public long getLongserial() {
        return longserial;
    }

    public void setLongserial(long longserial) {
        this.longserial = longserial;
    }

    public int getPostseqnce() {
        return postseqnce;
    }

    public void setPostseqnce(int postseqnce) {
        this.postseqnce = postseqnce;
    }

    public short getSwjob() {
        return swjob;
    }

    public void setSwjob(short swjob) {
        this.swjob = swjob;
    }

    public short getSwrtg() {
        return swrtg;
    }

    public void setSwrtg(short swrtg) {
        this.swrtg = swrtg;
    }

    public short getSwrtgout() {
        return swrtgout;
    }

    public void setSwrtgout(short swrtgout) {
        this.swrtgout = swrtgout;
    }

    public int getRtgdatedue() {
        return rtgdatedue;
    }

    public void setRtgdatedue(int rtgdatedue) {
        this.rtgdatedue = rtgdatedue;
    }

    public BigDecimal getRtgoamthc() {
        return rtgoamthc;
    }

    public void setRtgoamthc(BigDecimal rtgoamthc) {
        this.rtgoamthc = rtgoamthc;
    }

    public BigDecimal getRtgamthc() {
        return rtgamthc;
    }

    public void setRtgamthc(BigDecimal rtgamthc) {
        this.rtgamthc = rtgamthc;
    }

    public BigDecimal getRtgoamttc() {
        return rtgoamttc;
    }

    public void setRtgoamttc(BigDecimal rtgoamttc) {
        this.rtgoamttc = rtgoamttc;
    }

    public BigDecimal getRtgamttc() {
        return rtgamttc;
    }

    public void setRtgamttc(BigDecimal rtgamttc) {
        this.rtgamttc = rtgamttc;
    }

    public String getRtgterms() {
        return rtgterms;
    }

    public void setRtgterms(String rtgterms) {
        this.rtgterms = rtgterms;
    }

    public short getSwrtgrate() {
        return swrtgrate;
    }

    public void setSwrtgrate(short swrtgrate) {
        this.swrtgrate = swrtgrate;
    }

    public String getRtgapplyto() {
        return rtgapplyto;
    }

    public void setRtgapplyto(String rtgapplyto) {
        this.rtgapplyto = rtgapplyto;
    }

    public int getValues() {
        return values;
    }

    public void setValues(int values) {
        this.values = values;
    }

    public String getSrceappl() {
        return srceappl;
    }

    public void setSrceappl(String srceappl) {
        this.srceappl = srceappl;
    }

    public short getSwpystts() {
        return swpystts;
    }

    public void setSwpystts(short swpystts) {
        this.swpystts = swpystts;
    }

    public int getDatepystts() {
        return datepystts;
    }

    public void setDatepystts(int datepystts) {
        this.datepystts = datepystts;
    }

    public String getApversion() {
        return apversion;
    }

    public void setApversion(String apversion) {
        this.apversion = apversion;
    }

    public String getTypebtch() {
        return typebtch;
    }

    public void setTypebtch(String typebtch) {
        this.typebtch = typebtch;
    }

    public int getCntoblj() {
        return cntoblj;
    }

    public void setCntoblj(int cntoblj) {
        this.cntoblj = cntoblj;
    }

    public String getCodecurnrc() {
        return codecurnrc;
    }

    public void setCodecurnrc(String codecurnrc) {
        this.codecurnrc = codecurnrc;
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

    public short getSwtxrtgrpt() {
        return swtxrtgrpt;
    }

    public void setSwtxrtgrpt(short swtxrtgrpt) {
        this.swtxrtgrpt = swtxrtgrpt;
    }

    public String getCodetaxgrp() {
        return codetaxgrp;
    }

    public void setCodetaxgrp(String codetaxgrp) {
        this.codetaxgrp = codetaxgrp;
    }

    public int getTaxversion() {
        return taxversion;
    }

    public void setTaxversion(int taxversion) {
        this.taxversion = taxversion;
    }

    public short getSwtxbsectl() {
        return swtxbsectl;
    }

    public void setSwtxbsectl(short swtxbsectl) {
        this.swtxbsectl = swtxbsectl;
    }

    public short getSwtxctlrc() {
        return swtxctlrc;
    }

    public void setSwtxctlrc(short swtxctlrc) {
        this.swtxctlrc = swtxctlrc;
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

    public int getDatefrstbk() {
        return datefrstbk;
    }

    public void setDatefrstbk(int datefrstbk) {
        this.datefrstbk = datefrstbk;
    }

    public int getDatelstrvl() {
        return datelstrvl;
    }

    public void setDatelstrvl(int datelstrvl) {
        this.datelstrvl = datelstrvl;
    }

    public BigDecimal getOrate() {
        return orate;
    }

    public void setOrate(BigDecimal orate) {
        this.orate = orate;
    }

    public String getOratetype() {
        return oratetype;
    }

    public void setOratetype(String oratetype) {
        this.oratetype = oratetype;
    }

    public int getOratedate() {
        return oratedate;
    }

    public void setOratedate(int oratedate) {
        this.oratedate = oratedate;
    }

    public short getOrateop() {
        return orateop;
    }

    public void setOrateop(short orateop) {
        this.orateop = orateop;
    }

    public short getOswrate() {
        return oswrate;
    }

    public void setOswrate(short oswrate) {
        this.oswrate = oswrate;
    }

    public String getIdacctset() {
        return idacctset;
    }

    public void setIdacctset(String idacctset) {
        this.idacctset = idacctset;
    }

    public int getDatepaid() {
        return datepaid;
    }

    public void setDatepaid(int datepaid) {
        this.datepaid = datepaid;
    }

    public short getSwnonrcvbl() {
        return swnonrcvbl;
    }

    public void setSwnonrcvbl(short swnonrcvbl) {
        this.swnonrcvbl = swnonrcvbl;
    }

    public BigDecimal getOamtwht1Tc() {
        return oamtwht1Tc;
    }

    public void setOamtwht1Tc(BigDecimal oamtwht1Tc) {
        this.oamtwht1Tc = oamtwht1Tc;
    }

    public BigDecimal getOamtwht2Tc() {
        return oamtwht2Tc;
    }

    public void setOamtwht2Tc(BigDecimal oamtwht2Tc) {
        this.oamtwht2Tc = oamtwht2Tc;
    }

    public BigDecimal getOamtwht3Tc() {
        return oamtwht3Tc;
    }

    public void setOamtwht3Tc(BigDecimal oamtwht3Tc) {
        this.oamtwht3Tc = oamtwht3Tc;
    }

    public BigDecimal getOamtwht4Tc() {
        return oamtwht4Tc;
    }

    public void setOamtwht4Tc(BigDecimal oamtwht4Tc) {
        this.oamtwht4Tc = oamtwht4Tc;
    }

    public BigDecimal getOamtwht5Tc() {
        return oamtwht5Tc;
    }

    public void setOamtwht5Tc(BigDecimal oamtwht5Tc) {
        this.oamtwht5Tc = oamtwht5Tc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apobl apobl = (Apobl) o;
        return audtdate == apobl.audtdate && audttime == apobl.audttime && dateinvcdu == apobl.dateinvcdu && idtrxtype == apobl.idtrxtype && txttrxtype == apobl.txttrxtype && datebtch == apobl.datebtch && cntbtch == apobl.cntbtch && cntitem == apobl.cntitem && dateinvc == apobl.dateinvc && dateasof == apobl.dateasof && datedisc == apobl.datedisc && swrateovrd == apobl.swrateovrd && swpaid == apobl.swpaid && datelstact == apobl.datelstact && datelststm == apobl.datelststm && cnttotpaym == apobl.cnttotpaym && cntlstpaym == apobl.cntlstpaym && cntlstpyst == apobl.cntlstpyst && cntlastsch == apobl.cntlastsch && swtaxovrd == apobl.swtaxovrd && datebus == apobl.datebus && ratedate == apobl.ratedate && rateop == apobl.rateop && longserial == apobl.longserial && postseqnce == apobl.postseqnce && swjob == apobl.swjob && swrtg == apobl.swrtg && swrtgout == apobl.swrtgout && rtgdatedue == apobl.rtgdatedue && swrtgrate == apobl.swrtgrate && values == apobl.values && swpystts == apobl.swpystts && datepystts == apobl.datepystts && cntoblj == apobl.cntoblj && ratedaterc == apobl.ratedaterc && rateoprc == apobl.rateoprc && swraterc == apobl.swraterc && swtxrtgrpt == apobl.swtxrtgrpt && taxversion == apobl.taxversion && swtxbsectl == apobl.swtxbsectl && swtxctlrc == apobl.swtxctlrc && taxclass1 == apobl.taxclass1 && taxclass2 == apobl.taxclass2 && taxclass3 == apobl.taxclass3 && taxclass4 == apobl.taxclass4 && taxclass5 == apobl.taxclass5 && swtaxincl1 == apobl.swtaxincl1 && swtaxincl2 == apobl.swtaxincl2 && swtaxincl3 == apobl.swtaxincl3 && swtaxincl4 == apobl.swtaxincl4 && swtaxincl5 == apobl.swtaxincl5 && datefrstbk == apobl.datefrstbk && datelstrvl == apobl.datelstrvl && oratedate == apobl.oratedate && orateop == apobl.orateop && oswrate == apobl.oswrate && datepaid == apobl.datepaid && swnonrcvbl == apobl.swnonrcvbl && Objects.equals(idvend, apobl.idvend) && Objects.equals(idinvc, apobl.idinvc) && Objects.equals(audtuser, apobl.audtuser) && Objects.equals(audtorg, apobl.audtorg) && Objects.equals(idrmit, apobl.idrmit) && Objects.equals(idordernbr, apobl.idordernbr) && Objects.equals(idponbr, apobl.idponbr) && Objects.equals(idrmitto, apobl.idrmitto) && Objects.equals(idvendgrp, apobl.idvendgrp) && Objects.equals(descinvc, apobl.descinvc) && Objects.equals(codeterm, apobl.codeterm) && Objects.equals(codecurn, apobl.codecurn) && Objects.equals(idratetype, apobl.idratetype) && Objects.equals(exchratehc, apobl.exchratehc) && Objects.equals(amtinvchc, apobl.amtinvchc) && Objects.equals(amtduehc, apobl.amtduehc) && Objects.equals(amttxblhc, apobl.amttxblhc) && Objects.equals(amtnontxhc, apobl.amtnontxhc) && Objects.equals(amttaxhc, apobl.amttaxhc) && Objects.equals(amtdischc, apobl.amtdischc) && Objects.equals(amtinvctc, apobl.amtinvctc) && Objects.equals(amtduetc, apobl.amtduetc) && Objects.equals(amttxbltc, apobl.amttxbltc) && Objects.equals(amtnontxtc, apobl.amtnontxtc) && Objects.equals(amttaxtc, apobl.amttaxtc) && Objects.equals(amtdisctc, apobl.amtdisctc) && Objects.equals(amtremit, apobl.amtremit) && Objects.equals(codetax1, apobl.codetax1) && Objects.equals(codetax2, apobl.codetax2) && Objects.equals(codetax3, apobl.codetax3) && Objects.equals(codetax4, apobl.codetax4) && Objects.equals(codetax5, apobl.codetax5) && Objects.equals(amtbase1Hc, apobl.amtbase1Hc) && Objects.equals(amtbase2Hc, apobl.amtbase2Hc) && Objects.equals(amtbase3Hc, apobl.amtbase3Hc) && Objects.equals(amtbase4Hc, apobl.amtbase4Hc) && Objects.equals(amtbase5Hc, apobl.amtbase5Hc) && Objects.equals(amttax1Hc, apobl.amttax1Hc) && Objects.equals(amttax2Hc, apobl.amttax2Hc) && Objects.equals(amttax3Hc, apobl.amttax3Hc) && Objects.equals(amttax4Hc, apobl.amttax4Hc) && Objects.equals(amttax5Hc, apobl.amttax5Hc) && Objects.equals(amtbase1Tc, apobl.amtbase1Tc) && Objects.equals(amtbase2Tc, apobl.amtbase2Tc) && Objects.equals(amtbase3Tc, apobl.amtbase3Tc) && Objects.equals(amtbase4Tc, apobl.amtbase4Tc) && Objects.equals(amtbase5Tc, apobl.amtbase5Tc) && Objects.equals(amttax1Tc, apobl.amttax1Tc) && Objects.equals(amttax2Tc, apobl.amttax2Tc) && Objects.equals(amttax3Tc, apobl.amttax3Tc) && Objects.equals(amttax4Tc, apobl.amttax4Tc) && Objects.equals(amttax5Tc, apobl.amttax5Tc) && Objects.equals(fiscyr, apobl.fiscyr) && Objects.equals(fiscper, apobl.fiscper) && Objects.equals(idprepay, apobl.idprepay) && Objects.equals(id1099Clas, apobl.id1099Clas) && Objects.equals(amt1099Org, apobl.amt1099Org) && Objects.equals(amt1099Rem, apobl.amt1099Rem) && Objects.equals(yplastact, apobl.yplastact) && Objects.equals(idbank, apobl.idbank) && Objects.equals(rtgoamthc, apobl.rtgoamthc) && Objects.equals(rtgamthc, apobl.rtgamthc) && Objects.equals(rtgoamttc, apobl.rtgoamttc) && Objects.equals(rtgamttc, apobl.rtgamttc) && Objects.equals(rtgterms, apobl.rtgterms) && Objects.equals(rtgapplyto, apobl.rtgapplyto) && Objects.equals(srceappl, apobl.srceappl) && Objects.equals(apversion, apobl.apversion) && Objects.equals(typebtch, apobl.typebtch) && Objects.equals(codecurnrc, apobl.codecurnrc) && Objects.equals(raterc, apobl.raterc) && Objects.equals(ratetyperc, apobl.ratetyperc) && Objects.equals(codetaxgrp, apobl.codetaxgrp) && Objects.equals(txbsert1Tc, apobl.txbsert1Tc) && Objects.equals(txbsert2Tc, apobl.txbsert2Tc) && Objects.equals(txbsert3Tc, apobl.txbsert3Tc) && Objects.equals(txbsert4Tc, apobl.txbsert4Tc) && Objects.equals(txbsert5Tc, apobl.txbsert5Tc) && Objects.equals(txamtrt1Tc, apobl.txamtrt1Tc) && Objects.equals(txamtrt2Tc, apobl.txamtrt2Tc) && Objects.equals(txamtrt3Tc, apobl.txamtrt3Tc) && Objects.equals(txamtrt4Tc, apobl.txamtrt4Tc) && Objects.equals(txamtrt5Tc, apobl.txamtrt5Tc) && Objects.equals(orate, apobl.orate) && Objects.equals(oratetype, apobl.oratetype) && Objects.equals(idacctset, apobl.idacctset) && Objects.equals(oamtwht1Tc, apobl.oamtwht1Tc) && Objects.equals(oamtwht2Tc, apobl.oamtwht2Tc) && Objects.equals(oamtwht3Tc, apobl.oamtwht3Tc) && Objects.equals(oamtwht4Tc, apobl.oamtwht4Tc) && Objects.equals(oamtwht5Tc, apobl.oamtwht5Tc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idvend, idinvc, audtdate, audttime, audtuser, audtorg, idrmit, idordernbr, idponbr, dateinvcdu, idrmitto, idtrxtype, txttrxtype, datebtch, cntbtch, cntitem, idvendgrp, descinvc, dateinvc, dateasof, codeterm, datedisc, codecurn, idratetype, swrateovrd, exchratehc, amtinvchc, amtduehc, amttxblhc, amtnontxhc, amttaxhc, amtdischc, amtinvctc, amtduetc, amttxbltc, amtnontxtc, amttaxtc, amtdisctc, swpaid, datelstact, datelststm, cnttotpaym, cntlstpaym, cntlstpyst, amtremit, cntlastsch, swtaxovrd, codetax1, codetax2, codetax3, codetax4, codetax5, amtbase1Hc, amtbase2Hc, amtbase3Hc, amtbase4Hc, amtbase5Hc, amttax1Hc, amttax2Hc, amttax3Hc, amttax4Hc, amttax5Hc, amtbase1Tc, amtbase2Tc, amtbase3Tc, amtbase4Tc, amtbase5Tc, amttax1Tc, amttax2Tc, amttax3Tc, amttax4Tc, amttax5Tc, fiscyr, fiscper, idprepay, datebus, id1099Clas, amt1099Org, amt1099Rem, ratedate, rateop, yplastact, idbank, longserial, postseqnce, swjob, swrtg, swrtgout, rtgdatedue, rtgoamthc, rtgamthc, rtgoamttc, rtgamttc, rtgterms, swrtgrate, rtgapplyto, values, srceappl, swpystts, datepystts, apversion, typebtch, cntoblj, codecurnrc, raterc, ratetyperc, ratedaterc, rateoprc, swraterc, swtxrtgrpt, codetaxgrp, taxversion, swtxbsectl, swtxctlrc, taxclass1, taxclass2, taxclass3, taxclass4, taxclass5, swtaxincl1, swtaxincl2, swtaxincl3, swtaxincl4, swtaxincl5, txbsert1Tc, txbsert2Tc, txbsert3Tc, txbsert4Tc, txbsert5Tc, txamtrt1Tc, txamtrt2Tc, txamtrt3Tc, txamtrt4Tc, txamtrt5Tc, datefrstbk, datelstrvl, orate, oratetype, oratedate, orateop, oswrate, idacctset, datepaid, swnonrcvbl, oamtwht1Tc, oamtwht2Tc, oamtwht3Tc, oamtwht4Tc, oamtwht5Tc);
    }
}
