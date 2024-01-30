package com.sagemcintegration.model.mssql.ic.ap;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class ApoblPK implements Serializable {
    @Column(name = "IDVEND", nullable = false, length = 12)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idvend;
    @Column(name = "IDINVC", nullable = false, length = 22)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idinvc;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApoblPK apoblPK = (ApoblPK) o;
        return Objects.equals(idvend, apoblPK.idvend) && Objects.equals(idinvc, apoblPK.idinvc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idvend, idinvc);
    }
}
