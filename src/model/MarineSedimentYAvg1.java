package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the marine_sediment_y_avg1 database table.
 * 
 */
//@Entity
@Table(name="marine_sediment_y_avg1")
@NamedQuery(name="MarineSedimentYAvg1.findAll", query="SELECT m FROM MarineSedimentYAvg1 m")
public class MarineSedimentYAvg1 implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal abhc;

	private BigDecimal acen;

	private BigDecimal acph;

	private BigDecimal ag;

	private BigDecimal al;

	private BigDecimal aldr;

	private BigDecimal anth;

	private BigDecimal ars;

	private BigDecimal b;

	private BigDecimal ba;

	private BigDecimal bant;

	private BigDecimal bapy;

	private BigDecimal bbfl;

	private BigDecimal bbhc;

	private BigDecimal be;

	private BigDecimal bgpe;

	private BigDecimal bkfl;

	private BigDecimal cd;

	private BigDecimal chry;

	private BigDecimal cn;

	private BigDecimal co;

	private BigDecimal cod;

	private BigDecimal cr;

	private BigDecimal cu;

	private BigDecimal daan;

	private BigDecimal dbhc;

	private BigDecimal diel;

	private BigDecimal end1;

	private BigDecimal end2;

	private BigDecimal endr;

	private BigDecimal fe;

	private BigDecimal fluo;

	private BigDecimal flut;

	private BigDecimal gbhc;

	private BigDecimal hcb;

	private BigDecimal hepo;

	private BigDecimal hept;

	private BigDecimal hg;

	private BigDecimal inpy;

	private BigDecimal ins;

	private BigDecimal mn;

	private BigDecimal mo;

	@Column(name="msm_dwr")
	private BigDecimal msmDwr;

	@Column(name="msn_dwr")
	private BigDecimal msnDwr;

	@Column(name="mso_dwr")
	private BigDecimal msoDwr;

	private BigDecimal naph;

	private BigDecimal nh;

	private BigDecimal ni;

	private BigDecimal oddd;

	private BigDecimal odde;

	private BigDecimal oddt;

	private BigDecimal pah;

	private BigDecimal pb;

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

	private BigDecimal ph;

	private BigDecimal phen;

	private BigDecimal pyre;

	private BigDecimal sb;

	private BigDecimal sg;

	private String station;

	private String subzone;

	private BigDecimal sum10hmpah;

	private BigDecimal sum16pah;

	private BigDecimal sum18pcb;

	private BigDecimal sum6lmpah;

	private BigDecimal tc;

	private BigDecimal tic;

	private BigDecimal tkn;

	private BigDecimal tl;

	private BigDecimal toc;

	private Long total;

	private BigDecimal tp;

	private BigDecimal ts;

	private BigDecimal tvs;

	private String type;

	private BigDecimal v;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	private double yr;

	private BigDecimal zn;

	private String zone;

	public MarineSedimentYAvg1() {
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

	public BigDecimal getAg() {
		return this.ag;
	}

	public void setAg(BigDecimal ag) {
		this.ag = ag;
	}

	public BigDecimal getAl() {
		return this.al;
	}

	public void setAl(BigDecimal al) {
		this.al = al;
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

	public BigDecimal getArs() {
		return this.ars;
	}

	public void setArs(BigDecimal ars) {
		this.ars = ars;
	}

	public BigDecimal getB() {
		return this.b;
	}

	public void setB(BigDecimal b) {
		this.b = b;
	}

	public BigDecimal getBa() {
		return this.ba;
	}

	public void setBa(BigDecimal ba) {
		this.ba = ba;
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

	public BigDecimal getBe() {
		return this.be;
	}

	public void setBe(BigDecimal be) {
		this.be = be;
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

	public BigDecimal getChry() {
		return this.chry;
	}

	public void setChry(BigDecimal chry) {
		this.chry = chry;
	}

	public BigDecimal getCn() {
		return this.cn;
	}

	public void setCn(BigDecimal cn) {
		this.cn = cn;
	}

	public BigDecimal getCo() {
		return this.co;
	}

	public void setCo(BigDecimal co) {
		this.co = co;
	}

	public BigDecimal getCod() {
		return this.cod;
	}

	public void setCod(BigDecimal cod) {
		this.cod = cod;
	}

	public BigDecimal getCr() {
		return this.cr;
	}

	public void setCr(BigDecimal cr) {
		this.cr = cr;
	}

	public BigDecimal getCu() {
		return this.cu;
	}

	public void setCu(BigDecimal cu) {
		this.cu = cu;
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

	public BigDecimal getDiel() {
		return this.diel;
	}

	public void setDiel(BigDecimal diel) {
		this.diel = diel;
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

	public BigDecimal getFe() {
		return this.fe;
	}

	public void setFe(BigDecimal fe) {
		this.fe = fe;
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

	public BigDecimal getHg() {
		return this.hg;
	}

	public void setHg(BigDecimal hg) {
		this.hg = hg;
	}

	public BigDecimal getInpy() {
		return this.inpy;
	}

	public void setInpy(BigDecimal inpy) {
		this.inpy = inpy;
	}

	public BigDecimal getIns() {
		return this.ins;
	}

	public void setIns(BigDecimal ins) {
		this.ins = ins;
	}

	public BigDecimal getMn() {
		return this.mn;
	}

	public void setMn(BigDecimal mn) {
		this.mn = mn;
	}

	public BigDecimal getMo() {
		return this.mo;
	}

	public void setMo(BigDecimal mo) {
		this.mo = mo;
	}

	public BigDecimal getMsmDwr() {
		return this.msmDwr;
	}

	public void setMsmDwr(BigDecimal msmDwr) {
		this.msmDwr = msmDwr;
	}

	public BigDecimal getMsnDwr() {
		return this.msnDwr;
	}

	public void setMsnDwr(BigDecimal msnDwr) {
		this.msnDwr = msnDwr;
	}

	public BigDecimal getMsoDwr() {
		return this.msoDwr;
	}

	public void setMsoDwr(BigDecimal msoDwr) {
		this.msoDwr = msoDwr;
	}

	public BigDecimal getNaph() {
		return this.naph;
	}

	public void setNaph(BigDecimal naph) {
		this.naph = naph;
	}

	public BigDecimal getNh() {
		return this.nh;
	}

	public void setNh(BigDecimal nh) {
		this.nh = nh;
	}

	public BigDecimal getNi() {
		return this.ni;
	}

	public void setNi(BigDecimal ni) {
		this.ni = ni;
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

	public BigDecimal getPb() {
		return this.pb;
	}

	public void setPb(BigDecimal pb) {
		this.pb = pb;
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

	public BigDecimal getPh() {
		return this.ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
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

	public BigDecimal getSb() {
		return this.sb;
	}

	public void setSb(BigDecimal sb) {
		this.sb = sb;
	}

	public BigDecimal getSg() {
		return this.sg;
	}

	public void setSg(BigDecimal sg) {
		this.sg = sg;
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

	public BigDecimal getSum10hmpah() {
		return this.sum10hmpah;
	}

	public void setSum10hmpah(BigDecimal sum10hmpah) {
		this.sum10hmpah = sum10hmpah;
	}

	public BigDecimal getSum16pah() {
		return this.sum16pah;
	}

	public void setSum16pah(BigDecimal sum16pah) {
		this.sum16pah = sum16pah;
	}

	public BigDecimal getSum18pcb() {
		return this.sum18pcb;
	}

	public void setSum18pcb(BigDecimal sum18pcb) {
		this.sum18pcb = sum18pcb;
	}

	public BigDecimal getSum6lmpah() {
		return this.sum6lmpah;
	}

	public void setSum6lmpah(BigDecimal sum6lmpah) {
		this.sum6lmpah = sum6lmpah;
	}

	public BigDecimal getTc() {
		return this.tc;
	}

	public void setTc(BigDecimal tc) {
		this.tc = tc;
	}

	public BigDecimal getTic() {
		return this.tic;
	}

	public void setTic(BigDecimal tic) {
		this.tic = tic;
	}

	public BigDecimal getTkn() {
		return this.tkn;
	}

	public void setTkn(BigDecimal tkn) {
		this.tkn = tkn;
	}

	public BigDecimal getTl() {
		return this.tl;
	}

	public void setTl(BigDecimal tl) {
		this.tl = tl;
	}

	public BigDecimal getToc() {
		return this.toc;
	}

	public void setToc(BigDecimal toc) {
		this.toc = toc;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public BigDecimal getTp() {
		return this.tp;
	}

	public void setTp(BigDecimal tp) {
		this.tp = tp;
	}

	public BigDecimal getTs() {
		return this.ts;
	}

	public void setTs(BigDecimal ts) {
		this.ts = ts;
	}

	public BigDecimal getTvs() {
		return this.tvs;
	}

	public void setTvs(BigDecimal tvs) {
		this.tvs = tvs;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getV() {
		return this.v;
	}

	public void setV(BigDecimal v) {
		this.v = v;
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