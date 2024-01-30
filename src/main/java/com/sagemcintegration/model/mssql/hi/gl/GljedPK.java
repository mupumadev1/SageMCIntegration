package com.sagemcintegration.model.mssql.hi.gl;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GljedPK implements Serializable {

    private String batchnbr;

    private String journalid;

    private String transnbr;

    public String getBatchnbr() {
        return batchnbr;
    }

    public void setBatchnbr(String batchnbr) {
        this.batchnbr = batchnbr;
    }

    public String getJournalid() {
        return journalid;
    }

    public void setJournalid(String journalid) {
        this.journalid = journalid;
    }

    public String getTransnbr() {
        return transnbr;
    }

    public void setTransnbr(String transnbr) {
        this.transnbr = transnbr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GljedPK gljedPK = (GljedPK) o;
        return Objects.equals(batchnbr, gljedPK.batchnbr) && Objects.equals(journalid, gljedPK.journalid) && Objects.equals(transnbr, gljedPK.transnbr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchnbr, journalid, transnbr);
    }
}
