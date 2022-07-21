package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bm_beach_ann_sample_count database table.
 * 
 */
//@Entity
@Table(name="bm_beach_ann_sample_count")
@NamedQuery(name="BmBeachAnnSampleCount.findAll", query="SELECT b FROM BmBeachAnnSampleCount b")
public class BmBeachAnnSampleCount implements Serializable {
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

	@Column(name="fri_count")
	private BigDecimal friCount;

	@Column(name="hotline_district")
	private String hotlineDistrict;

	@Column(name="list_order_2")
	private String listOrder2;

	@Column(name="mon_count")
	private BigDecimal monCount;

	@Column(name="sat_count")
	private BigDecimal satCount;

	@Column(name="sun_count")
	private BigDecimal sunCount;

	@Column(name="thu_count")
	private BigDecimal thuCount;

	private BigDecimal total;

	@Column(name="tue_count")
	private BigDecimal tueCount;

	@Column(name="wed_count")
	private BigDecimal wedCount;

	private double year;

	public BmBeachAnnSampleCount() {
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

	public BigDecimal getFriCount() {
		return this.friCount;
	}

	public void setFriCount(BigDecimal friCount) {
		this.friCount = friCount;
	}

	public String getHotlineDistrict() {
		return this.hotlineDistrict;
	}

	public void setHotlineDistrict(String hotlineDistrict) {
		this.hotlineDistrict = hotlineDistrict;
	}

	public String getListOrder2() {
		return this.listOrder2;
	}

	public void setListOrder2(String listOrder2) {
		this.listOrder2 = listOrder2;
	}

	public BigDecimal getMonCount() {
		return this.monCount;
	}

	public void setMonCount(BigDecimal monCount) {
		this.monCount = monCount;
	}

	public BigDecimal getSatCount() {
		return this.satCount;
	}

	public void setSatCount(BigDecimal satCount) {
		this.satCount = satCount;
	}

	public BigDecimal getSunCount() {
		return this.sunCount;
	}

	public void setSunCount(BigDecimal sunCount) {
		this.sunCount = sunCount;
	}

	public BigDecimal getThuCount() {
		return this.thuCount;
	}

	public void setThuCount(BigDecimal thuCount) {
		this.thuCount = thuCount;
	}

	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getTueCount() {
		return this.tueCount;
	}

	public void setTueCount(BigDecimal tueCount) {
		this.tueCount = tueCount;
	}

	public BigDecimal getWedCount() {
		return this.wedCount;
	}

	public void setWedCount(BigDecimal wedCount) {
		this.wedCount = wedCount;
	}

	public double getYear() {
		return this.year;
	}

	public void setYear(double year) {
		this.year = year;
	}

}