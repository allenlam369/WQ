package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_field_max_a database table.
 * 
 */
//@Entity
@Table(name="rw_field_max_a")
@NamedQuery(name="RwFieldMaxA.findAll", query="SELECT r FROM RwFieldMaxA r")
public class RwFieldMaxA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cond_max")
	private BigDecimal condMax;

	@Column(name="do_max")
	private BigDecimal doMax;

	@Column(name="dos_max")
	private BigDecimal dosMax;

	@Column(name="l_cond_max")
	private String lCondMax;

	@Column(name="l_do_max")
	private String lDoMax;

	@Column(name="l_dos_max")
	private String lDosMax;

	@Column(name="l_ph_max")
	private String lPhMax;

	@Column(name="l_sal_max")
	private String lSalMax;

	@Column(name="l_turb_max")
	private String lTurbMax;

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

	public RwFieldMaxA() {
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

	public String getLCondMax() {
		return this.lCondMax;
	}

	public void setLCondMax(String lCondMax) {
		this.lCondMax = lCondMax;
	}

	public String getLDoMax() {
		return this.lDoMax;
	}

	public void setLDoMax(String lDoMax) {
		this.lDoMax = lDoMax;
	}

	public String getLDosMax() {
		return this.lDosMax;
	}

	public void setLDosMax(String lDosMax) {
		this.lDosMax = lDosMax;
	}

	public String getLPhMax() {
		return this.lPhMax;
	}

	public void setLPhMax(String lPhMax) {
		this.lPhMax = lPhMax;
	}

	public String getLSalMax() {
		return this.lSalMax;
	}

	public void setLSalMax(String lSalMax) {
		this.lSalMax = lSalMax;
	}

	public String getLTurbMax() {
		return this.lTurbMax;
	}

	public void setLTurbMax(String lTurbMax) {
		this.lTurbMax = lTurbMax;
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