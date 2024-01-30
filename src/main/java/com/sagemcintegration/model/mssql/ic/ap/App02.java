package com.sagemcintegration.model.mssql.ic.ap;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class App02 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RECID02", nullable = false, length = 6)
    private String recid02;
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
    @Column(name = "DATELASTMN", nullable = false, precision = 0)
    private int datelastmn;
    @Basic
    @Column(name = "INVCBTCH", nullable = false, precision = 0)
    private int invcbtch;
    @Basic
    @Column(name = "VCHRNBR", nullable = false, precision = 0)
    private int vchrnbr;
    @Basic
    @Column(name = "SWALOWDISC", nullable = false)
    private short swalowdisc;
    @Basic
    @Column(name = "SWUSE1099", nullable = false)
    private short swuse1099;
    @Basic
    @Column(name = "CLASLABEL", nullable = false, length = 10)
    private String claslabel;
    @Basic
    @Column(name = "CNTNEXTINV", nullable = false, precision = 0)
    private int cntnextinv;
    @Basic
    @Column(name = "SWCOAWARN", nullable = false)
    private short swcoawarn;
    @Basic
    @Column(name = "SWPOSTPRNT", nullable = false)
    private short swpostprnt;
    @Basic
    @Column(name = "SWALOWIVED", nullable = false)
    private short swalowived;
    @Basic
    @Column(name = "SWEDIT1099", nullable = false)
    private short swedit1099;
    @Basic
    @Column(name = "SW1099COPY", nullable = false)
    private short sw1099Copy;
    @Basic
    @Column(name = "SWDATEBUS", nullable = false)
    private short swdatebus;

    public String getRecid02() {
        return recid02;
    }

    public void setRecid02(String recid02) {
        this.recid02 = recid02;
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

    public int getDatelastmn() {
        return datelastmn;
    }

    public void setDatelastmn(int datelastmn) {
        this.datelastmn = datelastmn;
    }

    public int getInvcbtch() {
        return invcbtch;
    }

    public void setInvcbtch(int invcbtch) {
        this.invcbtch = invcbtch;
    }

    public int getVchrnbr() {
        return vchrnbr;
    }

    public void setVchrnbr(int vchrnbr) {
        this.vchrnbr = vchrnbr;
    }

    public short getSwalowdisc() {
        return swalowdisc;
    }

    public void setSwalowdisc(short swalowdisc) {
        this.swalowdisc = swalowdisc;
    }

    public short getSwuse1099() {
        return swuse1099;
    }

    public void setSwuse1099(short swuse1099) {
        this.swuse1099 = swuse1099;
    }

    public String getClaslabel() {
        return claslabel;
    }

    public void setClaslabel(String claslabel) {
        this.claslabel = claslabel;
    }

    public int getCntnextinv() {
        return cntnextinv;
    }

    public void setCntnextinv(int cntnextinv) {
        this.cntnextinv = cntnextinv;
    }

    public short getSwcoawarn() {
        return swcoawarn;
    }

    public void setSwcoawarn(short swcoawarn) {
        this.swcoawarn = swcoawarn;
    }

    public short getSwpostprnt() {
        return swpostprnt;
    }

    public void setSwpostprnt(short swpostprnt) {
        this.swpostprnt = swpostprnt;
    }

    public short getSwalowived() {
        return swalowived;
    }

    public void setSwalowived(short swalowived) {
        this.swalowived = swalowived;
    }

    public short getSwedit1099() {
        return swedit1099;
    }

    public void setSwedit1099(short swedit1099) {
        this.swedit1099 = swedit1099;
    }

    public short getSw1099Copy() {
        return sw1099Copy;
    }

    public void setSw1099Copy(short sw1099Copy) {
        this.sw1099Copy = sw1099Copy;
    }

    public short getSwdatebus() {
        return swdatebus;
    }

    public void setSwdatebus(short swdatebus) {
        this.swdatebus = swdatebus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        App02 app02 = (App02) o;
        return audtdate == app02.audtdate && audttime == app02.audttime && datelastmn == app02.datelastmn && invcbtch == app02.invcbtch && vchrnbr == app02.vchrnbr && swalowdisc == app02.swalowdisc && swuse1099 == app02.swuse1099 && cntnextinv == app02.cntnextinv && swcoawarn == app02.swcoawarn && swpostprnt == app02.swpostprnt && swalowived == app02.swalowived && swedit1099 == app02.swedit1099 && sw1099Copy == app02.sw1099Copy && swdatebus == app02.swdatebus && Objects.equals(recid02, app02.recid02) && Objects.equals(audtuser, app02.audtuser) && Objects.equals(audtorg, app02.audtorg) && Objects.equals(claslabel, app02.claslabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recid02, audtdate, audttime, audtuser, audtorg, datelastmn, invcbtch, vchrnbr, swalowdisc, swuse1099, claslabel, cntnextinv, swcoawarn, swpostprnt, swalowived, swedit1099, sw1099Copy, swdatebus);
    }
}
