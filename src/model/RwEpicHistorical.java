package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the rw_epic_historical database table.
 * 
 */
//@Entity
@Table(name="rw_epic_historical")
@NamedQuery(name="RwEpicHistorical.findAll", query="SELECT r FROM RwEpicHistorical r")
public class RwEpicHistorical implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal ag;

	private BigDecimal al;

	private BigDecimal ars;

	private BigDecimal b;

	private BigDecimal ba;

	private BigDecimal be;

	private BigDecimal bod5;

	@Column(name="bod5_pt")
	private BigDecimal bod5Pt;

	private BigDecimal cd;

	private BigDecimal chl;

	private BigDecimal cl;

	private BigDecimal cod;

	@Column(name="cond_f")
	private BigDecimal condF;

	private BigDecimal cr;

	private BigDecimal cu;

	private BigDecimal det;

	@Column(name="\"DO\"")
	private BigDecimal do_;

	@Column(name="do_sat")
	private BigDecimal doSat;

	@Column(name="dos_pt")
	private BigDecimal dosPt;

	@Column(name="e_coli")
	private BigDecimal eColi;

	@Column(name="f_coli")
	private BigDecimal fColi;

	private BigDecimal fe;

	private BigDecimal fl;

	@Column(name="flow_sum")
	private BigDecimal flowSum;

	private BigDecimal h2s;

	private BigDecimal hg;

	@Column(name="l_ag")
	private String lAg;

	@Column(name="l_al")
	private String lAl;

	@Column(name="l_ars")
	private String lArs;

	@Column(name="l_b")
	private String lB;

	@Column(name="l_ba")
	private String lBa;

	@Column(name="l_be")
	private String lBe;

	@Column(name="l_bod5")
	private String lBod5;

	@Column(name="l_cd")
	private String lCd;

	@Column(name="l_chl")
	private String lChl;

	@Column(name="l_cl")
	private String lCl;

	@Column(name="l_cod")
	private String lCod;

	@Column(name="l_cond_f")
	private String lCondF;

	@Column(name="l_cr")
	private String lCr;

	@Column(name="l_cu")
	private String lCu;

	@Column(name="l_det")
	private String lDet;

	@Column(name="l_do")
	private String lDo;

	@Column(name="l_do_sat")
	private String lDoSat;

	@Column(name="l_e_coli")
	private String lEColi;

	@Column(name="l_f_coli")
	private String lFColi;

	@Column(name="l_fe")
	private String lFe;

	@Column(name="l_fl")
	private String lFl;

	@Column(name="l_h2s")
	private String lH2s;

	@Column(name="l_hg")
	private String lHg;

	@Column(name="l_mn")
	private String lMn;

	@Column(name="l_mo")
	private String lMo;

	@Column(name="l_nh4")
	private String lNh4;

	@Column(name="l_ni")
	private String lNi;

	@Column(name="l_no2")
	private String lNo2;

	@Column(name="l_no3")
	private String lNo3;

	@Column(name="l_oil")
	private String lOil;

	@Column(name="l_pb")
	private String lPb;

	@Column(name="l_ph_f")
	private String lPhF;

	@Column(name="l_pheo")
	private String lPheo;

	@Column(name="l_po4")
	private String lPo4;

	@Column(name="l_sal_f")
	private String lSalF;

	@Column(name="l_sb")
	private String lSb;

	@Column(name="l_sio2")
	private String lSio2;

	@Column(name="l_ss")
	private String lSs;

	@Column(name="l_ssp")
	private String lSsp;

	@Column(name="l_tcyn")
	private String lTcyn;

	@Column(name="l_tknsp")
	private String lTknsp;

	@Column(name="l_tl")
	private String lTl;

	@Column(name="l_toc")
	private String lToc;

	@Column(name="l_tpsp")
	private String lTpsp;

	@Column(name="l_ts")
	private String lTs;

	@Column(name="l_turb_f")
	private String lTurbF;

	@Column(name="l_tvs")
	private String lTvs;

	@Column(name="l_v")
	private String lV;

	@Column(name="l_zn")
	private String lZn;

	private Timestamp mdate;

	private BigDecimal mn;

	private BigDecimal mo;

	private BigDecimal nh4;

	@Column(name="nh4_pt")
	private BigDecimal nh4Pt;

	private BigDecimal ni;

	private BigDecimal no2;

	private BigDecimal no3;

	private BigDecimal oil;

	private BigDecimal pb;

	@Column(name="ph_f")
	private BigDecimal phF;

	private BigDecimal pheo;

	private BigDecimal po4;

	private String river;

	@Column(name="sal_f")
	private BigDecimal salF;

	@Column(name="sam_no")
	private Integer samNo;

	private BigDecimal sb;

	private BigDecimal sio2;

	private BigDecimal ss;

	private BigDecimal ssp;

	private String statname;

	private BigDecimal tcyn;

	private BigDecimal temper;

	private BigDecimal tknsp;

	private BigDecimal tl;

	private BigDecimal toc;

	private BigDecimal tpsp;

	private BigDecimal ts;

	@Column(name="turb_f")
	private BigDecimal turbF;

	private BigDecimal tvs;

	private BigDecimal v;

	private String wcz;

	@Column(name="wqi_grade")
	private String wqiGrade;

	@Column(name="wqi_pt")
	private BigDecimal wqiPt;

	private BigDecimal zn;

	public RwEpicHistorical() {
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

	public BigDecimal getBe() {
		return this.be;
	}

	public void setBe(BigDecimal be) {
		this.be = be;
	}

	public BigDecimal getBod5() {
		return this.bod5;
	}

	public void setBod5(BigDecimal bod5) {
		this.bod5 = bod5;
	}

	public BigDecimal getBod5Pt() {
		return this.bod5Pt;
	}

	public void setBod5Pt(BigDecimal bod5Pt) {
		this.bod5Pt = bod5Pt;
	}

	public BigDecimal getCd() {
		return this.cd;
	}

	public void setCd(BigDecimal cd) {
		this.cd = cd;
	}

	public BigDecimal getChl() {
		return this.chl;
	}

	public void setChl(BigDecimal chl) {
		this.chl = chl;
	}

	public BigDecimal getCl() {
		return this.cl;
	}

	public void setCl(BigDecimal cl) {
		this.cl = cl;
	}

	public BigDecimal getCod() {
		return this.cod;
	}

	public void setCod(BigDecimal cod) {
		this.cod = cod;
	}

	public BigDecimal getCondF() {
		return this.condF;
	}

	public void setCondF(BigDecimal condF) {
		this.condF = condF;
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

	public BigDecimal getDet() {
		return this.det;
	}

	public void setDet(BigDecimal det) {
		this.det = det;
	}

	public BigDecimal getDo_() {
		return this.do_;
	}

	public void setDo_(BigDecimal do_) {
		this.do_ = do_;
	}

	public BigDecimal getDoSat() {
		return this.doSat;
	}

	public void setDoSat(BigDecimal doSat) {
		this.doSat = doSat;
	}

	public BigDecimal getDosPt() {
		return this.dosPt;
	}

	public void setDosPt(BigDecimal dosPt) {
		this.dosPt = dosPt;
	}

	public BigDecimal getEColi() {
		return this.eColi;
	}

	public void setEColi(BigDecimal eColi) {
		this.eColi = eColi;
	}

	public BigDecimal getFColi() {
		return this.fColi;
	}

	public void setFColi(BigDecimal fColi) {
		this.fColi = fColi;
	}

	public BigDecimal getFe() {
		return this.fe;
	}

	public void setFe(BigDecimal fe) {
		this.fe = fe;
	}

	public BigDecimal getFl() {
		return this.fl;
	}

	public void setFl(BigDecimal fl) {
		this.fl = fl;
	}

	public BigDecimal getFlowSum() {
		return this.flowSum;
	}

	public void setFlowSum(BigDecimal flowSum) {
		this.flowSum = flowSum;
	}

	public BigDecimal getH2s() {
		return this.h2s;
	}

	public void setH2s(BigDecimal h2s) {
		this.h2s = h2s;
	}

	public BigDecimal getHg() {
		return this.hg;
	}

	public void setHg(BigDecimal hg) {
		this.hg = hg;
	}

	public String getLAg() {
		return this.lAg;
	}

	public void setLAg(String lAg) {
		this.lAg = lAg;
	}

	public String getLAl() {
		return this.lAl;
	}

	public void setLAl(String lAl) {
		this.lAl = lAl;
	}

	public String getLArs() {
		return this.lArs;
	}

	public void setLArs(String lArs) {
		this.lArs = lArs;
	}

	public String getLB() {
		return this.lB;
	}

	public void setLB(String lB) {
		this.lB = lB;
	}

	public String getLBa() {
		return this.lBa;
	}

	public void setLBa(String lBa) {
		this.lBa = lBa;
	}

	public String getLBe() {
		return this.lBe;
	}

	public void setLBe(String lBe) {
		this.lBe = lBe;
	}

	public String getLBod5() {
		return this.lBod5;
	}

	public void setLBod5(String lBod5) {
		this.lBod5 = lBod5;
	}

	public String getLCd() {
		return this.lCd;
	}

	public void setLCd(String lCd) {
		this.lCd = lCd;
	}

	public String getLChl() {
		return this.lChl;
	}

	public void setLChl(String lChl) {
		this.lChl = lChl;
	}

	public String getLCl() {
		return this.lCl;
	}

	public void setLCl(String lCl) {
		this.lCl = lCl;
	}

	public String getLCod() {
		return this.lCod;
	}

	public void setLCod(String lCod) {
		this.lCod = lCod;
	}

	public String getLCondF() {
		return this.lCondF;
	}

	public void setLCondF(String lCondF) {
		this.lCondF = lCondF;
	}

	public String getLCr() {
		return this.lCr;
	}

	public void setLCr(String lCr) {
		this.lCr = lCr;
	}

	public String getLCu() {
		return this.lCu;
	}

	public void setLCu(String lCu) {
		this.lCu = lCu;
	}

	public String getLDet() {
		return this.lDet;
	}

	public void setLDet(String lDet) {
		this.lDet = lDet;
	}

	public String getLDo() {
		return this.lDo;
	}

	public void setLDo(String lDo) {
		this.lDo = lDo;
	}

	public String getLDoSat() {
		return this.lDoSat;
	}

	public void setLDoSat(String lDoSat) {
		this.lDoSat = lDoSat;
	}

	public String getLEColi() {
		return this.lEColi;
	}

	public void setLEColi(String lEColi) {
		this.lEColi = lEColi;
	}

	public String getLFColi() {
		return this.lFColi;
	}

	public void setLFColi(String lFColi) {
		this.lFColi = lFColi;
	}

	public String getLFe() {
		return this.lFe;
	}

	public void setLFe(String lFe) {
		this.lFe = lFe;
	}

	public String getLFl() {
		return this.lFl;
	}

	public void setLFl(String lFl) {
		this.lFl = lFl;
	}

	public String getLH2s() {
		return this.lH2s;
	}

	public void setLH2s(String lH2s) {
		this.lH2s = lH2s;
	}

	public String getLHg() {
		return this.lHg;
	}

	public void setLHg(String lHg) {
		this.lHg = lHg;
	}

	public String getLMn() {
		return this.lMn;
	}

	public void setLMn(String lMn) {
		this.lMn = lMn;
	}

	public String getLMo() {
		return this.lMo;
	}

	public void setLMo(String lMo) {
		this.lMo = lMo;
	}

	public String getLNh4() {
		return this.lNh4;
	}

	public void setLNh4(String lNh4) {
		this.lNh4 = lNh4;
	}

	public String getLNi() {
		return this.lNi;
	}

	public void setLNi(String lNi) {
		this.lNi = lNi;
	}

	public String getLNo2() {
		return this.lNo2;
	}

	public void setLNo2(String lNo2) {
		this.lNo2 = lNo2;
	}

	public String getLNo3() {
		return this.lNo3;
	}

	public void setLNo3(String lNo3) {
		this.lNo3 = lNo3;
	}

	public String getLOil() {
		return this.lOil;
	}

	public void setLOil(String lOil) {
		this.lOil = lOil;
	}

	public String getLPb() {
		return this.lPb;
	}

	public void setLPb(String lPb) {
		this.lPb = lPb;
	}

	public String getLPhF() {
		return this.lPhF;
	}

	public void setLPhF(String lPhF) {
		this.lPhF = lPhF;
	}

	public String getLPheo() {
		return this.lPheo;
	}

	public void setLPheo(String lPheo) {
		this.lPheo = lPheo;
	}

	public String getLPo4() {
		return this.lPo4;
	}

	public void setLPo4(String lPo4) {
		this.lPo4 = lPo4;
	}

	public String getLSalF() {
		return this.lSalF;
	}

	public void setLSalF(String lSalF) {
		this.lSalF = lSalF;
	}

	public String getLSb() {
		return this.lSb;
	}

	public void setLSb(String lSb) {
		this.lSb = lSb;
	}

	public String getLSio2() {
		return this.lSio2;
	}

	public void setLSio2(String lSio2) {
		this.lSio2 = lSio2;
	}

	public String getLSs() {
		return this.lSs;
	}

	public void setLSs(String lSs) {
		this.lSs = lSs;
	}

	public String getLSsp() {
		return this.lSsp;
	}

	public void setLSsp(String lSsp) {
		this.lSsp = lSsp;
	}

	public String getLTcyn() {
		return this.lTcyn;
	}

	public void setLTcyn(String lTcyn) {
		this.lTcyn = lTcyn;
	}

	public String getLTknsp() {
		return this.lTknsp;
	}

	public void setLTknsp(String lTknsp) {
		this.lTknsp = lTknsp;
	}

	public String getLTl() {
		return this.lTl;
	}

	public void setLTl(String lTl) {
		this.lTl = lTl;
	}

	public String getLToc() {
		return this.lToc;
	}

	public void setLToc(String lToc) {
		this.lToc = lToc;
	}

	public String getLTpsp() {
		return this.lTpsp;
	}

	public void setLTpsp(String lTpsp) {
		this.lTpsp = lTpsp;
	}

	public String getLTs() {
		return this.lTs;
	}

	public void setLTs(String lTs) {
		this.lTs = lTs;
	}

	public String getLTurbF() {
		return this.lTurbF;
	}

	public void setLTurbF(String lTurbF) {
		this.lTurbF = lTurbF;
	}

	public String getLTvs() {
		return this.lTvs;
	}

	public void setLTvs(String lTvs) {
		this.lTvs = lTvs;
	}

	public String getLV() {
		return this.lV;
	}

	public void setLV(String lV) {
		this.lV = lV;
	}

	public String getLZn() {
		return this.lZn;
	}

	public void setLZn(String lZn) {
		this.lZn = lZn;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
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

	public BigDecimal getNh4() {
		return this.nh4;
	}

	public void setNh4(BigDecimal nh4) {
		this.nh4 = nh4;
	}

	public BigDecimal getNh4Pt() {
		return this.nh4Pt;
	}

	public void setNh4Pt(BigDecimal nh4Pt) {
		this.nh4Pt = nh4Pt;
	}

	public BigDecimal getNi() {
		return this.ni;
	}

	public void setNi(BigDecimal ni) {
		this.ni = ni;
	}

	public BigDecimal getNo2() {
		return this.no2;
	}

	public void setNo2(BigDecimal no2) {
		this.no2 = no2;
	}

	public BigDecimal getNo3() {
		return this.no3;
	}

	public void setNo3(BigDecimal no3) {
		this.no3 = no3;
	}

	public BigDecimal getOil() {
		return this.oil;
	}

	public void setOil(BigDecimal oil) {
		this.oil = oil;
	}

	public BigDecimal getPb() {
		return this.pb;
	}

	public void setPb(BigDecimal pb) {
		this.pb = pb;
	}

	public BigDecimal getPhF() {
		return this.phF;
	}

	public void setPhF(BigDecimal phF) {
		this.phF = phF;
	}

	public BigDecimal getPheo() {
		return this.pheo;
	}

	public void setPheo(BigDecimal pheo) {
		this.pheo = pheo;
	}

	public BigDecimal getPo4() {
		return this.po4;
	}

	public void setPo4(BigDecimal po4) {
		this.po4 = po4;
	}

	public String getRiver() {
		return this.river;
	}

	public void setRiver(String river) {
		this.river = river;
	}

	public BigDecimal getSalF() {
		return this.salF;
	}

	public void setSalF(BigDecimal salF) {
		this.salF = salF;
	}

	public Integer getSamNo() {
		return this.samNo;
	}

	public void setSamNo(Integer samNo) {
		this.samNo = samNo;
	}

	public BigDecimal getSb() {
		return this.sb;
	}

	public void setSb(BigDecimal sb) {
		this.sb = sb;
	}

	public BigDecimal getSio2() {
		return this.sio2;
	}

	public void setSio2(BigDecimal sio2) {
		this.sio2 = sio2;
	}

	public BigDecimal getSs() {
		return this.ss;
	}

	public void setSs(BigDecimal ss) {
		this.ss = ss;
	}

	public BigDecimal getSsp() {
		return this.ssp;
	}

	public void setSsp(BigDecimal ssp) {
		this.ssp = ssp;
	}

	public String getStatname() {
		return this.statname;
	}

	public void setStatname(String statname) {
		this.statname = statname;
	}

	public BigDecimal getTcyn() {
		return this.tcyn;
	}

	public void setTcyn(BigDecimal tcyn) {
		this.tcyn = tcyn;
	}

	public BigDecimal getTemper() {
		return this.temper;
	}

	public void setTemper(BigDecimal temper) {
		this.temper = temper;
	}

	public BigDecimal getTknsp() {
		return this.tknsp;
	}

	public void setTknsp(BigDecimal tknsp) {
		this.tknsp = tknsp;
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

	public BigDecimal getTpsp() {
		return this.tpsp;
	}

	public void setTpsp(BigDecimal tpsp) {
		this.tpsp = tpsp;
	}

	public BigDecimal getTs() {
		return this.ts;
	}

	public void setTs(BigDecimal ts) {
		this.ts = ts;
	}

	public BigDecimal getTurbF() {
		return this.turbF;
	}

	public void setTurbF(BigDecimal turbF) {
		this.turbF = turbF;
	}

	public BigDecimal getTvs() {
		return this.tvs;
	}

	public void setTvs(BigDecimal tvs) {
		this.tvs = tvs;
	}

	public BigDecimal getV() {
		return this.v;
	}

	public void setV(BigDecimal v) {
		this.v = v;
	}

	public String getWcz() {
		return this.wcz;
	}

	public void setWcz(String wcz) {
		this.wcz = wcz;
	}

	public String getWqiGrade() {
		return this.wqiGrade;
	}

	public void setWqiGrade(String wqiGrade) {
		this.wqiGrade = wqiGrade;
	}

	public BigDecimal getWqiPt() {
		return this.wqiPt;
	}

	public void setWqiPt(BigDecimal wqiPt) {
		this.wqiPt = wqiPt;
	}

	public BigDecimal getZn() {
		return this.zn;
	}

	public void setZn(BigDecimal zn) {
		this.zn = zn;
	}

}