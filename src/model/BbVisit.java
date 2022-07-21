package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bb_visit database table.
 * 
 */
@Entity
@Table(name="bb_visit")
@NamedQuery(name="BbVisit.findAll", query="SELECT b FROM BbVisit b")
public class BbVisit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="bb_visit_id")
	private long bbVisitId;

	@Column(name="m_date")
	private Timestamp mDate;

	@Column(name="s_area")
	private String sArea;

	@Column(name="s_direction")
	private String sDirection;

	@Column(name="s_method")
	private String sMethod;

	@Column(name="s_time")
	private BigDecimal sTime;

	@Column(name="sample_no")
	private BigDecimal sampleNo;

	@Column(name="station_id")
	private String stationId;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public BbVisit() {
	}

	public long getBbVisitId() {
		return this.bbVisitId;
	}

	public void setBbVisitId(long bbVisitId) {
		this.bbVisitId = bbVisitId;
	}

	public Timestamp getMDate() {
		return this.mDate;
	}

	public void setMDate(Timestamp mDate) {
		this.mDate = mDate;
	}

	public String getSArea() {
		return this.sArea;
	}

	public void setSArea(String sArea) {
		this.sArea = sArea;
	}

	public String getSDirection() {
		return this.sDirection;
	}

	public void setSDirection(String sDirection) {
		this.sDirection = sDirection;
	}

	public String getSMethod() {
		return this.sMethod;
	}

	public void setSMethod(String sMethod) {
		this.sMethod = sMethod;
	}

	public BigDecimal getSTime() {
		return this.sTime;
	}

	public void setSTime(BigDecimal sTime) {
		this.sTime = sTime;
	}

	public BigDecimal getSampleNo() {
		return this.sampleNo;
	}

	public void setSampleNo(BigDecimal sampleNo) {
		this.sampleNo = sampleNo;
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