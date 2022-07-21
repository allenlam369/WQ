package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the river_water_min1 database table.
 * 
 */
//@Entity
@Table(name="river_water_min1")
@NamedQuery(name="RiverWaterMin1.findAll", query="SELECT r FROM RiverWaterMin1 r")
public class RiverWaterMin1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ag_min")
	private BigDecimal agMin;

	@Column(name="al_min")
	private BigDecimal alMin;

	@Column(name="arsenic_min")
	private BigDecimal arsenicMin;

	@Column(name="b_min")
	private BigDecimal bMin;

	@Column(name="ba_min")
	private BigDecimal baMin;

	@Column(name="be_min")
	private BigDecimal beMin;

	@Column(name="bod5_min")
	private BigDecimal bod5Min;

	@Column(name="bod5_pt_min")
	private BigDecimal bod5PtMin;

	@Column(name="cd_min")
	private BigDecimal cdMin;

	@Column(name="chl_min")
	private BigDecimal chlMin;

	@Column(name="cl_min")
	private BigDecimal clMin;

	@Column(name="cod_min")
	private BigDecimal codMin;

	@Column(name="cond_min")
	private BigDecimal condMin;

	@Column(name="cr_min")
	private BigDecimal crMin;

	@Column(name="cu_min")
	private BigDecimal cuMin;

	@Column(name="depth_min")
	private BigDecimal depthMin;

	@Column(name="deterg_min")
	private BigDecimal detergMin;

	@Column(name="do_min")
	private BigDecimal doMin;

	@Column(name="dos_min")
	private BigDecimal dosMin;

	@Column(name="dos_pt_min")
	private BigDecimal dosPtMin;

	@Column(name="ec_min")
	private BigDecimal ecMin;

	@Column(name="fc_min")
	private BigDecimal fcMin;

	@Column(name="fe_min")
	private BigDecimal feMin;

	@Column(name="fl_min")
	private BigDecimal flMin;

	@Column(name="flow_min")
	private BigDecimal flowMin;

	@Column(name="h2s_min")
	private BigDecimal h2sMin;

	@Column(name="hg_min")
	private BigDecimal hgMin;

	@Column(name="mn_min")
	private BigDecimal mnMin;

	@Column(name="mo_min")
	private BigDecimal moMin;

	@Column(name="nh3_min")
	private BigDecimal nh3Min;

	@Column(name="nh4_min")
	private BigDecimal nh4Min;

	@Column(name="nh4_pt_min")
	private BigDecimal nh4PtMin;

	@Column(name="ni_min")
	private BigDecimal niMin;

	@Column(name="no2_min")
	private BigDecimal no2Min;

	@Column(name="no3_min")
	private BigDecimal no3Min;

	@Column(name="oil_min")
	private BigDecimal oilMin;

	@Column(name="pb_min")
	private BigDecimal pbMin;

	@Column(name="ph_min")
	private BigDecimal phMin;

	@Column(name="pheo_min")
	private BigDecimal pheoMin;

	@Column(name="po4_min")
	private BigDecimal po4Min;

	private String river;

	@Column(name="sal_min")
	private BigDecimal salMin;

	@Column(name="sb_min")
	private BigDecimal sbMin;

	@Column(name="sil_min")
	private BigDecimal silMin;

	@Column(name="ss_min")
	private BigDecimal ssMin;

	@Column(name="ssp_min")
	private BigDecimal sspMin;

	private String station;

	private String subzone;

	@Column(name="sulp_min")
	private BigDecimal sulpMin;

	@Column(name="tcyn_min")
	private BigDecimal tcynMin;

	@Column(name="temper_min")
	private BigDecimal temperMin;

	@Column(name="tin_min")
	private BigDecimal tinMin;

	@Column(name="tkns_min")
	private BigDecimal tknsMin;

	@Column(name="tknsp_min")
	private BigDecimal tknspMin;

	@Column(name="tl_min")
	private BigDecimal tlMin;

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

	@Column(name="turb_min")
	private BigDecimal turbMin;

	@Column(name="tvs_min")
	private BigDecimal tvsMin;

	@Column(name="v_min")
	private BigDecimal vMin;

	@Column(name="vel_min")
	private BigDecimal velMin;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	@Column(name="width_min")
	private BigDecimal widthMin;

	@Column(name="wqi_grade_min")
	private String wqiGradeMin;

	@Column(name="wqi_pt_min")
	private BigDecimal wqiPtMin;

	private double yr;

	@Column(name="zn_min")
	private BigDecimal znMin;

	private String zone;

	public RiverWaterMin1() {
	}

	public BigDecimal getAgMin() {
		return this.agMin;
	}

	public void setAgMin(BigDecimal agMin) {
		this.agMin = agMin;
	}

	public BigDecimal getAlMin() {
		return this.alMin;
	}

	public void setAlMin(BigDecimal alMin) {
		this.alMin = alMin;
	}

	public BigDecimal getArsenicMin() {
		return this.arsenicMin;
	}

	public void setArsenicMin(BigDecimal arsenicMin) {
		this.arsenicMin = arsenicMin;
	}

	public BigDecimal getBMin() {
		return this.bMin;
	}

	public void setBMin(BigDecimal bMin) {
		this.bMin = bMin;
	}

	public BigDecimal getBaMin() {
		return this.baMin;
	}

	public void setBaMin(BigDecimal baMin) {
		this.baMin = baMin;
	}

	public BigDecimal getBeMin() {
		return this.beMin;
	}

	public void setBeMin(BigDecimal beMin) {
		this.beMin = beMin;
	}

	public BigDecimal getBod5Min() {
		return this.bod5Min;
	}

	public void setBod5Min(BigDecimal bod5Min) {
		this.bod5Min = bod5Min;
	}

	public BigDecimal getBod5PtMin() {
		return this.bod5PtMin;
	}

	public void setBod5PtMin(BigDecimal bod5PtMin) {
		this.bod5PtMin = bod5PtMin;
	}

	public BigDecimal getCdMin() {
		return this.cdMin;
	}

	public void setCdMin(BigDecimal cdMin) {
		this.cdMin = cdMin;
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

	public BigDecimal getCondMin() {
		return this.condMin;
	}

	public void setCondMin(BigDecimal condMin) {
		this.condMin = condMin;
	}

	public BigDecimal getCrMin() {
		return this.crMin;
	}

	public void setCrMin(BigDecimal crMin) {
		this.crMin = crMin;
	}

	public BigDecimal getCuMin() {
		return this.cuMin;
	}

	public void setCuMin(BigDecimal cuMin) {
		this.cuMin = cuMin;
	}

	public BigDecimal getDepthMin() {
		return this.depthMin;
	}

	public void setDepthMin(BigDecimal depthMin) {
		this.depthMin = depthMin;
	}

	public BigDecimal getDetergMin() {
		return this.detergMin;
	}

	public void setDetergMin(BigDecimal detergMin) {
		this.detergMin = detergMin;
	}

	public BigDecimal getDoMin() {
		return this.doMin;
	}

	public void setDoMin(BigDecimal doMin) {
		this.doMin = doMin;
	}

	public BigDecimal getDosMin() {
		return this.dosMin;
	}

	public void setDosMin(BigDecimal dosMin) {
		this.dosMin = dosMin;
	}

	public BigDecimal getDosPtMin() {
		return this.dosPtMin;
	}

	public void setDosPtMin(BigDecimal dosPtMin) {
		this.dosPtMin = dosPtMin;
	}

	public BigDecimal getEcMin() {
		return this.ecMin;
	}

	public void setEcMin(BigDecimal ecMin) {
		this.ecMin = ecMin;
	}

	public BigDecimal getFcMin() {
		return this.fcMin;
	}

	public void setFcMin(BigDecimal fcMin) {
		this.fcMin = fcMin;
	}

	public BigDecimal getFeMin() {
		return this.feMin;
	}

	public void setFeMin(BigDecimal feMin) {
		this.feMin = feMin;
	}

	public BigDecimal getFlMin() {
		return this.flMin;
	}

	public void setFlMin(BigDecimal flMin) {
		this.flMin = flMin;
	}

	public BigDecimal getFlowMin() {
		return this.flowMin;
	}

	public void setFlowMin(BigDecimal flowMin) {
		this.flowMin = flowMin;
	}

	public BigDecimal getH2sMin() {
		return this.h2sMin;
	}

	public void setH2sMin(BigDecimal h2sMin) {
		this.h2sMin = h2sMin;
	}

	public BigDecimal getHgMin() {
		return this.hgMin;
	}

	public void setHgMin(BigDecimal hgMin) {
		this.hgMin = hgMin;
	}

	public BigDecimal getMnMin() {
		return this.mnMin;
	}

	public void setMnMin(BigDecimal mnMin) {
		this.mnMin = mnMin;
	}

	public BigDecimal getMoMin() {
		return this.moMin;
	}

	public void setMoMin(BigDecimal moMin) {
		this.moMin = moMin;
	}

	public BigDecimal getNh3Min() {
		return this.nh3Min;
	}

	public void setNh3Min(BigDecimal nh3Min) {
		this.nh3Min = nh3Min;
	}

	public BigDecimal getNh4Min() {
		return this.nh4Min;
	}

	public void setNh4Min(BigDecimal nh4Min) {
		this.nh4Min = nh4Min;
	}

	public BigDecimal getNh4PtMin() {
		return this.nh4PtMin;
	}

	public void setNh4PtMin(BigDecimal nh4PtMin) {
		this.nh4PtMin = nh4PtMin;
	}

	public BigDecimal getNiMin() {
		return this.niMin;
	}

	public void setNiMin(BigDecimal niMin) {
		this.niMin = niMin;
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

	public BigDecimal getPbMin() {
		return this.pbMin;
	}

	public void setPbMin(BigDecimal pbMin) {
		this.pbMin = pbMin;
	}

	public BigDecimal getPhMin() {
		return this.phMin;
	}

	public void setPhMin(BigDecimal phMin) {
		this.phMin = phMin;
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

	public String getRiver() {
		return this.river;
	}

	public void setRiver(String river) {
		this.river = river;
	}

	public BigDecimal getSalMin() {
		return this.salMin;
	}

	public void setSalMin(BigDecimal salMin) {
		this.salMin = salMin;
	}

	public BigDecimal getSbMin() {
		return this.sbMin;
	}

	public void setSbMin(BigDecimal sbMin) {
		this.sbMin = sbMin;
	}

	public BigDecimal getSilMin() {
		return this.silMin;
	}

	public void setSilMin(BigDecimal silMin) {
		this.silMin = silMin;
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

	public BigDecimal getTemperMin() {
		return this.temperMin;
	}

	public void setTemperMin(BigDecimal temperMin) {
		this.temperMin = temperMin;
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

	public BigDecimal getTlMin() {
		return this.tlMin;
	}

	public void setTlMin(BigDecimal tlMin) {
		this.tlMin = tlMin;
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

	public BigDecimal getTurbMin() {
		return this.turbMin;
	}

	public void setTurbMin(BigDecimal turbMin) {
		this.turbMin = turbMin;
	}

	public BigDecimal getTvsMin() {
		return this.tvsMin;
	}

	public void setTvsMin(BigDecimal tvsMin) {
		this.tvsMin = tvsMin;
	}

	public BigDecimal getVMin() {
		return this.vMin;
	}

	public void setVMin(BigDecimal vMin) {
		this.vMin = vMin;
	}

	public BigDecimal getVelMin() {
		return this.velMin;
	}

	public void setVelMin(BigDecimal velMin) {
		this.velMin = velMin;
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

	public BigDecimal getWidthMin() {
		return this.widthMin;
	}

	public void setWidthMin(BigDecimal widthMin) {
		this.widthMin = widthMin;
	}

	public String getWqiGradeMin() {
		return this.wqiGradeMin;
	}

	public void setWqiGradeMin(String wqiGradeMin) {
		this.wqiGradeMin = wqiGradeMin;
	}

	public BigDecimal getWqiPtMin() {
		return this.wqiPtMin;
	}

	public void setWqiPtMin(BigDecimal wqiPtMin) {
		this.wqiPtMin = wqiPtMin;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

	public BigDecimal getZnMin() {
		return this.znMin;
	}

	public void setZnMin(BigDecimal znMin) {
		this.znMin = znMin;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}