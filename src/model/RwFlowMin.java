package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_flow_min database table.
 * 
 */
//@Entity
@Table(name="rw_flow_min")
@NamedQuery(name="RwFlowMin.findAll", query="SELECT r FROM RwFlowMin r")
public class RwFlowMin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="depth_min")
	private BigDecimal depthMin;

	@Column(name="flow_min")
	private BigDecimal flowMin;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="vel_min")
	private BigDecimal velMin;

	@Column(name="width_min")
	private BigDecimal widthMin;

	private double yr;

	public RwFlowMin() {
	}

	public BigDecimal getDepthMin() {
		return this.depthMin;
	}

	public void setDepthMin(BigDecimal depthMin) {
		this.depthMin = depthMin;
	}

	public BigDecimal getFlowMin() {
		return this.flowMin;
	}

	public void setFlowMin(BigDecimal flowMin) {
		this.flowMin = flowMin;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getVelMin() {
		return this.velMin;
	}

	public void setVelMin(BigDecimal velMin) {
		this.velMin = velMin;
	}

	public BigDecimal getWidthMin() {
		return this.widthMin;
	}

	public void setWidthMin(BigDecimal widthMin) {
		this.widthMin = widthMin;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

}