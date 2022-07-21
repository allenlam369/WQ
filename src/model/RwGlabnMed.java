package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_glabn_med database table.
 * 
 */
//@Entity
@Table(name="rw_glabn_med")
@NamedQuery(name="RwGlabnMed.findAll", query="SELECT r FROM RwGlabnMed r")
public class RwGlabnMed implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="chl_med")
	private BigDecimal chlMed;

	@Column(name="cl_med")
	private BigDecimal clMed;

	@Column(name="cod_med")
	private BigDecimal codMed;

	@Column(name="deterg_med")
	private BigDecimal detergMed;

	@Column(name="fl_med")
	private BigDecimal flMed;

	@Column(name="h2s_med")
	private BigDecimal h2sMed;

	@Column(name="nh4_med")
	private BigDecimal nh4Med;

	@Column(name="no2_med")
	private BigDecimal no2Med;

	@Column(name="no3_med")
	private BigDecimal no3Med;

	@Column(name="oil_med")
	private BigDecimal oilMed;

	@Column(name="pheo_med")
	private BigDecimal pheoMed;

	@Column(name="po4_med")
	private BigDecimal po4Med;

	@Column(name="sil_med")
	private BigDecimal silMed;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="ss_med")
	private BigDecimal ssMed;

	@Column(name="ssp_med")
	private BigDecimal sspMed;

	@Column(name="sulp_med")
	private BigDecimal sulpMed;

	@Column(name="tcyn_med")
	private BigDecimal tcynMed;

	@Column(name="tin_med")
	private BigDecimal tinMed;

	@Column(name="tkns_med")
	private BigDecimal tknsMed;

	@Column(name="tknsp_med")
	private BigDecimal tknspMed;

	@Column(name="tn_med")
	private BigDecimal tnMed;

	@Column(name="toc_med")
	private BigDecimal tocMed;

	@Column(name="tps_med")
	private BigDecimal tpsMed;

	@Column(name="tpsp_med")
	private BigDecimal tpspMed;

	@Column(name="ts_med")
	private BigDecimal tsMed;

	@Column(name="tvs_med")
	private BigDecimal tvsMed;

	private double yr;

	private double yyyy;

	public RwGlabnMed() {
	}

	public BigDecimal getChlMed() {
		return this.chlMed;
	}

	public void setChlMed(BigDecimal chlMed) {
		this.chlMed = chlMed;
	}

	public BigDecimal getClMed() {
		return this.clMed;
	}

	public void setClMed(BigDecimal clMed) {
		this.clMed = clMed;
	}

	public BigDecimal getCodMed() {
		return this.codMed;
	}

	public void setCodMed(BigDecimal codMed) {
		this.codMed = codMed;
	}

	public BigDecimal getDetergMed() {
		return this.detergMed;
	}

	public void setDetergMed(BigDecimal detergMed) {
		this.detergMed = detergMed;
	}

	public BigDecimal getFlMed() {
		return this.flMed;
	}

	public void setFlMed(BigDecimal flMed) {
		this.flMed = flMed;
	}

	public BigDecimal getH2sMed() {
		return this.h2sMed;
	}

	public void setH2sMed(BigDecimal h2sMed) {
		this.h2sMed = h2sMed;
	}

	public BigDecimal getNh4Med() {
		return this.nh4Med;
	}

	public void setNh4Med(BigDecimal nh4Med) {
		this.nh4Med = nh4Med;
	}

	public BigDecimal getNo2Med() {
		return this.no2Med;
	}

	public void setNo2Med(BigDecimal no2Med) {
		this.no2Med = no2Med;
	}

	public BigDecimal getNo3Med() {
		return this.no3Med;
	}

	public void setNo3Med(BigDecimal no3Med) {
		this.no3Med = no3Med;
	}

	public BigDecimal getOilMed() {
		return this.oilMed;
	}

	public void setOilMed(BigDecimal oilMed) {
		this.oilMed = oilMed;
	}

	public BigDecimal getPheoMed() {
		return this.pheoMed;
	}

	public void setPheoMed(BigDecimal pheoMed) {
		this.pheoMed = pheoMed;
	}

	public BigDecimal getPo4Med() {
		return this.po4Med;
	}

	public void setPo4Med(BigDecimal po4Med) {
		this.po4Med = po4Med;
	}

	public BigDecimal getSilMed() {
		return this.silMed;
	}

	public void setSilMed(BigDecimal silMed) {
		this.silMed = silMed;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getSsMed() {
		return this.ssMed;
	}

	public void setSsMed(BigDecimal ssMed) {
		this.ssMed = ssMed;
	}

	public BigDecimal getSspMed() {
		return this.sspMed;
	}

	public void setSspMed(BigDecimal sspMed) {
		this.sspMed = sspMed;
	}

	public BigDecimal getSulpMed() {
		return this.sulpMed;
	}

	public void setSulpMed(BigDecimal sulpMed) {
		this.sulpMed = sulpMed;
	}

	public BigDecimal getTcynMed() {
		return this.tcynMed;
	}

	public void setTcynMed(BigDecimal tcynMed) {
		this.tcynMed = tcynMed;
	}

	public BigDecimal getTinMed() {
		return this.tinMed;
	}

	public void setTinMed(BigDecimal tinMed) {
		this.tinMed = tinMed;
	}

	public BigDecimal getTknsMed() {
		return this.tknsMed;
	}

	public void setTknsMed(BigDecimal tknsMed) {
		this.tknsMed = tknsMed;
	}

	public BigDecimal getTknspMed() {
		return this.tknspMed;
	}

	public void setTknspMed(BigDecimal tknspMed) {
		this.tknspMed = tknspMed;
	}

	public BigDecimal getTnMed() {
		return this.tnMed;
	}

	public void setTnMed(BigDecimal tnMed) {
		this.tnMed = tnMed;
	}

	public BigDecimal getTocMed() {
		return this.tocMed;
	}

	public void setTocMed(BigDecimal tocMed) {
		this.tocMed = tocMed;
	}

	public BigDecimal getTpsMed() {
		return this.tpsMed;
	}

	public void setTpsMed(BigDecimal tpsMed) {
		this.tpsMed = tpsMed;
	}

	public BigDecimal getTpspMed() {
		return this.tpspMed;
	}

	public void setTpspMed(BigDecimal tpspMed) {
		this.tpspMed = tpspMed;
	}

	public BigDecimal getTsMed() {
		return this.tsMed;
	}

	public void setTsMed(BigDecimal tsMed) {
		this.tsMed = tsMed;
	}

	public BigDecimal getTvsMed() {
		return this.tvsMed;
	}

	public void setTvsMed(BigDecimal tvsMed) {
		this.tvsMed = tvsMed;
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

}