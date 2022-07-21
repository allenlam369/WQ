package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_nh3_min_a database table.
 * 
 */
//@Entity
@Table(name="rw_nh3_min_a")
@NamedQuery(name="RwNh3MinA.findAll", query="SELECT r FROM RwNh3MinA r")
public class RwNh3MinA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="l_nh3_min")
	private String lNh3Min;

	@Column(name="nh3_min")
	private BigDecimal nh3Min;

	@Column(name="site_id")
	private BigDecimal siteId;

	private Long total;

	private double yr;

	public RwNh3MinA() {
	}

	public String getLNh3Min() {
		return this.lNh3Min;
	}

	public void setLNh3Min(String lNh3Min) {
		this.lNh3Min = lNh3Min;
	}

	public BigDecimal getNh3Min() {
		return this.nh3Min;
	}

	public void setNh3Min(BigDecimal nh3Min) {
		this.nh3Min = nh3Min;
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