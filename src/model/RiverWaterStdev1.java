package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the river_water_stdev1 database table.
 * 
 */
//@Entity
@Table(name="river_water_stdev1")
@NamedQuery(name="RiverWaterStdev1.findAll", query="SELECT r FROM RiverWaterStdev1 r")
public class RiverWaterStdev1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ag_stdev")
	private BigDecimal agStdev;

	@Column(name="al_stdev")
	private BigDecimal alStdev;

	@Column(name="arsenic_stdev")
	private BigDecimal arsenicStdev;

	@Column(name="b_stdev")
	private BigDecimal bStdev;

	@Column(name="ba_stdev")
	private BigDecimal baStdev;

	@Column(name="be_stdev")
	private BigDecimal beStdev;

	@Column(name="bod5_pt_stdev")
	private BigDecimal bod5PtStdev;

	@Column(name="bod5_stdev")
	private BigDecimal bod5Stdev;

	@Column(name="cd_stdev")
	private BigDecimal cdStdev;

	@Column(name="chl_stdev")
	private BigDecimal chlStdev;

	@Column(name="cl_stdev")
	private BigDecimal clStdev;

	@Column(name="cod_stdev")
	private BigDecimal codStdev;

	@Column(name="cond_stdev")
	private BigDecimal condStdev;

	@Column(name="cr_stdev")
	private BigDecimal crStdev;

	@Column(name="cu_stdev")
	private BigDecimal cuStdev;

	@Column(name="depth_stdev")
	private BigDecimal depthStdev;

	@Column(name="deterg_stdev")
	private BigDecimal detergStdev;

	@Column(name="do_stdev")
	private BigDecimal doStdev;

	@Column(name="dos_pt_stdev")
	private BigDecimal dosPtStdev;

	@Column(name="dos_stdev")
	private BigDecimal dosStdev;

	@Column(name="ec_stdev")
	private BigDecimal ecStdev;

	@Column(name="fc_stdev")
	private BigDecimal fcStdev;

	@Column(name="fe_stdev")
	private BigDecimal feStdev;

	@Column(name="fl_stdev")
	private BigDecimal flStdev;

	@Column(name="flow_stdev")
	private BigDecimal flowStdev;

	@Column(name="h2s_stdev")
	private BigDecimal h2sStdev;

	@Column(name="hg_stdev")
	private BigDecimal hgStdev;

	@Column(name="mn_stdev")
	private BigDecimal mnStdev;

	@Column(name="mo_stdev")
	private BigDecimal moStdev;

	@Column(name="nh3_stdev")
	private BigDecimal nh3Stdev;

	@Column(name="nh4_pt_stdev")
	private BigDecimal nh4PtStdev;

	@Column(name="nh4_stdev")
	private BigDecimal nh4Stdev;

	@Column(name="ni_stdev")
	private BigDecimal niStdev;

	@Column(name="no2_stdev")
	private BigDecimal no2Stdev;

	@Column(name="no3_stdev")
	private BigDecimal no3Stdev;

	@Column(name="oil_stdev")
	private BigDecimal oilStdev;

	@Column(name="pb_stdev")
	private BigDecimal pbStdev;

	@Column(name="ph_stdev")
	private BigDecimal phStdev;

	@Column(name="pheo_stdev")
	private BigDecimal pheoStdev;

	@Column(name="po4_stdev")
	private BigDecimal po4Stdev;

	private String river;

	@Column(name="sal_stdev")
	private BigDecimal salStdev;

	@Column(name="sb_stdev")
	private BigDecimal sbStdev;

	@Column(name="sil_stdev")
	private BigDecimal silStdev;

	@Column(name="ss_stdev")
	private BigDecimal ssStdev;

	@Column(name="ssp_stdev")
	private BigDecimal sspStdev;

	private String station;

	private String subzone;

	@Column(name="sulp_stdev")
	private BigDecimal sulpStdev;

	@Column(name="tcyn_stdev")
	private BigDecimal tcynStdev;

	@Column(name="temper_stdev")
	private BigDecimal temperStdev;

	@Column(name="tin_stdev")
	private BigDecimal tinStdev;

	@Column(name="tkns_stdev")
	private BigDecimal tknsStdev;

	@Column(name="tknsp_stdev")
	private BigDecimal tknspStdev;

	@Column(name="tl_stdev")
	private BigDecimal tlStdev;

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

	@Column(name="turb_stdev")
	private BigDecimal turbStdev;

	@Column(name="tvs_stdev")
	private BigDecimal tvsStdev;

	@Column(name="v_stdev")
	private BigDecimal vStdev;

	@Column(name="vel_stdev")
	private BigDecimal velStdev;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	@Column(name="width_stdev")
	private BigDecimal widthStdev;

	@Column(name="wqi_grade_stdev")
	private String wqiGradeStdev;

	@Column(name="wqi_pt_stdev")
	private BigDecimal wqiPtStdev;

	private double yr;

	@Column(name="zn_stdev")
	private BigDecimal znStdev;

	private String zone;

	public RiverWaterStdev1() {
	}

	public BigDecimal getAgStdev() {
		return this.agStdev;
	}

	public void setAgStdev(BigDecimal agStdev) {
		this.agStdev = agStdev;
	}

	public BigDecimal getAlStdev() {
		return this.alStdev;
	}

	public void setAlStdev(BigDecimal alStdev) {
		this.alStdev = alStdev;
	}

	public BigDecimal getArsenicStdev() {
		return this.arsenicStdev;
	}

	public void setArsenicStdev(BigDecimal arsenicStdev) {
		this.arsenicStdev = arsenicStdev;
	}

	public BigDecimal getBStdev() {
		return this.bStdev;
	}

	public void setBStdev(BigDecimal bStdev) {
		this.bStdev = bStdev;
	}

	public BigDecimal getBaStdev() {
		return this.baStdev;
	}

	public void setBaStdev(BigDecimal baStdev) {
		this.baStdev = baStdev;
	}

	public BigDecimal getBeStdev() {
		return this.beStdev;
	}

	public void setBeStdev(BigDecimal beStdev) {
		this.beStdev = beStdev;
	}

	public BigDecimal getBod5PtStdev() {
		return this.bod5PtStdev;
	}

	public void setBod5PtStdev(BigDecimal bod5PtStdev) {
		this.bod5PtStdev = bod5PtStdev;
	}

	public BigDecimal getBod5Stdev() {
		return this.bod5Stdev;
	}

	public void setBod5Stdev(BigDecimal bod5Stdev) {
		this.bod5Stdev = bod5Stdev;
	}

	public BigDecimal getCdStdev() {
		return this.cdStdev;
	}

	public void setCdStdev(BigDecimal cdStdev) {
		this.cdStdev = cdStdev;
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

	public BigDecimal getCondStdev() {
		return this.condStdev;
	}

	public void setCondStdev(BigDecimal condStdev) {
		this.condStdev = condStdev;
	}

	public BigDecimal getCrStdev() {
		return this.crStdev;
	}

	public void setCrStdev(BigDecimal crStdev) {
		this.crStdev = crStdev;
	}

	public BigDecimal getCuStdev() {
		return this.cuStdev;
	}

	public void setCuStdev(BigDecimal cuStdev) {
		this.cuStdev = cuStdev;
	}

	public BigDecimal getDepthStdev() {
		return this.depthStdev;
	}

	public void setDepthStdev(BigDecimal depthStdev) {
		this.depthStdev = depthStdev;
	}

	public BigDecimal getDetergStdev() {
		return this.detergStdev;
	}

	public void setDetergStdev(BigDecimal detergStdev) {
		this.detergStdev = detergStdev;
	}

	public BigDecimal getDoStdev() {
		return this.doStdev;
	}

	public void setDoStdev(BigDecimal doStdev) {
		this.doStdev = doStdev;
	}

	public BigDecimal getDosPtStdev() {
		return this.dosPtStdev;
	}

	public void setDosPtStdev(BigDecimal dosPtStdev) {
		this.dosPtStdev = dosPtStdev;
	}

	public BigDecimal getDosStdev() {
		return this.dosStdev;
	}

	public void setDosStdev(BigDecimal dosStdev) {
		this.dosStdev = dosStdev;
	}

	public BigDecimal getEcStdev() {
		return this.ecStdev;
	}

	public void setEcStdev(BigDecimal ecStdev) {
		this.ecStdev = ecStdev;
	}

	public BigDecimal getFcStdev() {
		return this.fcStdev;
	}

	public void setFcStdev(BigDecimal fcStdev) {
		this.fcStdev = fcStdev;
	}

	public BigDecimal getFeStdev() {
		return this.feStdev;
	}

	public void setFeStdev(BigDecimal feStdev) {
		this.feStdev = feStdev;
	}

	public BigDecimal getFlStdev() {
		return this.flStdev;
	}

	public void setFlStdev(BigDecimal flStdev) {
		this.flStdev = flStdev;
	}

	public BigDecimal getFlowStdev() {
		return this.flowStdev;
	}

	public void setFlowStdev(BigDecimal flowStdev) {
		this.flowStdev = flowStdev;
	}

	public BigDecimal getH2sStdev() {
		return this.h2sStdev;
	}

	public void setH2sStdev(BigDecimal h2sStdev) {
		this.h2sStdev = h2sStdev;
	}

	public BigDecimal getHgStdev() {
		return this.hgStdev;
	}

	public void setHgStdev(BigDecimal hgStdev) {
		this.hgStdev = hgStdev;
	}

	public BigDecimal getMnStdev() {
		return this.mnStdev;
	}

	public void setMnStdev(BigDecimal mnStdev) {
		this.mnStdev = mnStdev;
	}

	public BigDecimal getMoStdev() {
		return this.moStdev;
	}

	public void setMoStdev(BigDecimal moStdev) {
		this.moStdev = moStdev;
	}

	public BigDecimal getNh3Stdev() {
		return this.nh3Stdev;
	}

	public void setNh3Stdev(BigDecimal nh3Stdev) {
		this.nh3Stdev = nh3Stdev;
	}

	public BigDecimal getNh4PtStdev() {
		return this.nh4PtStdev;
	}

	public void setNh4PtStdev(BigDecimal nh4PtStdev) {
		this.nh4PtStdev = nh4PtStdev;
	}

	public BigDecimal getNh4Stdev() {
		return this.nh4Stdev;
	}

	public void setNh4Stdev(BigDecimal nh4Stdev) {
		this.nh4Stdev = nh4Stdev;
	}

	public BigDecimal getNiStdev() {
		return this.niStdev;
	}

	public void setNiStdev(BigDecimal niStdev) {
		this.niStdev = niStdev;
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

	public BigDecimal getPbStdev() {
		return this.pbStdev;
	}

	public void setPbStdev(BigDecimal pbStdev) {
		this.pbStdev = pbStdev;
	}

	public BigDecimal getPhStdev() {
		return this.phStdev;
	}

	public void setPhStdev(BigDecimal phStdev) {
		this.phStdev = phStdev;
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

	public String getRiver() {
		return this.river;
	}

	public void setRiver(String river) {
		this.river = river;
	}

	public BigDecimal getSalStdev() {
		return this.salStdev;
	}

	public void setSalStdev(BigDecimal salStdev) {
		this.salStdev = salStdev;
	}

	public BigDecimal getSbStdev() {
		return this.sbStdev;
	}

	public void setSbStdev(BigDecimal sbStdev) {
		this.sbStdev = sbStdev;
	}

	public BigDecimal getSilStdev() {
		return this.silStdev;
	}

	public void setSilStdev(BigDecimal silStdev) {
		this.silStdev = silStdev;
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

	public BigDecimal getTemperStdev() {
		return this.temperStdev;
	}

	public void setTemperStdev(BigDecimal temperStdev) {
		this.temperStdev = temperStdev;
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

	public BigDecimal getTlStdev() {
		return this.tlStdev;
	}

	public void setTlStdev(BigDecimal tlStdev) {
		this.tlStdev = tlStdev;
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

	public BigDecimal getTurbStdev() {
		return this.turbStdev;
	}

	public void setTurbStdev(BigDecimal turbStdev) {
		this.turbStdev = turbStdev;
	}

	public BigDecimal getTvsStdev() {
		return this.tvsStdev;
	}

	public void setTvsStdev(BigDecimal tvsStdev) {
		this.tvsStdev = tvsStdev;
	}

	public BigDecimal getVStdev() {
		return this.vStdev;
	}

	public void setVStdev(BigDecimal vStdev) {
		this.vStdev = vStdev;
	}

	public BigDecimal getVelStdev() {
		return this.velStdev;
	}

	public void setVelStdev(BigDecimal velStdev) {
		this.velStdev = velStdev;
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

	public BigDecimal getWidthStdev() {
		return this.widthStdev;
	}

	public void setWidthStdev(BigDecimal widthStdev) {
		this.widthStdev = widthStdev;
	}

	public String getWqiGradeStdev() {
		return this.wqiGradeStdev;
	}

	public void setWqiGradeStdev(String wqiGradeStdev) {
		this.wqiGradeStdev = wqiGradeStdev;
	}

	public BigDecimal getWqiPtStdev() {
		return this.wqiPtStdev;
	}

	public void setWqiPtStdev(BigDecimal wqiPtStdev) {
		this.wqiPtStdev = wqiPtStdev;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

	public BigDecimal getZnStdev() {
		return this.znStdev;
	}

	public void setZnStdev(BigDecimal znStdev) {
		this.znStdev = znStdev;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}