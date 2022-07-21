package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ts_visit database table.
 * 
 */
@Entity
@Table(name="ts_visit")
@NamedQuery(name="TsVisit.findAll", query="SELECT t FROM TsVisit t")
public class TsVisit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tsvisit_id")
	private String tsvisitId;

	private Timestamp mdate;

	@Column(name="sample_no")
	private BigDecimal sampleNo;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="station_id")
	private BigDecimal stationId;

	private BigDecimal stime;

	@Column(name="tsvisit_id_old")
	private String tsvisitIdOld;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public TsVisit() {
	}

	public String getTsvisitId() {
		return this.tsvisitId;
	}

	public void setTsvisitId(String tsvisitId) {
		this.tsvisitId = tsvisitId;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
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

	public BigDecimal getStime() {
		return this.stime;
	}

	public void setStime(BigDecimal stime) {
		this.stime = stime;
	}

	public String getTsvisitIdOld() {
		return this.tsvisitIdOld;
	}

	public void setTsvisitIdOld(String tsvisitIdOld) {
		this.tsvisitIdOld = tsvisitIdOld;
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