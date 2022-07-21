package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the db_mw_insitu database table.
 * 
 */
//@Entity
@Table(name="db_mw_insitu")
@NamedQuery(name="DbMwInsitu.findAll", query="SELECT d FROM DbMwInsitu d")
public class DbMwInsitu implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal cond;

	@Column(name="cond_temp")
	private BigDecimal condTemp;

	@Column(name="depth_code")
	private String depthCode;

	@Column(name="\"DO\"")
	private BigDecimal do_;

	private Timestamp mdate;

	private BigDecimal ph;

	private BigDecimal sal;

	@Column(name="sample_depth")
	private BigDecimal sampleDepth;

	private String scode;

	@Column(name="station_id")
	private BigDecimal stationId;

	private String statname;

	private BigDecimal temp;

	private BigDecimal time;

	private BigDecimal turb;

	@Column(name="w_depth")
	private BigDecimal wDepth;

	public DbMwInsitu() {
	}

	public BigDecimal getCond() {
		return this.cond;
	}

	public void setCond(BigDecimal cond) {
		this.cond = cond;
	}

	public BigDecimal getCondTemp() {
		return this.condTemp;
	}

	public void setCondTemp(BigDecimal condTemp) {
		this.condTemp = condTemp;
	}

	public String getDepthCode() {
		return this.depthCode;
	}

	public void setDepthCode(String depthCode) {
		this.depthCode = depthCode;
	}

	public BigDecimal getDo_() {
		return this.do_;
	}

	public void setDo_(BigDecimal do_) {
		this.do_ = do_;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getPh() {
		return this.ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public BigDecimal getSal() {
		return this.sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
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

	public BigDecimal getTemp() {
		return this.temp;
	}

	public void setTemp(BigDecimal temp) {
		this.temp = temp;
	}

	public BigDecimal getTime() {
		return this.time;
	}

	public void setTime(BigDecimal time) {
		this.time = time;
	}

	public BigDecimal getTurb() {
		return this.turb;
	}

	public void setTurb(BigDecimal turb) {
		this.turb = turb;
	}

	public BigDecimal getWDepth() {
		return this.wDepth;
	}

	public void setWDepth(BigDecimal wDepth) {
		this.wDepth = wDepth;
	}

}