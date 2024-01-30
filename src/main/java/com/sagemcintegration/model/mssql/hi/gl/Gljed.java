package com.sagemcintegration.model.mssql.hi.gl;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
public class Gljed implements Serializable {

    @EmbeddedId
    private GljedPK gljedPK;
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
    @Column(name = "ACCTID", nullable = false, length = 45)
    private String acctid;
    @Basic
    @Column(name = "COMPANYID", nullable = false, length = 8)
    private String companyid;
    @Basic
    @Column(name = "TRANSAMT", nullable = false, precision = 3)
    private BigDecimal transamt;
    @Basic
    @Column(name = "TRANSQTY", nullable = false, precision = 3)
    private BigDecimal transqty;
    @Basic
    @Column(name = "SCURNDEC", nullable = false, length = 1)
    private String scurndec;
    @Basic
    @Column(name = "SCURNAMT", nullable = false, precision = 3)
    private BigDecimal scurnamt;
    @Basic
    @Column(name = "HCURNCODE", nullable = false, length = 3)
    private String hcurncode;
    @Basic
    @Column(name = "RATETYPE", nullable = false, length = 2)
    private String ratetype;
    @Basic
    @Column(name = "SCURNCODE", nullable = false, length = 3)
    private String scurncode;
    @Basic
    @Column(name = "RATEDATE", nullable = false, precision = 0)
    private int ratedate;
    @Basic
    @Column(name = "CONVRATE", nullable = false, precision = 7)
    private BigDecimal convrate;
    @Basic
    @Column(name = "RATESPREAD", nullable = false, precision = 7)
    private BigDecimal ratespread;
    @Basic
    @Column(name = "DATEMTCHCD", nullable = false, length = 1)
    private String datemtchcd;
    @Basic
    @Column(name = "RATEOPER", nullable = false, length = 1)
    private String rateoper;
    @Basic
    @Column(name = "TRANSDESC", nullable = false, length = 60)
    private String transdesc;
    @Basic
    @Column(name = "TRANSREF", nullable = false, length = 60)
    private String transref;
    @Basic
    @Column(name = "TRANSDATE", nullable = false, precision = 0)
    private int transdate;
    @Basic
    @Column(name = "SRCELDGR", nullable = false, length = 2)
    private String srceldgr;
    @Basic
    @Column(name = "SRCETYPE", nullable = false, length = 2)
    private String srcetype;
    @Basic
    @Column(name = "`VALUES`", nullable = false)
    private int values;
    @Basic
    @Column(name = "DESCOMP", nullable = false, length = 6)
    private String descomp;
    @Basic
    @Column(name = "ROUTE", nullable = false)
    private short route;
    @Basic
    @Column(name = "TAXAUTH", nullable = false, length = 12)
    private String taxauth;
    @Basic
    @Column(name = "TXACCTTYPE", nullable = false)
    private short txaccttype;




}
