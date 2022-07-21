package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the db_m_particle database table.
 * 
 */
//@Entity
@Table(name="db_m_particle")
@NamedQuery(name="DbMParticle.findAll", query="SELECT d FROM DbMParticle d")
public class DbMParticle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="dry_wt")
	private BigDecimal dryWt;

	private Timestamp mdate;

	@Column(name="micron_10")
	private BigDecimal micron10;

	@Column(name="micron_25")
	private BigDecimal micron25;

	@Column(name="micron_50")
	private BigDecimal micron50;

	@Column(name="micron_63")
	private BigDecimal micron63;

	@Column(name="micron_75")
	private BigDecimal micron75;

	@Column(name="micron_90")
	private BigDecimal micron90;

	@Column(name="station_id")
	private BigDecimal stationId;

	public DbMParticle() {
	}

	public BigDecimal getDryWt() {
		return this.dryWt;
	}

	public void setDryWt(BigDecimal dryWt) {
		this.dryWt = dryWt;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getMicron10() {
		return this.micron10;
	}

	public void setMicron10(BigDecimal micron10) {
		this.micron10 = micron10;
	}

	public BigDecimal getMicron25() {
		return this.micron25;
	}

	public void setMicron25(BigDecimal micron25) {
		this.micron25 = micron25;
	}

	public BigDecimal getMicron50() {
		return this.micron50;
	}

	public void setMicron50(BigDecimal micron50) {
		this.micron50 = micron50;
	}

	public BigDecimal getMicron63() {
		return this.micron63;
	}

	public void setMicron63(BigDecimal micron63) {
		this.micron63 = micron63;
	}

	public BigDecimal getMicron75() {
		return this.micron75;
	}

	public void setMicron75(BigDecimal micron75) {
		this.micron75 = micron75;
	}

	public BigDecimal getMicron90() {
		return this.micron90;
	}

	public void setMicron90(BigDecimal micron90) {
		this.micron90 = micron90;
	}

	public BigDecimal getStationId() {
		return this.stationId;
	}

	public void setStationId(BigDecimal stationId) {
		this.stationId = stationId;
	}

}