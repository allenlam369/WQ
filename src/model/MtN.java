package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the mt_n database table.
 * 
 */
//@Entity
@Table(name="mt_n")
@NamedQuery(name="MtN.findAll", query="SELECT m FROM MtN m")
public class MtN implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="air_temp")
	private BigDecimal airTemp;

	private String bod5;

	private String chl;

	private String cond;

	@Column(name="d_code")
	private String dCode;

	@Column(name="\"DO\"")
	private String do_;

	@Column(name="do_sat")
	private String doSat;

	private String ecoli;

	private String fc;

	@Column(name="fish_kill")
	private String fishKill;

	private String flscufa;

	@Column(name="l_bod5")
	private String lBod5;

	@Column(name="l_chl")
	private String lChl;

	@Column(name="l_ecoli")
	private String lEcoli;

	@Column(name="l_fc")
	private String lFc;

	@Column(name="l_nh4")
	private String lNh4;

	@Column(name="l_no2")
	private String lNo2;

	@Column(name="l_no3")
	private String lNo3;

	@Column(name="l_ph_m")
	private String lPhM;

	@Column(name="l_phae")
	private String lPhae;

	@Column(name="l_po4")
	private String lPo4;

	@Column(name="l_sio2")
	private String lSio2;

	@Column(name="l_ss")
	private String lSs;

	@Column(name="l_tkn_p")
	private String lTknP;

	@Column(name="l_tkn_s")
	private String lTknS;

	@Column(name="l_tkn_sp")
	private String lTknSp;

	@Column(name="l_tp_p")
	private String lTpP;

	@Column(name="l_tp_s")
	private String lTpS;

	@Column(name="l_tp_sp")
	private String lTpSp;

	@Column(name="l_turb_m")
	private String lTurbM;

	@Column(name="l_tvs")
	private String lTvs;

	private Timestamp mdate;

	@Column(name="mwvisit_id")
	private String mwvisitId;

	private String nh3;

	private String nh4;

	@Column(name="nh4_nm")
	private String nh4Nm;

	private String no2;

	@Column(name="no2_nm")
	private String no2Nm;

	private String no3;

	@Column(name="no3_nm")
	private String no3Nm;

	@Column(name="nox_nm")
	private String noxNm;

	private String par;

	@Column(name="ph_m")
	private String phM;

	@Column(name="ph_sc")
	private String phSc;

	private String phae;

	private String po4;

	@Column(name="po4_pm")
	private String po4Pm;

	private String sal;

	@Column(name="sam_no")
	private BigDecimal samNo;

	private BigDecimal sd;

	@Column(name="sea_col")
	private String seaCol;

	@Column(name="sea_cond")
	private String seaCond;

	private String sio2;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="sol_rad")
	private BigDecimal solRad;

	private String ss;

	private BigDecimal stime;

	private String temper;

	private String tin;

	@Column(name="tin_nm")
	private String tinNm;

	@Column(name="tin_po4_mmr")
	private String tinPo4Mmr;

	@Column(name="tkn_nm")
	private String tknNm;

	@Column(name="tkn_p")
	private String tknP;

	@Column(name="tkn_s")
	private String tknS;

	@Column(name="tkn_sp")
	private String tknSp;

	private String tn;

	@Column(name="tn_nm")
	private String tnNm;

	@Column(name="tn_tp_mmr")
	private String tnTpMmr;

	@Column(name="tp_p")
	private String tpP;

	@Column(name="tp_pm")
	private String tpPm;

	@Column(name="tp_s")
	private String tpS;

	@Column(name="tp_sp")
	private String tpSp;

	@Column(name="turb_m")
	private String turbM;

	@Column(name="turb_sc")
	private String turbSc;

	private String tvs;

	private String weather;

	@Column(name="wind_dir")
	private BigDecimal windDir;

	@Column(name="wind_sp")
	private BigDecimal windSp;

	public MtN() {
	}

	public BigDecimal getAirTemp() {
		return this.airTemp;
	}

	public void setAirTemp(BigDecimal airTemp) {
		this.airTemp = airTemp;
	}

	public String getBod5() {
		return this.bod5;
	}

	public void setBod5(String bod5) {
		this.bod5 = bod5;
	}

	public String getChl() {
		return this.chl;
	}

	public void setChl(String chl) {
		this.chl = chl;
	}

	public String getCond() {
		return this.cond;
	}

	public void setCond(String cond) {
		this.cond = cond;
	}

	public String getDCode() {
		return this.dCode;
	}

	public void setDCode(String dCode) {
		this.dCode = dCode;
	}

	public String getDo_() {
		return this.do_;
	}

	public void setDo_(String do_) {
		this.do_ = do_;
	}

	public String getDoSat() {
		return this.doSat;
	}

	public void setDoSat(String doSat) {
		this.doSat = doSat;
	}

	public String getEcoli() {
		return this.ecoli;
	}

	public void setEcoli(String ecoli) {
		this.ecoli = ecoli;
	}

	public String getFc() {
		return this.fc;
	}

	public void setFc(String fc) {
		this.fc = fc;
	}

	public String getFishKill() {
		return this.fishKill;
	}

	public void setFishKill(String fishKill) {
		this.fishKill = fishKill;
	}

	public String getFlscufa() {
		return this.flscufa;
	}

	public void setFlscufa(String flscufa) {
		this.flscufa = flscufa;
	}

	public String getLBod5() {
		return this.lBod5;
	}

	public void setLBod5(String lBod5) {
		this.lBod5 = lBod5;
	}

	public String getLChl() {
		return this.lChl;
	}

	public void setLChl(String lChl) {
		this.lChl = lChl;
	}

	public String getLEcoli() {
		return this.lEcoli;
	}

	public void setLEcoli(String lEcoli) {
		this.lEcoli = lEcoli;
	}

	public String getLFc() {
		return this.lFc;
	}

	public void setLFc(String lFc) {
		this.lFc = lFc;
	}

	public String getLNh4() {
		return this.lNh4;
	}

	public void setLNh4(String lNh4) {
		this.lNh4 = lNh4;
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

	public String getLPhM() {
		return this.lPhM;
	}

	public void setLPhM(String lPhM) {
		this.lPhM = lPhM;
	}

	public String getLPhae() {
		return this.lPhae;
	}

	public void setLPhae(String lPhae) {
		this.lPhae = lPhae;
	}

	public String getLPo4() {
		return this.lPo4;
	}

	public void setLPo4(String lPo4) {
		this.lPo4 = lPo4;
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

	public String getLTknP() {
		return this.lTknP;
	}

	public void setLTknP(String lTknP) {
		this.lTknP = lTknP;
	}

	public String getLTknS() {
		return this.lTknS;
	}

	public void setLTknS(String lTknS) {
		this.lTknS = lTknS;
	}

	public String getLTknSp() {
		return this.lTknSp;
	}

	public void setLTknSp(String lTknSp) {
		this.lTknSp = lTknSp;
	}

	public String getLTpP() {
		return this.lTpP;
	}

	public void setLTpP(String lTpP) {
		this.lTpP = lTpP;
	}

	public String getLTpS() {
		return this.lTpS;
	}

	public void setLTpS(String lTpS) {
		this.lTpS = lTpS;
	}

	public String getLTpSp() {
		return this.lTpSp;
	}

	public void setLTpSp(String lTpSp) {
		this.lTpSp = lTpSp;
	}

	public String getLTurbM() {
		return this.lTurbM;
	}

	public void setLTurbM(String lTurbM) {
		this.lTurbM = lTurbM;
	}

	public String getLTvs() {
		return this.lTvs;
	}

	public void setLTvs(String lTvs) {
		this.lTvs = lTvs;
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

	public String getNh3() {
		return this.nh3;
	}

	public void setNh3(String nh3) {
		this.nh3 = nh3;
	}

	public String getNh4() {
		return this.nh4;
	}

	public void setNh4(String nh4) {
		this.nh4 = nh4;
	}

	public String getNh4Nm() {
		return this.nh4Nm;
	}

	public void setNh4Nm(String nh4Nm) {
		this.nh4Nm = nh4Nm;
	}

	public String getNo2() {
		return this.no2;
	}

	public void setNo2(String no2) {
		this.no2 = no2;
	}

	public String getNo2Nm() {
		return this.no2Nm;
	}

	public void setNo2Nm(String no2Nm) {
		this.no2Nm = no2Nm;
	}

	public String getNo3() {
		return this.no3;
	}

	public void setNo3(String no3) {
		this.no3 = no3;
	}

	public String getNo3Nm() {
		return this.no3Nm;
	}

	public void setNo3Nm(String no3Nm) {
		this.no3Nm = no3Nm;
	}

	public String getNoxNm() {
		return this.noxNm;
	}

	public void setNoxNm(String noxNm) {
		this.noxNm = noxNm;
	}

	public String getPar() {
		return this.par;
	}

	public void setPar(String par) {
		this.par = par;
	}

	public String getPhM() {
		return this.phM;
	}

	public void setPhM(String phM) {
		this.phM = phM;
	}

	public String getPhSc() {
		return this.phSc;
	}

	public void setPhSc(String phSc) {
		this.phSc = phSc;
	}

	public String getPhae() {
		return this.phae;
	}

	public void setPhae(String phae) {
		this.phae = phae;
	}

	public String getPo4() {
		return this.po4;
	}

	public void setPo4(String po4) {
		this.po4 = po4;
	}

	public String getPo4Pm() {
		return this.po4Pm;
	}

	public void setPo4Pm(String po4Pm) {
		this.po4Pm = po4Pm;
	}

	public String getSal() {
		return this.sal;
	}

	public void setSal(String sal) {
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

	public String getSio2() {
		return this.sio2;
	}

	public void setSio2(String sio2) {
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

	public String getSs() {
		return this.ss;
	}

	public void setSs(String ss) {
		this.ss = ss;
	}

	public BigDecimal getStime() {
		return this.stime;
	}

	public void setStime(BigDecimal stime) {
		this.stime = stime;
	}

	public String getTemper() {
		return this.temper;
	}

	public void setTemper(String temper) {
		this.temper = temper;
	}

	public String getTin() {
		return this.tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
	}

	public String getTinNm() {
		return this.tinNm;
	}

	public void setTinNm(String tinNm) {
		this.tinNm = tinNm;
	}

	public String getTinPo4Mmr() {
		return this.tinPo4Mmr;
	}

	public void setTinPo4Mmr(String tinPo4Mmr) {
		this.tinPo4Mmr = tinPo4Mmr;
	}

	public String getTknNm() {
		return this.tknNm;
	}

	public void setTknNm(String tknNm) {
		this.tknNm = tknNm;
	}

	public String getTknP() {
		return this.tknP;
	}

	public void setTknP(String tknP) {
		this.tknP = tknP;
	}

	public String getTknS() {
		return this.tknS;
	}

	public void setTknS(String tknS) {
		this.tknS = tknS;
	}

	public String getTknSp() {
		return this.tknSp;
	}

	public void setTknSp(String tknSp) {
		this.tknSp = tknSp;
	}

	public String getTn() {
		return this.tn;
	}

	public void setTn(String tn) {
		this.tn = tn;
	}

	public String getTnNm() {
		return this.tnNm;
	}

	public void setTnNm(String tnNm) {
		this.tnNm = tnNm;
	}

	public String getTnTpMmr() {
		return this.tnTpMmr;
	}

	public void setTnTpMmr(String tnTpMmr) {
		this.tnTpMmr = tnTpMmr;
	}

	public String getTpP() {
		return this.tpP;
	}

	public void setTpP(String tpP) {
		this.tpP = tpP;
	}

	public String getTpPm() {
		return this.tpPm;
	}

	public void setTpPm(String tpPm) {
		this.tpPm = tpPm;
	}

	public String getTpS() {
		return this.tpS;
	}

	public void setTpS(String tpS) {
		this.tpS = tpS;
	}

	public String getTpSp() {
		return this.tpSp;
	}

	public void setTpSp(String tpSp) {
		this.tpSp = tpSp;
	}

	public String getTurbM() {
		return this.turbM;
	}

	public void setTurbM(String turbM) {
		this.turbM = turbM;
	}

	public String getTurbSc() {
		return this.turbSc;
	}

	public void setTurbSc(String turbSc) {
		this.turbSc = turbSc;
	}

	public String getTvs() {
		return this.tvs;
	}

	public void setTvs(String tvs) {
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