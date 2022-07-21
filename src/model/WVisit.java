package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the w_visit database table.
 * 
 */
@Entity
@Table(name="w_visit")
@NamedQuery(name="WVisit.findAll", query="SELECT w FROM WVisit w")
public class WVisit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="w_visit_id")
	private long wVisitId;

	@Column(name="m_date")
	private Timestamp mDate;

	@Column(name="s_time")
	private BigDecimal sTime;

	private String samples;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	//bi-directional many-to-one association to WStation
	@ManyToOne
	@JoinColumn(name="station_id")
	private WStation WStation;

	public WVisit() {
	}

	public long getWVisitId() {
		return this.wVisitId;
	}

	public void setWVisitId(long wVisitId) {
		this.wVisitId = wVisitId;
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

	public String getSamples() {
		return this.samples;
	}

	public void setSamples(String samples) {
		this.samples = samples;
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

	public WStation getWStation() {
		return this.WStation;
	}

	public void setWStation(WStation WStation) {
		this.WStation = WStation;
	}

}