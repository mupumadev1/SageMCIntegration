package com.sagemcintegration.model.mssql.ic.gl;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Glamf {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ACCTID", nullable = false, length = 45)
    private String acctid;
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
    @Column(name = "CREATEDATE", nullable = false, precision = 0)
    private int createdate;
    @Basic
    @Column(name = "ACCTDESC", nullable = false, length = 60)
    private String acctdesc;
    @Basic
    @Column(name = "ACCTTYPE", nullable = false, length = 1)
    private String accttype;
    @Basic
    @Column(name = "ACCTBAL", nullable = false, length = 1)
    private String acctbal;
    @Basic
    @Column(name = "ACTIVESW", nullable = false)
    private short activesw;
    @Basic
    @Column(name = "CONSLDSW", nullable = false)
    private short consldsw;
    @Basic
    @Column(name = "QTYSW", nullable = false)
    private short qtysw;
    @Basic
    @Column(name = "UOM", nullable = false, length = 6)
    private String uom;
    @Basic
    @Column(name = "ALLOCSW", nullable = false)
    private short allocsw;
    @Basic
    @Column(name = "ACCTOFSET", nullable = false, length = 45)
    private String acctofset;
    @Basic
    @Column(name = "ACCTSRTY", nullable = false, length = 2)
    private String acctsrty;
    @Basic
    @Column(name = "MCSW", nullable = false)
    private short mcsw;
    @Basic
    @Column(name = "SPECSW", nullable = false)
    private short specsw;
    @Basic
    @Column(name = "ACCTGRPCOD", nullable = false, length = 12)
    private String acctgrpcod;
    @Basic
    @Column(name = "CTRLACCTSW", nullable = false)
    private short ctrlacctsw;
    @Basic
    @Column(name = "SRCELDGID", nullable = false, length = 2)
    private String srceldgid;
    @Basic
    @Column(name = "ALLOCTOT", nullable = false, precision = 7)
    private BigDecimal alloctot;
    @Basic
    @Column(name = "ABRKID", nullable = false, length = 6)
    private String abrkid;
    @Basic
    @Column(name = "YRACCTCLOS", nullable = false, precision = 0)
    private int yracctclos;
    @Basic
    @Column(name = "ACCTFMTTD", nullable = false, length = 45)
    private String acctfmttd;
    @Basic
    @Column(name = "ACSEGVAL01", nullable = false, length = 15)
    private String acsegval01;
    @Basic
    @Column(name = "ACSEGVAL02", nullable = false, length = 15)
    private String acsegval02;
    @Basic
    @Column(name = "ACSEGVAL03", nullable = false, length = 15)
    private String acsegval03;
    @Basic
    @Column(name = "ACSEGVAL04", nullable = false, length = 15)
    private String acsegval04;
    @Basic
    @Column(name = "ACSEGVAL05", nullable = false, length = 15)
    private String acsegval05;
    @Basic
    @Column(name = "ACSEGVAL06", nullable = false, length = 15)
    private String acsegval06;
    @Basic
    @Column(name = "ACSEGVAL07", nullable = false, length = 15)
    private String acsegval07;
    @Basic
    @Column(name = "ACSEGVAL08", nullable = false, length = 15)
    private String acsegval08;
    @Basic
    @Column(name = "ACSEGVAL09", nullable = false, length = 15)
    private String acsegval09;
    @Basic
    @Column(name = "ACSEGVAL10", nullable = false, length = 15)
    private String acsegval10;
    @Basic
    @Column(name = "ACCTSEGVAL", nullable = false, length = 15)
    private String acctsegval;
    @Basic
    @Column(name = "ACCTGRPSCD", nullable = false, length = 12)
    private String acctgrpscd;
    @Basic
    @Column(name = "POSTOSEGID", nullable = false, length = 6)
    private String postosegid;
    @Basic
    @Column(name = "DEFCURNCOD", nullable = false, length = 3)
    private String defcurncod;
    @Basic
    @Column(name = "OVALUES", nullable = false)
    private int ovalues;
    @Basic
    @Column(name = "TOVALUES", nullable = false)
    private int tovalues;
    @Basic
    @Column(name = "ROLLUPSW", nullable = false)
    private short rollupsw;

    public String getAcctid() {
        return acctid;
    }

    public void setAcctid(String acctid) {
        this.acctid = acctid;
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

    public int getCreatedate() {
        return createdate;
    }

    public void setCreatedate(int createdate) {
        this.createdate = createdate;
    }

    public String getAcctdesc() {
        return acctdesc;
    }

    public void setAcctdesc(String acctdesc) {
        this.acctdesc = acctdesc;
    }

    public String getAccttype() {
        return accttype;
    }

    public void setAccttype(String accttype) {
        this.accttype = accttype;
    }

    public String getAcctbal() {
        return acctbal;
    }

    public void setAcctbal(String acctbal) {
        this.acctbal = acctbal;
    }

    public short getActivesw() {
        return activesw;
    }

    public void setActivesw(short activesw) {
        this.activesw = activesw;
    }

    public short getConsldsw() {
        return consldsw;
    }

    public void setConsldsw(short consldsw) {
        this.consldsw = consldsw;
    }

    public short getQtysw() {
        return qtysw;
    }

    public void setQtysw(short qtysw) {
        this.qtysw = qtysw;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public short getAllocsw() {
        return allocsw;
    }

    public void setAllocsw(short allocsw) {
        this.allocsw = allocsw;
    }

    public String getAcctofset() {
        return acctofset;
    }

    public void setAcctofset(String acctofset) {
        this.acctofset = acctofset;
    }

    public String getAcctsrty() {
        return acctsrty;
    }

    public void setAcctsrty(String acctsrty) {
        this.acctsrty = acctsrty;
    }

    public short getMcsw() {
        return mcsw;
    }

    public void setMcsw(short mcsw) {
        this.mcsw = mcsw;
    }

    public short getSpecsw() {
        return specsw;
    }

    public void setSpecsw(short specsw) {
        this.specsw = specsw;
    }

    public String getAcctgrpcod() {
        return acctgrpcod;
    }

    public void setAcctgrpcod(String acctgrpcod) {
        this.acctgrpcod = acctgrpcod;
    }

    public short getCtrlacctsw() {
        return ctrlacctsw;
    }

    public void setCtrlacctsw(short ctrlacctsw) {
        this.ctrlacctsw = ctrlacctsw;
    }

    public String getSrceldgid() {
        return srceldgid;
    }

    public void setSrceldgid(String srceldgid) {
        this.srceldgid = srceldgid;
    }

    public BigDecimal getAlloctot() {
        return alloctot;
    }

    public void setAlloctot(BigDecimal alloctot) {
        this.alloctot = alloctot;
    }

    public String getAbrkid() {
        return abrkid;
    }

    public void setAbrkid(String abrkid) {
        this.abrkid = abrkid;
    }

    public int getYracctclos() {
        return yracctclos;
    }

    public void setYracctclos(int yracctclos) {
        this.yracctclos = yracctclos;
    }

    public String getAcctfmttd() {
        return acctfmttd;
    }

    public void setAcctfmttd(String acctfmttd) {
        this.acctfmttd = acctfmttd;
    }

    public String getAcsegval01() {
        return acsegval01;
    }

    public void setAcsegval01(String acsegval01) {
        this.acsegval01 = acsegval01;
    }

    public String getAcsegval02() {
        return acsegval02;
    }

    public void setAcsegval02(String acsegval02) {
        this.acsegval02 = acsegval02;
    }

    public String getAcsegval03() {
        return acsegval03;
    }

    public void setAcsegval03(String acsegval03) {
        this.acsegval03 = acsegval03;
    }

    public String getAcsegval04() {
        return acsegval04;
    }

    public void setAcsegval04(String acsegval04) {
        this.acsegval04 = acsegval04;
    }

    public String getAcsegval05() {
        return acsegval05;
    }

    public void setAcsegval05(String acsegval05) {
        this.acsegval05 = acsegval05;
    }

    public String getAcsegval06() {
        return acsegval06;
    }

    public void setAcsegval06(String acsegval06) {
        this.acsegval06 = acsegval06;
    }

    public String getAcsegval07() {
        return acsegval07;
    }

    public void setAcsegval07(String acsegval07) {
        this.acsegval07 = acsegval07;
    }

    public String getAcsegval08() {
        return acsegval08;
    }

    public void setAcsegval08(String acsegval08) {
        this.acsegval08 = acsegval08;
    }

    public String getAcsegval09() {
        return acsegval09;
    }

    public void setAcsegval09(String acsegval09) {
        this.acsegval09 = acsegval09;
    }

    public String getAcsegval10() {
        return acsegval10;
    }

    public void setAcsegval10(String acsegval10) {
        this.acsegval10 = acsegval10;
    }

    public String getAcctsegval() {
        return acctsegval;
    }

    public void setAcctsegval(String acctsegval) {
        this.acctsegval = acctsegval;
    }

    public String getAcctgrpscd() {
        return acctgrpscd;
    }

    public void setAcctgrpscd(String acctgrpscd) {
        this.acctgrpscd = acctgrpscd;
    }

    public String getPostosegid() {
        return postosegid;
    }

    public void setPostosegid(String postosegid) {
        this.postosegid = postosegid;
    }

    public String getDefcurncod() {
        return defcurncod;
    }

    public void setDefcurncod(String defcurncod) {
        this.defcurncod = defcurncod;
    }

    public int getOvalues() {
        return ovalues;
    }

    public void setOvalues(int ovalues) {
        this.ovalues = ovalues;
    }

    public int getTovalues() {
        return tovalues;
    }

    public void setTovalues(int tovalues) {
        this.tovalues = tovalues;
    }

    public short getRollupsw() {
        return rollupsw;
    }

    public void setRollupsw(short rollupsw) {
        this.rollupsw = rollupsw;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Glamf glamf = (Glamf) o;
        return audtdate == glamf.audtdate && audttime == glamf.audttime && createdate == glamf.createdate && activesw == glamf.activesw && consldsw == glamf.consldsw && qtysw == glamf.qtysw && allocsw == glamf.allocsw && mcsw == glamf.mcsw && specsw == glamf.specsw && ctrlacctsw == glamf.ctrlacctsw && yracctclos == glamf.yracctclos && ovalues == glamf.ovalues && tovalues == glamf.tovalues && rollupsw == glamf.rollupsw && Objects.equals(acctid, glamf.acctid) && Objects.equals(audtuser, glamf.audtuser) && Objects.equals(audtorg, glamf.audtorg) && Objects.equals(acctdesc, glamf.acctdesc) && Objects.equals(accttype, glamf.accttype) && Objects.equals(acctbal, glamf.acctbal) && Objects.equals(uom, glamf.uom) && Objects.equals(acctofset, glamf.acctofset) && Objects.equals(acctsrty, glamf.acctsrty) && Objects.equals(acctgrpcod, glamf.acctgrpcod) && Objects.equals(srceldgid, glamf.srceldgid) && Objects.equals(alloctot, glamf.alloctot) && Objects.equals(abrkid, glamf.abrkid) && Objects.equals(acctfmttd, glamf.acctfmttd) && Objects.equals(acsegval01, glamf.acsegval01) && Objects.equals(acsegval02, glamf.acsegval02) && Objects.equals(acsegval03, glamf.acsegval03) && Objects.equals(acsegval04, glamf.acsegval04) && Objects.equals(acsegval05, glamf.acsegval05) && Objects.equals(acsegval06, glamf.acsegval06) && Objects.equals(acsegval07, glamf.acsegval07) && Objects.equals(acsegval08, glamf.acsegval08) && Objects.equals(acsegval09, glamf.acsegval09) && Objects.equals(acsegval10, glamf.acsegval10) && Objects.equals(acctsegval, glamf.acctsegval) && Objects.equals(acctgrpscd, glamf.acctgrpscd) && Objects.equals(postosegid, glamf.postosegid) && Objects.equals(defcurncod, glamf.defcurncod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acctid, audtdate, audttime, audtuser, audtorg, createdate, acctdesc, accttype, acctbal, activesw, consldsw, qtysw, uom, allocsw, acctofset, acctsrty, mcsw, specsw, acctgrpcod, ctrlacctsw, srceldgid, alloctot, abrkid, yracctclos, acctfmttd, acsegval01, acsegval02, acsegval03, acsegval04, acsegval05, acsegval06, acsegval07, acsegval08, acsegval09, acsegval10, acctsegval, acctgrpscd, postosegid, defcurncod, ovalues, tovalues, rollupsw);
    }
}
