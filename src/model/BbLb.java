package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bb_lb database table.
 * 
 */
@Entity
@Table(name="bb_lb")
@NamedQuery(name="BbLb.findAll", query="SELECT b FROM BbLb b")
public class BbLb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="bb_visit_id")
	private String bbVisitId;

	@Column(name="m_date")
	private Timestamp mDate;

	private String remark;

	@Column(name="s_time")
	private BigDecimal sTime;

	@Column(name="sample_no")
	private BigDecimal sampleNo;

	private String sex;

	@Column(name="sp_length")
	private BigDecimal spLength;

	@Column(name="sp_name")
	private String spName;

	private BigDecimal specimen;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	private BigDecimal weight;

	//bi-directional many-to-one association to BbStation
	@ManyToOne
	@JoinColumn(name="station_id")
	private BbStation bbStation;

	public BbLb() {
	}

	public String getBbVisitId() {
		return this.bbVisitId;
	}

	public void setBbVisitId(String bbVisitId) {
		this.bbVisitId = bbVisitId;
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

	public BigDecimal getSampleNo() {
		return this.sampleNo;
	}

	public void setSampleNo(BigDecimal sampleNo) {
		this.sampleNo = sampleNo;
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

	public BigDecimal getSpecimen() {
		return this.specimen;
	}

	public void setSpecimen(BigDecimal specimen) {
		this.specimen = specimen;
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

	public BbStation getBbStation() {
		return this.bbStation;
	}

	public void setBbStation(BbStation bbStation) {
		this.bbStation = bbStation;
	}

}