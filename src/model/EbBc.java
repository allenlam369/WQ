package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the eb_bc database table.
 * 
 */
@Entity
@Table(name="eb_bc")
@NamedQuery(name="EbBc.findAll", query="SELECT e FROM EbBc e")
public class EbBc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="eb_visit_id")
	private String ebVisitId;

	@Column(name="bio_vol")
	private BigDecimal bioVol;

	private BigDecimal density;

	@Column(name="m_date")
	private Timestamp mDate;

	@Column(name="s_time")
	private BigDecimal sTime;

	@Column(name="sample_no")
	private BigDecimal sampleNo;

	private String scan;

	@Column(name="sp_name")
	private String spName;

	@Column(name="station_id")
	private String stationId;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public EbBc() {
	}

	public String getEbVisitId() {
		return this.ebVisitId;
	}

	public void setEbVisitId(String ebVisitId) {
		this.ebVisitId = ebVisitId;
	}

	public BigDecimal getBioVol() {
		return this.bioVol;
	}

	public void setBioVol(BigDecimal bioVol) {
		this.bioVol = bioVol;
	}

	public BigDecimal getDensity() {
		return this.density;
	}

	public void setDensity(BigDecimal density) {
		this.density = density;
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

	public BigDecimal getSampleNo() {
		return this.sampleNo;
	}

	public void setSampleNo(BigDecimal sampleNo) {
		this.sampleNo = sampleNo;
	}

	public String getScan() {
		return this.scan;
	}

	public void setScan(String scan) {
		this.scan = scan;
	}

	public String getSpName() {
		return this.spName;
	}

	public void setSpName(String spName) {
		this.spName = spName;
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