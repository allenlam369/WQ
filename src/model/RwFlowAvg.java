package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_flow_avg database table.
 * 
 */
//@Entity
@Table(name="rw_flow_avg")
@NamedQuery(name="RwFlowAvg.findAll", query="SELECT r FROM RwFlowAvg r")
public class RwFlowAvg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="depth_avg")
	private BigDecimal depthAvg;

	@Column(name="flow_avg")
	private BigDecimal flowAvg;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="vel_avg")
	private BigDecimal velAvg;

	@Column(name="width_avg")
	private BigDecimal widthAvg;

	private double yr;

	public RwFlowAvg() {
	}

	public BigDecimal getDepthAvg() {
		return this.depthAvg;
	}

	public void setDepthAvg(BigDecimal depthAvg) {
		this.depthAvg = depthAvg;
	}

	public BigDecimal getFlowAvg() {
		return this.flowAvg;
	}

	public void setFlowAvg(BigDecimal flowAvg) {
		this.flowAvg = flowAvg;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getVelAvg() {
		return this.velAvg;
	}

	public void setVelAvg(BigDecimal velAvg) {
		this.velAvg = velAvg;
	}

	public BigDecimal getWidthAvg() {
		return this.widthAvg;
	}

	public void setWidthAvg(BigDecimal widthAvg) {
		this.widthAvg = widthAvg;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

}