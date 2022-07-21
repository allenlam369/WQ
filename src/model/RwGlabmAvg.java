package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_glabm_avg database table.
 * 
 */
//@Entity
@Table(name="rw_glabm_avg")
@NamedQuery(name="RwGlabmAvg.findAll", query="SELECT r FROM RwGlabmAvg r")
public class RwGlabmAvg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ag_avg")
	private BigDecimal agAvg;

	@Column(name="al_avg")
	private BigDecimal alAvg;

	@Column(name="arsenic_avg")
	private BigDecimal arsenicAvg;

	@Column(name="b_avg")
	private BigDecimal bAvg;

	@Column(name="ba_avg")
	private BigDecimal baAvg;

	@Column(name="be_avg")
	private BigDecimal beAvg;

	@Column(name="cd_avg")
	private BigDecimal cdAvg;

	@Column(name="cr_avg")
	private BigDecimal crAvg;

	@Column(name="cu_avg")
	private BigDecimal cuAvg;

	@Column(name="fe_avg")
	private BigDecimal feAvg;

	@Column(name="hg_avg")
	private BigDecimal hgAvg;

	@Column(name="mn_avg")
	private BigDecimal mnAvg;

	@Column(name="mo_avg")
	private BigDecimal moAvg;

	@Column(name="ni_avg")
	private BigDecimal niAvg;

	@Column(name="pb_avg")
	private BigDecimal pbAvg;

	@Column(name="sb_avg")
	private BigDecimal sbAvg;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="tl_avg")
	private BigDecimal tlAvg;

	private Long total;

	@Column(name="v_avg")
	private BigDecimal vAvg;

	private double yr;

	@Column(name="zn_avg")
	private BigDecimal znAvg;

	public RwGlabmAvg() {
	}

	public BigDecimal getAgAvg() {
		return this.agAvg;
	}

	public void setAgAvg(BigDecimal agAvg) {
		this.agAvg = agAvg;
	}

	public BigDecimal getAlAvg() {
		return this.alAvg;
	}

	public void setAlAvg(BigDecimal alAvg) {
		this.alAvg = alAvg;
	}

	public BigDecimal getArsenicAvg() {
		return this.arsenicAvg;
	}

	public void setArsenicAvg(BigDecimal arsenicAvg) {
		this.arsenicAvg = arsenicAvg;
	}

	public BigDecimal getBAvg() {
		return this.bAvg;
	}

	public void setBAvg(BigDecimal bAvg) {
		this.bAvg = bAvg;
	}

	public BigDecimal getBaAvg() {
		return this.baAvg;
	}

	public void setBaAvg(BigDecimal baAvg) {
		this.baAvg = baAvg;
	}

	public BigDecimal getBeAvg() {
		return this.beAvg;
	}

	public void setBeAvg(BigDecimal beAvg) {
		this.beAvg = beAvg;
	}

	public BigDecimal getCdAvg() {
		return this.cdAvg;
	}

	public void setCdAvg(BigDecimal cdAvg) {
		this.cdAvg = cdAvg;
	}

	public BigDecimal getCrAvg() {
		return this.crAvg;
	}

	public void setCrAvg(BigDecimal crAvg) {
		this.crAvg = crAvg;
	}

	public BigDecimal getCuAvg() {
		return this.cuAvg;
	}

	public void setCuAvg(BigDecimal cuAvg) {
		this.cuAvg = cuAvg;
	}

	public BigDecimal getFeAvg() {
		return this.feAvg;
	}

	public void setFeAvg(BigDecimal feAvg) {
		this.feAvg = feAvg;
	}

	public BigDecimal getHgAvg() {
		return this.hgAvg;
	}

	public void setHgAvg(BigDecimal hgAvg) {
		this.hgAvg = hgAvg;
	}

	public BigDecimal getMnAvg() {
		return this.mnAvg;
	}

	public void setMnAvg(BigDecimal mnAvg) {
		this.mnAvg = mnAvg;
	}

	public BigDecimal getMoAvg() {
		return this.moAvg;
	}

	public void setMoAvg(BigDecimal moAvg) {
		this.moAvg = moAvg;
	}

	public BigDecimal getNiAvg() {
		return this.niAvg;
	}

	public void setNiAvg(BigDecimal niAvg) {
		this.niAvg = niAvg;
	}

	public BigDecimal getPbAvg() {
		return this.pbAvg;
	}

	public void setPbAvg(BigDecimal pbAvg) {
		this.pbAvg = pbAvg;
	}

	public BigDecimal getSbAvg() {
		return this.sbAvg;
	}

	public void setSbAvg(BigDecimal sbAvg) {
		this.sbAvg = sbAvg;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getTlAvg() {
		return this.tlAvg;
	}

	public void setTlAvg(BigDecimal tlAvg) {
		this.tlAvg = tlAvg;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public BigDecimal getVAvg() {
		return this.vAvg;
	}

	public void setVAvg(BigDecimal vAvg) {
		this.vAvg = vAvg;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

	public BigDecimal getZnAvg() {
		return this.znAvg;
	}

	public void setZnAvg(BigDecimal znAvg) {
		this.znAvg = znAvg;
	}

}