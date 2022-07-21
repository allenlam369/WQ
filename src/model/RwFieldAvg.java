package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_field_avg database table.
 * 
 */
//@Entity
@Table(name="rw_field_avg")
@NamedQuery(name="RwFieldAvg.findAll", query="SELECT r FROM RwFieldAvg r")
public class RwFieldAvg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cond_avg")
	private BigDecimal condAvg;

	@Column(name="do_avg")
	private BigDecimal doAvg;

	@Column(name="dos_avg")
	private BigDecimal dosAvg;

	@Column(name="ph_avg")
	private BigDecimal phAvg;

	@Column(name="sal_avg")
	private BigDecimal salAvg;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="temper_avg")
	private BigDecimal temperAvg;

	private Long total;

	@Column(name="turb_avg")
	private BigDecimal turbAvg;

	private double yr;

	public RwFieldAvg() {
	}

	public BigDecimal getCondAvg() {
		return this.condAvg;
	}

	public void setCondAvg(BigDecimal condAvg) {
		this.condAvg = condAvg;
	}

	public BigDecimal getDoAvg() {
		return this.doAvg;
	}

	public void setDoAvg(BigDecimal doAvg) {
		this.doAvg = doAvg;
	}

	public BigDecimal getDosAvg() {
		return this.dosAvg;
	}

	public void setDosAvg(BigDecimal dosAvg) {
		this.dosAvg = dosAvg;
	}

	public BigDecimal getPhAvg() {
		return this.phAvg;
	}

	public void setPhAvg(BigDecimal phAvg) {
		this.phAvg = phAvg;
	}

	public BigDecimal getSalAvg() {
		return this.salAvg;
	}

	public void setSalAvg(BigDecimal salAvg) {
		this.salAvg = salAvg;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getTemperAvg() {
		return this.temperAvg;
	}

	public void setTemperAvg(BigDecimal temperAvg) {
		this.temperAvg = temperAvg;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public BigDecimal getTurbAvg() {
		return this.turbAvg;
	}

	public void setTurbAvg(BigDecimal turbAvg) {
		this.turbAvg = turbAvg;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

}