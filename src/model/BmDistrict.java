package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_district database table.
 * 
 */
@Entity
@Table(name="bm_district")
@NamedQuery(name="BmDistrict.findAll", query="SELECT b FROM BmDistrict b")
public class BmDistrict implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="district_code")
	private String districtCode;

	@Column(name="dc_district_code")
	private String dcDistrictCode;

	@Column(name="district_name")
	private String districtName;

	@Column(name="district_name_c")
	private String districtNameC;

	@Column(name="district_name_display")
	private String districtNameDisplay;

	@Column(name="hotline_district")
	private String hotlineDistrict;

	@Column(name="hotline_district_c")
	private String hotlineDistrictC;

	@Column(name="lcsd_district_office")
	private String lcsdDistrictOffice;

	@Column(name="valid_code")
	private Integer validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public BmDistrict() {
	}

	public String getDistrictCode() {
		return this.districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
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

	public String getDistrictNameDisplay() {
		return this.districtNameDisplay;
	}

	public void setDistrictNameDisplay(String districtNameDisplay) {
		this.districtNameDisplay = districtNameDisplay;
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