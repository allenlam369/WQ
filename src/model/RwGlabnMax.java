package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_glabn_max database table.
 * 
 */
//@Entity
@Table(name="rw_glabn_max")
@NamedQuery(name="RwGlabnMax.findAll", query="SELECT r FROM RwGlabnMax r")
public class RwGlabnMax implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="chl_max")
	private BigDecimal chlMax;

	@Column(name="cl_max")
	private BigDecimal clMax;

	@Column(name="cod_max")
	private BigDecimal codMax;

	@Column(name="deterg_max")
	private BigDecimal detergMax;

	@Column(name="fl_max")
	private BigDecimal flMax;

	@Column(name="h2s_max")
	private BigDecimal h2sMax;

	@Column(name="nh4_max")
	private BigDecimal nh4Max;

	@Column(name="no2_max")
	private BigDecimal no2Max;

	@Column(name="no3_max")
	private BigDecimal no3Max;

	@Column(name="oil_max")
	private BigDecimal oilMax;

	@Column(name="pheo_max")
	private BigDecimal pheoMax;

	@Column(name="po4_max")
	private BigDecimal po4Max;

	@Column(name="sil_max")
	private BigDecimal silMax;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="ss_max")
	private BigDecimal ssMax;

	@Column(name="ssp_max")
	private BigDecimal sspMax;

	@Column(name="sulp_max")
	private BigDecimal sulpMax;

	@Column(name="tcyn_max")
	private BigDecimal tcynMax;

	@Column(name="tin_max")
	private BigDecimal tinMax;

	@Column(name="tkns_max")
	private BigDecimal tknsMax;

	@Column(name="tknsp_max")
	private BigDecimal tknspMax;

	@Column(name="tn_max")
	private BigDecimal tnMax;

	@Column(name="toc_max")
	private BigDecimal tocMax;

	private Long total;

	@Column(name="tps_max")
	private BigDecimal tpsMax;

	@Column(name="tpsp_max")
	private BigDecimal tpspMax;

	@Column(name="ts_max")
	private BigDecimal tsMax;

	@Column(name="tvs_max")
	private BigDecimal tvsMax;

	private double yr;

	public RwGlabnMax() {
	}

	public BigDecimal getChlMax() {
		return this.chlMax;
	}

	public void setChlMax(BigDecimal chlMax) {
		this.chlMax = chlMax;
	}

	public BigDecimal getClMax() {
		return this.clMax;
	}

	public void setClMax(BigDecimal clMax) {
		this.clMax = clMax;
	}

	public BigDecimal getCodMax() {
		return this.codMax;
	}

	public void setCodMax(BigDecimal codMax) {
		this.codMax = codMax;
	}

	public BigDecimal getDetergMax() {
		return this.detergMax;
	}

	public void setDetergMax(BigDecimal detergMax) {
		this.detergMax = detergMax;
	}

	public BigDecimal getFlMax() {
		return this.flMax;
	}

	public void setFlMax(BigDecimal flMax) {
		this.flMax = flMax;
	}

	public BigDecimal getH2sMax() {
		return this.h2sMax;
	}

	public void setH2sMax(BigDecimal h2sMax) {
		this.h2sMax = h2sMax;
	}

	public BigDecimal getNh4Max() {
		return this.nh4Max;
	}

	public void setNh4Max(BigDecimal nh4Max) {
		this.nh4Max = nh4Max;
	}

	public BigDecimal getNo2Max() {
		return this.no2Max;
	}

	public void setNo2Max(BigDecimal no2Max) {
		this.no2Max = no2Max;
	}

	public BigDecimal getNo3Max() {
		return this.no3Max;
	}

	public void setNo3Max(BigDecimal no3Max) {
		this.no3Max = no3Max;
	}

	public BigDecimal getOilMax() {
		return this.oilMax;
	}

	public void setOilMax(BigDecimal oilMax) {
		this.oilMax = oilMax;
	}

	public BigDecimal getPheoMax() {
		return this.pheoMax;
	}

	public void setPheoMax(BigDecimal pheoMax) {
		this.pheoMax = pheoMax;
	}

	public BigDecimal getPo4Max() {
		return this.po4Max;
	}

	public void setPo4Max(BigDecimal po4Max) {
		this.po4Max = po4Max;
	}

	public BigDecimal getSilMax() {
		return this.silMax;
	}

	public void setSilMax(BigDecimal silMax) {
		this.silMax = silMax;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getSsMax() {
		return this.ssMax;
	}

	public void setSsMax(BigDecimal ssMax) {
		this.ssMax = ssMax;
	}

	public BigDecimal getSspMax() {
		return this.sspMax;
	}

	public void setSspMax(BigDecimal sspMax) {
		this.sspMax = sspMax;
	}

	public BigDecimal getSulpMax() {
		return this.sulpMax;
	}

	public void setSulpMax(BigDecimal sulpMax) {
		this.sulpMax = sulpMax;
	}

	public BigDecimal getTcynMax() {
		return this.tcynMax;
	}

	public void setTcynMax(BigDecimal tcynMax) {
		this.tcynMax = tcynMax;
	}

	public BigDecimal getTinMax() {
		return this.tinMax;
	}

	public void setTinMax(BigDecimal tinMax) {
		this.tinMax = tinMax;
	}

	public BigDecimal getTknsMax() {
		return this.tknsMax;
	}

	public void setTknsMax(BigDecimal tknsMax) {
		this.tknsMax = tknsMax;
	}

	public BigDecimal getTknspMax() {
		return this.tknspMax;
	}

	public void setTknspMax(BigDecimal tknspMax) {
		this.tknspMax = tknspMax;
	}

	public BigDecimal getTnMax() {
		return this.tnMax;
	}

	public void setTnMax(BigDecimal tnMax) {
		this.tnMax = tnMax;
	}

	public BigDecimal getTocMax() {
		return this.tocMax;
	}

	public void setTocMax(BigDecimal tocMax) {
		this.tocMax = tocMax;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public BigDecimal getTpsMax() {
		return this.tpsMax;
	}

	public void setTpsMax(BigDecimal tpsMax) {
		this.tpsMax = tpsMax;
	}

	public BigDecimal getTpspMax() {
		return this.tpspMax;
	}

	public void setTpspMax(BigDecimal tpspMax) {
		this.tpspMax = tpspMax;
	}

	public BigDecimal getTsMax() {
		return this.tsMax;
	}

	public void setTsMax(BigDecimal tsMax) {
		this.tsMax = tsMax;
	}

	public BigDecimal getTvsMax() {
		return this.tvsMax;
	}

	public void setTvsMax(BigDecimal tvsMax) {
		this.tvsMax = tvsMax;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

}