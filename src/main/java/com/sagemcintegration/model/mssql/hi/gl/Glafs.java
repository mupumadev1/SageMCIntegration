package com.sagemcintegration.model.mssql.hi.gl;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@IdClass(GlafsPK.class)
public class Glafs {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ACCTID", nullable = false, length = 45)
    private String acctid;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "FSCSYR", nullable = false, length = 4)
    private String fscsyr;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "FSCSDSG", nullable = false, length = 1)
    private String fscsdsg;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "FSCSCURN", nullable = false, length = 3)
    private String fscscurn;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CURNTYPE", nullable = false, length = 1)
    private String curntype;
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
    @Column(name = "SWRVL", nullable = false)
    private short swrvl;
    @Basic
    @Column(name = "CODERVL", nullable = false, length = 6)
    private String codervl;
    @Basic
    @Column(name = "SCURNDEC", nullable = false, length = 1)
    private String scurndec;
    @Basic
    @Column(name = "OPENBAL", nullable = false, precision = 3)
    private BigDecimal openbal;
    @Basic
    @Column(name = "NETPERD1", nullable = false, precision = 3)
    private BigDecimal netperd1;
    @Basic
    @Column(name = "NETPERD2", nullable = false, precision = 3)
    private BigDecimal netperd2;
    @Basic
    @Column(name = "NETPERD3", nullable = false, precision = 3)
    private BigDecimal netperd3;
    @Basic
    @Column(name = "NETPERD4", nullable = false, precision = 3)
    private BigDecimal netperd4;
    @Basic
    @Column(name = "NETPERD5", nullable = false, precision = 3)
    private BigDecimal netperd5;
    @Basic
    @Column(name = "NETPERD6", nullable = false, precision = 3)
    private BigDecimal netperd6;
    @Basic
    @Column(name = "NETPERD7", nullable = false, precision = 3)
    private BigDecimal netperd7;
    @Basic
    @Column(name = "NETPERD8", nullable = false, precision = 3)
    private BigDecimal netperd8;
    @Basic
    @Column(name = "NETPERD9", nullable = false, precision = 3)
    private BigDecimal netperd9;
    @Basic
    @Column(name = "NETPERD10", nullable = false, precision = 3)
    private BigDecimal netperd10;
    @Basic
    @Column(name = "NETPERD11", nullable = false, precision = 3)
    private BigDecimal netperd11;
    @Basic
    @Column(name = "NETPERD12", nullable = false, precision = 3)
    private BigDecimal netperd12;
    @Basic
    @Column(name = "NETPERD13", nullable = false, precision = 3)
    private BigDecimal netperd13;
    @Basic
    @Column(name = "NETPERD14", nullable = false, precision = 3)
    private BigDecimal netperd14;
    @Basic
    @Column(name = "NETPERD15", nullable = false, precision = 3)
    private BigDecimal netperd15;
    @Basic
    @Column(name = "ACTIVITYSW", nullable = false)
    private short activitysw;

    public String getAcctid() {
        return acctid;
    }

    public void setAcctid(String acctid) {
        this.acctid = acctid;
    }

    public String getFscsyr() {
        return fscsyr;
    }

    public void setFscsyr(String fscsyr) {
        this.fscsyr = fscsyr;
    }

    public String getFscsdsg() {
        return fscsdsg;
    }

    public void setFscsdsg(String fscsdsg) {
        this.fscsdsg = fscsdsg;
    }

    public String getFscscurn() {
        return fscscurn;
    }

    public void setFscscurn(String fscscurn) {
        this.fscscurn = fscscurn;
    }

    public String getCurntype() {
        return curntype;
    }

    public void setCurntype(String curntype) {
        this.curntype = curntype;
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

    public short getSwrvl() {
        return swrvl;
    }

    public void setSwrvl(short swrvl) {
        this.swrvl = swrvl;
    }

    public String getCodervl() {
        return codervl;
    }

    public void setCodervl(String codervl) {
        this.codervl = codervl;
    }

    public String getScurndec() {
        return scurndec;
    }

    public void setScurndec(String scurndec) {
        this.scurndec = scurndec;
    }

    public BigDecimal getOpenbal() {
        return openbal;
    }

    public void setOpenbal(BigDecimal openbal) {
        this.openbal = openbal;
    }

    public BigDecimal getNetperd1() {
        return netperd1;
    }

    public void setNetperd1(BigDecimal netperd1) {
        this.netperd1 = netperd1;
    }

    public BigDecimal getNetperd2() {
        return netperd2;
    }

    public void setNetperd2(BigDecimal netperd2) {
        this.netperd2 = netperd2;
    }

    public BigDecimal getNetperd3() {
        return netperd3;
    }

    public void setNetperd3(BigDecimal netperd3) {
        this.netperd3 = netperd3;
    }

    public BigDecimal getNetperd4() {
        return netperd4;
    }

    public void setNetperd4(BigDecimal netperd4) {
        this.netperd4 = netperd4;
    }

    public BigDecimal getNetperd5() {
        return netperd5;
    }

    public void setNetperd5(BigDecimal netperd5) {
        this.netperd5 = netperd5;
    }

    public BigDecimal getNetperd6() {
        return netperd6;
    }

    public void setNetperd6(BigDecimal netperd6) {
        this.netperd6 = netperd6;
    }

    public BigDecimal getNetperd7() {
        return netperd7;
    }

    public void setNetperd7(BigDecimal netperd7) {
        this.netperd7 = netperd7;
    }

    public BigDecimal getNetperd8() {
        return netperd8;
    }

    public void setNetperd8(BigDecimal netperd8) {
        this.netperd8 = netperd8;
    }

    public BigDecimal getNetperd9() {
        return netperd9;
    }

    public void setNetperd9(BigDecimal netperd9) {
        this.netperd9 = netperd9;
    }

    public BigDecimal getNetperd10() {
        return netperd10;
    }

    public void setNetperd10(BigDecimal netperd10) {
        this.netperd10 = netperd10;
    }

    public BigDecimal getNetperd11() {
        return netperd11;
    }

    public void setNetperd11(BigDecimal netperd11) {
        this.netperd11 = netperd11;
    }

    public BigDecimal getNetperd12() {
        return netperd12;
    }

    public void setNetperd12(BigDecimal netperd12) {
        this.netperd12 = netperd12;
    }

    public BigDecimal getNetperd13() {
        return netperd13;
    }

    public void setNetperd13(BigDecimal netperd13) {
        this.netperd13 = netperd13;
    }

    public BigDecimal getNetperd14() {
        return netperd14;
    }

    public void setNetperd14(BigDecimal netperd14) {
        this.netperd14 = netperd14;
    }

    public BigDecimal getNetperd15() {
        return netperd15;
    }

    public void setNetperd15(BigDecimal netperd15) {
        this.netperd15 = netperd15;
    }

    public short getActivitysw() {
        return activitysw;
    }

    public void setActivitysw(short activitysw) {
        this.activitysw = activitysw;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Glafs glafs = (Glafs) o;
        return audtdate == glafs.audtdate && audttime == glafs.audttime && swrvl == glafs.swrvl && activitysw == glafs.activitysw && Objects.equals(acctid, glafs.acctid) && Objects.equals(fscsyr, glafs.fscsyr) && Objects.equals(fscsdsg, glafs.fscsdsg) && Objects.equals(fscscurn, glafs.fscscurn) && Objects.equals(curntype, glafs.curntype) && Objects.equals(audtuser, glafs.audtuser) && Objects.equals(audtorg, glafs.audtorg) && Objects.equals(codervl, glafs.codervl) && Objects.equals(scurndec, glafs.scurndec) && Objects.equals(openbal, glafs.openbal) && Objects.equals(netperd1, glafs.netperd1) && Objects.equals(netperd2, glafs.netperd2) && Objects.equals(netperd3, glafs.netperd3) && Objects.equals(netperd4, glafs.netperd4) && Objects.equals(netperd5, glafs.netperd5) && Objects.equals(netperd6, glafs.netperd6) && Objects.equals(netperd7, glafs.netperd7) && Objects.equals(netperd8, glafs.netperd8) && Objects.equals(netperd9, glafs.netperd9) && Objects.equals(netperd10, glafs.netperd10) && Objects.equals(netperd11, glafs.netperd11) && Objects.equals(netperd12, glafs.netperd12) && Objects.equals(netperd13, glafs.netperd13) && Objects.equals(netperd14, glafs.netperd14) && Objects.equals(netperd15, glafs.netperd15);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acctid, fscsyr, fscsdsg, fscscurn, curntype, audtdate, audttime, audtuser, audtorg, swrvl, codervl, scurndec, openbal, netperd1, netperd2, netperd3, netperd4, netperd5, netperd6, netperd7, netperd8, netperd9, netperd10, netperd11, netperd12, netperd13, netperd14, netperd15, activitysw);
    }
}
