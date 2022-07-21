package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the test_rw_nh3_med database table.
 * 
 */
//@Entity
@Table(name="test_rw_nh3_med")
@NamedQuery(name="TestRwNh3Med.findAll", query="SELECT t FROM TestRwNh3Med t")
public class TestRwNh3Med implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="nh3_med")
	private BigDecimal nh3Med;

	@Column(name="site_id")
	private BigDecimal siteId;

	private double yr;

	private double yyyy;

	public TestRwNh3Med() {
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