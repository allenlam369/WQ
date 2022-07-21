package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ts_clab_bu_cal database table.
 * 
 */
//@Entity
@Table(name="ts_clab_bu_cal")
@NamedQuery(name="TsClabBuCal.findAll", query="SELECT t FROM TsClabBuCal t")
public class TsClabBuCal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="l_pfosf")
	private String lPfosf;

	private BigDecimal pfosf;

	@Column(name="tsvisit_id")
	private String tsvisitId;

	private String type;

	public TsClabBuCal() {
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

	public String getTsvisitId() {
		return this.tsvisitId;
	}

	public void setTsvisitId(String tsvisitId) {
		this.tsvisitId = tsvisitId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}