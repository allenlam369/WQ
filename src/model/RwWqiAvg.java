package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_wqi_avg database table.
 * 
 */
//@Entity
@Table(name="rw_wqi_avg")
@NamedQuery(name="RwWqiAvg.findAll", query="SELECT r FROM RwWqiAvg r")
public class RwWqiAvg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bod5_pt_avg")
	private BigDecimal bod5PtAvg;

	@Column(name="dos_pt_avg")
	private BigDecimal dosPtAvg;

	@Column(name="nh4_pt_avg")
	private BigDecimal nh4PtAvg;

	@Column(name="site_id")
	private BigDecimal siteId;

	private Long total;

	@Column(name="wqi_grade_avg")
	private String wqiGradeAvg;

	@Column(name="wqi_pt_avg")
	private BigDecimal wqiPtAvg;

	private double yr;

	public RwWqiAvg() {
	}

	public BigDecimal getBod5PtAvg() {
		return this.bod5PtAvg;
	}

	public void setBod5PtAvg(BigDecimal bod5PtAvg) {
		this.bod5PtAvg = bod5PtAvg;
	}

	public BigDecimal getDosPtAvg() {
		return this.dosPtAvg;
	}

	public void setDosPtAvg(BigDecimal dosPtAvg) {
		this.dosPtAvg = dosPtAvg;
	}

	public BigDecimal getNh4PtAvg() {
		return this.nh4PtAvg;
	}

	public void setNh4PtAvg(BigDecimal nh4PtAvg) {
		this.nh4PtAvg = nh4PtAvg;
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

	public String getWqiGradeAvg() {
		return this.wqiGradeAvg;
	}

	public void setWqiGradeAvg(String wqiGradeAvg) {
		this.wqiGradeAvg = wqiGradeAvg;
	}

	public BigDecimal getWqiPtAvg() {
		return this.wqiPtAvg;
	}

	public void setWqiPtAvg(BigDecimal wqiPtAvg) {
		this.wqiPtAvg = wqiPtAvg;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

}