package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_glabm_med_a database table.
 * 
 */
//@Entity
@Table(name="rw_glabm_med_a")
@NamedQuery(name="RwGlabmMedA.findAll", query="SELECT r FROM RwGlabmMedA r")
public class RwGlabmMedA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ag_med")
	private BigDecimal agMed;

	@Column(name="al_med")
	private BigDecimal alMed;

	@Column(name="arsenic_med")
	private BigDecimal arsenicMed;

	@Column(name="b_med")
	private BigDecimal bMed;

	@Column(name="ba_med")
	private BigDecimal baMed;

	@Column(name="be_med")
	private BigDecimal beMed;

	@Column(name="cd_med")
	private BigDecimal cdMed;

	@Column(name="cr_med")
	private BigDecimal crMed;

	@Column(name="cu_med")
	private BigDecimal cuMed;

	@Column(name="fe_med")
	private BigDecimal feMed;

	@Column(name="hg_med")
	private BigDecimal hgMed;

	@Column(name="l_ag_med")
	private String lAgMed;

	@Column(name="l_al_med")
	private String lAlMed;

	@Column(name="l_arsenic_med")
	private String lArsenicMed;

	@Column(name="l_b_med")
	private String lBMed;

	@Column(name="l_ba_med")
	private String lBaMed;

	@Column(name="l_be_med")
	private String lBeMed;

	@Column(name="l_cd_med")
	private String lCdMed;

	@Column(name="l_cr_med")
	private String lCrMed;

	@Column(name="l_cu_med")
	private String lCuMed;

	@Column(name="l_fe_med")
	private String lFeMed;

	@Column(name="l_hg_med")
	private String lHgMed;

	@Column(name="l_mn_med")
	private String lMnMed;

	@Column(name="l_mo_med")
	private String lMoMed;

	@Column(name="l_ni_med")
	private String lNiMed;

	@Column(name="l_pb_med")
	private String lPbMed;

	@Column(name="l_sb_med")
	private String lSbMed;

	@Column(name="l_tl_med")
	private String lTlMed;

	@Column(name="l_v_med")
	private String lVMed;

	@Column(name="l_zn_med")
	private String lZnMed;

	@Column(name="mn_med")
	private BigDecimal mnMed;

	@Column(name="mo_med")
	private BigDecimal moMed;

	@Column(name="ni_med")
	private BigDecimal niMed;

	@Column(name="pb_med")
	private BigDecimal pbMed;

	@Column(name="sb_med")
	private BigDecimal sbMed;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="tl_med")
	private BigDecimal tlMed;

	private Long total;

	@Column(name="v_med")
	private BigDecimal vMed;

	private double yr;

	@Column(name="zn_med")
	private BigDecimal znMed;

	public RwGlabmMedA() {
	}

	public BigDecimal getAgMed() {
		return this.agMed;
	}

	public void setAgMed(BigDecimal agMed) {
		this.agMed = agMed;
	}

	public BigDecimal getAlMed() {
		return this.alMed;
	}

	public void setAlMed(BigDecimal alMed) {
		this.alMed = alMed;
	}

	public BigDecimal getArsenicMed() {
		return this.arsenicMed;
	}

	public void setArsenicMed(BigDecimal arsenicMed) {
		this.arsenicMed = arsenicMed;
	}

	public BigDecimal getBMed() {
		return this.bMed;
	}

	public void setBMed(BigDecimal bMed) {
		this.bMed = bMed;
	}

	public BigDecimal getBaMed() {
		return this.baMed;
	}

	public void setBaMed(BigDecimal baMed) {
		this.baMed = baMed;
	}

	public BigDecimal getBeMed() {
		return this.beMed;
	}

	public void setBeMed(BigDecimal beMed) {
		this.beMed = beMed;
	}

	public BigDecimal getCdMed() {
		return this.cdMed;
	}

	public void setCdMed(BigDecimal cdMed) {
		this.cdMed = cdMed;
	}

	public BigDecimal getCrMed() {
		return this.crMed;
	}

	public void setCrMed(BigDecimal crMed) {
		this.crMed = crMed;
	}

	public BigDecimal getCuMed() {
		return this.cuMed;
	}

	public void setCuMed(BigDecimal cuMed) {
		this.cuMed = cuMed;
	}

	public BigDecimal getFeMed() {
		return this.feMed;
	}

	public void setFeMed(BigDecimal feMed) {
		this.feMed = feMed;
	}

	public BigDecimal getHgMed() {
		return this.hgMed;
	}

	public void setHgMed(BigDecimal hgMed) {
		this.hgMed = hgMed;
	}

	public String getLAgMed() {
		return this.lAgMed;
	}

	public void setLAgMed(String lAgMed) {
		this.lAgMed = lAgMed;
	}

	public String getLAlMed() {
		return this.lAlMed;
	}

	public void setLAlMed(String lAlMed) {
		this.lAlMed = lAlMed;
	}

	public String getLArsenicMed() {
		return this.lArsenicMed;
	}

	public void setLArsenicMed(String lArsenicMed) {
		this.lArsenicMed = lArsenicMed;
	}

	public String getLBMed() {
		return this.lBMed;
	}

	public void setLBMed(String lBMed) {
		this.lBMed = lBMed;
	}

	public String getLBaMed() {
		return this.lBaMed;
	}

	public void setLBaMed(String lBaMed) {
		this.lBaMed = lBaMed;
	}

	public String getLBeMed() {
		return this.lBeMed;
	}

	public void setLBeMed(String lBeMed) {
		this.lBeMed = lBeMed;
	}

	public String getLCdMed() {
		return this.lCdMed;
	}

	public void setLCdMed(String lCdMed) {
		this.lCdMed = lCdMed;
	}

	public String getLCrMed() {
		return this.lCrMed;
	}

	public void setLCrMed(String lCrMed) {
		this.lCrMed = lCrMed;
	}

	public String getLCuMed() {
		return this.lCuMed;
	}

	public void setLCuMed(String lCuMed) {
		this.lCuMed = lCuMed;
	}

	public String getLFeMed() {
		return this.lFeMed;
	}

	public void setLFeMed(String lFeMed) {
		this.lFeMed = lFeMed;
	}

	public String getLHgMed() {
		return this.lHgMed;
	}

	public void setLHgMed(String lHgMed) {
		this.lHgMed = lHgMed;
	}

	public String getLMnMed() {
		return this.lMnMed;
	}

	public void setLMnMed(String lMnMed) {
		this.lMnMed = lMnMed;
	}

	public String getLMoMed() {
		return this.lMoMed;
	}

	public void setLMoMed(String lMoMed) {
		this.lMoMed = lMoMed;
	}

	public String getLNiMed() {
		return this.lNiMed;
	}

	public void setLNiMed(String lNiMed) {
		this.lNiMed = lNiMed;
	}

	public String getLPbMed() {
		return this.lPbMed;
	}

	public void setLPbMed(String lPbMed) {
		this.lPbMed = lPbMed;
	}

	public String getLSbMed() {
		return this.lSbMed;
	}

	public void setLSbMed(String lSbMed) {
		this.lSbMed = lSbMed;
	}

	public String getLTlMed() {
		return this.lTlMed;
	}

	public void setLTlMed(String lTlMed) {
		this.lTlMed = lTlMed;
	}

	public String getLVMed() {
		return this.lVMed;
	}

	public void setLVMed(String lVMed) {
		this.lVMed = lVMed;
	}

	public String getLZnMed() {
		return this.lZnMed;
	}

	public void setLZnMed(String lZnMed) {
		this.lZnMed = lZnMed;
	}

	public BigDecimal getMnMed() {
		return this.mnMed;
	}

	public void setMnMed(BigDecimal mnMed) {
		this.mnMed = mnMed;
	}

	public BigDecimal getMoMed() {
		return this.moMed;
	}

	public void setMoMed(BigDecimal moMed) {
		this.moMed = moMed;
	}

	public BigDecimal getNiMed() {
		return this.niMed;
	}

	public void setNiMed(BigDecimal niMed) {
		this.niMed = niMed;
	}

	public BigDecimal getPbMed() {
		return this.pbMed;
	}

	public void setPbMed(BigDecimal pbMed) {
		this.pbMed = pbMed;
	}

	public BigDecimal getSbMed() {
		return this.sbMed;
	}

	public void setSbMed(BigDecimal sbMed) {
		this.sbMed = sbMed;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getTlMed() {
		return this.tlMed;
	}

	public void setTlMed(BigDecimal tlMed) {
		this.tlMed = tlMed;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public BigDecimal getVMed() {
		return this.vMed;
	}

	public void setVMed(BigDecimal vMed) {
		this.vMed = vMed;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

	public BigDecimal getZnMed() {
		return this.znMed;
	}

	public void setZnMed(BigDecimal znMed) {
		this.znMed = znMed;
	}

}