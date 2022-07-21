package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_tide_station database table.
 * 
 */
@Entity
@Table(name="bm_tide_station")
@NamedQuery(name="BmTideStation.findAll", query="SELECT b FROM BmTideStation b")
public class BmTideStation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tide_station_code")
	private String tideStationCode;

	private BigDecimal easting;

	private BigDecimal latitude;

	private String location;

	private BigDecimal longitude;

	private BigDecimal northing;

	@Column(name="station_fullname")
	private String stationFullname;

	@Column(name="station_height")
	private BigDecimal stationHeight;

	@Column(name="station_name")
	private String stationName;

	@Column(name="sz_id")
	private String szId;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	@Column(name="wcz_code")
	private BigDecimal wczCode;

	public BmTideStation() {
	}

	public String getTideStationCode() {
		return this.tideStationCode;
	}

	public void setTideStationCode(String tideStationCode) {
		this.tideStationCode = tideStationCode;
	}

	public BigDecimal getEasting() {
		return this.easting;
	}

	public void setEasting(BigDecimal easting) {
		this.easting = easting;
	}

	public BigDecimal getLatitude() {
		return this.latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
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

	public String getStationFullname() {
		return this.stationFullname;
	}

	public void setStationFullname(String stationFullname) {
		this.stationFullname = stationFullname;
	}

	public BigDecimal getStationHeight() {
		return this.stationHeight;
	}

	public void setStationHeight(BigDecimal stationHeight) {
		this.stationHeight = stationHeight;
	}

	public String getStationName() {
		return this.stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getSzId() {
		return this.szId;
	}

	public void setSzId(String szId) {
		this.szId = szId;
	}

	public BigDecimal getValidCode() {
		return this.validCode;
	}

	public void setValidCode(BigDecimal validCode) {
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

	public BigDecimal getWczCode() {
		return this.wczCode;
	}

	public void setWczCode(BigDecimal wczCode) {
		this.wczCode = wczCode;
	}

}