package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_ss_med_test database table.
 * 
 */
//@Entity
@Table(name="rw_ss_med_test")
@NamedQuery(name="RwSsMedTest.findAll", query="SELECT r FROM RwSsMedTest r")
public class RwSsMedTest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="site_id")
	private BigDecimal siteId;

	private BigDecimal ss;

	private Integer yr;

	public RwSsMedTest() {
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getSs() {
		return this.ss;
	}

	public void setSs(BigDecimal ss) {
		this.ss = ss;
	}

	public Integer getYr() {
		return this.yr;
	}

	public void setYr(Integer yr) {
		this.yr = yr;
	}

}