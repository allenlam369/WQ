package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the hs_field database table.
 * 
 */
@Entity
@Table(name="hs_field")
@NamedQuery(name="HsField.findAll", query="SELECT h FROM HsField h")
public class HsField implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mwvisit_id")
	private String mwvisitId;

	@Column(name="air_temp")
	private BigDecimal airTemp;

	@Column(name="fish_kill")
	private String fishKill;

	@Column(name="mwvisit_id_old")
	private String mwvisitIdOld;

	@Column(name="sea_col")
	private String seaCol;

	@Column(name="sea_cond")
	private String seaCond;

	private BigDecimal secchidisc;

	@Column(name="sol_rad")
	private BigDecimal solRad;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	private String weather;

	@Column(name="wind_dir")
	private BigDecimal windDir;

	@Column(name="wind_sp")
	private BigDecimal windSp;

	public HsField() {
	}

	public String getMwvisitId() {
		return this.mwvisitId;
	}

	public void setMwvisitId(String mwvisitId) {
		this.mwvisitId = mwvisitId;
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

	public String getMwvisitIdOld() {
		return this.mwvisitIdOld;
	}

	public void setMwvisitIdOld(String mwvisitIdOld) {
		this.mwvisitIdOld = mwvisitIdOld;
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

	public BigDecimal getSecchidisc() {
		return this.secchidisc;
	}

	public void setSecchidisc(BigDecimal secchidisc) {
		this.secchidisc = secchidisc;
	}

	public BigDecimal getSolRad() {
		return this.solRad;
	}

	public void setSolRad(BigDecimal solRad) {
		this.solRad = solRad;
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

}