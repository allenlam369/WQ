package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_glabn_min_a database table.
 * 
 */
//@Entity
@Table(name="rw_glabn_min_a")
@NamedQuery(name="RwGlabnMinA.findAll", query="SELECT r FROM RwGlabnMinA r")
public class RwGlabnMinA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="chl_min")
	private BigDecimal chlMin;

	@Column(name="cl_min")
	private BigDecimal clMin;

	@Column(name="cod_min")
	private BigDecimal codMin;

	@Column(name="deterg_min")
	private BigDecimal detergMin;

	@Column(name="fl_min")
	private BigDecimal flMin;

	@Column(name="h2s_min")
	private BigDecimal h2sMin;

	@Column(name="l_chl_min")
	private String lChlMin;

	@Column(name="l_cl_min")
	private String lClMin;

	@Column(name="l_cod_min")
	private String lCodMin;

	@Column(name="l_deterg_min")
	private String lDetergMin;

	@Column(name="l_fl_min")
	private String lFlMin;

	@Column(name="l_h2s_min")
	private String lH2sMin;

	@Column(name="l_nh4_min")
	private String lNh4Min;

	@Column(name="l_no2_min")
	private String lNo2Min;

	@Column(name="l_no3_min")
	private String lNo3Min;

	@Column(name="l_oil_min")
	private String lOilMin;

	@Column(name="l_pheo_min")
	private String lPheoMin;

	@Column(name="l_po4_min")
	private String lPo4Min;

	@Column(name="l_sil_min")
	private String lSilMin;

	@Column(name="l_ss_min")
	private String lSsMin;

	@Column(name="l_ssp_min")
	private String lSspMin;

	@Column(name="l_sulp_min")
	private String lSulpMin;

	@Column(name="l_tcyn_min")
	private String lTcynMin;

	@Column(name="l_tin_min")
	private String lTinMin;

	@Column(name="l_tkns_min")
	private String lTknsMin;

	@Column(name="l_tknsp_min")
	private String lTknspMin;

	@Column(name="l_tn_min")
	private String lTnMin;

	@Column(name="l_toc_min")
	private String lTocMin;

	@Column(name="l_tps_min")
	private String lTpsMin;

	@Column(name="l_tpsp_min")
	private String lTpspMin;

	@Column(name="l_ts_min")
	private String lTsMin;

	@Column(name="l_tvs_min")
	private String lTvsMin;

	@Column(name="nh4_min")
	private BigDecimal nh4Min;

	@Column(name="no2_min")
	private BigDecimal no2Min;

	@Column(name="no3_min")
	private BigDecimal no3Min;

	@Column(name="oil_min")
	private BigDecimal oilMin;

	@Column(name="pheo_min")
	private BigDecimal pheoMin;

	@Column(name="po4_min")
	private BigDecimal po4Min;

	@Column(name="sil_min")
	private BigDecimal silMin;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="ss_min")
	private BigDecimal ssMin;

	@Column(name="ssp_min")
	private BigDecimal sspMin;

	@Column(name="sulp_min")
	private BigDecimal sulpMin;

	@Column(name="tcyn_min")
	private BigDecimal tcynMin;

	@Column(name="tin_min")
	private BigDecimal tinMin;

	@Column(name="tkns_min")
	private BigDecimal tknsMin;

	@Column(name="tknsp_min")
	private BigDecimal tknspMin;

	@Column(name="tn_min")
	private BigDecimal tnMin;

	@Column(name="toc_min")
	private BigDecimal tocMin;

	private Long total;

	@Column(name="tps_min")
	private BigDecimal tpsMin;

	@Column(name="tpsp_min")
	private BigDecimal tpspMin;

	@Column(name="ts_min")
	private BigDecimal tsMin;

	@Column(name="tvs_min")
	private BigDecimal tvsMin;

	private double yr;

	public RwGlabnMinA() {
	}

	public BigDecimal getChlMin() {
		return this.chlMin;
	}

	public void setChlMin(BigDecimal chlMin) {
		this.chlMin = chlMin;
	}

	public BigDecimal getClMin() {
		return this.clMin;
	}

	public void setClMin(BigDecimal clMin) {
		this.clMin = clMin;
	}

	public BigDecimal getCodMin() {
		return this.codMin;
	}

	public void setCodMin(BigDecimal codMin) {
		this.codMin = codMin;
	}

	public BigDecimal getDetergMin() {
		return this.detergMin;
	}

	public void setDetergMin(BigDecimal detergMin) {
		this.detergMin = detergMin;
	}

	public BigDecimal getFlMin() {
		return this.flMin;
	}

	public void setFlMin(BigDecimal flMin) {
		this.flMin = flMin;
	}

	public BigDecimal getH2sMin() {
		return this.h2sMin;
	}

	public void setH2sMin(BigDecimal h2sMin) {
		this.h2sMin = h2sMin;
	}

	public String getLChlMin() {
		return this.lChlMin;
	}

	public void setLChlMin(String lChlMin) {
		this.lChlMin = lChlMin;
	}

	public String getLClMin() {
		return this.lClMin;
	}

	public void setLClMin(String lClMin) {
		this.lClMin = lClMin;
	}

	public String getLCodMin() {
		return this.lCodMin;
	}

	public void setLCodMin(String lCodMin) {
		this.lCodMin = lCodMin;
	}

	public String getLDetergMin() {
		return this.lDetergMin;
	}

	public void setLDetergMin(String lDetergMin) {
		this.lDetergMin = lDetergMin;
	}

	public String getLFlMin() {
		return this.lFlMin;
	}

	public void setLFlMin(String lFlMin) {
		this.lFlMin = lFlMin;
	}

	public String getLH2sMin() {
		return this.lH2sMin;
	}

	public void setLH2sMin(String lH2sMin) {
		this.lH2sMin = lH2sMin;
	}

	public String getLNh4Min() {
		return this.lNh4Min;
	}

	public void setLNh4Min(String lNh4Min) {
		this.lNh4Min = lNh4Min;
	}

	public String getLNo2Min() {
		return this.lNo2Min;
	}

	public void setLNo2Min(String lNo2Min) {
		this.lNo2Min = lNo2Min;
	}

	public String getLNo3Min() {
		return this.lNo3Min;
	}

	public void setLNo3Min(String lNo3Min) {
		this.lNo3Min = lNo3Min;
	}

	public String getLOilMin() {
		return this.lOilMin;
	}

	public void setLOilMin(String lOilMin) {
		this.lOilMin = lOilMin;
	}

	public String getLPheoMin() {
		return this.lPheoMin;
	}

	public void setLPheoMin(String lPheoMin) {
		this.lPheoMin = lPheoMin;
	}

	public String getLPo4Min() {
		return this.lPo4Min;
	}

	public void setLPo4Min(String lPo4Min) {
		this.lPo4Min = lPo4Min;
	}

	public String getLSilMin() {
		return this.lSilMin;
	}

	public void setLSilMin(String lSilMin) {
		this.lSilMin = lSilMin;
	}

	public String getLSsMin() {
		return this.lSsMin;
	}

	public void setLSsMin(String lSsMin) {
		this.lSsMin = lSsMin;
	}

	public String getLSspMin() {
		return this.lSspMin;
	}

	public void setLSspMin(String lSspMin) {
		this.lSspMin = lSspMin;
	}

	public String getLSulpMin() {
		return this.lSulpMin;
	}

	public void setLSulpMin(String lSulpMin) {
		this.lSulpMin = lSulpMin;
	}

	public String getLTcynMin() {
		return this.lTcynMin;
	}

	public void setLTcynMin(String lTcynMin) {
		this.lTcynMin = lTcynMin;
	}

	public String getLTinMin() {
		return this.lTinMin;
	}

	public void setLTinMin(String lTinMin) {
		this.lTinMin = lTinMin;
	}

	public String getLTknsMin() {
		return this.lTknsMin;
	}

	public void setLTknsMin(String lTknsMin) {
		this.lTknsMin = lTknsMin;
	}

	public String getLTknspMin() {
		return this.lTknspMin;
	}

	public void setLTknspMin(String lTknspMin) {
		this.lTknspMin = lTknspMin;
	}

	public String getLTnMin() {
		return this.lTnMin;
	}

	public void setLTnMin(String lTnMin) {
		this.lTnMin = lTnMin;
	}

	public String getLTocMin() {
		return this.lTocMin;
	}

	public void setLTocMin(String lTocMin) {
		this.lTocMin = lTocMin;
	}

	public String getLTpsMin() {
		return this.lTpsMin;
	}

	public void setLTpsMin(String lTpsMin) {
		this.lTpsMin = lTpsMin;
	}

	public String getLTpspMin() {
		return this.lTpspMin;
	}

	public void setLTpspMin(String lTpspMin) {
		this.lTpspMin = lTpspMin;
	}

	public String getLTsMin() {
		return this.lTsMin;
	}

	public void setLTsMin(String lTsMin) {
		this.lTsMin = lTsMin;
	}

	public String getLTvsMin() {
		return this.lTvsMin;
	}

	public void setLTvsMin(String lTvsMin) {
		this.lTvsMin = lTvsMin;
	}

	public BigDecimal getNh4Min() {
		return this.nh4Min;
	}

	public void setNh4Min(BigDecimal nh4Min) {
		this.nh4Min = nh4Min;
	}

	public BigDecimal getNo2Min() {
		return this.no2Min;
	}

	public void setNo2Min(BigDecimal no2Min) {
		this.no2Min = no2Min;
	}

	public BigDecimal getNo3Min() {
		return this.no3Min;
	}

	public void setNo3Min(BigDecimal no3Min) {
		this.no3Min = no3Min;
	}

	public BigDecimal getOilMin() {
		return this.oilMin;
	}

	public void setOilMin(BigDecimal oilMin) {
		this.oilMin = oilMin;
	}

	public BigDecimal getPheoMin() {
		return this.pheoMin;
	}

	public void setPheoMin(BigDecimal pheoMin) {
		this.pheoMin = pheoMin;
	}

	public BigDecimal getPo4Min() {
		return this.po4Min;
	}

	public void setPo4Min(BigDecimal po4Min) {
		this.po4Min = po4Min;
	}

	public BigDecimal getSilMin() {
		return this.silMin;
	}

	public void setSilMin(BigDecimal silMin) {
		this.silMin = silMin;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getSsMin() {
		return this.ssMin;
	}

	public void setSsMin(BigDecimal ssMin) {
		this.ssMin = ssMin;
	}

	public BigDecimal getSspMin() {
		return this.sspMin;
	}

	public void setSspMin(BigDecimal sspMin) {
		this.sspMin = sspMin;
	}

	public BigDecimal getSulpMin() {
		return this.sulpMin;
	}

	public void setSulpMin(BigDecimal sulpMin) {
		this.sulpMin = sulpMin;
	}

	public BigDecimal getTcynMin() {
		return this.tcynMin;
	}

	public void setTcynMin(BigDecimal tcynMin) {
		this.tcynMin = tcynMin;
	}

	public BigDecimal getTinMin() {
		return this.tinMin;
	}

	public void setTinMin(BigDecimal tinMin) {
		this.tinMin = tinMin;
	}

	public BigDecimal getTknsMin() {
		return this.tknsMin;
	}

	public void setTknsMin(BigDecimal tknsMin) {
		this.tknsMin = tknsMin;
	}

	public BigDecimal getTknspMin() {
		return this.tknspMin;
	}

	public void setTknspMin(BigDecimal tknspMin) {
		this.tknspMin = tknspMin;
	}

	public BigDecimal getTnMin() {
		return this.tnMin;
	}

	public void setTnMin(BigDecimal tnMin) {
		this.tnMin = tnMin;
	}

	public BigDecimal getTocMin() {
		return this.tocMin;
	}

	public void setTocMin(BigDecimal tocMin) {
		this.tocMin = tocMin;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public BigDecimal getTpsMin() {
		return this.tpsMin;
	}

	public void setTpsMin(BigDecimal tpsMin) {
		this.tpsMin = tpsMin;
	}

	public BigDecimal getTpspMin() {
		return this.tpspMin;
	}

	public void setTpspMin(BigDecimal tpspMin) {
		this.tpspMin = tpspMin;
	}

	public BigDecimal getTsMin() {
		return this.tsMin;
	}

	public void setTsMin(BigDecimal tsMin) {
		this.tsMin = tsMin;
	}

	public BigDecimal getTvsMin() {
		return this.tvsMin;
	}

	public void setTvsMin(BigDecimal tvsMin) {
		this.tvsMin = tvsMin;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

}