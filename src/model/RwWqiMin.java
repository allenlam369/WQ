package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_wqi_min database table.
 * 
 */
//@Entity
@Table(name="rw_wqi_min")
@NamedQuery(name="RwWqiMin.findAll", query="SELECT r FROM RwWqiMin r")
public class RwWqiMin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bod5_pt_min")
	private BigDecimal bod5PtMin;

	@Column(name="dos_pt_min")
	private BigDecimal dosPtMin;

	@Column(name="nh4_pt_min")
	private BigDecimal nh4PtMin;

	@Column(name="site_id")
	private BigDecimal siteId;

	private Long total;

	@Column(name="wqi_grade_min")
	private String wqiGradeMin;

	@Column(name="wqi_pt_min")
	private BigDecimal wqiPtMin;

	private double yr;

	public RwWqiMin() {
	}

	public BigDecimal getBod5PtMin() {
		return this.bod5PtMin;
	}

	public void setBod5PtMin(BigDecimal bod5PtMin) {
		this.bod5PtMin = bod5PtMin;
	}

	public BigDecimal getDosPtMin() {
		return this.dosPtMin;
	}

	public void setDosPtMin(BigDecimal dosPtMin) {
		this.dosPtMin = dosPtMin;
	}

	public BigDecimal getNh4PtMin() {
		return this.nh4PtMin;
	}

	public void setNh4PtMin(BigDecimal nh4PtMin) {
		this.nh4PtMin = nh4PtMin;
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

	public String getWqiGradeMin() {
		return this.wqiGradeMin;
	}

	public void setWqiGradeMin(String wqiGradeMin) {
		this.wqiGradeMin = wqiGradeMin;
	}

	public BigDecimal getWqiPtMin() {
		return this.wqiPtMin;
	}

	public void setWqiPtMin(BigDecimal wqiPtMin) {
		this.wqiPtMin = wqiPtMin;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

}