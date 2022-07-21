package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bt_visit database table.
 * 
 */
@Entity
@Table(name="bt_visit")
@NamedQuery(name="BtVisit.findAll", query="SELECT b FROM BtVisit b")
public class BtVisit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="bt_visit_id")
	private String btVisitId;

	@Column(name="m_date")
	private Timestamp mDate;

	@Column(name="s_time")
	private BigDecimal sTime;

	private String sampling;

	@Column(name="station_id")
	private String stationId;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public BtVisit() {
	}

	public String getBtVisitId() {
		return this.btVisitId;
	}

	public void setBtVisitId(String btVisitId) {
		this.btVisitId = btVisitId;
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

	public String getSampling() {
		return this.sampling;
	}

	public void setSampling(String sampling) {
		this.sampling = sampling;
	}

	public String getStationId() {
		return this.stationId;
	}

	public void setStationId(String stationId) {
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