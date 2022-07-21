package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_glabn_avg_a database table.
 * 
 */
//@Entity
@Table(name="rw_glabn_avg_a")
@NamedQuery(name="RwGlabnAvgA.findAll", query="SELECT r FROM RwGlabnAvgA r")
public class RwGlabnAvgA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="chl_avg")
	private BigDecimal chlAvg;

	@Column(name="cl_avg")
	private BigDecimal clAvg;

	@Column(name="cod_avg")
	private BigDecimal codAvg;

	@Column(name="deterg_avg")
	private BigDecimal detergAvg;

	@Column(name="fl_avg")
	private BigDecimal flAvg;

	@Column(name="h2s_avg")
	private BigDecimal h2sAvg;

	@Column(name="l_chl_avg")
	private String lChlAvg;

	@Column(name="l_cl_avg")
	private String lClAvg;

	@Column(name="l_cod_avg")
	private String lCodAvg;

	@Column(name="l_deterg_avg")
	private String lDetergAvg;

	@Column(name="l_fl_avg")
	private String lFlAvg;

	@Column(name="l_h2s_avg")
	private String lH2sAvg;

	@Column(name="l_nh4_avg")
	private String lNh4Avg;

	@Column(name="l_no2_avg")
	private String lNo2Avg;

	@Column(name="l_no3_avg")
	private String lNo3Avg;

	@Column(name="l_oil_avg")
	private String lOilAvg;

	@Column(name="l_pheo_avg")
	private String lPheoAvg;

	@Column(name="l_po4_avg")
	private String lPo4Avg;

	@Column(name="l_sil_avg")
	private String lSilAvg;

	@Column(name="l_ss_avg")
	private String lSsAvg;

	@Column(name="l_ssp_avg")
	private String lSspAvg;

	@Column(name="l_sulp_avg")
	private String lSulpAvg;

	@Column(name="l_tcyn_avg")
	private String lTcynAvg;

	@Column(name="l_tin_avg")
	private String lTinAvg;

	@Column(name="l_tkns_avg")
	private String lTknsAvg;

	@Column(name="l_tknsp_avg")
	private String lTknspAvg;

	@Column(name="l_tn_avg")
	private String lTnAvg;

	@Column(name="l_toc_avg")
	private String lTocAvg;

	@Column(name="l_tps_avg")
	private String lTpsAvg;

	@Column(name="l_tpsp_avg")
	private String lTpspAvg;

	@Column(name="l_ts_avg")
	private String lTsAvg;

	@Column(name="l_tvs_avg")
	private String lTvsAvg;

	@Column(name="nh4_avg")
	private BigDecimal nh4Avg;

	@Column(name="no2_avg")
	private BigDecimal no2Avg;

	@Column(name="no3_avg")
	private BigDecimal no3Avg;

	@Column(name="oil_avg")
	private BigDecimal oilAvg;

	@Column(name="pheo_avg")
	private BigDecimal pheoAvg;

	@Column(name="po4_avg")
	private BigDecimal po4Avg;

	@Column(name="sil_avg")
	private BigDecimal silAvg;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="ss_avg")
	private BigDecimal ssAvg;

	@Column(name="ssp_avg")
	private BigDecimal sspAvg;

	@Column(name="sulp_avg")
	private BigDecimal sulpAvg;

	@Column(name="tcyn_avg")
	private BigDecimal tcynAvg;

	@Column(name="tin_avg")
	private BigDecimal tinAvg;

	@Column(name="tkns_avg")
	private BigDecimal tknsAvg;

	@Column(name="tknsp_avg")
	private BigDecimal tknspAvg;

	@Column(name="tn_avg")
	private BigDecimal tnAvg;

	@Column(name="toc_avg")
	private BigDecimal tocAvg;

	private Long total;

	@Column(name="tps_avg")
	private BigDecimal tpsAvg;

	@Column(name="tpsp_avg")
	private BigDecimal tpspAvg;

	@Column(name="ts_avg")
	private BigDecimal tsAvg;

	@Column(name="tvs_avg")
	private BigDecimal tvsAvg;

	private double yr;

	public RwGlabnAvgA() {
	}

	public BigDecimal getChlAvg() {
		return this.chlAvg;
	}

	public void setChlAvg(BigDecimal chlAvg) {
		this.chlAvg = chlAvg;
	}

	public BigDecimal getClAvg() {
		return this.clAvg;
	}

	public void setClAvg(BigDecimal clAvg) {
		this.clAvg = clAvg;
	}

	public BigDecimal getCodAvg() {
		return this.codAvg;
	}

	public void setCodAvg(BigDecimal codAvg) {
		this.codAvg = codAvg;
	}

	public BigDecimal getDetergAvg() {
		return this.detergAvg;
	}

	public void setDetergAvg(BigDecimal detergAvg) {
		this.detergAvg = detergAvg;
	}

	public BigDecimal getFlAvg() {
		return this.flAvg;
	}

	public void setFlAvg(BigDecimal flAvg) {
		this.flAvg = flAvg;
	}

	public BigDecimal getH2sAvg() {
		return this.h2sAvg;
	}

	public void setH2sAvg(BigDecimal h2sAvg) {
		this.h2sAvg = h2sAvg;
	}

	public String getLChlAvg() {
		return this.lChlAvg;
	}

	public void setLChlAvg(String lChlAvg) {
		this.lChlAvg = lChlAvg;
	}

	public String getLClAvg() {
		return this.lClAvg;
	}

	public void setLClAvg(String lClAvg) {
		this.lClAvg = lClAvg;
	}

	public String getLCodAvg() {
		return this.lCodAvg;
	}

	public void setLCodAvg(String lCodAvg) {
		this.lCodAvg = lCodAvg;
	}

	public String getLDetergAvg() {
		return this.lDetergAvg;
	}

	public void setLDetergAvg(String lDetergAvg) {
		this.lDetergAvg = lDetergAvg;
	}

	public String getLFlAvg() {
		return this.lFlAvg;
	}

	public void setLFlAvg(String lFlAvg) {
		this.lFlAvg = lFlAvg;
	}

	public String getLH2sAvg() {
		return this.lH2sAvg;
	}

	public void setLH2sAvg(String lH2sAvg) {
		this.lH2sAvg = lH2sAvg;
	}

	public String getLNh4Avg() {
		return this.lNh4Avg;
	}

	public void setLNh4Avg(String lNh4Avg) {
		this.lNh4Avg = lNh4Avg;
	}

	public String getLNo2Avg() {
		return this.lNo2Avg;
	}

	public void setLNo2Avg(String lNo2Avg) {
		this.lNo2Avg = lNo2Avg;
	}

	public String getLNo3Avg() {
		return this.lNo3Avg;
	}

	public void setLNo3Avg(String lNo3Avg) {
		this.lNo3Avg = lNo3Avg;
	}

	public String getLOilAvg() {
		return this.lOilAvg;
	}

	public void setLOilAvg(String lOilAvg) {
		this.lOilAvg = lOilAvg;
	}

	public String getLPheoAvg() {
		return this.lPheoAvg;
	}

	public void setLPheoAvg(String lPheoAvg) {
		this.lPheoAvg = lPheoAvg;
	}

	public String getLPo4Avg() {
		return this.lPo4Avg;
	}

	public void setLPo4Avg(String lPo4Avg) {
		this.lPo4Avg = lPo4Avg;
	}

	public String getLSilAvg() {
		return this.lSilAvg;
	}

	public void setLSilAvg(String lSilAvg) {
		this.lSilAvg = lSilAvg;
	}

	public String getLSsAvg() {
		return this.lSsAvg;
	}

	public void setLSsAvg(String lSsAvg) {
		this.lSsAvg = lSsAvg;
	}

	public String getLSspAvg() {
		return this.lSspAvg;
	}

	public void setLSspAvg(String lSspAvg) {
		this.lSspAvg = lSspAvg;
	}

	public String getLSulpAvg() {
		return this.lSulpAvg;
	}

	public void setLSulpAvg(String lSulpAvg) {
		this.lSulpAvg = lSulpAvg;
	}

	public String getLTcynAvg() {
		return this.lTcynAvg;
	}

	public void setLTcynAvg(String lTcynAvg) {
		this.lTcynAvg = lTcynAvg;
	}

	public String getLTinAvg() {
		return this.lTinAvg;
	}

	public void setLTinAvg(String lTinAvg) {
		this.lTinAvg = lTinAvg;
	}

	public String getLTknsAvg() {
		return this.lTknsAvg;
	}

	public void setLTknsAvg(String lTknsAvg) {
		this.lTknsAvg = lTknsAvg;
	}

	public String getLTknspAvg() {
		return this.lTknspAvg;
	}

	public void setLTknspAvg(String lTknspAvg) {
		this.lTknspAvg = lTknspAvg;
	}

	public String getLTnAvg() {
		return this.lTnAvg;
	}

	public void setLTnAvg(String lTnAvg) {
		this.lTnAvg = lTnAvg;
	}

	public String getLTocAvg() {
		return this.lTocAvg;
	}

	public void setLTocAvg(String lTocAvg) {
		this.lTocAvg = lTocAvg;
	}

	public String getLTpsAvg() {
		return this.lTpsAvg;
	}

	public void setLTpsAvg(String lTpsAvg) {
		this.lTpsAvg = lTpsAvg;
	}

	public String getLTpspAvg() {
		return this.lTpspAvg;
	}

	public void setLTpspAvg(String lTpspAvg) {
		this.lTpspAvg = lTpspAvg;
	}

	public String getLTsAvg() {
		return this.lTsAvg;
	}

	public void setLTsAvg(String lTsAvg) {
		this.lTsAvg = lTsAvg;
	}

	public String getLTvsAvg() {
		return this.lTvsAvg;
	}

	public void setLTvsAvg(String lTvsAvg) {
		this.lTvsAvg = lTvsAvg;
	}

	public BigDecimal getNh4Avg() {
		return this.nh4Avg;
	}

	public void setNh4Avg(BigDecimal nh4Avg) {
		this.nh4Avg = nh4Avg;
	}

	public BigDecimal getNo2Avg() {
		return this.no2Avg;
	}

	public void setNo2Avg(BigDecimal no2Avg) {
		this.no2Avg = no2Avg;
	}

	public BigDecimal getNo3Avg() {
		return this.no3Avg;
	}

	public void setNo3Avg(BigDecimal no3Avg) {
		this.no3Avg = no3Avg;
	}

	public BigDecimal getOilAvg() {
		return this.oilAvg;
	}

	public void setOilAvg(BigDecimal oilAvg) {
		this.oilAvg = oilAvg;
	}

	public BigDecimal getPheoAvg() {
		return this.pheoAvg;
	}

	public void setPheoAvg(BigDecimal pheoAvg) {
		this.pheoAvg = pheoAvg;
	}

	public BigDecimal getPo4Avg() {
		return this.po4Avg;
	}

	public void setPo4Avg(BigDecimal po4Avg) {
		this.po4Avg = po4Avg;
	}

	public BigDecimal getSilAvg() {
		return this.silAvg;
	}

	public void setSilAvg(BigDecimal silAvg) {
		this.silAvg = silAvg;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getSsAvg() {
		return this.ssAvg;
	}

	public void setSsAvg(BigDecimal ssAvg) {
		this.ssAvg = ssAvg;
	}

	public BigDecimal getSspAvg() {
		return this.sspAvg;
	}

	public void setSspAvg(BigDecimal sspAvg) {
		this.sspAvg = sspAvg;
	}

	public BigDecimal getSulpAvg() {
		return this.sulpAvg;
	}

	public void setSulpAvg(BigDecimal sulpAvg) {
		this.sulpAvg = sulpAvg;
	}

	public BigDecimal getTcynAvg() {
		return this.tcynAvg;
	}

	public void setTcynAvg(BigDecimal tcynAvg) {
		this.tcynAvg = tcynAvg;
	}

	public BigDecimal getTinAvg() {
		return this.tinAvg;
	}

	public void setTinAvg(BigDecimal tinAvg) {
		this.tinAvg = tinAvg;
	}

	public BigDecimal getTknsAvg() {
		return this.tknsAvg;
	}

	public void setTknsAvg(BigDecimal tknsAvg) {
		this.tknsAvg = tknsAvg;
	}

	public BigDecimal getTknspAvg() {
		return this.tknspAvg;
	}

	public void setTknspAvg(BigDecimal tknspAvg) {
		this.tknspAvg = tknspAvg;
	}

	public BigDecimal getTnAvg() {
		return this.tnAvg;
	}

	public void setTnAvg(BigDecimal tnAvg) {
		this.tnAvg = tnAvg;
	}

	public BigDecimal getTocAvg() {
		return this.tocAvg;
	}

	public void setTocAvg(BigDecimal tocAvg) {
		this.tocAvg = tocAvg;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public BigDecimal getTpsAvg() {
		return this.tpsAvg;
	}

	public void setTpsAvg(BigDecimal tpsAvg) {
		this.tpsAvg = tpsAvg;
	}

	public BigDecimal getTpspAvg() {
		return this.tpspAvg;
	}

	public void setTpspAvg(BigDecimal tpspAvg) {
		this.tpspAvg = tpspAvg;
	}

	public BigDecimal getTsAvg() {
		return this.tsAvg;
	}

	public void setTsAvg(BigDecimal tsAvg) {
		this.tsAvg = tsAvg;
	}

	public BigDecimal getTvsAvg() {
		return this.tvsAvg;
	}

	public void setTvsAvg(BigDecimal tvsAvg) {
		this.tvsAvg = tvsAvg;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

}