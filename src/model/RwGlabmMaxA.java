package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_glabm_max_a database table.
 * 
 */
//@Entity
@Table(name="rw_glabm_max_a")
@NamedQuery(name="RwGlabmMaxA.findAll", query="SELECT r FROM RwGlabmMaxA r")
public class RwGlabmMaxA implements Serializable {
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

	@Column(name="l_ag_max")
	private String lAgMax;

	@Column(name="l_al_max")
	private String lAlMax;

	@Column(name="l_arsenic_max")
	private String lArsenicMax;

	@Column(name="l_b_max")
	private String lBMax;

	@Column(name="l_ba_max")
	private String lBaMax;

	@Column(name="l_be_max")
	private String lBeMax;

	@Column(name="l_cd_max")
	private String lCdMax;

	@Column(name="l_cr_max")
	private String lCrMax;

	@Column(name="l_cu_max")
	private String lCuMax;

	@Column(name="l_fe_max")
	private String lFeMax;

	@Column(name="l_hg_max")
	private String lHgMax;

	@Column(name="l_mn_max")
	private String lMnMax;

	@Column(name="l_mo_max")
	private String lMoMax;

	@Column(name="l_ni_max")
	private String lNiMax;

	@Column(name="l_pb_max")
	private String lPbMax;

	@Column(name="l_sb_max")
	private String lSbMax;

	@Column(name="l_tl_max")
	private String lTlMax;

	@Column(name="l_v_max")
	private String lVMax;

	@Column(name="l_zn_max")
	private String lZnMax;

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

	public RwGlabmMaxA() {
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

	public String getLAgMax() {
		return this.lAgMax;
	}

	public void setLAgMax(String lAgMax) {
		this.lAgMax = lAgMax;
	}

	public String getLAlMax() {
		return this.lAlMax;
	}

	public void setLAlMax(String lAlMax) {
		this.lAlMax = lAlMax;
	}

	public String getLArsenicMax() {
		return this.lArsenicMax;
	}

	public void setLArsenicMax(String lArsenicMax) {
		this.lArsenicMax = lArsenicMax;
	}

	public String getLBMax() {
		return this.lBMax;
	}

	public void setLBMax(String lBMax) {
		this.lBMax = lBMax;
	}

	public String getLBaMax() {
		return this.lBaMax;
	}

	public void setLBaMax(String lBaMax) {
		this.lBaMax = lBaMax;
	}

	public String getLBeMax() {
		return this.lBeMax;
	}

	public void setLBeMax(String lBeMax) {
		this.lBeMax = lBeMax;
	}

	public String getLCdMax() {
		return this.lCdMax;
	}

	public void setLCdMax(String lCdMax) {
		this.lCdMax = lCdMax;
	}

	public String getLCrMax() {
		return this.lCrMax;
	}

	public void setLCrMax(String lCrMax) {
		this.lCrMax = lCrMax;
	}

	public String getLCuMax() {
		return this.lCuMax;
	}

	public void setLCuMax(String lCuMax) {
		this.lCuMax = lCuMax;
	}

	public String getLFeMax() {
		return this.lFeMax;
	}

	public void setLFeMax(String lFeMax) {
		this.lFeMax = lFeMax;
	}

	public String getLHgMax() {
		return this.lHgMax;
	}

	public void setLHgMax(String lHgMax) {
		this.lHgMax = lHgMax;
	}

	public String getLMnMax() {
		return this.lMnMax;
	}

	public void setLMnMax(String lMnMax) {
		this.lMnMax = lMnMax;
	}

	public String getLMoMax() {
		return this.lMoMax;
	}

	public void setLMoMax(String lMoMax) {
		this.lMoMax = lMoMax;
	}

	public String getLNiMax() {
		return this.lNiMax;
	}

	public void setLNiMax(String lNiMax) {
		this.lNiMax = lNiMax;
	}

	public String getLPbMax() {
		return this.lPbMax;
	}

	public void setLPbMax(String lPbMax) {
		this.lPbMax = lPbMax;
	}

	public String getLSbMax() {
		return this.lSbMax;
	}

	public void setLSbMax(String lSbMax) {
		this.lSbMax = lSbMax;
	}

	public String getLTlMax() {
		return this.lTlMax;
	}

	public void setLTlMax(String lTlMax) {
		this.lTlMax = lTlMax;
	}

	public String getLVMax() {
		return this.lVMax;
	}

	public void setLVMax(String lVMax) {
		this.lVMax = lVMax;
	}

	public String getLZnMax() {
		return this.lZnMax;
	}

	public void setLZnMax(String lZnMax) {
		this.lZnMax = lZnMax;
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