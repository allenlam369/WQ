package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_mlab_stdev database table.
 * 
 */
//@Entity
@Table(name="rw_mlab_stdev")
@NamedQuery(name="RwMlabStdev.findAll", query="SELECT r FROM RwMlabStdev r")
public class RwMlabStdev implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bod5_stdev")
	private BigDecimal bod5Stdev;

	@Column(name="ec_stdev")
	private BigDecimal ecStdev;

	@Column(name="fc_stdev")
	private BigDecimal fcStdev;

	@Column(name="site_id")
	private BigDecimal siteId;

	private Long total;

	private double yr;

	public RwMlabStdev() {
	}

	public BigDecimal getBod5Stdev() {
		return this.bod5Stdev;
	}

	public void setBod5Stdev(BigDecimal bod5Stdev) {
		this.bod5Stdev = bod5Stdev;
	}

	public BigDecimal getEcStdev() {
		return this.ecStdev;
	}

	public void setEcStdev(BigDecimal ecStdev) {
		this.ecStdev = ecStdev;
	}

	public BigDecimal getFcStdev() {
		return this.fcStdev;
	}

	public void setFcStdev(BigDecimal fcStdev) {
		this.fcStdev = fcStdev;
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