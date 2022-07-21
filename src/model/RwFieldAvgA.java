package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_field_avg_a database table.
 * 
 */
//@Entity
@Table(name="rw_field_avg_a")
@NamedQuery(name="RwFieldAvgA.findAll", query="SELECT r FROM RwFieldAvgA r")
public class RwFieldAvgA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cond_avg")
	private BigDecimal condAvg;

	@Column(name="do_avg")
	private BigDecimal doAvg;

	@Column(name="dos_avg")
	private BigDecimal dosAvg;

	@Column(name="l_cond_avg")
	private String lCondAvg;

	@Column(name="l_do_avg")
	private String lDoAvg;

	@Column(name="l_dos_avg")
	private String lDosAvg;

	@Column(name="l_ph_avg")
	private String lPhAvg;

	@Column(name="l_sal_avg")
	private String lSalAvg;

	@Column(name="l_turb_avg")
	private String lTurbAvg;

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

	public RwFieldAvgA() {
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

	public String getLCondAvg() {
		return this.lCondAvg;
	}

	public void setLCondAvg(String lCondAvg) {
		this.lCondAvg = lCondAvg;
	}

	public String getLDoAvg() {
		return this.lDoAvg;
	}

	public void setLDoAvg(String lDoAvg) {
		this.lDoAvg = lDoAvg;
	}

	public String getLDosAvg() {
		return this.lDosAvg;
	}

	public void setLDosAvg(String lDosAvg) {
		this.lDosAvg = lDosAvg;
	}

	public String getLPhAvg() {
		return this.lPhAvg;
	}

	public void setLPhAvg(String lPhAvg) {
		this.lPhAvg = lPhAvg;
	}

	public String getLSalAvg() {
		return this.lSalAvg;
	}

	public void setLSalAvg(String lSalAvg) {
		this.lSalAvg = lSalAvg;
	}

	public String getLTurbAvg() {
		return this.lTurbAvg;
	}

	public void setLTurbAvg(String lTurbAvg) {
		this.lTurbAvg = lTurbAvg;
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