package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_wqi_stdev database table.
 * 
 */
//@Entity
@Table(name="rw_wqi_stdev")
@NamedQuery(name="RwWqiStdev.findAll", query="SELECT r FROM RwWqiStdev r")
public class RwWqiStdev implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bod5_pt_stdev")
	private BigDecimal bod5PtStdev;

	@Column(name="dos_pt_stdev")
	private BigDecimal dosPtStdev;

	@Column(name="nh4_pt_stdev")
	private BigDecimal nh4PtStdev;

	@Column(name="site_id")
	private BigDecimal siteId;

	private Long total;

	@Column(name="wqi_grade_stdev")
	private String wqiGradeStdev;

	@Column(name="wqi_pt_stdev")
	private BigDecimal wqiPtStdev;

	private double yr;

	public RwWqiStdev() {
	}

	public BigDecimal getBod5PtStdev() {
		return this.bod5PtStdev;
	}

	public void setBod5PtStdev(BigDecimal bod5PtStdev) {
		this.bod5PtStdev = bod5PtStdev;
	}

	public BigDecimal getDosPtStdev() {
		return this.dosPtStdev;
	}

	public void setDosPtStdev(BigDecimal dosPtStdev) {
		this.dosPtStdev = dosPtStdev;
	}

	public BigDecimal getNh4PtStdev() {
		return this.nh4PtStdev;
	}

	public void setNh4PtStdev(BigDecimal nh4PtStdev) {
		this.nh4PtStdev = nh4PtStdev;
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

	public String getWqiGradeStdev() {
		return this.wqiGradeStdev;
	}

	public void setWqiGradeStdev(String wqiGradeStdev) {
		this.wqiGradeStdev = wqiGradeStdev;
	}

	public BigDecimal getWqiPtStdev() {
		return this.wqiPtStdev;
	}

	public void setWqiPtStdev(BigDecimal wqiPtStdev) {
		this.wqiPtStdev = wqiPtStdev;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

}