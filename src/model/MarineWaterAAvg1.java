package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the marine_water_a_avg1 database table.
 * 
 */
//@Entity
@Table(name="marine_water_a_avg1")
@NamedQuery(name="MarineWaterAAvg1.findAll", query="SELECT m FROM MarineWaterAAvg1 m")
public class MarineWaterAAvg1 implements Serializable {
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

	private BigDecimal flscufa;

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

	private BigDecimal sd;

	private BigDecimal sio2;

	@Column(name="sol_rad")
	private BigDecimal solRad;

	private BigDecimal ss;

	private String station;

	private String subzone;

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

	private Long total;

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

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	@Column(name="wind_sp")
	private BigDecimal windSp;

	private double yr;

	private String zone;

	public MarineWaterAAvg1() {
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

	public BigDecimal getFlscufa() {
		return this.flscufa;
	}

	public void setFlscufa(BigDecimal flscufa) {
		this.flscufa = flscufa;
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

	public BigDecimal getSd() {
		return this.sd;
	}

	public void setSd(BigDecimal sd) {
		this.sd = sd;
	}

	public BigDecimal getSio2() {
		return this.sio2;
	}

	public void setSio2(BigDecimal sio2) {
		this.sio2 = sio2;
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

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getSubzone() {
		return this.subzone;
	}

	public void setSubzone(String subzone) {
		this.subzone = subzone;
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

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
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

	public BigDecimal getWindSp() {
		return this.windSp;
	}

	public void setWindSp(BigDecimal windSp) {
		this.windSp = windSp;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}