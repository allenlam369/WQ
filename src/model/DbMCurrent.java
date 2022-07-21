package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the db_m_current database table.
 * 
 */
//@Entity
@Table(name="db_m_current")
@NamedQuery(name="DbMCurrent.findAll", query="SELECT d FROM DbMCurrent d")
public class DbMCurrent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="depth_code")
	private String depthCode;

	private BigDecimal direction;

	private Timestamp mdate;

	@Column(name="sample_depth")
	private BigDecimal sampleDepth;

	private String scode;

	private BigDecimal speed;

	@Column(name="station_id")
	private BigDecimal stationId;

	private BigDecimal time;

	@Column(name="w_depth")
	private BigDecimal wDepth;

	public DbMCurrent() {
	}

	public String getDepthCode() {
		return this.depthCode;
	}

	public void setDepthCode(String depthCode) {
		this.depthCode = depthCode;
	}

	public BigDecimal getDirection() {
		return this.direction;
	}

	public void setDirection(BigDecimal direction) {
		this.direction = direction;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getSampleDepth() {
		return this.sampleDepth;
	}

	public void setSampleDepth(BigDecimal sampleDepth) {
		this.sampleDepth = sampleDepth;
	}

	public String getScode() {
		return this.scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}

	public BigDecimal getSpeed() {
		return this.speed;
	}

	public void setSpeed(BigDecimal speed) {
		this.speed = speed;
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

	public BigDecimal getWDepth() {
		return this.wDepth;
	}

	public void setWDepth(BigDecimal wDepth) {
		this.wDepth = wDepth;
	}

}