package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bm_beach_ec_agm_view database table.
 * 
 */
//@Entity
@Table(name="bm_beach_ec_agm_view")
@NamedQuery(name="BmBeachEcAgmView.findAll", query="SELECT b FROM BmBeachEcAgmView b")
public class BmBeachEcAgmView implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="beach_code")
	private String beachCode;

	@Column(name="beach_group")
	private String beachGroup;

	@Column(name="beach_name")
	private String beachName;

	@Column(name="chinese_name")
	private String chineseName;

	@Column(name="cy_agm")
	private BigDecimal cyAgm;

	@Column(name="cy_count")
	private Long cyCount;

	@Column(name="district_name")
	private String districtName;

	@Column(name="district_name_c")
	private String districtNameC;

	@Column(name="district_order")
	private String districtOrder;

	@Column(name="hotline_district")
	private String hotlineDistrict;

	@Column(name="hotline_district_c")
	private String hotlineDistrictC;

	@Column(name="ly_agm")
	private BigDecimal lyAgm;

	@Column(name="ly_count")
	private Long lyCount;

	@Column(name="ly_year_agm")
	private BigDecimal lyYearAgm;

	@Column(name="ly_year_count")
	private Long lyYearCount;

	private double year;

	public BmBeachEcAgmView() {
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

	public BigDecimal getCyAgm() {
		return this.cyAgm;
	}

	public void setCyAgm(BigDecimal cyAgm) {
		this.cyAgm = cyAgm;
	}

	public Long getCyCount() {
		return this.cyCount;
	}

	public void setCyCount(Long cyCount) {
		this.cyCount = cyCount;
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

	public BigDecimal getLyAgm() {
		return this.lyAgm;
	}

	public void setLyAgm(BigDecimal lyAgm) {
		this.lyAgm = lyAgm;
	}

	public Long getLyCount() {
		return this.lyCount;
	}

	public void setLyCount(Long lyCount) {
		this.lyCount = lyCount;
	}

	public BigDecimal getLyYearAgm() {
		return this.lyYearAgm;
	}

	public void setLyYearAgm(BigDecimal lyYearAgm) {
		this.lyYearAgm = lyYearAgm;
	}

	public Long getLyYearCount() {
		return this.lyYearCount;
	}

	public void setLyYearCount(Long lyYearCount) {
		this.lyYearCount = lyYearCount;
	}

	public double getYear() {
		return this.year;
	}

	public void setYear(double year) {
		this.year = year;
	}

}