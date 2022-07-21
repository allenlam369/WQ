package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ws_nm database table.
 * 
 */
//@Entity
@Table(name="ws_nm")
@NamedQuery(name="WsNm.findAll", query="SELECT w FROM WsNm w")
public class WsNm implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal ad;

	private BigDecimal al;

	private BigDecimal arsenic;

	private BigDecimal cd;

	private BigDecimal cp;

	private BigDecimal cr;

	private BigDecimal cu;

	private String depth;

	private BigDecimal ecoli;

	private BigDecimal fcoli;

	private BigDecimal fe;

	private BigDecimal hg;

	private BigDecimal igni;

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

	private String lad;

	private String lcp;

	private String lecoli;

	private String lfcoli;

	private String lph;

	@Column(name="m_date")
	private Timestamp mDate;

	private BigDecimal mn;

	private BigDecimal ni;

	@Column(name="p16_63um")
	private BigDecimal p1663um;

	@Column(name="p4_16um")
	private BigDecimal p416um;

	@Column(name="p63_500um")
	private BigDecimal p63500um;

	private BigDecimal pb;

	@Column(name="pg_500um")
	private BigDecimal pg500um;

	private BigDecimal ph;

	@Column(name="pl_4um")
	private BigDecimal pl4um;

	private BigDecimal porosity;

	private BigDecimal redox;

	@Column(name="s_time")
	private BigDecimal sTime;

	@Column(name="s_type")
	private String sType;

	private BigDecimal samples;

	private BigDecimal silt;

	@Column(name="station_id")
	private String stationId;

	private BigDecimal tkn;

	private BigDecimal toc;

	private BigDecimal tp;

	private BigDecimal ttp;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	@Column(name="w_visit_id")
	private String wVisitId;

	private BigDecimal zn;

	public WsNm() {
	}

	public BigDecimal getAd() {
		return this.ad;
	}

	public void setAd(BigDecimal ad) {
		this.ad = ad;
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

	public BigDecimal getCp() {
		return this.cp;
	}

	public void setCp(BigDecimal cp) {
		this.cp = cp;
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

	public String getDepth() {
		return this.depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}

	public BigDecimal getEcoli() {
		return this.ecoli;
	}

	public void setEcoli(BigDecimal ecoli) {
		this.ecoli = ecoli;
	}

	public BigDecimal getFcoli() {
		return this.fcoli;
	}

	public void setFcoli(BigDecimal fcoli) {
		this.fcoli = fcoli;
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

	public BigDecimal getIgni() {
		return this.igni;
	}

	public void setIgni(BigDecimal igni) {
		this.igni = igni;
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

	public String getLad() {
		return this.lad;
	}

	public void setLad(String lad) {
		this.lad = lad;
	}

	public String getLcp() {
		return this.lcp;
	}

	public void setLcp(String lcp) {
		this.lcp = lcp;
	}

	public String getLecoli() {
		return this.lecoli;
	}

	public void setLecoli(String lecoli) {
		this.lecoli = lecoli;
	}

	public String getLfcoli() {
		return this.lfcoli;
	}

	public void setLfcoli(String lfcoli) {
		this.lfcoli = lfcoli;
	}

	public String getLph() {
		return this.lph;
	}

	public void setLph(String lph) {
		this.lph = lph;
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

	public BigDecimal getP1663um() {
		return this.p1663um;
	}

	public void setP1663um(BigDecimal p1663um) {
		this.p1663um = p1663um;
	}

	public BigDecimal getP416um() {
		return this.p416um;
	}

	public void setP416um(BigDecimal p416um) {
		this.p416um = p416um;
	}

	public BigDecimal getP63500um() {
		return this.p63500um;
	}

	public void setP63500um(BigDecimal p63500um) {
		this.p63500um = p63500um;
	}

	public BigDecimal getPb() {
		return this.pb;
	}

	public void setPb(BigDecimal pb) {
		this.pb = pb;
	}

	public BigDecimal getPg500um() {
		return this.pg500um;
	}

	public void setPg500um(BigDecimal pg500um) {
		this.pg500um = pg500um;
	}

	public BigDecimal getPh() {
		return this.ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public BigDecimal getPl4um() {
		return this.pl4um;
	}

	public void setPl4um(BigDecimal pl4um) {
		this.pl4um = pl4um;
	}

	public BigDecimal getPorosity() {
		return this.porosity;
	}

	public void setPorosity(BigDecimal porosity) {
		this.porosity = porosity;
	}

	public BigDecimal getRedox() {
		return this.redox;
	}

	public void setRedox(BigDecimal redox) {
		this.redox = redox;
	}

	public BigDecimal getSTime() {
		return this.sTime;
	}

	public void setSTime(BigDecimal sTime) {
		this.sTime = sTime;
	}

	public String getSType() {
		return this.sType;
	}

	public void setSType(String sType) {
		this.sType = sType;
	}

	public BigDecimal getSamples() {
		return this.samples;
	}

	public void setSamples(BigDecimal samples) {
		this.samples = samples;
	}

	public BigDecimal getSilt() {
		return this.silt;
	}

	public void setSilt(BigDecimal silt) {
		this.silt = silt;
	}

	public String getStationId() {
		return this.stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public BigDecimal getTkn() {
		return this.tkn;
	}

	public void setTkn(BigDecimal tkn) {
		this.tkn = tkn;
	}

	public BigDecimal getToc() {
		return this.toc;
	}

	public void setToc(BigDecimal toc) {
		this.toc = toc;
	}

	public BigDecimal getTp() {
		return this.tp;
	}

	public void setTp(BigDecimal tp) {
		this.tp = tp;
	}

	public BigDecimal getTtp() {
		return this.ttp;
	}

	public void setTtp(BigDecimal ttp) {
		this.ttp = ttp;
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