package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bm_beach_ann_grade_view database table.
 * 
 */
//@Entity
@Table(name="bm_beach_ann_grade_view")
@NamedQuery(name="BmBeachAnnGradeView.findAll", query="SELECT b FROM BmBeachAnnGradeView b")
public class BmBeachAnnGradeView implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="beach_code")
	private String beachCode;

	@Column(name="beach_group")
	private String beachGroup;

	@Column(name="beach_name")
	private String beachName;

	@Column(name="chinese_name")
	private String chineseName;

	@Column(name="district_name")
	private String districtName;

	@Column(name="district_name_c")
	private String districtNameC;

	@Column(name="district_order")
	private String districtOrder;

	@Column(name="grade_1_count")
	private Long grade1Count;

	@Column(name="grade_2_count")
	private Long grade2Count;

	@Column(name="grade_3_count")
	private Long grade3Count;

	@Column(name="grade_4_count")
	private Long grade4Count;

	@Column(name="hotline_district")
	private String hotlineDistrict;

	@Column(name="hotline_district_c")
	private String hotlineDistrictC;

	@Column(name="list_order_2")
	private String listOrder2;

	@Column(name="rainy_grade_4_count")
	private Long rainyGrade4Count;

	@Column(name="total_grade_count")
	private Long totalGradeCount;

	private double year;

	public BmBeachAnnGradeView() {
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

	public Long getGrade1Count() {
		return this.grade1Count;
	}

	public void setGrade1Count(Long grade1Count) {
		this.grade1Count = grade1Count;
	}

	public Long getGrade2Count() {
		return this.grade2Count;
	}

	public void setGrade2Count(Long grade2Count) {
		this.grade2Count = grade2Count;
	}

	public Long getGrade3Count() {
		return this.grade3Count;
	}

	public void setGrade3Count(Long grade3Count) {
		this.grade3Count = grade3Count;
	}

	public Long getGrade4Count() {
		return this.grade4Count;
	}

	public void setGrade4Count(Long grade4Count) {
		this.grade4Count = grade4Count;
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

	public String getListOrder2() {
		return this.listOrder2;
	}

	public void setListOrder2(String listOrder2) {
		this.listOrder2 = listOrder2;
	}

	public Long getRainyGrade4Count() {
		return this.rainyGrade4Count;
	}

	public void setRainyGrade4Count(Long rainyGrade4Count) {
		this.rainyGrade4Count = rainyGrade4Count;
	}

	public Long getTotalGradeCount() {
		return this.totalGradeCount;
	}

	public void setTotalGradeCount(Long totalGradeCount) {
		this.totalGradeCount = totalGradeCount;
	}

	public double getYear() {
		return this.year;
	}

	public void setYear(double year) {
		this.year = year;
	}

}