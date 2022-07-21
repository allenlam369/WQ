package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_glabm_avg_a database table.
 * 
 */
//@Entity
@Table(name="rw_glabm_avg_a")
@NamedQuery(name="RwGlabmAvgA.findAll", query="SELECT r FROM RwGlabmAvgA r")
public class RwGlabmAvgA implements Serializable {
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

	@Column(name="l_ag_avg")
	private String lAgAvg;

	@Column(name="l_al_avg")
	private String lAlAvg;

	@Column(name="l_arsenic_avg")
	private String lArsenicAvg;

	@Column(name="l_b_avg")
	private String lBAvg;

	@Column(name="l_ba_avg")
	private String lBaAvg;

	@Column(name="l_be_avg")
	private String lBeAvg;

	@Column(name="l_cd_avg")
	private String lCdAvg;

	@Column(name="l_cr_avg")
	private String lCrAvg;

	@Column(name="l_cu_avg")
	private String lCuAvg;

	@Column(name="l_fe_avg")
	private String lFeAvg;

	@Column(name="l_hg_avg")
	private String lHgAvg;

	@Column(name="l_mn_avg")
	private String lMnAvg;

	@Column(name="l_mo_avg")
	private String lMoAvg;

	@Column(name="l_ni_avg")
	private String lNiAvg;

	@Column(name="l_pb_avg")
	private String lPbAvg;

	@Column(name="l_sb_avg")
	private String lSbAvg;

	@Column(name="l_tl_avg")
	private String lTlAvg;

	@Column(name="l_v_avg")
	private String lVAvg;

	@Column(name="l_zn_avg")
	private String lZnAvg;

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

	public RwGlabmAvgA() {
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

	public String getLAgAvg() {
		return this.lAgAvg;
	}

	public void setLAgAvg(String lAgAvg) {
		this.lAgAvg = lAgAvg;
	}

	public String getLAlAvg() {
		return this.lAlAvg;
	}

	public void setLAlAvg(String lAlAvg) {
		this.lAlAvg = lAlAvg;
	}

	public String getLArsenicAvg() {
		return this.lArsenicAvg;
	}

	public void setLArsenicAvg(String lArsenicAvg) {
		this.lArsenicAvg = lArsenicAvg;
	}

	public String getLBAvg() {
		return this.lBAvg;
	}

	public void setLBAvg(String lBAvg) {
		this.lBAvg = lBAvg;
	}

	public String getLBaAvg() {
		return this.lBaAvg;
	}

	public void setLBaAvg(String lBaAvg) {
		this.lBaAvg = lBaAvg;
	}

	public String getLBeAvg() {
		return this.lBeAvg;
	}

	public void setLBeAvg(String lBeAvg) {
		this.lBeAvg = lBeAvg;
	}

	public String getLCdAvg() {
		return this.lCdAvg;
	}

	public void setLCdAvg(String lCdAvg) {
		this.lCdAvg = lCdAvg;
	}

	public String getLCrAvg() {
		return this.lCrAvg;
	}

	public void setLCrAvg(String lCrAvg) {
		this.lCrAvg = lCrAvg;
	}

	public String getLCuAvg() {
		return this.lCuAvg;
	}

	public void setLCuAvg(String lCuAvg) {
		this.lCuAvg = lCuAvg;
	}

	public String getLFeAvg() {
		return this.lFeAvg;
	}

	public void setLFeAvg(String lFeAvg) {
		this.lFeAvg = lFeAvg;
	}

	public String getLHgAvg() {
		return this.lHgAvg;
	}

	public void setLHgAvg(String lHgAvg) {
		this.lHgAvg = lHgAvg;
	}

	public String getLMnAvg() {
		return this.lMnAvg;
	}

	public void setLMnAvg(String lMnAvg) {
		this.lMnAvg = lMnAvg;
	}

	public String getLMoAvg() {
		return this.lMoAvg;
	}

	public void setLMoAvg(String lMoAvg) {
		this.lMoAvg = lMoAvg;
	}

	public String getLNiAvg() {
		return this.lNiAvg;
	}

	public void setLNiAvg(String lNiAvg) {
		this.lNiAvg = lNiAvg;
	}

	public String getLPbAvg() {
		return this.lPbAvg;
	}

	public void setLPbAvg(String lPbAvg) {
		this.lPbAvg = lPbAvg;
	}

	public String getLSbAvg() {
		return this.lSbAvg;
	}

	public void setLSbAvg(String lSbAvg) {
		this.lSbAvg = lSbAvg;
	}

	public String getLTlAvg() {
		return this.lTlAvg;
	}

	public void setLTlAvg(String lTlAvg) {
		this.lTlAvg = lTlAvg;
	}

	public String getLVAvg() {
		return this.lVAvg;
	}

	public void setLVAvg(String lVAvg) {
		this.lVAvg = lVAvg;
	}

	public String getLZnAvg() {
		return this.lZnAvg;
	}

	public void setLZnAvg(String lZnAvg) {
		this.lZnAvg = lZnAvg;
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