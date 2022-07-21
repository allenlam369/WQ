package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_field_stdev database table.
 * 
 */
//@Entity
@Table(name="rw_field_stdev")
@NamedQuery(name="RwFieldStdev.findAll", query="SELECT r FROM RwFieldStdev r")
public class RwFieldStdev implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cond_stdev")
	private BigDecimal condStdev;

	@Column(name="do_stdev")
	private BigDecimal doStdev;

	@Column(name="dos_stdev")
	private BigDecimal dosStdev;

	@Column(name="ph_stdev")
	private BigDecimal phStdev;

	@Column(name="sal_stdev")
	private BigDecimal salStdev;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="temper_stdev")
	private BigDecimal temperStdev;

	private Long total;

	@Column(name="turb_stdev")
	private BigDecimal turbStdev;

	private double yr;

	public RwFieldStdev() {
	}

	public BigDecimal getCondStdev() {
		return this.condStdev;
	}

	public void setCondStdev(BigDecimal condStdev) {
		this.condStdev = condStdev;
	}

	public BigDecimal getDoStdev() {
		return this.doStdev;
	}

	public void setDoStdev(BigDecimal doStdev) {
		this.doStdev = doStdev;
	}

	public BigDecimal getDosStdev() {
		return this.dosStdev;
	}

	public void setDosStdev(BigDecimal dosStdev) {
		this.dosStdev = dosStdev;
	}

	public BigDecimal getPhStdev() {
		return this.phStdev;
	}

	public void setPhStdev(BigDecimal phStdev) {
		this.phStdev = phStdev;
	}

	public BigDecimal getSalStdev() {
		return this.salStdev;
	}

	public void setSalStdev(BigDecimal salStdev) {
		this.salStdev = salStdev;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getTemperStdev() {
		return this.temperStdev;
	}

	public void setTemperStdev(BigDecimal temperStdev) {
		this.temperStdev = temperStdev;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public BigDecimal getTurbStdev() {
		return this.turbStdev;
	}

	public void setTurbStdev(BigDecimal turbStdev) {
		this.turbStdev = turbStdev;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

}