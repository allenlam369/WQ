package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tw_clab_bu_cal database table.
 * 
 */
//@Entity
@Table(name="tw_clab_bu_cal")
@NamedQuery(name="TwClabBuCal.findAll", query="SELECT t FROM TwClabBuCal t")
public class TwClabBuCal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="l_pfosf")
	private String lPfosf;

	private BigDecimal pfosf;

	@Column(name="twvisit_id")
	private String twvisitId;

	private String type;

	public TwClabBuCal() {
	}

	public String getLPfosf() {
		return this.lPfosf;
	}

	public void setLPfosf(String lPfosf) {
		this.lPfosf = lPfosf;
	}

	public BigDecimal getPfosf() {
		return this.pfosf;
	}

	public void setPfosf(BigDecimal pfosf) {
		this.pfosf = pfosf;
	}

	public String getTwvisitId() {
		return this.twvisitId;
	}

	public void setTwvisitId(String twvisitId) {
		this.twvisitId = twvisitId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}