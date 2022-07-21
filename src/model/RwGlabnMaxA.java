package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_glabn_max_a database table.
 * 
 */
//@Entity
@Table(name="rw_glabn_max_a")
@NamedQuery(name="RwGlabnMaxA.findAll", query="SELECT r FROM RwGlabnMaxA r")
public class RwGlabnMaxA implements Serializable {
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

	@Column(name="l_chl_max")
	private String lChlMax;

	@Column(name="l_cl_max")
	private String lClMax;

	@Column(name="l_cod_max")
	private String lCodMax;

	@Column(name="l_deterg_max")
	private String lDetergMax;

	@Column(name="l_fl_max")
	private String lFlMax;

	@Column(name="l_h2s_max")
	private String lH2sMax;

	@Column(name="l_nh4_max")
	private String lNh4Max;

	@Column(name="l_no2_max")
	private String lNo2Max;

	@Column(name="l_no3_max")
	private String lNo3Max;

	@Column(name="l_oil_max")
	private String lOilMax;

	@Column(name="l_pheo_max")
	private String lPheoMax;

	@Column(name="l_po4_max")
	private String lPo4Max;

	@Column(name="l_sil_max")
	private String lSilMax;

	@Column(name="l_ss_max")
	private String lSsMax;

	@Column(name="l_ssp_max")
	private String lSspMax;

	@Column(name="l_sulp_max")
	private String lSulpMax;

	@Column(name="l_tcyn_max")
	private String lTcynMax;

	@Column(name="l_tin_max")
	private String lTinMax;

	@Column(name="l_tkns_max")
	private String lTknsMax;

	@Column(name="l_tknsp_max")
	private String lTknspMax;

	@Column(name="l_tn_max")
	private String lTnMax;

	@Column(name="l_toc_max")
	private String lTocMax;

	@Column(name="l_tps_max")
	private String lTpsMax;

	@Column(name="l_tpsp_max")
	private String lTpspMax;

	@Column(name="l_ts_max")
	private String lTsMax;

	@Column(name="l_tvs_max")
	private String lTvsMax;

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

	public RwGlabnMaxA() {
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

	public String getLChlMax() {
		return this.lChlMax;
	}

	public void setLChlMax(String lChlMax) {
		this.lChlMax = lChlMax;
	}

	public String getLClMax() {
		return this.lClMax;
	}

	public void setLClMax(String lClMax) {
		this.lClMax = lClMax;
	}

	public String getLCodMax() {
		return this.lCodMax;
	}

	public void setLCodMax(String lCodMax) {
		this.lCodMax = lCodMax;
	}

	public String getLDetergMax() {
		return this.lDetergMax;
	}

	public void setLDetergMax(String lDetergMax) {
		this.lDetergMax = lDetergMax;
	}

	public String getLFlMax() {
		return this.lFlMax;
	}

	public void setLFlMax(String lFlMax) {
		this.lFlMax = lFlMax;
	}

	public String getLH2sMax() {
		return this.lH2sMax;
	}

	public void setLH2sMax(String lH2sMax) {
		this.lH2sMax = lH2sMax;
	}

	public String getLNh4Max() {
		return this.lNh4Max;
	}

	public void setLNh4Max(String lNh4Max) {
		this.lNh4Max = lNh4Max;
	}

	public String getLNo2Max() {
		return this.lNo2Max;
	}

	public void setLNo2Max(String lNo2Max) {
		this.lNo2Max = lNo2Max;
	}

	public String getLNo3Max() {
		return this.lNo3Max;
	}

	public void setLNo3Max(String lNo3Max) {
		this.lNo3Max = lNo3Max;
	}

	public String getLOilMax() {
		return this.lOilMax;
	}

	public void setLOilMax(String lOilMax) {
		this.lOilMax = lOilMax;
	}

	public String getLPheoMax() {
		return this.lPheoMax;
	}

	public void setLPheoMax(String lPheoMax) {
		this.lPheoMax = lPheoMax;
	}

	public String getLPo4Max() {
		return this.lPo4Max;
	}

	public void setLPo4Max(String lPo4Max) {
		this.lPo4Max = lPo4Max;
	}

	public String getLSilMax() {
		return this.lSilMax;
	}

	public void setLSilMax(String lSilMax) {
		this.lSilMax = lSilMax;
	}

	public String getLSsMax() {
		return this.lSsMax;
	}

	public void setLSsMax(String lSsMax) {
		this.lSsMax = lSsMax;
	}

	public String getLSspMax() {
		return this.lSspMax;
	}

	public void setLSspMax(String lSspMax) {
		this.lSspMax = lSspMax;
	}

	public String getLSulpMax() {
		return this.lSulpMax;
	}

	public void setLSulpMax(String lSulpMax) {
		this.lSulpMax = lSulpMax;
	}

	public String getLTcynMax() {
		return this.lTcynMax;
	}

	public void setLTcynMax(String lTcynMax) {
		this.lTcynMax = lTcynMax;
	}

	public String getLTinMax() {
		return this.lTinMax;
	}

	public void setLTinMax(String lTinMax) {
		this.lTinMax = lTinMax;
	}

	public String getLTknsMax() {
		return this.lTknsMax;
	}

	public void setLTknsMax(String lTknsMax) {
		this.lTknsMax = lTknsMax;
	}

	public String getLTknspMax() {
		return this.lTknspMax;
	}

	public void setLTknspMax(String lTknspMax) {
		this.lTknspMax = lTknspMax;
	}

	public String getLTnMax() {
		return this.lTnMax;
	}

	public void setLTnMax(String lTnMax) {
		this.lTnMax = lTnMax;
	}

	public String getLTocMax() {
		return this.lTocMax;
	}

	public void setLTocMax(String lTocMax) {
		this.lTocMax = lTocMax;
	}

	public String getLTpsMax() {
		return this.lTpsMax;
	}

	public void setLTpsMax(String lTpsMax) {
		this.lTpsMax = lTpsMax;
	}

	public String getLTpspMax() {
		return this.lTpspMax;
	}

	public void setLTpspMax(String lTpspMax) {
		this.lTpspMax = lTpspMax;
	}

	public String getLTsMax() {
		return this.lTsMax;
	}

	public void setLTsMax(String lTsMax) {
		this.lTsMax = lTsMax;
	}

	public String getLTvsMax() {
		return this.lTvsMax;
	}

	public void setLTvsMax(String lTvsMax) {
		this.lTvsMax = lTvsMax;
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