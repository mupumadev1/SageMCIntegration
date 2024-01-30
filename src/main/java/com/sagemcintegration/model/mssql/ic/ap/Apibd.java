package com.sagemcintegration.model.mssql.ic.ap;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
@EqualsAndHashCode
public class Apibd implements Serializable {
    @EmbeddedId
    private ApibdPK apibdPK;
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
    @Column(name = "IDDIST", nullable = false, length = 6)
    private String iddist;
    @Basic
    @Column(name = "TEXTDESC", nullable = false, length = 60)
    private String textdesc;
    @Basic
    @Column(name = "SWMANLDIST", nullable = false)
    private short swmanldist;
    @Basic
    @Column(name = "AMTTOTTAX", nullable = false, precision = 3)
    private BigDecimal amttottax;
    @Basic
    @Column(name = "SWMANLTX", nullable = false)
    private short swmanltx;
    @Basic
    @Column(name = "BASETAX1", nullable = false, precision = 3)
    private BigDecimal basetax1;
    @Basic
    @Column(name = "BASETAX2", nullable = false, precision = 3)
    private BigDecimal basetax2;
    @Basic
    @Column(name = "BASETAX3", nullable = false, precision = 3)
    private BigDecimal basetax3;
    @Basic
    @Column(name = "BASETAX4", nullable = false, precision = 3)
    private BigDecimal basetax4;
    @Basic
    @Column(name = "BASETAX5", nullable = false, precision = 3)
    private BigDecimal basetax5;
    @Basic
    @Column(name = "TAXCLASS1", nullable = false)
    private short taxclass1;
    @Basic
    @Column(name = "TAXCLASS2", nullable = false)
    private short taxclass2;
    @Basic
    @Column(name = "TAXCLASS3", nullable = false)
    private short taxclass3;
    @Basic
    @Column(name = "TAXCLASS4", nullable = false)
    private short taxclass4;
    @Basic
    @Column(name = "TAXCLASS5", nullable = false)
    private short taxclass5;
    @Basic
    @Column(name = "SWTAXINCL1", nullable = false)
    private short swtaxincl1;
    @Basic
    @Column(name = "SWTAXINCL2", nullable = false)
    private short swtaxincl2;
    @Basic
    @Column(name = "SWTAXINCL3", nullable = false)
    private short swtaxincl3;
    @Basic
    @Column(name = "SWTAXINCL4", nullable = false)
    private short swtaxincl4;
    @Basic
    @Column(name = "SWTAXINCL5", nullable = false)
    private short swtaxincl5;
    @Basic
    @Column(name = "RATETAX1", nullable = false, precision = 5)
    private BigDecimal ratetax1;
    @Basic
    @Column(name = "RATETAX2", nullable = false, precision = 5)
    private BigDecimal ratetax2;
    @Basic
    @Column(name = "RATETAX3", nullable = false, precision = 5)
    private BigDecimal ratetax3;
    @Basic
    @Column(name = "RATETAX4", nullable = false, precision = 5)
    private BigDecimal ratetax4;
    @Basic
    @Column(name = "RATETAX5", nullable = false, precision = 5)
    private BigDecimal ratetax5;
    @Basic
    @Column(name = "AMTTAX1", nullable = false, precision = 3)
    private BigDecimal amttax1;
    @Basic
    @Column(name = "AMTTAX2", nullable = false, precision = 3)
    private BigDecimal amttax2;
    @Basic
    @Column(name = "AMTTAX3", nullable = false, precision = 3)
    private BigDecimal amttax3;
    @Basic
    @Column(name = "AMTTAX4", nullable = false, precision = 3)
    private BigDecimal amttax4;
    @Basic
    @Column(name = "AMTTAX5", nullable = false, precision = 3)
    private BigDecimal amttax5;
    @Basic
    @Column(name = "IDGLACCT", nullable = false, length = 45)
    private String idglacct;
    @Basic
    @Column(name = "IDACCTTAX", nullable = false, length = 45)
    private String idaccttax;
    @Basic
    @Column(name = "ID1099CLAS", nullable = false, length = 6)
    private String id1099Clas;
    @Basic
    @Column(name = "AMTDIST", nullable = false, precision = 3)
    private BigDecimal amtdist;
    @Basic
    @Column(name = "AMTDISTNET", nullable = false, precision = 3)
    private BigDecimal amtdistnet;
    @Basic
    @Column(name = "AMTINCLTAX", nullable = false, precision = 3)
    private BigDecimal amtincltax;
    @Basic
    @Column(name = "AMTGLDIST", nullable = false, precision = 3)
    private BigDecimal amtgldist;
    @Basic
    @Column(name = "AMTTAXREC1", nullable = false, precision = 3)
    private BigDecimal amttaxrec1;
    @Basic
    @Column(name = "AMTTAXREC2", nullable = false, precision = 3)
    private BigDecimal amttaxrec2;
    @Basic
    @Column(name = "AMTTAXREC3", nullable = false, precision = 3)
    private BigDecimal amttaxrec3;
    @Basic
    @Column(name = "AMTTAXREC4", nullable = false, precision = 3)
    private BigDecimal amttaxrec4;
    @Basic
    @Column(name = "AMTTAXREC5", nullable = false, precision = 3)
    private BigDecimal amttaxrec5;
    @Basic
    @Column(name = "AMTTAXEXP1", nullable = false, precision = 3)
    private BigDecimal amttaxexp1;
    @Basic
    @Column(name = "AMTTAXEXP2", nullable = false, precision = 3)
    private BigDecimal amttaxexp2;
    @Basic
    @Column(name = "AMTTAXEXP3", nullable = false, precision = 3)
    private BigDecimal amttaxexp3;
    @Basic
    @Column(name = "AMTTAXEXP4", nullable = false, precision = 3)
    private BigDecimal amttaxexp4;
    @Basic
    @Column(name = "AMTTAXEXP5", nullable = false, precision = 3)
    private BigDecimal amttaxexp5;
    @Basic
    @Column(name = "AMTTAXTOBE", nullable = false, precision = 3)
    private BigDecimal amttaxtobe;
    @Basic
    @Column(name = "CONTRACT", nullable = false, length = 16)
    private String contract;
    @Basic
    @Column(name = "PROJECT", nullable = false, length = 16)
    private String project;
    @Basic
    @Column(name = "CATEGORY", nullable = false, length = 16)
    private String category;
    @Basic
    @Column(name = "RESOURCE", nullable = false, length = 24)
    private String resource;
    @Basic
    @Column(name = "TRANSNBR", nullable = false)
    private int transnbr;
    @Basic
    @Column(name = "COSTCLASS", nullable = false)
    private short costclass;
    @Basic
    @Column(name = "BILLTYPE", nullable = false)
    private short billtype;
    @Basic
    @Column(name = "IDITEM", nullable = false, length = 16)
    private String iditem;
    @Basic
    @Column(name = "UNITMEAS", nullable = false, length = 10)
    private String unitmeas;
    @Basic
    @Column(name = "QTYINVC", nullable = false, precision = 5)
    private BigDecimal qtyinvc;
    @Basic
    @Column(name = "AMTCOST", nullable = false, precision = 6)
    private BigDecimal amtcost;
    @Basic
    @Column(name = "BILLDATE", nullable = false, precision = 0)
    private int billdate;
    @Basic
    @Column(name = "BILLRATE", nullable = false, precision = 6)
    private BigDecimal billrate;
    @Basic
    @Column(name = "BILLCURN", nullable = false, length = 3)
    private String billcurn;
    @Basic
    @Column(name = "SWIBT", nullable = false)
    private short swibt;
    @Basic
    @Column(name = "SWDISCABL", nullable = false)
    private short swdiscabl;
    @Basic
    @Column(name = "OCNTLINE", nullable = false, precision = 0)
    private int ocntline;
    @Basic
    @Column(name = "RTGAMT", nullable = false, precision = 3)
    private BigDecimal rtgamt;
    @Basic
    @Column(name = "RTGPERCENT", nullable = false, precision = 5)
    private BigDecimal rtgpercent;
    @Basic
    @Column(name = "RTGDAYS", nullable = false)
    private short rtgdays;
    @Basic
    @Column(name = "RTGDATEDUE", nullable = false, precision = 0)
    private int rtgdatedue;
    @Basic
    @Column(name = "SWRTGDDTOV", nullable = false)
    private short swrtgddtov;
    @Basic
    @Column(name = "SWRTGAMTOV", nullable = false)
    private short swrtgamtov;
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
    @Column(name = "RTGDISTTC", nullable = false, precision = 3)
    private BigDecimal rtgdisttc;
    @Basic
    @Column(name = "RTGINVDIST", nullable = false, precision = 3)
    private BigDecimal rtginvdist;
    @Basic
    @Column(name = "TXAMT1RC", nullable = false, precision = 3)
    private BigDecimal txamt1Rc;
    @Basic
    @Column(name = "TXAMT2RC", nullable = false, precision = 3)
    private BigDecimal txamt2Rc;
    @Basic
    @Column(name = "TXAMT3RC", nullable = false, precision = 3)
    private BigDecimal txamt3Rc;
    @Basic
    @Column(name = "TXAMT4RC", nullable = false, precision = 3)
    private BigDecimal txamt4Rc;
    @Basic
    @Column(name = "TXAMT5RC", nullable = false, precision = 3)
    private BigDecimal txamt5Rc;
    @Basic
    @Column(name = "TXTOTRC", nullable = false, precision = 3)
    private BigDecimal txtotrc;
    @Basic
    @Column(name = "TXALLRC", nullable = false, precision = 3)
    private BigDecimal txallrc;
    @Basic
    @Column(name = "TXEXP1RC", nullable = false, precision = 3)
    private BigDecimal txexp1Rc;
    @Basic
    @Column(name = "TXEXP2RC", nullable = false, precision = 3)
    private BigDecimal txexp2Rc;
    @Basic
    @Column(name = "TXEXP3RC", nullable = false, precision = 3)
    private BigDecimal txexp3Rc;
    @Basic
    @Column(name = "TXEXP4RC", nullable = false, precision = 3)
    private BigDecimal txexp4Rc;
    @Basic
    @Column(name = "TXEXP5RC", nullable = false, precision = 3)
    private BigDecimal txexp5Rc;
    @Basic
    @Column(name = "TXREC1RC", nullable = false, precision = 3)
    private BigDecimal txrec1Rc;
    @Basic
    @Column(name = "TXREC2RC", nullable = false, precision = 3)
    private BigDecimal txrec2Rc;
    @Basic
    @Column(name = "TXREC3RC", nullable = false, precision = 3)
    private BigDecimal txrec3Rc;
    @Basic
    @Column(name = "TXREC4RC", nullable = false, precision = 3)
    private BigDecimal txrec4Rc;
    @Basic
    @Column(name = "TXREC5RC", nullable = false, precision = 3)
    private BigDecimal txrec5Rc;
    @Basic
    @Column(name = "TXBSERT1TC", nullable = false, precision = 3)
    private BigDecimal txbsert1Tc;
    @Basic
    @Column(name = "TXBSERT2TC", nullable = false, precision = 3)
    private BigDecimal txbsert2Tc;
    @Basic
    @Column(name = "TXBSERT3TC", nullable = false, precision = 3)
    private BigDecimal txbsert3Tc;
    @Basic
    @Column(name = "TXBSERT4TC", nullable = false, precision = 3)
    private BigDecimal txbsert4Tc;
    @Basic
    @Column(name = "TXBSERT5TC", nullable = false, precision = 3)
    private BigDecimal txbsert5Tc;
    @Basic
    @Column(name = "TXAMTRT1TC", nullable = false, precision = 3)
    private BigDecimal txamtrt1Tc;
    @Basic
    @Column(name = "TXAMTRT2TC", nullable = false, precision = 3)
    private BigDecimal txamtrt2Tc;
    @Basic
    @Column(name = "TXAMTRT3TC", nullable = false, precision = 3)
    private BigDecimal txamtrt3Tc;
    @Basic
    @Column(name = "TXAMTRT4TC", nullable = false, precision = 3)
    private BigDecimal txamtrt4Tc;
    @Basic
    @Column(name = "TXAMTRT5TC", nullable = false, precision = 3)
    private BigDecimal txamtrt5Tc;
    @Basic
    @Column(name = "TXBSE1HC", nullable = false, precision = 3)
    private BigDecimal txbse1Hc;
    @Basic
    @Column(name = "TXBSE2HC", nullable = false, precision = 3)
    private BigDecimal txbse2Hc;
    @Basic
    @Column(name = "TXBSE3HC", nullable = false, precision = 3)
    private BigDecimal txbse3Hc;
    @Basic
    @Column(name = "TXBSE4HC", nullable = false, precision = 3)
    private BigDecimal txbse4Hc;
    @Basic
    @Column(name = "TXBSE5HC", nullable = false, precision = 3)
    private BigDecimal txbse5Hc;
    @Basic
    @Column(name = "TXAMT1HC", nullable = false, precision = 3)
    private BigDecimal txamt1Hc;
    @Basic
    @Column(name = "TXAMT2HC", nullable = false, precision = 3)
    private BigDecimal txamt2Hc;
    @Basic
    @Column(name = "TXAMT3HC", nullable = false, precision = 3)
    private BigDecimal txamt3Hc;
    @Basic
    @Column(name = "TXAMT4HC", nullable = false, precision = 3)
    private BigDecimal txamt4Hc;
    @Basic
    @Column(name = "TXAMT5HC", nullable = false, precision = 3)
    private BigDecimal txamt5Hc;
    @Basic
    @Column(name = "TXAMTRT1HC", nullable = false, precision = 3)
    private BigDecimal txamtrt1Hc;
    @Basic
    @Column(name = "TXAMTRT2HC", nullable = false, precision = 3)
    private BigDecimal txamtrt2Hc;
    @Basic
    @Column(name = "TXAMTRT3HC", nullable = false, precision = 3)
    private BigDecimal txamtrt3Hc;
    @Basic
    @Column(name = "TXAMTRT4HC", nullable = false, precision = 3)
    private BigDecimal txamtrt4Hc;
    @Basic
    @Column(name = "TXAMTRT5HC", nullable = false, precision = 3)
    private BigDecimal txamtrt5Hc;
    @Basic
    @Column(name = "TXREC1HC", nullable = false, precision = 3)
    private BigDecimal txrec1Hc;
    @Basic
    @Column(name = "TXREC2HC", nullable = false, precision = 3)
    private BigDecimal txrec2Hc;
    @Basic
    @Column(name = "TXREC3HC", nullable = false, precision = 3)
    private BigDecimal txrec3Hc;
    @Basic
    @Column(name = "TXREC4HC", nullable = false, precision = 3)
    private BigDecimal txrec4Hc;
    @Basic
    @Column(name = "TXREC5HC", nullable = false, precision = 3)
    private BigDecimal txrec5Hc;
    @Basic
    @Column(name = "TXEXP1HC", nullable = false, precision = 3)
    private BigDecimal txexp1Hc;
    @Basic
    @Column(name = "TXEXP2HC", nullable = false, precision = 3)
    private BigDecimal txexp2Hc;
    @Basic
    @Column(name = "TXEXP3HC", nullable = false, precision = 3)
    private BigDecimal txexp3Hc;
    @Basic
    @Column(name = "TXEXP4HC", nullable = false, precision = 3)
    private BigDecimal txexp4Hc;
    @Basic
    @Column(name = "TXEXP5HC", nullable = false, precision = 3)
    private BigDecimal txexp5Hc;
    @Basic
    @Column(name = "TXALLHC", nullable = false, precision = 3)
    private BigDecimal txallhc;
    @Basic
    @Column(name = "TXALL1HC", nullable = false, precision = 3)
    private BigDecimal txall1Hc;
    @Basic
    @Column(name = "TXALL2HC", nullable = false, precision = 3)
    private BigDecimal txall2Hc;
    @Basic
    @Column(name = "TXALL3HC", nullable = false, precision = 3)
    private BigDecimal txall3Hc;
    @Basic
    @Column(name = "TXALL4HC", nullable = false, precision = 3)
    private BigDecimal txall4Hc;
    @Basic
    @Column(name = "TXALL5HC", nullable = false, precision = 3)
    private BigDecimal txall5Hc;
    @Basic
    @Column(name = "TXALL1TC", nullable = false, precision = 3)
    private BigDecimal txall1Tc;
    @Basic
    @Column(name = "TXALL2TC", nullable = false, precision = 3)
    private BigDecimal txall2Tc;
    @Basic
    @Column(name = "TXALL3TC", nullable = false, precision = 3)
    private BigDecimal txall3Tc;
    @Basic
    @Column(name = "TXALL4TC", nullable = false, precision = 3)
    private BigDecimal txall4Tc;
    @Basic
    @Column(name = "TXALL5TC", nullable = false, precision = 3)
    private BigDecimal txall5Tc;
    @Basic
    @Column(name = "AMTCOSTHC", nullable = false, precision = 6)
    private BigDecimal amtcosthc;
    @Basic
    @Column(name = "AMTDISTHC", nullable = false, precision = 3)
    private BigDecimal amtdisthc;
    @Basic
    @Column(name = "DISTNETHC", nullable = false, precision = 3)
    private BigDecimal distnethc;
    @Basic
    @Column(name = "RTGAMTHC", nullable = false, precision = 3)
    private BigDecimal rtgamthc;
    @Basic
    @Column(name = "TXALLRTHC", nullable = false, precision = 3)
    private BigDecimal txallrthc;
    @Basic
    @Column(name = "TXALLRTTC", nullable = false, precision = 3)
    private BigDecimal txallrttc;
    @Basic
    @Column(name = "TXEXPRTHC", nullable = false, precision = 3)
    private BigDecimal txexprthc;
    @Basic
    @Column(name = "TXEXPRTTC", nullable = false, precision = 3)
    private BigDecimal txexprttc;
    @Basic
    @Column(name = "SWFAS", nullable = false)
    private short swfas;
    @Basic
    @Column(name = "AMTWHT1TC", nullable = false, precision = 3)
    private BigDecimal amtwht1Tc;
    @Basic
    @Column(name = "AMTWHT2TC", nullable = false, precision = 3)
    private BigDecimal amtwht2Tc;
    @Basic
    @Column(name = "AMTWHT3TC", nullable = false, precision = 3)
    private BigDecimal amtwht3Tc;
    @Basic
    @Column(name = "AMTWHT4TC", nullable = false, precision = 3)
    private BigDecimal amtwht4Tc;
    @Basic
    @Column(name = "AMTWHT5TC", nullable = false, precision = 3)
    private BigDecimal amtwht5Tc;
    @Basic
    @Column(name = "AMTCXTX1TC", nullable = false, precision = 3)
    private BigDecimal amtcxtx1Tc;
    @Basic
    @Column(name = "AMTCXTX2TC", nullable = false, precision = 3)
    private BigDecimal amtcxtx2Tc;
    @Basic
    @Column(name = "AMTCXTX3TC", nullable = false, precision = 3)
    private BigDecimal amtcxtx3Tc;
    @Basic
    @Column(name = "AMTCXTX4TC", nullable = false, precision = 3)
    private BigDecimal amtcxtx4Tc;
    @Basic
    @Column(name = "AMTCXTX5TC", nullable = false, precision = 3)
    private BigDecimal amtcxtx5Tc;
    @Basic
    @Column(name = "SWCAXABLE1", nullable = false)
    private short swcaxable1;
    @Basic
    @Column(name = "SWCAXABLE2", nullable = false)
    private short swcaxable2;
    @Basic
    @Column(name = "SWCAXABLE3", nullable = false)
    private short swcaxable3;
    @Basic
    @Column(name = "SWCAXABLE4", nullable = false)
    private short swcaxable4;
    @Basic
    @Column(name = "SWCAXABLE5", nullable = false)
    private short swcaxable5;


}
