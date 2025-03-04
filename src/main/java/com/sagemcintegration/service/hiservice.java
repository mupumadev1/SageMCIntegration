package com.sagemcintegration.service;

import com.sagemcintegration.dto.infoDTO;
import com.sagemcintegration.dto.requestDTO;
import com.sagemcintegration.model.mssql.hi.gl.*;
import com.sagemcintegration.model.mssql.hi.ap.*;
import com.sagemcintegration.model.mysql.ProcessedTransactions;
import com.sagemcintegration.repository.mssql.hi.ap.*;
import com.sagemcintegration.repository.mssql.hi.gl.*;
import com.sagemcintegration.repository.mssql.ic.ap.Apven_repo;
import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class hiservice {
    private final HIGljeh_repo HIGljeh_repo;
    private final HIGljed_repo HIGljed_repo;
    private final HIGlbctl_repo HIGlbctl_repo;
    private final HIApibc_repo HIApibc_repo;
    private final HIApibh_repo HIApibh_repo;
    private final HIApibd_repo HIApibd_repo;
    private final HIApibs_repo HIApibs_repo;
    private final HIApp02_repo HIApp02_repo;
    private final HIApven_repo HIApven_repo;
    private final com.sagemcintegration.repository.mysql.processedTransactions_repo processedTransactions_repo;
    private final HIGL01repo HIGL01Repo;
    private final HIGlamf_repo HIGlamf_repo;
    private final Apven_repo apven_repo;

    public Boolean findByAccountIdHI(requestDTO requestDTO) {
        for (infoDTO accounts : requestDTO.getDebits()) {
            Optional<Glamf> fetchedAcc = HIGlamf_repo.findByAcctfmttd(accounts.getAccountId());
            Optional<Apven> fetchedCreditNoteDebitAcc = HIApven_repo.findByVendorid(accounts.getAccountId());

            if (fetchedAcc.isEmpty() || fetchedCreditNoteDebitAcc.isEmpty()) {
                return false;
            }
        }
        return true;


    }
    public String formatInvoiceNumber(String rawInv){
        String formattedInv = "INV" + rawInv;
        // Calculate the number of zeros needed to reach 13 characters
        int requiredLength = 13;
        int currentLength = formattedInv.length();
        // If the current length is less than required, pad with zeros
        if (currentLength < requiredLength) {
            // Calculate how many zeros are needed
            int zerosNeeded = requiredLength - currentLength;
            // Create a string of zeros
            return formattedInv + "0".repeat(zerosNeeded) // Append zeros at the end
                    ;
        } else if (currentLength > requiredLength) {
            // If the length exceeds, truncate to keep only the last 13 characters
            return formattedInv.substring(currentLength - requiredLength);
        } else {
            // If already 13 characters long, return as is
            return formattedInv;
        }
    }

    public String batchIDChecker(final String BatchId) {


        String ID = "";
        final int id = Integer.parseInt(BatchId);
        if (id <= 9) {
            final String temp = Integer.toString(id);
            ID = "00000" + temp;
        }
        if (id > 9) {
            final String temp = Integer.toString(id);
            ID = "0000" + temp;
        }
        if (id >= 100) {
            final String temp = Integer.toString(id);
            ID = "000" + temp;
        }
        if (id >= 1000) {
            final String temp = Integer.toString(id);
            ID = "00" + temp;
        }
        if (id >= 10000) {
            final String temp = Integer.toString(id);
            ID = "0" + temp;
        }
        if (id >= 100000) {
            final String temp = ID = Integer.toString(id);
        }
        return ID;
    }

    public int getBatchID() {
        Long maxID = HIGlbctl_repo.findMaxBatchId();
        int maxId = maxID.intValue();
        return ++maxId;
    }

    public void updateNextBatchNoHI(String todaysBatch) {
        String btch = todaysBatch.replaceAll("^0+(?!$)", "");
        int intBatch = Integer.parseInt(btch);
        Optional<Gl01> gl01 = HIGL01Repo.findByOptionid("GL01");
        if (gl01.isPresent()) {
            Gl01 gl011 = gl01.get();
            gl011.setNextbtchno(intBatch+1);
            HIGL01Repo.save(gl011);
        }
    }

    public int currentDate() {
        LocalDate date0 = LocalDate.now();
        String dateString = date0.toString();
        String cleanedDate = dateString.replaceAll(("-*"), "");
        return Integer.parseInt(cleanedDate);
    }



    public String currentTime() {
        Date date1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmssSS");
        String time1 = sdf.format(date1);
        String time = time1.substring(0, 8);
        return time;
    }

    public int[] getMonthYear() {
        LocalDate date0 = LocalDate.now();
        int[] monthYear = new int[2];
        monthYear[0] = date0.getMonthValue();
        monthYear[1] = date0.getYear();
        return monthYear;
    }

    public BigDecimal bigDecimalValue(String amt) {
        double doubleValue = Double.parseDouble(amt);
        return BigDecimal.valueOf(doubleValue);
    }

    public String validateReference(String ref) {
        if (ref.length() > 60) {
            return ref.substring(0, 59);
        }
        return ref;
    }




    public int getAPBatchNumber() {
        int batchNo = HIApp02_repo.findbatchid();
        return ++batchNo;
    }

    public void updateBatchNumberHI() {
        Optional<App02> result = HIApp02_repo.findByRecid02("APP02");
        if (result.isPresent()) {
            App02 app02 = result.get();
            app02.setInvcbtch(app02.getInvcbtch() + 1);
            app02.setCntnextinv(app02.getCntnextinv() + 1);
            HIApp02_repo.save(app02);
        }
    }
    public boolean checkVendorAccountHI(requestDTO invoiceDto){
        Optional<Apven> obj = HIApven_repo.findByVendorid(invoiceDto.getCreditAccountId());
        return obj.isPresent();
    }
    public boolean insertApibcHI(requestDTO invoiceDto) {
        int batch = getAPBatchNumber();
        System.out.print(batch);
        Apibc apibc = Apibc.builder()
                .cntbtch(batch)
                .audtdate(currentDate())
                .audttime(Integer.parseInt(currentTime()))
                .audtuser("ADMIN")
                .audtorg("ICLCOM")
                .datebtch(Integer.parseInt(invoiceDto.getTransactionDate()))
                .btchdesc(validateReference(invoiceDto.getTransactionDescription()))
                .cntinvcent(1)
                .amtentr(bigDecimalValue(invoiceDto.getDebitAmount()))
                .btchtype((short) 5)
                .btchstts((short) 1)
                .invctype((short) 1)
                .cntlstitem(2)
                .postseqnbr(0)
                .nbrerrors(0)
                .dtelstedit(Integer.parseInt(invoiceDto.getTransactionDate()))
                .swprinted((short) 0)
                .srceappl("AP")
                .swict((short) 0)
                .build();
        Apibc obj = HIApibc_repo.save(apibc);
        Optional<Apibc> fetchedObj = HIApibc_repo.findById(obj.getCntbtch());
        return fetchedObj.isPresent();
    }

    public boolean insertApibhHI(requestDTO invoiceDto) {
        Optional<Apven> obj = HIApven_repo.findByVendorid(invoiceDto.getCreditAccountId());
        String vendorId = obj.map(Apven::getVendorid).orElse(null);
        String vendorName = obj.map(Apven::getVendname).orElse(null);
        int month = getMonthYear()[0];
        int year = getMonthYear()[1];
        String period = Integer.toString(month);
        String fiscyr = Integer.toString(year);
        int batch = getAPBatchNumber();
        String vatcode = "VATIN" + invoiceDto.getCurrency();
        Apibh apibh = Apibh.builder()
                .apibhPK(ApibhPK.builder()
                        .cntbtch(batch)
                        .cntitem(1)
                        .build())
                .audtdate(currentDate())
                .audttime(Integer.parseInt(currentTime()))
                .audtuser("ADMIN")
                .audtorg("ICLCOM")
                .idvend(vendorId)
                .idinvc("INV" + invoiceDto.getTransactionReference())
                .idrmitto("")
                .texttrx((short) 1)
                .idtrx((short) 12)
                .invcstts((short) 0)
                .ordrnbr("")
                .ponbr("")
                .invcdesc(validateReference(invoiceDto.getTransactionDescription()))
                .swprtinvc((short) 0)
                .invcapplto("")
                .idacctset(invoiceDto.getCurrency())
                .dateinvc(currentDate())
                .dateasof(currentDate())
                .fiscyr(fiscyr)
                .fiscper(period)
                .codecurn(invoiceDto.getCurrency())
                .ratetype("SP")
                .swmanrte((short) 0)
                .exchratehc(BigDecimal.valueOf(1))
                .origratehc(BigDecimal.valueOf(1))
                .termcode("45DAYS")
                .swtermovrd((short) 1)
                .datedue(currentDate())
                .datedisc(0)
                .pctdisc(BigDecimal.valueOf(0))
                .amtdiscavl(BigDecimal.valueOf(0))
                .lastline(1)
                .swtaxbl((short) 0)
                .swcalctx((short) 0)
                .codetaxgrp("INZMW01")
                .codetax1("VAT"+invoiceDto.getCurrency())
                .codetax2("")
                .codetax3("")
                .codetax4("")
                .codetax5("")
                .taxclass1(invoiceDto.getTaxClass())
                .taxclass2((short) 0)
                .taxclass3((short) 0)
                .taxclass4((short) 0)
                .taxclass5((short) 0)
                .basetax1(bigDecimalValue(invoiceDto.getCreditTaxableAmount()))
                .basetax2(BigDecimal.valueOf(0))
                .basetax3(BigDecimal.valueOf(0))
                .basetax4(BigDecimal.valueOf(0))
                .basetax5(BigDecimal.valueOf(0))
                .amttax1(bigDecimalValue(invoiceDto.getCreditTaxAmount()))
                .amttax2(BigDecimal.valueOf(0))
                .amttax3(BigDecimal.valueOf(0))
                .amttax4(BigDecimal.valueOf(0))
                .amttax5(BigDecimal.valueOf(0))
                .amt1099(BigDecimal.valueOf(0))
                .amtdistset(BigDecimal.valueOf(0))
                .amttaxdist(bigDecimalValue(invoiceDto.getCreditTaxAmount()))
                .amtinvctot(bigDecimalValue(invoiceDto.getCreditAmount()))
                .amtalloctx(BigDecimal.valueOf(0))
                .cntpaymsch(1)
                .amttotdist(bigDecimalValue(invoiceDto.getCreditAmount()))
                .amtgrosdst(bigDecimalValue(invoiceDto.getCreditAmount()))
                .idppd("")
                .textrmit("")
                .textste1("")
                .textste2("")
                .textste3("")
                .textste4("")
                .namecity("")
                .codestte("")
                .codepstl("")
                .codectry("")
                .namectac("")
                .textphon("")
                .textfax("")
                .daterate(Integer.parseInt(formattedDate(invoiceDto.getTransactionDate())))
                .amtrectax(bigDecimalValue(invoiceDto.getCreditTaxAmount()))
                .codepayppd(0)
                .codevndgrp(invoiceDto.getCurrency())
                .termsdesc("45Days")
                .iddistset("")
                .id1099Clas("")
                .amttaxtot(bigDecimalValue(invoiceDto.getCreditTaxAmount()))
                .amtgrostot(bigDecimalValue(invoiceDto.getCreditAmount()))
                .swtaxincl1((short) 0)
                .swtaxincl2((short) 0)
                .swtaxincl3((short) 0)
                .swtaxincl4((short) 0)
                .swtaxincl5((short) 0)
                .amtexptax(BigDecimal.valueOf(0))
                .amtaxtobe(BigDecimal.valueOf(0))
                .taxoutbal(BigDecimal.valueOf(0))
                .codeoper((short) 1)
                .acctrec1("12140")
                .acctrec2("")
                .acctrec3("")
                .acctrec4("")
                .acctrec5("")
                .acctexp1("")
                .acctexp2("")
                .acctexp3("")
                .acctexp4("")
                .acctexp5("")
                .drillapp("")
                .drilltype((short) 0)
                .drilldwnlk(0)
                .swjob((short) 0)
                .amtrecdist(BigDecimal.valueOf(0))
                .amtexpdist(BigDecimal.valueOf(0))
                .errbatch(0)
                .errentry(0)
                .email("")
                .ctacphone("")
                .ctacfax("")
                .ctacemail("")
                .amtppd(BigDecimal.valueOf(0))
                .idstdinvc("")
                .dateprcs(0)
                .amtdsbwtax(bigDecimalValue(invoiceDto.getCreditAmount()))
                .amtdsbntax(bigDecimalValue(invoiceDto.getCreditTaxableAmount()))
                .amtdscbase(bigDecimalValue(invoiceDto.getCreditAmount()))
                .swrtginvc((short) 0)
                .rtgapplyto("")
                .swrtg((short) 0)
                .rtgamt(BigDecimal.valueOf(0))
                .rtgpercent(BigDecimal.valueOf(0))
                .rtgdays((short) 0)
                .rtgdatedue(0)
                .rtgterms("")
                .swrtgddtov((short) 0)
                .swrtgamtov((short) 0)
                .swrtgrate((short) 0)
                .swtxbsectl((short) 0)
                .values(0)
                .origcomp("")
                .detailcnt(invoiceDto.getDebits().toArray().length)
                .srceappl("AP")
                .swhold((short) 0)
                .apversion("67A")
                .taxversion(1)
                .swtxrtgrpt((short) 0)
                .codecurnrc(invoiceDto.getCurrency())
                .swtxctlrc((short) 0)
                .raterc(BigDecimal.valueOf(1))
                .ratetyperc("SP")
                .ratedaterc(Integer.parseInt(formattedDate(invoiceDto.getTransactionDate())))
                .rateoprc((short) 1)
                .swraterc((short) 0)
                .txamt1Rc(bigDecimalValue(invoiceDto.getCreditTaxAmount()))
                .txamt2Rc(BigDecimal.valueOf(0))
                .txamt3Rc(BigDecimal.valueOf(0))
                .txamt4Rc(BigDecimal.valueOf(0))
                .txamt5Rc(BigDecimal.valueOf(0))
                .txtotrc(bigDecimalValue(invoiceDto.getCreditTaxAmount()))
                .txallrc(BigDecimal.valueOf(0))
                .txexprc(BigDecimal.valueOf(0))
                .txrecrc(BigDecimal.valueOf(0))
                .txbsert1Tc(BigDecimal.valueOf(0))
                .txbsert2Tc(BigDecimal.valueOf(0))
                .txbsert3Tc(BigDecimal.valueOf(0))
                .txbsert4Tc(BigDecimal.valueOf(0))
                .txbsert5Tc(BigDecimal.valueOf(0))
                .txamtrt1Tc(BigDecimal.valueOf(0))
                .txamtrt2Tc(BigDecimal.valueOf(0))
                .txamtrt3Tc(BigDecimal.valueOf(0))
                .txamtrt4Tc(BigDecimal.valueOf(0))
                .txamtrt5Tc(BigDecimal.valueOf(0))
                .txbse1Hc(bigDecimalValue(invoiceDto.getCreditTaxableAmount()))
                .txbse2Hc(BigDecimal.valueOf(0))
                .txbse3Hc(BigDecimal.valueOf(0))
                .txbse4Hc(BigDecimal.valueOf(0))
                .txbse5Hc(BigDecimal.valueOf(0))
                .txamt1Hc(bigDecimalValue(invoiceDto.getCreditTaxAmount()))
                .txamt2Hc(BigDecimal.valueOf(0))
                .txamt3Hc(BigDecimal.valueOf(0))
                .txamt4Hc(BigDecimal.valueOf(0))
                .txamt5Hc(BigDecimal.valueOf(0))
                .amtgroshc(BigDecimal.valueOf(1000))
                .rtgamthc(BigDecimal.valueOf(0))
                .amtdischc(BigDecimal.valueOf(0))
                .amt1099Hc(BigDecimal.valueOf(0))
                .amtppdhc(BigDecimal.valueOf(0))
                .amtduetc(bigDecimalValue(invoiceDto.getCreditAmount()))
                .amtduehc(bigDecimalValue(invoiceDto.getCreditAmount()))
                .textven(vendorName)
                .enteredby("ADMIN")
                .datebus(currentDate())
                .idn("")
                .amtwht1Tc(BigDecimal.valueOf(0))
                .amtwht2Tc(BigDecimal.valueOf(0))
                .amtwht3Tc(BigDecimal.valueOf(0))
                .amtwht4Tc(BigDecimal.valueOf(0))
                .amtwht5Tc(BigDecimal.valueOf(0))
                .amtcxbs1Tc(BigDecimal.valueOf(0))
                .amtcxbs2Tc(BigDecimal.valueOf(0))
                .amtcxbs3Tc(BigDecimal.valueOf(0))
                .amtcxbs4Tc(BigDecimal.valueOf(0))
                .amtcxbs5Tc(BigDecimal.valueOf(0))
                .amtcxtx1Tc(BigDecimal.valueOf(0))
                .amtcxtx2Tc(BigDecimal.valueOf(0))
                .amtcxtx3Tc(BigDecimal.valueOf(0))
                .amtcxtx4Tc(BigDecimal.valueOf(0))
                .amtcxtx5Tc(BigDecimal.valueOf(0))
                .build();
        HIApibh_repo.save(apibh);
        return true;
    }
public Optional<Glbctl> checkJournalDuplicatesHi(String desc){
        return HIGlbctl_repo.findByBtchdescAndBatchstat(desc,"1");
}
    public boolean insertApibdHI(requestDTO invoiceDto) {
        int batch = getAPBatchNumber();
        int cntline =20;
        for (infoDTO dto : invoiceDto.getDebits()) {

            Apibd apibd = Apibd.builder()
                    .apibdPK(ApibdPK.builder()
                            .cntbtch(batch)
                            .cntitem(1)
                            .cntline(cntline)
                            .build())
                    .audtdate(currentDate())
                    .audttime(Integer.parseInt(currentTime()))
                    .audtorg("ADMIN")
                    .audtuser("ICLCOM")
                    .iddist("")
                    .textdesc(validateReference(invoiceDto.getTransactionDescription()))
                    .swmanldist((short) 0)
                    .amttottax(BigDecimal.valueOf(0))
                    .swmanltx((short) 0)
                    .basetax1(bigDecimalValue(dto.getAmount()))
                    .basetax2(BigDecimal.valueOf(0))
                    .basetax3(BigDecimal.valueOf(0))
                    .basetax4(BigDecimal.valueOf(0))
                    .basetax5(BigDecimal.valueOf(0))
                    .taxclass1((short) 1)
                    .taxclass2((short) 0)
                    .taxclass3((short) 0)
                    .taxclass4((short) 0)
                    .taxclass5((short) 0)
                    .swtaxincl1((short) 0)
                    .swtaxincl2((short) 0)
                    .swtaxincl3((short) 0)
                    .swtaxincl4((short) 0)
                    .swtaxincl5((short) 0)
                    .ratetax1(bigDecimalValue((invoiceDto.getTaxClass()==(short) 1?"16.0":"0.0")))
                    .ratetax2(BigDecimal.valueOf(0))
                    .ratetax3(BigDecimal.valueOf(0))
                    .ratetax4(BigDecimal.valueOf(0))
                    .ratetax5(BigDecimal.valueOf(0))
                    .amttax1(bigDecimalValue(dto.getTaxAmount()))
                    .amttax2(BigDecimal.valueOf(0))
                    .amttax3(BigDecimal.valueOf(0))
                    .amttax4(BigDecimal.valueOf(0))
                    .amttax5(BigDecimal.valueOf(0))
                    .idglacct(dto.getAccountId())
                    .idaccttax(dto.getAccountId())
                    .id1099Clas("")
                    .amtdist(bigDecimalValue(dto.getTotalAmount()))
                    .amtdistnet(bigDecimalValue(dto.getTotalAmount()))
                    .amtincltax(BigDecimal.valueOf(0))
                    .amtgldist(bigDecimalValue(dto.getTotalAmount()))
                    .amttaxrec1(bigDecimalValue(dto.getTaxAmount()))
                    .amttaxrec2(BigDecimal.valueOf(0))
                    .amttaxrec3(BigDecimal.valueOf(0))
                    .amttaxrec4(BigDecimal.valueOf(0))
                    .amttaxrec5(BigDecimal.valueOf(0))
                    .amttaxexp1(BigDecimal.valueOf(0))
                    .amttaxexp2(BigDecimal.valueOf(0))
                    .amttaxexp3(BigDecimal.valueOf(0))
                    .amttaxexp4(BigDecimal.valueOf(0))
                    .amttaxexp5(BigDecimal.valueOf(0))
                    .amttaxtobe(BigDecimal.valueOf(0))
                    .contract("")
                    .project("")
                    .category("")
                    .resource("")
                    .transnbr(0)
                    .costclass((short) 0)
                    .billtype((short) 0)
                    .iditem("")
                    .unitmeas("")
                    .qtyinvc(BigDecimal.valueOf(0))
                    .amtcost(BigDecimal.valueOf(1))
                    .billdate(0)
                    .billrate(BigDecimal.valueOf(0))
                    .billcurn(String.valueOf(0))
                    .swibt((short) 0)
                    .swdiscabl((short) 0)
                    .ocntline(0)
                    .rtgamt(BigDecimal.valueOf(0))
                    .rtgpercent(BigDecimal.valueOf(0))
                    .rtgdays((short) 0)
                    .rtgdatedue(0)
                    .swrtgddtov((short) 0)
                    .swrtgamtov((short) 0)
                    .values(0)
                    .descomp("")
                    .route((short) 0)
                    .rtgdisttc(BigDecimal.valueOf(0))
                    .rtginvdist(BigDecimal.valueOf(0))
                    .txamt1Rc(bigDecimalValue(dto.getTaxAmount()))
                    .txamt2Rc(BigDecimal.valueOf(0))
                    .txamt3Rc(BigDecimal.valueOf(0))
                    .txamt4Rc(BigDecimal.valueOf(0))
                    .txamt5Rc(BigDecimal.valueOf(0))
                    .txtotrc(bigDecimalValue(dto.getTaxAmount()))
                    .txallrc(BigDecimal.valueOf(0))
                    .txexp1Rc(BigDecimal.valueOf(0))
                    .txexp2Rc(BigDecimal.valueOf(0))
                    .txexp3Rc(BigDecimal.valueOf(0))
                    .txexp4Rc(BigDecimal.valueOf(0))
                    .txexp5Rc(BigDecimal.valueOf(0))
                    .txrec1Rc(bigDecimalValue(dto.getTaxAmount()))
                    .txrec2Rc(BigDecimal.valueOf(0))
                    .txrec3Rc(BigDecimal.valueOf(0))
                    .txrec4Rc(BigDecimal.valueOf(0))
                    .txrec5Rc(BigDecimal.valueOf(0))
                    .txbsert1Tc(BigDecimal.valueOf(0))
                    .txbsert2Tc(BigDecimal.valueOf(0))
                    .txbsert3Tc(BigDecimal.valueOf(0))
                    .txbsert4Tc(BigDecimal.valueOf(0))
                    .txbsert5Tc(BigDecimal.valueOf(0))
                    .txamtrt1Tc(BigDecimal.valueOf(0))
                    .txamtrt2Tc(BigDecimal.valueOf(0))
                    .txamtrt3Tc(BigDecimal.valueOf(0))
                    .txamtrt4Tc(BigDecimal.valueOf(0))
                    .txamtrt5Tc(BigDecimal.valueOf(0))
                    .txbse1Hc(bigDecimalValue(dto.getAmount()))
                    .txbse2Hc(BigDecimal.valueOf(0))
                    .txbse3Hc(BigDecimal.valueOf(0))
                    .txbse4Hc(BigDecimal.valueOf(0))
                    .txbse5Hc(BigDecimal.valueOf(0))
                    .txamt1Hc(bigDecimalValue(dto.getTaxAmount()))
                    .txamt2Hc(BigDecimal.valueOf(0))
                    .txamt3Hc(BigDecimal.valueOf(0))
                    .txamt4Hc(BigDecimal.valueOf(0))
                    .txamt5Hc(BigDecimal.valueOf(0))
                    .txamtrt1Hc(BigDecimal.valueOf(0))
                    .txamtrt2Hc(BigDecimal.valueOf(0))
                    .txamtrt3Hc(BigDecimal.valueOf(0))
                    .txamtrt4Hc(BigDecimal.valueOf(0))
                    .txamtrt5Hc(BigDecimal.valueOf(0))
                    .txrec1Hc(bigDecimalValue(dto.getTaxAmount()))
                    .txrec2Hc(BigDecimal.valueOf(0))
                    .txrec3Hc(BigDecimal.valueOf(0))
                    .txrec4Hc(BigDecimal.valueOf(0))
                    .txrec5Hc(BigDecimal.valueOf(0))
                    .txexp1Hc(BigDecimal.valueOf(0))
                    .txexp2Hc(BigDecimal.valueOf(0))
                    .txexp3Hc(BigDecimal.valueOf(0))
                    .txexp4Hc(BigDecimal.valueOf(0))
                    .txexp5Hc(BigDecimal.valueOf(0))
                    .txallhc(BigDecimal.valueOf(0))
                    .txall1Hc(BigDecimal.valueOf(0))
                    .txall2Hc(BigDecimal.valueOf(0))
                    .txall3Hc(BigDecimal.valueOf(0))
                    .txall4Hc(BigDecimal.valueOf(0))
                    .txall5Hc(BigDecimal.valueOf(0))
                    .txall1Tc(BigDecimal.valueOf(0))
                    .txall2Tc(BigDecimal.valueOf(0))
                    .txall3Tc(BigDecimal.valueOf(0))
                    .txall4Tc(BigDecimal.valueOf(0))
                    .txall5Tc(BigDecimal.valueOf(0))
                    .amtcosthc(BigDecimal.valueOf(0))
                    .amtdisthc(bigDecimalValue(dto.getAmount()))
                    .distnethc(bigDecimalValue(dto.getAmount()))
                    .rtgamthc(BigDecimal.valueOf(0))
                    .txallrthc(BigDecimal.valueOf(0))
                    .txallrttc(BigDecimal.valueOf(0))
                    .txexprthc(BigDecimal.valueOf(0))
                    .txexprttc(BigDecimal.valueOf(0))
                    .swfas((short) 0)
                    .amtwht1Tc(BigDecimal.valueOf(0))
                    .amtwht2Tc(BigDecimal.valueOf(0))
                    .amtwht3Tc(BigDecimal.valueOf(0))
                    .amtwht4Tc(BigDecimal.valueOf(0))
                    .amtwht5Tc(BigDecimal.valueOf(0))
                    .amtcxtx1Tc(BigDecimal.valueOf(0))
                    .amtcxtx2Tc(BigDecimal.valueOf(0))
                    .amtcxtx3Tc(BigDecimal.valueOf(0))
                    .amtcxtx4Tc(BigDecimal.valueOf(0))
                    .amtcxtx5Tc(BigDecimal.valueOf(0))
                    .swcaxable1((short) 0)
                    .swcaxable2((short) 0)
                    .swcaxable3((short) 0)
                    .swcaxable4((short) 0)
                    .swcaxable5((short) 0)
                    .build();
            HIApibd_repo.save(apibd);
            cntline +=10;
        }
        return true;
    }
    public String formattedDate(String date){
        return date.replaceAll("\\-", "");
    }

    public boolean insertApibsHI(requestDTO invoiceDto) {

        int batch = getAPBatchNumber();
        Apibs apibs = Apibs.builder()
                .apibsPK(ApibsPK.builder()
                        .cntbtch(batch)
                        .cntpaym(1)
                        .cntitem(1)
                        .build())
                .audtdate(currentDate())
                .audttime(Integer.parseInt(currentTime()))
                .audtuser("ADMIN")
                .audtorg("ICLCOM")
                .datedue(currentDate())
                .amtdue(bigDecimalValue(invoiceDto.getCreditAmount()))
                .datedisc(0)
                .amtdisc(BigDecimal.valueOf(0))
                .amtduehc(bigDecimalValue(invoiceDto.getCreditAmount()))
                .amtdischc(BigDecimal.valueOf(0))
                .build();
        HIApibs_repo.save(apibs);

        return true;
    }

    public boolean updateApibsHI(requestDTO invoiceDto) {

        int batch = getAPBatchNumber();
        Apibs apibs = Apibs.builder()
                .apibsPK(ApibsPK.builder()
                        .cntbtch(batch)
                        .cntpaym(1)
                        .cntitem(1)
                        .build())
                .audtdate(currentDate())
                .audttime(Integer.parseInt(currentTime()))
                .audtuser("ADMIN")
                .audtorg("ICLCOM")
                .datedue(currentDate())
                .amtdue(bigDecimalValue(invoiceDto.getCreditAmount()))
                .datedisc(0)
                .amtdisc(BigDecimal.valueOf(0))
                .amtduehc(bigDecimalValue(invoiceDto.getCreditAmount()))
                .amtdischc(BigDecimal.valueOf(0))
                .build();
        HIApibs_repo.save(apibs);

        return true;
    }

    public boolean updateApibcHI(requestDTO invoiceDto) {
        int batch = getAPBatchNumber();
        System.out.print(batch);
        Apibc apibc = Apibc.builder()
                .cntbtch(batch)
                .audtdate(currentDate())
                .audttime(Integer.parseInt(currentTime()))
                .audtuser("ADMIN")
                .audtorg("ICLCOM")
                .datebtch(Integer.parseInt(invoiceDto.getTransactionDate()))
                .btchdesc(validateReference(invoiceDto.getTransactionDescription()))
                .cntinvcent(1)
                .amtentr(bigDecimalValue(invoiceDto.getDebitAmount()))
                .btchtype((short) 5)
                .btchstts((short) 1)
                .invctype((short) 1)
                .cntlstitem(2)
                .postseqnbr(0)
                .nbrerrors(0)
                .dtelstedit(Integer.parseInt(invoiceDto.getTransactionDate()))
                .swprinted((short) 0)
                .srceappl("AP")
                .swict((short) 0)
                .build();
        Apibc obj = HIApibc_repo.save(apibc);
        Optional<Apibc> fetchedObj = HIApibc_repo.findById(obj.getCntbtch());
        return fetchedObj.isPresent();
    }

    public boolean updateApibhHI(requestDTO invoiceDto) {
        Optional<Apven> obj = HIApven_repo.findByVendorid(invoiceDto.getCreditAccountId());

        String vendorId = obj.map(Apven::getVendorid).orElse(null);
        String vendorName = obj.map(Apven::getVendname).orElse(null);
        int month = getMonthYear()[0];
        int year = getMonthYear()[1];
        String period = Integer.toString(month);
        String fiscyr = Integer.toString(year);
        int batch = getAPBatchNumber();
        String vatcode = "VATIN" + invoiceDto.getCurrency();
        Apibh apibh = Apibh.builder()
                .apibhPK(ApibhPK.builder()
                        .cntbtch(batch)
                        .cntitem(1)
                        .build())
                .audtdate(currentDate())
                .audttime(Integer.parseInt(currentTime()))
                .audtuser("ADMIN")
                .audtorg("ICLCOM")
                .idvend(vendorId)
                .idinvc("INV" + invoiceDto.getTransactionReference())
                .idrmitto("")
                .texttrx((short) 1)
                .idtrx((short) 12)
                .invcstts((short) 0)
                .ordrnbr("")
                .ponbr("")
                .invcdesc(validateReference(invoiceDto.getTransactionDescription()))
                .swprtinvc((short) 0)
                .invcapplto("")
                .idacctset(invoiceDto.getCurrency())
                .dateinvc(currentDate())
                .dateasof(currentDate())
                .fiscyr(fiscyr)
                .fiscper(period)
                .codecurn(invoiceDto.getCurrency())
                .ratetype("SP")
                .swmanrte((short) 0)
                .exchratehc(BigDecimal.valueOf(1))
                .origratehc(BigDecimal.valueOf(1))
                .termcode("45DAYS")
                .swtermovrd((short) 1)
                .datedue(currentDate())
                .datedisc(0)
                .pctdisc(BigDecimal.valueOf(0))
                .amtdiscavl(BigDecimal.valueOf(0))
                .lastline(1)
                .swtaxbl((short) 0)
                .swcalctx((short) 0)
                .codetaxgrp("INZMW01")
                .codetax1("VAT" + invoiceDto.getCurrency())
                .codetax2("")
                .codetax3("")
                .codetax4("")
                .codetax5("")
                .taxclass1((short) 0)
                .taxclass2((short) 0)
                .taxclass3((short) 0)
                .taxclass4((short) 0)
                .taxclass5((short) 0)
                .basetax1(BigDecimal.valueOf(0))
                .basetax2(BigDecimal.valueOf(0))
                .basetax3(BigDecimal.valueOf(0))
                .basetax4(BigDecimal.valueOf(0))
                .basetax5(BigDecimal.valueOf(0))
                .amttax1(BigDecimal.valueOf(0))
                .amttax2(BigDecimal.valueOf(0))
                .amttax3(BigDecimal.valueOf(0))
                .amttax4(BigDecimal.valueOf(0))
                .amttax5(BigDecimal.valueOf(0))
                .amt1099(BigDecimal.valueOf(0))
                .amtdistset(BigDecimal.valueOf(0))
                .amttaxdist(BigDecimal.valueOf(0))
                .amtinvctot(bigDecimalValue(invoiceDto.getCreditAmount()))
                .amtalloctx(BigDecimal.valueOf(0))
                .cntpaymsch(1)
                .amttotdist(bigDecimalValue(invoiceDto.getCreditAmount()))
                .amtgrosdst(bigDecimalValue(invoiceDto.getCreditAmount()))
                .idppd("")
                .textrmit("")
                .textste1("")
                .textste2("")
                .textste3("")
                .textste4("")
                .namecity("")
                .codestte("")
                .codepstl("")
                .codectry("")
                .namectac("")
                .textphon("")
                .textfax("")
                .daterate(Integer.parseInt(invoiceDto.getTransactionDescription()))
                .amtrectax(BigDecimal.valueOf(0))
                .codepayppd(0)
                .codevndgrp(invoiceDto.getCurrency())
                .termsdesc("45Days")
                .iddistset("")
                .id1099Clas("")
                .amttaxtot(BigDecimal.valueOf(0))
                .amtgrostot(bigDecimalValue(invoiceDto.getCreditAmount()))
                .swtaxincl1((short) 0)
                .swtaxincl2((short) 0)
                .swtaxincl3((short) 0)
                .swtaxincl4((short) 0)
                .swtaxincl5((short) 0)
                .amtexptax(BigDecimal.valueOf(0))
                .amtaxtobe(BigDecimal.valueOf(0))
                .taxoutbal(BigDecimal.valueOf(0))
                .codeoper((short) 1)
                .acctrec1("12140")
                .acctrec2("")
                .acctrec3("")
                .acctrec4("")
                .acctrec5("")
                .acctexp1("")
                .acctexp2("")
                .acctexp3("")
                .acctexp4("")
                .acctexp5("")
                .drillapp("")
                .drilltype((short) 0)
                .drilldwnlk(0)
                .swjob((short) 0)
                .amtrecdist(BigDecimal.valueOf(0))
                .amtexpdist(BigDecimal.valueOf(0))
                .errbatch(0)
                .errentry(0)
                .email("")
                .ctacphone("")
                .ctacfax("")
                .ctacemail("")
                .amtppd(BigDecimal.valueOf(0))
                .idstdinvc("")
                .dateprcs(0)
                .amtdsbwtax(bigDecimalValue(invoiceDto.getCreditAmount()))
                .amtdsbntax(bigDecimalValue(invoiceDto.getCreditAmount()))
                .amtdscbase(bigDecimalValue(invoiceDto.getCreditAmount()))
                .swrtginvc((short) 0)
                .rtgapplyto("")
                .swrtg((short) 0)
                .rtgamt(BigDecimal.valueOf(0))
                .rtgpercent(BigDecimal.valueOf(0))
                .rtgdays((short) 0)
                .rtgdatedue(0)
                .rtgterms("")
                .swrtgddtov((short) 0)
                .swrtgamtov((short) 0)
                .swrtgrate((short) 0)
                .swtxbsectl((short) 0)
                .values(0)
                .origcomp("")
                .detailcnt(1)
                .srceappl("AP")
                .swhold((short) 0)
                .apversion("67A")
                .taxversion(1)
                .swtxrtgrpt((short) 0)
                .codecurnrc(invoiceDto.getCurrency())
                .swtxctlrc((short) 0)
                .raterc(BigDecimal.valueOf(1))
                .ratetyperc("SP")
                .ratedaterc(Integer.parseInt(invoiceDto.getTransactionDate()))
                .rateoprc((short) 1)
                .swraterc((short) 0)
                .txamt1Rc(BigDecimal.valueOf(0))
                .txamt2Rc(BigDecimal.valueOf(0))
                .txamt3Rc(BigDecimal.valueOf(0))
                .txamt4Rc(BigDecimal.valueOf(0))
                .txamt5Rc(BigDecimal.valueOf(0))
                .txtotrc(BigDecimal.valueOf(0))
                .txallrc(BigDecimal.valueOf(0))
                .txexprc(BigDecimal.valueOf(0))
                .txrecrc(BigDecimal.valueOf(0))
                .txbsert1Tc(BigDecimal.valueOf(0))
                .txbsert2Tc(BigDecimal.valueOf(0))
                .txbsert3Tc(BigDecimal.valueOf(0))
                .txbsert4Tc(BigDecimal.valueOf(0))
                .txbsert5Tc(BigDecimal.valueOf(0))
                .txamtrt1Tc(BigDecimal.valueOf(0))
                .txamtrt2Tc(BigDecimal.valueOf(0))
                .txamtrt3Tc(BigDecimal.valueOf(0))
                .txamtrt4Tc(BigDecimal.valueOf(0))
                .txamtrt5Tc(BigDecimal.valueOf(0))
                .txbse1Hc(BigDecimal.valueOf(0))
                .txbse2Hc(BigDecimal.valueOf(0))
                .txbse3Hc(BigDecimal.valueOf(0))
                .txbse4Hc(BigDecimal.valueOf(0))
                .txbse5Hc(BigDecimal.valueOf(0))
                .txamt1Hc(BigDecimal.valueOf(0))
                .txamt2Hc(BigDecimal.valueOf(0))
                .txamt3Hc(BigDecimal.valueOf(0))
                .txamt4Hc(BigDecimal.valueOf(0))
                .txamt5Hc(BigDecimal.valueOf(0))
                .amtgroshc(BigDecimal.valueOf(1000))
                .rtgamthc(BigDecimal.valueOf(0))
                .amtdischc(BigDecimal.valueOf(0))
                .amt1099Hc(BigDecimal.valueOf(0))
                .amtppdhc(BigDecimal.valueOf(0))
                .amtduetc(bigDecimalValue(invoiceDto.getCreditAmount()))
                .amtduehc(bigDecimalValue(invoiceDto.getCreditAmount()))
                .textven(vendorName)
                .enteredby("ADMIN")
                .datebus(currentDate())
                .idn("")
                .amtwht1Tc(BigDecimal.valueOf(0))
                .amtwht2Tc(BigDecimal.valueOf(0))
                .amtwht3Tc(BigDecimal.valueOf(0))
                .amtwht4Tc(BigDecimal.valueOf(0))
                .amtwht5Tc(BigDecimal.valueOf(0))
                .amtcxbs1Tc(BigDecimal.valueOf(0))
                .amtcxbs2Tc(BigDecimal.valueOf(0))
                .amtcxbs3Tc(BigDecimal.valueOf(0))
                .amtcxbs4Tc(BigDecimal.valueOf(0))
                .amtcxbs5Tc(BigDecimal.valueOf(0))
                .amtcxtx1Tc(BigDecimal.valueOf(0))
                .amtcxtx2Tc(BigDecimal.valueOf(0))
                .amtcxtx3Tc(BigDecimal.valueOf(0))
                .amtcxtx4Tc(BigDecimal.valueOf(0))
                .amtcxtx5Tc(BigDecimal.valueOf(0))
                .build();
        HIApibh_repo.save(apibh);
        return true;
    }

    public boolean updateApibdHI(requestDTO invoiceDto) {
        int batch = getAPBatchNumber();
        int cntline = 20;
        Apibd apibd = Apibd.builder()
                .apibdPK(ApibdPK.builder()
                        .cntbtch(batch)
                        .cntitem(1)
                        .cntline(20)
                        .build())
                .audtdate(currentDate())
                .audttime(Integer.parseInt(currentTime()))
                .audtorg("ADMIN")
                .audtuser("ICLCOM")
                .iddist("")
                .textdesc(validateReference(invoiceDto.getTransactionDescription()))
                .swmanldist((short) 0)
                .amttottax(BigDecimal.valueOf(0))
                .swmanltx((short) 0)
                .basetax1(BigDecimal.valueOf(0))
                .basetax2(BigDecimal.valueOf(0))
                .basetax3(BigDecimal.valueOf(0))
                .basetax4(BigDecimal.valueOf(0))
                .basetax5(BigDecimal.valueOf(0))
                .taxclass1((short) 1)
                .taxclass2((short) 0)
                .taxclass3((short) 0)
                .taxclass4((short) 0)
                .taxclass5((short) 0)
                .swtaxincl1((short) 0)
                .swtaxincl2((short) 0)
                .swtaxincl3((short) 0)
                .swtaxincl4((short) 0)
                .swtaxincl5((short) 0)
                .ratetax1(BigDecimal.valueOf(0))
                .ratetax2(BigDecimal.valueOf(0))
                .ratetax3(BigDecimal.valueOf(0))
                .ratetax4(BigDecimal.valueOf(0))
                .ratetax5(BigDecimal.valueOf(0))
                .amttax1(BigDecimal.valueOf(0))
                .amttax2(BigDecimal.valueOf(0))
                .amttax3(BigDecimal.valueOf(0))
                .amttax4(BigDecimal.valueOf(0))
                .amttax5(BigDecimal.valueOf(0))
                .idglacct(invoiceDto.getDebitAccountId())
                .idaccttax(invoiceDto.getDebitAccountId())
                .id1099Clas("")
                .amtdist(bigDecimalValue(invoiceDto.getCreditAmount()))
                .amtdistnet(bigDecimalValue(invoiceDto.getCreditAmount()))
                .amtincltax(BigDecimal.valueOf(0))
                .amtgldist(bigDecimalValue(invoiceDto.getCreditAmount()))
                .amttaxrec1(BigDecimal.valueOf(0))
                .amttaxrec2(BigDecimal.valueOf(0))
                .amttaxrec3(BigDecimal.valueOf(0))
                .amttaxrec4(BigDecimal.valueOf(0))
                .amttaxrec5(BigDecimal.valueOf(0))
                .amttaxexp1(BigDecimal.valueOf(0))
                .amttaxexp2(BigDecimal.valueOf(0))
                .amttaxexp3(BigDecimal.valueOf(0))
                .amttaxexp4(BigDecimal.valueOf(0))
                .amttaxexp5(BigDecimal.valueOf(0))
                .amttaxtobe(BigDecimal.valueOf(0))
                .contract("")
                .project("")
                .category("")
                .resource("")
                .transnbr(0)
                .costclass((short) 0)
                .billtype((short) 0)
                .iditem("")
                .unitmeas("")
                .qtyinvc(BigDecimal.valueOf(0))
                .amtcost(BigDecimal.valueOf(1))
                .billdate(0)
                .billrate(BigDecimal.valueOf(0))
                .billcurn(String.valueOf(0))
                .swibt((short) 0)
                .swdiscabl((short) 0)
                .ocntline(0)
                .rtgamt(BigDecimal.valueOf(0))
                .rtgpercent(BigDecimal.valueOf(0))
                .rtgdays((short) 0)
                .rtgdatedue(0)
                .swrtgddtov((short) 0)
                .swrtgamtov((short) 0)
                .values(0)
                .descomp("")
                .route((short) 0)
                .rtgdisttc(BigDecimal.valueOf(0))
                .rtginvdist(BigDecimal.valueOf(0))
                .txamt1Rc(BigDecimal.valueOf(0))
                .txamt2Rc(BigDecimal.valueOf(0))
                .txamt3Rc(BigDecimal.valueOf(0))
                .txamt4Rc(BigDecimal.valueOf(0))
                .txamt5Rc(BigDecimal.valueOf(0))
                .txtotrc(BigDecimal.valueOf(0))
                .txallrc(BigDecimal.valueOf(0))
                .txexp1Rc(BigDecimal.valueOf(0))
                .txexp2Rc(BigDecimal.valueOf(0))
                .txexp3Rc(BigDecimal.valueOf(0))
                .txexp4Rc(BigDecimal.valueOf(0))
                .txexp5Rc(BigDecimal.valueOf(0))
                .txrec1Rc(BigDecimal.valueOf(0))
                .txrec2Rc(BigDecimal.valueOf(0))
                .txrec3Rc(BigDecimal.valueOf(0))
                .txrec4Rc(BigDecimal.valueOf(0))
                .txrec5Rc(BigDecimal.valueOf(0))
                .txbsert1Tc(BigDecimal.valueOf(0))
                .txbsert2Tc(BigDecimal.valueOf(0))
                .txbsert3Tc(BigDecimal.valueOf(0))
                .txbsert4Tc(BigDecimal.valueOf(0))
                .txbsert5Tc(BigDecimal.valueOf(0))
                .txamtrt1Tc(BigDecimal.valueOf(0))
                .txamtrt2Tc(BigDecimal.valueOf(0))
                .txamtrt3Tc(BigDecimal.valueOf(0))
                .txamtrt4Tc(BigDecimal.valueOf(0))
                .txamtrt5Tc(BigDecimal.valueOf(0))
                .txbse1Hc(BigDecimal.valueOf(0))
                .txbse2Hc(BigDecimal.valueOf(0))
                .txbse3Hc(BigDecimal.valueOf(0))
                .txbse4Hc(BigDecimal.valueOf(0))
                .txbse5Hc(BigDecimal.valueOf(0))
                .txamt1Hc(BigDecimal.valueOf(0))
                .txamt2Hc(BigDecimal.valueOf(0))
                .txamt3Hc(BigDecimal.valueOf(0))
                .txamt4Hc(BigDecimal.valueOf(0))
                .txamt5Hc(BigDecimal.valueOf(0))
                .txamtrt1Hc(BigDecimal.valueOf(0))
                .txamtrt2Hc(BigDecimal.valueOf(0))
                .txamtrt3Hc(BigDecimal.valueOf(0))
                .txamtrt4Hc(BigDecimal.valueOf(0))
                .txamtrt5Hc(BigDecimal.valueOf(0))
                .txrec1Hc(BigDecimal.valueOf(0))
                .txrec2Hc(BigDecimal.valueOf(0))
                .txrec3Hc(BigDecimal.valueOf(0))
                .txrec4Hc(BigDecimal.valueOf(0))
                .txrec5Hc(BigDecimal.valueOf(0))
                .txexp1Hc(BigDecimal.valueOf(0))
                .txexp2Hc(BigDecimal.valueOf(0))
                .txexp3Hc(BigDecimal.valueOf(0))
                .txexp4Hc(BigDecimal.valueOf(0))
                .txexp5Hc(BigDecimal.valueOf(0))
                .txallhc(BigDecimal.valueOf(0))
                .txall1Hc(BigDecimal.valueOf(0))
                .txall2Hc(BigDecimal.valueOf(0))
                .txall3Hc(BigDecimal.valueOf(0))
                .txall4Hc(BigDecimal.valueOf(0))
                .txall5Hc(BigDecimal.valueOf(0))
                .txall1Tc(BigDecimal.valueOf(0))
                .txall2Tc(BigDecimal.valueOf(0))
                .txall3Tc(BigDecimal.valueOf(0))
                .txall4Tc(BigDecimal.valueOf(0))
                .txall5Tc(BigDecimal.valueOf(0))
                .amtcosthc(BigDecimal.valueOf(0))
                .amtdisthc(BigDecimal.valueOf(0))
                .distnethc(BigDecimal.valueOf(0))
                .rtgamthc(BigDecimal.valueOf(0))
                .txallrthc(BigDecimal.valueOf(0))
                .txallrttc(BigDecimal.valueOf(0))
                .txexprthc(bigDecimalValue(invoiceDto.getCreditAmount()))
                .txexprttc(bigDecimalValue(invoiceDto.getCreditAmount()))
                .swfas((short) 0)
                .amtwht1Tc(BigDecimal.valueOf(0))
                .amtwht2Tc(BigDecimal.valueOf(0))
                .amtwht3Tc(BigDecimal.valueOf(0))
                .amtwht4Tc(BigDecimal.valueOf(0))
                .amtwht5Tc(BigDecimal.valueOf(0))
                .amtcxtx1Tc(BigDecimal.valueOf(0))
                .amtcxtx2Tc(BigDecimal.valueOf(0))
                .amtcxtx3Tc(BigDecimal.valueOf(0))
                .amtcxtx4Tc(BigDecimal.valueOf(0))
                .amtcxtx5Tc(BigDecimal.valueOf(0))
                .swcaxable1((short) 0)
                .swcaxable2((short) 0)
                .swcaxable3((short) 0)
                .swcaxable4((short) 0)
                .swcaxable5((short) 0)
                .build();
        HIApibd_repo.save(apibd);

        return true;
    }

    public boolean createInvoice(requestDTO dto){
        return insertApibcHI(dto)&&insertApibhHI(dto)&&insertApibdHI(dto)&&insertApibsHI(dto);
    }
    public boolean updateInvoice(requestDTO dto){
        return updateApibcHI(dto)&&updateApibdHI(dto)&&updateApibhHI(dto)&&updateApibsHI(dto);
    }
    public String[] generateTransactionNumber(int num) {
        int num1 = (num - 1) * 40 + 20;
        int num2 = (num - 1) * 40 + 40;
        num1 = num1 + (num1 % 2); // Ensure that num1 is even
        num2 = num2 + (num2 % 2);

        String[] transactionNumbers = new String[2];
        transactionNumbers[0] = String.format("%010d", num1);
        transactionNumbers[1] = String.format("%010d", num2);

        return transactionNumbers;
    }
    public Boolean insertGjbctlHI(requestDTO requestDTO, String batchid, String batchdesc) {
        int date = currentDate();
        String batch = batchIDChecker(batchid);
        String time = currentTime();
        Glbctl glbctl = Glbctl.builder()
                .audtdate(date)
                .audttime(Integer.parseInt(time))
                .audtuser("ADMIN")
                .audtorg("ICLCOM")
                .activesw((short) 1)
                .btchdesc(batchdesc)
                .srceledgr("GL")
                .datecreat(date)
                .dateedit(date)
                .batchtype("1")
                .batchid(batch)
                .batchstat("9")
                .postngseq(0)
                .debittot(bigDecimalValue(requestDTO.getDebitAmount()))
                .credittot(bigDecimalValue(requestDTO.getCreditAmount()))
                .qtytotal(BigDecimal.valueOf(0))
                .entrycnt(1)
                .nextentry(1)
                .errorcnt(0)
                .origstatus("")
                .swprinted((short) 0)
                .swict((short) 0)
                .swrvrecog((short) 0)
                .build();
        HIGlbctl_repo.save(glbctl);
        return true;
    }

    public Boolean insertGljehHI(requestDTO requestDTO, String batchid, String batchNum) {
        String batch = batchIDChecker(batchid);
        int date = currentDate();
        String time = currentTime();
        int month = getMonthYear()[0];
        int year = getMonthYear()[1];
        String period = Integer.toString(month);
        String fiscyr = Integer.toString(year);
        Gljeh gljeh = Gljeh.builder()
                .gljehPK(GljehPK.builder()
                        .batchid(batch)
                        .btchentry(batchNum)
                        .build())
                .audtdate(date)
                .audttime(Integer.parseInt(time))
                .audtuser("ADMIN")
                .audtorg("ICLCOM")
                .srceledger("GL")
                .srcetype("JE")
                .fscsyr(fiscyr)
                .fscsperd(period)
                .swedit((short) 0)
                .swreverse((short) 0)
                .jrnldesc(validateReference(requestDTO.getTransactionDescription()))
                .jrnldr(bigDecimalValue(requestDTO.getDebitAmount()))
                .jrnlcr(bigDecimalValue(requestDTO.getCreditAmount()))
                .jrnlqty(BigDecimal.valueOf(0))
                .dateentry(date)
                .drilsrcty((short) 0)
                .drilldwnlk(0)
                .drilapp("")
                .revyr("0000")
                .revperd("00")
                .errbatch(0)
                .errentry(0)
                .origcomp("")
                .detailcnt(requestDTO.getDebits().toArray().length + requestDTO.getCredits().toArray().length)
                .enteredby("ADMIN")
                .docdate(date)
                .codetaxgrp("")
                .classtype((short) 0)
                .swmantx((short) 0)
                .custvend("")
                .doctype((short)0)
                .docnumber("")
                .taxauth1("")
                .taxauth2("")
                .taxauth3("")
                .taxauth4("")
                .taxauth5("")
                .taxvclss1(Short.parseShort("0"))
                .taxvclss2(Short.parseShort("0"))
                .taxvclss3(Short.parseShort("0"))
                .taxvclss4(Short.parseShort("0"))
                .taxvclss5(Short.parseShort("0"))
                .taxiclss1(Short.parseShort("0"))
                .taxiclss2(Short.parseShort("0"))
                .taxiclss3(Short.parseShort("0"))
                .taxiclss4(Short.parseShort("0"))
                .taxiclss5(Short.parseShort("0"))
                .basetax1(BigDecimal.valueOf(0))
                .basetax2(BigDecimal.valueOf(0))
                .basetax3(BigDecimal.valueOf(0))
                .basetax4(BigDecimal.valueOf(0))
                .basetax5(BigDecimal.valueOf(0))
                .amttax1(BigDecimal.valueOf(0))
                .amttax2(BigDecimal.valueOf(0))
                .amttax3(BigDecimal.valueOf(0))
                .amttax4(BigDecimal.valueOf(0))
                .amttax5(BigDecimal.valueOf(0))
                .amtexpens1(BigDecimal.valueOf(0))
                .amtexpens2(BigDecimal.valueOf(0))
                .amtexpens3(BigDecimal.valueOf(0))
                .amtexpens4(BigDecimal.valueOf(0))
                .amtexpens5(BigDecimal.valueOf(0))
                .amtrecvrb1(BigDecimal.valueOf(0))
                .amtrecvrb2(BigDecimal.valueOf(0))
                .amtrecvrb3(BigDecimal.valueOf(0))
                .amtrecvrb4(BigDecimal.valueOf(0))
                .amtrecvrb5(BigDecimal.valueOf(0))
                .amtalloc1(BigDecimal.valueOf(0))
                .amtalloc2(BigDecimal.valueOf(0))
                .amtalloc3(BigDecimal.valueOf(0))
                .amtalloc4(BigDecimal.valueOf(0))
                .amtalloc5(BigDecimal.valueOf(0))
                .txamt1Rc(BigDecimal.valueOf(0))
                .txamt2Rc(BigDecimal.valueOf(0))
                .txamt3Rc(BigDecimal.valueOf(0))
                .txamt4Rc(BigDecimal.valueOf(0))
                .txamt5Rc(BigDecimal.valueOf(0))
                .txexpns1Rc(BigDecimal.valueOf(0))
                .txexpns2Rc(BigDecimal.valueOf(0))
                .txexpns3Rc(BigDecimal.valueOf(0))
                .txexpns4Rc(BigDecimal.valueOf(0))
                .txexpns5Rc(BigDecimal.valueOf(0))
                .txrecvb1Rc(BigDecimal.valueOf(0))
                .txrecvb2Rc(BigDecimal.valueOf(0))
                .txrecvb3Rc(BigDecimal.valueOf(0))
                .txrecvb4Rc(BigDecimal.valueOf(0))
                .txrecvb5Rc(BigDecimal.valueOf(0))
                .txalloc1Rc(BigDecimal.valueOf(0))
                .txalloc2Rc(BigDecimal.valueOf(0))
                .txalloc3Rc(BigDecimal.valueOf(0))
                .txalloc4Rc(BigDecimal.valueOf(0))
                .txalloc5Rc(BigDecimal.valueOf(0))
                .codecurnrc("")
                .raterc(BigDecimal.valueOf(0))
                .ratetyperc("")
                .ratedaterc(0)
                .rateoprc((short) 1)
                .expnsacnt1("")
                .expnsacnt2("")
                .expnsacnt3("")
                .expnsacnt4("")
                .expnsacnt5("")
                .recblacnt1("")
                .recblacnt2("")
                .recblacnt3("")
                .recblacnt4("")
                .recblacnt5("")
                .taxrate1(new BigDecimal("0.00"))
                .taxrate2(new BigDecimal("0.00"))
                .taxrate3(new BigDecimal("0.00"))
                .taxrate4(new BigDecimal("0.00"))
                .taxrate5(new BigDecimal("0.00"))
                .funtxamt1(new BigDecimal("0.00"))
                .funtxamt2(new BigDecimal("0.00"))
                .funtxamt3(new BigDecimal("0.00"))
                .funtxamt4(new BigDecimal("0.00"))
                .funtxamt5(new BigDecimal("0.00"))
                .funtxbse1(new BigDecimal("0.00"))
                .funtxbse2(new BigDecimal("0.00"))
                .funtxbse3(new BigDecimal("0.00"))
                .funtxbse4(new BigDecimal("0.00"))
                .funtxbse5(new BigDecimal("0.00"))
                .funtxexp1(new BigDecimal("0.00"))
                .funtxexp2(new BigDecimal("0.00"))
                .funtxexp3(new BigDecimal("0.00"))
                .funtxexp4(new BigDecimal("0.00"))
                .funtxexp5(new BigDecimal("0.00"))
                .funtxrcb1(new BigDecimal("0.00"))
                .funtxrcb2(new BigDecimal("0.00"))
                .funtxrcb3(new BigDecimal("0.00"))
                .funtxrcb4(new BigDecimal("0.00"))
                .funtxrcb5(new BigDecimal("0.00"))
                .funtxaloc1(new BigDecimal("0.00"))
                .funtxaloc2(new BigDecimal("0.00"))
                .funtxaloc3(new BigDecimal("0.00"))
                .funtxaloc4(new BigDecimal("0.00"))
                .funtxaloc5(new BigDecimal("0.00"))
                .amtinvchc(BigDecimal.valueOf(0))
                .amtinvctc(BigDecimal.valueOf(0))
                .build();
        HIGljeh_repo.save(gljeh);
        return true;

    }

    @Transactional
    public Boolean insertGljedHI(requestDTO requestDTO, String batchid, String btchentry) {
        String batch = batchIDChecker(batchid);
        int baseTransactionNumber1 = 20;
        int baseTransactionNumber2 = 40;

        int date = currentDate();
        String time = currentTime();

        for (infoDTO dto : requestDTO.getCredits()) {
            String transactionNumber2 = String.format("%010d", baseTransactionNumber2);
            Gljed gljed = Gljed.builder()
                    .gljedPK(GljedPK.builder()
                            .batchnbr(batch)
                            .journalid(btchentry)
                            .transnbr(transactionNumber2)
                            .build())
                    .audtdate(date)
                    .audttime(Integer.parseInt(time))
                    .audtuser("ADMIN")
                    .audtorg("ICLCOM")
                    .acctid(dto.getAccountId())
                    .companyid("ICLCOM")
                    .transamt(bigDecimalValue(dto.getAmount()).negate())
                    .transqty(BigDecimal.valueOf(0))
                    .scurndec("2")
                    .scurnamt(bigDecimalValue(dto.getAmount()).negate())
                    .hcurncode("ZMW")
                    .ratetype("SP")
                    .scurncode("ZMW")
                    .ratedate(date)
                    .convrate(BigDecimal.valueOf(1))
                    .ratespread(BigDecimal.valueOf(0))
                    .datemtchcd("3")
                    .rateoper("1")
                    .transdesc(validateReference(requestDTO.getTransactionDescription()))
                    .transref(requestDTO.getTransactionReference())
                    .transdate(date)
                    .srceldgr("GL")
                    .srcetype("JE")
                    .values(0)
                    .descomp("")
                    .route((short) 0)
                    .taxauth("")
                    .txaccttype((short) 0)
                    .build();
            HIGljed_repo.save(gljed);
            baseTransactionNumber2 += 20;
        }
        for (infoDTO dto : requestDTO.getDebits()) {
            String transactionNumber1 = String.format("%010d", baseTransactionNumber1);
            Gljed gljed2 = Gljed.builder()
                    .gljedPK(GljedPK.builder()
                            .batchnbr(batch)
                            .journalid(btchentry)
                            .transnbr(transactionNumber1)
                            .build())
                    .audtdate(date)
                    .audttime(Integer.parseInt(time))
                    .audtuser("ADMIN")
                    .audtorg("ICLCOM")
                    .acctid(dto.getAccountId())
                    .companyid("ICLCOM")
                    .transamt(bigDecimalValue(dto.getAmount()))
                    .transqty(BigDecimal.valueOf(0))
                    .scurndec("2")
                    .scurnamt(bigDecimalValue(dto.getAmount()))
                    .hcurncode("ZMW")
                    .ratetype("SP")
                    .scurncode("ZMW")
                    .ratedate(date)
                    .convrate(BigDecimal.valueOf(1))
                    .ratespread(BigDecimal.valueOf(0))
                    .datemtchcd("3")
                    .rateoper("1")
                    .transdesc(validateReference(requestDTO.getTransactionDescription()))
                    .transref(requestDTO.getTransactionReference())
                    .transdate(date)
                    .srceldgr("GL")
                    .srcetype("JE")
                    .values(0)
                    .descomp("")
                    .route((short) 0)
                    .taxauth("")
                    .txaccttype((short) 0)
                    .build();
            HIGljed_repo.save(gljed2);
            baseTransactionNumber1 += 20;
        }

        return true;
    }
    public String getBatchNextEntryHI(String batchid){
        String lastBatchEntry= HIGljeh_repo.findBatchEntry(batchid);
        String numericPart = lastBatchEntry.replaceAll("\\D", "");
        int numericValue = Integer.parseInt(numericPart);
        numericValue++; // Increment the numeric value

        // Format the new batch entry string
        return String.format("%05d", numericValue);

    }
    public  boolean checkJournalDetailsDuplicatesHi(String journalHeader) {
        return HIGljed_repo.findByTransref(journalHeader).isPresent();
    }
    public Boolean updateGlbctlHI(Glbctl glbctl, requestDTO requestDTO) {
        BigDecimal initialDebittot = glbctl.getDebittot();
        BigDecimal initialCredittot = glbctl.getCredittot();
        BigDecimal debitTot = bigDecimalValue(requestDTO.getDebitAmount()).add(initialDebittot);
        BigDecimal creditTot = bigDecimalValue(requestDTO.getCreditAmount()).add(initialCredittot);
        glbctl.setDebittot(debitTot);
        glbctl.setCredittot(creditTot);
        return true;
    }

/*
*  public Gljeh findGljehByBatchidHI(String batchid) {
        Gljeh gljeh = HIGljeh_repo.findByBatchid(batchid);
        return gljeh;
    }

    public int detailCountHI(String batchid) {
        int detailCount = HIGljeh_repo.findDetailCount(batchid);
        return detailCount;
    }
    *  public Boolean findBatchDescHI(String batchdesc) {
        Glbctl fetchedDesc = HIGlbctl_repo.findByBtchdesc(batchdesc);
        if (fetchedDesc != null) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean updateGljehHI(Gljeh gljeh, int detailCount, requestDTO requestDTO) {
        BigDecimal initialjrnlCr = gljeh.getJrnlcr();
        BigDecimal initialjrnlDr = gljeh.getJrnldr();
        BigDecimal jrnlDr = bigDecimalValue(requestDTO.getDebitAmount()).add(initialjrnlDr);
        BigDecimal jrnlCr = bigDecimalValue(requestDTO.getCreditAmount()).add(initialjrnlCr);
        gljeh.setDetailcnt(detailCount);
        gljeh.setJrnlcr(jrnlCr);
        gljeh.setJrnldr(jrnlDr);
        return true;
    }

    public Boolean updateGlbctlHI(Glbctl glbctl, requestDTO requestDTO) {
        BigDecimal initialDebittot = glbctl.getDebittot();
        BigDecimal initialCredittot = glbctl.getCredittot();
        BigDecimal debitTot = bigDecimalValue(requestDTO.getDebitAmount()).add(initialDebittot);
        BigDecimal creditTot = bigDecimalValue(requestDTO.getCreditAmount()).add(initialCredittot);
        glbctl.setDebittot(debitTot);
        glbctl.setCredittot(creditTot);
        return true;
    }

    public Glbctl findGlbctlByBatchdescHI(String batchdesc) {
        Glbctl entity = HIGlbctl_repo.findByBtchdesc(batchdesc);
        return entity;
    }
* */
}
