package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the river_sediment_glabn1 database table.
 * 
 */
//@Entity
@Table(name="river_sediment_glabn1")
@NamedQuery(name="RiverSedimentGlabn1.findAll", query="SELECT r FROM RiverSedimentGlabn1 r")
public class RiverSedimentGlabn1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="l_tc")
	private String lTc;

	@Column(name="l_ts")
	private String lTs;

	@Column(name="l_tvs")
	private String lTvs;

	private Timestamp mdate;

	private String river;

	@Column(name="sam_no")
	private BigDecimal samNo;

	private String station;

	private String subzone;

	private BigDecimal tc;

	private BigDecimal ts;

	private BigDecimal tvs;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	private String zone;

	public RiverSedimentGlabn1() {
	}

	public String getLTc() {
		return this.lTc;
	}

	public void setLTc(String lTc) {
		this.lTc = lTc;
	}

	public String getLTs() {
		return this.lTs;
	}

	public void setLTs(String lTs) {
		this.lTs = lTs;
	}

	public String getLTvs() {
		return this.lTvs;
	}

	public void setLTvs(String lTvs) {
		this.lTvs = lTvs;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public String getRiver() {
		return this.river;
	}

	public void setRiver(String river) {
		this.river = river;
	}

	public BigDecimal getSamNo() {
		return this.samNo;
	}

	public void setSamNo(BigDecimal samNo) {
		this.samNo = samNo;
	}

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getSubzone() {
		return this.subzone;
	}

	public void setSubzone(String subzone) {
		this.subzone = subzone;
	}

	public BigDecimal getTc() {
		return this.tc;
	}

	public void setTc(BigDecimal tc) {
		this.tc = tc;
	}

	public BigDecimal getTs() {
		return this.ts;
	}

	public void setTs(BigDecimal ts) {
		this.ts = ts;
	}

	public BigDecimal getTvs() {
		return this.tvs;
	}

	public void setTvs(BigDecimal tvs) {
		this.tvs = tvs;
	}

	public BigDecimal getViewNo() {
		return this.viewNo;
	}

	public void setViewNo(BigDecimal viewNo) {
		this.viewNo = viewNo;
	}

	public String getWcz() {
		return this.wcz;
	}

	public void setWcz(String wcz) {
		this.wcz = wcz;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}