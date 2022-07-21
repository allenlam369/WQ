package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_visit_data_c database table.
 * 
 */
//@Entity
@Table(name="bm_visit_data_c")
@NamedQuery(name="BmVisitDataC.findAll", query="SELECT b FROM BmVisitDataC b")
public class BmVisitDataC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="abs_tide_height")
	private BigDecimal absTideHeight;

	@Column(name="bather_value")
	private BigDecimal batherValue;

	@Column(name="beach_code")
	private String beachCode;

	@Column(name="bmvisit_id")
	private String bmvisitId;

	@Column(name="climate_value")
	private BigDecimal climateValue;

	@Column(name="\"DO\"")
	private BigDecimal do_;

	private BigDecimal dos;

	private BigDecimal ec;

	private BigDecimal entrc;

	@Column(name="est_ec")
	private String estEc;

	@Column(name="est_entrc")
	private String estEntrc;

	private BigDecimal fc;

	@Column(name="l_ec")
	private String lEc;

	@Column(name="l_entrc")
	private String lEntrc;

	@Column(name="l_fc")
	private String lFc;

	@Column(name="lab_no")
	private String labNo;

	@Column(name="location_code")
	private String locationCode;

	private Timestamp mdate;

	private BigDecimal ph;

	@Column(name="photo_taken")
	private String photoTaken;

	private String remarks;

	private BigDecimal sal;

	@Column(name="sample_code")
	private String sampleCode;

	@Column(name="sample_date")
	private Timestamp sampleDate;

	@Column(name="sample_mark")
	private String sampleMark;

	@Column(name="sample_no")
	private BigDecimal sampleNo;

	@Column(name="sample_time")
	private String sampleTime;

	@Column(name="sea_clarity_value")
	private BigDecimal seaClarityValue;

	@Column(name="sea_condition_value")
	private BigDecimal seaConditionValue;

	@Column(name="site_id")
	private BigDecimal siteId;

	private BigDecimal stime;

	private BigDecimal temper;

	@Column(name="tide_height")
	private BigDecimal tideHeight;

	@Column(name="tide_ratio")
	private BigDecimal tideRatio;

	@Column(name="tide_value")
	private BigDecimal tideValue;

	private BigDecimal turb;

	@Column(name="weather_value")
	private BigDecimal weatherValue;

	@Column(name="wind_direction")
	private String windDirection;

	@Column(name="wind_value")
	private BigDecimal windValue;

	public BmVisitDataC() {
	}

	public BigDecimal getAbsTideHeight() {
		return this.absTideHeight;
	}

	public void setAbsTideHeight(BigDecimal absTideHeight) {
		this.absTideHeight = absTideHeight;
	}

	public BigDecimal getBatherValue() {
		return this.batherValue;
	}

	public void setBatherValue(BigDecimal batherValue) {
		this.batherValue = batherValue;
	}

	public String getBeachCode() {
		return this.beachCode;
	}

	public void setBeachCode(String beachCode) {
		this.beachCode = beachCode;
	}

	public String getBmvisitId() {
		return this.bmvisitId;
	}

	public void setBmvisitId(String bmvisitId) {
		this.bmvisitId = bmvisitId;
	}

	public BigDecimal getClimateValue() {
		return this.climateValue;
	}

	public void setClimateValue(BigDecimal climateValue) {
		this.climateValue = climateValue;
	}

	public BigDecimal getDo_() {
		return this.do_;
	}

	public void setDo_(BigDecimal do_) {
		this.do_ = do_;
	}

	public BigDecimal getDos() {
		return this.dos;
	}

	public void setDos(BigDecimal dos) {
		this.dos = dos;
	}

	public BigDecimal getEc() {
		return this.ec;
	}

	public void setEc(BigDecimal ec) {
		this.ec = ec;
	}

	public BigDecimal getEntrc() {
		return this.entrc;
	}

	public void setEntrc(BigDecimal entrc) {
		this.entrc = entrc;
	}

	public String getEstEc() {
		return this.estEc;
	}

	public void setEstEc(String estEc) {
		this.estEc = estEc;
	}

	public String getEstEntrc() {
		return this.estEntrc;
	}

	public void setEstEntrc(String estEntrc) {
		this.estEntrc = estEntrc;
	}

	public BigDecimal getFc() {
		return this.fc;
	}

	public void setFc(BigDecimal fc) {
		this.fc = fc;
	}

	public String getLEc() {
		return this.lEc;
	}

	public void setLEc(String lEc) {
		this.lEc = lEc;
	}

	public String getLEntrc() {
		return this.lEntrc;
	}

	public void setLEntrc(String lEntrc) {
		this.lEntrc = lEntrc;
	}

	public String getLFc() {
		return this.lFc;
	}

	public void setLFc(String lFc) {
		this.lFc = lFc;
	}

	public String getLabNo() {
		return this.labNo;
	}

	public void setLabNo(String labNo) {
		this.labNo = labNo;
	}

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getPh() {
		return this.ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public String getPhotoTaken() {
		return this.photoTaken;
	}

	public void setPhotoTaken(String photoTaken) {
		this.photoTaken = photoTaken;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public BigDecimal getSal() {
		return this.sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

	public String getSampleCode() {
		return this.sampleCode;
	}

	public void setSampleCode(String sampleCode) {
		this.sampleCode = sampleCode;
	}

	public Timestamp getSampleDate() {
		return this.sampleDate;
	}

	public void setSampleDate(Timestamp sampleDate) {
		this.sampleDate = sampleDate;
	}

	public String getSampleMark() {
		return this.sampleMark;
	}

	public void setSampleMark(String sampleMark) {
		this.sampleMark = sampleMark;
	}

	public BigDecimal getSampleNo() {
		return this.sampleNo;
	}

	public void setSampleNo(BigDecimal sampleNo) {
		this.sampleNo = sampleNo;
	}

	public String getSampleTime() {
		return this.sampleTime;
	}

	public void setSampleTime(String sampleTime) {
		this.sampleTime = sampleTime;
	}

	public BigDecimal getSeaClarityValue() {
		return this.seaClarityValue;
	}

	public void setSeaClarityValue(BigDecimal seaClarityValue) {
		this.seaClarityValue = seaClarityValue;
	}

	public BigDecimal getSeaConditionValue() {
		return this.seaConditionValue;
	}

	public void setSeaConditionValue(BigDecimal seaConditionValue) {
		this.seaConditionValue = seaConditionValue;
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

	public BigDecimal getTideHeight() {
		return this.tideHeight;
	}

	public void setTideHeight(BigDecimal tideHeight) {
		this.tideHeight = tideHeight;
	}

	public BigDecimal getTideRatio() {
		return this.tideRatio;
	}

	public void setTideRatio(BigDecimal tideRatio) {
		this.tideRatio = tideRatio;
	}

	public BigDecimal getTideValue() {
		return this.tideValue;
	}

	public void setTideValue(BigDecimal tideValue) {
		this.tideValue = tideValue;
	}

	public BigDecimal getTurb() {
		return this.turb;
	}

	public void setTurb(BigDecimal turb) {
		this.turb = turb;
	}

	public BigDecimal getWeatherValue() {
		return this.weatherValue;
	}

	public void setWeatherValue(BigDecimal weatherValue) {
		this.weatherValue = weatherValue;
	}

	public String getWindDirection() {
		return this.windDirection;
	}

	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}

	public BigDecimal getWindValue() {
		return this.windValue;
	}

	public void setWindValue(BigDecimal windValue) {
		this.windValue = windValue;
	}

}