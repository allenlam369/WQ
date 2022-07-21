package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_flow_max database table.
 * 
 */
//@Entity
@Table(name="rw_flow_max")
@NamedQuery(name="RwFlowMax.findAll", query="SELECT r FROM RwFlowMax r")
public class RwFlowMax implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="depth_max")
	private BigDecimal depthMax;

	@Column(name="flow_max")
	private BigDecimal flowMax;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="vel_max")
	private BigDecimal velMax;

	@Column(name="width_max")
	private BigDecimal widthMax;

	private double yr;

	public RwFlowMax() {
	}

	public BigDecimal getDepthMax() {
		return this.depthMax;
	}

	public void setDepthMax(BigDecimal depthMax) {
		this.depthMax = depthMax;
	}

	public BigDecimal getFlowMax() {
		return this.flowMax;
	}

	public void setFlowMax(BigDecimal flowMax) {
		this.flowMax = flowMax;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getVelMax() {
		return this.velMax;
	}

	public void setVelMax(BigDecimal velMax) {
		this.velMax = velMax;
	}

	public BigDecimal getWidthMax() {
		return this.widthMax;
	}

	public void setWidthMax(BigDecimal widthMax) {
		this.widthMax = widthMax;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

}