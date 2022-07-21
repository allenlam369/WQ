package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_tide3 database table.
 * 
 */
//@Entity
@Table(name="bm_tide3")
@NamedQuery(name="BmTide3.findAll", query="SELECT b FROM BmTide3 b")
public class BmTide3 implements Serializable {
	private static final long serialVersionUID = 1L;

	private Timestamp date;

	private BigDecimal hour;

	private Timestamp sdatetime;

	private BigDecimal stime;

	@Column(name="tide_height")
	private BigDecimal tideHeight;

	@Column(name="tide_station_code")
	private String tideStationCode;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public BmTide3() {
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public BigDecimal getHour() {
		return this.hour;
	}

	public void setHour(BigDecimal hour) {
		this.hour = hour;
	}

	public Timestamp getSdatetime() {
		return this.sdatetime;
	}

	public void setSdatetime(Timestamp sdatetime) {
		this.sdatetime = sdatetime;
	}

	public BigDecimal getStime() {
		return this.stime;
	}

	public void setStime(BigDecimal stime) {
		this.stime = stime;
	}

	public BigDecimal getTideHeight() {
		return this.tideHeight;
	}

	public void setTideHeight(BigDecimal tideHeight) {
		this.tideHeight = tideHeight;
	}

	public String getTideStationCode() {
		return this.tideStationCode;
	}

	public void setTideStationCode(String tideStationCode) {
		this.tideStationCode = tideStationCode;
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

}