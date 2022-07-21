package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the rw_nh3 database table.
 * 
 */
//@Entity
@Table(name="rw_nh3")
@NamedQuery(name="RwNh3.findAll", query="SELECT r FROM RwNh3 r")
public class RwNh3 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="l_nh3")
	private String lNh3;

	@Column(name="l_nh4")
	private String lNh4;

	@Column(name="l_ph")
	private String lPh;

	@Column(name="l_sal")
	private String lSal;

	private Timestamp mdate;

	private BigDecimal nh3;

	private BigDecimal nh4;

	private BigDecimal ph;

	@Column(name="rwvisit_id")
	private String rwvisitId;

	private BigDecimal sal;

	@Column(name="sample_no")
	private Integer sampleNo;

	@Column(name="site_id")
	private BigDecimal siteId;

	private BigDecimal stime;

	private BigDecimal temper;

	public RwNh3() {
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

	public String getLSal() {
		return this.lSal;
	}

	public void setLSal(String lSal) {
		this.lSal = lSal;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
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

	public String getRwvisitId() {
		return this.rwvisitId;
	}

	public void setRwvisitId(String rwvisitId) {
		this.rwvisitId = rwvisitId;
	}

	public BigDecimal getSal() {
		return this.sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
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

	public BigDecimal getTemper() {
		return this.temper;
	}

	public void setTemper(BigDecimal temper) {
		this.temper = temper;
	}

}