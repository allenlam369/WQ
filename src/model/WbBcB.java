package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the wb_bc_b database table.
 * 
 */
//@Entity
@Table(name="wb_bc_b")
@NamedQuery(name="WbBcB.findAll", query="SELECT w FROM WbBcB w")
public class WbBcB implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal abundance;

	@Column(name="m_date")
	private Timestamp mDate;

	@Column(name="s_time")
	private BigDecimal sTime;

	private String sample;

	@Column(name="sp_name")
	private String spName;

	@Column(name="station_id")
	private String stationId;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	@Column(name="wb_visit_id")
	private String wbVisitId;

	private BigDecimal weight;

	public WbBcB() {
	}

	public BigDecimal getAbundance() {
		return this.abundance;
	}

	public void setAbundance(BigDecimal abundance) {
		this.abundance = abundance;
	}

	public Timestamp getMDate() {
		return this.mDate;
	}

	public void setMDate(Timestamp mDate) {
		this.mDate = mDate;
	}

	public BigDecimal getSTime() {
		return this.sTime;
	}

	public void setSTime(BigDecimal sTime) {
		this.sTime = sTime;
	}

	public String getSample() {
		return this.sample;
	}

	public void setSample(String sample) {
		this.sample = sample;
	}

	public String getSpName() {
		return this.spName;
	}

	public void setSpName(String spName) {
		this.spName = spName;
	}

	public String getStationId() {
		return this.stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
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

	public String getWbVisitId() {
		return this.wbVisitId;
	}

	public void setWbVisitId(String wbVisitId) {
		this.wbVisitId = wbVisitId;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

}