package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_rain_c database table.
 * 
 */
@Entity
@Table(name="bm_rain_c")
@NamedQuery(name="BmRainC.findAll", query="SELECT b FROM BmRainC b")
public class BmRainC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="beach_code")
	private String beachCode;

	@Column(name="bmvisit_id")
	private String bmvisitId;

	@Id
	private Integer id;

	@Column(name="rain_station_code")
	private String rainStationCode;

	private BigDecimal rainfall;

	@Column(name="rainfall_last_12hr")
	private BigDecimal rainfallLast12hr;

	@Column(name="rainfall_last_24hr")
	private BigDecimal rainfallLast24hr;

	@Column(name="rainfall_last_72hr")
	private BigDecimal rainfallLast72hr;

	@Column(name="rainfall_max_3hr")
	private BigDecimal rainfallMax3hr;

	@Column(name="rainfall_max_time")
	private Timestamp rainfallMaxTime;

	@Column(name="risk_rain_last_12hr")
	private String riskRainLast12hr;

	@Column(name="risk_rain_last_24hr")
	private String riskRainLast24hr;

	@Column(name="risk_rain_last_72hr")
	private String riskRainLast72hr;

	@Column(name="risk_rain_max_3hr")
	private String riskRainMax3hr;

	private Timestamp sdatetime;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public BmRainC() {
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

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRainStationCode() {
		return this.rainStationCode;
	}

	public void setRainStationCode(String rainStationCode) {
		this.rainStationCode = rainStationCode;
	}

	public BigDecimal getRainfall() {
		return this.rainfall;
	}

	public void setRainfall(BigDecimal rainfall) {
		this.rainfall = rainfall;
	}

	public BigDecimal getRainfallLast12hr() {
		return this.rainfallLast12hr;
	}

	public void setRainfallLast12hr(BigDecimal rainfallLast12hr) {
		this.rainfallLast12hr = rainfallLast12hr;
	}

	public BigDecimal getRainfallLast24hr() {
		return this.rainfallLast24hr;
	}

	public void setRainfallLast24hr(BigDecimal rainfallLast24hr) {
		this.rainfallLast24hr = rainfallLast24hr;
	}

	public BigDecimal getRainfallLast72hr() {
		return this.rainfallLast72hr;
	}

	public void setRainfallLast72hr(BigDecimal rainfallLast72hr) {
		this.rainfallLast72hr = rainfallLast72hr;
	}

	public BigDecimal getRainfallMax3hr() {
		return this.rainfallMax3hr;
	}

	public void setRainfallMax3hr(BigDecimal rainfallMax3hr) {
		this.rainfallMax3hr = rainfallMax3hr;
	}

	public Timestamp getRainfallMaxTime() {
		return this.rainfallMaxTime;
	}

	public void setRainfallMaxTime(Timestamp rainfallMaxTime) {
		this.rainfallMaxTime = rainfallMaxTime;
	}

	public String getRiskRainLast12hr() {
		return this.riskRainLast12hr;
	}

	public void setRiskRainLast12hr(String riskRainLast12hr) {
		this.riskRainLast12hr = riskRainLast12hr;
	}

	public String getRiskRainLast24hr() {
		return this.riskRainLast24hr;
	}

	public void setRiskRainLast24hr(String riskRainLast24hr) {
		this.riskRainLast24hr = riskRainLast24hr;
	}

	public String getRiskRainLast72hr() {
		return this.riskRainLast72hr;
	}

	public void setRiskRainLast72hr(String riskRainLast72hr) {
		this.riskRainLast72hr = riskRainLast72hr;
	}

	public String getRiskRainMax3hr() {
		return this.riskRainMax3hr;
	}

	public void setRiskRainMax3hr(String riskRainMax3hr) {
		this.riskRainMax3hr = riskRainMax3hr;
	}

	public Timestamp getSdatetime() {
		return this.sdatetime;
	}

	public void setSdatetime(Timestamp sdatetime) {
		this.sdatetime = sdatetime;
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