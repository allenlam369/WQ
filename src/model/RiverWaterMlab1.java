package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the river_water_mlab1 database table.
 * 
 */
//@Entity
@Table(name="river_water_mlab1")
@NamedQuery(name="RiverWaterMlab1.findAll", query="SELECT r FROM RiverWaterMlab1 r")
public class RiverWaterMlab1 implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal bod5;

	private BigDecimal ec;

	private BigDecimal fc;

	@Column(name="l_bod5")
	private String lBod5;

	@Column(name="l_ec")
	private String lEc;

	@Column(name="l_fc")
	private String lFc;

	private Timestamp mdate;

	private String river;

	@Column(name="sample_no")
	private Integer sampleNo;

	private String station;

	private BigDecimal stime;

	private String subzone;

	@Column(name="valid_code")
	private Integer validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	private String zone;

	public RiverWaterMlab1() {
	}

	public BigDecimal getBod5() {
		return this.bod5;
	}

	public void setBod5(BigDecimal bod5) {
		this.bod5 = bod5;
	}

	public BigDecimal getEc() {
		return this.ec;
	}

	public void setEc(BigDecimal ec) {
		this.ec = ec;
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

	public String getLEc() {
		return this.lEc;
	}

	public void setLEc(String lEc) {
		this.lEc = lEc;
	}

	public String getLFc() {
		return this.lFc;
	}

	public void setLFc(String lFc) {
		this.lFc = lFc;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
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

	public Integer getValidCode() {
		return this.validCode;
	}

	public void setValidCode(Integer validCode) {
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