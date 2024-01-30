package com.sagemcintegration.model.mssql.ic.ap;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Apven {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "VENDORID")
    private String vendorid;
    @Basic
    @Column(name = "AUDTDATE")
    private int audtdate;
    @Basic
    @Column(name = "AUDTTIME")
    private int audttime;
    @Basic
    @Column(name = "AUDTUSER")
    private String audtuser;
    @Basic
    @Column(name = "AUDTORG")
    private String audtorg;
    @Basic
    @Column(name = "SHORTNAME")
    private String shortname;
    @Basic
    @Column(name = "IDGRP")
    private String idgrp;
    @Basic
    @Column(name = "SWACTV")
    private short swactv;
    @Basic
    @Column(name = "DATEINAC")
    private int dateinac;
    @Basic
    @Column(name = "DATELASTMN")
    private int datelastmn;
    @Basic
    @Column(name = "SWHOLD")
    private short swhold;
    @Basic
    @Column(name = "DATESTART")
    private int datestart;
    @Basic
    @Column(name = "IDPPNT")
    private String idppnt;
    @Basic
    @Column(name = "VENDNAME")
    private String vendname;
    @Basic
    @Column(name = "TEXTSTRE1")
    private String textstre1;
    @Basic
    @Column(name = "TEXTSTRE2")
    private String textstre2;
    @Basic
    @Column(name = "TEXTSTRE3")
    private String textstre3;
    @Basic
    @Column(name = "TEXTSTRE4")
    private String textstre4;
    @Basic
    @Column(name = "NAMECITY")
    private String namecity;
    @Basic
    @Column(name = "CODESTTE")
    private String codestte;
    @Basic
    @Column(name = "CODEPSTL")
    private String codepstl;
    @Basic
    @Column(name = "CODECTRY")
    private String codectry;
    @Basic
    @Column(name = "NAMECTAC")
    private String namectac;
    @Basic
    @Column(name = "TEXTPHON1")
    private String textphon1;
    @Basic
    @Column(name = "TEXTPHON2")
    private String textphon2;
    @Basic
    @Column(name = "PRIMRMIT")
    private String primrmit;
    @Basic
    @Column(name = "IDACCTSET")
    private String idacctset;
    @Basic
    @Column(name = "CURNCODE")
    private String curncode;
    @Basic
    @Column(name = "RATETYPE")
    private String ratetype;
    @Basic
    @Column(name = "BANKID")
    private String bankid;
    @Basic
    @Column(name = "PRTSEPCHKS")
    private short prtsepchks;
    @Basic
    @Column(name = "DISTSETID")
    private String distsetid;
    @Basic
    @Column(name = "DISTCODE")
    private String distcode;
    @Basic
    @Column(name = "GLACCNT")
    private String glaccnt;
    @Basic
    @Column(name = "TERMSCODE")
    private String termscode;
    @Basic
    @Column(name = "DUPINVCCD")
    private short dupinvccd;
    @Basic
    @Column(name = "DUPAMTCODE")
    private short dupamtcode;
    @Basic
    @Column(name = "DUPDATECD")
    private short dupdatecd;
    @Basic
    @Column(name = "CODETAXGRP")
    private String codetaxgrp;
    @Basic
    @Column(name = "TAXCLASS1")
    private short taxclass1;
    @Basic
    @Column(name = "TAXCLASS2")
    private short taxclass2;
    @Basic
    @Column(name = "TAXCLASS3")
    private short taxclass3;
    @Basic
    @Column(name = "TAXCLASS4")
    private short taxclass4;
    @Basic
    @Column(name = "TAXCLASS5")
    private short taxclass5;
    @Basic
    @Column(name = "TAXRPTSW")
    private short taxrptsw;
    @Basic
    @Column(name = "SUBJTOWTHH")
    private short subjtowthh;
    @Basic
    @Column(name = "TAXNBR")
    private String taxnbr;
    @Basic
    @Column(name = "TAXIDTYPE")
    private short taxidtype;
    @Basic
    @Column(name = "TAXNOTE2SW")
    private short taxnote2Sw;
    @Basic
    @Column(name = "CLASID")
    private String clasid;
    @Basic
    @Column(name = "AMTCRLIMT")
    private BigDecimal amtcrlimt;
    @Basic
    @Column(name = "AMTBALDUET")
    private BigDecimal amtbalduet;
    @Basic
    @Column(name = "AMTBALDUEH")
    private BigDecimal amtbaldueh;
    @Basic
    @Column(name = "AMTPPDINVT")
    private BigDecimal amtppdinvt;
    @Basic
    @Column(name = "AMTPPDINVH")
    private BigDecimal amtppdinvh;
    @Basic
    @Column(name = "DTLASTRVAL")
    private int dtlastrval;
    @Basic
    @Column(name = "AMTBALLARV")
    private BigDecimal amtballarv;
    @Basic
    @Column(name = "CNTOPENINV")
    private int cntopeninv;
    @Basic
    @Column(name = "CNTPPDINVC")
    private int cntppdinvc;
    @Basic
    @Column(name = "CNTINVPAID")
    private int cntinvpaid;
    @Basic
    @Column(name = "DAYSTOPAY")
    private int daystopay;
    @Basic
    @Column(name = "DATEINVCHI")
    private int dateinvchi;
    @Basic
    @Column(name = "DATEBALHI")
    private int datebalhi;
    @Basic
    @Column(name = "DATEINVHIL")
    private int dateinvhil;
    @Basic
    @Column(name = "DATEBALHIL")
    private int datebalhil;
    @Basic
    @Column(name = "DATELASTAC")
    private int datelastac;
    @Basic
    @Column(name = "DATELASTIV")
    private int datelastiv;
    @Basic
    @Column(name = "DATELASTCR")
    private int datelastcr;
    @Basic
    @Column(name = "DATELASTDR")
    private int datelastdr;
    @Basic
    @Column(name = "DATELASTPA")
    private int datelastpa;
    @Basic
    @Column(name = "DATELASTDI")
    private int datelastdi;
    @Basic
    @Column(name = "DATELSTADJ")
    private int datelstadj;
    @Basic
    @Column(name = "IDINVCHI")
    private String idinvchi;
    @Basic
    @Column(name = "IDINVCHILY")
    private String idinvchily;
    @Basic
    @Column(name = "AMTINVHIT")
    private BigDecimal amtinvhit;
    @Basic
    @Column(name = "AMTBALHIT")
    private BigDecimal amtbalhit;
    @Basic
    @Column(name = "AMTWTHTCUR")
    private BigDecimal amtwthtcur;
    @Basic
    @Column(name = "AMTINVHILT")
    private BigDecimal amtinvhilt;
    @Basic
    @Column(name = "AMTBALHILT")
    private BigDecimal amtbalhilt;
    @Basic
    @Column(name = "AMTWTHLYTC")
    private BigDecimal amtwthlytc;
    @Basic
    @Column(name = "AMTLASTIVT")
    private BigDecimal amtlastivt;
    @Basic
    @Column(name = "AMTLASTCRT")
    private BigDecimal amtlastcrt;
    @Basic
    @Column(name = "AMTLASTDRT")
    private BigDecimal amtlastdrt;
    @Basic
    @Column(name = "AMTLASTPYT")
    private BigDecimal amtlastpyt;
    @Basic
    @Column(name = "AMTLASTDIT")
    private BigDecimal amtlastdit;
    @Basic
    @Column(name = "AMTLASTADT")
    private BigDecimal amtlastadt;
    @Basic
    @Column(name = "AMTINVHIH")
    private BigDecimal amtinvhih;
    @Basic
    @Column(name = "AMTBALHIH")
    private BigDecimal amtbalhih;
    @Basic
    @Column(name = "AMTWTHHCUR")
    private BigDecimal amtwthhcur;
    @Basic
    @Column(name = "AMTINVHILH")
    private BigDecimal amtinvhilh;
    @Basic
    @Column(name = "AMTBALHILH")
    private BigDecimal amtbalhilh;
    @Basic
    @Column(name = "AMTWTHLYHC")
    private BigDecimal amtwthlyhc;
    @Basic
    @Column(name = "AMTLASTIVH")
    private BigDecimal amtlastivh;
    @Basic
    @Column(name = "AMTLASTCRH")
    private BigDecimal amtlastcrh;
    @Basic
    @Column(name = "AMTLASTDRH")
    private BigDecimal amtlastdrh;
    @Basic
    @Column(name = "AMTLASTPYH")
    private BigDecimal amtlastpyh;
    @Basic
    @Column(name = "AMTLASTDIH")
    private BigDecimal amtlastdih;
    @Basic
    @Column(name = "AMTLASTADH")
    private BigDecimal amtlastadh;
    @Basic
    @Column(name = "PAYMCODE")
    private String paymcode;
    @Basic
    @Column(name = "IDTAXREGI1")
    private String idtaxregi1;
    @Basic
    @Column(name = "IDTAXREGI2")
    private String idtaxregi2;
    @Basic
    @Column(name = "IDTAXREGI3")
    private String idtaxregi3;
    @Basic
    @Column(name = "IDTAXREGI4")
    private String idtaxregi4;
    @Basic
    @Column(name = "IDTAXREGI5")
    private String idtaxregi5;
    @Basic
    @Column(name = "SWDISTBY")
    private short swdistby;
    @Basic
    @Column(name = "CODECHECK")
    private String codecheck;
    @Basic
    @Column(name = "AVGDAYSPAY")
    private BigDecimal avgdayspay;
    @Basic
    @Column(name = "AVGPAYMENT")
    private BigDecimal avgpayment;
    @Basic
    @Column(name = "AMTINVPDHC")
    private BigDecimal amtinvpdhc;
    @Basic
    @Column(name = "AMTINVPDTC")
    private BigDecimal amtinvpdtc;
    @Basic
    @Column(name = "CNTNBRCHKS")
    private int cntnbrchks;
    @Basic
    @Column(name = "SWTXINC1")
    private short swtxinc1;
    @Basic
    @Column(name = "SWTXINC2")
    private short swtxinc2;
    @Basic
    @Column(name = "SWTXINC3")
    private short swtxinc3;
    @Basic
    @Column(name = "SWTXINC4")
    private short swtxinc4;
    @Basic
    @Column(name = "SWTXINC5")
    private short swtxinc5;
    @Basic
    @Column(name = "EMAIL1")
    private String email1;
    @Basic
    @Column(name = "EMAIL2")
    private String email2;
    @Basic
    @Column(name = "WEBSITE")
    private String website;
    @Basic
    @Column(name = "CTACPHONE")
    private String ctacphone;
    @Basic
    @Column(name = "CTACFAX")
    private String ctacfax;
    @Basic
    @Column(name = "DELMETHOD")
    private short delmethod;
    @Basic
    @Column(name = "RTGPERCENT")
    private BigDecimal rtgpercent;
    @Basic
    @Column(name = "RTGDAYS")
    private short rtgdays;
    @Basic
    @Column(name = "RTGTERMS")
    private String rtgterms;
    @Basic
    @Column(name = "RTGAMTTC")
    private BigDecimal rtgamttc;
    @Basic
    @Column(name = "RTGAMTHC")
    private BigDecimal rtgamthc;
    @Basic
    @Column(name = "`VALUES`")
    private int values;
    @Basic
    @Column(name = "NEXTCUID")
    private int nextcuid;
    @Basic
    @Column(name = "LEGALNAME")
    private String legalname;
    @Basic
    @Column(name = "CHK1099AMT")
    private short chk1099Amt;
    @Basic
    @Column(name = "IDCUST")
    private String idcust;
    @Basic
    @Column(name = "BRN")
    private String brn;

    public String getVendorid() {
        return vendorid;
    }

    public void setVendorid(String vendorid) {
        this.vendorid = vendorid;
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

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getIdgrp() {
        return idgrp;
    }

    public void setIdgrp(String idgrp) {
        this.idgrp = idgrp;
    }

    public short getSwactv() {
        return swactv;
    }

    public void setSwactv(short swactv) {
        this.swactv = swactv;
    }

    public int getDateinac() {
        return dateinac;
    }

    public void setDateinac(int dateinac) {
        this.dateinac = dateinac;
    }

    public int getDatelastmn() {
        return datelastmn;
    }

    public void setDatelastmn(int datelastmn) {
        this.datelastmn = datelastmn;
    }

    public short getSwhold() {
        return swhold;
    }

    public void setSwhold(short swhold) {
        this.swhold = swhold;
    }

    public int getDatestart() {
        return datestart;
    }

    public void setDatestart(int datestart) {
        this.datestart = datestart;
    }

    public String getIdppnt() {
        return idppnt;
    }

    public void setIdppnt(String idppnt) {
        this.idppnt = idppnt;
    }

    public String getVendname() {
        return vendname;
    }

    public void setVendname(String vendname) {
        this.vendname = vendname;
    }

    public String getTextstre1() {
        return textstre1;
    }

    public void setTextstre1(String textstre1) {
        this.textstre1 = textstre1;
    }

    public String getTextstre2() {
        return textstre2;
    }

    public void setTextstre2(String textstre2) {
        this.textstre2 = textstre2;
    }

    public String getTextstre3() {
        return textstre3;
    }

    public void setTextstre3(String textstre3) {
        this.textstre3 = textstre3;
    }

    public String getTextstre4() {
        return textstre4;
    }

    public void setTextstre4(String textstre4) {
        this.textstre4 = textstre4;
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

    public String getTextphon1() {
        return textphon1;
    }

    public void setTextphon1(String textphon1) {
        this.textphon1 = textphon1;
    }

    public String getTextphon2() {
        return textphon2;
    }

    public void setTextphon2(String textphon2) {
        this.textphon2 = textphon2;
    }

    public String getPrimrmit() {
        return primrmit;
    }

    public void setPrimrmit(String primrmit) {
        this.primrmit = primrmit;
    }

    public String getIdacctset() {
        return idacctset;
    }

    public void setIdacctset(String idacctset) {
        this.idacctset = idacctset;
    }

    public String getCurncode() {
        return curncode;
    }

    public void setCurncode(String curncode) {
        this.curncode = curncode;
    }

    public String getRatetype() {
        return ratetype;
    }

    public void setRatetype(String ratetype) {
        this.ratetype = ratetype;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    public short getPrtsepchks() {
        return prtsepchks;
    }

    public void setPrtsepchks(short prtsepchks) {
        this.prtsepchks = prtsepchks;
    }

    public String getDistsetid() {
        return distsetid;
    }

    public void setDistsetid(String distsetid) {
        this.distsetid = distsetid;
    }

    public String getDistcode() {
        return distcode;
    }

    public void setDistcode(String distcode) {
        this.distcode = distcode;
    }

    public String getGlaccnt() {
        return glaccnt;
    }

    public void setGlaccnt(String glaccnt) {
        this.glaccnt = glaccnt;
    }

    public String getTermscode() {
        return termscode;
    }

    public void setTermscode(String termscode) {
        this.termscode = termscode;
    }

    public short getDupinvccd() {
        return dupinvccd;
    }

    public void setDupinvccd(short dupinvccd) {
        this.dupinvccd = dupinvccd;
    }

    public short getDupamtcode() {
        return dupamtcode;
    }

    public void setDupamtcode(short dupamtcode) {
        this.dupamtcode = dupamtcode;
    }

    public short getDupdatecd() {
        return dupdatecd;
    }

    public void setDupdatecd(short dupdatecd) {
        this.dupdatecd = dupdatecd;
    }

    public String getCodetaxgrp() {
        return codetaxgrp;
    }

    public void setCodetaxgrp(String codetaxgrp) {
        this.codetaxgrp = codetaxgrp;
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

    public short getTaxrptsw() {
        return taxrptsw;
    }

    public void setTaxrptsw(short taxrptsw) {
        this.taxrptsw = taxrptsw;
    }

    public short getSubjtowthh() {
        return subjtowthh;
    }

    public void setSubjtowthh(short subjtowthh) {
        this.subjtowthh = subjtowthh;
    }

    public String getTaxnbr() {
        return taxnbr;
    }

    public void setTaxnbr(String taxnbr) {
        this.taxnbr = taxnbr;
    }

    public short getTaxidtype() {
        return taxidtype;
    }

    public void setTaxidtype(short taxidtype) {
        this.taxidtype = taxidtype;
    }

    public short getTaxnote2Sw() {
        return taxnote2Sw;
    }

    public void setTaxnote2Sw(short taxnote2Sw) {
        this.taxnote2Sw = taxnote2Sw;
    }

    public String getClasid() {
        return clasid;
    }

    public void setClasid(String clasid) {
        this.clasid = clasid;
    }

    public BigDecimal getAmtcrlimt() {
        return amtcrlimt;
    }

    public void setAmtcrlimt(BigDecimal amtcrlimt) {
        this.amtcrlimt = amtcrlimt;
    }

    public BigDecimal getAmtbalduet() {
        return amtbalduet;
    }

    public void setAmtbalduet(BigDecimal amtbalduet) {
        this.amtbalduet = amtbalduet;
    }

    public BigDecimal getAmtbaldueh() {
        return amtbaldueh;
    }

    public void setAmtbaldueh(BigDecimal amtbaldueh) {
        this.amtbaldueh = amtbaldueh;
    }

    public BigDecimal getAmtppdinvt() {
        return amtppdinvt;
    }

    public void setAmtppdinvt(BigDecimal amtppdinvt) {
        this.amtppdinvt = amtppdinvt;
    }

    public BigDecimal getAmtppdinvh() {
        return amtppdinvh;
    }

    public void setAmtppdinvh(BigDecimal amtppdinvh) {
        this.amtppdinvh = amtppdinvh;
    }

    public int getDtlastrval() {
        return dtlastrval;
    }

    public void setDtlastrval(int dtlastrval) {
        this.dtlastrval = dtlastrval;
    }

    public BigDecimal getAmtballarv() {
        return amtballarv;
    }

    public void setAmtballarv(BigDecimal amtballarv) {
        this.amtballarv = amtballarv;
    }

    public int getCntopeninv() {
        return cntopeninv;
    }

    public void setCntopeninv(int cntopeninv) {
        this.cntopeninv = cntopeninv;
    }

    public int getCntppdinvc() {
        return cntppdinvc;
    }

    public void setCntppdinvc(int cntppdinvc) {
        this.cntppdinvc = cntppdinvc;
    }

    public int getCntinvpaid() {
        return cntinvpaid;
    }

    public void setCntinvpaid(int cntinvpaid) {
        this.cntinvpaid = cntinvpaid;
    }

    public int getDaystopay() {
        return daystopay;
    }

    public void setDaystopay(int daystopay) {
        this.daystopay = daystopay;
    }

    public int getDateinvchi() {
        return dateinvchi;
    }

    public void setDateinvchi(int dateinvchi) {
        this.dateinvchi = dateinvchi;
    }

    public int getDatebalhi() {
        return datebalhi;
    }

    public void setDatebalhi(int datebalhi) {
        this.datebalhi = datebalhi;
    }

    public int getDateinvhil() {
        return dateinvhil;
    }

    public void setDateinvhil(int dateinvhil) {
        this.dateinvhil = dateinvhil;
    }

    public int getDatebalhil() {
        return datebalhil;
    }

    public void setDatebalhil(int datebalhil) {
        this.datebalhil = datebalhil;
    }

    public int getDatelastac() {
        return datelastac;
    }

    public void setDatelastac(int datelastac) {
        this.datelastac = datelastac;
    }

    public int getDatelastiv() {
        return datelastiv;
    }

    public void setDatelastiv(int datelastiv) {
        this.datelastiv = datelastiv;
    }

    public int getDatelastcr() {
        return datelastcr;
    }

    public void setDatelastcr(int datelastcr) {
        this.datelastcr = datelastcr;
    }

    public int getDatelastdr() {
        return datelastdr;
    }

    public void setDatelastdr(int datelastdr) {
        this.datelastdr = datelastdr;
    }

    public int getDatelastpa() {
        return datelastpa;
    }

    public void setDatelastpa(int datelastpa) {
        this.datelastpa = datelastpa;
    }

    public int getDatelastdi() {
        return datelastdi;
    }

    public void setDatelastdi(int datelastdi) {
        this.datelastdi = datelastdi;
    }

    public int getDatelstadj() {
        return datelstadj;
    }

    public void setDatelstadj(int datelstadj) {
        this.datelstadj = datelstadj;
    }

    public String getIdinvchi() {
        return idinvchi;
    }

    public void setIdinvchi(String idinvchi) {
        this.idinvchi = idinvchi;
    }

    public String getIdinvchily() {
        return idinvchily;
    }

    public void setIdinvchily(String idinvchily) {
        this.idinvchily = idinvchily;
    }

    public BigDecimal getAmtinvhit() {
        return amtinvhit;
    }

    public void setAmtinvhit(BigDecimal amtinvhit) {
        this.amtinvhit = amtinvhit;
    }

    public BigDecimal getAmtbalhit() {
        return amtbalhit;
    }

    public void setAmtbalhit(BigDecimal amtbalhit) {
        this.amtbalhit = amtbalhit;
    }

    public BigDecimal getAmtwthtcur() {
        return amtwthtcur;
    }

    public void setAmtwthtcur(BigDecimal amtwthtcur) {
        this.amtwthtcur = amtwthtcur;
    }

    public BigDecimal getAmtinvhilt() {
        return amtinvhilt;
    }

    public void setAmtinvhilt(BigDecimal amtinvhilt) {
        this.amtinvhilt = amtinvhilt;
    }

    public BigDecimal getAmtbalhilt() {
        return amtbalhilt;
    }

    public void setAmtbalhilt(BigDecimal amtbalhilt) {
        this.amtbalhilt = amtbalhilt;
    }

    public BigDecimal getAmtwthlytc() {
        return amtwthlytc;
    }

    public void setAmtwthlytc(BigDecimal amtwthlytc) {
        this.amtwthlytc = amtwthlytc;
    }

    public BigDecimal getAmtlastivt() {
        return amtlastivt;
    }

    public void setAmtlastivt(BigDecimal amtlastivt) {
        this.amtlastivt = amtlastivt;
    }

    public BigDecimal getAmtlastcrt() {
        return amtlastcrt;
    }

    public void setAmtlastcrt(BigDecimal amtlastcrt) {
        this.amtlastcrt = amtlastcrt;
    }

    public BigDecimal getAmtlastdrt() {
        return amtlastdrt;
    }

    public void setAmtlastdrt(BigDecimal amtlastdrt) {
        this.amtlastdrt = amtlastdrt;
    }

    public BigDecimal getAmtlastpyt() {
        return amtlastpyt;
    }

    public void setAmtlastpyt(BigDecimal amtlastpyt) {
        this.amtlastpyt = amtlastpyt;
    }

    public BigDecimal getAmtlastdit() {
        return amtlastdit;
    }

    public void setAmtlastdit(BigDecimal amtlastdit) {
        this.amtlastdit = amtlastdit;
    }

    public BigDecimal getAmtlastadt() {
        return amtlastadt;
    }

    public void setAmtlastadt(BigDecimal amtlastadt) {
        this.amtlastadt = amtlastadt;
    }

    public BigDecimal getAmtinvhih() {
        return amtinvhih;
    }

    public void setAmtinvhih(BigDecimal amtinvhih) {
        this.amtinvhih = amtinvhih;
    }

    public BigDecimal getAmtbalhih() {
        return amtbalhih;
    }

    public void setAmtbalhih(BigDecimal amtbalhih) {
        this.amtbalhih = amtbalhih;
    }

    public BigDecimal getAmtwthhcur() {
        return amtwthhcur;
    }

    public void setAmtwthhcur(BigDecimal amtwthhcur) {
        this.amtwthhcur = amtwthhcur;
    }

    public BigDecimal getAmtinvhilh() {
        return amtinvhilh;
    }

    public void setAmtinvhilh(BigDecimal amtinvhilh) {
        this.amtinvhilh = amtinvhilh;
    }

    public BigDecimal getAmtbalhilh() {
        return amtbalhilh;
    }

    public void setAmtbalhilh(BigDecimal amtbalhilh) {
        this.amtbalhilh = amtbalhilh;
    }

    public BigDecimal getAmtwthlyhc() {
        return amtwthlyhc;
    }

    public void setAmtwthlyhc(BigDecimal amtwthlyhc) {
        this.amtwthlyhc = amtwthlyhc;
    }

    public BigDecimal getAmtlastivh() {
        return amtlastivh;
    }

    public void setAmtlastivh(BigDecimal amtlastivh) {
        this.amtlastivh = amtlastivh;
    }

    public BigDecimal getAmtlastcrh() {
        return amtlastcrh;
    }

    public void setAmtlastcrh(BigDecimal amtlastcrh) {
        this.amtlastcrh = amtlastcrh;
    }

    public BigDecimal getAmtlastdrh() {
        return amtlastdrh;
    }

    public void setAmtlastdrh(BigDecimal amtlastdrh) {
        this.amtlastdrh = amtlastdrh;
    }

    public BigDecimal getAmtlastpyh() {
        return amtlastpyh;
    }

    public void setAmtlastpyh(BigDecimal amtlastpyh) {
        this.amtlastpyh = amtlastpyh;
    }

    public BigDecimal getAmtlastdih() {
        return amtlastdih;
    }

    public void setAmtlastdih(BigDecimal amtlastdih) {
        this.amtlastdih = amtlastdih;
    }

    public BigDecimal getAmtlastadh() {
        return amtlastadh;
    }

    public void setAmtlastadh(BigDecimal amtlastadh) {
        this.amtlastadh = amtlastadh;
    }

    public String getPaymcode() {
        return paymcode;
    }

    public void setPaymcode(String paymcode) {
        this.paymcode = paymcode;
    }

    public String getIdtaxregi1() {
        return idtaxregi1;
    }

    public void setIdtaxregi1(String idtaxregi1) {
        this.idtaxregi1 = idtaxregi1;
    }

    public String getIdtaxregi2() {
        return idtaxregi2;
    }

    public void setIdtaxregi2(String idtaxregi2) {
        this.idtaxregi2 = idtaxregi2;
    }

    public String getIdtaxregi3() {
        return idtaxregi3;
    }

    public void setIdtaxregi3(String idtaxregi3) {
        this.idtaxregi3 = idtaxregi3;
    }

    public String getIdtaxregi4() {
        return idtaxregi4;
    }

    public void setIdtaxregi4(String idtaxregi4) {
        this.idtaxregi4 = idtaxregi4;
    }

    public String getIdtaxregi5() {
        return idtaxregi5;
    }

    public void setIdtaxregi5(String idtaxregi5) {
        this.idtaxregi5 = idtaxregi5;
    }

    public short getSwdistby() {
        return swdistby;
    }

    public void setSwdistby(short swdistby) {
        this.swdistby = swdistby;
    }

    public String getCodecheck() {
        return codecheck;
    }

    public void setCodecheck(String codecheck) {
        this.codecheck = codecheck;
    }

    public BigDecimal getAvgdayspay() {
        return avgdayspay;
    }

    public void setAvgdayspay(BigDecimal avgdayspay) {
        this.avgdayspay = avgdayspay;
    }

    public BigDecimal getAvgpayment() {
        return avgpayment;
    }

    public void setAvgpayment(BigDecimal avgpayment) {
        this.avgpayment = avgpayment;
    }

    public BigDecimal getAmtinvpdhc() {
        return amtinvpdhc;
    }

    public void setAmtinvpdhc(BigDecimal amtinvpdhc) {
        this.amtinvpdhc = amtinvpdhc;
    }

    public BigDecimal getAmtinvpdtc() {
        return amtinvpdtc;
    }

    public void setAmtinvpdtc(BigDecimal amtinvpdtc) {
        this.amtinvpdtc = amtinvpdtc;
    }

    public int getCntnbrchks() {
        return cntnbrchks;
    }

    public void setCntnbrchks(int cntnbrchks) {
        this.cntnbrchks = cntnbrchks;
    }

    public short getSwtxinc1() {
        return swtxinc1;
    }

    public void setSwtxinc1(short swtxinc1) {
        this.swtxinc1 = swtxinc1;
    }

    public short getSwtxinc2() {
        return swtxinc2;
    }

    public void setSwtxinc2(short swtxinc2) {
        this.swtxinc2 = swtxinc2;
    }

    public short getSwtxinc3() {
        return swtxinc3;
    }

    public void setSwtxinc3(short swtxinc3) {
        this.swtxinc3 = swtxinc3;
    }

    public short getSwtxinc4() {
        return swtxinc4;
    }

    public void setSwtxinc4(short swtxinc4) {
        this.swtxinc4 = swtxinc4;
    }

    public short getSwtxinc5() {
        return swtxinc5;
    }

    public void setSwtxinc5(short swtxinc5) {
        this.swtxinc5 = swtxinc5;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
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

    public short getDelmethod() {
        return delmethod;
    }

    public void setDelmethod(short delmethod) {
        this.delmethod = delmethod;
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

    public String getRtgterms() {
        return rtgterms;
    }

    public void setRtgterms(String rtgterms) {
        this.rtgterms = rtgterms;
    }

    public BigDecimal getRtgamttc() {
        return rtgamttc;
    }

    public void setRtgamttc(BigDecimal rtgamttc) {
        this.rtgamttc = rtgamttc;
    }

    public BigDecimal getRtgamthc() {
        return rtgamthc;
    }

    public void setRtgamthc(BigDecimal rtgamthc) {
        this.rtgamthc = rtgamthc;
    }

    public int getValues() {
        return values;
    }

    public void setValues(int values) {
        this.values = values;
    }

    public int getNextcuid() {
        return nextcuid;
    }

    public void setNextcuid(int nextcuid) {
        this.nextcuid = nextcuid;
    }

    public String getLegalname() {
        return legalname;
    }

    public void setLegalname(String legalname) {
        this.legalname = legalname;
    }

    public short getChk1099Amt() {
        return chk1099Amt;
    }

    public void setChk1099Amt(short chk1099Amt) {
        this.chk1099Amt = chk1099Amt;
    }

    public String getIdcust() {
        return idcust;
    }

    public void setIdcust(String idcust) {
        this.idcust = idcust;
    }

    public String getBrn() {
        return brn;
    }

    public void setBrn(String brn) {
        this.brn = brn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apven apven = (Apven) o;
        return audtdate == apven.audtdate && audttime == apven.audttime && swactv == apven.swactv && dateinac == apven.dateinac && datelastmn == apven.datelastmn && swhold == apven.swhold && datestart == apven.datestart && prtsepchks == apven.prtsepchks && dupinvccd == apven.dupinvccd && dupamtcode == apven.dupamtcode && dupdatecd == apven.dupdatecd && taxclass1 == apven.taxclass1 && taxclass2 == apven.taxclass2 && taxclass3 == apven.taxclass3 && taxclass4 == apven.taxclass4 && taxclass5 == apven.taxclass5 && taxrptsw == apven.taxrptsw && subjtowthh == apven.subjtowthh && taxidtype == apven.taxidtype && taxnote2Sw == apven.taxnote2Sw && dtlastrval == apven.dtlastrval && cntopeninv == apven.cntopeninv && cntppdinvc == apven.cntppdinvc && cntinvpaid == apven.cntinvpaid && daystopay == apven.daystopay && dateinvchi == apven.dateinvchi && datebalhi == apven.datebalhi && dateinvhil == apven.dateinvhil && datebalhil == apven.datebalhil && datelastac == apven.datelastac && datelastiv == apven.datelastiv && datelastcr == apven.datelastcr && datelastdr == apven.datelastdr && datelastpa == apven.datelastpa && datelastdi == apven.datelastdi && datelstadj == apven.datelstadj && swdistby == apven.swdistby && cntnbrchks == apven.cntnbrchks && swtxinc1 == apven.swtxinc1 && swtxinc2 == apven.swtxinc2 && swtxinc3 == apven.swtxinc3 && swtxinc4 == apven.swtxinc4 && swtxinc5 == apven.swtxinc5 && delmethod == apven.delmethod && rtgdays == apven.rtgdays && values == apven.values && nextcuid == apven.nextcuid && chk1099Amt == apven.chk1099Amt && Objects.equals(vendorid, apven.vendorid) && Objects.equals(audtuser, apven.audtuser) && Objects.equals(audtorg, apven.audtorg) && Objects.equals(shortname, apven.shortname) && Objects.equals(idgrp, apven.idgrp) && Objects.equals(idppnt, apven.idppnt) && Objects.equals(vendname, apven.vendname) && Objects.equals(textstre1, apven.textstre1) && Objects.equals(textstre2, apven.textstre2) && Objects.equals(textstre3, apven.textstre3) && Objects.equals(textstre4, apven.textstre4) && Objects.equals(namecity, apven.namecity) && Objects.equals(codestte, apven.codestte) && Objects.equals(codepstl, apven.codepstl) && Objects.equals(codectry, apven.codectry) && Objects.equals(namectac, apven.namectac) && Objects.equals(textphon1, apven.textphon1) && Objects.equals(textphon2, apven.textphon2) && Objects.equals(primrmit, apven.primrmit) && Objects.equals(idacctset, apven.idacctset) && Objects.equals(curncode, apven.curncode) && Objects.equals(ratetype, apven.ratetype) && Objects.equals(bankid, apven.bankid) && Objects.equals(distsetid, apven.distsetid) && Objects.equals(distcode, apven.distcode) && Objects.equals(glaccnt, apven.glaccnt) && Objects.equals(termscode, apven.termscode) && Objects.equals(codetaxgrp, apven.codetaxgrp) && Objects.equals(taxnbr, apven.taxnbr) && Objects.equals(clasid, apven.clasid) && Objects.equals(amtcrlimt, apven.amtcrlimt) && Objects.equals(amtbalduet, apven.amtbalduet) && Objects.equals(amtbaldueh, apven.amtbaldueh) && Objects.equals(amtppdinvt, apven.amtppdinvt) && Objects.equals(amtppdinvh, apven.amtppdinvh) && Objects.equals(amtballarv, apven.amtballarv) && Objects.equals(idinvchi, apven.idinvchi) && Objects.equals(idinvchily, apven.idinvchily) && Objects.equals(amtinvhit, apven.amtinvhit) && Objects.equals(amtbalhit, apven.amtbalhit) && Objects.equals(amtwthtcur, apven.amtwthtcur) && Objects.equals(amtinvhilt, apven.amtinvhilt) && Objects.equals(amtbalhilt, apven.amtbalhilt) && Objects.equals(amtwthlytc, apven.amtwthlytc) && Objects.equals(amtlastivt, apven.amtlastivt) && Objects.equals(amtlastcrt, apven.amtlastcrt) && Objects.equals(amtlastdrt, apven.amtlastdrt) && Objects.equals(amtlastpyt, apven.amtlastpyt) && Objects.equals(amtlastdit, apven.amtlastdit) && Objects.equals(amtlastadt, apven.amtlastadt) && Objects.equals(amtinvhih, apven.amtinvhih) && Objects.equals(amtbalhih, apven.amtbalhih) && Objects.equals(amtwthhcur, apven.amtwthhcur) && Objects.equals(amtinvhilh, apven.amtinvhilh) && Objects.equals(amtbalhilh, apven.amtbalhilh) && Objects.equals(amtwthlyhc, apven.amtwthlyhc) && Objects.equals(amtlastivh, apven.amtlastivh) && Objects.equals(amtlastcrh, apven.amtlastcrh) && Objects.equals(amtlastdrh, apven.amtlastdrh) && Objects.equals(amtlastpyh, apven.amtlastpyh) && Objects.equals(amtlastdih, apven.amtlastdih) && Objects.equals(amtlastadh, apven.amtlastadh) && Objects.equals(paymcode, apven.paymcode) && Objects.equals(idtaxregi1, apven.idtaxregi1) && Objects.equals(idtaxregi2, apven.idtaxregi2) && Objects.equals(idtaxregi3, apven.idtaxregi3) && Objects.equals(idtaxregi4, apven.idtaxregi4) && Objects.equals(idtaxregi5, apven.idtaxregi5) && Objects.equals(codecheck, apven.codecheck) && Objects.equals(avgdayspay, apven.avgdayspay) && Objects.equals(avgpayment, apven.avgpayment) && Objects.equals(amtinvpdhc, apven.amtinvpdhc) && Objects.equals(amtinvpdtc, apven.amtinvpdtc) && Objects.equals(email1, apven.email1) && Objects.equals(email2, apven.email2) && Objects.equals(website, apven.website) && Objects.equals(ctacphone, apven.ctacphone) && Objects.equals(ctacfax, apven.ctacfax) && Objects.equals(rtgpercent, apven.rtgpercent) && Objects.equals(rtgterms, apven.rtgterms) && Objects.equals(rtgamttc, apven.rtgamttc) && Objects.equals(rtgamthc, apven.rtgamthc) && Objects.equals(legalname, apven.legalname) && Objects.equals(idcust, apven.idcust) && Objects.equals(brn, apven.brn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorid, audtdate, audttime, audtuser, audtorg, shortname, idgrp, swactv, dateinac, datelastmn, swhold, datestart, idppnt, vendname, textstre1, textstre2, textstre3, textstre4, namecity, codestte, codepstl, codectry, namectac, textphon1, textphon2, primrmit, idacctset, curncode, ratetype, bankid, prtsepchks, distsetid, distcode, glaccnt, termscode, dupinvccd, dupamtcode, dupdatecd, codetaxgrp, taxclass1, taxclass2, taxclass3, taxclass4, taxclass5, taxrptsw, subjtowthh, taxnbr, taxidtype, taxnote2Sw, clasid, amtcrlimt, amtbalduet, amtbaldueh, amtppdinvt, amtppdinvh, dtlastrval, amtballarv, cntopeninv, cntppdinvc, cntinvpaid, daystopay, dateinvchi, datebalhi, dateinvhil, datebalhil, datelastac, datelastiv, datelastcr, datelastdr, datelastpa, datelastdi, datelstadj, idinvchi, idinvchily, amtinvhit, amtbalhit, amtwthtcur, amtinvhilt, amtbalhilt, amtwthlytc, amtlastivt, amtlastcrt, amtlastdrt, amtlastpyt, amtlastdit, amtlastadt, amtinvhih, amtbalhih, amtwthhcur, amtinvhilh, amtbalhilh, amtwthlyhc, amtlastivh, amtlastcrh, amtlastdrh, amtlastpyh, amtlastdih, amtlastadh, paymcode, idtaxregi1, idtaxregi2, idtaxregi3, idtaxregi4, idtaxregi5, swdistby, codecheck, avgdayspay, avgpayment, amtinvpdhc, amtinvpdtc, cntnbrchks, swtxinc1, swtxinc2, swtxinc3, swtxinc4, swtxinc5, email1, email2, website, ctacphone, ctacfax, delmethod, rtgpercent, rtgdays, rtgterms, rtgamttc, rtgamthc, values, nextcuid, legalname, chk1099Amt, idcust, brn);
    }
}
