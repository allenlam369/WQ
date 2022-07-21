package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the rw_5ec database table.
 * 
 */
//@Entity
@Table(name="rw_5ec")
@NamedQuery(name="Rw5ec.findAll", query="SELECT r FROM Rw5ec r")
public class Rw5ec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ec_5gm")
	private BigDecimal ec5gm;

	@Column(name="ec_5md")
	private BigDecimal ec5md;

	private BigDecimal ec1;

	private BigDecimal ec2;

	private BigDecimal ec3;

	private BigDecimal ec4;

	private BigDecimal ec5;

	private Timestamp mdate;

	@Column(name="rwvisit_id")
	private String rwvisitId;

	@Column(name="sample_no")
	private Integer sampleNo;

	@Column(name="site_id")
	private BigDecimal siteId;

	public Rw5ec() {
	}

	public BigDecimal getEc5gm() {
		return this.ec5gm;
	}

	public void setEc5gm(BigDecimal ec5gm) {
		this.ec5gm = ec5gm;
	}

	public BigDecimal getEc5md() {
		return this.ec5md;
	}

	public void setEc5md(BigDecimal ec5md) {
		this.ec5md = ec5md;
	}

	public BigDecimal getEc1() {
		return this.ec1;
	}

	public void setEc1(BigDecimal ec1) {
		this.ec1 = ec1;
	}

	public BigDecimal getEc2() {
		return this.ec2;
	}

	public void setEc2(BigDecimal ec2) {
		this.ec2 = ec2;
	}

	public BigDecimal getEc3() {
		return this.ec3;
	}

	public void setEc3(BigDecimal ec3) {
		this.ec3 = ec3;
	}

	public BigDecimal getEc4() {
		return this.ec4;
	}

	public void setEc4(BigDecimal ec4) {
		this.ec4 = ec4;
	}

	public BigDecimal getEc5() {
		return this.ec5;
	}

	public void setEc5(BigDecimal ec5) {
		this.ec5 = ec5;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public String getRwvisitId() {
		return this.rwvisitId;
	}

	public void setRwvisitId(String rwvisitId) {
		this.rwvisitId = rwvisitId;
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

}