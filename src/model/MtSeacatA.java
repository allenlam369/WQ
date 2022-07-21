package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mt_seacat_a database table.
 * 
 */
//@Entity
@Table(name="mt_seacat_a")
@NamedQuery(name="MtSeacatA.findAll", query="SELECT m FROM MtSeacatA m")
public class MtSeacatA implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal cond;

	@Column(name="\"DO\"")
	private BigDecimal do_;

	@Column(name="do_sat")
	private BigDecimal doSat;

	private BigDecimal flscufa;

	@Column(name="mwvisit_id")
	private String mwvisitId;

	private BigDecimal par;

	private BigDecimal ph;

	private BigDecimal sal;

	private BigDecimal temper;

	private BigDecimal turb;

	public MtSeacatA() {
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

}