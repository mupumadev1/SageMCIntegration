package com.sagemcintegration.model.mssql.ic.gl;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class GlafsPK implements Serializable {
    @Column(name = "ACCTID", nullable = false, length = 45)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String acctid;
    @Column(name = "FSCSYR", nullable = false, length = 4)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String fscsyr;
    @Column(name = "FSCSDSG", nullable = false, length = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String fscsdsg;
    @Column(name = "FSCSCURN", nullable = false, length = 3)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String fscscurn;
    @Column(name = "CURNTYPE", nullable = false, length = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String curntype;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GlafsPK glafsPK = (GlafsPK) o;
        return Objects.equals(acctid, glafsPK.acctid) && Objects.equals(fscsyr, glafsPK.fscsyr) && Objects.equals(fscsdsg, glafsPK.fscsdsg) && Objects.equals(fscscurn, glafsPK.fscscurn) && Objects.equals(curntype, glafsPK.curntype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acctid, fscsyr, fscsdsg, fscscurn, curntype);
    }
}
