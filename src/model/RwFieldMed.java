package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_field_med database table.
 * 
 */
//@Entity
@Table(name="rw_field_med")
@NamedQuery(name="RwFieldMed.findAll", query="SELECT r FROM RwFieldMed r")
public class RwFieldMed implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cond_med")
	private BigDecimal condMed;

	@Column(name="do_med")
	private BigDecimal doMed;

	@Column(name="dos_med")
	private BigDecimal dosMed;

	@Column(name="ph_med")
	private BigDecimal phMed;

	@Column(name="sal_med")
	private BigDecimal salMed;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="temper_med")
	private BigDecimal temperMed;

	private Long total;

	@Column(name="turb_med")
	private BigDecimal turbMed;

	private double yr;

	private double yyyy;

	public RwFieldMed() {
	}

	public BigDecimal getCondMed() {
		return this.condMed;
	}

	public void setCondMed(BigDecimal condMed) {
		this.condMed = condMed;
	}

	public BigDecimal getDoMed() {
		return this.doMed;
	}

	public void setDoMed(BigDecimal doMed) {
		this.doMed = doMed;
	}

	public BigDecimal getDosMed() {
		return this.dosMed;
	}

	public void setDosMed(BigDecimal dosMed) {
		this.dosMed = dosMed;
	}

	public BigDecimal getPhMed() {
		return this.phMed;
	}

	public void setPhMed(BigDecimal phMed) {
		this.phMed = phMed;
	}

	public BigDecimal getSalMed() {
		return this.salMed;
	}

	public void setSalMed(BigDecimal salMed) {
		this.salMed = salMed;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getTemperMed() {
		return this.temperMed;
	}

	public void setTemperMed(BigDecimal temperMed) {
		this.temperMed = temperMed;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public BigDecimal getTurbMed() {
		return this.turbMed;
	}

	public void setTurbMed(BigDecimal turbMed) {
		this.turbMed = turbMed;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

	public double getYyyy() {
		return this.yyyy;
	}

	public void setYyyy(double yyyy) {
		this.yyyy = yyyy;
	}

}