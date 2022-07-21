package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the river_water_max1 database table.
 * 
 */
//@Entity
@Table(name="river_water_max1")
@NamedQuery(name="RiverWaterMax1.findAll", query="SELECT r FROM RiverWaterMax1 r")
public class RiverWaterMax1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ag_max")
	private BigDecimal agMax;

	@Column(name="al_max")
	private BigDecimal alMax;

	@Column(name="arsenic_max")
	private BigDecimal arsenicMax;

	@Column(name="b_max")
	private BigDecimal bMax;

	@Column(name="ba_max")
	private BigDecimal baMax;

	@Column(name="be_max")
	private BigDecimal beMax;

	@Column(name="bod5_max")
	private BigDecimal bod5Max;

	@Column(name="bod5_pt_max")
	private BigDecimal bod5PtMax;

	@Column(name="cd_max")
	private BigDecimal cdMax;

	@Column(name="chl_max")
	private BigDecimal chlMax;

	@Column(name="cl_max")
	private BigDecimal clMax;

	@Column(name="cod_max")
	private BigDecimal codMax;

	@Column(name="cond_max")
	private BigDecimal condMax;

	@Column(name="cr_max")
	private BigDecimal crMax;

	@Column(name="cu_max")
	private BigDecimal cuMax;

	@Column(name="depth_max")
	private BigDecimal depthMax;

	@Column(name="deterg_max")
	private BigDecimal detergMax;

	@Column(name="do_max")
	private BigDecimal doMax;

	@Column(name="dos_max")
	private BigDecimal dosMax;

	@Column(name="dos_pt_max")
	private BigDecimal dosPtMax;

	@Column(name="ec_max")
	private BigDecimal ecMax;

	@Column(name="fc_max")
	private BigDecimal fcMax;

	@Column(name="fe_max")
	private BigDecimal feMax;

	@Column(name="fl_max")
	private BigDecimal flMax;

	@Column(name="flow_max")
	private BigDecimal flowMax;

	@Column(name="h2s_max")
	private BigDecimal h2sMax;

	@Column(name="hg_max")
	private BigDecimal hgMax;

	@Column(name="mn_max")
	private BigDecimal mnMax;

	@Column(name="mo_max")
	private BigDecimal moMax;

	@Column(name="nh3_max")
	private BigDecimal nh3Max;

	@Column(name="nh4_max")
	private BigDecimal nh4Max;

	@Column(name="nh4_pt_max")
	private BigDecimal nh4PtMax;

	@Column(name="ni_max")
	private BigDecimal niMax;

	@Column(name="no2_max")
	private BigDecimal no2Max;

	@Column(name="no3_max")
	private BigDecimal no3Max;

	@Column(name="oil_max")
	private BigDecimal oilMax;

	@Column(name="pb_max")
	private BigDecimal pbMax;

	@Column(name="ph_max")
	private BigDecimal phMax;

	@Column(name="pheo_max")
	private BigDecimal pheoMax;

	@Column(name="po4_max")
	private BigDecimal po4Max;

	private String river;

	@Column(name="sal_max")
	private BigDecimal salMax;

	@Column(name="sb_max")
	private BigDecimal sbMax;

	@Column(name="sil_max")
	private BigDecimal silMax;

	@Column(name="ss_max")
	private BigDecimal ssMax;

	@Column(name="ssp_max")
	private BigDecimal sspMax;

	private String station;

	private String subzone;

	@Column(name="sulp_max")
	private BigDecimal sulpMax;

	@Column(name="tcyn_max")
	private BigDecimal tcynMax;

	@Column(name="temper_max")
	private BigDecimal temperMax;

	@Column(name="tin_max")
	private BigDecimal tinMax;

	@Column(name="tkns_max")
	private BigDecimal tknsMax;

	@Column(name="tknsp_max")
	private BigDecimal tknspMax;

	@Column(name="tl_max")
	private BigDecimal tlMax;

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

	@Column(name="turb_max")
	private BigDecimal turbMax;

	@Column(name="tvs_max")
	private BigDecimal tvsMax;

	@Column(name="v_max")
	private BigDecimal vMax;

	@Column(name="vel_max")
	private BigDecimal velMax;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	@Column(name="width_max")
	private BigDecimal widthMax;

	@Column(name="wqi_grade_max")
	private String wqiGradeMax;

	@Column(name="wqi_pt_max")
	private BigDecimal wqiPtMax;

	private double yr;

	@Column(name="zn_max")
	private BigDecimal znMax;

	private String zone;

	public RiverWaterMax1() {
	}

	public BigDecimal getAgMax() {
		return this.agMax;
	}

	public void setAgMax(BigDecimal agMax) {
		this.agMax = agMax;
	}

	public BigDecimal getAlMax() {
		return this.alMax;
	}

	public void setAlMax(BigDecimal alMax) {
		this.alMax = alMax;
	}

	public BigDecimal getArsenicMax() {
		return this.arsenicMax;
	}

	public void setArsenicMax(BigDecimal arsenicMax) {
		this.arsenicMax = arsenicMax;
	}

	public BigDecimal getBMax() {
		return this.bMax;
	}

	public void setBMax(BigDecimal bMax) {
		this.bMax = bMax;
	}

	public BigDecimal getBaMax() {
		return this.baMax;
	}

	public void setBaMax(BigDecimal baMax) {
		this.baMax = baMax;
	}

	public BigDecimal getBeMax() {
		return this.beMax;
	}

	public void setBeMax(BigDecimal beMax) {
		this.beMax = beMax;
	}

	public BigDecimal getBod5Max() {
		return this.bod5Max;
	}

	public void setBod5Max(BigDecimal bod5Max) {
		this.bod5Max = bod5Max;
	}

	public BigDecimal getBod5PtMax() {
		return this.bod5PtMax;
	}

	public void setBod5PtMax(BigDecimal bod5PtMax) {
		this.bod5PtMax = bod5PtMax;
	}

	public BigDecimal getCdMax() {
		return this.cdMax;
	}

	public void setCdMax(BigDecimal cdMax) {
		this.cdMax = cdMax;
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

	public BigDecimal getCondMax() {
		return this.condMax;
	}

	public void setCondMax(BigDecimal condMax) {
		this.condMax = condMax;
	}

	public BigDecimal getCrMax() {
		return this.crMax;
	}

	public void setCrMax(BigDecimal crMax) {
		this.crMax = crMax;
	}

	public BigDecimal getCuMax() {
		return this.cuMax;
	}

	public void setCuMax(BigDecimal cuMax) {
		this.cuMax = cuMax;
	}

	public BigDecimal getDepthMax() {
		return this.depthMax;
	}

	public void setDepthMax(BigDecimal depthMax) {
		this.depthMax = depthMax;
	}

	public BigDecimal getDetergMax() {
		return this.detergMax;
	}

	public void setDetergMax(BigDecimal detergMax) {
		this.detergMax = detergMax;
	}

	public BigDecimal getDoMax() {
		return this.doMax;
	}

	public void setDoMax(BigDecimal doMax) {
		this.doMax = doMax;
	}

	public BigDecimal getDosMax() {
		return this.dosMax;
	}

	public void setDosMax(BigDecimal dosMax) {
		this.dosMax = dosMax;
	}

	public BigDecimal getDosPtMax() {
		return this.dosPtMax;
	}

	public void setDosPtMax(BigDecimal dosPtMax) {
		this.dosPtMax = dosPtMax;
	}

	public BigDecimal getEcMax() {
		return this.ecMax;
	}

	public void setEcMax(BigDecimal ecMax) {
		this.ecMax = ecMax;
	}

	public BigDecimal getFcMax() {
		return this.fcMax;
	}

	public void setFcMax(BigDecimal fcMax) {
		this.fcMax = fcMax;
	}

	public BigDecimal getFeMax() {
		return this.feMax;
	}

	public void setFeMax(BigDecimal feMax) {
		this.feMax = feMax;
	}

	public BigDecimal getFlMax() {
		return this.flMax;
	}

	public void setFlMax(BigDecimal flMax) {
		this.flMax = flMax;
	}

	public BigDecimal getFlowMax() {
		return this.flowMax;
	}

	public void setFlowMax(BigDecimal flowMax) {
		this.flowMax = flowMax;
	}

	public BigDecimal getH2sMax() {
		return this.h2sMax;
	}

	public void setH2sMax(BigDecimal h2sMax) {
		this.h2sMax = h2sMax;
	}

	public BigDecimal getHgMax() {
		return this.hgMax;
	}

	public void setHgMax(BigDecimal hgMax) {
		this.hgMax = hgMax;
	}

	public BigDecimal getMnMax() {
		return this.mnMax;
	}

	public void setMnMax(BigDecimal mnMax) {
		this.mnMax = mnMax;
	}

	public BigDecimal getMoMax() {
		return this.moMax;
	}

	public void setMoMax(BigDecimal moMax) {
		this.moMax = moMax;
	}

	public BigDecimal getNh3Max() {
		return this.nh3Max;
	}

	public void setNh3Max(BigDecimal nh3Max) {
		this.nh3Max = nh3Max;
	}

	public BigDecimal getNh4Max() {
		return this.nh4Max;
	}

	public void setNh4Max(BigDecimal nh4Max) {
		this.nh4Max = nh4Max;
	}

	public BigDecimal getNh4PtMax() {
		return this.nh4PtMax;
	}

	public void setNh4PtMax(BigDecimal nh4PtMax) {
		this.nh4PtMax = nh4PtMax;
	}

	public BigDecimal getNiMax() {
		return this.niMax;
	}

	public void setNiMax(BigDecimal niMax) {
		this.niMax = niMax;
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

	public BigDecimal getPbMax() {
		return this.pbMax;
	}

	public void setPbMax(BigDecimal pbMax) {
		this.pbMax = pbMax;
	}

	public BigDecimal getPhMax() {
		return this.phMax;
	}

	public void setPhMax(BigDecimal phMax) {
		this.phMax = phMax;
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

	public String getRiver() {
		return this.river;
	}

	public void setRiver(String river) {
		this.river = river;
	}

	public BigDecimal getSalMax() {
		return this.salMax;
	}

	public void setSalMax(BigDecimal salMax) {
		this.salMax = salMax;
	}

	public BigDecimal getSbMax() {
		return this.sbMax;
	}

	public void setSbMax(BigDecimal sbMax) {
		this.sbMax = sbMax;
	}

	public BigDecimal getSilMax() {
		return this.silMax;
	}

	public void setSilMax(BigDecimal silMax) {
		this.silMax = silMax;
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

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getSubzone() {
		return this.subzone;
	}

	public void setSubzone(String subzone) {
		this.subzone = subzone;
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

	public BigDecimal getTemperMax() {
		return this.temperMax;
	}

	public void setTemperMax(BigDecimal temperMax) {
		this.temperMax = temperMax;
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

	public BigDecimal getTlMax() {
		return this.tlMax;
	}

	public void setTlMax(BigDecimal tlMax) {
		this.tlMax = tlMax;
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

	public BigDecimal getTurbMax() {
		return this.turbMax;
	}

	public void setTurbMax(BigDecimal turbMax) {
		this.turbMax = turbMax;
	}

	public BigDecimal getTvsMax() {
		return this.tvsMax;
	}

	public void setTvsMax(BigDecimal tvsMax) {
		this.tvsMax = tvsMax;
	}

	public BigDecimal getVMax() {
		return this.vMax;
	}

	public void setVMax(BigDecimal vMax) {
		this.vMax = vMax;
	}

	public BigDecimal getVelMax() {
		return this.velMax;
	}

	public void setVelMax(BigDecimal velMax) {
		this.velMax = velMax;
	}

	public BigDecimal getViewNo() {
		return this.viewNo;
	}

	public void setViewNo(BigDecimal viewNo) {
		this.viewNo = viewNo;
	}

	public String getWcz() {
		return this.wcz;
	}

	public void setWcz(String wcz) {
		this.wcz = wcz;
	}

	public BigDecimal getWidthMax() {
		return this.widthMax;
	}

	public void setWidthMax(BigDecimal widthMax) {
		this.widthMax = widthMax;
	}

	public String getWqiGradeMax() {
		return this.wqiGradeMax;
	}

	public void setWqiGradeMax(String wqiGradeMax) {
		this.wqiGradeMax = wqiGradeMax;
	}

	public BigDecimal getWqiPtMax() {
		return this.wqiPtMax;
	}

	public void setWqiPtMax(BigDecimal wqiPtMax) {
		this.wqiPtMax = wqiPtMax;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

	public BigDecimal getZnMax() {
		return this.znMax;
	}

	public void setZnMax(BigDecimal znMax) {
		this.znMax = znMax;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}