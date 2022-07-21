package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_flow_med_test database table.
 * 
 */
//@Entity
@Table(name="rw_flow_med_test")
@NamedQuery(name="RwFlowMedTest.findAll", query="SELECT r FROM RwFlowMedTest r")
public class RwFlowMedTest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="depth_med")
	private BigDecimal depthMed;

	@Column(name="flow_med")
	private BigDecimal flowMed;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="vel_med")
	private BigDecimal velMed;

	@Column(name="width_med")
	private BigDecimal widthMed;

	private Integer yr;

	private Integer yyyy;

	public RwFlowMedTest() {
	}

	public BigDecimal getDepthMed() {
		return this.depthMed;
	}

	public void setDepthMed(BigDecimal depthMed) {
		this.depthMed = depthMed;
	}

	public BigDecimal getFlowMed() {
		return this.flowMed;
	}

	public void setFlowMed(BigDecimal flowMed) {
		this.flowMed = flowMed;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getVelMed() {
		return this.velMed;
	}

	public void setVelMed(BigDecimal velMed) {
		this.velMed = velMed;
	}

	public BigDecimal getWidthMed() {
		return this.widthMed;
	}

	public void setWidthMed(BigDecimal widthMed) {
		this.widthMed = widthMed;
	}

	public Integer getYr() {
		return this.yr;
	}

	public void setYr(Integer yr) {
		this.yr = yr;
	}

	public Integer getYyyy() {
		return this.yyyy;
	}

	public void setYyyy(Integer yyyy) {
		this.yyyy = yyyy;
	}

}