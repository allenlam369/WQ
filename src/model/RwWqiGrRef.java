package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the rw_wqi_gr_ref database table.
 * 
 */
@Entity
@Table(name="rw_wqi_gr_ref")
@NamedQuery(name="RwWqiGrRef.findAll", query="SELECT r FROM RwWqiGrRef r")
public class RwWqiGrRef implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="rw_wqi_gr_id")
	private String rwWqiGrId;

	@Column(name="l_low_pt")
	private String lLowPt;

	@Column(name="l_up_pt")
	private String lUpPt;

	@Column(name="low_pt")
	private BigDecimal lowPt;

	@Column(name="up_pt")
	private BigDecimal upPt;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	@Column(name="wqi_grade")
	private String wqiGrade;

	@Column(name="wqi_range")
	private String wqiRange;

	public RwWqiGrRef() {
	}

	public String getRwWqiGrId() {
		return this.rwWqiGrId;
	}

	public void setRwWqiGrId(String rwWqiGrId) {
		this.rwWqiGrId = rwWqiGrId;
	}

	public String getLLowPt() {
		return this.lLowPt;
	}

	public void setLLowPt(String lLowPt) {
		this.lLowPt = lLowPt;
	}

	public String getLUpPt() {
		return this.lUpPt;
	}

	public void setLUpPt(String lUpPt) {
		this.lUpPt = lUpPt;
	}

	public BigDecimal getLowPt() {
		return this.lowPt;
	}

	public void setLowPt(BigDecimal lowPt) {
		this.lowPt = lowPt;
	}

	public BigDecimal getUpPt() {
		return this.upPt;
	}

	public void setUpPt(BigDecimal upPt) {
		this.upPt = upPt;
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

	public String getWqiGrade() {
		return this.wqiGrade;
	}

	public void setWqiGrade(String wqiGrade) {
		this.wqiGrade = wqiGrade;
	}

	public String getWqiRange() {
		return this.wqiRange;
	}

	public void setWqiRange(String wqiRange) {
		this.wqiRange = wqiRange;
	}

}