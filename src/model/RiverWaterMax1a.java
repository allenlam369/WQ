package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the river_water_max1a database table.
 * 
 */
//@Entity
@Table(name="river_water_max1a")
@NamedQuery(name="RiverWaterMax1a.findAll", query="SELECT r FROM RiverWaterMax1a r")
public class RiverWaterMax1a implements Serializable {
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

	@Column(name="l_ag_max")
	private String lAgMax;

	@Column(name="l_al_max")
	private String lAlMax;

	@Column(name="l_arsenic_max")
	private String lArsenicMax;

	@Column(name="l_b_max")
	private String lBMax;

	@Column(name="l_ba_max")
	private String lBaMax;

	@Column(name="l_be_max")
	private String lBeMax;

	@Column(name="l_bod5_max")
	private String lBod5Max;

	@Column(name="l_cd_max")
	private String lCdMax;

	@Column(name="l_chl_max")
	private String lChlMax;

	@Column(name="l_cl_max")
	private String lClMax;

	@Column(name="l_cod_max")
	private String lCodMax;

	@Column(name="l_cond_max")
	private String lCondMax;

	@Column(name="l_cr_max")
	private String lCrMax;

	@Column(name="l_cu_max")
	private String lCuMax;

	@Column(name="l_deterg_max")
	private String lDetergMax;

	@Column(name="l_do_max")
	private String lDoMax;

	@Column(name="l_dos_max")
	private String lDosMax;

	@Column(name="l_ec_max")
	private String lEcMax;

	@Column(name="l_fc_max")
	private String lFcMax;

	@Column(name="l_fe_max")
	private String lFeMax;

	@Column(name="l_fl_max")
	private String lFlMax;

	@Column(name="l_h2s_max")
	private String lH2sMax;

	@Column(name="l_hg_max")
	private String lHgMax;

	@Column(name="l_mn_max")
	private String lMnMax;

	@Column(name="l_mo_max")
	private String lMoMax;

	@Column(name="l_nh3_max")
	private String lNh3Max;

	@Column(name="l_nh4_max")
	private String lNh4Max;

	@Column(name="l_ni_max")
	private String lNiMax;

	@Column(name="l_no2_max")
	private String lNo2Max;

	@Column(name="l_no3_max")
	private String lNo3Max;

	@Column(name="l_oil_max")
	private String lOilMax;

	@Column(name="l_pb_max")
	private String lPbMax;

	@Column(name="l_ph_max")
	private String lPhMax;

	@Column(name="l_pheo_max")
	private String lPheoMax;

	@Column(name="l_po4_max")
	private String lPo4Max;

	@Column(name="l_sal_max")
	private String lSalMax;

	@Column(name="l_sb_max")
	private String lSbMax;

	@Column(name="l_sil_max")
	private String lSilMax;

	@Column(name="l_ss_max")
	private String lSsMax;

	@Column(name="l_ssp_max")
	private String lSspMax;

	@Column(name="l_sulp_max")
	private String lSulpMax;

	@Column(name="l_tcyn_max")
	private String lTcynMax;

	@Column(name="l_tin_max")
	private String lTinMax;

	@Column(name="l_tkns_max")
	private String lTknsMax;

	@Column(name="l_tknsp_max")
	private String lTknspMax;

	@Column(name="l_tl_max")
	private String lTlMax;

	@Column(name="l_tn_max")
	private String lTnMax;

	@Column(name="l_toc_max")
	private String lTocMax;

	@Column(name="l_tps_max")
	private String lTpsMax;

	@Column(name="l_tpsp_max")
	private String lTpspMax;

	@Column(name="l_ts_max")
	private String lTsMax;

	@Column(name="l_turb_max")
	private String lTurbMax;

	@Column(name="l_tvs_max")
	private String lTvsMax;

	@Column(name="l_v_max")
	private String lVMax;

	@Column(name="l_zn_max")
	private String lZnMax;

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

	public RiverWaterMax1a() {
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

	public String getLAgMax() {
		return this.lAgMax;
	}

	public void setLAgMax(String lAgMax) {
		this.lAgMax = lAgMax;
	}

	public String getLAlMax() {
		return this.lAlMax;
	}

	public void setLAlMax(String lAlMax) {
		this.lAlMax = lAlMax;
	}

	public String getLArsenicMax() {
		return this.lArsenicMax;
	}

	public void setLArsenicMax(String lArsenicMax) {
		this.lArsenicMax = lArsenicMax;
	}

	public String getLBMax() {
		return this.lBMax;
	}

	public void setLBMax(String lBMax) {
		this.lBMax = lBMax;
	}

	public String getLBaMax() {
		return this.lBaMax;
	}

	public void setLBaMax(String lBaMax) {
		this.lBaMax = lBaMax;
	}

	public String getLBeMax() {
		return this.lBeMax;
	}

	public void setLBeMax(String lBeMax) {
		this.lBeMax = lBeMax;
	}

	public String getLBod5Max() {
		return this.lBod5Max;
	}

	public void setLBod5Max(String lBod5Max) {
		this.lBod5Max = lBod5Max;
	}

	public String getLCdMax() {
		return this.lCdMax;
	}

	public void setLCdMax(String lCdMax) {
		this.lCdMax = lCdMax;
	}

	public String getLChlMax() {
		return this.lChlMax;
	}

	public void setLChlMax(String lChlMax) {
		this.lChlMax = lChlMax;
	}

	public String getLClMax() {
		return this.lClMax;
	}

	public void setLClMax(String lClMax) {
		this.lClMax = lClMax;
	}

	public String getLCodMax() {
		return this.lCodMax;
	}

	public void setLCodMax(String lCodMax) {
		this.lCodMax = lCodMax;
	}

	public String getLCondMax() {
		return this.lCondMax;
	}

	public void setLCondMax(String lCondMax) {
		this.lCondMax = lCondMax;
	}

	public String getLCrMax() {
		return this.lCrMax;
	}

	public void setLCrMax(String lCrMax) {
		this.lCrMax = lCrMax;
	}

	public String getLCuMax() {
		return this.lCuMax;
	}

	public void setLCuMax(String lCuMax) {
		this.lCuMax = lCuMax;
	}

	public String getLDetergMax() {
		return this.lDetergMax;
	}

	public void setLDetergMax(String lDetergMax) {
		this.lDetergMax = lDetergMax;
	}

	public String getLDoMax() {
		return this.lDoMax;
	}

	public void setLDoMax(String lDoMax) {
		this.lDoMax = lDoMax;
	}

	public String getLDosMax() {
		return this.lDosMax;
	}

	public void setLDosMax(String lDosMax) {
		this.lDosMax = lDosMax;
	}

	public String getLEcMax() {
		return this.lEcMax;
	}

	public void setLEcMax(String lEcMax) {
		this.lEcMax = lEcMax;
	}

	public String getLFcMax() {
		return this.lFcMax;
	}

	public void setLFcMax(String lFcMax) {
		this.lFcMax = lFcMax;
	}

	public String getLFeMax() {
		return this.lFeMax;
	}

	public void setLFeMax(String lFeMax) {
		this.lFeMax = lFeMax;
	}

	public String getLFlMax() {
		return this.lFlMax;
	}

	public void setLFlMax(String lFlMax) {
		this.lFlMax = lFlMax;
	}

	public String getLH2sMax() {
		return this.lH2sMax;
	}

	public void setLH2sMax(String lH2sMax) {
		this.lH2sMax = lH2sMax;
	}

	public String getLHgMax() {
		return this.lHgMax;
	}

	public void setLHgMax(String lHgMax) {
		this.lHgMax = lHgMax;
	}

	public String getLMnMax() {
		return this.lMnMax;
	}

	public void setLMnMax(String lMnMax) {
		this.lMnMax = lMnMax;
	}

	public String getLMoMax() {
		return this.lMoMax;
	}

	public void setLMoMax(String lMoMax) {
		this.lMoMax = lMoMax;
	}

	public String getLNh3Max() {
		return this.lNh3Max;
	}

	public void setLNh3Max(String lNh3Max) {
		this.lNh3Max = lNh3Max;
	}

	public String getLNh4Max() {
		return this.lNh4Max;
	}

	public void setLNh4Max(String lNh4Max) {
		this.lNh4Max = lNh4Max;
	}

	public String getLNiMax() {
		return this.lNiMax;
	}

	public void setLNiMax(String lNiMax) {
		this.lNiMax = lNiMax;
	}

	public String getLNo2Max() {
		return this.lNo2Max;
	}

	public void setLNo2Max(String lNo2Max) {
		this.lNo2Max = lNo2Max;
	}

	public String getLNo3Max() {
		return this.lNo3Max;
	}

	public void setLNo3Max(String lNo3Max) {
		this.lNo3Max = lNo3Max;
	}

	public String getLOilMax() {
		return this.lOilMax;
	}

	public void setLOilMax(String lOilMax) {
		this.lOilMax = lOilMax;
	}

	public String getLPbMax() {
		return this.lPbMax;
	}

	public void setLPbMax(String lPbMax) {
		this.lPbMax = lPbMax;
	}

	public String getLPhMax() {
		return this.lPhMax;
	}

	public void setLPhMax(String lPhMax) {
		this.lPhMax = lPhMax;
	}

	public String getLPheoMax() {
		return this.lPheoMax;
	}

	public void setLPheoMax(String lPheoMax) {
		this.lPheoMax = lPheoMax;
	}

	public String getLPo4Max() {
		return this.lPo4Max;
	}

	public void setLPo4Max(String lPo4Max) {
		this.lPo4Max = lPo4Max;
	}

	public String getLSalMax() {
		return this.lSalMax;
	}

	public void setLSalMax(String lSalMax) {
		this.lSalMax = lSalMax;
	}

	public String getLSbMax() {
		return this.lSbMax;
	}

	public void setLSbMax(String lSbMax) {
		this.lSbMax = lSbMax;
	}

	public String getLSilMax() {
		return this.lSilMax;
	}

	public void setLSilMax(String lSilMax) {
		this.lSilMax = lSilMax;
	}

	public String getLSsMax() {
		return this.lSsMax;
	}

	public void setLSsMax(String lSsMax) {
		this.lSsMax = lSsMax;
	}

	public String getLSspMax() {
		return this.lSspMax;
	}

	public void setLSspMax(String lSspMax) {
		this.lSspMax = lSspMax;
	}

	public String getLSulpMax() {
		return this.lSulpMax;
	}

	public void setLSulpMax(String lSulpMax) {
		this.lSulpMax = lSulpMax;
	}

	public String getLTcynMax() {
		return this.lTcynMax;
	}

	public void setLTcynMax(String lTcynMax) {
		this.lTcynMax = lTcynMax;
	}

	public String getLTinMax() {
		return this.lTinMax;
	}

	public void setLTinMax(String lTinMax) {
		this.lTinMax = lTinMax;
	}

	public String getLTknsMax() {
		return this.lTknsMax;
	}

	public void setLTknsMax(String lTknsMax) {
		this.lTknsMax = lTknsMax;
	}

	public String getLTknspMax() {
		return this.lTknspMax;
	}

	public void setLTknspMax(String lTknspMax) {
		this.lTknspMax = lTknspMax;
	}

	public String getLTlMax() {
		return this.lTlMax;
	}

	public void setLTlMax(String lTlMax) {
		this.lTlMax = lTlMax;
	}

	public String getLTnMax() {
		return this.lTnMax;
	}

	public void setLTnMax(String lTnMax) {
		this.lTnMax = lTnMax;
	}

	public String getLTocMax() {
		return this.lTocMax;
	}

	public void setLTocMax(String lTocMax) {
		this.lTocMax = lTocMax;
	}

	public String getLTpsMax() {
		return this.lTpsMax;
	}

	public void setLTpsMax(String lTpsMax) {
		this.lTpsMax = lTpsMax;
	}

	public String getLTpspMax() {
		return this.lTpspMax;
	}

	public void setLTpspMax(String lTpspMax) {
		this.lTpspMax = lTpspMax;
	}

	public String getLTsMax() {
		return this.lTsMax;
	}

	public void setLTsMax(String lTsMax) {
		this.lTsMax = lTsMax;
	}

	public String getLTurbMax() {
		return this.lTurbMax;
	}

	public void setLTurbMax(String lTurbMax) {
		this.lTurbMax = lTurbMax;
	}

	public String getLTvsMax() {
		return this.lTvsMax;
	}

	public void setLTvsMax(String lTvsMax) {
		this.lTvsMax = lTvsMax;
	}

	public String getLVMax() {
		return this.lVMax;
	}

	public void setLVMax(String lVMax) {
		this.lVMax = lVMax;
	}

	public String getLZnMax() {
		return this.lZnMax;
	}

	public void setLZnMax(String lZnMax) {
		this.lZnMax = lZnMax;
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