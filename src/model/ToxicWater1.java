package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the toxic_water1 database table.
 * 
 */
//@Entity
@Table(name="toxic_water1")
@NamedQuery(name="ToxicWater1.findAll", query="SELECT t FROM ToxicWater1 t")
public class ToxicWater1 implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal abhc;

	private BigDecimal acen;

	private BigDecimal achd;

	private BigDecimal acph;

	private BigDecimal aldr;

	private BigDecimal anth;

	@Column(name="\"AS\"")
	private BigDecimal as;

	@Column(name="as_inorg")
	private BigDecimal asInorg;

	private BigDecimal bant;

	private BigDecimal bapy;

	private BigDecimal bbfl;

	private BigDecimal bbhc;

	private BigDecimal bgpe;

	private BigDecimal bkfl;

	private BigDecimal cd;

	private BigDecimal cdd;

	private BigDecimal chry;

	private BigDecimal cnon;

	private BigDecimal daan;

	private BigDecimal dbhc;

	private BigDecimal dbt;

	private BigDecimal diel;

	private BigDecimal dlpcb105;

	private BigDecimal dlpcb114;

	private BigDecimal dlpcb118;

	private BigDecimal dlpcb123;

	private BigDecimal dlpcb126;

	private BigDecimal dlpcb156;

	private BigDecimal dlpcb157;

	private BigDecimal dlpcb167;

	private BigDecimal dlpcb169;

	private BigDecimal dlpcb189;

	private BigDecimal dlpcb77;

	private BigDecimal dlpcb81;

	private BigDecimal end1;

	private BigDecimal end2;

	private BigDecimal endr;

	private BigDecimal fluo;

	private BigDecimal flut;

	private BigDecimal gbhc;

	private BigDecimal gchd;

	private BigDecimal hcb;

	private BigDecimal hepo;

	private BigDecimal hept;

	private BigDecimal hpcdd1;

	private BigDecimal hpcdf1;

	private BigDecimal hpcdf2;

	private BigDecimal hxcdd1;

	private BigDecimal hxcdd2;

	private BigDecimal hxcdd3;

	private BigDecimal hxcdf1;

	private BigDecimal hxcdf2;

	private BigDecimal hxcdf3;

	private BigDecimal hxcdf4;

	private BigDecimal inpy;

	private BigDecimal kepone;

	@Column(name="l_abhc")
	private String lAbhc;

	@Column(name="l_acen")
	private String lAcen;

	@Column(name="l_achd")
	private String lAchd;

	@Column(name="l_acph")
	private String lAcph;

	@Column(name="l_aldr")
	private String lAldr;

	@Column(name="l_anth")
	private String lAnth;

	@Column(name="l_as")
	private String lAs;

	@Column(name="l_as_inorg")
	private String lAsInorg;

	@Column(name="l_bant")
	private String lBant;

	@Column(name="l_bapy")
	private String lBapy;

	@Column(name="l_bbfl")
	private String lBbfl;

	@Column(name="l_bbhc")
	private String lBbhc;

	@Column(name="l_bgpe")
	private String lBgpe;

	@Column(name="l_bkfl")
	private String lBkfl;

	@Column(name="l_cd")
	private String lCd;

	@Column(name="l_chry")
	private String lChry;

	@Column(name="l_cnon")
	private String lCnon;

	@Column(name="l_daan")
	private String lDaan;

	@Column(name="l_dbhc")
	private String lDbhc;

	@Column(name="l_dbt")
	private String lDbt;

	@Column(name="l_diel")
	private String lDiel;

	@Column(name="l_dlpcb105")
	private String lDlpcb105;

	@Column(name="l_dlpcb114")
	private String lDlpcb114;

	@Column(name="l_dlpcb118")
	private String lDlpcb118;

	@Column(name="l_dlpcb123")
	private String lDlpcb123;

	@Column(name="l_dlpcb126")
	private String lDlpcb126;

	@Column(name="l_dlpcb156")
	private String lDlpcb156;

	@Column(name="l_dlpcb157")
	private String lDlpcb157;

	@Column(name="l_dlpcb167")
	private String lDlpcb167;

	@Column(name="l_dlpcb169")
	private String lDlpcb169;

	@Column(name="l_dlpcb189")
	private String lDlpcb189;

	@Column(name="l_dlpcb77")
	private String lDlpcb77;

	@Column(name="l_dlpcb81")
	private String lDlpcb81;

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

	@Column(name="l_gchd")
	private String lGchd;

	@Column(name="l_hcb")
	private String lHcb;

	@Column(name="l_hepo")
	private String lHepo;

	@Column(name="l_hept")
	private String lHept;

	@Column(name="l_hpcdd1")
	private String lHpcdd1;

	@Column(name="l_hpcdf1")
	private String lHpcdf1;

	@Column(name="l_hpcdf2")
	private String lHpcdf2;

	@Column(name="l_hxcdd1")
	private String lHxcdd1;

	@Column(name="l_hxcdd2")
	private String lHxcdd2;

	@Column(name="l_hxcdd3")
	private String lHxcdd3;

	@Column(name="l_hxcdf1")
	private String lHxcdf1;

	@Column(name="l_hxcdf2")
	private String lHxcdf2;

	@Column(name="l_hxcdf3")
	private String lHxcdf3;

	@Column(name="l_hxcdf4")
	private String lHxcdf4;

	@Column(name="l_inpy")
	private String lInpy;

	@Column(name="l_kepone")
	private String lKepone;

	@Column(name="l_mbt")
	private String lMbt;

	@Column(name="l_mirx")
	private String lMirx;

	@Column(name="l_naph")
	private String lNaph;

	@Column(name="l_np")
	private String lNp;

	@Column(name="l_npde")
	private String lNpde;

	@Column(name="l_npe")
	private String lNpe;

	@Column(name="l_npme")
	private String lNpme;

	@Column(name="l_ocdd")
	private String lOcdd;

	@Column(name="l_ocdf")
	private String lOcdf;

	@Column(name="l_ochd")
	private String lOchd;

	@Column(name="l_oddd")
	private String lOddd;

	@Column(name="l_odde")
	private String lOdde;

	@Column(name="l_oddt")
	private String lOddt;

	@Column(name="l_pbb")
	private String lPbb;

	@Column(name="l_pbde100")
	private String lPbde100;

	@Column(name="l_pbde153")
	private String lPbde153;

	@Column(name="l_pbde154")
	private String lPbde154;

	@Column(name="l_pbde17")
	private String lPbde17;

	@Column(name="l_pbde183")
	private String lPbde183;

	@Column(name="l_pbde197")
	private String lPbde197;

	@Column(name="l_pbde209")
	private String lPbde209;

	@Column(name="l_pbde28")
	private String lPbde28;

	@Column(name="l_pbde47")
	private String lPbde47;

	@Column(name="l_pbde99")
	private String lPbde99;

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

	@Column(name="l_pddd")
	private String lPddd;

	@Column(name="l_pdde")
	private String lPdde;

	@Column(name="l_pddt")
	private String lPddt;

	@Column(name="l_pecb")
	private String lPecb;

	@Column(name="l_pecdd1")
	private String lPecdd1;

	@Column(name="l_pecdf1")
	private String lPecdf1;

	@Column(name="l_pecdf2")
	private String lPecdf2;

	@Column(name="l_pf")
	private String lPf;

	@Column(name="l_pfoa")
	private String lPfoa;

	@Column(name="l_pfos")
	private String lPfos;

	@Column(name="l_pfosf")
	private String lPfosf;

	@Column(name="l_phen")
	private String lPhen;

	@Column(name="l_pyre")
	private String lPyre;

	@Column(name="l_tbt")
	private String lTbt;

	@Column(name="l_tcdd1")
	private String lTcdd1;

	@Column(name="l_tcdf1")
	private String lTcdf1;

	@Column(name="l_tnon")
	private String lTnon;

	@Column(name="l_tox_p26")
	private String lToxP26;

	@Column(name="l_tox_p50")
	private String lToxP50;

	@Column(name="l_tox_p62")
	private String lToxP62;

	@Column(name="l_zn")
	private String lZn;

	private BigDecimal mbt;

	private Timestamp mdate;

	private BigDecimal mirx;

	private BigDecimal naph;

	private BigDecimal np;

	private BigDecimal npde;

	private BigDecimal npe;

	private BigDecimal npme;

	private BigDecimal ocdd;

	private BigDecimal ocdf;

	private BigDecimal ochd;

	private BigDecimal oddd;

	private BigDecimal odde;

	private BigDecimal oddt;

	private BigDecimal osn;

	private BigDecimal pah;

	private BigDecimal pbb;

	private BigDecimal pbde;

	private BigDecimal pbde100;

	private BigDecimal pbde153;

	private BigDecimal pbde154;

	private BigDecimal pbde17;

	private BigDecimal pbde183;

	private BigDecimal pbde197;

	private BigDecimal pbde209;

	private BigDecimal pbde28;

	private BigDecimal pbde47;

	private BigDecimal pbde99;

	private BigDecimal pcb;

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

	private BigDecimal pddd;

	private BigDecimal pdde;

	private BigDecimal pddt;

	private BigDecimal pecb;

	private BigDecimal pecdd1;

	private BigDecimal pecdf1;

	private BigDecimal pecdf2;

	private BigDecimal pf;

	private BigDecimal pfoa;

	private BigDecimal pfos;

	private BigDecimal pfosf;

	private BigDecimal phen;

	private BigDecimal pyre;

	@Column(name="sam_no")
	private BigDecimal samNo;

	private String station;

	private BigDecimal stime;

	private String subzone;

	private BigDecimal tbt;

	private BigDecimal tcdd1;

	private BigDecimal tcdf1;

	@Column(name="teq_type")
	private String teqType;

	private BigDecimal tnon;

	private BigDecimal tox;

	@Column(name="tox_p26")
	private BigDecimal toxP26;

	@Column(name="tox_p50")
	private BigDecimal toxP50;

	@Column(name="tox_p62")
	private BigDecimal toxP62;

	private String type;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	private BigDecimal zn;

	private String zone;

	public ToxicWater1() {
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

	public BigDecimal getAchd() {
		return this.achd;
	}

	public void setAchd(BigDecimal achd) {
		this.achd = achd;
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

	public BigDecimal getAs() {
		return this.as;
	}

	public void setAs(BigDecimal as) {
		this.as = as;
	}

	public BigDecimal getAsInorg() {
		return this.asInorg;
	}

	public void setAsInorg(BigDecimal asInorg) {
		this.asInorg = asInorg;
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

	public BigDecimal getBgpe() {
		return this.bgpe;
	}

	public void setBgpe(BigDecimal bgpe) {
		this.bgpe = bgpe;
	}

	public BigDecimal getBkfl() {
		return this.bkfl;
	}

	public void setBkfl(BigDecimal bkfl) {
		this.bkfl = bkfl;
	}

	public BigDecimal getCd() {
		return this.cd;
	}

	public void setCd(BigDecimal cd) {
		this.cd = cd;
	}

	public BigDecimal getCdd() {
		return this.cdd;
	}

	public void setCdd(BigDecimal cdd) {
		this.cdd = cdd;
	}

	public BigDecimal getChry() {
		return this.chry;
	}

	public void setChry(BigDecimal chry) {
		this.chry = chry;
	}

	public BigDecimal getCnon() {
		return this.cnon;
	}

	public void setCnon(BigDecimal cnon) {
		this.cnon = cnon;
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

	public BigDecimal getDbt() {
		return this.dbt;
	}

	public void setDbt(BigDecimal dbt) {
		this.dbt = dbt;
	}

	public BigDecimal getDiel() {
		return this.diel;
	}

	public void setDiel(BigDecimal diel) {
		this.diel = diel;
	}

	public BigDecimal getDlpcb105() {
		return this.dlpcb105;
	}

	public void setDlpcb105(BigDecimal dlpcb105) {
		this.dlpcb105 = dlpcb105;
	}

	public BigDecimal getDlpcb114() {
		return this.dlpcb114;
	}

	public void setDlpcb114(BigDecimal dlpcb114) {
		this.dlpcb114 = dlpcb114;
	}

	public BigDecimal getDlpcb118() {
		return this.dlpcb118;
	}

	public void setDlpcb118(BigDecimal dlpcb118) {
		this.dlpcb118 = dlpcb118;
	}

	public BigDecimal getDlpcb123() {
		return this.dlpcb123;
	}

	public void setDlpcb123(BigDecimal dlpcb123) {
		this.dlpcb123 = dlpcb123;
	}

	public BigDecimal getDlpcb126() {
		return this.dlpcb126;
	}

	public void setDlpcb126(BigDecimal dlpcb126) {
		this.dlpcb126 = dlpcb126;
	}

	public BigDecimal getDlpcb156() {
		return this.dlpcb156;
	}

	public void setDlpcb156(BigDecimal dlpcb156) {
		this.dlpcb156 = dlpcb156;
	}

	public BigDecimal getDlpcb157() {
		return this.dlpcb157;
	}

	public void setDlpcb157(BigDecimal dlpcb157) {
		this.dlpcb157 = dlpcb157;
	}

	public BigDecimal getDlpcb167() {
		return this.dlpcb167;
	}

	public void setDlpcb167(BigDecimal dlpcb167) {
		this.dlpcb167 = dlpcb167;
	}

	public BigDecimal getDlpcb169() {
		return this.dlpcb169;
	}

	public void setDlpcb169(BigDecimal dlpcb169) {
		this.dlpcb169 = dlpcb169;
	}

	public BigDecimal getDlpcb189() {
		return this.dlpcb189;
	}

	public void setDlpcb189(BigDecimal dlpcb189) {
		this.dlpcb189 = dlpcb189;
	}

	public BigDecimal getDlpcb77() {
		return this.dlpcb77;
	}

	public void setDlpcb77(BigDecimal dlpcb77) {
		this.dlpcb77 = dlpcb77;
	}

	public BigDecimal getDlpcb81() {
		return this.dlpcb81;
	}

	public void setDlpcb81(BigDecimal dlpcb81) {
		this.dlpcb81 = dlpcb81;
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

	public BigDecimal getGchd() {
		return this.gchd;
	}

	public void setGchd(BigDecimal gchd) {
		this.gchd = gchd;
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

	public BigDecimal getHpcdd1() {
		return this.hpcdd1;
	}

	public void setHpcdd1(BigDecimal hpcdd1) {
		this.hpcdd1 = hpcdd1;
	}

	public BigDecimal getHpcdf1() {
		return this.hpcdf1;
	}

	public void setHpcdf1(BigDecimal hpcdf1) {
		this.hpcdf1 = hpcdf1;
	}

	public BigDecimal getHpcdf2() {
		return this.hpcdf2;
	}

	public void setHpcdf2(BigDecimal hpcdf2) {
		this.hpcdf2 = hpcdf2;
	}

	public BigDecimal getHxcdd1() {
		return this.hxcdd1;
	}

	public void setHxcdd1(BigDecimal hxcdd1) {
		this.hxcdd1 = hxcdd1;
	}

	public BigDecimal getHxcdd2() {
		return this.hxcdd2;
	}

	public void setHxcdd2(BigDecimal hxcdd2) {
		this.hxcdd2 = hxcdd2;
	}

	public BigDecimal getHxcdd3() {
		return this.hxcdd3;
	}

	public void setHxcdd3(BigDecimal hxcdd3) {
		this.hxcdd3 = hxcdd3;
	}

	public BigDecimal getHxcdf1() {
		return this.hxcdf1;
	}

	public void setHxcdf1(BigDecimal hxcdf1) {
		this.hxcdf1 = hxcdf1;
	}

	public BigDecimal getHxcdf2() {
		return this.hxcdf2;
	}

	public void setHxcdf2(BigDecimal hxcdf2) {
		this.hxcdf2 = hxcdf2;
	}

	public BigDecimal getHxcdf3() {
		return this.hxcdf3;
	}

	public void setHxcdf3(BigDecimal hxcdf3) {
		this.hxcdf3 = hxcdf3;
	}

	public BigDecimal getHxcdf4() {
		return this.hxcdf4;
	}

	public void setHxcdf4(BigDecimal hxcdf4) {
		this.hxcdf4 = hxcdf4;
	}

	public BigDecimal getInpy() {
		return this.inpy;
	}

	public void setInpy(BigDecimal inpy) {
		this.inpy = inpy;
	}

	public BigDecimal getKepone() {
		return this.kepone;
	}

	public void setKepone(BigDecimal kepone) {
		this.kepone = kepone;
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

	public String getLAchd() {
		return this.lAchd;
	}

	public void setLAchd(String lAchd) {
		this.lAchd = lAchd;
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

	public String getLAs() {
		return this.lAs;
	}

	public void setLAs(String lAs) {
		this.lAs = lAs;
	}

	public String getLAsInorg() {
		return this.lAsInorg;
	}

	public void setLAsInorg(String lAsInorg) {
		this.lAsInorg = lAsInorg;
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

	public String getLBgpe() {
		return this.lBgpe;
	}

	public void setLBgpe(String lBgpe) {
		this.lBgpe = lBgpe;
	}

	public String getLBkfl() {
		return this.lBkfl;
	}

	public void setLBkfl(String lBkfl) {
		this.lBkfl = lBkfl;
	}

	public String getLCd() {
		return this.lCd;
	}

	public void setLCd(String lCd) {
		this.lCd = lCd;
	}

	public String getLChry() {
		return this.lChry;
	}

	public void setLChry(String lChry) {
		this.lChry = lChry;
	}

	public String getLCnon() {
		return this.lCnon;
	}

	public void setLCnon(String lCnon) {
		this.lCnon = lCnon;
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

	public String getLDbt() {
		return this.lDbt;
	}

	public void setLDbt(String lDbt) {
		this.lDbt = lDbt;
	}

	public String getLDiel() {
		return this.lDiel;
	}

	public void setLDiel(String lDiel) {
		this.lDiel = lDiel;
	}

	public String getLDlpcb105() {
		return this.lDlpcb105;
	}

	public void setLDlpcb105(String lDlpcb105) {
		this.lDlpcb105 = lDlpcb105;
	}

	public String getLDlpcb114() {
		return this.lDlpcb114;
	}

	public void setLDlpcb114(String lDlpcb114) {
		this.lDlpcb114 = lDlpcb114;
	}

	public String getLDlpcb118() {
		return this.lDlpcb118;
	}

	public void setLDlpcb118(String lDlpcb118) {
		this.lDlpcb118 = lDlpcb118;
	}

	public String getLDlpcb123() {
		return this.lDlpcb123;
	}

	public void setLDlpcb123(String lDlpcb123) {
		this.lDlpcb123 = lDlpcb123;
	}

	public String getLDlpcb126() {
		return this.lDlpcb126;
	}

	public void setLDlpcb126(String lDlpcb126) {
		this.lDlpcb126 = lDlpcb126;
	}

	public String getLDlpcb156() {
		return this.lDlpcb156;
	}

	public void setLDlpcb156(String lDlpcb156) {
		this.lDlpcb156 = lDlpcb156;
	}

	public String getLDlpcb157() {
		return this.lDlpcb157;
	}

	public void setLDlpcb157(String lDlpcb157) {
		this.lDlpcb157 = lDlpcb157;
	}

	public String getLDlpcb167() {
		return this.lDlpcb167;
	}

	public void setLDlpcb167(String lDlpcb167) {
		this.lDlpcb167 = lDlpcb167;
	}

	public String getLDlpcb169() {
		return this.lDlpcb169;
	}

	public void setLDlpcb169(String lDlpcb169) {
		this.lDlpcb169 = lDlpcb169;
	}

	public String getLDlpcb189() {
		return this.lDlpcb189;
	}

	public void setLDlpcb189(String lDlpcb189) {
		this.lDlpcb189 = lDlpcb189;
	}

	public String getLDlpcb77() {
		return this.lDlpcb77;
	}

	public void setLDlpcb77(String lDlpcb77) {
		this.lDlpcb77 = lDlpcb77;
	}

	public String getLDlpcb81() {
		return this.lDlpcb81;
	}

	public void setLDlpcb81(String lDlpcb81) {
		this.lDlpcb81 = lDlpcb81;
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

	public String getLGchd() {
		return this.lGchd;
	}

	public void setLGchd(String lGchd) {
		this.lGchd = lGchd;
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

	public String getLHpcdd1() {
		return this.lHpcdd1;
	}

	public void setLHpcdd1(String lHpcdd1) {
		this.lHpcdd1 = lHpcdd1;
	}

	public String getLHpcdf1() {
		return this.lHpcdf1;
	}

	public void setLHpcdf1(String lHpcdf1) {
		this.lHpcdf1 = lHpcdf1;
	}

	public String getLHpcdf2() {
		return this.lHpcdf2;
	}

	public void setLHpcdf2(String lHpcdf2) {
		this.lHpcdf2 = lHpcdf2;
	}

	public String getLHxcdd1() {
		return this.lHxcdd1;
	}

	public void setLHxcdd1(String lHxcdd1) {
		this.lHxcdd1 = lHxcdd1;
	}

	public String getLHxcdd2() {
		return this.lHxcdd2;
	}

	public void setLHxcdd2(String lHxcdd2) {
		this.lHxcdd2 = lHxcdd2;
	}

	public String getLHxcdd3() {
		return this.lHxcdd3;
	}

	public void setLHxcdd3(String lHxcdd3) {
		this.lHxcdd3 = lHxcdd3;
	}

	public String getLHxcdf1() {
		return this.lHxcdf1;
	}

	public void setLHxcdf1(String lHxcdf1) {
		this.lHxcdf1 = lHxcdf1;
	}

	public String getLHxcdf2() {
		return this.lHxcdf2;
	}

	public void setLHxcdf2(String lHxcdf2) {
		this.lHxcdf2 = lHxcdf2;
	}

	public String getLHxcdf3() {
		return this.lHxcdf3;
	}

	public void setLHxcdf3(String lHxcdf3) {
		this.lHxcdf3 = lHxcdf3;
	}

	public String getLHxcdf4() {
		return this.lHxcdf4;
	}

	public void setLHxcdf4(String lHxcdf4) {
		this.lHxcdf4 = lHxcdf4;
	}

	public String getLInpy() {
		return this.lInpy;
	}

	public void setLInpy(String lInpy) {
		this.lInpy = lInpy;
	}

	public String getLKepone() {
		return this.lKepone;
	}

	public void setLKepone(String lKepone) {
		this.lKepone = lKepone;
	}

	public String getLMbt() {
		return this.lMbt;
	}

	public void setLMbt(String lMbt) {
		this.lMbt = lMbt;
	}

	public String getLMirx() {
		return this.lMirx;
	}

	public void setLMirx(String lMirx) {
		this.lMirx = lMirx;
	}

	public String getLNaph() {
		return this.lNaph;
	}

	public void setLNaph(String lNaph) {
		this.lNaph = lNaph;
	}

	public String getLNp() {
		return this.lNp;
	}

	public void setLNp(String lNp) {
		this.lNp = lNp;
	}

	public String getLNpde() {
		return this.lNpde;
	}

	public void setLNpde(String lNpde) {
		this.lNpde = lNpde;
	}

	public String getLNpe() {
		return this.lNpe;
	}

	public void setLNpe(String lNpe) {
		this.lNpe = lNpe;
	}

	public String getLNpme() {
		return this.lNpme;
	}

	public void setLNpme(String lNpme) {
		this.lNpme = lNpme;
	}

	public String getLOcdd() {
		return this.lOcdd;
	}

	public void setLOcdd(String lOcdd) {
		this.lOcdd = lOcdd;
	}

	public String getLOcdf() {
		return this.lOcdf;
	}

	public void setLOcdf(String lOcdf) {
		this.lOcdf = lOcdf;
	}

	public String getLOchd() {
		return this.lOchd;
	}

	public void setLOchd(String lOchd) {
		this.lOchd = lOchd;
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

	public String getLPbb() {
		return this.lPbb;
	}

	public void setLPbb(String lPbb) {
		this.lPbb = lPbb;
	}

	public String getLPbde100() {
		return this.lPbde100;
	}

	public void setLPbde100(String lPbde100) {
		this.lPbde100 = lPbde100;
	}

	public String getLPbde153() {
		return this.lPbde153;
	}

	public void setLPbde153(String lPbde153) {
		this.lPbde153 = lPbde153;
	}

	public String getLPbde154() {
		return this.lPbde154;
	}

	public void setLPbde154(String lPbde154) {
		this.lPbde154 = lPbde154;
	}

	public String getLPbde17() {
		return this.lPbde17;
	}

	public void setLPbde17(String lPbde17) {
		this.lPbde17 = lPbde17;
	}

	public String getLPbde183() {
		return this.lPbde183;
	}

	public void setLPbde183(String lPbde183) {
		this.lPbde183 = lPbde183;
	}

	public String getLPbde197() {
		return this.lPbde197;
	}

	public void setLPbde197(String lPbde197) {
		this.lPbde197 = lPbde197;
	}

	public String getLPbde209() {
		return this.lPbde209;
	}

	public void setLPbde209(String lPbde209) {
		this.lPbde209 = lPbde209;
	}

	public String getLPbde28() {
		return this.lPbde28;
	}

	public void setLPbde28(String lPbde28) {
		this.lPbde28 = lPbde28;
	}

	public String getLPbde47() {
		return this.lPbde47;
	}

	public void setLPbde47(String lPbde47) {
		this.lPbde47 = lPbde47;
	}

	public String getLPbde99() {
		return this.lPbde99;
	}

	public void setLPbde99(String lPbde99) {
		this.lPbde99 = lPbde99;
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

	public String getLPecb() {
		return this.lPecb;
	}

	public void setLPecb(String lPecb) {
		this.lPecb = lPecb;
	}

	public String getLPecdd1() {
		return this.lPecdd1;
	}

	public void setLPecdd1(String lPecdd1) {
		this.lPecdd1 = lPecdd1;
	}

	public String getLPecdf1() {
		return this.lPecdf1;
	}

	public void setLPecdf1(String lPecdf1) {
		this.lPecdf1 = lPecdf1;
	}

	public String getLPecdf2() {
		return this.lPecdf2;
	}

	public void setLPecdf2(String lPecdf2) {
		this.lPecdf2 = lPecdf2;
	}

	public String getLPf() {
		return this.lPf;
	}

	public void setLPf(String lPf) {
		this.lPf = lPf;
	}

	public String getLPfoa() {
		return this.lPfoa;
	}

	public void setLPfoa(String lPfoa) {
		this.lPfoa = lPfoa;
	}

	public String getLPfos() {
		return this.lPfos;
	}

	public void setLPfos(String lPfos) {
		this.lPfos = lPfos;
	}

	public String getLPfosf() {
		return this.lPfosf;
	}

	public void setLPfosf(String lPfosf) {
		this.lPfosf = lPfosf;
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

	public String getLTbt() {
		return this.lTbt;
	}

	public void setLTbt(String lTbt) {
		this.lTbt = lTbt;
	}

	public String getLTcdd1() {
		return this.lTcdd1;
	}

	public void setLTcdd1(String lTcdd1) {
		this.lTcdd1 = lTcdd1;
	}

	public String getLTcdf1() {
		return this.lTcdf1;
	}

	public void setLTcdf1(String lTcdf1) {
		this.lTcdf1 = lTcdf1;
	}

	public String getLTnon() {
		return this.lTnon;
	}

	public void setLTnon(String lTnon) {
		this.lTnon = lTnon;
	}

	public String getLToxP26() {
		return this.lToxP26;
	}

	public void setLToxP26(String lToxP26) {
		this.lToxP26 = lToxP26;
	}

	public String getLToxP50() {
		return this.lToxP50;
	}

	public void setLToxP50(String lToxP50) {
		this.lToxP50 = lToxP50;
	}

	public String getLToxP62() {
		return this.lToxP62;
	}

	public void setLToxP62(String lToxP62) {
		this.lToxP62 = lToxP62;
	}

	public String getLZn() {
		return this.lZn;
	}

	public void setLZn(String lZn) {
		this.lZn = lZn;
	}

	public BigDecimal getMbt() {
		return this.mbt;
	}

	public void setMbt(BigDecimal mbt) {
		this.mbt = mbt;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getMirx() {
		return this.mirx;
	}

	public void setMirx(BigDecimal mirx) {
		this.mirx = mirx;
	}

	public BigDecimal getNaph() {
		return this.naph;
	}

	public void setNaph(BigDecimal naph) {
		this.naph = naph;
	}

	public BigDecimal getNp() {
		return this.np;
	}

	public void setNp(BigDecimal np) {
		this.np = np;
	}

	public BigDecimal getNpde() {
		return this.npde;
	}

	public void setNpde(BigDecimal npde) {
		this.npde = npde;
	}

	public BigDecimal getNpe() {
		return this.npe;
	}

	public void setNpe(BigDecimal npe) {
		this.npe = npe;
	}

	public BigDecimal getNpme() {
		return this.npme;
	}

	public void setNpme(BigDecimal npme) {
		this.npme = npme;
	}

	public BigDecimal getOcdd() {
		return this.ocdd;
	}

	public void setOcdd(BigDecimal ocdd) {
		this.ocdd = ocdd;
	}

	public BigDecimal getOcdf() {
		return this.ocdf;
	}

	public void setOcdf(BigDecimal ocdf) {
		this.ocdf = ocdf;
	}

	public BigDecimal getOchd() {
		return this.ochd;
	}

	public void setOchd(BigDecimal ochd) {
		this.ochd = ochd;
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

	public BigDecimal getOsn() {
		return this.osn;
	}

	public void setOsn(BigDecimal osn) {
		this.osn = osn;
	}

	public BigDecimal getPah() {
		return this.pah;
	}

	public void setPah(BigDecimal pah) {
		this.pah = pah;
	}

	public BigDecimal getPbb() {
		return this.pbb;
	}

	public void setPbb(BigDecimal pbb) {
		this.pbb = pbb;
	}

	public BigDecimal getPbde() {
		return this.pbde;
	}

	public void setPbde(BigDecimal pbde) {
		this.pbde = pbde;
	}

	public BigDecimal getPbde100() {
		return this.pbde100;
	}

	public void setPbde100(BigDecimal pbde100) {
		this.pbde100 = pbde100;
	}

	public BigDecimal getPbde153() {
		return this.pbde153;
	}

	public void setPbde153(BigDecimal pbde153) {
		this.pbde153 = pbde153;
	}

	public BigDecimal getPbde154() {
		return this.pbde154;
	}

	public void setPbde154(BigDecimal pbde154) {
		this.pbde154 = pbde154;
	}

	public BigDecimal getPbde17() {
		return this.pbde17;
	}

	public void setPbde17(BigDecimal pbde17) {
		this.pbde17 = pbde17;
	}

	public BigDecimal getPbde183() {
		return this.pbde183;
	}

	public void setPbde183(BigDecimal pbde183) {
		this.pbde183 = pbde183;
	}

	public BigDecimal getPbde197() {
		return this.pbde197;
	}

	public void setPbde197(BigDecimal pbde197) {
		this.pbde197 = pbde197;
	}

	public BigDecimal getPbde209() {
		return this.pbde209;
	}

	public void setPbde209(BigDecimal pbde209) {
		this.pbde209 = pbde209;
	}

	public BigDecimal getPbde28() {
		return this.pbde28;
	}

	public void setPbde28(BigDecimal pbde28) {
		this.pbde28 = pbde28;
	}

	public BigDecimal getPbde47() {
		return this.pbde47;
	}

	public void setPbde47(BigDecimal pbde47) {
		this.pbde47 = pbde47;
	}

	public BigDecimal getPbde99() {
		return this.pbde99;
	}

	public void setPbde99(BigDecimal pbde99) {
		this.pbde99 = pbde99;
	}

	public BigDecimal getPcb() {
		return this.pcb;
	}

	public void setPcb(BigDecimal pcb) {
		this.pcb = pcb;
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

	public BigDecimal getPecb() {
		return this.pecb;
	}

	public void setPecb(BigDecimal pecb) {
		this.pecb = pecb;
	}

	public BigDecimal getPecdd1() {
		return this.pecdd1;
	}

	public void setPecdd1(BigDecimal pecdd1) {
		this.pecdd1 = pecdd1;
	}

	public BigDecimal getPecdf1() {
		return this.pecdf1;
	}

	public void setPecdf1(BigDecimal pecdf1) {
		this.pecdf1 = pecdf1;
	}

	public BigDecimal getPecdf2() {
		return this.pecdf2;
	}

	public void setPecdf2(BigDecimal pecdf2) {
		this.pecdf2 = pecdf2;
	}

	public BigDecimal getPf() {
		return this.pf;
	}

	public void setPf(BigDecimal pf) {
		this.pf = pf;
	}

	public BigDecimal getPfoa() {
		return this.pfoa;
	}

	public void setPfoa(BigDecimal pfoa) {
		this.pfoa = pfoa;
	}

	public BigDecimal getPfos() {
		return this.pfos;
	}

	public void setPfos(BigDecimal pfos) {
		this.pfos = pfos;
	}

	public BigDecimal getPfosf() {
		return this.pfosf;
	}

	public void setPfosf(BigDecimal pfosf) {
		this.pfosf = pfosf;
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

	public BigDecimal getSamNo() {
		return this.samNo;
	}

	public void setSamNo(BigDecimal samNo) {
		this.samNo = samNo;
	}

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public BigDecimal getStime() {
		return this.stime;
	}

	public void setStime(BigDecimal stime) {
		this.stime = stime;
	}

	public String getSubzone() {
		return this.subzone;
	}

	public void setSubzone(String subzone) {
		this.subzone = subzone;
	}

	public BigDecimal getTbt() {
		return this.tbt;
	}

	public void setTbt(BigDecimal tbt) {
		this.tbt = tbt;
	}

	public BigDecimal getTcdd1() {
		return this.tcdd1;
	}

	public void setTcdd1(BigDecimal tcdd1) {
		this.tcdd1 = tcdd1;
	}

	public BigDecimal getTcdf1() {
		return this.tcdf1;
	}

	public void setTcdf1(BigDecimal tcdf1) {
		this.tcdf1 = tcdf1;
	}

	public String getTeqType() {
		return this.teqType;
	}

	public void setTeqType(String teqType) {
		this.teqType = teqType;
	}

	public BigDecimal getTnon() {
		return this.tnon;
	}

	public void setTnon(BigDecimal tnon) {
		this.tnon = tnon;
	}

	public BigDecimal getTox() {
		return this.tox;
	}

	public void setTox(BigDecimal tox) {
		this.tox = tox;
	}

	public BigDecimal getToxP26() {
		return this.toxP26;
	}

	public void setToxP26(BigDecimal toxP26) {
		this.toxP26 = toxP26;
	}

	public BigDecimal getToxP50() {
		return this.toxP50;
	}

	public void setToxP50(BigDecimal toxP50) {
		this.toxP50 = toxP50;
	}

	public BigDecimal getToxP62() {
		return this.toxP62;
	}

	public void setToxP62(BigDecimal toxP62) {
		this.toxP62 = toxP62;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getViewNo() {
		return this.viewNo;
	}

	public void setViewNo(BigDecimal viewNo) {
		this.viewNo = viewNo;
	}

	public String getWcz() {
		return this.wcz;
	}

	public void setWcz(String wcz) {
		this.wcz = wcz;
	}

	public BigDecimal getZn() {
		return this.zn;
	}

	public void setZn(BigDecimal zn) {
		this.zn = zn;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}