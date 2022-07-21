package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_ss_med database table.
 * 
 */
//@Entity
@Table(name="rw_ss_med")
@NamedQuery(name="RwSsMed.findAll", query="SELECT r FROM RwSsMed r")
public class RwSsMed implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="site_id")
	private BigDecimal siteId;

	private BigDecimal ss;

	private double yr;

	public RwSsMed() {
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

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

}