package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_glabn_min database table.
 * 
 */
//@Entity
@Table(name="rw_glabn_min")
@NamedQuery(name="RwGlabnMin.findAll", query="SELECT r FROM RwGlabnMin r")
public class RwGlabnMin implements Serializable {
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

	public RwGlabnMin() {
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