package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the hs_visit database table.
 * 
 */
@Entity
@Table(name="hs_visit")
@NamedQuery(name="HsVisit.findAll", query="SELECT h FROM HsVisit h")
public class HsVisit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mwvisit_id")
	private String mwvisitId;

	@Column(name="analysis_lab")
	private String analysisLab;

	private Timestamp mdate;

	@Column(name="monitor_state")
	private String monitorState;

	@Column(name="mwvisit_id_old")
	private String mwvisitIdOld;

	@Column(name="sample_no")
	private BigDecimal sampleNo;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="station_id")
	private BigDecimal stationId;

	private BigDecimal stime;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public HsVisit() {
	}

	public String getMwvisitId() {
		return this.mwvisitId;
	}

	public void setMwvisitId(String mwvisitId) {
		this.mwvisitId = mwvisitId;
	}

	public String getAnalysisLab() {
		return this.analysisLab;
	}

	public void setAnalysisLab(String analysisLab) {
		this.analysisLab = analysisLab;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public String getMonitorState() {
		return this.monitorState;
	}

	public void setMonitorState(String monitorState) {
		this.monitorState = monitorState;
	}

	public String getMwvisitIdOld() {
		return this.mwvisitIdOld;
	}

	public void setMwvisitIdOld(String mwvisitIdOld) {
		this.mwvisitIdOld = mwvisitIdOld;
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