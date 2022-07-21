package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the sr_mw_statistics10a database table.
 * 
 */
//@Entity
@Table(name="sr_mw_statistics10a")
@NamedQuery(name="SrMwStatistics10a.findAll", query="SELECT s FROM SrMwStatistics10a s")
public class SrMwStatistics10a implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="air_temp")
	private double airTemp;

	private double bod5;

	private double chl;

	private double cond;

	@Column(name="d_code")
	private String dCode;

	@Column(name="delete_date")
	private Timestamp deleteDate;

	@Column(name="delete_user")
	private String deleteUser;

	@Column(name="disp_seq")
	private Integer dispSeq;

	@Column(name="disp_stats")
	private String dispStats;

	@Column(name="\"DO\"")
	private double do_;

	@Column(name="do_sat")
	private double doSat;

	private double ecoli;

	private double fc;

	private double flscufa;

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

	private double nh3;

	private double nh4;

	@Column(name="nh4_nm")
	private double nh4Nm;

	private double no2;

	@Column(name="no2_nm")
	private double no2Nm;

	private double no3;

	@Column(name="no3_nm")
	private double no3Nm;

	@Column(name="nox_nm")
	private double noxNm;

	private double par;

	@Column(name="ph_m")
	private double phM;

	@Column(name="ph_sc")
	private double phSc;

	private double phae;

	private double po4;

	@Column(name="po4_pm")
	private double po4Pm;

	private double sal;

	private double sd;

	private double sio2;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="sol_rad")
	private double solRad;

	private double ss;

	private double temper;

	private double tin;

	@Column(name="tin_nm")
	private double tinNm;

	@Column(name="tin_po4_mmr")
	private double tinPo4Mmr;

	@Column(name="tkn_nm")
	private double tknNm;

	@Column(name="tkn_p")
	private double tknP;

	@Column(name="tkn_s")
	private double tknS;

	@Column(name="tkn_sp")
	private double tknSp;

	private double tn;

	@Column(name="tn_nm")
	private double tnNm;

	@Column(name="tn_tp_mmr")
	private double tnTpMmr;

	private Integer total;

	@Column(name="tp_p")
	private double tpP;

	@Column(name="tp_pm")
	private double tpPm;

	@Column(name="tp_s")
	private double tpS;

	@Column(name="tp_sp")
	private double tpSp;

	@Column(name="turb_m")
	private double turbM;

	@Column(name="turb_sc")
	private double turbSc;

	private double tvs;

	@Column(name="wind_sp")
	private double windSp;

	private Integer yr;

	public SrMwStatistics10a() {
	}

	public double getAirTemp() {
		return this.airTemp;
	}

	public void setAirTemp(double airTemp) {
		this.airTemp = airTemp;
	}

	public double getBod5() {
		return this.bod5;
	}

	public void setBod5(double bod5) {
		this.bod5 = bod5;
	}

	public double getChl() {
		return this.chl;
	}

	public void setChl(double chl) {
		this.chl = chl;
	}

	public double getCond() {
		return this.cond;
	}

	public void setCond(double cond) {
		this.cond = cond;
	}

	public String getDCode() {
		return this.dCode;
	}

	public void setDCode(String dCode) {
		this.dCode = dCode;
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

	public Integer getDispSeq() {
		return this.dispSeq;
	}

	public void setDispSeq(Integer dispSeq) {
		this.dispSeq = dispSeq;
	}

	public String getDispStats() {
		return this.dispStats;
	}

	public void setDispStats(String dispStats) {
		this.dispStats = dispStats;
	}

	public double getDo_() {
		return this.do_;
	}

	public void setDo_(double do_) {
		this.do_ = do_;
	}

	public double getDoSat() {
		return this.doSat;
	}

	public void setDoSat(double doSat) {
		this.doSat = doSat;
	}

	public double getEcoli() {
		return this.ecoli;
	}

	public void setEcoli(double ecoli) {
		this.ecoli = ecoli;
	}

	public double getFc() {
		return this.fc;
	}

	public void setFc(double fc) {
		this.fc = fc;
	}

	public double getFlscufa() {
		return this.flscufa;
	}

	public void setFlscufa(double flscufa) {
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

	public double getNh3() {
		return this.nh3;
	}

	public void setNh3(double nh3) {
		this.nh3 = nh3;
	}

	public double getNh4() {
		return this.nh4;
	}

	public void setNh4(double nh4) {
		this.nh4 = nh4;
	}

	public double getNh4Nm() {
		return this.nh4Nm;
	}

	public void setNh4Nm(double nh4Nm) {
		this.nh4Nm = nh4Nm;
	}

	public double getNo2() {
		return this.no2;
	}

	public void setNo2(double no2) {
		this.no2 = no2;
	}

	public double getNo2Nm() {
		return this.no2Nm;
	}

	public void setNo2Nm(double no2Nm) {
		this.no2Nm = no2Nm;
	}

	public double getNo3() {
		return this.no3;
	}

	public void setNo3(double no3) {
		this.no3 = no3;
	}

	public double getNo3Nm() {
		return this.no3Nm;
	}

	public void setNo3Nm(double no3Nm) {
		this.no3Nm = no3Nm;
	}

	public double getNoxNm() {
		return this.noxNm;
	}

	public void setNoxNm(double noxNm) {
		this.noxNm = noxNm;
	}

	public double getPar() {
		return this.par;
	}

	public void setPar(double par) {
		this.par = par;
	}

	public double getPhM() {
		return this.phM;
	}

	public void setPhM(double phM) {
		this.phM = phM;
	}

	public double getPhSc() {
		return this.phSc;
	}

	public void setPhSc(double phSc) {
		this.phSc = phSc;
	}

	public double getPhae() {
		return this.phae;
	}

	public void setPhae(double phae) {
		this.phae = phae;
	}

	public double getPo4() {
		return this.po4;
	}

	public void setPo4(double po4) {
		this.po4 = po4;
	}

	public double getPo4Pm() {
		return this.po4Pm;
	}

	public void setPo4Pm(double po4Pm) {
		this.po4Pm = po4Pm;
	}

	public double getSal() {
		return this.sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getSd() {
		return this.sd;
	}

	public void setSd(double sd) {
		this.sd = sd;
	}

	public double getSio2() {
		return this.sio2;
	}

	public void setSio2(double sio2) {
		this.sio2 = sio2;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public double getSolRad() {
		return this.solRad;
	}

	public void setSolRad(double solRad) {
		this.solRad = solRad;
	}

	public double getSs() {
		return this.ss;
	}

	public void setSs(double ss) {
		this.ss = ss;
	}

	public double getTemper() {
		return this.temper;
	}

	public void setTemper(double temper) {
		this.temper = temper;
	}

	public double getTin() {
		return this.tin;
	}

	public void setTin(double tin) {
		this.tin = tin;
	}

	public double getTinNm() {
		return this.tinNm;
	}

	public void setTinNm(double tinNm) {
		this.tinNm = tinNm;
	}

	public double getTinPo4Mmr() {
		return this.tinPo4Mmr;
	}

	public void setTinPo4Mmr(double tinPo4Mmr) {
		this.tinPo4Mmr = tinPo4Mmr;
	}

	public double getTknNm() {
		return this.tknNm;
	}

	public void setTknNm(double tknNm) {
		this.tknNm = tknNm;
	}

	public double getTknP() {
		return this.tknP;
	}

	public void setTknP(double tknP) {
		this.tknP = tknP;
	}

	public double getTknS() {
		return this.tknS;
	}

	public void setTknS(double tknS) {
		this.tknS = tknS;
	}

	public double getTknSp() {
		return this.tknSp;
	}

	public void setTknSp(double tknSp) {
		this.tknSp = tknSp;
	}

	public double getTn() {
		return this.tn;
	}

	public void setTn(double tn) {
		this.tn = tn;
	}

	public double getTnNm() {
		return this.tnNm;
	}

	public void setTnNm(double tnNm) {
		this.tnNm = tnNm;
	}

	public double getTnTpMmr() {
		return this.tnTpMmr;
	}

	public void setTnTpMmr(double tnTpMmr) {
		this.tnTpMmr = tnTpMmr;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public double getTpP() {
		return this.tpP;
	}

	public void setTpP(double tpP) {
		this.tpP = tpP;
	}

	public double getTpPm() {
		return this.tpPm;
	}

	public void setTpPm(double tpPm) {
		this.tpPm = tpPm;
	}

	public double getTpS() {
		return this.tpS;
	}

	public void setTpS(double tpS) {
		this.tpS = tpS;
	}

	public double getTpSp() {
		return this.tpSp;
	}

	public void setTpSp(double tpSp) {
		this.tpSp = tpSp;
	}

	public double getTurbM() {
		return this.turbM;
	}

	public void setTurbM(double turbM) {
		this.turbM = turbM;
	}

	public double getTurbSc() {
		return this.turbSc;
	}

	public void setTurbSc(double turbSc) {
		this.turbSc = turbSc;
	}

	public double getTvs() {
		return this.tvs;
	}

	public void setTvs(double tvs) {
		this.tvs = tvs;
	}

	public double getWindSp() {
		return this.windSp;
	}

	public void setWindSp(double windSp) {
		this.windSp = windSp;
	}

	public Integer getYr() {
		return this.yr;
	}

	public void setYr(Integer yr) {
		this.yr = yr;
	}

}