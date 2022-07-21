package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the marine_water_seacat1 database table.
 * 
 */
//@Entity
@Table(name="marine_water_seacat1")
@NamedQuery(name="MarineWaterSeacat1.findAll", query="SELECT m FROM MarineWaterSeacat1 m")
public class MarineWaterSeacat1 implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal cond;

	private BigDecimal depth;

	@Column(name="depth_code")
	private String depthCode;

	@Column(name="\"DO\"")
	private BigDecimal do_;

	@Column(name="do_sat")
	private BigDecimal doSat;

	private BigDecimal flscufa;

	private Timestamp mdate;

	private BigDecimal par;

	@Column(name="ph_sc")
	private BigDecimal phSc;

	private BigDecimal sal;

	@Column(name="sam_no")
	private BigDecimal samNo;

	private String station;

	private BigDecimal stime;

	private String subzone;

	private BigDecimal temper;

	@Column(name="turb_sc")
	private BigDecimal turbSc;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	private String zone;

	public MarineWaterSeacat1() {
	}

	public BigDecimal getCond() {
		return this.cond;
	}

	public void setCond(BigDecimal cond) {
		this.cond = cond;
	}

	public BigDecimal getDepth() {
		return this.depth;
	}

	public void setDepth(BigDecimal depth) {
		this.depth = depth;
	}

	public String getDepthCode() {
		return this.depthCode;
	}

	public void setDepthCode(String depthCode) {
		this.depthCode = depthCode;
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

	public BigDecimal getPar() {
		return this.par;
	}

	public void setPar(BigDecimal par) {
		this.par = par;
	}

	public BigDecimal getPhSc() {
		return this.phSc;
	}

	public void setPhSc(BigDecimal phSc) {
		this.phSc = phSc;
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

	public BigDecimal getTemper() {
		return this.temper;
	}

	public void setTemper(BigDecimal temper) {
		this.temper = temper;
	}

	public BigDecimal getTurbSc() {
		return this.turbSc;
	}

	public void setTurbSc(BigDecimal turbSc) {
		this.turbSc = turbSc;
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

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}