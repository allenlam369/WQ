package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_wqi_max database table.
 * 
 */
//@Entity
@Table(name="rw_wqi_max")
@NamedQuery(name="RwWqiMax.findAll", query="SELECT r FROM RwWqiMax r")
public class RwWqiMax implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bod5_pt_max")
	private BigDecimal bod5PtMax;

	@Column(name="dos_pt_max")
	private BigDecimal dosPtMax;

	@Column(name="nh4_pt_max")
	private BigDecimal nh4PtMax;

	@Column(name="site_id")
	private BigDecimal siteId;

	private Long total;

	@Column(name="wqi_grade_max")
	private String wqiGradeMax;

	@Column(name="wqi_pt_max")
	private BigDecimal wqiPtMax;

	private double yr;

	public RwWqiMax() {
	}

	public BigDecimal getBod5PtMax() {
		return this.bod5PtMax;
	}

	public void setBod5PtMax(BigDecimal bod5PtMax) {
		this.bod5PtMax = bod5PtMax;
	}

	public BigDecimal getDosPtMax() {
		return this.dosPtMax;
	}

	public void setDosPtMax(BigDecimal dosPtMax) {
		this.dosPtMax = dosPtMax;
	}

	public BigDecimal getNh4PtMax() {
		return this.nh4PtMax;
	}

	public void setNh4PtMax(BigDecimal nh4PtMax) {
		this.nh4PtMax = nh4PtMax;
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

	public String getWqiGradeMax() {
		return this.wqiGradeMax;
	}

	public void setWqiGradeMax(String wqiGradeMax) {
		this.wqiGradeMax = wqiGradeMax;
	}

	public BigDecimal getWqiPtMax() {
		return this.wqiPtMax;
	}

	public void setWqiPtMax(BigDecimal wqiPtMax) {
		this.wqiPtMax = wqiPtMax;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

}