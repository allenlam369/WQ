package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the sr_rs_visit database table.
 * 
 */
//@Entity
@Table(name="sr_rs_visit")
@NamedQuery(name="SrRsVisit.findAll", query="SELECT s FROM SrRsVisit s")
public class SrRsVisit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="delete_date")
	private Timestamp deleteDate;

	@Column(name="delete_user")
	private String deleteUser;

	private Timestamp mdate;

	@Column(name="rsvisit_id")
	private String rsvisitId;

	@Column(name="rsvisit_id_old")
	private String rsvisitIdOld;

	@Column(name="sample_no")
	private BigDecimal sampleNo;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="station_id")
	private BigDecimal stationId;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public SrRsVisit() {
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

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public String getRsvisitId() {
		return this.rsvisitId;
	}

	public void setRsvisitId(String rsvisitId) {
		this.rsvisitId = rsvisitId;
	}

	public String getRsvisitIdOld() {
		return this.rsvisitIdOld;
	}

	public void setRsvisitIdOld(String rsvisitIdOld) {
		this.rsvisitIdOld = rsvisitIdOld;
	}

	public BigDecimal getSampleNo() {
		return this.sampleNo;
	}

	public void setSampleNo(BigDecimal sampleNo) {
		this.sampleNo = sampleNo;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getStationId() {
		return this.stationId;
	}

	public void setStationId(BigDecimal stationId) {
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

}