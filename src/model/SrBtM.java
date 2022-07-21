package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the sr_bt_m database table.
 * 
 */
//@Entity
@Table(name="sr_bt_m")
@NamedQuery(name="SrBtM.findAll", query="SELECT s FROM SrBtM s")
public class SrBtM implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal ag;

	private BigDecimal al;

	private BigDecimal arsenic;

	private BigDecimal b;

	@Column(name="bt_m_id")
	private String btMId;

	@Column(name="bt_spcode_id")
	private String btSpcodeId;

	@Column(name="bt_visit_id")
	private String btVisitId;

	private BigDecimal cd;

	private BigDecimal co;

	private BigDecimal cr;

	private BigDecimal cu;

	@Column(name="delete_date")
	private Timestamp deleteDate;

	@Column(name="delete_user")
	private String deleteUser;

	@Column(name="dwr_m")
	private BigDecimal dwrM;

	private BigDecimal fe;

	private BigDecimal hg;

	@Column(name="l_ag")
	private String lAg;

	@Column(name="l_al")
	private String lAl;

	@Column(name="l_arsenic")
	private String lArsenic;

	@Column(name="l_b")
	private String lB;

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

	@Column(name="l_ni")
	private String lNi;

	@Column(name="l_pb")
	private String lPb;

	@Column(name="l_v")
	private String lV;

	@Column(name="l_zn")
	private String lZn;

	private BigDecimal mn;

	private BigDecimal ni;

	private BigDecimal pb;

	@Column(name="sample_mark")
	private String sampleMark;

	private BigDecimal v;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	private BigDecimal zn;

	public SrBtM() {
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

	public BigDecimal getArsenic() {
		return this.arsenic;
	}

	public void setArsenic(BigDecimal arsenic) {
		this.arsenic = arsenic;
	}

	public BigDecimal getB() {
		return this.b;
	}

	public void setB(BigDecimal b) {
		this.b = b;
	}

	public String getBtMId() {
		return this.btMId;
	}

	public void setBtMId(String btMId) {
		this.btMId = btMId;
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

	public BigDecimal getDwrM() {
		return this.dwrM;
	}

	public void setDwrM(BigDecimal dwrM) {
		this.dwrM = dwrM;
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

	public String getLArsenic() {
		return this.lArsenic;
	}

	public void setLArsenic(String lArsenic) {
		this.lArsenic = lArsenic;
	}

	public String getLB() {
		return this.lB;
	}

	public void setLB(String lB) {
		this.lB = lB;
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

	public BigDecimal getMn() {
		return this.mn;
	}

	public void setMn(BigDecimal mn) {
		this.mn = mn;
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