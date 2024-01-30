package com.sagemcintegration.model.mssql.hi.gl;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Glbctl {
    @Id
    @Column(name = "BATCHID", nullable = false, length = 6)
    private String batchid;
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
    @Column(name = "ACTIVESW", nullable = false)
    private short activesw;
    @Basic
    @Column(name = "BTCHDESC", nullable = false, length = 60)
    private String btchdesc;
    @Basic
    @Column(name = "SRCELEDGR", nullable = false, length = 2)
    private String srceledgr;
    @Basic
    @Column(name = "DATECREAT", nullable = false, precision = 0)
    private int datecreat;
    @Basic
    @Column(name = "DATEEDIT", nullable = false, precision = 0)
    private int dateedit;
    @Basic
    @Column(name = "BATCHTYPE", nullable = false, length = 1)
    private String batchtype;
    @Basic
    @Column(name = "BATCHSTAT", nullable = false, length = 1)
    private String batchstat;
    @Basic
    @Column(name = "POSTNGSEQ", nullable = false, precision = 0)
    private int postngseq;
    @Basic
    @Column(name = "DEBITTOT", nullable = false, precision = 3)
    private BigDecimal debittot;
    @Basic
    @Column(name = "CREDITTOT", nullable = false, precision = 3)
    private BigDecimal credittot;
    @Basic
    @Column(name = "QTYTOTAL", nullable = false, precision = 3)
    private BigDecimal qtytotal;
    @Basic
    @Column(name = "ENTRYCNT", nullable = false, precision = 0)
    private int entrycnt;
    @Basic
    @Column(name = "NEXTENTRY", nullable = false, precision = 0)
    private int nextentry;
    @Basic
    @Column(name = "ERRORCNT", nullable = false, precision = 0)
    private int errorcnt;
    @Basic
    @Column(name = "ORIGSTATUS", nullable = false, length = 1)
    private String origstatus;
    @Basic
    @Column(name = "SWPRINTED", nullable = false)
    private short swprinted;
    @Basic
    @Column(name = "SWICT", nullable = false)
    private short swict;
    @Basic
    @Column(name = "SWRVRECOG", nullable = false)
    private short swrvrecog;

    public String getBatchid() {
        return batchid;
    }

    public void setBatchid(String batchid) {
        this.batchid = batchid;
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

    public short getActivesw() {
        return activesw;
    }

    public void setActivesw(short activesw) {
        this.activesw = activesw;
    }

    public String getBtchdesc() {
        return btchdesc;
    }

    public void setBtchdesc(String btchdesc) {
        this.btchdesc = btchdesc;
    }

    public String getSrceledgr() {
        return srceledgr;
    }

    public void setSrceledgr(String srceledgr) {
        this.srceledgr = srceledgr;
    }

    public int getDatecreat() {
        return datecreat;
    }

    public void setDatecreat(int datecreat) {
        this.datecreat = datecreat;
    }

    public int getDateedit() {
        return dateedit;
    }

    public void setDateedit(int dateedit) {
        this.dateedit = dateedit;
    }

    public String getBatchtype() {
        return batchtype;
    }

    public void setBatchtype(String batchtype) {
        this.batchtype = batchtype;
    }

    public String getBatchstat() {
        return batchstat;
    }

    public void setBatchstat(String batchstat) {
        this.batchstat = batchstat;
    }

    public int getPostngseq() {
        return postngseq;
    }

    public void setPostngseq(int postngseq) {
        this.postngseq = postngseq;
    }

    public BigDecimal getDebittot() {
        return debittot;
    }

    public void setDebittot(BigDecimal debittot) {
        this.debittot = debittot;
    }

    public BigDecimal getCredittot() {
        return credittot;
    }

    public void setCredittot(BigDecimal credittot) {
        this.credittot = credittot;
    }

    public BigDecimal getQtytotal() {
        return qtytotal;
    }

    public void setQtytotal(BigDecimal qtytotal) {
        this.qtytotal = qtytotal;
    }

    public int getEntrycnt() {
        return entrycnt;
    }

    public void setEntrycnt(int entrycnt) {
        this.entrycnt = entrycnt;
    }

    public int getNextentry() {
        return nextentry;
    }

    public void setNextentry(int nextentry) {
        this.nextentry = nextentry;
    }

    public int getErrorcnt() {
        return errorcnt;
    }

    public void setErrorcnt(int errorcnt) {
        this.errorcnt = errorcnt;
    }

    public String getOrigstatus() {
        return origstatus;
    }

    public void setOrigstatus(String origstatus) {
        this.origstatus = origstatus;
    }

    public short getSwprinted() {
        return swprinted;
    }

    public void setSwprinted(short swprinted) {
        this.swprinted = swprinted;
    }

    public short getSwict() {
        return swict;
    }

    public void setSwict(short swict) {
        this.swict = swict;
    }

    public short getSwrvrecog() {
        return swrvrecog;
    }

    public void setSwrvrecog(short swrvrecog) {
        this.swrvrecog = swrvrecog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Glbctl glbctl = (Glbctl) o;
        return audtdate == glbctl.audtdate && audttime == glbctl.audttime && activesw == glbctl.activesw && datecreat == glbctl.datecreat && dateedit == glbctl.dateedit && postngseq == glbctl.postngseq && entrycnt == glbctl.entrycnt && nextentry == glbctl.nextentry && errorcnt == glbctl.errorcnt && swprinted == glbctl.swprinted && swict == glbctl.swict && swrvrecog == glbctl.swrvrecog && Objects.equals(batchid, glbctl.batchid) && Objects.equals(audtuser, glbctl.audtuser) && Objects.equals(audtorg, glbctl.audtorg) && Objects.equals(btchdesc, glbctl.btchdesc) && Objects.equals(srceledgr, glbctl.srceledgr) && Objects.equals(batchtype, glbctl.batchtype) && Objects.equals(batchstat, glbctl.batchstat) && Objects.equals(debittot, glbctl.debittot) && Objects.equals(credittot, glbctl.credittot) && Objects.equals(qtytotal, glbctl.qtytotal) && Objects.equals(origstatus, glbctl.origstatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchid, audtdate, audttime, audtuser, audtorg, activesw, btchdesc, srceledgr, datecreat, dateedit, batchtype, batchstat, postngseq, debittot, credittot, qtytotal, entrycnt, nextentry, errorcnt, origstatus, swprinted, swict, swrvrecog);
    }
}
