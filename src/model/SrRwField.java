package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the sr_rw_field database table.
 * 
 */
//@Entity
@Table(name="sr_rw_field")
@NamedQuery(name="SrRwField.findAll", query="SELECT s FROM SrRwField s")
public class SrRwField implements Serializable {
	private static final long serialVersionUID = 1L;

	private String color;

	private BigDecimal cond;

	@Column(name="delete_date")
	private Timestamp deleteDate;

	@Column(name="delete_user")
	private String deleteUser;

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

	private BigDecimal ph;

	private String rainfall;

	private String remark;

	@Column(name="rwvisit_id")
	private String rwvisitId;

	private BigDecimal sal;

	private String smell;

	private BigDecimal temper;

	private String tide;

	private BigDecimal turb;

	@Column(name="valid_code")
	private Integer validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	private String weather;

	public SrRwField() {
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

	public Timestamp getDeleteDate() {
		return this.deleteDate;
	}

	public void setDeleteDate(Timestamp deleteDate) {
		this.deleteDate = deleteDate;
	}

	public String getDeleteUser() {
		return this.deleteUser;
	}

	public void setDeleteUser(String deleteUser) {
		this.deleteUser = deleteUser;
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRwvisitId() {
		return this.rwvisitId;
	}

	public void setRwvisitId(String rwvisitId) {
		this.rwvisitId = rwvisitId;
	}

	public BigDecimal getSal() {
		return this.sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

	public String getSmell() {
		return this.smell;
	}

	public void setSmell(String smell) {
		this.smell = smell;
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

	public String getWeather() {
		return this.weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

}