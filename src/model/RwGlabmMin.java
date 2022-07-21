package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_glabm_min database table.
 * 
 */
//@Entity
@Table(name="rw_glabm_min")
@NamedQuery(name="RwGlabmMin.findAll", query="SELECT r FROM RwGlabmMin r")
public class RwGlabmMin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ag_min")
	private BigDecimal agMin;

	@Column(name="al_min")
	private BigDecimal alMin;

	@Column(name="arsenic_min")
	private BigDecimal arsenicMin;

	@Column(name="b_min")
	private BigDecimal bMin;

	@Column(name="ba_min")
	private BigDecimal baMin;

	@Column(name="be_min")
	private BigDecimal beMin;

	@Column(name="cd_min")
	private BigDecimal cdMin;

	@Column(name="cr_min")
	private BigDecimal crMin;

	@Column(name="cu_min")
	private BigDecimal cuMin;

	@Column(name="fe_min")
	private BigDecimal feMin;

	@Column(name="hg_min")
	private BigDecimal hgMin;

	@Column(name="mn_min")
	private BigDecimal mnMin;

	@Column(name="mo_min")
	private BigDecimal moMin;

	@Column(name="ni_min")
	private BigDecimal niMin;

	@Column(name="pb_min")
	private BigDecimal pbMin;

	@Column(name="sb_min")
	private BigDecimal sbMin;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="tl_min")
	private BigDecimal tlMin;

	private Long total;

	@Column(name="v_min")
	private BigDecimal vMin;

	private double yr;

	@Column(name="zn_min")
	private BigDecimal znMin;

	public RwGlabmMin() {
	}

	public BigDecimal getAgMin() {
		return this.agMin;
	}

	public void setAgMin(BigDecimal agMin) {
		this.agMin = agMin;
	}

	public BigDecimal getAlMin() {
		return this.alMin;
	}

	public void setAlMin(BigDecimal alMin) {
		this.alMin = alMin;
	}

	public BigDecimal getArsenicMin() {
		return this.arsenicMin;
	}

	public void setArsenicMin(BigDecimal arsenicMin) {
		this.arsenicMin = arsenicMin;
	}

	public BigDecimal getBMin() {
		return this.bMin;
	}

	public void setBMin(BigDecimal bMin) {
		this.bMin = bMin;
	}

	public BigDecimal getBaMin() {
		return this.baMin;
	}

	public void setBaMin(BigDecimal baMin) {
		this.baMin = baMin;
	}

	public BigDecimal getBeMin() {
		return this.beMin;
	}

	public void setBeMin(BigDecimal beMin) {
		this.beMin = beMin;
	}

	public BigDecimal getCdMin() {
		return this.cdMin;
	}

	public void setCdMin(BigDecimal cdMin) {
		this.cdMin = cdMin;
	}

	public BigDecimal getCrMin() {
		return this.crMin;
	}

	public void setCrMin(BigDecimal crMin) {
		this.crMin = crMin;
	}

	public BigDecimal getCuMin() {
		return this.cuMin;
	}

	public void setCuMin(BigDecimal cuMin) {
		this.cuMin = cuMin;
	}

	public BigDecimal getFeMin() {
		return this.feMin;
	}

	public void setFeMin(BigDecimal feMin) {
		this.feMin = feMin;
	}

	public BigDecimal getHgMin() {
		return this.hgMin;
	}

	public void setHgMin(BigDecimal hgMin) {
		this.hgMin = hgMin;
	}

	public BigDecimal getMnMin() {
		return this.mnMin;
	}

	public void setMnMin(BigDecimal mnMin) {
		this.mnMin = mnMin;
	}

	public BigDecimal getMoMin() {
		return this.moMin;
	}

	public void setMoMin(BigDecimal moMin) {
		this.moMin = moMin;
	}

	public BigDecimal getNiMin() {
		return this.niMin;
	}

	public void setNiMin(BigDecimal niMin) {
		this.niMin = niMin;
	}

	public BigDecimal getPbMin() {
		return this.pbMin;
	}

	public void setPbMin(BigDecimal pbMin) {
		this.pbMin = pbMin;
	}

	public BigDecimal getSbMin() {
		return this.sbMin;
	}

	public void setSbMin(BigDecimal sbMin) {
		this.sbMin = sbMin;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getTlMin() {
		return this.tlMin;
	}

	public void setTlMin(BigDecimal tlMin) {
		this.tlMin = tlMin;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public BigDecimal getVMin() {
		return this.vMin;
	}

	public void setVMin(BigDecimal vMin) {
		this.vMin = vMin;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

	public BigDecimal getZnMin() {
		return this.znMin;
	}

	public void setZnMin(BigDecimal znMin) {
		this.znMin = znMin;
	}

}