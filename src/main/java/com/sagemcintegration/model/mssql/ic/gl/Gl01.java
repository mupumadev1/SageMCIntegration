package com.sagemcintegration.model.mssql.ic.gl;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Gl01 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "OPTIONID", nullable = false, length = 4)
    private String optionid;
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
    @Column(name = "PHONENBR", nullable = false, length = 30)
    private String phonenbr;
    @Basic
    @Column(name = "FAX", nullable = false, length = 30)
    private String fax;
    @Basic
    @Column(name = "COMPANYID", nullable = false, length = 6)
    private String companyid;
    @Basic
    @Column(name = "CONTACT", nullable = false, length = 60)
    private String contact;
    @Basic
    @Column(name = "CLOSESEG", nullable = false, length = 6)
    private String closeseg;
    @Basic
    @Column(name = "ACCTSEG", nullable = false, length = 6)
    private String acctseg;
    @Basic
    @Column(name = "ABRKDFLT", nullable = false, length = 6)
    private String abrkdflt;
    @Basic
    @Column(name = "ABRKDELM", nullable = false, length = 1)
    private String abrkdelm;
    @Basic
    @Column(name = "SWBTCHEDIT", nullable = false)
    private short swbtchedit;
    @Basic
    @Column(name = "SWPROVPST", nullable = false)
    private short swprovpst;
    @Basic
    @Column(name = "SWPRTPBTCH", nullable = false)
    private short swprtpbtch;
    @Basic
    @Column(name = "CODELOCK1", nullable = false)
    private short codelock1;
    @Basic
    @Column(name = "CODELOCK2", nullable = false)
    private short codelock2;
    @Basic
    @Column(name = "CODELOCK3", nullable = false)
    private short codelock3;
    @Basic
    @Column(name = "CODELOCK4", nullable = false)
    private short codelock4;
    @Basic
    @Column(name = "CODELOCK5", nullable = false)
    private short codelock5;
    @Basic
    @Column(name = "LOCKFILL", nullable = false, length = 8)
    private String lockfill;
    @Basic
    @Column(name = "SWQTY", nullable = false)
    private short swqty;
    @Basic
    @Column(name = "QTYDEC", nullable = false, precision = 0)
    private int qtydec;
    @Basic
    @Column(name = "YRSHIST", nullable = false, precision = 0)
    private int yrshist;
    @Basic
    @Column(name = "YRACCTDEL", nullable = false, precision = 0)
    private int yracctdel;
    @Basic
    @Column(name = "NEXTBTCHNO", nullable = false, precision = 0)
    private int nextbtchno;
    @Basic
    @Column(name = "PSTSQ", nullable = false, precision = 0)
    private int pstsq;
    @Basic
    @Column(name = "PROVPSTSQ", nullable = false, precision = 0)
    private int provpstsq;
    @Basic
    @Column(name = "PJRNLPRGTO", nullable = false, precision = 0)
    private int pjrnlprgto;
    @Basic
    @Column(name = "BTCHPSTTO", nullable = false, precision = 0)
    private int btchpstto;
    @Basic
    @Column(name = "JRNLPRGTO", nullable = false, precision = 0)
    private int jrnlprgto;
    @Basic
    @Column(name = "YRCLSLST", nullable = false, precision = 0)
    private int yrclslst;
    @Basic
    @Column(name = "YRLSTACTL", nullable = false, precision = 0)
    private int yrlstactl;
    @Basic
    @Column(name = "PRDNOPSTPR", nullable = false, precision = 0)
    private int prdnopstpr;
    @Basic
    @Column(name = "YRNOPSTPR", nullable = false, precision = 0)
    private int yrnopstpr;
    @Basic
    @Column(name = "REACCT", nullable = false, length = 45)
    private String reacct;
    @Basic
    @Column(name = "SWMC", nullable = false)
    private short swmc;
    @Basic
    @Column(name = "DFLRATETYP", nullable = false, length = 2)
    private String dflratetyp;
    @Basic
    @Column(name = "SWACCTGRP", nullable = false)
    private short swacctgrp;
    @Basic
    @Column(name = "SWPRVYRPST", nullable = false)
    private short swprvyrpst;
    @Basic
    @Column(name = "YRSTRANDTL", nullable = false, precision = 0)
    private int yrstrandtl;
    @Basic
    @Column(name = "HSTCLRACCT", nullable = false, length = 45)
    private String hstclracct;
    @Basic
    @Column(name = "RPACCT", nullable = false, length = 45)
    private String rpacct;
    @Basic
    @Column(name = "SRCETYPE", nullable = false, length = 2)
    private String srcetype;
    @Basic
    @Column(name = "SWUSESEC", nullable = false)
    private short swusesec;
    @Basic
    @Column(name = "SWDEFACCSS", nullable = false)
    private short swdefaccss;

    public String getOptionid() {
        return optionid;
    }

    public void setOptionid(String optionid) {
        this.optionid = optionid;
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

    public String getPhonenbr() {
        return phonenbr;
    }

    public void setPhonenbr(String phonenbr) {
        this.phonenbr = phonenbr;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCloseseg() {
        return closeseg;
    }

    public void setCloseseg(String closeseg) {
        this.closeseg = closeseg;
    }

    public String getAcctseg() {
        return acctseg;
    }

    public void setAcctseg(String acctseg) {
        this.acctseg = acctseg;
    }

    public String getAbrkdflt() {
        return abrkdflt;
    }

    public void setAbrkdflt(String abrkdflt) {
        this.abrkdflt = abrkdflt;
    }

    public String getAbrkdelm() {
        return abrkdelm;
    }

    public void setAbrkdelm(String abrkdelm) {
        this.abrkdelm = abrkdelm;
    }

    public short getSwbtchedit() {
        return swbtchedit;
    }

    public void setSwbtchedit(short swbtchedit) {
        this.swbtchedit = swbtchedit;
    }

    public short getSwprovpst() {
        return swprovpst;
    }

    public void setSwprovpst(short swprovpst) {
        this.swprovpst = swprovpst;
    }

    public short getSwprtpbtch() {
        return swprtpbtch;
    }

    public void setSwprtpbtch(short swprtpbtch) {
        this.swprtpbtch = swprtpbtch;
    }

    public short getCodelock1() {
        return codelock1;
    }

    public void setCodelock1(short codelock1) {
        this.codelock1 = codelock1;
    }

    public short getCodelock2() {
        return codelock2;
    }

    public void setCodelock2(short codelock2) {
        this.codelock2 = codelock2;
    }

    public short getCodelock3() {
        return codelock3;
    }

    public void setCodelock3(short codelock3) {
        this.codelock3 = codelock3;
    }

    public short getCodelock4() {
        return codelock4;
    }

    public void setCodelock4(short codelock4) {
        this.codelock4 = codelock4;
    }

    public short getCodelock5() {
        return codelock5;
    }

    public void setCodelock5(short codelock5) {
        this.codelock5 = codelock5;
    }

    public String getLockfill() {
        return lockfill;
    }

    public void setLockfill(String lockfill) {
        this.lockfill = lockfill;
    }

    public short getSwqty() {
        return swqty;
    }

    public void setSwqty(short swqty) {
        this.swqty = swqty;
    }

    public int getQtydec() {
        return qtydec;
    }

    public void setQtydec(int qtydec) {
        this.qtydec = qtydec;
    }

    public int getYrshist() {
        return yrshist;
    }

    public void setYrshist(int yrshist) {
        this.yrshist = yrshist;
    }

    public int getYracctdel() {
        return yracctdel;
    }

    public void setYracctdel(int yracctdel) {
        this.yracctdel = yracctdel;
    }

    public int getNextbtchno() {
        return nextbtchno;
    }

    public void setNextbtchno(int nextbtchno) {
        this.nextbtchno = nextbtchno;
    }

    public int getPstsq() {
        return pstsq;
    }

    public void setPstsq(int pstsq) {
        this.pstsq = pstsq;
    }

    public int getProvpstsq() {
        return provpstsq;
    }

    public void setProvpstsq(int provpstsq) {
        this.provpstsq = provpstsq;
    }

    public int getPjrnlprgto() {
        return pjrnlprgto;
    }

    public void setPjrnlprgto(int pjrnlprgto) {
        this.pjrnlprgto = pjrnlprgto;
    }

    public int getBtchpstto() {
        return btchpstto;
    }

    public void setBtchpstto(int btchpstto) {
        this.btchpstto = btchpstto;
    }

    public int getJrnlprgto() {
        return jrnlprgto;
    }

    public void setJrnlprgto(int jrnlprgto) {
        this.jrnlprgto = jrnlprgto;
    }

    public int getYrclslst() {
        return yrclslst;
    }

    public void setYrclslst(int yrclslst) {
        this.yrclslst = yrclslst;
    }

    public int getYrlstactl() {
        return yrlstactl;
    }

    public void setYrlstactl(int yrlstactl) {
        this.yrlstactl = yrlstactl;
    }

    public int getPrdnopstpr() {
        return prdnopstpr;
    }

    public void setPrdnopstpr(int prdnopstpr) {
        this.prdnopstpr = prdnopstpr;
    }

    public int getYrnopstpr() {
        return yrnopstpr;
    }

    public void setYrnopstpr(int yrnopstpr) {
        this.yrnopstpr = yrnopstpr;
    }

    public String getReacct() {
        return reacct;
    }

    public void setReacct(String reacct) {
        this.reacct = reacct;
    }

    public short getSwmc() {
        return swmc;
    }

    public void setSwmc(short swmc) {
        this.swmc = swmc;
    }

    public String getDflratetyp() {
        return dflratetyp;
    }

    public void setDflratetyp(String dflratetyp) {
        this.dflratetyp = dflratetyp;
    }

    public short getSwacctgrp() {
        return swacctgrp;
    }

    public void setSwacctgrp(short swacctgrp) {
        this.swacctgrp = swacctgrp;
    }

    public short getSwprvyrpst() {
        return swprvyrpst;
    }

    public void setSwprvyrpst(short swprvyrpst) {
        this.swprvyrpst = swprvyrpst;
    }

    public int getYrstrandtl() {
        return yrstrandtl;
    }

    public void setYrstrandtl(int yrstrandtl) {
        this.yrstrandtl = yrstrandtl;
    }

    public String getHstclracct() {
        return hstclracct;
    }

    public void setHstclracct(String hstclracct) {
        this.hstclracct = hstclracct;
    }

    public String getRpacct() {
        return rpacct;
    }

    public void setRpacct(String rpacct) {
        this.rpacct = rpacct;
    }

    public String getSrcetype() {
        return srcetype;
    }

    public void setSrcetype(String srcetype) {
        this.srcetype = srcetype;
    }

    public short getSwusesec() {
        return swusesec;
    }

    public void setSwusesec(short swusesec) {
        this.swusesec = swusesec;
    }

    public short getSwdefaccss() {
        return swdefaccss;
    }

    public void setSwdefaccss(short swdefaccss) {
        this.swdefaccss = swdefaccss;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gl01 gl01 = (Gl01) o;
        return audtdate == gl01.audtdate && audttime == gl01.audttime && swbtchedit == gl01.swbtchedit && swprovpst == gl01.swprovpst && swprtpbtch == gl01.swprtpbtch && codelock1 == gl01.codelock1 && codelock2 == gl01.codelock2 && codelock3 == gl01.codelock3 && codelock4 == gl01.codelock4 && codelock5 == gl01.codelock5 && swqty == gl01.swqty && qtydec == gl01.qtydec && yrshist == gl01.yrshist && yracctdel == gl01.yracctdel && nextbtchno == gl01.nextbtchno && pstsq == gl01.pstsq && provpstsq == gl01.provpstsq && pjrnlprgto == gl01.pjrnlprgto && btchpstto == gl01.btchpstto && jrnlprgto == gl01.jrnlprgto && yrclslst == gl01.yrclslst && yrlstactl == gl01.yrlstactl && prdnopstpr == gl01.prdnopstpr && yrnopstpr == gl01.yrnopstpr && swmc == gl01.swmc && swacctgrp == gl01.swacctgrp && swprvyrpst == gl01.swprvyrpst && yrstrandtl == gl01.yrstrandtl && swusesec == gl01.swusesec && swdefaccss == gl01.swdefaccss && Objects.equals(optionid, gl01.optionid) && Objects.equals(audtuser, gl01.audtuser) && Objects.equals(audtorg, gl01.audtorg) && Objects.equals(phonenbr, gl01.phonenbr) && Objects.equals(fax, gl01.fax) && Objects.equals(companyid, gl01.companyid) && Objects.equals(contact, gl01.contact) && Objects.equals(closeseg, gl01.closeseg) && Objects.equals(acctseg, gl01.acctseg) && Objects.equals(abrkdflt, gl01.abrkdflt) && Objects.equals(abrkdelm, gl01.abrkdelm) && Objects.equals(lockfill, gl01.lockfill) && Objects.equals(reacct, gl01.reacct) && Objects.equals(dflratetyp, gl01.dflratetyp) && Objects.equals(hstclracct, gl01.hstclracct) && Objects.equals(rpacct, gl01.rpacct) && Objects.equals(srcetype, gl01.srcetype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(optionid, audtdate, audttime, audtuser, audtorg, phonenbr, fax, companyid, contact, closeseg, acctseg, abrkdflt, abrkdelm, swbtchedit, swprovpst, swprtpbtch, codelock1, codelock2, codelock3, codelock4, codelock5, lockfill, swqty, qtydec, yrshist, yracctdel, nextbtchno, pstsq, provpstsq, pjrnlprgto, btchpstto, jrnlprgto, yrclslst, yrlstactl, prdnopstpr, yrnopstpr, reacct, swmc, dflratetyp, swacctgrp, swprvyrpst, yrstrandtl, hstclracct, rpacct, srcetype, swusesec, swdefaccss);
    }
}
