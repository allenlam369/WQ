package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the toxic_water_avg2 database table.
 * 
 */
//@Entity
@Table(name="toxic_water_avg2")
@NamedQuery(name="ToxicWaterAvg2.findAll", query="SELECT t FROM ToxicWaterAvg2 t")
public class ToxicWaterAvg2 implements Serializable {
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

	private BigDecimal mbt;

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

	private String station;

	private String subzone;

	private BigDecimal tbt;

	private BigDecimal tcdd1;

	private BigDecimal tcdf1;

	private BigDecimal tnon;

	private Long total;

	private BigDecimal tox;

	@Column(name="tox_p26")
	private BigDecimal toxP26;

	@Column(name="tox_p50")
	private BigDecimal toxP50;

	@Column(name="tox_p62")
	private BigDecimal toxP62;

	private String type;

	private String wcz;

	private double yr;

	private BigDecimal zn;

	private String zone;

	public ToxicWaterAvg2() {
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

	public BigDecimal getMbt() {
		return this.mbt;
	}

	public void setMbt(BigDecimal mbt) {
		this.mbt = mbt;
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

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
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

	public BigDecimal getTnon() {
		return this.tnon;
	}

	public void setTnon(BigDecimal tnon) {
		this.tnon = tnon;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
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

	public String getWcz() {
		return this.wcz;
	}

	public void setWcz(String wcz) {
		this.wcz = wcz;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
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