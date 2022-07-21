package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the mw_seacat_e database table.
 * 
 */
@Entity
@Table(name="mw_seacat_e")
@NamedQuery(name="MwSeacatE.findAll", query="SELECT m FROM MwSeacatE m")
public class MwSeacatE implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MwSeacatEPK id;

	private BigDecimal cond;

	@Column(name="depth_code")
	private String depthCode;

	@Column(name="\"DO\"")
	private BigDecimal do_;

	@Column(name="do_sat")
	private BigDecimal doSat;

	private BigDecimal flscufa;

	@Column(name="mwvisit_id_old")
	private String mwvisitIdOld;

	private BigDecimal par;

	private BigDecimal ph;

	private BigDecimal sal;

	private BigDecimal temper;

	private BigDecimal turb;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public MwSeacatE() {
	}

	public MwSeacatEPK getId() {
		return this.id;
	}

	public void setId(MwSeacatEPK id) {
		this.id = id;
	}

	public BigDecimal getCond() {
		return this.cond;
	}

	public void setCond(BigDecimal cond) {
		this.cond = cond;
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

	public BigDecimal getDoSat() {
		return this.doSat;
	}

	public void setDoSat(BigDecimal doSat) {
		this.doSat = doSat;
	}

	public BigDecimal getFlscufa() {
		return this.flscufa;
	}

	public void setFlscufa(BigDecimal flscufa) {
		this.flscufa = flscufa;
	}

	public String getMwvisitIdOld() {
		return this.mwvisitIdOld;
	}

	public void setMwvisitIdOld(String mwvisitIdOld) {
		this.mwvisitIdOld = mwvisitIdOld;
	}

	public BigDecimal getPar() {
		return this.par;
	}

	public void setPar(BigDecimal par) {
		this.par = par;
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

	public BigDecimal getTemper() {
		return this.temper;
	}

	public void setTemper(BigDecimal temper) {
		this.temper = temper;
	}

	public BigDecimal getTurb() {
		return this.turb;
	}

	public void setTurb(BigDecimal turb) {
		this.turb = turb;
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

}