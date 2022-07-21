package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_beach_grade_view database table.
 * 
 */
//@Entity
@Table(name="bm_beach_grade_view")
@NamedQuery(name="BmBeachGradeView.findAll", query="SELECT b FROM BmBeachGradeView b")
public class BmBeachGradeView implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="beach_code")
	private String beachCode;

	@Column(name="beach_group")
	private String beachGroup;

	@Column(name="beach_name")
	private String beachName;

	@Column(name="chinese_name")
	private String chineseName;

	@Column(name="dc_district_code")
	private String dcDistrictCode;

	@Column(name="district_name")
	private String districtName;

	@Column(name="district_name_c")
	private String districtNameC;

	@Column(name="district_order")
	private String districtOrder;

	@Column(name="g_mean")
	private BigDecimal gMean;

	private BigDecimal grade;

	@Column(name="grade_c")
	private String gradeC;

	@Column(name="grade_c_ref_sampling_date")
	private Timestamp gradeCRefSamplingDate;

	@Column(name="grade_change")
	private BigDecimal gradeChange;

	@Column(name="hotline_district")
	private String hotlineDistrict;

	@Column(name="hotline_district_c")
	private String hotlineDistrictC;

	@Column(name="lcsd_district_office")
	private String lcsdDistrictOffice;

	@Column(name="list_order_2")
	private String listOrder2;

	private String quality;

	@Column(name="quality_c")
	private String qualityC;

	@Column(name="r_g_mean")
	private BigDecimal rGMean;

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

	public BmBeachGradeView() {
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

	public String getDcDistrictCode() {
		return this.dcDistrictCode;
	}

	public void setDcDistrictCode(String dcDistrictCode) {
		this.dcDistrictCode = dcDistrictCode;
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getDistrictNameC() {
		return this.districtNameC;
	}

	public void setDistrictNameC(String districtNameC) {
		this.districtNameC = districtNameC;
	}

	public String getDistrictOrder() {
		return this.districtOrder;
	}

	public void setDistrictOrder(String districtOrder) {
		this.districtOrder = districtOrder;
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

	public String getGradeC() {
		return this.gradeC;
	}

	public void setGradeC(String gradeC) {
		this.gradeC = gradeC;
	}

	public Timestamp getGradeCRefSamplingDate() {
		return this.gradeCRefSamplingDate;
	}

	public void setGradeCRefSamplingDate(Timestamp gradeCRefSamplingDate) {
		this.gradeCRefSamplingDate = gradeCRefSamplingDate;
	}

	public BigDecimal getGradeChange() {
		return this.gradeChange;
	}

	public void setGradeChange(BigDecimal gradeChange) {
		this.gradeChange = gradeChange;
	}

	public String getHotlineDistrict() {
		return this.hotlineDistrict;
	}

	public void setHotlineDistrict(String hotlineDistrict) {
		this.hotlineDistrict = hotlineDistrict;
	}

	public String getHotlineDistrictC() {
		return this.hotlineDistrictC;
	}

	public void setHotlineDistrictC(String hotlineDistrictC) {
		this.hotlineDistrictC = hotlineDistrictC;
	}

	public String getLcsdDistrictOffice() {
		return this.lcsdDistrictOffice;
	}

	public void setLcsdDistrictOffice(String lcsdDistrictOffice) {
		this.lcsdDistrictOffice = lcsdDistrictOffice;
	}

	public String getListOrder2() {
		return this.listOrder2;
	}

	public void setListOrder2(String listOrder2) {
		this.listOrder2 = listOrder2;
	}

	public String getQuality() {
		return this.quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getQualityC() {
		return this.qualityC;
	}

	public void setQualityC(String qualityC) {
		this.qualityC = qualityC;
	}

	public BigDecimal getRGMean() {
		return this.rGMean;
	}

	public void setRGMean(BigDecimal rGMean) {
		this.rGMean = rGMean;
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

}