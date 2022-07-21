package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the marine_water_field1 database table.
 * 
 */
//@Entity
@Table(name="marine_water_field1")
@NamedQuery(name="MarineWaterField1.findAll", query="SELECT m FROM MarineWaterField1 m")
public class MarineWaterField1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="air_temp")
	private BigDecimal airTemp;

	@Column(name="fish_kill")
	private String fishKill;

	private Timestamp mdate;

	@Column(name="sam_no")
	private BigDecimal samNo;

	private BigDecimal sd;

	@Column(name="sea_col")
	private String seaCol;

	@Column(name="sea_cond")
	private String seaCond;

	@Column(name="sol_rad")
	private BigDecimal solRad;

	private String station;

	private BigDecimal stime;

	private String subzone;

	private String wcz;

	private String weather;

	@Column(name="wind_dir")
	private BigDecimal windDir;

	@Column(name="wind_sp")
	private BigDecimal windSp;

	private String zone;

	public MarineWaterField1() {
	}

	public BigDecimal getAirTemp() {
		return this.airTemp;
	}

	public void setAirTemp(BigDecimal airTemp) {
		this.airTemp = airTemp;
	}

	public String getFishKill() {
		return this.fishKill;
	}

	public void setFishKill(String fishKill) {
		this.fishKill = fishKill;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getSamNo() {
		return this.samNo;
	}

	public void setSamNo(BigDecimal samNo) {
		this.samNo = samNo;
	}

	public BigDecimal getSd() {
		return this.sd;
	}

	public void setSd(BigDecimal sd) {
		this.sd = sd;
	}

	public String getSeaCol() {
		return this.seaCol;
	}

	public void setSeaCol(String seaCol) {
		this.seaCol = seaCol;
	}

	public String getSeaCond() {
		return this.seaCond;
	}

	public void setSeaCond(String seaCond) {
		this.seaCond = seaCond;
	}

	public BigDecimal getSolRad() {
		return this.solRad;
	}

	public void setSolRad(BigDecimal solRad) {
		this.solRad = solRad;
	}

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public BigDecimal getStime() {
		return this.stime;
	}

	public void setStime(BigDecimal stime) {
		this.stime = stime;
	}

	public String getSubzone() {
		return this.subzone;
	}

	public void setSubzone(String subzone) {
		this.subzone = subzone;
	}

	public String getWcz() {
		return this.wcz;
	}

	public void setWcz(String wcz) {
		this.wcz = wcz;
	}

	public String getWeather() {
		return this.weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public BigDecimal getWindDir() {
		return this.windDir;
	}

	public void setWindDir(BigDecimal windDir) {
		this.windDir = windDir;
	}

	public BigDecimal getWindSp() {
		return this.windSp;
	}

	public void setWindSp(BigDecimal windSp) {
		this.windSp = windSp;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}