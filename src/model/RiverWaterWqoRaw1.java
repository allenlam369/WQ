package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the river_water_wqo_raw1 database table.
 * 
 */
//@Entity
@Table(name="river_water_wqo_raw1")
@NamedQuery(name="RiverWaterWqoRaw1.findAll", query="SELECT r FROM RiverWaterWqoRaw1 r")
public class RiverWaterWqoRaw1 implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal bod5;

	private BigDecimal cod;

	@Column(name="\"DO\"")
	private BigDecimal do_;

	@Column(name="l_bod5")
	private String lBod5;

	@Column(name="l_cod")
	private String lCod;

	@Column(name="l_do")
	private String lDo;

	@Column(name="l_nh3")
	private String lNh3;

	@Column(name="l_nh4")
	private String lNh4;

	@Column(name="l_ph")
	private String lPh;

	@Column(name="l_ss")
	private String lSs;

	@Column(name="max_aam_nh3")
	private BigDecimal maxAamNh3;

	@Column(name="max_amd_ss")
	private BigDecimal maxAmdSs;

	@Column(name="max_bod5")
	private BigDecimal maxBod5;

	@Column(name="max_cod")
	private BigDecimal maxCod;

	@Column(name="max_nh4")
	private BigDecimal maxNh4;

	@Column(name="max_ph")
	private BigDecimal maxPh;

	private Timestamp mdate;

	@Column(name="meet_bod5")
	private Integer meetBod5;

	@Column(name="meet_cod")
	private Integer meetCod;

	@Column(name="meet_do")
	private Integer meetDo;

	@Column(name="meet_nh4")
	private Integer meetNh4;

	@Column(name="meet_ph")
	private Integer meetPh;

	@Column(name="min_do")
	private BigDecimal minDo;

	@Column(name="min_ph")
	private BigDecimal minPh;

	private BigDecimal nh3;

	private BigDecimal nh4;

	private BigDecimal ph;

	private String river;

	@Column(name="sample_no")
	private Integer sampleNo;

	private BigDecimal ss;

	private String station;

	private BigDecimal stime;

	private String subzone;

	private String wcz;

	private String zone;

	public RiverWaterWqoRaw1() {
	}

	public BigDecimal getBod5() {
		return this.bod5;
	}

	public void setBod5(BigDecimal bod5) {
		this.bod5 = bod5;
	}

	public BigDecimal getCod() {
		return this.cod;
	}

	public void setCod(BigDecimal cod) {
		this.cod = cod;
	}

	public BigDecimal getDo_() {
		return this.do_;
	}

	public void setDo_(BigDecimal do_) {
		this.do_ = do_;
	}

	public String getLBod5() {
		return this.lBod5;
	}

	public void setLBod5(String lBod5) {
		this.lBod5 = lBod5;
	}

	public String getLCod() {
		return this.lCod;
	}

	public void setLCod(String lCod) {
		this.lCod = lCod;
	}

	public String getLDo() {
		return this.lDo;
	}

	public void setLDo(String lDo) {
		this.lDo = lDo;
	}

	public String getLNh3() {
		return this.lNh3;
	}

	public void setLNh3(String lNh3) {
		this.lNh3 = lNh3;
	}

	public String getLNh4() {
		return this.lNh4;
	}

	public void setLNh4(String lNh4) {
		this.lNh4 = lNh4;
	}

	public String getLPh() {
		return this.lPh;
	}

	public void setLPh(String lPh) {
		this.lPh = lPh;
	}

	public String getLSs() {
		return this.lSs;
	}

	public void setLSs(String lSs) {
		this.lSs = lSs;
	}

	public BigDecimal getMaxAamNh3() {
		return this.maxAamNh3;
	}

	public void setMaxAamNh3(BigDecimal maxAamNh3) {
		this.maxAamNh3 = maxAamNh3;
	}

	public BigDecimal getMaxAmdSs() {
		return this.maxAmdSs;
	}

	public void setMaxAmdSs(BigDecimal maxAmdSs) {
		this.maxAmdSs = maxAmdSs;
	}

	public BigDecimal getMaxBod5() {
		return this.maxBod5;
	}

	public void setMaxBod5(BigDecimal maxBod5) {
		this.maxBod5 = maxBod5;
	}

	public BigDecimal getMaxCod() {
		return this.maxCod;
	}

	public void setMaxCod(BigDecimal maxCod) {
		this.maxCod = maxCod;
	}

	public BigDecimal getMaxNh4() {
		return this.maxNh4;
	}

	public void setMaxNh4(BigDecimal maxNh4) {
		this.maxNh4 = maxNh4;
	}

	public BigDecimal getMaxPh() {
		return this.maxPh;
	}

	public void setMaxPh(BigDecimal maxPh) {
		this.maxPh = maxPh;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public Integer getMeetBod5() {
		return this.meetBod5;
	}

	public void setMeetBod5(Integer meetBod5) {
		this.meetBod5 = meetBod5;
	}

	public Integer getMeetCod() {
		return this.meetCod;
	}

	public void setMeetCod(Integer meetCod) {
		this.meetCod = meetCod;
	}

	public Integer getMeetDo() {
		return this.meetDo;
	}

	public void setMeetDo(Integer meetDo) {
		this.meetDo = meetDo;
	}

	public Integer getMeetNh4() {
		return this.meetNh4;
	}

	public void setMeetNh4(Integer meetNh4) {
		this.meetNh4 = meetNh4;
	}

	public Integer getMeetPh() {
		return this.meetPh;
	}

	public void setMeetPh(Integer meetPh) {
		this.meetPh = meetPh;
	}

	public BigDecimal getMinDo() {
		return this.minDo;
	}

	public void setMinDo(BigDecimal minDo) {
		this.minDo = minDo;
	}

	public BigDecimal getMinPh() {
		return this.minPh;
	}

	public void setMinPh(BigDecimal minPh) {
		this.minPh = minPh;
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

	public BigDecimal getPh() {
		return this.ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public String getRiver() {
		return this.river;
	}

	public void setRiver(String river) {
		this.river = river;
	}

	public Integer getSampleNo() {
		return this.sampleNo;
	}

	public void setSampleNo(Integer sampleNo) {
		this.sampleNo = sampleNo;
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

	public BigDecimal getStime() {
		return this.stime;
	}

	public void setStime(BigDecimal stime) {
		this.stime = stime;
	}

	public String getSubzone() {
		return this.subzone;
	}

	public void setSubzone(String subzone) {
		this.subzone = subzone;
	}

	public String getWcz() {
		return this.wcz;
	}

	public void setWcz(String wcz) {
		this.wcz = wcz;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}