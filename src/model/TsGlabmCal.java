package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ts_glabm_cal database table.
 * 
 */
//@Entity
@Table(name="ts_glabm_cal")
@NamedQuery(name="TsGlabmCal.findAll", query="SELECT t FROM TsGlabmCal t")
public class TsGlabmCal implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal ag;

	private BigDecimal al;

	@Column(name="\"AS\"")
	private BigDecimal as;

	@Column(name="as_inorg")
	private BigDecimal asInorg;

	private BigDecimal b;

	private BigDecimal ba;

	private BigDecimal be;

	private BigDecimal cd;

	private BigDecimal cr;

	private BigDecimal cu;

	@Column(name="date_received")
	private Timestamp dateReceived;

	@Column(name="date_reported")
	private Timestamp dateReported;

	private BigDecimal fe;

	private BigDecimal hg;

	@Column(name="l_ag")
	private String lAg;

	@Column(name="l_al")
	private String lAl;

	@Column(name="l_as")
	private String lAs;

	@Column(name="l_as_inorg")
	private String lAsInorg;

	@Column(name="l_b")
	private String lB;

	@Column(name="l_ba")
	private String lBa;

	@Column(name="l_be")
	private String lBe;

	@Column(name="l_cd")
	private String lCd;

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

	@Column(name="l_se")
	private String lSe;

	@Column(name="l_sn")
	private String lSn;

	@Column(name="l_tl")
	private String lTl;

	@Column(name="l_v")
	private String lV;

	@Column(name="l_zn")
	private String lZn;

	@Column(name="lab_no")
	private String labNo;

	private BigDecimal mn;

	private BigDecimal mo;

	private BigDecimal ni;

	private BigDecimal pb;

	@Column(name="sample_mark")
	private String sampleMark;

	private BigDecimal sb;

	private BigDecimal se;

	private BigDecimal sn;

	private BigDecimal tl;

	@Column(name="tsm_dwr")
	private BigDecimal tsmDwr;

	@Column(name="tsvisit_id")
	private String tsvisitId;

	@Column(name="tsvisit_id_old")
	private String tsvisitIdOld;

	private String type;

	private BigDecimal v;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	private BigDecimal zn;

	public TsGlabmCal() {
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

	public Timestamp getDateReceived() {
		return this.dateReceived;
	}

	public void setDateReceived(Timestamp dateReceived) {
		this.dateReceived = dateReceived;
	}

	public Timestamp getDateReported() {
		return this.dateReported;
	}

	public void setDateReported(Timestamp dateReported) {
		this.dateReported = dateReported;
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

	public String getLSe() {
		return this.lSe;
	}

	public void setLSe(String lSe) {
		this.lSe = lSe;
	}

	public String getLSn() {
		return this.lSn;
	}

	public void setLSn(String lSn) {
		this.lSn = lSn;
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

	public String getLabNo() {
		return this.labNo;
	}

	public void setLabNo(String labNo) {
		this.labNo = labNo;
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

	public String getSampleMark() {
		return this.sampleMark;
	}

	public void setSampleMark(String sampleMark) {
		this.sampleMark = sampleMark;
	}

	public BigDecimal getSb() {
		return this.sb;
	}

	public void setSb(BigDecimal sb) {
		this.sb = sb;
	}

	public BigDecimal getSe() {
		return this.se;
	}

	public void setSe(BigDecimal se) {
		this.se = se;
	}

	public BigDecimal getSn() {
		return this.sn;
	}

	public void setSn(BigDecimal sn) {
		this.sn = sn;
	}

	public BigDecimal getTl() {
		return this.tl;
	}

	public void setTl(BigDecimal tl) {
		this.tl = tl;
	}

	public BigDecimal getTsmDwr() {
		return this.tsmDwr;
	}

	public void setTsmDwr(BigDecimal tsmDwr) {
		this.tsmDwr = tsmDwr;
	}

	public String getTsvisitId() {
		return this.tsvisitId;
	}

	public void setTsvisitId(String tsvisitId) {
		this.tsvisitId = tsvisitId;
	}

	public String getTsvisitIdOld() {
		return this.tsvisitIdOld;
	}

	public void setTsvisitIdOld(String tsvisitIdOld) {
		this.tsvisitIdOld = tsvisitIdOld;
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

	public BigDecimal getValidCode() {
		return this.validCode;
	}

	public void setValidCode(BigDecimal validCode) {
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

	public BigDecimal getZn() {
		return this.zn;
	}

	public void setZn(BigDecimal zn) {
		this.zn = zn;
	}

}