package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the sr_mw_alert1 database table.
 * 
 */
//@Entity
@Table(name="sr_mw_alert1")
@NamedQuery(name="SrMwAlert1.findAll", query="SELECT s FROM SrMwAlert1 s")
public class SrMwAlert1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="d_code")
	private String dCode;

	@Column(name="delete_date")
	private Timestamp deleteDate;

	@Column(name="delete_user")
	private String deleteUser;

	@Column(name="disp_seq")
	private Integer dispSeq;

	@Column(name="disp_stats")
	private String dispStats;

	@Column(name="\"LIMIT\"")
	private double limit;

	private Timestamp mdate;

	private double measure;

	@Column(name="mwvisit_id")
	private String mwvisitId;

	private String parameter;

	@Column(name="sam_no")
	private BigDecimal samNo;

	@Column(name="site_id")
	private BigDecimal siteId;

	private BigDecimal stime;

	private Integer total;

	private Integer yr;

	public SrMwAlert1() {
	}

	public String getDCode() {
		return this.dCode;
	}

	public void setDCode(String dCode) {
		this.dCode = dCode;
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

	public double getMeasure() {
		return this.measure;
	}

	public void setMeasure(double measure) {
		this.measure = measure;
	}

	public String getMwvisitId() {
		return this.mwvisitId;
	}

	public void setMwvisitId(String mwvisitId) {
		this.mwvisitId = mwvisitId;
	}

	public String getParameter() {
		return this.parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public BigDecimal getSamNo() {
		return this.samNo;
	}

	public void setSamNo(BigDecimal samNo) {
		this.samNo = samNo;
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

	public Integer getYr() {
		return this.yr;
	}

	public void setYr(Integer yr) {
		this.yr = yr;
	}

}