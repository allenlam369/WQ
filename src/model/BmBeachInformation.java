package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bm_beach_information database table.
 * 
 */
//@Entity
@Table(name="bm_beach_information")
@NamedQuery(name="BmBeachInformation.findAll", query="SELECT b FROM BmBeachInformation b")
public class BmBeachInformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="beach_code")
	private String beachCode;

	@Column(name="beach_group")
	private String beachGroup;

	@Column(name="beach_name")
	private String beachName;

	@Column(name="chinese_name")
	private String chineseName;

	private String closed;

	@Column(name="dc_district_code")
	private String dcDistrictCode;

	@Column(name="district_code")
	private String districtCode;

	@Column(name="district_name")
	private String districtName;

	@Column(name="district_name_c")
	private String districtNameC;

	@Column(name="district_name_display")
	private String districtNameDisplay;

	@Column(name="district_order")
	private String districtOrder;

	private BigDecimal easting;

	@Column(name="freshwater_f1")
	private String freshwaterF1;

	@Column(name="freshwater_f2")
	private String freshwaterF2;

	@Column(name="freshwater_f3")
	private String freshwaterF3;

	@Column(name="freshwater_f4")
	private String freshwaterF4;

	@Column(name="freshwater_f5")
	private String freshwaterF5;

	@Column(name="grade_cat")
	private BigDecimal gradeCat;

	@Column(name="hotline_district")
	private String hotlineDistrict;

	@Column(name="hotline_district_c")
	private String hotlineDistrictC;

	private BigDecimal latitude;

	@Column(name="lcsd_district_office")
	private String lcsdDistrictOffice;

	@Column(name="list_order")
	private String listOrder;

	@Column(name="list_order_2")
	private String listOrder2;

	private BigDecimal longitude;

	private BigDecimal northing;

	@Column(name="rain_station_code")
	private String rainStationCode;

	private String remark;

	@Column(name="sc_name")
	private String scName;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="source_s1")
	private String sourceS1;

	@Column(name="source_s2")
	private String sourceS2;

	@Column(name="source_s3")
	private String sourceS3;

	@Column(name="source_s4")
	private String sourceS4;

	@Column(name="source_s5")
	private String sourceS5;

	@Column(name="spoint_l")
	private String spointL;

	@Column(name="spoint_m")
	private String spointM;

	@Column(name="spoint_o")
	private String spointO;

	@Column(name="spoint_r")
	private String spointR;

	@Column(name="sz_id")
	private String szId;

	@Column(name="tide_station_code")
	private String tideStationCode;

	@Column(name="wcz_code")
	private BigDecimal wczCode;

	@Column(name="wq_order")
	private BigDecimal wqOrder;

	public BmBeachInformation() {
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

	public String getClosed() {
		return this.closed;
	}

	public void setClosed(String closed) {
		this.closed = closed;
	}

	public String getDcDistrictCode() {
		return this.dcDistrictCode;
	}

	public void setDcDistrictCode(String dcDistrictCode) {
		this.dcDistrictCode = dcDistrictCode;
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

	public String getDistrictNameC() {
		return this.districtNameC;
	}

	public void setDistrictNameC(String districtNameC) {
		this.districtNameC = districtNameC;
	}

	public String getDistrictNameDisplay() {
		return this.districtNameDisplay;
	}

	public void setDistrictNameDisplay(String districtNameDisplay) {
		this.districtNameDisplay = districtNameDisplay;
	}

	public String getDistrictOrder() {
		return this.districtOrder;
	}

	public void setDistrictOrder(String districtOrder) {
		this.districtOrder = districtOrder;
	}

	public BigDecimal getEasting() {
		return this.easting;
	}

	public void setEasting(BigDecimal easting) {
		this.easting = easting;
	}

	public String getFreshwaterF1() {
		return this.freshwaterF1;
	}

	public void setFreshwaterF1(String freshwaterF1) {
		this.freshwaterF1 = freshwaterF1;
	}

	public String getFreshwaterF2() {
		return this.freshwaterF2;
	}

	public void setFreshwaterF2(String freshwaterF2) {
		this.freshwaterF2 = freshwaterF2;
	}

	public String getFreshwaterF3() {
		return this.freshwaterF3;
	}

	public void setFreshwaterF3(String freshwaterF3) {
		this.freshwaterF3 = freshwaterF3;
	}

	public String getFreshwaterF4() {
		return this.freshwaterF4;
	}

	public void setFreshwaterF4(String freshwaterF4) {
		this.freshwaterF4 = freshwaterF4;
	}

	public String getFreshwaterF5() {
		return this.freshwaterF5;
	}

	public void setFreshwaterF5(String freshwaterF5) {
		this.freshwaterF5 = freshwaterF5;
	}

	public BigDecimal getGradeCat() {
		return this.gradeCat;
	}

	public void setGradeCat(BigDecimal gradeCat) {
		this.gradeCat = gradeCat;
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

	public BigDecimal getLatitude() {
		return this.latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public String getLcsdDistrictOffice() {
		return this.lcsdDistrictOffice;
	}

	public void setLcsdDistrictOffice(String lcsdDistrictOffice) {
		this.lcsdDistrictOffice = lcsdDistrictOffice;
	}

	public String getListOrder() {
		return this.listOrder;
	}

	public void setListOrder(String listOrder) {
		this.listOrder = listOrder;
	}

	public String getListOrder2() {
		return this.listOrder2;
	}

	public void setListOrder2(String listOrder2) {
		this.listOrder2 = listOrder2;
	}

	public BigDecimal getLongitude() {
		return this.longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public BigDecimal getNorthing() {
		return this.northing;
	}

	public void setNorthing(BigDecimal northing) {
		this.northing = northing;
	}

	public String getRainStationCode() {
		return this.rainStationCode;
	}

	public void setRainStationCode(String rainStationCode) {
		this.rainStationCode = rainStationCode;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getScName() {
		return this.scName;
	}

	public void setScName(String scName) {
		this.scName = scName;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public String getSourceS1() {
		return this.sourceS1;
	}

	public void setSourceS1(String sourceS1) {
		this.sourceS1 = sourceS1;
	}

	public String getSourceS2() {
		return this.sourceS2;
	}

	public void setSourceS2(String sourceS2) {
		this.sourceS2 = sourceS2;
	}

	public String getSourceS3() {
		return this.sourceS3;
	}

	public void setSourceS3(String sourceS3) {
		this.sourceS3 = sourceS3;
	}

	public String getSourceS4() {
		return this.sourceS4;
	}

	public void setSourceS4(String sourceS4) {
		this.sourceS4 = sourceS4;
	}

	public String getSourceS5() {
		return this.sourceS5;
	}

	public void setSourceS5(String sourceS5) {
		this.sourceS5 = sourceS5;
	}

	public String getSpointL() {
		return this.spointL;
	}

	public void setSpointL(String spointL) {
		this.spointL = spointL;
	}

	public String getSpointM() {
		return this.spointM;
	}

	public void setSpointM(String spointM) {
		this.spointM = spointM;
	}

	public String getSpointO() {
		return this.spointO;
	}

	public void setSpointO(String spointO) {
		this.spointO = spointO;
	}

	public String getSpointR() {
		return this.spointR;
	}

	public void setSpointR(String spointR) {
		this.spointR = spointR;
	}

	public String getSzId() {
		return this.szId;
	}

	public void setSzId(String szId) {
		this.szId = szId;
	}

	public String getTideStationCode() {
		return this.tideStationCode;
	}

	public void setTideStationCode(String tideStationCode) {
		this.tideStationCode = tideStationCode;
	}

	public BigDecimal getWczCode() {
		return this.wczCode;
	}

	public void setWczCode(BigDecimal wczCode) {
		this.wczCode = wczCode;
	}

	public BigDecimal getWqOrder() {
		return this.wqOrder;
	}

	public void setWqOrder(BigDecimal wqOrder) {
		this.wqOrder = wqOrder;
	}

}