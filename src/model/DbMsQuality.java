package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the db_ms_quality database table.
 * 
 */
//@Entity
@Table(name="db_ms_quality")
@NamedQuery(name="DbMsQuality.findAll", query="SELECT d FROM DbMsQuality d")
public class DbMsQuality implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal cod;

	@Column(name="cu_tot")
	private BigDecimal cuTot;

	private BigDecimal eh;

	private Timestamp mdate;

	private BigDecimal micron63;

	private String scode;

	@Column(name="station_id")
	private BigDecimal stationId;

	private BigDecimal time;

	private BigDecimal tn;

	private BigDecimal toc;

	private BigDecimal tp;

	public DbMsQuality() {
	}

	public BigDecimal getCod() {
		return this.cod;
	}

	public void setCod(BigDecimal cod) {
		this.cod = cod;
	}

	public BigDecimal getCuTot() {
		return this.cuTot;
	}

	public void setCuTot(BigDecimal cuTot) {
		this.cuTot = cuTot;
	}

	public BigDecimal getEh() {
		return this.eh;
	}

	public void setEh(BigDecimal eh) {
		this.eh = eh;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getMicron63() {
		return this.micron63;
	}

	public void setMicron63(BigDecimal micron63) {
		this.micron63 = micron63;
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

	public BigDecimal getTn() {
		return this.tn;
	}

	public void setTn(BigDecimal tn) {
		this.tn = tn;
	}

	public BigDecimal getToc() {
		return this.toc;
	}

	public void setToc(BigDecimal toc) {
		this.toc = toc;
	}

	public BigDecimal getTp() {
		return this.tp;
	}

	public void setTp(BigDecimal tp) {
		this.tp = tp;
	}

}