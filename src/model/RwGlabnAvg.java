package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_glabn_avg database table.
 * 
 */
//@Entity
@Table(name="rw_glabn_avg")
@NamedQuery(name="RwGlabnAvg.findAll", query="SELECT r FROM RwGlabnAvg r")
public class RwGlabnAvg implements Serializable {
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

	public RwGlabnAvg() {
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