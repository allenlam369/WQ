package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_glabm_med database table.
 * 
 */
//@Entity
@Table(name="rw_glabm_med")
@NamedQuery(name="RwGlabmMed.findAll", query="SELECT r FROM RwGlabmMed r")
public class RwGlabmMed implements Serializable {
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

	@Column(name="v_med")
	private BigDecimal vMed;

	private double yr;

	private double yyyy;

	@Column(name="zn_med")
	private BigDecimal znMed;

	public RwGlabmMed() {
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

	public double getYyyy() {
		return this.yyyy;
	}

	public void setYyyy(double yyyy) {
		this.yyyy = yyyy;
	}

	public BigDecimal getZnMed() {
		return this.znMed;
	}

	public void setZnMed(BigDecimal znMed) {
		this.znMed = znMed;
	}

}