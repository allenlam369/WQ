package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the mt_visit database table.
 * 
 */
@Entity
@Table(name="mt_visit")
@NamedQuery(name="MtVisit.findAll", query="SELECT m FROM MtVisit m")
public class MtVisit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mwvisit_id")
	private String mwvisitId;

	private Timestamp mdate;

	@Column(name="mwvisit_id_old")
	private String mwvisitIdOld;

	@Column(name="sample_no")
	private BigDecimal sampleNo;

	@Column(name="station_id")
	private BigDecimal stationId;

	private BigDecimal stime;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	//bi-directional many-to-one association to Mstation
	@ManyToOne
	@JoinColumn(name="site_id")
	private Mstation mstation;

	public MtVisit() {
	}

	public String getMwvisitId() {
		return this.mwvisitId;
	}

	public void setMwvisitId(String mwvisitId) {
		this.mwvisitId = mwvisitId;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
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

	public Mstation getMstation() {
		return this.mstation;
	}

	public void setMstation(Mstation mstation) {
		this.mstation = mstation;
	}

}