package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_mlab_min database table.
 * 
 */
//@Entity
@Table(name="rw_mlab_min")
@NamedQuery(name="RwMlabMin.findAll", query="SELECT r FROM RwMlabMin r")
public class RwMlabMin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bod5_min")
	private BigDecimal bod5Min;

	@Column(name="ec_min")
	private BigDecimal ecMin;

	@Column(name="fc_min")
	private BigDecimal fcMin;

	@Column(name="site_id")
	private BigDecimal siteId;

	private Long total;

	private double yr;

	public RwMlabMin() {
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