package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_nh3_max database table.
 * 
 */
//@Entity
@Table(name="rw_nh3_max")
@NamedQuery(name="RwNh3Max.findAll", query="SELECT r FROM RwNh3Max r")
public class RwNh3Max implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="nh3_max")
	private BigDecimal nh3Max;

	@Column(name="site_id")
	private BigDecimal siteId;

	private Long total;

	private double yr;

	public RwNh3Max() {
	}

	public BigDecimal getNh3Max() {
		return this.nh3Max;
	}

	public void setNh3Max(BigDecimal nh3Max) {
		this.nh3Max = nh3Max;
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