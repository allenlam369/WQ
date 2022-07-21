package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the tw_glabm_cal database table.
 * 
 */
//@Entity
@Table(name="tw_glabm_cal")
@NamedQuery(name="TwGlabmCal.findAll", query="SELECT t FROM TwGlabmCal t")
public class TwGlabmCal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"AS\"")
	private BigDecimal as;

	@Column(name="as_inorg")
	private BigDecimal asInorg;

	private BigDecimal ba;

	private BigDecimal be;

	private BigDecimal cd;

	private BigDecimal cu;

	@Column(name="date_received")
	private Timestamp dateReceived;

	@Column(name="date_reported")
	private Timestamp dateReported;

	private BigDecimal hg;

	@Column(name="l_as")
	private String lAs;

	@Column(name="l_as_inorg")
	private String lAsInorg;

	@Column(name="l_ba")
	private String lBa;

	@Column(name="l_be")
	private String lBe;

	@Column(name="l_cd")
	private String lCd;

	@Column(name="l_cu")
	private String lCu;

	@Column(name="l_hg")
	private String lHg;

	@Column(name="l_se")
	private String lSe;

	@Column(name="l_sn")
	private String lSn;

	@Column(name="l_tl")
	private String lTl;

	@Column(name="l_zn")
	private String lZn;

	@Column(name="lab_no")
	private String labNo;

	@Column(name="sample_mark")
	private String sampleMark;

	private BigDecimal se;

	private BigDecimal sn;

	private BigDecimal tl;

	@Column(name="twp_dwr")
	private BigDecimal twpDwr;

	@Column(name="twvisit_id")
	private String twvisitId;

	@Column(name="twvisit_id_old")
	private String twvisitIdOld;

	private String type;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	private BigDecimal zn;

	public TwGlabmCal() {
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

	public BigDecimal getHg() {
		return this.hg;
	}

	public void setHg(BigDecimal hg) {
		this.hg = hg;
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

	public String getLCu() {
		return this.lCu;
	}

	public void setLCu(String lCu) {
		this.lCu = lCu;
	}

	public String getLHg() {
		return this.lHg;
	}

	public void setLHg(String lHg) {
		this.lHg = lHg;
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

	public String getSampleMark() {
		return this.sampleMark;
	}

	public void setSampleMark(String sampleMark) {
		this.sampleMark = sampleMark;
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

	public BigDecimal getTwpDwr() {
		return this.twpDwr;
	}

	public void setTwpDwr(BigDecimal twpDwr) {
		this.twpDwr = twpDwr;
	}

	public String getTwvisitId() {
		return this.twvisitId;
	}

	public void setTwvisitId(String twvisitId) {
		this.twvisitId = twvisitId;
	}

	public String getTwvisitIdOld() {
		return this.twvisitIdOld;
	}

	public void setTwvisitIdOld(String twvisitIdOld) {
		this.twvisitIdOld = twvisitIdOld;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
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