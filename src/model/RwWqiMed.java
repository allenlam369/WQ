package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_wqi_med database table.
 * 
 */
//@Entity
@Table(name="rw_wqi_med")
@NamedQuery(name="RwWqiMed.findAll", query="SELECT r FROM RwWqiMed r")
public class RwWqiMed implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bod5_pt_med")
	private BigDecimal bod5PtMed;

	@Column(name="dos_pt_med")
	private BigDecimal dosPtMed;

	@Column(name="nh4_pt_med")
	private BigDecimal nh4PtMed;

	@Column(name="site_id")
	private BigDecimal siteId;

	private Long total;

	@Column(name="wqi_grade_med")
	private String wqiGradeMed;

	@Column(name="wqi_pt_med")
	private BigDecimal wqiPtMed;

	private double yr;

	private double yyyy;

	public RwWqiMed() {
	}

	public BigDecimal getBod5PtMed() {
		return this.bod5PtMed;
	}

	public void setBod5PtMed(BigDecimal bod5PtMed) {
		this.bod5PtMed = bod5PtMed;
	}

	public BigDecimal getDosPtMed() {
		return this.dosPtMed;
	}

	public void setDosPtMed(BigDecimal dosPtMed) {
		this.dosPtMed = dosPtMed;
	}

	public BigDecimal getNh4PtMed() {
		return this.nh4PtMed;
	}

	public void setNh4PtMed(BigDecimal nh4PtMed) {
		this.nh4PtMed = nh4PtMed;
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

	public String getWqiGradeMed() {
		return this.wqiGradeMed;
	}

	public void setWqiGradeMed(String wqiGradeMed) {
		this.wqiGradeMed = wqiGradeMed;
	}

	public BigDecimal getWqiPtMed() {
		return this.wqiPtMed;
	}

	public void setWqiPtMed(BigDecimal wqiPtMed) {
		this.wqiPtMed = wqiPtMed;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

	public double getYyyy() {
		return this.yyyy;
	}

	public void setYyyy(double yyyy) {
		this.yyyy = yyyy;
	}

}