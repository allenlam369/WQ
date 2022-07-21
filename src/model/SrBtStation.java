package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the sr_bt_station database table.
 * 
 */
//@Entity
@Table(name="sr_bt_station")
@NamedQuery(name="SrBtStation.findAll", query="SELECT s FROM SrBtStation s")
public class SrBtStation implements Serializable {
	private static final long serialVersionUID = 1L;

	private String active;

	@Column(name="delete_date")
	private Timestamp deleteDate;

	@Column(name="delete_user")
	private String deleteUser;

	private BigDecimal easting;

	private BigDecimal latitude;

	private BigDecimal longitude;

	private BigDecimal northing;

	private String sampling;

	@Column(name="sampling_area")
	private String samplingArea;

	@Column(name="station_id")
	private String stationId;

	@Column(name="station_name")
	private String stationName;

	@Column(name="trawl_direction")
	private String trawlDirection;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	private String wcz;

	public SrBtStation() {
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Timestamp getDeleteDate() {
		return this.deleteDate;
	}

	public void setDeleteDate(Timestamp deleteDate) {
		this.deleteDate = deleteDate;
	}

	public String getDeleteUser() {
		return this.deleteUser;
	}

	public void setDeleteUser(String deleteUser) {
		this.deleteUser = deleteUser;
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

	public String getSampling() {
		return this.sampling;
	}

	public void setSampling(String sampling) {
		this.sampling = sampling;
	}

	public String getSamplingArea() {
		return this.samplingArea;
	}

	public void setSamplingArea(String samplingArea) {
		this.samplingArea = samplingArea;
	}

	public String getStationId() {
		return this.stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getStationName() {
		return this.stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getTrawlDirection() {
		return this.trawlDirection;
	}

	public void setTrawlDirection(String trawlDirection) {
		this.trawlDirection = trawlDirection;
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

	public String getWcz() {
		return this.wcz;
	}

	public void setWcz(String wcz) {
		this.wcz = wcz;
	}

}