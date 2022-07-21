package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_mlab_avg database table.
 * 
 */
//@Entity
@Table(name="rw_mlab_avg")
@NamedQuery(name="RwMlabAvg.findAll", query="SELECT r FROM RwMlabAvg r")
public class RwMlabAvg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bod5_avg")
	private BigDecimal bod5Avg;

	@Column(name="ec_avg")
	private BigDecimal ecAvg;

	@Column(name="fc_avg")
	private BigDecimal fcAvg;

	@Column(name="site_id")
	private BigDecimal siteId;

	private Long total;

	private double yr;

	public RwMlabAvg() {
	}

	public BigDecimal getBod5Avg() {
		return this.bod5Avg;
	}

	public void setBod5Avg(BigDecimal bod5Avg) {
		this.bod5Avg = bod5Avg;
	}

	public BigDecimal getEcAvg() {
		return this.ecAvg;
	}

	public void setEcAvg(BigDecimal ecAvg) {
		this.ecAvg = ecAvg;
	}

	public BigDecimal getFcAvg() {
		return this.fcAvg;
	}

	public void setFcAvg(BigDecimal fcAvg) {
		this.fcAvg = fcAvg;
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