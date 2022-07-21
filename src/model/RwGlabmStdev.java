package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_glabm_stdev database table.
 * 
 */
//@Entity
@Table(name="rw_glabm_stdev")
@NamedQuery(name="RwGlabmStdev.findAll", query="SELECT r FROM RwGlabmStdev r")
public class RwGlabmStdev implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ag_stdev")
	private BigDecimal agStdev;

	@Column(name="al_stdev")
	private BigDecimal alStdev;

	@Column(name="arsenic_stdev")
	private BigDecimal arsenicStdev;

	@Column(name="b_stdev")
	private BigDecimal bStdev;

	@Column(name="ba_stdev")
	private BigDecimal baStdev;

	@Column(name="be_stdev")
	private BigDecimal beStdev;

	@Column(name="cd_stdev")
	private BigDecimal cdStdev;

	@Column(name="cr_stdev")
	private BigDecimal crStdev;

	@Column(name="cu_stdev")
	private BigDecimal cuStdev;

	@Column(name="fe_stdev")
	private BigDecimal feStdev;

	@Column(name="hg_stdev")
	private BigDecimal hgStdev;

	@Column(name="mn_stdev")
	private BigDecimal mnStdev;

	@Column(name="mo_stdev")
	private BigDecimal moStdev;

	@Column(name="ni_stdev")
	private BigDecimal niStdev;

	@Column(name="pb_stdev")
	private BigDecimal pbStdev;

	@Column(name="sb_stdev")
	private BigDecimal sbStdev;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="tl_stdev")
	private BigDecimal tlStdev;

	private Long total;

	@Column(name="v_stdev")
	private BigDecimal vStdev;

	private double yr;

	@Column(name="zn_stdev")
	private BigDecimal znStdev;

	public RwGlabmStdev() {
	}

	public BigDecimal getAgStdev() {
		return this.agStdev;
	}

	public void setAgStdev(BigDecimal agStdev) {
		this.agStdev = agStdev;
	}

	public BigDecimal getAlStdev() {
		return this.alStdev;
	}

	public void setAlStdev(BigDecimal alStdev) {
		this.alStdev = alStdev;
	}

	public BigDecimal getArsenicStdev() {
		return this.arsenicStdev;
	}

	public void setArsenicStdev(BigDecimal arsenicStdev) {
		this.arsenicStdev = arsenicStdev;
	}

	public BigDecimal getBStdev() {
		return this.bStdev;
	}

	public void setBStdev(BigDecimal bStdev) {
		this.bStdev = bStdev;
	}

	public BigDecimal getBaStdev() {
		return this.baStdev;
	}

	public void setBaStdev(BigDecimal baStdev) {
		this.baStdev = baStdev;
	}

	public BigDecimal getBeStdev() {
		return this.beStdev;
	}

	public void setBeStdev(BigDecimal beStdev) {
		this.beStdev = beStdev;
	}

	public BigDecimal getCdStdev() {
		return this.cdStdev;
	}

	public void setCdStdev(BigDecimal cdStdev) {
		this.cdStdev = cdStdev;
	}

	public BigDecimal getCrStdev() {
		return this.crStdev;
	}

	public void setCrStdev(BigDecimal crStdev) {
		this.crStdev = crStdev;
	}

	public BigDecimal getCuStdev() {
		return this.cuStdev;
	}

	public void setCuStdev(BigDecimal cuStdev) {
		this.cuStdev = cuStdev;
	}

	public BigDecimal getFeStdev() {
		return this.feStdev;
	}

	public void setFeStdev(BigDecimal feStdev) {
		this.feStdev = feStdev;
	}

	public BigDecimal getHgStdev() {
		return this.hgStdev;
	}

	public void setHgStdev(BigDecimal hgStdev) {
		this.hgStdev = hgStdev;
	}

	public BigDecimal getMnStdev() {
		return this.mnStdev;
	}

	public void setMnStdev(BigDecimal mnStdev) {
		this.mnStdev = mnStdev;
	}

	public BigDecimal getMoStdev() {
		return this.moStdev;
	}

	public void setMoStdev(BigDecimal moStdev) {
		this.moStdev = moStdev;
	}

	public BigDecimal getNiStdev() {
		return this.niStdev;
	}

	public void setNiStdev(BigDecimal niStdev) {
		this.niStdev = niStdev;
	}

	public BigDecimal getPbStdev() {
		return this.pbStdev;
	}

	public void setPbStdev(BigDecimal pbStdev) {
		this.pbStdev = pbStdev;
	}

	public BigDecimal getSbStdev() {
		return this.sbStdev;
	}

	public void setSbStdev(BigDecimal sbStdev) {
		this.sbStdev = sbStdev;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getTlStdev() {
		return this.tlStdev;
	}

	public void setTlStdev(BigDecimal tlStdev) {
		this.tlStdev = tlStdev;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public BigDecimal getVStdev() {
		return this.vStdev;
	}

	public void setVStdev(BigDecimal vStdev) {
		this.vStdev = vStdev;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

	public BigDecimal getZnStdev() {
		return this.znStdev;
	}

	public void setZnStdev(BigDecimal znStdev) {
		this.znStdev = znStdev;
	}

}