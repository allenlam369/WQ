package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the river_water_med1a database table.
 * 
 */
//@Entity
@Table(name="river_water_med1a")
@NamedQuery(name="RiverWaterMed1a.findAll", query="SELECT r FROM RiverWaterMed1a r")
public class RiverWaterMed1a implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ag_med")
	private BigDecimal agMed;

	@Column(name="al_med")
	private BigDecimal alMed;

	@Column(name="arsenic_med")
	private BigDecimal arsenicMed;

	@Column(name="b_med")
	private BigDecimal bMed;

	@Column(name="ba_med")
	private BigDecimal baMed;

	@Column(name="be_med")
	private BigDecimal beMed;

	@Column(name="bod5_med")
	private BigDecimal bod5Med;

	@Column(name="bod5_pt_med")
	private BigDecimal bod5PtMed;

	@Column(name="cd_med")
	private BigDecimal cdMed;

	@Column(name="chl_med")
	private BigDecimal chlMed;

	@Column(name="cl_med")
	private BigDecimal clMed;

	@Column(name="cod_med")
	private BigDecimal codMed;

	@Column(name="cond_med")
	private BigDecimal condMed;

	@Column(name="cr_med")
	private BigDecimal crMed;

	@Column(name="cu_med")
	private BigDecimal cuMed;

	@Column(name="depth_med")
	private BigDecimal depthMed;

	@Column(name="deterg_med")
	private BigDecimal detergMed;

	@Column(name="do_med")
	private BigDecimal doMed;

	@Column(name="dos_med")
	private BigDecimal dosMed;

	@Column(name="dos_pt_med")
	private BigDecimal dosPtMed;

	@Column(name="ec_avg")
	private BigDecimal ecAvg;

	@Column(name="fc_avg")
	private BigDecimal fcAvg;

	@Column(name="fe_med")
	private BigDecimal feMed;

	@Column(name="fl_med")
	private BigDecimal flMed;

	@Column(name="flow_med")
	private BigDecimal flowMed;

	@Column(name="h2s_med")
	private BigDecimal h2sMed;

	@Column(name="hg_med")
	private BigDecimal hgMed;

	@Column(name="l_ag_med")
	private String lAgMed;

	@Column(name="l_al_med")
	private String lAlMed;

	@Column(name="l_arsenic_med")
	private String lArsenicMed;

	@Column(name="l_b_med")
	private String lBMed;

	@Column(name="l_ba_med")
	private String lBaMed;

	@Column(name="l_be_med")
	private String lBeMed;

	@Column(name="l_bod5_med")
	private String lBod5Med;

	@Column(name="l_cd_med")
	private String lCdMed;

	@Column(name="l_chl_med")
	private String lChlMed;

	@Column(name="l_cl_med")
	private String lClMed;

	@Column(name="l_cod_med")
	private String lCodMed;

	@Column(name="l_cond_med")
	private String lCondMed;

	@Column(name="l_cr_med")
	private String lCrMed;

	@Column(name="l_cu_med")
	private String lCuMed;

	@Column(name="l_deterg_med")
	private String lDetergMed;

	@Column(name="l_do_med")
	private String lDoMed;

	@Column(name="l_dos_med")
	private String lDosMed;

	@Column(name="l_ec_avg")
	private String lEcAvg;

	@Column(name="l_fc_avg")
	private String lFcAvg;

	@Column(name="l_fe_med")
	private String lFeMed;

	@Column(name="l_fl_med")
	private String lFlMed;

	@Column(name="l_h2s_med")
	private String lH2sMed;

	@Column(name="l_hg_med")
	private String lHgMed;

	@Column(name="l_mn_med")
	private String lMnMed;

	@Column(name="l_mo_med")
	private String lMoMed;

	@Column(name="l_nh3_med")
	private String lNh3Med;

	@Column(name="l_nh4_med")
	private String lNh4Med;

	@Column(name="l_ni_med")
	private String lNiMed;

	@Column(name="l_no2_med")
	private String lNo2Med;

	@Column(name="l_no3_med")
	private String lNo3Med;

	@Column(name="l_oil_med")
	private String lOilMed;

	@Column(name="l_pb_med")
	private String lPbMed;

	@Column(name="l_ph_med")
	private String lPhMed;

	@Column(name="l_pheo_med")
	private String lPheoMed;

	@Column(name="l_po4_med")
	private String lPo4Med;

	@Column(name="l_sal_med")
	private String lSalMed;

	@Column(name="l_sb_med")
	private String lSbMed;

	@Column(name="l_sil_med")
	private String lSilMed;

	@Column(name="l_ss_med")
	private String lSsMed;

	@Column(name="l_ssp_med")
	private String lSspMed;

	@Column(name="l_sulp_med")
	private String lSulpMed;

	@Column(name="l_tcyn_med")
	private String lTcynMed;

	@Column(name="l_tin_med")
	private String lTinMed;

	@Column(name="l_tkns_med")
	private String lTknsMed;

	@Column(name="l_tknsp_med")
	private String lTknspMed;

	@Column(name="l_tl_med")
	private String lTlMed;

	@Column(name="l_tn_med")
	private String lTnMed;

	@Column(name="l_toc_med")
	private String lTocMed;

	@Column(name="l_tps_med")
	private String lTpsMed;

	@Column(name="l_tpsp_med")
	private String lTpspMed;

	@Column(name="l_ts_med")
	private String lTsMed;

	@Column(name="l_turb_med")
	private String lTurbMed;

	@Column(name="l_tvs_med")
	private String lTvsMed;

	@Column(name="l_v_med")
	private String lVMed;

	@Column(name="l_zn_med")
	private String lZnMed;

	@Column(name="mn_med")
	private BigDecimal mnMed;

	@Column(name="mo_med")
	private BigDecimal moMed;

	@Column(name="nh3_med")
	private BigDecimal nh3Med;

	@Column(name="nh4_med")
	private BigDecimal nh4Med;

	@Column(name="nh4_pt_med")
	private BigDecimal nh4PtMed;

	@Column(name="ni_med")
	private BigDecimal niMed;

	@Column(name="no2_med")
	private BigDecimal no2Med;

	@Column(name="no3_med")
	private BigDecimal no3Med;

	@Column(name="oil_med")
	private BigDecimal oilMed;

	@Column(name="pb_med")
	private BigDecimal pbMed;

	@Column(name="ph_med")
	private BigDecimal phMed;

	@Column(name="pheo_med")
	private BigDecimal pheoMed;

	@Column(name="po4_med")
	private BigDecimal po4Med;

	private String river;

	@Column(name="sal_med")
	private BigDecimal salMed;

	@Column(name="sb_med")
	private BigDecimal sbMed;

	@Column(name="sil_med")
	private BigDecimal silMed;

	@Column(name="ss_med")
	private BigDecimal ssMed;

	@Column(name="ssp_med")
	private BigDecimal sspMed;

	private String station;

	private String subzone;

	@Column(name="sulp_med")
	private BigDecimal sulpMed;

	@Column(name="tcyn_med")
	private BigDecimal tcynMed;

	@Column(name="temper_med")
	private BigDecimal temperMed;

	@Column(name="tin_med")
	private BigDecimal tinMed;

	@Column(name="tkns_med")
	private BigDecimal tknsMed;

	@Column(name="tknsp_med")
	private BigDecimal tknspMed;

	@Column(name="tl_med")
	private BigDecimal tlMed;

	@Column(name="tn_med")
	private BigDecimal tnMed;

	@Column(name="toc_med")
	private BigDecimal tocMed;

	private Long total;

	@Column(name="tps_med")
	private BigDecimal tpsMed;

	@Column(name="tpsp_med")
	private BigDecimal tpspMed;

	@Column(name="ts_med")
	private BigDecimal tsMed;

	@Column(name="turb_med")
	private BigDecimal turbMed;

	@Column(name="tvs_med")
	private BigDecimal tvsMed;

	@Column(name="v_med")
	private BigDecimal vMed;

	@Column(name="vel_med")
	private BigDecimal velMed;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	@Column(name="width_med")
	private BigDecimal widthMed;

	@Column(name="wqi_grade_med")
	private String wqiGradeMed;

	@Column(name="wqi_pt_med")
	private BigDecimal wqiPtMed;

	private double yr;

	@Column(name="zn_med")
	private BigDecimal znMed;

	private String zone;

	public RiverWaterMed1a() {
	}

	public BigDecimal getAgMed() {
		return this.agMed;
	}

	public void setAgMed(BigDecimal agMed) {
		this.agMed = agMed;
	}

	public BigDecimal getAlMed() {
		return this.alMed;
	}

	public void setAlMed(BigDecimal alMed) {
		this.alMed = alMed;
	}

	public BigDecimal getArsenicMed() {
		return this.arsenicMed;
	}

	public void setArsenicMed(BigDecimal arsenicMed) {
		this.arsenicMed = arsenicMed;
	}

	public BigDecimal getBMed() {
		return this.bMed;
	}

	public void setBMed(BigDecimal bMed) {
		this.bMed = bMed;
	}

	public BigDecimal getBaMed() {
		return this.baMed;
	}

	public void setBaMed(BigDecimal baMed) {
		this.baMed = baMed;
	}

	public BigDecimal getBeMed() {
		return this.beMed;
	}

	public void setBeMed(BigDecimal beMed) {
		this.beMed = beMed;
	}

	public BigDecimal getBod5Med() {
		return this.bod5Med;
	}

	public void setBod5Med(BigDecimal bod5Med) {
		this.bod5Med = bod5Med;
	}

	public BigDecimal getBod5PtMed() {
		return this.bod5PtMed;
	}

	public void setBod5PtMed(BigDecimal bod5PtMed) {
		this.bod5PtMed = bod5PtMed;
	}

	public BigDecimal getCdMed() {
		return this.cdMed;
	}

	public void setCdMed(BigDecimal cdMed) {
		this.cdMed = cdMed;
	}

	public BigDecimal getChlMed() {
		return this.chlMed;
	}

	public void setChlMed(BigDecimal chlMed) {
		this.chlMed = chlMed;
	}

	public BigDecimal getClMed() {
		return this.clMed;
	}

	public void setClMed(BigDecimal clMed) {
		this.clMed = clMed;
	}

	public BigDecimal getCodMed() {
		return this.codMed;
	}

	public void setCodMed(BigDecimal codMed) {
		this.codMed = codMed;
	}

	public BigDecimal getCondMed() {
		return this.condMed;
	}

	public void setCondMed(BigDecimal condMed) {
		this.condMed = condMed;
	}

	public BigDecimal getCrMed() {
		return this.crMed;
	}

	public void setCrMed(BigDecimal crMed) {
		this.crMed = crMed;
	}

	public BigDecimal getCuMed() {
		return this.cuMed;
	}

	public void setCuMed(BigDecimal cuMed) {
		this.cuMed = cuMed;
	}

	public BigDecimal getDepthMed() {
		return this.depthMed;
	}

	public void setDepthMed(BigDecimal depthMed) {
		this.depthMed = depthMed;
	}

	public BigDecimal getDetergMed() {
		return this.detergMed;
	}

	public void setDetergMed(BigDecimal detergMed) {
		this.detergMed = detergMed;
	}

	public BigDecimal getDoMed() {
		return this.doMed;
	}

	public void setDoMed(BigDecimal doMed) {
		this.doMed = doMed;
	}

	public BigDecimal getDosMed() {
		return this.dosMed;
	}

	public void setDosMed(BigDecimal dosMed) {
		this.dosMed = dosMed;
	}

	public BigDecimal getDosPtMed() {
		return this.dosPtMed;
	}

	public void setDosPtMed(BigDecimal dosPtMed) {
		this.dosPtMed = dosPtMed;
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

	public BigDecimal getFeMed() {
		return this.feMed;
	}

	public void setFeMed(BigDecimal feMed) {
		this.feMed = feMed;
	}

	public BigDecimal getFlMed() {
		return this.flMed;
	}

	public void setFlMed(BigDecimal flMed) {
		this.flMed = flMed;
	}

	public BigDecimal getFlowMed() {
		return this.flowMed;
	}

	public void setFlowMed(BigDecimal flowMed) {
		this.flowMed = flowMed;
	}

	public BigDecimal getH2sMed() {
		return this.h2sMed;
	}

	public void setH2sMed(BigDecimal h2sMed) {
		this.h2sMed = h2sMed;
	}

	public BigDecimal getHgMed() {
		return this.hgMed;
	}

	public void setHgMed(BigDecimal hgMed) {
		this.hgMed = hgMed;
	}

	public String getLAgMed() {
		return this.lAgMed;
	}

	public void setLAgMed(String lAgMed) {
		this.lAgMed = lAgMed;
	}

	public String getLAlMed() {
		return this.lAlMed;
	}

	public void setLAlMed(String lAlMed) {
		this.lAlMed = lAlMed;
	}

	public String getLArsenicMed() {
		return this.lArsenicMed;
	}

	public void setLArsenicMed(String lArsenicMed) {
		this.lArsenicMed = lArsenicMed;
	}

	public String getLBMed() {
		return this.lBMed;
	}

	public void setLBMed(String lBMed) {
		this.lBMed = lBMed;
	}

	public String getLBaMed() {
		return this.lBaMed;
	}

	public void setLBaMed(String lBaMed) {
		this.lBaMed = lBaMed;
	}

	public String getLBeMed() {
		return this.lBeMed;
	}

	public void setLBeMed(String lBeMed) {
		this.lBeMed = lBeMed;
	}

	public String getLBod5Med() {
		return this.lBod5Med;
	}

	public void setLBod5Med(String lBod5Med) {
		this.lBod5Med = lBod5Med;
	}

	public String getLCdMed() {
		return this.lCdMed;
	}

	public void setLCdMed(String lCdMed) {
		this.lCdMed = lCdMed;
	}

	public String getLChlMed() {
		return this.lChlMed;
	}

	public void setLChlMed(String lChlMed) {
		this.lChlMed = lChlMed;
	}

	public String getLClMed() {
		return this.lClMed;
	}

	public void setLClMed(String lClMed) {
		this.lClMed = lClMed;
	}

	public String getLCodMed() {
		return this.lCodMed;
	}

	public void setLCodMed(String lCodMed) {
		this.lCodMed = lCodMed;
	}

	public String getLCondMed() {
		return this.lCondMed;
	}

	public void setLCondMed(String lCondMed) {
		this.lCondMed = lCondMed;
	}

	public String getLCrMed() {
		return this.lCrMed;
	}

	public void setLCrMed(String lCrMed) {
		this.lCrMed = lCrMed;
	}

	public String getLCuMed() {
		return this.lCuMed;
	}

	public void setLCuMed(String lCuMed) {
		this.lCuMed = lCuMed;
	}

	public String getLDetergMed() {
		return this.lDetergMed;
	}

	public void setLDetergMed(String lDetergMed) {
		this.lDetergMed = lDetergMed;
	}

	public String getLDoMed() {
		return this.lDoMed;
	}

	public void setLDoMed(String lDoMed) {
		this.lDoMed = lDoMed;
	}

	public String getLDosMed() {
		return this.lDosMed;
	}

	public void setLDosMed(String lDosMed) {
		this.lDosMed = lDosMed;
	}

	public String getLEcAvg() {
		return this.lEcAvg;
	}

	public void setLEcAvg(String lEcAvg) {
		this.lEcAvg = lEcAvg;
	}

	public String getLFcAvg() {
		return this.lFcAvg;
	}

	public void setLFcAvg(String lFcAvg) {
		this.lFcAvg = lFcAvg;
	}

	public String getLFeMed() {
		return this.lFeMed;
	}

	public void setLFeMed(String lFeMed) {
		this.lFeMed = lFeMed;
	}

	public String getLFlMed() {
		return this.lFlMed;
	}

	public void setLFlMed(String lFlMed) {
		this.lFlMed = lFlMed;
	}

	public String getLH2sMed() {
		return this.lH2sMed;
	}

	public void setLH2sMed(String lH2sMed) {
		this.lH2sMed = lH2sMed;
	}

	public String getLHgMed() {
		return this.lHgMed;
	}

	public void setLHgMed(String lHgMed) {
		this.lHgMed = lHgMed;
	}

	public String getLMnMed() {
		return this.lMnMed;
	}

	public void setLMnMed(String lMnMed) {
		this.lMnMed = lMnMed;
	}

	public String getLMoMed() {
		return this.lMoMed;
	}

	public void setLMoMed(String lMoMed) {
		this.lMoMed = lMoMed;
	}

	public String getLNh3Med() {
		return this.lNh3Med;
	}

	public void setLNh3Med(String lNh3Med) {
		this.lNh3Med = lNh3Med;
	}

	public String getLNh4Med() {
		return this.lNh4Med;
	}

	public void setLNh4Med(String lNh4Med) {
		this.lNh4Med = lNh4Med;
	}

	public String getLNiMed() {
		return this.lNiMed;
	}

	public void setLNiMed(String lNiMed) {
		this.lNiMed = lNiMed;
	}

	public String getLNo2Med() {
		return this.lNo2Med;
	}

	public void setLNo2Med(String lNo2Med) {
		this.lNo2Med = lNo2Med;
	}

	public String getLNo3Med() {
		return this.lNo3Med;
	}

	public void setLNo3Med(String lNo3Med) {
		this.lNo3Med = lNo3Med;
	}

	public String getLOilMed() {
		return this.lOilMed;
	}

	public void setLOilMed(String lOilMed) {
		this.lOilMed = lOilMed;
	}

	public String getLPbMed() {
		return this.lPbMed;
	}

	public void setLPbMed(String lPbMed) {
		this.lPbMed = lPbMed;
	}

	public String getLPhMed() {
		return this.lPhMed;
	}

	public void setLPhMed(String lPhMed) {
		this.lPhMed = lPhMed;
	}

	public String getLPheoMed() {
		return this.lPheoMed;
	}

	public void setLPheoMed(String lPheoMed) {
		this.lPheoMed = lPheoMed;
	}

	public String getLPo4Med() {
		return this.lPo4Med;
	}

	public void setLPo4Med(String lPo4Med) {
		this.lPo4Med = lPo4Med;
	}

	public String getLSalMed() {
		return this.lSalMed;
	}

	public void setLSalMed(String lSalMed) {
		this.lSalMed = lSalMed;
	}

	public String getLSbMed() {
		return this.lSbMed;
	}

	public void setLSbMed(String lSbMed) {
		this.lSbMed = lSbMed;
	}

	public String getLSilMed() {
		return this.lSilMed;
	}

	public void setLSilMed(String lSilMed) {
		this.lSilMed = lSilMed;
	}

	public String getLSsMed() {
		return this.lSsMed;
	}

	public void setLSsMed(String lSsMed) {
		this.lSsMed = lSsMed;
	}

	public String getLSspMed() {
		return this.lSspMed;
	}

	public void setLSspMed(String lSspMed) {
		this.lSspMed = lSspMed;
	}

	public String getLSulpMed() {
		return this.lSulpMed;
	}

	public void setLSulpMed(String lSulpMed) {
		this.lSulpMed = lSulpMed;
	}

	public String getLTcynMed() {
		return this.lTcynMed;
	}

	public void setLTcynMed(String lTcynMed) {
		this.lTcynMed = lTcynMed;
	}

	public String getLTinMed() {
		return this.lTinMed;
	}

	public void setLTinMed(String lTinMed) {
		this.lTinMed = lTinMed;
	}

	public String getLTknsMed() {
		return this.lTknsMed;
	}

	public void setLTknsMed(String lTknsMed) {
		this.lTknsMed = lTknsMed;
	}

	public String getLTknspMed() {
		return this.lTknspMed;
	}

	public void setLTknspMed(String lTknspMed) {
		this.lTknspMed = lTknspMed;
	}

	public String getLTlMed() {
		return this.lTlMed;
	}

	public void setLTlMed(String lTlMed) {
		this.lTlMed = lTlMed;
	}

	public String getLTnMed() {
		return this.lTnMed;
	}

	public void setLTnMed(String lTnMed) {
		this.lTnMed = lTnMed;
	}

	public String getLTocMed() {
		return this.lTocMed;
	}

	public void setLTocMed(String lTocMed) {
		this.lTocMed = lTocMed;
	}

	public String getLTpsMed() {
		return this.lTpsMed;
	}

	public void setLTpsMed(String lTpsMed) {
		this.lTpsMed = lTpsMed;
	}

	public String getLTpspMed() {
		return this.lTpspMed;
	}

	public void setLTpspMed(String lTpspMed) {
		this.lTpspMed = lTpspMed;
	}

	public String getLTsMed() {
		return this.lTsMed;
	}

	public void setLTsMed(String lTsMed) {
		this.lTsMed = lTsMed;
	}

	public String getLTurbMed() {
		return this.lTurbMed;
	}

	public void setLTurbMed(String lTurbMed) {
		this.lTurbMed = lTurbMed;
	}

	public String getLTvsMed() {
		return this.lTvsMed;
	}

	public void setLTvsMed(String lTvsMed) {
		this.lTvsMed = lTvsMed;
	}

	public String getLVMed() {
		return this.lVMed;
	}

	public void setLVMed(String lVMed) {
		this.lVMed = lVMed;
	}

	public String getLZnMed() {
		return this.lZnMed;
	}

	public void setLZnMed(String lZnMed) {
		this.lZnMed = lZnMed;
	}

	public BigDecimal getMnMed() {
		return this.mnMed;
	}

	public void setMnMed(BigDecimal mnMed) {
		this.mnMed = mnMed;
	}

	public BigDecimal getMoMed() {
		return this.moMed;
	}

	public void setMoMed(BigDecimal moMed) {
		this.moMed = moMed;
	}

	public BigDecimal getNh3Med() {
		return this.nh3Med;
	}

	public void setNh3Med(BigDecimal nh3Med) {
		this.nh3Med = nh3Med;
	}

	public BigDecimal getNh4Med() {
		return this.nh4Med;
	}

	public void setNh4Med(BigDecimal nh4Med) {
		this.nh4Med = nh4Med;
	}

	public BigDecimal getNh4PtMed() {
		return this.nh4PtMed;
	}

	public void setNh4PtMed(BigDecimal nh4PtMed) {
		this.nh4PtMed = nh4PtMed;
	}

	public BigDecimal getNiMed() {
		return this.niMed;
	}

	public void setNiMed(BigDecimal niMed) {
		this.niMed = niMed;
	}

	public BigDecimal getNo2Med() {
		return this.no2Med;
	}

	public void setNo2Med(BigDecimal no2Med) {
		this.no2Med = no2Med;
	}

	public BigDecimal getNo3Med() {
		return this.no3Med;
	}

	public void setNo3Med(BigDecimal no3Med) {
		this.no3Med = no3Med;
	}

	public BigDecimal getOilMed() {
		return this.oilMed;
	}

	public void setOilMed(BigDecimal oilMed) {
		this.oilMed = oilMed;
	}

	public BigDecimal getPbMed() {
		return this.pbMed;
	}

	public void setPbMed(BigDecimal pbMed) {
		this.pbMed = pbMed;
	}

	public BigDecimal getPhMed() {
		return this.phMed;
	}

	public void setPhMed(BigDecimal phMed) {
		this.phMed = phMed;
	}

	public BigDecimal getPheoMed() {
		return this.pheoMed;
	}

	public void setPheoMed(BigDecimal pheoMed) {
		this.pheoMed = pheoMed;
	}

	public BigDecimal getPo4Med() {
		return this.po4Med;
	}

	public void setPo4Med(BigDecimal po4Med) {
		this.po4Med = po4Med;
	}

	public String getRiver() {
		return this.river;
	}

	public void setRiver(String river) {
		this.river = river;
	}

	public BigDecimal getSalMed() {
		return this.salMed;
	}

	public void setSalMed(BigDecimal salMed) {
		this.salMed = salMed;
	}

	public BigDecimal getSbMed() {
		return this.sbMed;
	}

	public void setSbMed(BigDecimal sbMed) {
		this.sbMed = sbMed;
	}

	public BigDecimal getSilMed() {
		return this.silMed;
	}

	public void setSilMed(BigDecimal silMed) {
		this.silMed = silMed;
	}

	public BigDecimal getSsMed() {
		return this.ssMed;
	}

	public void setSsMed(BigDecimal ssMed) {
		this.ssMed = ssMed;
	}

	public BigDecimal getSspMed() {
		return this.sspMed;
	}

	public void setSspMed(BigDecimal sspMed) {
		this.sspMed = sspMed;
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

	public BigDecimal getSulpMed() {
		return this.sulpMed;
	}

	public void setSulpMed(BigDecimal sulpMed) {
		this.sulpMed = sulpMed;
	}

	public BigDecimal getTcynMed() {
		return this.tcynMed;
	}

	public void setTcynMed(BigDecimal tcynMed) {
		this.tcynMed = tcynMed;
	}

	public BigDecimal getTemperMed() {
		return this.temperMed;
	}

	public void setTemperMed(BigDecimal temperMed) {
		this.temperMed = temperMed;
	}

	public BigDecimal getTinMed() {
		return this.tinMed;
	}

	public void setTinMed(BigDecimal tinMed) {
		this.tinMed = tinMed;
	}

	public BigDecimal getTknsMed() {
		return this.tknsMed;
	}

	public void setTknsMed(BigDecimal tknsMed) {
		this.tknsMed = tknsMed;
	}

	public BigDecimal getTknspMed() {
		return this.tknspMed;
	}

	public void setTknspMed(BigDecimal tknspMed) {
		this.tknspMed = tknspMed;
	}

	public BigDecimal getTlMed() {
		return this.tlMed;
	}

	public void setTlMed(BigDecimal tlMed) {
		this.tlMed = tlMed;
	}

	public BigDecimal getTnMed() {
		return this.tnMed;
	}

	public void setTnMed(BigDecimal tnMed) {
		this.tnMed = tnMed;
	}

	public BigDecimal getTocMed() {
		return this.tocMed;
	}

	public void setTocMed(BigDecimal tocMed) {
		this.tocMed = tocMed;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public BigDecimal getTpsMed() {
		return this.tpsMed;
	}

	public void setTpsMed(BigDecimal tpsMed) {
		this.tpsMed = tpsMed;
	}

	public BigDecimal getTpspMed() {
		return this.tpspMed;
	}

	public void setTpspMed(BigDecimal tpspMed) {
		this.tpspMed = tpspMed;
	}

	public BigDecimal getTsMed() {
		return this.tsMed;
	}

	public void setTsMed(BigDecimal tsMed) {
		this.tsMed = tsMed;
	}

	public BigDecimal getTurbMed() {
		return this.turbMed;
	}

	public void setTurbMed(BigDecimal turbMed) {
		this.turbMed = turbMed;
	}

	public BigDecimal getTvsMed() {
		return this.tvsMed;
	}

	public void setTvsMed(BigDecimal tvsMed) {
		this.tvsMed = tvsMed;
	}

	public BigDecimal getVMed() {
		return this.vMed;
	}

	public void setVMed(BigDecimal vMed) {
		this.vMed = vMed;
	}

	public BigDecimal getVelMed() {
		return this.velMed;
	}

	public void setVelMed(BigDecimal velMed) {
		this.velMed = velMed;
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

	public BigDecimal getWidthMed() {
		return this.widthMed;
	}

	public void setWidthMed(BigDecimal widthMed) {
		this.widthMed = widthMed;
	}

	public String getWqiGradeMed() {
		return this.wqiGradeMed;
	}

	public void setWqiGradeMed(String wqiGradeMed) {
		this.wqiGradeMed = wqiGradeMed;
	}

	public BigDecimal getWqiPtMed() {
		return this.wqiPtMed;
	}

	public void setWqiPtMed(BigDecimal wqiPtMed) {
		this.wqiPtMed = wqiPtMed;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

	public BigDecimal getZnMed() {
		return this.znMed;
	}

	public void setZnMed(BigDecimal znMed) {
		this.znMed = znMed;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}