package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_glabm_min_a database table.
 * 
 */
//@Entity
@Table(name="rw_glabm_min_a")
@NamedQuery(name="RwGlabmMinA.findAll", query="SELECT r FROM RwGlabmMinA r")
public class RwGlabmMinA implements Serializable {
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

	@Column(name="l_ag_min")
	private String lAgMin;

	@Column(name="l_al_min")
	private String lAlMin;

	@Column(name="l_arsenic_min")
	private String lArsenicMin;

	@Column(name="l_b_min")
	private String lBMin;

	@Column(name="l_ba_min")
	private String lBaMin;

	@Column(name="l_be_min")
	private String lBeMin;

	@Column(name="l_cd_min")
	private String lCdMin;

	@Column(name="l_cr_min")
	private String lCrMin;

	@Column(name="l_cu_min")
	private String lCuMin;

	@Column(name="l_fe_min")
	private String lFeMin;

	@Column(name="l_hg_min")
	private String lHgMin;

	@Column(name="l_mn_min")
	private String lMnMin;

	@Column(name="l_mo_min")
	private String lMoMin;

	@Column(name="l_ni_min")
	private String lNiMin;

	@Column(name="l_pb_min")
	private String lPbMin;

	@Column(name="l_sb_min")
	private String lSbMin;

	@Column(name="l_tl_min")
	private String lTlMin;

	@Column(name="l_v_min")
	private String lVMin;

	@Column(name="l_zn_min")
	private String lZnMin;

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

	public RwGlabmMinA() {
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

	public String getLAgMin() {
		return this.lAgMin;
	}

	public void setLAgMin(String lAgMin) {
		this.lAgMin = lAgMin;
	}

	public String getLAlMin() {
		return this.lAlMin;
	}

	public void setLAlMin(String lAlMin) {
		this.lAlMin = lAlMin;
	}

	public String getLArsenicMin() {
		return this.lArsenicMin;
	}

	public void setLArsenicMin(String lArsenicMin) {
		this.lArsenicMin = lArsenicMin;
	}

	public String getLBMin() {
		return this.lBMin;
	}

	public void setLBMin(String lBMin) {
		this.lBMin = lBMin;
	}

	public String getLBaMin() {
		return this.lBaMin;
	}

	public void setLBaMin(String lBaMin) {
		this.lBaMin = lBaMin;
	}

	public String getLBeMin() {
		return this.lBeMin;
	}

	public void setLBeMin(String lBeMin) {
		this.lBeMin = lBeMin;
	}

	public String getLCdMin() {
		return this.lCdMin;
	}

	public void setLCdMin(String lCdMin) {
		this.lCdMin = lCdMin;
	}

	public String getLCrMin() {
		return this.lCrMin;
	}

	public void setLCrMin(String lCrMin) {
		this.lCrMin = lCrMin;
	}

	public String getLCuMin() {
		return this.lCuMin;
	}

	public void setLCuMin(String lCuMin) {
		this.lCuMin = lCuMin;
	}

	public String getLFeMin() {
		return this.lFeMin;
	}

	public void setLFeMin(String lFeMin) {
		this.lFeMin = lFeMin;
	}

	public String getLHgMin() {
		return this.lHgMin;
	}

	public void setLHgMin(String lHgMin) {
		this.lHgMin = lHgMin;
	}

	public String getLMnMin() {
		return this.lMnMin;
	}

	public void setLMnMin(String lMnMin) {
		this.lMnMin = lMnMin;
	}

	public String getLMoMin() {
		return this.lMoMin;
	}

	public void setLMoMin(String lMoMin) {
		this.lMoMin = lMoMin;
	}

	public String getLNiMin() {
		return this.lNiMin;
	}

	public void setLNiMin(String lNiMin) {
		this.lNiMin = lNiMin;
	}

	public String getLPbMin() {
		return this.lPbMin;
	}

	public void setLPbMin(String lPbMin) {
		this.lPbMin = lPbMin;
	}

	public String getLSbMin() {
		return this.lSbMin;
	}

	public void setLSbMin(String lSbMin) {
		this.lSbMin = lSbMin;
	}

	public String getLTlMin() {
		return this.lTlMin;
	}

	public void setLTlMin(String lTlMin) {
		this.lTlMin = lTlMin;
	}

	public String getLVMin() {
		return this.lVMin;
	}

	public void setLVMin(String lVMin) {
		this.lVMin = lVMin;
	}

	public String getLZnMin() {
		return this.lZnMin;
	}

	public void setLZnMin(String lZnMin) {
		this.lZnMin = lZnMin;
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