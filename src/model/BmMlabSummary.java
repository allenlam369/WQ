package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_mlab_summary database table.
 * 
 */
@Entity
@Table(name="bm_mlab_summary")
@NamedQuery(name="BmMlabSummary.findAll", query="SELECT b FROM BmMlabSummary b")
public class BmMlabSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="adj_log_gm")
	private BigDecimal adjLogGm;

	@Column(name="adj_log_gm_fc")
	private BigDecimal adjLogGmFc;

	@Column(name="beach_code")
	private String beachCode;

	@Column(name="bmvisit_id")
	private String bmvisitId;

	@Column(name="g_mean")
	private BigDecimal gMean;

	@Column(name="g_mean_fc")
	private BigDecimal gMeanFc;

	private BigDecimal grade;

	@Column(name="grade_change")
	private BigDecimal gradeChange;

	@Id
	private Integer id;

	@Column(name="log_g_mean")
	private BigDecimal logGMean;

	@Column(name="log_g_mean_fc")
	private BigDecimal logGMeanFc;

	@Column(name="move_avg")
	private BigDecimal moveAvg;

	@Column(name="move_avg_fc")
	private BigDecimal moveAvgFc;

	@Column(name="mth_g_mean")
	private BigDecimal mthGMean;

	@Column(name="mth_g_mean_fc")
	private BigDecimal mthGMeanFc;

	private BigDecimal ph;

	@Column(name="r_g_mean")
	private BigDecimal rGMean;

	@Column(name="r_g_mean_fc")
	private BigDecimal rGMeanFc;

	private BigDecimal sal;

	@Column(name="sal_l")
	private BigDecimal salL;

	@Column(name="sal_m")
	private BigDecimal salM;

	@Column(name="sal_o")
	private BigDecimal salO;

	@Column(name="sal_r")
	private BigDecimal salR;

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

	@Column(name="wk_g_mean")
	private BigDecimal wkGMean;

	@Column(name="wk_g_mean_fc")
	private BigDecimal wkGMeanFc;

	public BmMlabSummary() {
	}

	public BigDecimal getAdjLogGm() {
		return this.adjLogGm;
	}

	public void setAdjLogGm(BigDecimal adjLogGm) {
		this.adjLogGm = adjLogGm;
	}

	public BigDecimal getAdjLogGmFc() {
		return this.adjLogGmFc;
	}

	public void setAdjLogGmFc(BigDecimal adjLogGmFc) {
		this.adjLogGmFc = adjLogGmFc;
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

	public BigDecimal getGMeanFc() {
		return this.gMeanFc;
	}

	public void setGMeanFc(BigDecimal gMeanFc) {
		this.gMeanFc = gMeanFc;
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

	public BigDecimal getLogGMeanFc() {
		return this.logGMeanFc;
	}

	public void setLogGMeanFc(BigDecimal logGMeanFc) {
		this.logGMeanFc = logGMeanFc;
	}

	public BigDecimal getMoveAvg() {
		return this.moveAvg;
	}

	public void setMoveAvg(BigDecimal moveAvg) {
		this.moveAvg = moveAvg;
	}

	public BigDecimal getMoveAvgFc() {
		return this.moveAvgFc;
	}

	public void setMoveAvgFc(BigDecimal moveAvgFc) {
		this.moveAvgFc = moveAvgFc;
	}

	public BigDecimal getMthGMean() {
		return this.mthGMean;
	}

	public void setMthGMean(BigDecimal mthGMean) {
		this.mthGMean = mthGMean;
	}

	public BigDecimal getMthGMeanFc() {
		return this.mthGMeanFc;
	}

	public void setMthGMeanFc(BigDecimal mthGMeanFc) {
		this.mthGMeanFc = mthGMeanFc;
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

	public BigDecimal getRGMeanFc() {
		return this.rGMeanFc;
	}

	public void setRGMeanFc(BigDecimal rGMeanFc) {
		this.rGMeanFc = rGMeanFc;
	}

	public BigDecimal getSal() {
		return this.sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

	public BigDecimal getSalL() {
		return this.salL;
	}

	public void setSalL(BigDecimal salL) {
		this.salL = salL;
	}

	public BigDecimal getSalM() {
		return this.salM;
	}

	public void setSalM(BigDecimal salM) {
		this.salM = salM;
	}

	public BigDecimal getSalO() {
		return this.salO;
	}

	public void setSalO(BigDecimal salO) {
		this.salO = salO;
	}

	public BigDecimal getSalR() {
		return this.salR;
	}

	public void setSalR(BigDecimal salR) {
		this.salR = salR;
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

	public BigDecimal getWkGMean() {
		return this.wkGMean;
	}

	public void setWkGMean(BigDecimal wkGMean) {
		this.wkGMean = wkGMean;
	}

	public BigDecimal getWkGMeanFc() {
		return this.wkGMeanFc;
	}

	public void setWkGMeanFc(BigDecimal wkGMeanFc) {
		this.wkGMeanFc = wkGMeanFc;
	}

}