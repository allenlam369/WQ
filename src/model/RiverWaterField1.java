package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the river_water_field1 database table.
 * 
 */
//@Entity
@Table(name="river_water_field1")
@NamedQuery(name="RiverWaterField1.findAll", query="SELECT r FROM RiverWaterField1 r")
public class RiverWaterField1 implements Serializable {
	private static final long serialVersionUID = 1L;

	private String color;

	private BigDecimal cond;

	@Column(name="\"DO\"")
	private BigDecimal do_;

	private BigDecimal dos;

	@Column(name="l_cond")
	private String lCond;

	@Column(name="l_do")
	private String lDo;

	@Column(name="l_dos")
	private String lDos;

	@Column(name="l_ph")
	private String lPh;

	@Column(name="l_sal")
	private String lSal;

	@Column(name="l_turb")
	private String lTurb;

	private Timestamp mdate;

	private BigDecimal ph;

	private String rainfall;

	private String river;

	private BigDecimal sal;

	@Column(name="sample_no")
	private Integer sampleNo;

	private String smell;

	private String station;

	private BigDecimal stime;

	private String subzone;

	private BigDecimal temper;

	private String tide;

	private BigDecimal turb;

	@Column(name="valid_code")
	private Integer validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	private String weather;

	private String zone;

	public RiverWaterField1() {
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public BigDecimal getCond() {
		return this.cond;
	}

	public void setCond(BigDecimal cond) {
		this.cond = cond;
	}

	public BigDecimal getDo_() {
		return this.do_;
	}

	public void setDo_(BigDecimal do_) {
		this.do_ = do_;
	}

	public BigDecimal getDos() {
		return this.dos;
	}

	public void setDos(BigDecimal dos) {
		this.dos = dos;
	}

	public String getLCond() {
		return this.lCond;
	}

	public void setLCond(String lCond) {
		this.lCond = lCond;
	}

	public String getLDo() {
		return this.lDo;
	}

	public void setLDo(String lDo) {
		this.lDo = lDo;
	}

	public String getLDos() {
		return this.lDos;
	}

	public void setLDos(String lDos) {
		this.lDos = lDos;
	}

	public String getLPh() {
		return this.lPh;
	}

	public void setLPh(String lPh) {
		this.lPh = lPh;
	}

	public String getLSal() {
		return this.lSal;
	}

	public void setLSal(String lSal) {
		this.lSal = lSal;
	}

	public String getLTurb() {
		return this.lTurb;
	}

	public void setLTurb(String lTurb) {
		this.lTurb = lTurb;
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

	public String getRainfall() {
		return this.rainfall;
	}

	public void setRainfall(String rainfall) {
		this.rainfall = rainfall;
	}

	public String getRiver() {
		return this.river;
	}

	public void setRiver(String river) {
		this.river = river;
	}

	public BigDecimal getSal() {
		return this.sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

	public Integer getSampleNo() {
		return this.sampleNo;
	}

	public void setSampleNo(Integer sampleNo) {
		this.sampleNo = sampleNo;
	}

	public String getSmell() {
		return this.smell;
	}

	public void setSmell(String smell) {
		this.smell = smell;
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

	public BigDecimal getTemper() {
		return this.temper;
	}

	public void setTemper(BigDecimal temper) {
		this.temper = temper;
	}

	public String getTide() {
		return this.tide;
	}

	public void setTide(String tide) {
		this.tide = tide;
	}

	public BigDecimal getTurb() {
		return this.turb;
	}

	public void setTurb(BigDecimal turb) {
		this.turb = turb;
	}

	public Integer getValidCode() {
		return this.validCode;
	}

	public void setValidCode(Integer validCode) {
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

	public String getWeather() {
		return this.weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}