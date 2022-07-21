package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_nh3_avg database table.
 * 
 */
//@Entity
@Table(name="rw_nh3_avg")
@NamedQuery(name="RwNh3Avg.findAll", query="SELECT r FROM RwNh3Avg r")
public class RwNh3Avg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="nh3_avg")
	private BigDecimal nh3Avg;

	@Column(name="site_id")
	private BigDecimal siteId;

	private Long total;

	private double yr;

	public RwNh3Avg() {
	}

	public BigDecimal getNh3Avg() {
		return this.nh3Avg;
	}

	public void setNh3Avg(BigDecimal nh3Avg) {
		this.nh3Avg = nh3Avg;
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