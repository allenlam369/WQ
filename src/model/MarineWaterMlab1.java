package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the marine_water_mlab1 database table.
 * 
 */
//@Entity
@Table(name="marine_water_mlab1")
@NamedQuery(name="MarineWaterMlab1.findAll", query="SELECT m FROM MarineWaterMlab1 m")
public class MarineWaterMlab1 implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal bod5;

	@Column(name="depth_code")
	private String depthCode;

	private BigDecimal ecoli;

	private BigDecimal fc;

	@Column(name="l_bod5")
	private String lBod5;

	@Column(name="l_ecoli")
	private String lEcoli;

	@Column(name="l_fc")
	private String lFc;

	@Column(name="l_ph_m")
	private String lPhM;

	@Column(name="l_turb_m")
	private String lTurbM;

	private Timestamp mdate;

	@Column(name="ph_m")
	private BigDecimal phM;

	@Column(name="sam_no")
	private BigDecimal samNo;

	private String station;

	private BigDecimal stime;

	private String subzone;

	@Column(name="turb_m")
	private BigDecimal turbM;

	private String wcz;

	private String zone;

	public MarineWaterMlab1() {
	}

	public BigDecimal getBod5() {
		return this.bod5;
	}

	public void setBod5(BigDecimal bod5) {
		this.bod5 = bod5;
	}

	public String getDepthCode() {
		return this.depthCode;
	}

	public void setDepthCode(String depthCode) {
		this.depthCode = depthCode;
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

	public String getLBod5() {
		return this.lBod5;
	}

	public void setLBod5(String lBod5) {
		this.lBod5 = lBod5;
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

	public String getLPhM() {
		return this.lPhM;
	}

	public void setLPhM(String lPhM) {
		this.lPhM = lPhM;
	}

	public String getLTurbM() {
		return this.lTurbM;
	}

	public void setLTurbM(String lTurbM) {
		this.lTurbM = lTurbM;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getPhM() {
		return this.phM;
	}

	public void setPhM(BigDecimal phM) {
		this.phM = phM;
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

	public BigDecimal getTurbM() {
		return this.turbM;
	}

	public void setTurbM(BigDecimal turbM) {
		this.turbM = turbM;
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