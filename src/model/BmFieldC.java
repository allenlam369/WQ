package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_field_c database table.
 * 
 */
@Entity
@Table(name="bm_field_c")
@NamedQuery(name="BmFieldC.findAll", query="SELECT b FROM BmFieldC b")
public class BmFieldC implements Serializable {
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

	private Timestamp dayappend;

	private Timestamp dayedit;

	private Timestamp dayupload;

	@Column(name="\"DO\"")
	private BigDecimal do_;

	private BigDecimal dos;

	@Id
	private Integer id;

	private String remarks;

	@Column(name="sample_date")
	private Timestamp sampleDate;

	@Column(name="sample_time")
	private String sampleTime;

	@Column(name="sea_clarity_value")
	private BigDecimal seaClarityValue;

	@Column(name="sea_condition_value")
	private BigDecimal seaConditionValue;

	private BigDecimal temper;

	@Column(name="tide_height")
	private BigDecimal tideHeight;

	@Column(name="tide_ratio")
	private BigDecimal tideRatio;

	@Column(name="tide_value")
	private BigDecimal tideValue;

	@Column(name="valid_code")
	private Integer validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	@Column(name="weather_value")
	private BigDecimal weatherValue;

	@Column(name="wind_direction")
	private String windDirection;

	@Column(name="wind_value")
	private BigDecimal windValue;

	public BmFieldC() {
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

	public Timestamp getDayappend() {
		return this.dayappend;
	}

	public void setDayappend(Timestamp dayappend) {
		this.dayappend = dayappend;
	}

	public Timestamp getDayedit() {
		return this.dayedit;
	}

	public void setDayedit(Timestamp dayedit) {
		this.dayedit = dayedit;
	}

	public Timestamp getDayupload() {
		return this.dayupload;
	}

	public void setDayupload(Timestamp dayupload) {
		this.dayupload = dayupload;
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

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Timestamp getSampleDate() {
		return this.sampleDate;
	}

	public void setSampleDate(Timestamp sampleDate) {
		this.sampleDate = sampleDate;
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