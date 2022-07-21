package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the rw_alert_a1 database table.
 * 
 */
//@Entity
@Table(name="rw_alert_a1")
@NamedQuery(name="RwAlertA1.findAll", query="SELECT r FROM RwAlertA1 r")
public class RwAlertA1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="date_received")
	private Timestamp dateReceived;

	@Column(name="date_reported")
	private Timestamp dateReported;

	@Column(name="disp_seq")
	private Integer dispSeq;

	@Column(name="disp_stats")
	private String dispStats;

	@Column(name="l_measure")
	private String lMeasure;

	@Column(name="lab_no")
	private String labNo;

	@Column(name="\"LIMIT\"")
	private double limit;

	private Timestamp mdate;

	private BigDecimal measure;

	private String parameter;

	@Column(name="rwvisit_id")
	private String rwvisitId;

	@Column(name="sample_mark")
	private String sampleMark;

	@Column(name="sample_no")
	private Integer sampleNo;

	@Column(name="site_id")
	private BigDecimal siteId;

	private BigDecimal stime;

	private Integer total;

	@Column(name="valid_code")
	private Integer validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	private Integer yr;

	public RwAlertA1() {
	}

	public Timestamp getDateReceived() {
		return this.dateReceived;
	}

	public void setDateReceived(Timestamp dateReceived) {
		this.dateReceived = dateReceived;
	}

	public Timestamp getDateReported() {
		return this.dateReported;
	}

	public void setDateReported(Timestamp dateReported) {
		this.dateReported = dateReported;
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

	public String getLMeasure() {
		return this.lMeasure;
	}

	public void setLMeasure(String lMeasure) {
		this.lMeasure = lMeasure;
	}

	public String getLabNo() {
		return this.labNo;
	}

	public void setLabNo(String labNo) {
		this.labNo = labNo;
	}

	public double getLimit() {
		return this.limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getMeasure() {
		return this.measure;
	}

	public void setMeasure(BigDecimal measure) {
		this.measure = measure;
	}

	public String getParameter() {
		return this.parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public String getRwvisitId() {
		return this.rwvisitId;
	}

	public void setRwvisitId(String rwvisitId) {
		this.rwvisitId = rwvisitId;
	}

	public String getSampleMark() {
		return this.sampleMark;
	}

	public void setSampleMark(String sampleMark) {
		this.sampleMark = sampleMark;
	}

	public Integer getSampleNo() {
		return this.sampleNo;
	}

	public void setSampleNo(Integer sampleNo) {
		this.sampleNo = sampleNo;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getStime() {
		return this.stime;
	}

	public void setStime(BigDecimal stime) {
		this.stime = stime;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
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

	public Integer getYr() {
		return this.yr;
	}

	public void setYr(Integer yr) {
		this.yr = yr;
	}

}