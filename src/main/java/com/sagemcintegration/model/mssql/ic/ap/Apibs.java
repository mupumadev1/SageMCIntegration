package com.sagemcintegration.model.mssql.ic.ap;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.*;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class Apibs {
    @EmbeddedId
    private ApibsPK apibsPK;
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
    @Column(name = "DATEDUE", nullable = false, precision = 0)
    private int datedue;
    @Basic
    @Column(name = "AMTDUE", nullable = false, precision = 3)
    private BigDecimal amtdue;
    @Basic
    @Column(name = "DATEDISC", nullable = false, precision = 0)
    private int datedisc;
    @Basic
    @Column(name = "AMTDISC", nullable = false, precision = 3)
    private BigDecimal amtdisc;
    @Basic
    @Column(name = "AMTDUEHC", nullable = false, precision = 3)
    private BigDecimal amtduehc;
    @Basic
    @Column(name = "AMTDISCHC", nullable = false, precision = 3)
    private BigDecimal amtdischc;


}
