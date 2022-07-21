package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the wt_m database table.
 * 
 */
//@Entity
@Table(name="wt_m")
@NamedQuery(name="WtM.findAll", query="SELECT w FROM WtM w")
public class WtM implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal ag;

	private BigDecimal al;

	private BigDecimal arsenic;

	private BigDecimal cd;

	private BigDecimal cr;

	private BigDecimal cu;

	private BigDecimal fe;

	private BigDecimal hg;

	@Column(name="l_al")
	private String lAl;

	@Column(name="l_arsenic")
	private String lArsenic;

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

	@Column(name="l_ni")
	private String lNi;

	@Column(name="l_pb")
	private String lPb;

	@Column(name="l_zn")
	private String lZn;

	private String lag;

	private String lv;

	@Column(name="m_date")
	private Timestamp mDate;

	private BigDecimal mn;

	private BigDecimal ni;

	private BigDecimal pb;

	private String pooling;

	@Column(name="s_time")
	private BigDecimal sTime;

	private BigDecimal sample;

	private String scode;

	@Column(name="sp_name")
	private String spName;

	@Column(name="station_id")
	private String stationId;

	private String tissue;

	private BigDecimal v;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	@Column(name="w_visit_id")
	private String wVisitId;

	private BigDecimal zn;

	public WtM() {
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

	public String getLZn() {
		return this.lZn;
	}

	public void setLZn(String lZn) {
		this.lZn = lZn;
	}

	public String getLag() {
		return this.lag;
	}

	public void setLag(String lag) {
		this.lag = lag;
	}

	public String getLv() {
		return this.lv;
	}

	public void setLv(String lv) {
		this.lv = lv;
	}

	public Timestamp getMDate() {
		return this.mDate;
	}

	public void setMDate(Timestamp mDate) {
		this.mDate = mDate;
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

	public String getPooling() {
		return this.pooling;
	}

	public void setPooling(String pooling) {
		this.pooling = pooling;
	}

	public BigDecimal getSTime() {
		return this.sTime;
	}

	public void setSTime(BigDecimal sTime) {
		this.sTime = sTime;
	}

	public BigDecimal getSample() {
		return this.sample;
	}

	public void setSample(BigDecimal sample) {
		this.sample = sample;
	}

	public String getScode() {
		return this.scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}

	public String getSpName() {
		return this.spName;
	}

	public void setSpName(String spName) {
		this.spName = spName;
	}

	public String getStationId() {
		return this.stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getTissue() {
		return this.tissue;
	}

	public void setTissue(String tissue) {
		this.tissue = tissue;
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

	public String getWVisitId() {
		return this.wVisitId;
	}

	public void setWVisitId(String wVisitId) {
		this.wVisitId = wVisitId;
	}

	public BigDecimal getZn() {
		return this.zn;
	}

	public void setZn(BigDecimal zn) {
		this.zn = zn;
	}

}