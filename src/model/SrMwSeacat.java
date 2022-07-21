package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the sr_mw_seacat database table.
 * 
 */
//@Entity
@Table(name="sr_mw_seacat")
@NamedQuery(name="SrMwSeacat.findAll", query="SELECT s FROM SrMwSeacat s")
public class SrMwSeacat implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal cond;

	@Column(name="delete_date")
	private Timestamp deleteDate;

	@Column(name="delete_user")
	private String deleteUser;

	private BigDecimal depth;

	@Column(name="depth_code")
	private String depthCode;

	@Column(name="\"DO\"")
	private BigDecimal do_;

	@Column(name="do_sat")
	private BigDecimal doSat;

	private BigDecimal flscufa;

	@Column(name="mwvisit_id")
	private String mwvisitId;

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

	public SrMwSeacat() {
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

	public BigDecimal getDepth() {
		return this.depth;
	}

	public void setDepth(BigDecimal depth) {
		this.depth = depth;
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

	public String getMwvisitId() {
		return this.mwvisitId;
	}

	public void setMwvisitId(String mwvisitId) {
		this.mwvisitId = mwvisitId;
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