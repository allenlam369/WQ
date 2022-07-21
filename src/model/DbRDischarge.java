package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the db_r_discharge database table.
 * 
 */
//@Entity
@Table(name="db_r_discharge")
@NamedQuery(name="DbRDischarge.findAll", query="SELECT d FROM DbRDischarge d")
public class DbRDischarge implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="d_value")
	private BigDecimal dValue;

	private Timestamp mdate;

	private String scode;

	@Column(name="station_id")
	private BigDecimal stationId;

	private BigDecimal time;

	public DbRDischarge() {
	}

	public BigDecimal getDValue() {
		return this.dValue;
	}

	public void setDValue(BigDecimal dValue) {
		this.dValue = dValue;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
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

	public BigDecimal getTime() {
		return this.time;
	}

	public void setTime(BigDecimal time) {
		this.time = time;
	}

}