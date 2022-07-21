package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_mlab_max_a database table.
 * 
 */
//@Entity
@Table(name="rw_mlab_max_a")
@NamedQuery(name="RwMlabMaxA.findAll", query="SELECT r FROM RwMlabMaxA r")
public class RwMlabMaxA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bod5_max")
	private BigDecimal bod5Max;

	@Column(name="ec_max")
	private BigDecimal ecMax;

	@Column(name="fc_max")
	private BigDecimal fcMax;

	@Column(name="l_bod5_max")
	private String lBod5Max;

	@Column(name="l_ec_max")
	private String lEcMax;

	@Column(name="l_fc_max")
	private String lFcMax;

	@Column(name="site_id")
	private BigDecimal siteId;

	private Long total;

	private double yr;

	public RwMlabMaxA() {
	}

	public BigDecimal getBod5Max() {
		return this.bod5Max;
	}

	public void setBod5Max(BigDecimal bod5Max) {
		this.bod5Max = bod5Max;
	}

	public BigDecimal getEcMax() {
		return this.ecMax;
	}

	public void setEcMax(BigDecimal ecMax) {
		this.ecMax = ecMax;
	}

	public BigDecimal getFcMax() {
		return this.fcMax;
	}

	public void setFcMax(BigDecimal fcMax) {
		this.fcMax = fcMax;
	}

	public String getLBod5Max() {
		return this.lBod5Max;
	}

	public void setLBod5Max(String lBod5Max) {
		this.lBod5Max = lBod5Max;
	}

	public String getLEcMax() {
		return this.lEcMax;
	}

	public void setLEcMax(String lEcMax) {
		this.lEcMax = lEcMax;
	}

	public String getLFcMax() {
		return this.lFcMax;
	}

	public void setLFcMax(String lFcMax) {
		this.lFcMax = lFcMax;
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