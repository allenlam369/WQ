package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_glabm_max database table.
 * 
 */
//@Entity
@Table(name="rw_glabm_max")
@NamedQuery(name="RwGlabmMax.findAll", query="SELECT r FROM RwGlabmMax r")
public class RwGlabmMax implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ag_max")
	private BigDecimal agMax;

	@Column(name="al_max")
	private BigDecimal alMax;

	@Column(name="arsenic_max")
	private BigDecimal arsenicMax;

	@Column(name="b_max")
	private BigDecimal bMax;

	@Column(name="ba_max")
	private BigDecimal baMax;

	@Column(name="be_max")
	private BigDecimal beMax;

	@Column(name="cd_max")
	private BigDecimal cdMax;

	@Column(name="cr_max")
	private BigDecimal crMax;

	@Column(name="cu_max")
	private BigDecimal cuMax;

	@Column(name="fe_max")
	private BigDecimal feMax;

	@Column(name="hg_max")
	private BigDecimal hgMax;

	@Column(name="mn_max")
	private BigDecimal mnMax;

	@Column(name="mo_max")
	private BigDecimal moMax;

	@Column(name="ni_max")
	private BigDecimal niMax;

	@Column(name="pb_max")
	private BigDecimal pbMax;

	@Column(name="sb_max")
	private BigDecimal sbMax;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="tl_max")
	private BigDecimal tlMax;

	private Long total;

	@Column(name="v_max")
	private BigDecimal vMax;

	private double yr;

	@Column(name="zn_max")
	private BigDecimal znMax;

	public RwGlabmMax() {
	}

	public BigDecimal getAgMax() {
		return this.agMax;
	}

	public void setAgMax(BigDecimal agMax) {
		this.agMax = agMax;
	}

	public BigDecimal getAlMax() {
		return this.alMax;
	}

	public void setAlMax(BigDecimal alMax) {
		this.alMax = alMax;
	}

	public BigDecimal getArsenicMax() {
		return this.arsenicMax;
	}

	public void setArsenicMax(BigDecimal arsenicMax) {
		this.arsenicMax = arsenicMax;
	}

	public BigDecimal getBMax() {
		return this.bMax;
	}

	public void setBMax(BigDecimal bMax) {
		this.bMax = bMax;
	}

	public BigDecimal getBaMax() {
		return this.baMax;
	}

	public void setBaMax(BigDecimal baMax) {
		this.baMax = baMax;
	}

	public BigDecimal getBeMax() {
		return this.beMax;
	}

	public void setBeMax(BigDecimal beMax) {
		this.beMax = beMax;
	}

	public BigDecimal getCdMax() {
		return this.cdMax;
	}

	public void setCdMax(BigDecimal cdMax) {
		this.cdMax = cdMax;
	}

	public BigDecimal getCrMax() {
		return this.crMax;
	}

	public void setCrMax(BigDecimal crMax) {
		this.crMax = crMax;
	}

	public BigDecimal getCuMax() {
		return this.cuMax;
	}

	public void setCuMax(BigDecimal cuMax) {
		this.cuMax = cuMax;
	}

	public BigDecimal getFeMax() {
		return this.feMax;
	}

	public void setFeMax(BigDecimal feMax) {
		this.feMax = feMax;
	}

	public BigDecimal getHgMax() {
		return this.hgMax;
	}

	public void setHgMax(BigDecimal hgMax) {
		this.hgMax = hgMax;
	}

	public BigDecimal getMnMax() {
		return this.mnMax;
	}

	public void setMnMax(BigDecimal mnMax) {
		this.mnMax = mnMax;
	}

	public BigDecimal getMoMax() {
		return this.moMax;
	}

	public void setMoMax(BigDecimal moMax) {
		this.moMax = moMax;
	}

	public BigDecimal getNiMax() {
		return this.niMax;
	}

	public void setNiMax(BigDecimal niMax) {
		this.niMax = niMax;
	}

	public BigDecimal getPbMax() {
		return this.pbMax;
	}

	public void setPbMax(BigDecimal pbMax) {
		this.pbMax = pbMax;
	}

	public BigDecimal getSbMax() {
		return this.sbMax;
	}

	public void setSbMax(BigDecimal sbMax) {
		this.sbMax = sbMax;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getTlMax() {
		return this.tlMax;
	}

	public void setTlMax(BigDecimal tlMax) {
		this.tlMax = tlMax;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public BigDecimal getVMax() {
		return this.vMax;
	}

	public void setVMax(BigDecimal vMax) {
		this.vMax = vMax;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

	public BigDecimal getZnMax() {
		return this.znMax;
	}

	public void setZnMax(BigDecimal znMax) {
		this.znMax = znMax;
	}

}