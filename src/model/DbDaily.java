package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the db_daily database table.
 * 
 */
//@Entity
@Table(name="db_daily")
@NamedQuery(name="DbDaily.findAll", query="SELECT d FROM DbDaily d")
public class DbDaily implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal evap;

	private Timestamp mdate;

	private BigDecimal solar;

	@Column(name="station_id")
	private BigDecimal stationId;

	private String statname;

	public DbDaily() {
	}

	public BigDecimal getEvap() {
		return this.evap;
	}

	public void setEvap(BigDecimal evap) {
		this.evap = evap;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getSolar() {
		return this.solar;
	}

	public void setSolar(BigDecimal solar) {
		this.solar = solar;
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