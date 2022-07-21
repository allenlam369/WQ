package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_field_max database table.
 * 
 */
//@Entity
@Table(name="rw_field_max")
@NamedQuery(name="RwFieldMax.findAll", query="SELECT r FROM RwFieldMax r")
public class RwFieldMax implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cond_max")
	private BigDecimal condMax;

	@Column(name="do_max")
	private BigDecimal doMax;

	@Column(name="dos_max")
	private BigDecimal dosMax;

	@Column(name="ph_max")
	private BigDecimal phMax;

	@Column(name="sal_max")
	private BigDecimal salMax;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="temper_max")
	private BigDecimal temperMax;

	private Long total;

	@Column(name="turb_max")
	private BigDecimal turbMax;

	private double yr;

	public RwFieldMax() {
	}

	public BigDecimal getCondMax() {
		return this.condMax;
	}

	public void setCondMax(BigDecimal condMax) {
		this.condMax = condMax;
	}

	public BigDecimal getDoMax() {
		return this.doMax;
	}

	public void setDoMax(BigDecimal doMax) {
		this.doMax = doMax;
	}

	public BigDecimal getDosMax() {
		return this.dosMax;
	}

	public void setDosMax(BigDecimal dosMax) {
		this.dosMax = dosMax;
	}

	public BigDecimal getPhMax() {
		return this.phMax;
	}

	public void setPhMax(BigDecimal phMax) {
		this.phMax = phMax;
	}

	public BigDecimal getSalMax() {
		return this.salMax;
	}

	public void setSalMax(BigDecimal salMax) {
		this.salMax = salMax;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getTemperMax() {
		return this.temperMax;
	}

	public void setTemperMax(BigDecimal temperMax) {
		this.temperMax = temperMax;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public BigDecimal getTurbMax() {
		return this.turbMax;
	}

	public void setTurbMax(BigDecimal turbMax) {
		this.turbMax = turbMax;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

}