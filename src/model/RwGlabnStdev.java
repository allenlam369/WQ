package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_glabn_stdev database table.
 * 
 */
//@Entity
@Table(name="rw_glabn_stdev")
@NamedQuery(name="RwGlabnStdev.findAll", query="SELECT r FROM RwGlabnStdev r")
public class RwGlabnStdev implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="chl_stdev")
	private BigDecimal chlStdev;

	@Column(name="cl_stdev")
	private BigDecimal clStdev;

	@Column(name="cod_stdev")
	private BigDecimal codStdev;

	@Column(name="deterg_stdev")
	private BigDecimal detergStdev;

	@Column(name="fl_stdev")
	private BigDecimal flStdev;

	@Column(name="h2s_stdev")
	private BigDecimal h2sStdev;

	@Column(name="nh4_stdev")
	private BigDecimal nh4Stdev;

	@Column(name="no2_stdev")
	private BigDecimal no2Stdev;

	@Column(name="no3_stdev")
	private BigDecimal no3Stdev;

	@Column(name="oil_stdev")
	private BigDecimal oilStdev;

	@Column(name="pheo_stdev")
	private BigDecimal pheoStdev;

	@Column(name="po4_stdev")
	private BigDecimal po4Stdev;

	@Column(name="sil_stdev")
	private BigDecimal silStdev;

	@Column(name="site_id")
	private BigDecimal siteId;

	@Column(name="ss_stdev")
	private BigDecimal ssStdev;

	@Column(name="ssp_stdev")
	private BigDecimal sspStdev;

	@Column(name="sulp_stdev")
	private BigDecimal sulpStdev;

	@Column(name="tcyn_stdev")
	private BigDecimal tcynStdev;

	@Column(name="tin_stdev")
	private BigDecimal tinStdev;

	@Column(name="tkns_stdev")
	private BigDecimal tknsStdev;

	@Column(name="tknsp_stdev")
	private BigDecimal tknspStdev;

	@Column(name="tn_stdev")
	private BigDecimal tnStdev;

	@Column(name="toc_stdev")
	private BigDecimal tocStdev;

	private Long total;

	@Column(name="tps_stdev")
	private BigDecimal tpsStdev;

	@Column(name="tpsp_stdev")
	private BigDecimal tpspStdev;

	@Column(name="ts_stdev")
	private BigDecimal tsStdev;

	@Column(name="tvs_stdev")
	private BigDecimal tvsStdev;

	private double yr;

	public RwGlabnStdev() {
	}

	public BigDecimal getChlStdev() {
		return this.chlStdev;
	}

	public void setChlStdev(BigDecimal chlStdev) {
		this.chlStdev = chlStdev;
	}

	public BigDecimal getClStdev() {
		return this.clStdev;
	}

	public void setClStdev(BigDecimal clStdev) {
		this.clStdev = clStdev;
	}

	public BigDecimal getCodStdev() {
		return this.codStdev;
	}

	public void setCodStdev(BigDecimal codStdev) {
		this.codStdev = codStdev;
	}

	public BigDecimal getDetergStdev() {
		return this.detergStdev;
	}

	public void setDetergStdev(BigDecimal detergStdev) {
		this.detergStdev = detergStdev;
	}

	public BigDecimal getFlStdev() {
		return this.flStdev;
	}

	public void setFlStdev(BigDecimal flStdev) {
		this.flStdev = flStdev;
	}

	public BigDecimal getH2sStdev() {
		return this.h2sStdev;
	}

	public void setH2sStdev(BigDecimal h2sStdev) {
		this.h2sStdev = h2sStdev;
	}

	public BigDecimal getNh4Stdev() {
		return this.nh4Stdev;
	}

	public void setNh4Stdev(BigDecimal nh4Stdev) {
		this.nh4Stdev = nh4Stdev;
	}

	public BigDecimal getNo2Stdev() {
		return this.no2Stdev;
	}

	public void setNo2Stdev(BigDecimal no2Stdev) {
		this.no2Stdev = no2Stdev;
	}

	public BigDecimal getNo3Stdev() {
		return this.no3Stdev;
	}

	public void setNo3Stdev(BigDecimal no3Stdev) {
		this.no3Stdev = no3Stdev;
	}

	public BigDecimal getOilStdev() {
		return this.oilStdev;
	}

	public void setOilStdev(BigDecimal oilStdev) {
		this.oilStdev = oilStdev;
	}

	public BigDecimal getPheoStdev() {
		return this.pheoStdev;
	}

	public void setPheoStdev(BigDecimal pheoStdev) {
		this.pheoStdev = pheoStdev;
	}

	public BigDecimal getPo4Stdev() {
		return this.po4Stdev;
	}

	public void setPo4Stdev(BigDecimal po4Stdev) {
		this.po4Stdev = po4Stdev;
	}

	public BigDecimal getSilStdev() {
		return this.silStdev;
	}

	public void setSilStdev(BigDecimal silStdev) {
		this.silStdev = silStdev;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getSsStdev() {
		return this.ssStdev;
	}

	public void setSsStdev(BigDecimal ssStdev) {
		this.ssStdev = ssStdev;
	}

	public BigDecimal getSspStdev() {
		return this.sspStdev;
	}

	public void setSspStdev(BigDecimal sspStdev) {
		this.sspStdev = sspStdev;
	}

	public BigDecimal getSulpStdev() {
		return this.sulpStdev;
	}

	public void setSulpStdev(BigDecimal sulpStdev) {
		this.sulpStdev = sulpStdev;
	}

	public BigDecimal getTcynStdev() {
		return this.tcynStdev;
	}

	public void setTcynStdev(BigDecimal tcynStdev) {
		this.tcynStdev = tcynStdev;
	}

	public BigDecimal getTinStdev() {
		return this.tinStdev;
	}

	public void setTinStdev(BigDecimal tinStdev) {
		this.tinStdev = tinStdev;
	}

	public BigDecimal getTknsStdev() {
		return this.tknsStdev;
	}

	public void setTknsStdev(BigDecimal tknsStdev) {
		this.tknsStdev = tknsStdev;
	}

	public BigDecimal getTknspStdev() {
		return this.tknspStdev;
	}

	public void setTknspStdev(BigDecimal tknspStdev) {
		this.tknspStdev = tknspStdev;
	}

	public BigDecimal getTnStdev() {
		return this.tnStdev;
	}

	public void setTnStdev(BigDecimal tnStdev) {
		this.tnStdev = tnStdev;
	}

	public BigDecimal getTocStdev() {
		return this.tocStdev;
	}

	public void setTocStdev(BigDecimal tocStdev) {
		this.tocStdev = tocStdev;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public BigDecimal getTpsStdev() {
		return this.tpsStdev;
	}

	public void setTpsStdev(BigDecimal tpsStdev) {
		this.tpsStdev = tpsStdev;
	}

	public BigDecimal getTpspStdev() {
		return this.tpspStdev;
	}

	public void setTpspStdev(BigDecimal tpspStdev) {
		this.tpspStdev = tpspStdev;
	}

	public BigDecimal getTsStdev() {
		return this.tsStdev;
	}

	public void setTsStdev(BigDecimal tsStdev) {
		this.tsStdev = tsStdev;
	}

	public BigDecimal getTvsStdev() {
		return this.tvsStdev;
	}

	public void setTvsStdev(BigDecimal tvsStdev) {
		this.tvsStdev = tvsStdev;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

}