package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the river_water_avg_r2 database table.
 * 
 */
//@Entity
@Table(name="river_water_avg_r2")
@NamedQuery(name="RiverWaterAvgR2.findAll", query="SELECT r FROM RiverWaterAvgR2 r")
public class RiverWaterAvgR2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ag_avg")
	private BigDecimal agAvg;

	@Column(name="al_avg")
	private BigDecimal alAvg;

	@Column(name="arsenic_avg")
	private BigDecimal arsenicAvg;

	@Column(name="b_avg")
	private BigDecimal bAvg;

	@Column(name="ba_avg")
	private BigDecimal baAvg;

	@Column(name="be_avg")
	private BigDecimal beAvg;

	@Column(name="bod5_avg")
	private BigDecimal bod5Avg;

	@Column(name="bod5_pt_avg")
	private BigDecimal bod5PtAvg;

	@Column(name="cd_avg")
	private BigDecimal cdAvg;

	@Column(name="chl_avg")
	private BigDecimal chlAvg;

	@Column(name="cl_avg")
	private BigDecimal clAvg;

	@Column(name="cod_avg")
	private BigDecimal codAvg;

	@Column(name="cond_avg")
	private BigDecimal condAvg;

	@Column(name="cr_avg")
	private BigDecimal crAvg;

	@Column(name="cu_avg")
	private BigDecimal cuAvg;

	@Column(name="depth_avg")
	private BigDecimal depthAvg;

	@Column(name="deterg_avg")
	private BigDecimal detergAvg;

	@Column(name="do_avg")
	private BigDecimal doAvg;

	@Column(name="dos_avg")
	private BigDecimal dosAvg;

	@Column(name="dos_pt_avg")
	private BigDecimal dosPtAvg;

	@Column(name="ec_avg")
	private BigDecimal ecAvg;

	@Column(name="fc_avg")
	private BigDecimal fcAvg;

	@Column(name="fe_avg")
	private BigDecimal feAvg;

	@Column(name="fl_avg")
	private BigDecimal flAvg;

	@Column(name="flow_avg")
	private BigDecimal flowAvg;

	@Column(name="h2s_avg")
	private BigDecimal h2sAvg;

	@Column(name="hg_avg")
	private BigDecimal hgAvg;

	@Column(name="mn_avg")
	private BigDecimal mnAvg;

	@Column(name="mo_avg")
	private BigDecimal moAvg;

	@Column(name="nh3_avg")
	private BigDecimal nh3Avg;

	@Column(name="nh4_avg")
	private BigDecimal nh4Avg;

	@Column(name="nh4_pt_avg")
	private BigDecimal nh4PtAvg;

	@Column(name="ni_avg")
	private BigDecimal niAvg;

	@Column(name="no2_avg")
	private BigDecimal no2Avg;

	@Column(name="no3_avg")
	private BigDecimal no3Avg;

	@Column(name="oil_avg")
	private BigDecimal oilAvg;

	@Column(name="pb_avg")
	private BigDecimal pbAvg;

	@Column(name="ph_avg")
	private BigDecimal phAvg;

	@Column(name="pheo_avg")
	private BigDecimal pheoAvg;

	@Column(name="po4_avg")
	private BigDecimal po4Avg;

	private String river;

	@Column(name="sal_avg")
	private BigDecimal salAvg;

	@Column(name="sb_avg")
	private BigDecimal sbAvg;

	@Column(name="sil_avg")
	private BigDecimal silAvg;

	@Column(name="ss_avg")
	private BigDecimal ssAvg;

	@Column(name="ssp_avg")
	private BigDecimal sspAvg;

	@Column(name="sulp_avg")
	private BigDecimal sulpAvg;

	@Column(name="tcyn_avg")
	private BigDecimal tcynAvg;

	@Column(name="temper_avg")
	private BigDecimal temperAvg;

	@Column(name="tin_avg")
	private BigDecimal tinAvg;

	@Column(name="tkns_avg")
	private BigDecimal tknsAvg;

	@Column(name="tknsp_avg")
	private BigDecimal tknspAvg;

	@Column(name="tl_avg")
	private BigDecimal tlAvg;

	@Column(name="tn_avg")
	private BigDecimal tnAvg;

	@Column(name="toc_avg")
	private BigDecimal tocAvg;

	private BigDecimal total;

	@Column(name="tps_avg")
	private BigDecimal tpsAvg;

	@Column(name="tpsp_avg")
	private BigDecimal tpspAvg;

	@Column(name="ts_avg")
	private BigDecimal tsAvg;

	@Column(name="turb_avg")
	private BigDecimal turbAvg;

	@Column(name="tvs_avg")
	private BigDecimal tvsAvg;

	@Column(name="v_avg")
	private BigDecimal vAvg;

	@Column(name="vel_avg")
	private BigDecimal velAvg;

	@Column(name="width_avg")
	private BigDecimal widthAvg;

	@Column(name="wqi_grade_avg")
	private String wqiGradeAvg;

	@Column(name="wqi_pt_avg")
	private BigDecimal wqiPtAvg;

	private double yr;

	@Column(name="zn_avg")
	private BigDecimal znAvg;

	private String zone;

	public RiverWaterAvgR2() {
	}

	public BigDecimal getAgAvg() {
		return this.agAvg;
	}

	public void setAgAvg(BigDecimal agAvg) {
		this.agAvg = agAvg;
	}

	public BigDecimal getAlAvg() {
		return this.alAvg;
	}

	public void setAlAvg(BigDecimal alAvg) {
		this.alAvg = alAvg;
	}

	public BigDecimal getArsenicAvg() {
		return this.arsenicAvg;
	}

	public void setArsenicAvg(BigDecimal arsenicAvg) {
		this.arsenicAvg = arsenicAvg;
	}

	public BigDecimal getBAvg() {
		return this.bAvg;
	}

	public void setBAvg(BigDecimal bAvg) {
		this.bAvg = bAvg;
	}

	public BigDecimal getBaAvg() {
		return this.baAvg;
	}

	public void setBaAvg(BigDecimal baAvg) {
		this.baAvg = baAvg;
	}

	public BigDecimal getBeAvg() {
		return this.beAvg;
	}

	public void setBeAvg(BigDecimal beAvg) {
		this.beAvg = beAvg;
	}

	public BigDecimal getBod5Avg() {
		return this.bod5Avg;
	}

	public void setBod5Avg(BigDecimal bod5Avg) {
		this.bod5Avg = bod5Avg;
	}

	public BigDecimal getBod5PtAvg() {
		return this.bod5PtAvg;
	}

	public void setBod5PtAvg(BigDecimal bod5PtAvg) {
		this.bod5PtAvg = bod5PtAvg;
	}

	public BigDecimal getCdAvg() {
		return this.cdAvg;
	}

	public void setCdAvg(BigDecimal cdAvg) {
		this.cdAvg = cdAvg;
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

	public BigDecimal getCondAvg() {
		return this.condAvg;
	}

	public void setCondAvg(BigDecimal condAvg) {
		this.condAvg = condAvg;
	}

	public BigDecimal getCrAvg() {
		return this.crAvg;
	}

	public void setCrAvg(BigDecimal crAvg) {
		this.crAvg = crAvg;
	}

	public BigDecimal getCuAvg() {
		return this.cuAvg;
	}

	public void setCuAvg(BigDecimal cuAvg) {
		this.cuAvg = cuAvg;
	}

	public BigDecimal getDepthAvg() {
		return this.depthAvg;
	}

	public void setDepthAvg(BigDecimal depthAvg) {
		this.depthAvg = depthAvg;
	}

	public BigDecimal getDetergAvg() {
		return this.detergAvg;
	}

	public void setDetergAvg(BigDecimal detergAvg) {
		this.detergAvg = detergAvg;
	}

	public BigDecimal getDoAvg() {
		return this.doAvg;
	}

	public void setDoAvg(BigDecimal doAvg) {
		this.doAvg = doAvg;
	}

	public BigDecimal getDosAvg() {
		return this.dosAvg;
	}

	public void setDosAvg(BigDecimal dosAvg) {
		this.dosAvg = dosAvg;
	}

	public BigDecimal getDosPtAvg() {
		return this.dosPtAvg;
	}

	public void setDosPtAvg(BigDecimal dosPtAvg) {
		this.dosPtAvg = dosPtAvg;
	}

	public BigDecimal getEcAvg() {
		return this.ecAvg;
	}

	public void setEcAvg(BigDecimal ecAvg) {
		this.ecAvg = ecAvg;
	}

	public BigDecimal getFcAvg() {
		return this.fcAvg;
	}

	public void setFcAvg(BigDecimal fcAvg) {
		this.fcAvg = fcAvg;
	}

	public BigDecimal getFeAvg() {
		return this.feAvg;
	}

	public void setFeAvg(BigDecimal feAvg) {
		this.feAvg = feAvg;
	}

	public BigDecimal getFlAvg() {
		return this.flAvg;
	}

	public void setFlAvg(BigDecimal flAvg) {
		this.flAvg = flAvg;
	}

	public BigDecimal getFlowAvg() {
		return this.flowAvg;
	}

	public void setFlowAvg(BigDecimal flowAvg) {
		this.flowAvg = flowAvg;
	}

	public BigDecimal getH2sAvg() {
		return this.h2sAvg;
	}

	public void setH2sAvg(BigDecimal h2sAvg) {
		this.h2sAvg = h2sAvg;
	}

	public BigDecimal getHgAvg() {
		return this.hgAvg;
	}

	public void setHgAvg(BigDecimal hgAvg) {
		this.hgAvg = hgAvg;
	}

	public BigDecimal getMnAvg() {
		return this.mnAvg;
	}

	public void setMnAvg(BigDecimal mnAvg) {
		this.mnAvg = mnAvg;
	}

	public BigDecimal getMoAvg() {
		return this.moAvg;
	}

	public void setMoAvg(BigDecimal moAvg) {
		this.moAvg = moAvg;
	}

	public BigDecimal getNh3Avg() {
		return this.nh3Avg;
	}

	public void setNh3Avg(BigDecimal nh3Avg) {
		this.nh3Avg = nh3Avg;
	}

	public BigDecimal getNh4Avg() {
		return this.nh4Avg;
	}

	public void setNh4Avg(BigDecimal nh4Avg) {
		this.nh4Avg = nh4Avg;
	}

	public BigDecimal getNh4PtAvg() {
		return this.nh4PtAvg;
	}

	public void setNh4PtAvg(BigDecimal nh4PtAvg) {
		this.nh4PtAvg = nh4PtAvg;
	}

	public BigDecimal getNiAvg() {
		return this.niAvg;
	}

	public void setNiAvg(BigDecimal niAvg) {
		this.niAvg = niAvg;
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

	public BigDecimal getPbAvg() {
		return this.pbAvg;
	}

	public void setPbAvg(BigDecimal pbAvg) {
		this.pbAvg = pbAvg;
	}

	public BigDecimal getPhAvg() {
		return this.phAvg;
	}

	public void setPhAvg(BigDecimal phAvg) {
		this.phAvg = phAvg;
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

	public String getRiver() {
		return this.river;
	}

	public void setRiver(String river) {
		this.river = river;
	}

	public BigDecimal getSalAvg() {
		return this.salAvg;
	}

	public void setSalAvg(BigDecimal salAvg) {
		this.salAvg = salAvg;
	}

	public BigDecimal getSbAvg() {
		return this.sbAvg;
	}

	public void setSbAvg(BigDecimal sbAvg) {
		this.sbAvg = sbAvg;
	}

	public BigDecimal getSilAvg() {
		return this.silAvg;
	}

	public void setSilAvg(BigDecimal silAvg) {
		this.silAvg = silAvg;
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

	public BigDecimal getTemperAvg() {
		return this.temperAvg;
	}

	public void setTemperAvg(BigDecimal temperAvg) {
		this.temperAvg = temperAvg;
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

	public BigDecimal getTlAvg() {
		return this.tlAvg;
	}

	public void setTlAvg(BigDecimal tlAvg) {
		this.tlAvg = tlAvg;
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

	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
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

	public BigDecimal getTurbAvg() {
		return this.turbAvg;
	}

	public void setTurbAvg(BigDecimal turbAvg) {
		this.turbAvg = turbAvg;
	}

	public BigDecimal getTvsAvg() {
		return this.tvsAvg;
	}

	public void setTvsAvg(BigDecimal tvsAvg) {
		this.tvsAvg = tvsAvg;
	}

	public BigDecimal getVAvg() {
		return this.vAvg;
	}

	public void setVAvg(BigDecimal vAvg) {
		this.vAvg = vAvg;
	}

	public BigDecimal getVelAvg() {
		return this.velAvg;
	}

	public void setVelAvg(BigDecimal velAvg) {
		this.velAvg = velAvg;
	}

	public BigDecimal getWidthAvg() {
		return this.widthAvg;
	}

	public void setWidthAvg(BigDecimal widthAvg) {
		this.widthAvg = widthAvg;
	}

	public String getWqiGradeAvg() {
		return this.wqiGradeAvg;
	}

	public void setWqiGradeAvg(String wqiGradeAvg) {
		this.wqiGradeAvg = wqiGradeAvg;
	}

	public BigDecimal getWqiPtAvg() {
		return this.wqiPtAvg;
	}

	public void setWqiPtAvg(BigDecimal wqiPtAvg) {
		this.wqiPtAvg = wqiPtAvg;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

	public BigDecimal getZnAvg() {
		return this.znAvg;
	}

	public void setZnAvg(BigDecimal znAvg) {
		this.znAvg = znAvg;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}