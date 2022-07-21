package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_flow_stdev database table.
 * 
 */
//@Entity
@Table(name="rw_flow_stdev")
@NamedQuery(name="RwFlowStdev.findAll", query="SELECT r FROM RwFlowStdev r")
public class RwFlowStdev implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="depth_stdev")
	private BigDecimal depthStdev;

	@Column(name="flow_stdev")
	private BigDecimal flowStdev;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="vel_stdev")
	private BigDecimal velStdev;

	@Column(name="width_stdev")
	private BigDecimal widthStdev;

	private double yr;

	public RwFlowStdev() {
	}

	public BigDecimal getDepthStdev() {
		return this.depthStdev;
	}

	public void setDepthStdev(BigDecimal depthStdev) {
		this.depthStdev = depthStdev;
	}

	public BigDecimal getFlowStdev() {
		return this.flowStdev;
	}

	public void setFlowStdev(BigDecimal flowStdev) {
		this.flowStdev = flowStdev;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getVelStdev() {
		return this.velStdev;
	}

	public void setVelStdev(BigDecimal velStdev) {
		this.velStdev = velStdev;
	}

	public BigDecimal getWidthStdev() {
		return this.widthStdev;
	}

	public void setWidthStdev(BigDecimal widthStdev) {
		this.widthStdev = widthStdev;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

}