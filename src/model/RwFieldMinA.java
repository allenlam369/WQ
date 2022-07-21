package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_field_min_a database table.
 * 
 */
//@Entity
@Table(name="rw_field_min_a")
@NamedQuery(name="RwFieldMinA.findAll", query="SELECT r FROM RwFieldMinA r")
public class RwFieldMinA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cond_min")
	private BigDecimal condMin;

	@Column(name="do_min")
	private BigDecimal doMin;

	@Column(name="dos_min")
	private BigDecimal dosMin;

	@Column(name="l_cond_min")
	private String lCondMin;

	@Column(name="l_do_min")
	private String lDoMin;

	@Column(name="l_dos_min")
	private String lDosMin;

	@Column(name="l_ph_min")
	private String lPhMin;

	@Column(name="l_sal_min")
	private String lSalMin;

	@Column(name="l_turb_min")
	private String lTurbMin;

	@Column(name="ph_min")
	private BigDecimal phMin;

	@Column(name="sal_min")
	private BigDecimal salMin;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="temper_min")
	private BigDecimal temperMin;

	private Long total;

	@Column(name="turb_min")
	private BigDecimal turbMin;

	private double yr;

	public RwFieldMinA() {
	}

	public BigDecimal getCondMin() {
		return this.condMin;
	}

	public void setCondMin(BigDecimal condMin) {
		this.condMin = condMin;
	}

	public BigDecimal getDoMin() {
		return this.doMin;
	}

	public void setDoMin(BigDecimal doMin) {
		this.doMin = doMin;
	}

	public BigDecimal getDosMin() {
		return this.dosMin;
	}

	public void setDosMin(BigDecimal dosMin) {
		this.dosMin = dosMin;
	}

	public String getLCondMin() {
		return this.lCondMin;
	}

	public void setLCondMin(String lCondMin) {
		this.lCondMin = lCondMin;
	}

	public String getLDoMin() {
		return this.lDoMin;
	}

	public void setLDoMin(String lDoMin) {
		this.lDoMin = lDoMin;
	}

	public String getLDosMin() {
		return this.lDosMin;
	}

	public void setLDosMin(String lDosMin) {
		this.lDosMin = lDosMin;
	}

	public String getLPhMin() {
		return this.lPhMin;
	}

	public void setLPhMin(String lPhMin) {
		this.lPhMin = lPhMin;
	}

	public String getLSalMin() {
		return this.lSalMin;
	}

	public void setLSalMin(String lSalMin) {
		this.lSalMin = lSalMin;
	}

	public String getLTurbMin() {
		return this.lTurbMin;
	}

	public void setLTurbMin(String lTurbMin) {
		this.lTurbMin = lTurbMin;
	}

	public BigDecimal getPhMin() {
		return this.phMin;
	}

	public void setPhMin(BigDecimal phMin) {
		this.phMin = phMin;
	}

	public BigDecimal getSalMin() {
		return this.salMin;
	}

	public void setSalMin(BigDecimal salMin) {
		this.salMin = salMin;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getTemperMin() {
		return this.temperMin;
	}

	public void setTemperMin(BigDecimal temperMin) {
		this.temperMin = temperMin;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public BigDecimal getTurbMin() {
		return this.turbMin;
	}

	public void setTurbMin(BigDecimal turbMin) {
		this.turbMin = turbMin;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

}