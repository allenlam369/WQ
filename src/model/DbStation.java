package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the db_station database table.
 * 
 */
@Entity
@Table(name="db_station")
@NamedQuery(name="DbStation.findAll", query="SELECT d FROM DbStation d")
public class DbStation implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal e;

	private BigDecimal latitude;

	private BigDecimal longitude;

	private BigDecimal n;

	private String porder;

	private String scode;

	@Id
	@Column(name="station_id")
	private BigDecimal stationId;

	private String statname;

	public DbStation() {
	}

	public BigDecimal getE() {
		return this.e;
	}

	public void setE(BigDecimal e) {
		this.e = e;
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

	public BigDecimal getN() {
		return this.n;
	}

	public void setN(BigDecimal n) {
		this.n = n;
	}

	public String getPorder() {
		return this.porder;
	}

	public void setPorder(String porder) {
		this.porder = porder;
	}

	public String getScode() {
		return this.scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}

	public BigDecimal getStationId() {
		return this.stationId;
	}

	public void setStationId(BigDecimal stationId) {
		this.stationId = stationId;
	}

	public String getStatname() {
		return this.statname;
	}

	public void setStatname(String statname) {
		this.statname = statname;
	}

}