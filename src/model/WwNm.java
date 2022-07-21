package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ww_nm database table.
 * 
 */
//@Entity
@Table(name="ww_nm")
@NamedQuery(name="WwNm.findAll", query="SELECT w FROM WwNm w")
public class WwNm implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal al;

	private BigDecimal arsenic;

	private BigDecimal bod;

	private BigDecimal cd;

	private BigDecimal chl;

	private BigDecimal con;

	private BigDecimal cr;

	private BigDecimal cu;

	private String depth;

	@Column(name="\"DO\"")
	private BigDecimal do_;

	@Column(name="do_s")
	private BigDecimal doS;

	private BigDecimal ec;

	private BigDecimal fcoli;

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

	@Column(name="l_ec")
	private String lEc;

	@Column(name="l_fcoli")
	private String lFcoli;

	@Column(name="l_fe")
	private String lFe;

	@Column(name="l_hg")
	private String lHg;

	@Column(name="l_mn")
	private String lMn;

	@Column(name="l_nh4")
	private String lNh4;

	@Column(name="l_ni")
	private String lNi;

	@Column(name="l_no2")
	private String lNo2;

	@Column(name="l_no3")
	private String lNo3;

	@Column(name="l_pb")
	private String lPb;

	@Column(name="l_po4")
	private String lPo4;

	@Column(name="l_silica")
	private String lSilica;

	@Column(name="l_ss")
	private String lSs;

	@Column(name="l_tkn")
	private String lTkn;

	@Column(name="l_tknsp")
	private String lTknsp;

	@Column(name="l_tps")
	private String lTps;

	@Column(name="l_tpsp")
	private String lTpsp;

	@Column(name="l_ts")
	private String lTs;

	@Column(name="l_tvs")
	private String lTvs;

	@Column(name="l_zn")
	private String lZn;

	private String lcon;

	private String ltin;

	@Column(name="m_date")
	private Timestamp mDate;

	private BigDecimal mn;

	private BigDecimal nh4;

	private BigDecimal ni;

	private BigDecimal no2;

	private BigDecimal no3;

	private BigDecimal pb;

	private BigDecimal ph;

	private BigDecimal phae;

	private BigDecimal po4;

	@Column(name="s_time")
	private BigDecimal sTime;

	private BigDecimal salinity;

	private BigDecimal samples;

	private BigDecimal silica;

	private BigDecimal ss;

	@Column(name="station_id")
	private String stationId;

	private BigDecimal temperature;

	private BigDecimal tin;

	private BigDecimal tkn;

	private BigDecimal tknsp;

	private BigDecimal tps;

	private BigDecimal tpsp;

	private BigDecimal ts;

	private BigDecimal turb;

	private BigDecimal tvs;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	@Column(name="w_visit_id")
	private String wVisitId;

	private BigDecimal zn;

	public WwNm() {
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

	public BigDecimal getBod() {
		return this.bod;
	}

	public void setBod(BigDecimal bod) {
		this.bod = bod;
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

	public BigDecimal getCon() {
		return this.con;
	}

	public void setCon(BigDecimal con) {
		this.con = con;
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

	public BigDecimal getDo_() {
		return this.do_;
	}

	public void setDo_(BigDecimal do_) {
		this.do_ = do_;
	}

	public BigDecimal getDoS() {
		return this.doS;
	}

	public void setDoS(BigDecimal doS) {
		this.doS = doS;
	}

	public BigDecimal getEc() {
		return this.ec;
	}

	public void setEc(BigDecimal ec) {
		this.ec = ec;
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

	public String getLEc() {
		return this.lEc;
	}

	public void setLEc(String lEc) {
		this.lEc = lEc;
	}

	public String getLFcoli() {
		return this.lFcoli;
	}

	public void setLFcoli(String lFcoli) {
		this.lFcoli = lFcoli;
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

	public String getLPb() {
		return this.lPb;
	}

	public void setLPb(String lPb) {
		this.lPb = lPb;
	}

	public String getLPo4() {
		return this.lPo4;
	}

	public void setLPo4(String lPo4) {
		this.lPo4 = lPo4;
	}

	public String getLSilica() {
		return this.lSilica;
	}

	public void setLSilica(String lSilica) {
		this.lSilica = lSilica;
	}

	public String getLSs() {
		return this.lSs;
	}

	public void setLSs(String lSs) {
		this.lSs = lSs;
	}

	public String getLTkn() {
		return this.lTkn;
	}

	public void setLTkn(String lTkn) {
		this.lTkn = lTkn;
	}

	public String getLTknsp() {
		return this.lTknsp;
	}

	public void setLTknsp(String lTknsp) {
		this.lTknsp = lTknsp;
	}

	public String getLTps() {
		return this.lTps;
	}

	public void setLTps(String lTps) {
		this.lTps = lTps;
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

	public String getLTvs() {
		return this.lTvs;
	}

	public void setLTvs(String lTvs) {
		this.lTvs = lTvs;
	}

	public String getLZn() {
		return this.lZn;
	}

	public void setLZn(String lZn) {
		this.lZn = lZn;
	}

	public String getLcon() {
		return this.lcon;
	}

	public void setLcon(String lcon) {
		this.lcon = lcon;
	}

	public String getLtin() {
		return this.ltin;
	}

	public void setLtin(String ltin) {
		this.ltin = ltin;
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

	public BigDecimal getNh4() {
		return this.nh4;
	}

	public void setNh4(BigDecimal nh4) {
		this.nh4 = nh4;
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

	public BigDecimal getPb() {
		return this.pb;
	}

	public void setPb(BigDecimal pb) {
		this.pb = pb;
	}

	public BigDecimal getPh() {
		return this.ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public BigDecimal getPhae() {
		return this.phae;
	}

	public void setPhae(BigDecimal phae) {
		this.phae = phae;
	}

	public BigDecimal getPo4() {
		return this.po4;
	}

	public void setPo4(BigDecimal po4) {
		this.po4 = po4;
	}

	public BigDecimal getSTime() {
		return this.sTime;
	}

	public void setSTime(BigDecimal sTime) {
		this.sTime = sTime;
	}

	public BigDecimal getSalinity() {
		return this.salinity;
	}

	public void setSalinity(BigDecimal salinity) {
		this.salinity = salinity;
	}

	public BigDecimal getSamples() {
		return this.samples;
	}

	public void setSamples(BigDecimal samples) {
		this.samples = samples;
	}

	public BigDecimal getSilica() {
		return this.silica;
	}

	public void setSilica(BigDecimal silica) {
		this.silica = silica;
	}

	public BigDecimal getSs() {
		return this.ss;
	}

	public void setSs(BigDecimal ss) {
		this.ss = ss;
	}

	public String getStationId() {
		return this.stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public BigDecimal getTemperature() {
		return this.temperature;
	}

	public void setTemperature(BigDecimal temperature) {
		this.temperature = temperature;
	}

	public BigDecimal getTin() {
		return this.tin;
	}

	public void setTin(BigDecimal tin) {
		this.tin = tin;
	}

	public BigDecimal getTkn() {
		return this.tkn;
	}

	public void setTkn(BigDecimal tkn) {
		this.tkn = tkn;
	}

	public BigDecimal getTknsp() {
		return this.tknsp;
	}

	public void setTknsp(BigDecimal tknsp) {
		this.tknsp = tknsp;
	}

	public BigDecimal getTps() {
		return this.tps;
	}

	public void setTps(BigDecimal tps) {
		this.tps = tps;
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

	public BigDecimal getTurb() {
		return this.turb;
	}

	public void setTurb(BigDecimal turb) {
		this.turb = turb;
	}

	public BigDecimal getTvs() {
		return this.tvs;
	}

	public void setTvs(BigDecimal tvs) {
		this.tvs = tvs;
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