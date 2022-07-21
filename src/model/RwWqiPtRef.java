package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the rw_wqi_pt_ref database table.
 * 
 */
@Entity
@Table(name="rw_wqi_pt_ref")
@NamedQuery(name="RwWqiPtRef.findAll", query="SELECT r FROM RwWqiPtRef r")
public class RwWqiPtRef implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="rw_wqi_pt_id")
	private String rwWqiPtId;

	@Column(name="l_low_value")
	private String lLowValue;

	@Column(name="l_up_value")
	private String lUpValue;

	@Column(name="low_value")
	private BigDecimal lowValue;

	private String parameter;

	private BigDecimal points;

	private String range;

	@Column(name="up_value")
	private BigDecimal upValue;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public RwWqiPtRef() {
	}

	public String getRwWqiPtId() {
		return this.rwWqiPtId;
	}

	public void setRwWqiPtId(String rwWqiPtId) {
		this.rwWqiPtId = rwWqiPtId;
	}

	public String getLLowValue() {
		return this.lLowValue;
	}

	public void setLLowValue(String lLowValue) {
		this.lLowValue = lLowValue;
	}

	public String getLUpValue() {
		return this.lUpValue;
	}

	public void setLUpValue(String lUpValue) {
		this.lUpValue = lUpValue;
	}

	public BigDecimal getLowValue() {
		return this.lowValue;
	}

	public void setLowValue(BigDecimal lowValue) {
		this.lowValue = lowValue;
	}

	public String getParameter() {
		return this.parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public BigDecimal getPoints() {
		return this.points;
	}

	public void setPoints(BigDecimal points) {
		this.points = points;
	}

	public String getRange() {
		return this.range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public BigDecimal getUpValue() {
		return this.upValue;
	}

	public void setUpValue(BigDecimal upValue) {
		this.upValue = upValue;
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