package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_tide database table.
 * 
 */
@Entity
@Table(name="bm_tide")
@NamedQuery(name="BmTide.findAll", query="SELECT b FROM BmTide b")
public class BmTide implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BmTidePK id;

	private Timestamp date;

	private BigDecimal hour;

	private BigDecimal stime;

	@Column(name="tide_height")
	private BigDecimal tideHeight;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public BmTide() {
	}

	public BmTidePK getId() {
		return this.id;
	}

	public void setId(BmTidePK id) {
		this.id = id;
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