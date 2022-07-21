package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_nh3_med_test database table.
 * 
 */
//@Entity
@Table(name="rw_nh3_med_test")
@NamedQuery(name="RwNh3MedTest.findAll", query="SELECT r FROM RwNh3MedTest r")
public class RwNh3MedTest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="nh3_med")
	private BigDecimal nh3Med;

	@Column(name="site_id")
	private BigDecimal siteId;

	private Integer yr;

	private Integer yyyy;

	public RwNh3MedTest() {
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

	public Integer getYr() {
		return this.yr;
	}

	public void setYr(Integer yr) {
		this.yr = yr;
	}

	public Integer getYyyy() {
		return this.yyyy;
	}

	public void setYyyy(Integer yyyy) {
		this.yyyy = yyyy;
	}

}