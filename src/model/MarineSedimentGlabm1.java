package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the marine_sediment_glabm1 database table.
 * 
 */
//@Entity
@Table(name="marine_sediment_glabm1")
@NamedQuery(name="MarineSedimentGlabm1.findAll", query="SELECT m FROM MarineSedimentGlabm1 m")
public class MarineSedimentGlabm1 implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal ag;

	private BigDecimal al;

	private BigDecimal ars;

	private BigDecimal b;

	private BigDecimal ba;

	private BigDecimal be;

	private BigDecimal cd;

	private BigDecimal co;

	private BigDecimal cr;

	private BigDecimal cu;

	private BigDecimal fe;

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

	@Column(name="l_cd")
	private String lCd;

	@Column(name="l_co")
	private String lCo;

	@Column(name="l_cr")
	private String lCr;

	@Column(name="l_cu")
	private String lCu;

	@Column(name="l_fe")
	private String lFe;

	@Column(name="l_hg")
	private String lHg;

	@Column(name="l_mn")
	private String lMn;

	@Column(name="l_mo")
	private String lMo;

	@Column(name="l_ni")
	private String lNi;

	@Column(name="l_pb")
	private String lPb;

	@Column(name="l_sb")
	private String lSb;

	@Column(name="l_tl")
	private String lTl;

	@Column(name="l_v")
	private String lV;

	@Column(name="l_zn")
	private String lZn;

	private Timestamp mdate;

	private BigDecimal mn;

	private BigDecimal mo;

	@Column(name="msm_dwr")
	private BigDecimal msmDwr;

	private BigDecimal ni;

	private BigDecimal pb;

	@Column(name="sam_no")
	private BigDecimal samNo;

	private BigDecimal sb;

	private String station;

	private BigDecimal stime;

	private String subzone;

	private BigDecimal tl;

	private String type;

	private BigDecimal v;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	private BigDecimal zn;

	private String zone;

	public MarineSedimentGlabm1() {
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

	public BigDecimal getCd() {
		return this.cd;
	}

	public void setCd(BigDecimal cd) {
		this.cd = cd;
	}

	public BigDecimal getCo() {
		return this.co;
	}

	public void setCo(BigDecimal co) {
		this.co = co;
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

	public BigDecimal getFe() {
		return this.fe;
	}

	public void setFe(BigDecimal fe) {
		this.fe = fe;
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

	public String getLCd() {
		return this.lCd;
	}

	public void setLCd(String lCd) {
		this.lCd = lCd;
	}

	public String getLCo() {
		return this.lCo;
	}

	public void setLCo(String lCo) {
		this.lCo = lCo;
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

	public String getLFe() {
		return this.lFe;
	}

	public void setLFe(String lFe) {
		this.lFe = lFe;
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

	public String getLNi() {
		return this.lNi;
	}

	public void setLNi(String lNi) {
		this.lNi = lNi;
	}

	public String getLPb() {
		return this.lPb;
	}

	public void setLPb(String lPb) {
		this.lPb = lPb;
	}

	public String getLSb() {
		return this.lSb;
	}

	public void setLSb(String lSb) {
		this.lSb = lSb;
	}

	public String getLTl() {
		return this.lTl;
	}

	public void setLTl(String lTl) {
		this.lTl = lTl;
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

	public BigDecimal getMsmDwr() {
		return this.msmDwr;
	}

	public void setMsmDwr(BigDecimal msmDwr) {
		this.msmDwr = msmDwr;
	}

	public BigDecimal getNi() {
		return this.ni;
	}

	public void setNi(BigDecimal ni) {
		this.ni = ni;
	}

	public BigDecimal getPb() {
		return this.pb;
	}

	public void setPb(BigDecimal pb) {
		this.pb = pb;
	}

	public BigDecimal getSamNo() {
		return this.samNo;
	}

	public void setSamNo(BigDecimal samNo) {
		this.samNo = samNo;
	}

	public BigDecimal getSb() {
		return this.sb;
	}

	public void setSb(BigDecimal sb) {
		this.sb = sb;
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

	public BigDecimal getTl() {
		return this.tl;
	}

	public void setTl(BigDecimal tl) {
		this.tl = tl;
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