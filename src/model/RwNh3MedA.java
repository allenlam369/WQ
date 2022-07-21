package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_nh3_med_a database table.
 * 
 */
//@Entity
@Table(name="rw_nh3_med_a")
@NamedQuery(name="RwNh3MedA.findAll", query="SELECT r FROM RwNh3MedA r")
public class RwNh3MedA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="l_nh3_med")
	private String lNh3Med;

	@Column(name="nh3_med")
	private BigDecimal nh3Med;

	@Column(name="site_id")
	private BigDecimal siteId;

	private Long total;

	private double yr;

	public RwNh3MedA() {
	}

	public String getLNh3Med() {
		return this.lNh3Med;
	}

	public void setLNh3Med(String lNh3Med) {
		this.lNh3Med = lNh3Med;
	}

	public BigDecimal getNh3Med() {
		return this.nh3Med;
	}

	public void setNh3Med(BigDecimal nh3Med) {
		this.nh3Med = nh3Med;
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