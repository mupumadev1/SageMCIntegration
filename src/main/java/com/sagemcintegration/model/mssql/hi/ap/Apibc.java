package com.sagemcintegration.model.mssql.hi.ap;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Apibc {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CNTBTCH", nullable = false, precision = 0)
    private int cntbtch;
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
    @Column(name = "DATEBTCH", nullable = false, precision = 0)
    private int datebtch;
    @Basic
    @Column(name = "BTCHDESC", nullable = false, length = 60)
    private String btchdesc;
    @Basic
    @Column(name = "CNTINVCENT", nullable = false, precision = 0)
    private int cntinvcent;
    @Basic
    @Column(name = "AMTENTR", nullable = false, precision = 3)
    private BigDecimal amtentr;
    @Basic
    @Column(name = "BTCHTYPE", nullable = false)
    private short btchtype;
    @Basic
    @Column(name = "BTCHSTTS", nullable = false)
    private short btchstts;
    @Basic
    @Column(name = "INVCTYPE", nullable = false)
    private short invctype;
    @Basic
    @Column(name = "CNTLSTITEM", nullable = false, precision = 0)
    private int cntlstitem;
    @Basic
    @Column(name = "POSTSEQNBR", nullable = false, precision = 0)
    private int postseqnbr;
    @Basic
    @Column(name = "NBRERRORS", nullable = false, precision = 0)
    private int nbrerrors;
    @Basic
    @Column(name = "DTELSTEDIT", nullable = false, precision = 0)
    private int dtelstedit;
    @Basic
    @Column(name = "SWPRINTED", nullable = false)
    private short swprinted;
    @Basic
    @Column(name = "SRCEAPPL", nullable = false, length = 2)
    private String srceappl;
    @Basic
    @Column(name = "SWICT", nullable = false)
    private short swict;

    public int getCntbtch() {
        return cntbtch;
    }

    public void setCntbtch(int cntbtch) {
        this.cntbtch = cntbtch;
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

    public int getDatebtch() {
        return datebtch;
    }

    public void setDatebtch(int datebtch) {
        this.datebtch = datebtch;
    }

    public String getBtchdesc() {
        return btchdesc;
    }

    public void setBtchdesc(String btchdesc) {
        this.btchdesc = btchdesc;
    }

    public int getCntinvcent() {
        return cntinvcent;
    }

    public void setCntinvcent(int cntinvcent) {
        this.cntinvcent = cntinvcent;
    }

    public BigDecimal getAmtentr() {
        return amtentr;
    }

    public void setAmtentr(BigDecimal amtentr) {
        this.amtentr = amtentr;
    }

    public short getBtchtype() {
        return btchtype;
    }

    public void setBtchtype(short btchtype) {
        this.btchtype = btchtype;
    }

    public short getBtchstts() {
        return btchstts;
    }

    public void setBtchstts(short btchstts) {
        this.btchstts = btchstts;
    }

    public short getInvctype() {
        return invctype;
    }

    public void setInvctype(short invctype) {
        this.invctype = invctype;
    }

    public int getCntlstitem() {
        return cntlstitem;
    }

    public void setCntlstitem(int cntlstitem) {
        this.cntlstitem = cntlstitem;
    }

    public int getPostseqnbr() {
        return postseqnbr;
    }

    public void setPostseqnbr(int postseqnbr) {
        this.postseqnbr = postseqnbr;
    }

    public int getNbrerrors() {
        return nbrerrors;
    }

    public void setNbrerrors(int nbrerrors) {
        this.nbrerrors = nbrerrors;
    }

    public int getDtelstedit() {
        return dtelstedit;
    }

    public void setDtelstedit(int dtelstedit) {
        this.dtelstedit = dtelstedit;
    }

    public short getSwprinted() {
        return swprinted;
    }

    public void setSwprinted(short swprinted) {
        this.swprinted = swprinted;
    }

    public String getSrceappl() {
        return srceappl;
    }

    public void setSrceappl(String srceappl) {
        this.srceappl = srceappl;
    }

    public short getSwict() {
        return swict;
    }

    public void setSwict(short swict) {
        this.swict = swict;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apibc apibc = (Apibc) o;
        return cntbtch == apibc.cntbtch && audtdate == apibc.audtdate && audttime == apibc.audttime && datebtch == apibc.datebtch && cntinvcent == apibc.cntinvcent && btchtype == apibc.btchtype && btchstts == apibc.btchstts && invctype == apibc.invctype && cntlstitem == apibc.cntlstitem && postseqnbr == apibc.postseqnbr && nbrerrors == apibc.nbrerrors && dtelstedit == apibc.dtelstedit && swprinted == apibc.swprinted && swict == apibc.swict && Objects.equals(audtuser, apibc.audtuser) && Objects.equals(audtorg, apibc.audtorg) && Objects.equals(btchdesc, apibc.btchdesc) && Objects.equals(amtentr, apibc.amtentr) && Objects.equals(srceappl, apibc.srceappl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cntbtch, audtdate, audttime, audtuser, audtorg, datebtch, btchdesc, cntinvcent, amtentr, btchtype, btchstts, invctype, cntlstitem, postseqnbr, nbrerrors, dtelstedit, swprinted, srceappl, swict);
    }
}
