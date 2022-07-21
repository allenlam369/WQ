package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_mlab_min_a database table.
 * 
 */
//@Entity
@Table(name="rw_mlab_min_a")
@NamedQuery(name="RwMlabMinA.findAll", query="SELECT r FROM RwMlabMinA r")
public class RwMlabMinA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bod5_min")
	private BigDecimal bod5Min;

	@Column(name="ec_min")
	private BigDecimal ecMin;

	@Column(name="fc_min")
	private BigDecimal fcMin;

	@Column(name="l_bod5_min")
	private String lBod5Min;

	@Column(name="l_ec_min")
	private String lEcMin;

	@Column(name="l_fc_min")
	private String lFcMin;

	@Column(name="site_id")
	private BigDecimal siteId;

	private Long total;

	private double yr;

	public RwMlabMinA() {
	}

	public BigDecimal getBod5Min() {
		return this.bod5Min;
	}

	public void setBod5Min(BigDecimal bod5Min) {
		this.bod5Min = bod5Min;
	}

	public BigDecimal getEcMin() {
		return this.ecMin;
	}

	public void setEcMin(BigDecimal ecMin) {
		this.ecMin = ecMin;
	}

	public BigDecimal getFcMin() {
		return this.fcMin;
	}

	public void setFcMin(BigDecimal fcMin) {
		this.fcMin = fcMin;
	}

	public String getLBod5Min() {
		return this.lBod5Min;
	}

	public void setLBod5Min(String lBod5Min) {
		this.lBod5Min = lBod5Min;
	}

	public String getLEcMin() {
		return this.lEcMin;
	}

	public void setLEcMin(String lEcMin) {
		this.lEcMin = lEcMin;
	}

	public String getLFcMin() {
		return this.lFcMin;
	}

	public void setLFcMin(String lFcMin) {
		this.lFcMin = lFcMin;
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