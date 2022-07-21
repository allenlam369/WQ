package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the river_water_min1a database table.
 * 
 */
//@Entity
@Table(name="river_water_min1a")
@NamedQuery(name="RiverWaterMin1a.findAll", query="SELECT r FROM RiverWaterMin1a r")
public class RiverWaterMin1a implements Serializable {
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

	@Column(name="l_ag_min")
	private String lAgMin;

	@Column(name="l_al_min")
	private String lAlMin;

	@Column(name="l_arsenic_min")
	private String lArsenicMin;

	@Column(name="l_b_min")
	private String lBMin;

	@Column(name="l_ba_min")
	private String lBaMin;

	@Column(name="l_be_min")
	private String lBeMin;

	@Column(name="l_bod5_min")
	private String lBod5Min;

	@Column(name="l_cd_min")
	private String lCdMin;

	@Column(name="l_chl_min")
	private String lChlMin;

	@Column(name="l_cl_min")
	private String lClMin;

	@Column(name="l_cod_min")
	private String lCodMin;

	@Column(name="l_cond_min")
	private String lCondMin;

	@Column(name="l_cr_min")
	private String lCrMin;

	@Column(name="l_cu_min")
	private String lCuMin;

	@Column(name="l_deterg_min")
	private String lDetergMin;

	@Column(name="l_do_min")
	private String lDoMin;

	@Column(name="l_dos_min")
	private String lDosMin;

	@Column(name="l_ec_min")
	private String lEcMin;

	@Column(name="l_fc_min")
	private String lFcMin;

	@Column(name="l_fe_min")
	private String lFeMin;

	@Column(name="l_fl_min")
	private String lFlMin;

	@Column(name="l_h2s_min")
	private String lH2sMin;

	@Column(name="l_hg_min")
	private String lHgMin;

	@Column(name="l_mn_min")
	private String lMnMin;

	@Column(name="l_mo_min")
	private String lMoMin;

	@Column(name="l_nh3_min")
	private String lNh3Min;

	@Column(name="l_nh4_min")
	private String lNh4Min;

	@Column(name="l_ni_min")
	private String lNiMin;

	@Column(name="l_no2_min")
	private String lNo2Min;

	@Column(name="l_no3_min")
	private String lNo3Min;

	@Column(name="l_oil_min")
	private String lOilMin;

	@Column(name="l_pb_min")
	private String lPbMin;

	@Column(name="l_ph_min")
	private String lPhMin;

	@Column(name="l_pheo_min")
	private String lPheoMin;

	@Column(name="l_po4_min")
	private String lPo4Min;

	@Column(name="l_sal_min")
	private String lSalMin;

	@Column(name="l_sb_min")
	private String lSbMin;

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

	@Column(name="l_tl_min")
	private String lTlMin;

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

	@Column(name="l_turb_min")
	private String lTurbMin;

	@Column(name="l_tvs_min")
	private String lTvsMin;

	@Column(name="l_v_min")
	private String lVMin;

	@Column(name="l_zn_min")
	private String lZnMin;

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

	public RiverWaterMin1a() {
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

	public String getLAgMin() {
		return this.lAgMin;
	}

	public void setLAgMin(String lAgMin) {
		this.lAgMin = lAgMin;
	}

	public String getLAlMin() {
		return this.lAlMin;
	}

	public void setLAlMin(String lAlMin) {
		this.lAlMin = lAlMin;
	}

	public String getLArsenicMin() {
		return this.lArsenicMin;
	}

	public void setLArsenicMin(String lArsenicMin) {
		this.lArsenicMin = lArsenicMin;
	}

	public String getLBMin() {
		return this.lBMin;
	}

	public void setLBMin(String lBMin) {
		this.lBMin = lBMin;
	}

	public String getLBaMin() {
		return this.lBaMin;
	}

	public void setLBaMin(String lBaMin) {
		this.lBaMin = lBaMin;
	}

	public String getLBeMin() {
		return this.lBeMin;
	}

	public void setLBeMin(String lBeMin) {
		this.lBeMin = lBeMin;
	}

	public String getLBod5Min() {
		return this.lBod5Min;
	}

	public void setLBod5Min(String lBod5Min) {
		this.lBod5Min = lBod5Min;
	}

	public String getLCdMin() {
		return this.lCdMin;
	}

	public void setLCdMin(String lCdMin) {
		this.lCdMin = lCdMin;
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

	public String getLCondMin() {
		return this.lCondMin;
	}

	public void setLCondMin(String lCondMin) {
		this.lCondMin = lCondMin;
	}

	public String getLCrMin() {
		return this.lCrMin;
	}

	public void setLCrMin(String lCrMin) {
		this.lCrMin = lCrMin;
	}

	public String getLCuMin() {
		return this.lCuMin;
	}

	public void setLCuMin(String lCuMin) {
		this.lCuMin = lCuMin;
	}

	public String getLDetergMin() {
		return this.lDetergMin;
	}

	public void setLDetergMin(String lDetergMin) {
		this.lDetergMin = lDetergMin;
	}

	public String getLDoMin() {
		return this.lDoMin;
	}

	public void setLDoMin(String lDoMin) {
		this.lDoMin = lDoMin;
	}

	public String getLDosMin() {
		return this.lDosMin;
	}

	public void setLDosMin(String lDosMin) {
		this.lDosMin = lDosMin;
	}

	public String getLEcMin() {
		return this.lEcMin;
	}

	public void setLEcMin(String lEcMin) {
		this.lEcMin = lEcMin;
	}

	public String getLFcMin() {
		return this.lFcMin;
	}

	public void setLFcMin(String lFcMin) {
		this.lFcMin = lFcMin;
	}

	public String getLFeMin() {
		return this.lFeMin;
	}

	public void setLFeMin(String lFeMin) {
		this.lFeMin = lFeMin;
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

	public String getLHgMin() {
		return this.lHgMin;
	}

	public void setLHgMin(String lHgMin) {
		this.lHgMin = lHgMin;
	}

	public String getLMnMin() {
		return this.lMnMin;
	}

	public void setLMnMin(String lMnMin) {
		this.lMnMin = lMnMin;
	}

	public String getLMoMin() {
		return this.lMoMin;
	}

	public void setLMoMin(String lMoMin) {
		this.lMoMin = lMoMin;
	}

	public String getLNh3Min() {
		return this.lNh3Min;
	}

	public void setLNh3Min(String lNh3Min) {
		this.lNh3Min = lNh3Min;
	}

	public String getLNh4Min() {
		return this.lNh4Min;
	}

	public void setLNh4Min(String lNh4Min) {
		this.lNh4Min = lNh4Min;
	}

	public String getLNiMin() {
		return this.lNiMin;
	}

	public void setLNiMin(String lNiMin) {
		this.lNiMin = lNiMin;
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

	public String getLPbMin() {
		return this.lPbMin;
	}

	public void setLPbMin(String lPbMin) {
		this.lPbMin = lPbMin;
	}

	public String getLPhMin() {
		return this.lPhMin;
	}

	public void setLPhMin(String lPhMin) {
		this.lPhMin = lPhMin;
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

	public String getLSalMin() {
		return this.lSalMin;
	}

	public void setLSalMin(String lSalMin) {
		this.lSalMin = lSalMin;
	}

	public String getLSbMin() {
		return this.lSbMin;
	}

	public void setLSbMin(String lSbMin) {
		this.lSbMin = lSbMin;
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

	public String getLTlMin() {
		return this.lTlMin;
	}

	public void setLTlMin(String lTlMin) {
		this.lTlMin = lTlMin;
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

	public String getLTurbMin() {
		return this.lTurbMin;
	}

	public void setLTurbMin(String lTurbMin) {
		this.lTurbMin = lTurbMin;
	}

	public String getLTvsMin() {
		return this.lTvsMin;
	}

	public void setLTvsMin(String lTvsMin) {
		this.lTvsMin = lTvsMin;
	}

	public String getLVMin() {
		return this.lVMin;
	}

	public void setLVMin(String lVMin) {
		this.lVMin = lVMin;
	}

	public String getLZnMin() {
		return this.lZnMin;
	}

	public void setLZnMin(String lZnMin) {
		this.lZnMin = lZnMin;
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