package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bm_beach_ec_agm_rank_report_bak database table.
 * 
 */
//@Entity
@Table(name="bm_beach_ec_agm_rank_report_bak")
@NamedQuery(name="BmBeachEcAgmRankReportBak.findAll", query="SELECT b FROM BmBeachEcAgmRankReportBak b")
public class BmBeachEcAgmRankReportBak implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="annual_g_mean")
	private BigDecimal annualGMean;

	@Column(name="annual_log_g_mean")
	private BigDecimal annualLogGMean;

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

	@Column(name="hotline_district")
	private String hotlineDistrict;

	@Column(name="hotline_district_c")
	private String hotlineDistrictC;

	@Column(name="list_order_2")
	private String listOrder2;

	private BigDecimal rank;

	@Column(name="sample_count")
	private Long sampleCount;

	private double year;

	public BmBeachEcAgmRankReportBak() {
	}

	public BigDecimal getAnnualGMean() {
		return this.annualGMean;
	}

	public void setAnnualGMean(BigDecimal annualGMean) {
		this.annualGMean = annualGMean;
	}

	public BigDecimal getAnnualLogGMean() {
		return this.annualLogGMean;
	}

	public void setAnnualLogGMean(BigDecimal annualLogGMean) {
		this.annualLogGMean = annualLogGMean;
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

	public BigDecimal getRank() {
		return this.rank;
	}

	public void setRank(BigDecimal rank) {
		this.rank = rank;
	}

	public Long getSampleCount() {
		return this.sampleCount;
	}

	public void setSampleCount(Long sampleCount) {
		this.sampleCount = sampleCount;
	}

	public double getYear() {
		return this.year;
	}

	public void setYear(double year) {
		this.year = year;
	}

}