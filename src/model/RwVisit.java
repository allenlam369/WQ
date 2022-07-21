package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the rw_visit database table.
 * 
 */
@Entity
@Table(name="rw_visit")
@NamedQuery(name="RwVisit.findAll", query="SELECT r FROM RwVisit r")
public class RwVisit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="rwvisit_id")
	private String rwvisitId;

	private Timestamp mdate;

	@Column(name="sample_no")
	private Integer sampleNo;

	private BigDecimal stime;

	@Column(name="valid_code")
	private Integer validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	//bi-directional many-to-one association to Rstation
	@ManyToOne
	@JoinColumn(name="site_id")
	private Rstation rstation;

	public RwVisit() {
	}

	public String getRwvisitId() {
		return this.rwvisitId;
	}

	public void setRwvisitId(String rwvisitId) {
		this.rwvisitId = rwvisitId;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public Integer getSampleNo() {
		return this.sampleNo;
	}

	public void setSampleNo(Integer sampleNo) {
		this.sampleNo = sampleNo;
	}

	public BigDecimal getStime() {
		return this.stime;
	}

	public void setStime(BigDecimal stime) {
		this.stime = stime;
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

	public Rstation getRstation() {
		return this.rstation;
	}

	public void setRstation(Rstation rstation) {
		this.rstation = rstation;
	}

}