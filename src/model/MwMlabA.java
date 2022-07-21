package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mw_mlab_a database table.
 * 
 */
//@Entity
@Table(name="mw_mlab_a")
@NamedQuery(name="MwMlabA.findAll", query="SELECT m FROM MwMlabA m")
public class MwMlabA implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal bod5;

	private BigDecimal ecoli;

	private BigDecimal fc;

	@Column(name="mwvisit_id")
	private String mwvisitId;

	private BigDecimal ph;

	private BigDecimal turb;

	public MwMlabA() {
	}

	public BigDecimal getBod5() {
		return this.bod5;
	}

	public void setBod5(BigDecimal bod5) {
		this.bod5 = bod5;
	}

	public BigDecimal getEcoli() {
		return this.ecoli;
	}

	public void setEcoli(BigDecimal ecoli) {
		this.ecoli = ecoli;
	}

	public BigDecimal getFc() {
		return this.fc;
	}

	public void setFc(BigDecimal fc) {
		this.fc = fc;
	}

	public String getMwvisitId() {
		return this.mwvisitId;
	}

	public void setMwvisitId(String mwvisitId) {
		this.mwvisitId = mwvisitId;
	}

	public BigDecimal getPh() {
		return this.ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public BigDecimal getTurb() {
		return this.turb;
	}

	public void setTurb(BigDecimal turb) {
		this.turb = turb;
	}

}