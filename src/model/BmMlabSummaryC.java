package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_mlab_summary_c database table.
 * 
 */
@Entity
@Table(name="bm_mlab_summary_c")
@NamedQuery(name="BmMlabSummaryC.findAll", query="SELECT b FROM BmMlabSummaryC b")
public class BmMlabSummaryC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="adj_log_gm")
	private BigDecimal adjLogGm;

	@Column(name="beach_code")
	private String beachCode;

	@Column(name="bmvisit_id")
	private String bmvisitId;

	@Column(name="g_mean")
	private BigDecimal gMean;

	private BigDecimal grade;

	@Column(name="grade_change")
	private BigDecimal gradeChange;

	@Id
	private Integer id;

	@Column(name="log_g_mean")
	private BigDecimal logGMean;

	@Column(name="move_avg")
	private BigDecimal moveAvg;

	private BigDecimal ph;

	@Column(name="r_g_mean")
	private BigDecimal rGMean;

	private BigDecimal sal;

	@Column(name="sample_date")
	private Timestamp sampleDate;

	@Column(name="trg_limit_1")
	private String trgLimit1;

	@Column(name="trg_limit_2")
	private String trgLimit2;

	@Column(name="trg_limit_3")
	private String trgLimit3;

	@Column(name="trg_limit_4")
	private String trgLimit4;

	private BigDecimal turb;

	@Column(name="valid_code")
	private Integer validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public BmMlabSummaryC() {
	}

	public BigDecimal getAdjLogGm() {
		return this.adjLogGm;
	}

	public void setAdjLogGm(BigDecimal adjLogGm) {
		this.adjLogGm = adjLogGm;
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

	public BigDecimal getGMean() {
		return this.gMean;
	}

	public void setGMean(BigDecimal gMean) {
		this.gMean = gMean;
	}

	public BigDecimal getGrade() {
		return this.grade;
	}

	public void setGrade(BigDecimal grade) {
		this.grade = grade;
	}

	public BigDecimal getGradeChange() {
		return this.gradeChange;
	}

	public void setGradeChange(BigDecimal gradeChange) {
		this.gradeChange = gradeChange;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getLogGMean() {
		return this.logGMean;
	}

	public void setLogGMean(BigDecimal logGMean) {
		this.logGMean = logGMean;
	}

	public BigDecimal getMoveAvg() {
		return this.moveAvg;
	}

	public void setMoveAvg(BigDecimal moveAvg) {
		this.moveAvg = moveAvg;
	}

	public BigDecimal getPh() {
		return this.ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public BigDecimal getRGMean() {
		return this.rGMean;
	}

	public void setRGMean(BigDecimal rGMean) {
		this.rGMean = rGMean;
	}

	public BigDecimal getSal() {
		return this.sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

	public Timestamp getSampleDate() {
		return this.sampleDate;
	}

	public void setSampleDate(Timestamp sampleDate) {
		this.sampleDate = sampleDate;
	}

	public String getTrgLimit1() {
		return this.trgLimit1;
	}

	public void setTrgLimit1(String trgLimit1) {
		this.trgLimit1 = trgLimit1;
	}

	public String getTrgLimit2() {
		return this.trgLimit2;
	}

	public void setTrgLimit2(String trgLimit2) {
		this.trgLimit2 = trgLimit2;
	}

	public String getTrgLimit3() {
		return this.trgLimit3;
	}

	public void setTrgLimit3(String trgLimit3) {
		this.trgLimit3 = trgLimit3;
	}

	public String getTrgLimit4() {
		return this.trgLimit4;
	}

	public void setTrgLimit4(String trgLimit4) {
		this.trgLimit4 = trgLimit4;
	}

	public BigDecimal getTurb() {
		return this.turb;
	}

	public void setTurb(BigDecimal turb) {
		this.turb = turb;
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

}