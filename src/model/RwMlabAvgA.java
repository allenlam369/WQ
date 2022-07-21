package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_mlab_avg_a database table.
 * 
 */
//@Entity
@Table(name="rw_mlab_avg_a")
@NamedQuery(name="RwMlabAvgA.findAll", query="SELECT r FROM RwMlabAvgA r")
public class RwMlabAvgA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bod5_avg")
	private BigDecimal bod5Avg;

	@Column(name="ec_avg")
	private BigDecimal ecAvg;

	@Column(name="fc_avg")
	private BigDecimal fcAvg;

	@Column(name="l_bod5_avg")
	private String lBod5Avg;

	@Column(name="l_ec_avg")
	private String lEcAvg;

	@Column(name="l_fc_avg")
	private String lFcAvg;

	@Column(name="site_id")
	private BigDecimal siteId;

	private Long total;

	private double yr;

	public RwMlabAvgA() {
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

	public String getLBod5Avg() {
		return this.lBod5Avg;
	}

	public void setLBod5Avg(String lBod5Avg) {
		this.lBod5Avg = lBod5Avg;
	}

	public String getLEcAvg() {
		return this.lEcAvg;
	}

	public void setLEcAvg(String lEcAvg) {
		this.lEcAvg = lEcAvg;
	}

	public String getLFcAvg() {
		return this.lFcAvg;
	}

	public void setLFcAvg(String lFcAvg) {
		this.lFcAvg = lFcAvg;
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