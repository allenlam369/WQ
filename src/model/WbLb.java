package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the wb_lb database table.
 * 
 */
@Entity
@Table(name="wb_lb")
@NamedQuery(name="WbLb.findAll", query="SELECT w FROM WbLb w")
public class WbLb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="wb_visit_id")
	private String wbVisitId;

	@Column(name="m_date")
	private Timestamp mDate;

	private String remark;

	@Column(name="s_time")
	private BigDecimal sTime;

	private String sample;

	private String sex;

	@Column(name="sp_length")
	private BigDecimal spLength;

	@Column(name="sp_name")
	private String spName;

	@Column(name="spec_no")
	private BigDecimal specNo;

	@Column(name="station_id")
	private String stationId;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	private BigDecimal weight;

	public WbLb() {
	}

	public String getWbVisitId() {
		return this.wbVisitId;
	}

	public void setWbVisitId(String wbVisitId) {
		this.wbVisitId = wbVisitId;
	}

	public Timestamp getMDate() {
		return this.mDate;
	}

	public void setMDate(Timestamp mDate) {
		this.mDate = mDate;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public BigDecimal getSTime() {
		return this.sTime;
	}

	public void setSTime(BigDecimal sTime) {
		this.sTime = sTime;
	}

	public String getSample() {
		return this.sample;
	}

	public void setSample(String sample) {
		this.sample = sample;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public BigDecimal getSpLength() {
		return this.spLength;
	}

	public void setSpLength(BigDecimal spLength) {
		this.spLength = spLength;
	}

	public String getSpName() {
		return this.spName;
	}

	public void setSpName(String spName) {
		this.spName = spName;
	}

	public BigDecimal getSpecNo() {
		return this.specNo;
	}

	public void setSpecNo(BigDecimal specNo) {
		this.specNo = specNo;
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

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

}