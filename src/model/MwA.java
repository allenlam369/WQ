package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the mw_a database table.
 * 
 */
//@Entity
@Table(name="mw_a")
@NamedQuery(name="MwA.findAll", query="SELECT m FROM MwA m")
public class MwA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="air_temp")
	private BigDecimal airTemp;

	private BigDecimal bod5;

	private BigDecimal chl;

	private BigDecimal cond;

	@Column(name="d_code")
	private String dCode;

	@Column(name="\"DO\"")
	private BigDecimal do_;

	@Column(name="do_sat")
	private BigDecimal doSat;

	private BigDecimal ecoli;

	private BigDecimal fc;

	@Column(name="fish_kill")
	private String fishKill;

	private BigDecimal flscufa;

	private Timestamp mdate;

	@Column(name="mwvisit_id")
	private String mwvisitId;

	private BigDecimal nh3;

	private BigDecimal nh4;

	@Column(name="nh4_nm")
	private BigDecimal nh4Nm;

	private BigDecimal no2;

	@Column(name="no2_nm")
	private BigDecimal no2Nm;

	private BigDecimal no3;

	@Column(name="no3_nm")
	private BigDecimal no3Nm;

	@Column(name="nox_nm")
	private BigDecimal noxNm;

	private BigDecimal par;

	@Column(name="ph_m")
	private BigDecimal phM;

	@Column(name="ph_sc")
	private BigDecimal phSc;

	private BigDecimal phae;

	private BigDecimal po4;

	@Column(name="po4_pm")
	private BigDecimal po4Pm;

	private BigDecimal sal;

	@Column(name="sam_no")
	private BigDecimal samNo;

	private BigDecimal sd;

	@Column(name="sea_col")
	private String seaCol;

	@Column(name="sea_cond")
	private String seaCond;

	private BigDecimal sio2;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="sol_rad")
	private BigDecimal solRad;

	private BigDecimal ss;

	private BigDecimal stime;

	private BigDecimal temper;

	private BigDecimal tin;

	@Column(name="tin_nm")
	private BigDecimal tinNm;

	@Column(name="tin_po4_mmr")
	private BigDecimal tinPo4Mmr;

	@Column(name="tkn_nm")
	private BigDecimal tknNm;

	@Column(name="tkn_p")
	private BigDecimal tknP;

	@Column(name="tkn_s")
	private BigDecimal tknS;

	@Column(name="tkn_sp")
	private BigDecimal tknSp;

	private BigDecimal tn;

	@Column(name="tn_nm")
	private BigDecimal tnNm;

	@Column(name="tn_tp_mmr")
	private BigDecimal tnTpMmr;

	@Column(name="tp_p")
	private BigDecimal tpP;

	@Column(name="tp_pm")
	private BigDecimal tpPm;

	@Column(name="tp_s")
	private BigDecimal tpS;

	@Column(name="tp_sp")
	private BigDecimal tpSp;

	@Column(name="turb_m")
	private BigDecimal turbM;

	@Column(name="turb_sc")
	private BigDecimal turbSc;

	private BigDecimal tvs;

	private String weather;

	@Column(name="wind_dir")
	private BigDecimal windDir;

	@Column(name="wind_sp")
	private BigDecimal windSp;

	public MwA() {
	}

	public BigDecimal getAirTemp() {
		return this.airTemp;
	}

	public void setAirTemp(BigDecimal airTemp) {
		this.airTemp = airTemp;
	}

	public BigDecimal getBod5() {
		return this.bod5;
	}

	public void setBod5(BigDecimal bod5) {
		this.bod5 = bod5;
	}

	public BigDecimal getChl() {
		return this.chl;
	}

	public void setChl(BigDecimal chl) {
		this.chl = chl;
	}

	public BigDecimal getCond() {
		return this.cond;
	}

	public void setCond(BigDecimal cond) {
		this.cond = cond;
	}

	public String getDCode() {
		return this.dCode;
	}

	public void setDCode(String dCode) {
		this.dCode = dCode;
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

	public BigDecimal getEcoli() {
		return this.ecoli;
	}

	public void setEcoli(BigDecimal ecoli) {
		this.ecoli = ecoli;
	}

	public BigDecimal getFc() {
		return this.fc;
	}

	public void setFc(BigDecimal fc) {
		this.fc = fc;
	}

	public String getFishKill() {
		return this.fishKill;
	}

	public void setFishKill(String fishKill) {
		this.fishKill = fishKill;
	}

	public BigDecimal getFlscufa() {
		return this.flscufa;
	}

	public void setFlscufa(BigDecimal flscufa) {
		this.flscufa = flscufa;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public String getMwvisitId() {
		return this.mwvisitId;
	}

	public void setMwvisitId(String mwvisitId) {
		this.mwvisitId = mwvisitId;
	}

	public BigDecimal getNh3() {
		return this.nh3;
	}

	public void setNh3(BigDecimal nh3) {
		this.nh3 = nh3;
	}

	public BigDecimal getNh4() {
		return this.nh4;
	}

	public void setNh4(BigDecimal nh4) {
		this.nh4 = nh4;
	}

	public BigDecimal getNh4Nm() {
		return this.nh4Nm;
	}

	public void setNh4Nm(BigDecimal nh4Nm) {
		this.nh4Nm = nh4Nm;
	}

	public BigDecimal getNo2() {
		return this.no2;
	}

	public void setNo2(BigDecimal no2) {
		this.no2 = no2;
	}

	public BigDecimal getNo2Nm() {
		return this.no2Nm;
	}

	public void setNo2Nm(BigDecimal no2Nm) {
		this.no2Nm = no2Nm;
	}

	public BigDecimal getNo3() {
		return this.no3;
	}

	public void setNo3(BigDecimal no3) {
		this.no3 = no3;
	}

	public BigDecimal getNo3Nm() {
		return this.no3Nm;
	}

	public void setNo3Nm(BigDecimal no3Nm) {
		this.no3Nm = no3Nm;
	}

	public BigDecimal getNoxNm() {
		return this.noxNm;
	}

	public void setNoxNm(BigDecimal noxNm) {
		this.noxNm = noxNm;
	}

	public BigDecimal getPar() {
		return this.par;
	}

	public void setPar(BigDecimal par) {
		this.par = par;
	}

	public BigDecimal getPhM() {
		return this.phM;
	}

	public void setPhM(BigDecimal phM) {
		this.phM = phM;
	}

	public BigDecimal getPhSc() {
		return this.phSc;
	}

	public void setPhSc(BigDecimal phSc) {
		this.phSc = phSc;
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

	public BigDecimal getPo4Pm() {
		return this.po4Pm;
	}

	public void setPo4Pm(BigDecimal po4Pm) {
		this.po4Pm = po4Pm;
	}

	public BigDecimal getSal() {
		return this.sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

	public BigDecimal getSamNo() {
		return this.samNo;
	}

	public void setSamNo(BigDecimal samNo) {
		this.samNo = samNo;
	}

	public BigDecimal getSd() {
		return this.sd;
	}

	public void setSd(BigDecimal sd) {
		this.sd = sd;
	}

	public String getSeaCol() {
		return this.seaCol;
	}

	public void setSeaCol(String seaCol) {
		this.seaCol = seaCol;
	}

	public String getSeaCond() {
		return this.seaCond;
	}

	public void setSeaCond(String seaCond) {
		this.seaCond = seaCond;
	}

	public BigDecimal getSio2() {
		return this.sio2;
	}

	public void setSio2(BigDecimal sio2) {
		this.sio2 = sio2;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getSolRad() {
		return this.solRad;
	}

	public void setSolRad(BigDecimal solRad) {
		this.solRad = solRad;
	}

	public BigDecimal getSs() {
		return this.ss;
	}

	public void setSs(BigDecimal ss) {
		this.ss = ss;
	}

	public BigDecimal getStime() {
		return this.stime;
	}

	public void setStime(BigDecimal stime) {
		this.stime = stime;
	}

	public BigDecimal getTemper() {
		return this.temper;
	}

	public void setTemper(BigDecimal temper) {
		this.temper = temper;
	}

	public BigDecimal getTin() {
		return this.tin;
	}

	public void setTin(BigDecimal tin) {
		this.tin = tin;
	}

	public BigDecimal getTinNm() {
		return this.tinNm;
	}

	public void setTinNm(BigDecimal tinNm) {
		this.tinNm = tinNm;
	}

	public BigDecimal getTinPo4Mmr() {
		return this.tinPo4Mmr;
	}

	public void setTinPo4Mmr(BigDecimal tinPo4Mmr) {
		this.tinPo4Mmr = tinPo4Mmr;
	}

	public BigDecimal getTknNm() {
		return this.tknNm;
	}

	public void setTknNm(BigDecimal tknNm) {
		this.tknNm = tknNm;
	}

	public BigDecimal getTknP() {
		return this.tknP;
	}

	public void setTknP(BigDecimal tknP) {
		this.tknP = tknP;
	}

	public BigDecimal getTknS() {
		return this.tknS;
	}

	public void setTknS(BigDecimal tknS) {
		this.tknS = tknS;
	}

	public BigDecimal getTknSp() {
		return this.tknSp;
	}

	public void setTknSp(BigDecimal tknSp) {
		this.tknSp = tknSp;
	}

	public BigDecimal getTn() {
		return this.tn;
	}

	public void setTn(BigDecimal tn) {
		this.tn = tn;
	}

	public BigDecimal getTnNm() {
		return this.tnNm;
	}

	public void setTnNm(BigDecimal tnNm) {
		this.tnNm = tnNm;
	}

	public BigDecimal getTnTpMmr() {
		return this.tnTpMmr;
	}

	public void setTnTpMmr(BigDecimal tnTpMmr) {
		this.tnTpMmr = tnTpMmr;
	}

	public BigDecimal getTpP() {
		return this.tpP;
	}

	public void setTpP(BigDecimal tpP) {
		this.tpP = tpP;
	}

	public BigDecimal getTpPm() {
		return this.tpPm;
	}

	public void setTpPm(BigDecimal tpPm) {
		this.tpPm = tpPm;
	}

	public BigDecimal getTpS() {
		return this.tpS;
	}

	public void setTpS(BigDecimal tpS) {
		this.tpS = tpS;
	}

	public BigDecimal getTpSp() {
		return this.tpSp;
	}

	public void setTpSp(BigDecimal tpSp) {
		this.tpSp = tpSp;
	}

	public BigDecimal getTurbM() {
		return this.turbM;
	}

	public void setTurbM(BigDecimal turbM) {
		this.turbM = turbM;
	}

	public BigDecimal getTurbSc() {
		return this.turbSc;
	}

	public void setTurbSc(BigDecimal turbSc) {
		this.turbSc = turbSc;
	}

	public BigDecimal getTvs() {
		return this.tvs;
	}

	public void setTvs(BigDecimal tvs) {
		this.tvs = tvs;
	}

	public String getWeather() {
		return this.weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public BigDecimal getWindDir() {
		return this.windDir;
	}

	public void setWindDir(BigDecimal windDir) {
		this.windDir = windDir;
	}

	public BigDecimal getWindSp() {
		return this.windSp;
	}

	public void setWindSp(BigDecimal windSp) {
		this.windSp = windSp;
	}

}