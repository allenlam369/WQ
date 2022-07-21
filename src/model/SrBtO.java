package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the sr_bt_o database table.
 * 
 */
//@Entity
@Table(name="sr_bt_o")
@NamedQuery(name="SrBtO.findAll", query="SELECT s FROM SrBtO s")
public class SrBtO implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal abhc;

	private BigDecimal acen;

	private BigDecimal acph;

	private BigDecimal aldr;

	private BigDecimal anth;

	private BigDecimal bant;

	private BigDecimal bapy;

	private BigDecimal bbfl;

	private BigDecimal bbhc;

	private BigDecimal bdcm;

	private BigDecimal bgpe;

	private BigDecimal bhc;

	private BigDecimal bkfl;

	private BigDecimal brom;

	@Column(name="bt_o_id")
	private String btOId;

	@Column(name="bt_spcode_id")
	private String btSpcodeId;

	@Column(name="bt_visit_id")
	private String btVisitId;

	private BigDecimal btcm;

	private BigDecimal cdbm;

	private BigDecimal chry;

	private BigDecimal cp;

	private BigDecimal daan;

	private BigDecimal dbhc;

	@Column(name="delete_date")
	private Timestamp deleteDate;

	@Column(name="delete_user")
	private String deleteUser;

	private BigDecimal diel;

	@Column(name="dwr_o")
	private BigDecimal dwrO;

	private BigDecimal end1;

	private BigDecimal end2;

	private BigDecimal endr;

	private BigDecimal fluo;

	private BigDecimal flut;

	private BigDecimal gbhc;

	private BigDecimal hcb;

	private BigDecimal hepo;

	private BigDecimal hept;

	private BigDecimal inpy;

	@Column(name="l_abhc")
	private String lAbhc;

	@Column(name="l_acen")
	private String lAcen;

	@Column(name="l_acph")
	private String lAcph;

	@Column(name="l_aldr")
	private String lAldr;

	@Column(name="l_anth")
	private String lAnth;

	@Column(name="l_bant")
	private String lBant;

	@Column(name="l_bapy")
	private String lBapy;

	@Column(name="l_bbfl")
	private String lBbfl;

	@Column(name="l_bbhc")
	private String lBbhc;

	@Column(name="l_bdcm")
	private String lBdcm;

	@Column(name="l_bgpe")
	private String lBgpe;

	@Column(name="l_bhc")
	private String lBhc;

	@Column(name="l_bkfl")
	private String lBkfl;

	@Column(name="l_brom")
	private String lBrom;

	@Column(name="l_btcm")
	private String lBtcm;

	@Column(name="l_cdbm")
	private String lCdbm;

	@Column(name="l_chry")
	private String lChry;

	@Column(name="l_cp")
	private String lCp;

	@Column(name="l_daan")
	private String lDaan;

	@Column(name="l_dbhc")
	private String lDbhc;

	@Column(name="l_diel")
	private String lDiel;

	@Column(name="l_dwr_o")
	private String lDwrO;

	@Column(name="l_end1")
	private String lEnd1;

	@Column(name="l_end2")
	private String lEnd2;

	@Column(name="l_endr")
	private String lEndr;

	@Column(name="l_fluo")
	private String lFluo;

	@Column(name="l_flut")
	private String lFlut;

	@Column(name="l_gbhc")
	private String lGbhc;

	@Column(name="l_hcb")
	private String lHcb;

	@Column(name="l_hepo")
	private String lHepo;

	@Column(name="l_hept")
	private String lHept;

	@Column(name="l_inpy")
	private String lInpy;

	@Column(name="l_mdcb")
	private String lMdcb;

	@Column(name="l_odcb")
	private String lOdcb;

	@Column(name="l_oddd")
	private String lOddd;

	@Column(name="l_odde")
	private String lOdde;

	@Column(name="l_oddt")
	private String lOddt;

	@Column(name="l_pah")
	private String lPah;

	@Column(name="l_pcb101")
	private String lPcb101;

	@Column(name="l_pcb105")
	private String lPcb105;

	@Column(name="l_pcb114")
	private String lPcb114;

	@Column(name="l_pcb118")
	private String lPcb118;

	@Column(name="l_pcb123")
	private String lPcb123;

	@Column(name="l_pcb126")
	private String lPcb126;

	@Column(name="l_pcb128")
	private String lPcb128;

	@Column(name="l_pcb138")
	private String lPcb138;

	@Column(name="l_pcb149")
	private String lPcb149;

	@Column(name="l_pcb153")
	private String lPcb153;

	@Column(name="l_pcb156")
	private String lPcb156;

	@Column(name="l_pcb157")
	private String lPcb157;

	@Column(name="l_pcb167")
	private String lPcb167;

	@Column(name="l_pcb169")
	private String lPcb169;

	@Column(name="l_pcb170")
	private String lPcb170;

	@Column(name="l_pcb18")
	private String lPcb18;

	@Column(name="l_pcb180")
	private String lPcb180;

	@Column(name="l_pcb187")
	private String lPcb187;

	@Column(name="l_pcb189")
	private String lPcb189;

	@Column(name="l_pcb28")
	private String lPcb28;

	@Column(name="l_pcb31")
	private String lPcb31;

	@Column(name="l_pcb44")
	private String lPcb44;

	@Column(name="l_pcb52")
	private String lPcb52;

	@Column(name="l_pcb66")
	private String lPcb66;

	@Column(name="l_pcb77")
	private String lPcb77;

	@Column(name="l_pcb8")
	private String lPcb8;

	@Column(name="l_pcb81")
	private String lPcb81;

	@Column(name="l_pcb88")
	private String lPcb88;

	@Column(name="l_pcbs")
	private String lPcbs;

	@Column(name="l_pddd")
	private String lPddd;

	@Column(name="l_pdde")
	private String lPdde;

	@Column(name="l_pddt")
	private String lPddt;

	@Column(name="l_phen")
	private String lPhen;

	@Column(name="l_pyre")
	private String lPyre;

	@Column(name="l_tce")
	private String lTce;

	@Column(name="l_tcm")
	private String lTcm;

	@Column(name="l_thm")
	private String lThm;

	@Column(name="l_thms")
	private String lThms;

	@Column(name="l_trce")
	private String lTrce;

	private BigDecimal lipid;

	private BigDecimal mdcb;

	private BigDecimal odcb;

	private BigDecimal oddd;

	private BigDecimal odde;

	private BigDecimal oddt;

	private BigDecimal pah;

	private BigDecimal pcb101;

	private BigDecimal pcb105;

	private BigDecimal pcb114;

	private BigDecimal pcb118;

	private BigDecimal pcb123;

	private BigDecimal pcb126;

	private BigDecimal pcb128;

	private BigDecimal pcb138;

	private BigDecimal pcb149;

	private BigDecimal pcb153;

	private BigDecimal pcb156;

	private BigDecimal pcb157;

	private BigDecimal pcb167;

	private BigDecimal pcb169;

	private BigDecimal pcb170;

	private BigDecimal pcb18;

	private BigDecimal pcb180;

	private BigDecimal pcb187;

	private BigDecimal pcb189;

	private BigDecimal pcb28;

	private BigDecimal pcb31;

	private BigDecimal pcb44;

	private BigDecimal pcb52;

	private BigDecimal pcb66;

	private BigDecimal pcb77;

	private BigDecimal pcb8;

	private BigDecimal pcb81;

	private BigDecimal pcb88;

	private BigDecimal pcbs;

	private BigDecimal pddd;

	private BigDecimal pdde;

	private BigDecimal pddt;

	private BigDecimal phen;

	private BigDecimal pyre;

	@Column(name="sample_mark")
	private String sampleMark;

	private BigDecimal tce;

	private BigDecimal tcm;

	private BigDecimal thm;

	private BigDecimal thms;

	private BigDecimal trce;

	@Column(name="valid_code")
	private String validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public SrBtO() {
	}

	public BigDecimal getAbhc() {
		return this.abhc;
	}

	public void setAbhc(BigDecimal abhc) {
		this.abhc = abhc;
	}

	public BigDecimal getAcen() {
		return this.acen;
	}

	public void setAcen(BigDecimal acen) {
		this.acen = acen;
	}

	public BigDecimal getAcph() {
		return this.acph;
	}

	public void setAcph(BigDecimal acph) {
		this.acph = acph;
	}

	public BigDecimal getAldr() {
		return this.aldr;
	}

	public void setAldr(BigDecimal aldr) {
		this.aldr = aldr;
	}

	public BigDecimal getAnth() {
		return this.anth;
	}

	public void setAnth(BigDecimal anth) {
		this.anth = anth;
	}

	public BigDecimal getBant() {
		return this.bant;
	}

	public void setBant(BigDecimal bant) {
		this.bant = bant;
	}

	public BigDecimal getBapy() {
		return this.bapy;
	}

	public void setBapy(BigDecimal bapy) {
		this.bapy = bapy;
	}

	public BigDecimal getBbfl() {
		return this.bbfl;
	}

	public void setBbfl(BigDecimal bbfl) {
		this.bbfl = bbfl;
	}

	public BigDecimal getBbhc() {
		return this.bbhc;
	}

	public void setBbhc(BigDecimal bbhc) {
		this.bbhc = bbhc;
	}

	public BigDecimal getBdcm() {
		return this.bdcm;
	}

	public void setBdcm(BigDecimal bdcm) {
		this.bdcm = bdcm;
	}

	public BigDecimal getBgpe() {
		return this.bgpe;
	}

	public void setBgpe(BigDecimal bgpe) {
		this.bgpe = bgpe;
	}

	public BigDecimal getBhc() {
		return this.bhc;
	}

	public void setBhc(BigDecimal bhc) {
		this.bhc = bhc;
	}

	public BigDecimal getBkfl() {
		return this.bkfl;
	}

	public void setBkfl(BigDecimal bkfl) {
		this.bkfl = bkfl;
	}

	public BigDecimal getBrom() {
		return this.brom;
	}

	public void setBrom(BigDecimal brom) {
		this.brom = brom;
	}

	public String getBtOId() {
		return this.btOId;
	}

	public void setBtOId(String btOId) {
		this.btOId = btOId;
	}

	public String getBtSpcodeId() {
		return this.btSpcodeId;
	}

	public void setBtSpcodeId(String btSpcodeId) {
		this.btSpcodeId = btSpcodeId;
	}

	public String getBtVisitId() {
		return this.btVisitId;
	}

	public void setBtVisitId(String btVisitId) {
		this.btVisitId = btVisitId;
	}

	public BigDecimal getBtcm() {
		return this.btcm;
	}

	public void setBtcm(BigDecimal btcm) {
		this.btcm = btcm;
	}

	public BigDecimal getCdbm() {
		return this.cdbm;
	}

	public void setCdbm(BigDecimal cdbm) {
		this.cdbm = cdbm;
	}

	public BigDecimal getChry() {
		return this.chry;
	}

	public void setChry(BigDecimal chry) {
		this.chry = chry;
	}

	public BigDecimal getCp() {
		return this.cp;
	}

	public void setCp(BigDecimal cp) {
		this.cp = cp;
	}

	public BigDecimal getDaan() {
		return this.daan;
	}

	public void setDaan(BigDecimal daan) {
		this.daan = daan;
	}

	public BigDecimal getDbhc() {
		return this.dbhc;
	}

	public void setDbhc(BigDecimal dbhc) {
		this.dbhc = dbhc;
	}

	public Timestamp getDeleteDate() {
		return this.deleteDate;
	}

	public void setDeleteDate(Timestamp deleteDate) {
		this.deleteDate = deleteDate;
	}

	public String getDeleteUser() {
		return this.deleteUser;
	}

	public void setDeleteUser(String deleteUser) {
		this.deleteUser = deleteUser;
	}

	public BigDecimal getDiel() {
		return this.diel;
	}

	public void setDiel(BigDecimal diel) {
		this.diel = diel;
	}

	public BigDecimal getDwrO() {
		return this.dwrO;
	}

	public void setDwrO(BigDecimal dwrO) {
		this.dwrO = dwrO;
	}

	public BigDecimal getEnd1() {
		return this.end1;
	}

	public void setEnd1(BigDecimal end1) {
		this.end1 = end1;
	}

	public BigDecimal getEnd2() {
		return this.end2;
	}

	public void setEnd2(BigDecimal end2) {
		this.end2 = end2;
	}

	public BigDecimal getEndr() {
		return this.endr;
	}

	public void setEndr(BigDecimal endr) {
		this.endr = endr;
	}

	public BigDecimal getFluo() {
		return this.fluo;
	}

	public void setFluo(BigDecimal fluo) {
		this.fluo = fluo;
	}

	public BigDecimal getFlut() {
		return this.flut;
	}

	public void setFlut(BigDecimal flut) {
		this.flut = flut;
	}

	public BigDecimal getGbhc() {
		return this.gbhc;
	}

	public void setGbhc(BigDecimal gbhc) {
		this.gbhc = gbhc;
	}

	public BigDecimal getHcb() {
		return this.hcb;
	}

	public void setHcb(BigDecimal hcb) {
		this.hcb = hcb;
	}

	public BigDecimal getHepo() {
		return this.hepo;
	}

	public void setHepo(BigDecimal hepo) {
		this.hepo = hepo;
	}

	public BigDecimal getHept() {
		return this.hept;
	}

	public void setHept(BigDecimal hept) {
		this.hept = hept;
	}

	public BigDecimal getInpy() {
		return this.inpy;
	}

	public void setInpy(BigDecimal inpy) {
		this.inpy = inpy;
	}

	public String getLAbhc() {
		return this.lAbhc;
	}

	public void setLAbhc(String lAbhc) {
		this.lAbhc = lAbhc;
	}

	public String getLAcen() {
		return this.lAcen;
	}

	public void setLAcen(String lAcen) {
		this.lAcen = lAcen;
	}

	public String getLAcph() {
		return this.lAcph;
	}

	public void setLAcph(String lAcph) {
		this.lAcph = lAcph;
	}

	public String getLAldr() {
		return this.lAldr;
	}

	public void setLAldr(String lAldr) {
		this.lAldr = lAldr;
	}

	public String getLAnth() {
		return this.lAnth;
	}

	public void setLAnth(String lAnth) {
		this.lAnth = lAnth;
	}

	public String getLBant() {
		return this.lBant;
	}

	public void setLBant(String lBant) {
		this.lBant = lBant;
	}

	public String getLBapy() {
		return this.lBapy;
	}

	public void setLBapy(String lBapy) {
		this.lBapy = lBapy;
	}

	public String getLBbfl() {
		return this.lBbfl;
	}

	public void setLBbfl(String lBbfl) {
		this.lBbfl = lBbfl;
	}

	public String getLBbhc() {
		return this.lBbhc;
	}

	public void setLBbhc(String lBbhc) {
		this.lBbhc = lBbhc;
	}

	public String getLBdcm() {
		return this.lBdcm;
	}

	public void setLBdcm(String lBdcm) {
		this.lBdcm = lBdcm;
	}

	public String getLBgpe() {
		return this.lBgpe;
	}

	public void setLBgpe(String lBgpe) {
		this.lBgpe = lBgpe;
	}

	public String getLBhc() {
		return this.lBhc;
	}

	public void setLBhc(String lBhc) {
		this.lBhc = lBhc;
	}

	public String getLBkfl() {
		return this.lBkfl;
	}

	public void setLBkfl(String lBkfl) {
		this.lBkfl = lBkfl;
	}

	public String getLBrom() {
		return this.lBrom;
	}

	public void setLBrom(String lBrom) {
		this.lBrom = lBrom;
	}

	public String getLBtcm() {
		return this.lBtcm;
	}

	public void setLBtcm(String lBtcm) {
		this.lBtcm = lBtcm;
	}

	public String getLCdbm() {
		return this.lCdbm;
	}

	public void setLCdbm(String lCdbm) {
		this.lCdbm = lCdbm;
	}

	public String getLChry() {
		return this.lChry;
	}

	public void setLChry(String lChry) {
		this.lChry = lChry;
	}

	public String getLCp() {
		return this.lCp;
	}

	public void setLCp(String lCp) {
		this.lCp = lCp;
	}

	public String getLDaan() {
		return this.lDaan;
	}

	public void setLDaan(String lDaan) {
		this.lDaan = lDaan;
	}

	public String getLDbhc() {
		return this.lDbhc;
	}

	public void setLDbhc(String lDbhc) {
		this.lDbhc = lDbhc;
	}

	public String getLDiel() {
		return this.lDiel;
	}

	public void setLDiel(String lDiel) {
		this.lDiel = lDiel;
	}

	public String getLDwrO() {
		return this.lDwrO;
	}

	public void setLDwrO(String lDwrO) {
		this.lDwrO = lDwrO;
	}

	public String getLEnd1() {
		return this.lEnd1;
	}

	public void setLEnd1(String lEnd1) {
		this.lEnd1 = lEnd1;
	}

	public String getLEnd2() {
		return this.lEnd2;
	}

	public void setLEnd2(String lEnd2) {
		this.lEnd2 = lEnd2;
	}

	public String getLEndr() {
		return this.lEndr;
	}

	public void setLEndr(String lEndr) {
		this.lEndr = lEndr;
	}

	public String getLFluo() {
		return this.lFluo;
	}

	public void setLFluo(String lFluo) {
		this.lFluo = lFluo;
	}

	public String getLFlut() {
		return this.lFlut;
	}

	public void setLFlut(String lFlut) {
		this.lFlut = lFlut;
	}

	public String getLGbhc() {
		return this.lGbhc;
	}

	public void setLGbhc(String lGbhc) {
		this.lGbhc = lGbhc;
	}

	public String getLHcb() {
		return this.lHcb;
	}

	public void setLHcb(String lHcb) {
		this.lHcb = lHcb;
	}

	public String getLHepo() {
		return this.lHepo;
	}

	public void setLHepo(String lHepo) {
		this.lHepo = lHepo;
	}

	public String getLHept() {
		return this.lHept;
	}

	public void setLHept(String lHept) {
		this.lHept = lHept;
	}

	public String getLInpy() {
		return this.lInpy;
	}

	public void setLInpy(String lInpy) {
		this.lInpy = lInpy;
	}

	public String getLMdcb() {
		return this.lMdcb;
	}

	public void setLMdcb(String lMdcb) {
		this.lMdcb = lMdcb;
	}

	public String getLOdcb() {
		return this.lOdcb;
	}

	public void setLOdcb(String lOdcb) {
		this.lOdcb = lOdcb;
	}

	public String getLOddd() {
		return this.lOddd;
	}

	public void setLOddd(String lOddd) {
		this.lOddd = lOddd;
	}

	public String getLOdde() {
		return this.lOdde;
	}

	public void setLOdde(String lOdde) {
		this.lOdde = lOdde;
	}

	public String getLOddt() {
		return this.lOddt;
	}

	public void setLOddt(String lOddt) {
		this.lOddt = lOddt;
	}

	public String getLPah() {
		return this.lPah;
	}

	public void setLPah(String lPah) {
		this.lPah = lPah;
	}

	public String getLPcb101() {
		return this.lPcb101;
	}

	public void setLPcb101(String lPcb101) {
		this.lPcb101 = lPcb101;
	}

	public String getLPcb105() {
		return this.lPcb105;
	}

	public void setLPcb105(String lPcb105) {
		this.lPcb105 = lPcb105;
	}

	public String getLPcb114() {
		return this.lPcb114;
	}

	public void setLPcb114(String lPcb114) {
		this.lPcb114 = lPcb114;
	}

	public String getLPcb118() {
		return this.lPcb118;
	}

	public void setLPcb118(String lPcb118) {
		this.lPcb118 = lPcb118;
	}

	public String getLPcb123() {
		return this.lPcb123;
	}

	public void setLPcb123(String lPcb123) {
		this.lPcb123 = lPcb123;
	}

	public String getLPcb126() {
		return this.lPcb126;
	}

	public void setLPcb126(String lPcb126) {
		this.lPcb126 = lPcb126;
	}

	public String getLPcb128() {
		return this.lPcb128;
	}

	public void setLPcb128(String lPcb128) {
		this.lPcb128 = lPcb128;
	}

	public String getLPcb138() {
		return this.lPcb138;
	}

	public void setLPcb138(String lPcb138) {
		this.lPcb138 = lPcb138;
	}

	public String getLPcb149() {
		return this.lPcb149;
	}

	public void setLPcb149(String lPcb149) {
		this.lPcb149 = lPcb149;
	}

	public String getLPcb153() {
		return this.lPcb153;
	}

	public void setLPcb153(String lPcb153) {
		this.lPcb153 = lPcb153;
	}

	public String getLPcb156() {
		return this.lPcb156;
	}

	public void setLPcb156(String lPcb156) {
		this.lPcb156 = lPcb156;
	}

	public String getLPcb157() {
		return this.lPcb157;
	}

	public void setLPcb157(String lPcb157) {
		this.lPcb157 = lPcb157;
	}

	public String getLPcb167() {
		return this.lPcb167;
	}

	public void setLPcb167(String lPcb167) {
		this.lPcb167 = lPcb167;
	}

	public String getLPcb169() {
		return this.lPcb169;
	}

	public void setLPcb169(String lPcb169) {
		this.lPcb169 = lPcb169;
	}

	public String getLPcb170() {
		return this.lPcb170;
	}

	public void setLPcb170(String lPcb170) {
		this.lPcb170 = lPcb170;
	}

	public String getLPcb18() {
		return this.lPcb18;
	}

	public void setLPcb18(String lPcb18) {
		this.lPcb18 = lPcb18;
	}

	public String getLPcb180() {
		return this.lPcb180;
	}

	public void setLPcb180(String lPcb180) {
		this.lPcb180 = lPcb180;
	}

	public String getLPcb187() {
		return this.lPcb187;
	}

	public void setLPcb187(String lPcb187) {
		this.lPcb187 = lPcb187;
	}

	public String getLPcb189() {
		return this.lPcb189;
	}

	public void setLPcb189(String lPcb189) {
		this.lPcb189 = lPcb189;
	}

	public String getLPcb28() {
		return this.lPcb28;
	}

	public void setLPcb28(String lPcb28) {
		this.lPcb28 = lPcb28;
	}

	public String getLPcb31() {
		return this.lPcb31;
	}

	public void setLPcb31(String lPcb31) {
		this.lPcb31 = lPcb31;
	}

	public String getLPcb44() {
		return this.lPcb44;
	}

	public void setLPcb44(String lPcb44) {
		this.lPcb44 = lPcb44;
	}

	public String getLPcb52() {
		return this.lPcb52;
	}

	public void setLPcb52(String lPcb52) {
		this.lPcb52 = lPcb52;
	}

	public String getLPcb66() {
		return this.lPcb66;
	}

	public void setLPcb66(String lPcb66) {
		this.lPcb66 = lPcb66;
	}

	public String getLPcb77() {
		return this.lPcb77;
	}

	public void setLPcb77(String lPcb77) {
		this.lPcb77 = lPcb77;
	}

	public String getLPcb8() {
		return this.lPcb8;
	}

	public void setLPcb8(String lPcb8) {
		this.lPcb8 = lPcb8;
	}

	public String getLPcb81() {
		return this.lPcb81;
	}

	public void setLPcb81(String lPcb81) {
		this.lPcb81 = lPcb81;
	}

	public String getLPcb88() {
		return this.lPcb88;
	}

	public void setLPcb88(String lPcb88) {
		this.lPcb88 = lPcb88;
	}

	public String getLPcbs() {
		return this.lPcbs;
	}

	public void setLPcbs(String lPcbs) {
		this.lPcbs = lPcbs;
	}

	public String getLPddd() {
		return this.lPddd;
	}

	public void setLPddd(String lPddd) {
		this.lPddd = lPddd;
	}

	public String getLPdde() {
		return this.lPdde;
	}

	public void setLPdde(String lPdde) {
		this.lPdde = lPdde;
	}

	public String getLPddt() {
		return this.lPddt;
	}

	public void setLPddt(String lPddt) {
		this.lPddt = lPddt;
	}

	public String getLPhen() {
		return this.lPhen;
	}

	public void setLPhen(String lPhen) {
		this.lPhen = lPhen;
	}

	public String getLPyre() {
		return this.lPyre;
	}

	public void setLPyre(String lPyre) {
		this.lPyre = lPyre;
	}

	public String getLTce() {
		return this.lTce;
	}

	public void setLTce(String lTce) {
		this.lTce = lTce;
	}

	public String getLTcm() {
		return this.lTcm;
	}

	public void setLTcm(String lTcm) {
		this.lTcm = lTcm;
	}

	public String getLThm() {
		return this.lThm;
	}

	public void setLThm(String lThm) {
		this.lThm = lThm;
	}

	public String getLThms() {
		return this.lThms;
	}

	public void setLThms(String lThms) {
		this.lThms = lThms;
	}

	public String getLTrce() {
		return this.lTrce;
	}

	public void setLTrce(String lTrce) {
		this.lTrce = lTrce;
	}

	public BigDecimal getLipid() {
		return this.lipid;
	}

	public void setLipid(BigDecimal lipid) {
		this.lipid = lipid;
	}

	public BigDecimal getMdcb() {
		return this.mdcb;
	}

	public void setMdcb(BigDecimal mdcb) {
		this.mdcb = mdcb;
	}

	public BigDecimal getOdcb() {
		return this.odcb;
	}

	public void setOdcb(BigDecimal odcb) {
		this.odcb = odcb;
	}

	public BigDecimal getOddd() {
		return this.oddd;
	}

	public void setOddd(BigDecimal oddd) {
		this.oddd = oddd;
	}

	public BigDecimal getOdde() {
		return this.odde;
	}

	public void setOdde(BigDecimal odde) {
		this.odde = odde;
	}

	public BigDecimal getOddt() {
		return this.oddt;
	}

	public void setOddt(BigDecimal oddt) {
		this.oddt = oddt;
	}

	public BigDecimal getPah() {
		return this.pah;
	}

	public void setPah(BigDecimal pah) {
		this.pah = pah;
	}

	public BigDecimal getPcb101() {
		return this.pcb101;
	}

	public void setPcb101(BigDecimal pcb101) {
		this.pcb101 = pcb101;
	}

	public BigDecimal getPcb105() {
		return this.pcb105;
	}

	public void setPcb105(BigDecimal pcb105) {
		this.pcb105 = pcb105;
	}

	public BigDecimal getPcb114() {
		return this.pcb114;
	}

	public void setPcb114(BigDecimal pcb114) {
		this.pcb114 = pcb114;
	}

	public BigDecimal getPcb118() {
		return this.pcb118;
	}

	public void setPcb118(BigDecimal pcb118) {
		this.pcb118 = pcb118;
	}

	public BigDecimal getPcb123() {
		return this.pcb123;
	}

	public void setPcb123(BigDecimal pcb123) {
		this.pcb123 = pcb123;
	}

	public BigDecimal getPcb126() {
		return this.pcb126;
	}

	public void setPcb126(BigDecimal pcb126) {
		this.pcb126 = pcb126;
	}

	public BigDecimal getPcb128() {
		return this.pcb128;
	}

	public void setPcb128(BigDecimal pcb128) {
		this.pcb128 = pcb128;
	}

	public BigDecimal getPcb138() {
		return this.pcb138;
	}

	public void setPcb138(BigDecimal pcb138) {
		this.pcb138 = pcb138;
	}

	public BigDecimal getPcb149() {
		return this.pcb149;
	}

	public void setPcb149(BigDecimal pcb149) {
		this.pcb149 = pcb149;
	}

	public BigDecimal getPcb153() {
		return this.pcb153;
	}

	public void setPcb153(BigDecimal pcb153) {
		this.pcb153 = pcb153;
	}

	public BigDecimal getPcb156() {
		return this.pcb156;
	}

	public void setPcb156(BigDecimal pcb156) {
		this.pcb156 = pcb156;
	}

	public BigDecimal getPcb157() {
		return this.pcb157;
	}

	public void setPcb157(BigDecimal pcb157) {
		this.pcb157 = pcb157;
	}

	public BigDecimal getPcb167() {
		return this.pcb167;
	}

	public void setPcb167(BigDecimal pcb167) {
		this.pcb167 = pcb167;
	}

	public BigDecimal getPcb169() {
		return this.pcb169;
	}

	public void setPcb169(BigDecimal pcb169) {
		this.pcb169 = pcb169;
	}

	public BigDecimal getPcb170() {
		return this.pcb170;
	}

	public void setPcb170(BigDecimal pcb170) {
		this.pcb170 = pcb170;
	}

	public BigDecimal getPcb18() {
		return this.pcb18;
	}

	public void setPcb18(BigDecimal pcb18) {
		this.pcb18 = pcb18;
	}

	public BigDecimal getPcb180() {
		return this.pcb180;
	}

	public void setPcb180(BigDecimal pcb180) {
		this.pcb180 = pcb180;
	}

	public BigDecimal getPcb187() {
		return this.pcb187;
	}

	public void setPcb187(BigDecimal pcb187) {
		this.pcb187 = pcb187;
	}

	public BigDecimal getPcb189() {
		return this.pcb189;
	}

	public void setPcb189(BigDecimal pcb189) {
		this.pcb189 = pcb189;
	}

	public BigDecimal getPcb28() {
		return this.pcb28;
	}

	public void setPcb28(BigDecimal pcb28) {
		this.pcb28 = pcb28;
	}

	public BigDecimal getPcb31() {
		return this.pcb31;
	}

	public void setPcb31(BigDecimal pcb31) {
		this.pcb31 = pcb31;
	}

	public BigDecimal getPcb44() {
		return this.pcb44;
	}

	public void setPcb44(BigDecimal pcb44) {
		this.pcb44 = pcb44;
	}

	public BigDecimal getPcb52() {
		return this.pcb52;
	}

	public void setPcb52(BigDecimal pcb52) {
		this.pcb52 = pcb52;
	}

	public BigDecimal getPcb66() {
		return this.pcb66;
	}

	public void setPcb66(BigDecimal pcb66) {
		this.pcb66 = pcb66;
	}

	public BigDecimal getPcb77() {
		return this.pcb77;
	}

	public void setPcb77(BigDecimal pcb77) {
		this.pcb77 = pcb77;
	}

	public BigDecimal getPcb8() {
		return this.pcb8;
	}

	public void setPcb8(BigDecimal pcb8) {
		this.pcb8 = pcb8;
	}

	public BigDecimal getPcb81() {
		return this.pcb81;
	}

	public void setPcb81(BigDecimal pcb81) {
		this.pcb81 = pcb81;
	}

	public BigDecimal getPcb88() {
		return this.pcb88;
	}

	public void setPcb88(BigDecimal pcb88) {
		this.pcb88 = pcb88;
	}

	public BigDecimal getPcbs() {
		return this.pcbs;
	}

	public void setPcbs(BigDecimal pcbs) {
		this.pcbs = pcbs;
	}

	public BigDecimal getPddd() {
		return this.pddd;
	}

	public void setPddd(BigDecimal pddd) {
		this.pddd = pddd;
	}

	public BigDecimal getPdde() {
		return this.pdde;
	}

	public void setPdde(BigDecimal pdde) {
		this.pdde = pdde;
	}

	public BigDecimal getPddt() {
		return this.pddt;
	}

	public void setPddt(BigDecimal pddt) {
		this.pddt = pddt;
	}

	public BigDecimal getPhen() {
		return this.phen;
	}

	public void setPhen(BigDecimal phen) {
		this.phen = phen;
	}

	public BigDecimal getPyre() {
		return this.pyre;
	}

	public void setPyre(BigDecimal pyre) {
		this.pyre = pyre;
	}

	public String getSampleMark() {
		return this.sampleMark;
	}

	public void setSampleMark(String sampleMark) {
		this.sampleMark = sampleMark;
	}

	public BigDecimal getTce() {
		return this.tce;
	}

	public void setTce(BigDecimal tce) {
		this.tce = tce;
	}

	public BigDecimal getTcm() {
		return this.tcm;
	}

	public void setTcm(BigDecimal tcm) {
		this.tcm = tcm;
	}

	public BigDecimal getThm() {
		return this.thm;
	}

	public void setThm(BigDecimal thm) {
		this.thm = thm;
	}

	public BigDecimal getThms() {
		return this.thms;
	}

	public void setThms(BigDecimal thms) {
		this.thms = thms;
	}

	public BigDecimal getTrce() {
		return this.trce;
	}

	public void setTrce(BigDecimal trce) {
		this.trce = trce;
	}

	public String getValidCode() {
		return this.validCode;
	}

	public void setValidCode(String validCode) {
		this.validCode = validCode;
	}

	public Timestamp getValidDate() {
		return this.validDate;
	}

	public void setValidDate(Timestamp validDate) {
		this.validDate = validDate;
	}

	public String getValidUser() {
		return this.validUser;
	}

	public void setValidUser(String validUser) {
		this.validUser = validUser;
	}

}