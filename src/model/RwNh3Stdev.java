package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_nh3_stdev database table.
 * 
 */
//@Entity
@Table(name="rw_nh3_stdev")
@NamedQuery(name="RwNh3Stdev.findAll", query="SELECT r FROM RwNh3Stdev r")
public class RwNh3Stdev implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="nh3_stdev")
	private BigDecimal nh3Stdev;

	@Column(name="site_id")
	private BigDecimal siteId;

	private Long total;

	private double yr;

	public RwNh3Stdev() {
	}

	public BigDecimal getNh3Stdev() {
		return this.nh3Stdev;
	}

	public void setNh3Stdev(BigDecimal nh3Stdev) {
		this.nh3Stdev = nh3Stdev;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

}