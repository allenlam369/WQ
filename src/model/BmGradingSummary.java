package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_grading_summary database table.
 * 
 */
//@Entity
@Table(name="bm_grading_summary")
@NamedQuery(name="BmGradingSummary.findAll", query="SELECT b FROM BmGradingSummary b")
public class BmGradingSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="beach_code")
	private String beachCode;

	@Column(name="beach_group")
	private String beachGroup;

	@Column(name="beach_name")
	private String beachName;

	@Column(name="chinese_name")
	private String chineseName;

	@Column(name="district_code")
	private String districtCode;

	@Column(name="district_name")
	private String districtName;

	@Column(name="\"E GRADE\"")
	private String e_grade;

	private BigDecimal grade;

	@Column(name="grade_c")
	private String gradeC;

	@Column(name="sampling_date")
	private Timestamp samplingDate;

	public BmGradingSummary() {
	}

	public String getBeachCode() {
		return this.beachCode;
	}

	public void setBeachCode(String beachCode) {
		this.beachCode = beachCode;
	}

	public String getBeachGroup() {
		return this.beachGroup;
	}

	public void setBeachGroup(String beachGroup) {
		this.beachGroup = beachGroup;
	}

	public String getBeachName() {
		return this.beachName;
	}

	public void setBeachName(String beachName) {
		this.beachName = beachName;
	}

	public String getChineseName() {
		return this.chineseName;
	}

	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getE_grade() {
		return this.e_grade;
	}

	public void setE_grade(String e_grade) {
		this.e_grade = e_grade;
	}

	public BigDecimal getGrade() {
		return this.grade;
	}

	public void setGrade(BigDecimal grade) {
		this.grade = grade;
	}

	public String getGradeC() {
		return this.gradeC;
	}

	public void setGradeC(String gradeC) {
		this.gradeC = gradeC;
	}

	public Timestamp getSamplingDate() {
		return this.samplingDate;
	}

	public void setSamplingDate(Timestamp samplingDate) {
		this.samplingDate = samplingDate;
	}

}