package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_glabn_med_a database table.
 * 
 */
//@Entity
@Table(name="rw_glabn_med_a")
@NamedQuery(name="RwGlabnMedA.findAll", query="SELECT r FROM RwGlabnMedA r")
public class RwGlabnMedA implements Serializable {
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

	@Column(name="l_chl_med")
	private String lChlMed;

	@Column(name="l_cl_med")
	private String lClMed;

	@Column(name="l_cod_med")
	private String lCodMed;

	@Column(name="l_deterg_med")
	private String lDetergMed;

	@Column(name="l_fl_med")
	private String lFlMed;

	@Column(name="l_h2s_med")
	private String lH2sMed;

	@Column(name="l_nh4_med")
	private String lNh4Med;

	@Column(name="l_no2_med")
	private String lNo2Med;

	@Column(name="l_no3_med")
	private String lNo3Med;

	@Column(name="l_oil_med")
	private String lOilMed;

	@Column(name="l_pheo_med")
	private String lPheoMed;

	@Column(name="l_po4_med")
	private String lPo4Med;

	@Column(name="l_sil_med")
	private String lSilMed;

	@Column(name="l_ss_med")
	private String lSsMed;

	@Column(name="l_ssp_med")
	private String lSspMed;

	@Column(name="l_sulp_med")
	private String lSulpMed;

	@Column(name="l_tcyn_med")
	private String lTcynMed;

	@Column(name="l_tin_med")
	private String lTinMed;

	@Column(name="l_tkns_med")
	private String lTknsMed;

	@Column(name="l_tknsp_med")
	private String lTknspMed;

	@Column(name="l_tn_med")
	private String lTnMed;

	@Column(name="l_toc_med")
	private String lTocMed;

	@Column(name="l_tps_med")
	private String lTpsMed;

	@Column(name="l_tpsp_med")
	private String lTpspMed;

	@Column(name="l_ts_med")
	private String lTsMed;

	@Column(name="l_tvs_med")
	private String lTvsMed;

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

	private Long total;

	@Column(name="tps_med")
	private BigDecimal tpsMed;

	@Column(name="tpsp_med")
	private BigDecimal tpspMed;

	@Column(name="ts_med")
	private BigDecimal tsMed;

	@Column(name="tvs_med")
	private BigDecimal tvsMed;

	private double yr;

	public RwGlabnMedA() {
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

	public String getLChlMed() {
		return this.lChlMed;
	}

	public void setLChlMed(String lChlMed) {
		this.lChlMed = lChlMed;
	}

	public String getLClMed() {
		return this.lClMed;
	}

	public void setLClMed(String lClMed) {
		this.lClMed = lClMed;
	}

	public String getLCodMed() {
		return this.lCodMed;
	}

	public void setLCodMed(String lCodMed) {
		this.lCodMed = lCodMed;
	}

	public String getLDetergMed() {
		return this.lDetergMed;
	}

	public void setLDetergMed(String lDetergMed) {
		this.lDetergMed = lDetergMed;
	}

	public String getLFlMed() {
		return this.lFlMed;
	}

	public void setLFlMed(String lFlMed) {
		this.lFlMed = lFlMed;
	}

	public String getLH2sMed() {
		return this.lH2sMed;
	}

	public void setLH2sMed(String lH2sMed) {
		this.lH2sMed = lH2sMed;
	}

	public String getLNh4Med() {
		return this.lNh4Med;
	}

	public void setLNh4Med(String lNh4Med) {
		this.lNh4Med = lNh4Med;
	}

	public String getLNo2Med() {
		return this.lNo2Med;
	}

	public void setLNo2Med(String lNo2Med) {
		this.lNo2Med = lNo2Med;
	}

	public String getLNo3Med() {
		return this.lNo3Med;
	}

	public void setLNo3Med(String lNo3Med) {
		this.lNo3Med = lNo3Med;
	}

	public String getLOilMed() {
		return this.lOilMed;
	}

	public void setLOilMed(String lOilMed) {
		this.lOilMed = lOilMed;
	}

	public String getLPheoMed() {
		return this.lPheoMed;
	}

	public void setLPheoMed(String lPheoMed) {
		this.lPheoMed = lPheoMed;
	}

	public String getLPo4Med() {
		return this.lPo4Med;
	}

	public void setLPo4Med(String lPo4Med) {
		this.lPo4Med = lPo4Med;
	}

	public String getLSilMed() {
		return this.lSilMed;
	}

	public void setLSilMed(String lSilMed) {
		this.lSilMed = lSilMed;
	}

	public String getLSsMed() {
		return this.lSsMed;
	}

	public void setLSsMed(String lSsMed) {
		this.lSsMed = lSsMed;
	}

	public String getLSspMed() {
		return this.lSspMed;
	}

	public void setLSspMed(String lSspMed) {
		this.lSspMed = lSspMed;
	}

	public String getLSulpMed() {
		return this.lSulpMed;
	}

	public void setLSulpMed(String lSulpMed) {
		this.lSulpMed = lSulpMed;
	}

	public String getLTcynMed() {
		return this.lTcynMed;
	}

	public void setLTcynMed(String lTcynMed) {
		this.lTcynMed = lTcynMed;
	}

	public String getLTinMed() {
		return this.lTinMed;
	}

	public void setLTinMed(String lTinMed) {
		this.lTinMed = lTinMed;
	}

	public String getLTknsMed() {
		return this.lTknsMed;
	}

	public void setLTknsMed(String lTknsMed) {
		this.lTknsMed = lTknsMed;
	}

	public String getLTknspMed() {
		return this.lTknspMed;
	}

	public void setLTknspMed(String lTknspMed) {
		this.lTknspMed = lTknspMed;
	}

	public String getLTnMed() {
		return this.lTnMed;
	}

	public void setLTnMed(String lTnMed) {
		this.lTnMed = lTnMed;
	}

	public String getLTocMed() {
		return this.lTocMed;
	}

	public void setLTocMed(String lTocMed) {
		this.lTocMed = lTocMed;
	}

	public String getLTpsMed() {
		return this.lTpsMed;
	}

	public void setLTpsMed(String lTpsMed) {
		this.lTpsMed = lTpsMed;
	}

	public String getLTpspMed() {
		return this.lTpspMed;
	}

	public void setLTpspMed(String lTpspMed) {
		this.lTpspMed = lTpspMed;
	}

	public String getLTsMed() {
		return this.lTsMed;
	}

	public void setLTsMed(String lTsMed) {
		this.lTsMed = lTsMed;
	}

	public String getLTvsMed() {
		return this.lTvsMed;
	}

	public void setLTvsMed(String lTvsMed) {
		this.lTvsMed = lTvsMed;
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

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
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

}