package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the river_water_summary1 database table.
 * 
 */
//@Entity
@Table(name="river_water_summary1")
@NamedQuery(name="RiverWaterSummary1.findAll", query="SELECT r FROM RiverWaterSummary1 r")
public class RiverWaterSummary1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ag_max")
	private BigDecimal agMax;

	@Column(name="ag_med")
	private BigDecimal agMed;

	@Column(name="ag_min")
	private BigDecimal agMin;

	@Column(name="al_max")
	private BigDecimal alMax;

	@Column(name="al_med")
	private BigDecimal alMed;

	@Column(name="al_min")
	private BigDecimal alMin;

	@Column(name="arsenic_max")
	private BigDecimal arsenicMax;

	@Column(name="arsenic_med")
	private BigDecimal arsenicMed;

	@Column(name="arsenic_min")
	private BigDecimal arsenicMin;

	@Column(name="b_max")
	private BigDecimal bMax;

	@Column(name="b_med")
	private BigDecimal bMed;

	@Column(name="b_min")
	private BigDecimal bMin;

	@Column(name="ba_max")
	private BigDecimal baMax;

	@Column(name="ba_med")
	private BigDecimal baMed;

	@Column(name="ba_min")
	private BigDecimal baMin;

	@Column(name="be_max")
	private BigDecimal beMax;

	@Column(name="be_med")
	private BigDecimal beMed;

	@Column(name="be_min")
	private BigDecimal beMin;

	@Column(name="bod5_max")
	private BigDecimal bod5Max;

	@Column(name="bod5_med")
	private BigDecimal bod5Med;

	@Column(name="bod5_min")
	private BigDecimal bod5Min;

	@Column(name="bod5_pt_max")
	private BigDecimal bod5PtMax;

	@Column(name="bod5_pt_med")
	private BigDecimal bod5PtMed;

	@Column(name="bod5_pt_min")
	private BigDecimal bod5PtMin;

	@Column(name="cd_max")
	private BigDecimal cdMax;

	@Column(name="cd_med")
	private BigDecimal cdMed;

	@Column(name="cd_min")
	private BigDecimal cdMin;

	@Column(name="chl_max")
	private BigDecimal chlMax;

	@Column(name="chl_med")
	private BigDecimal chlMed;

	@Column(name="chl_min")
	private BigDecimal chlMin;

	@Column(name="cl_max")
	private BigDecimal clMax;

	@Column(name="cl_med")
	private BigDecimal clMed;

	@Column(name="cl_min")
	private BigDecimal clMin;

	@Column(name="cod_max")
	private BigDecimal codMax;

	@Column(name="cod_med")
	private BigDecimal codMed;

	@Column(name="cod_min")
	private BigDecimal codMin;

	@Column(name="cond_max")
	private BigDecimal condMax;

	@Column(name="cond_med")
	private BigDecimal condMed;

	@Column(name="cond_min")
	private BigDecimal condMin;

	@Column(name="cr_max")
	private BigDecimal crMax;

	@Column(name="cr_med")
	private BigDecimal crMed;

	@Column(name="cr_min")
	private BigDecimal crMin;

	@Column(name="cu_max")
	private BigDecimal cuMax;

	@Column(name="cu_med")
	private BigDecimal cuMed;

	@Column(name="cu_min")
	private BigDecimal cuMin;

	@Column(name="depth_max")
	private BigDecimal depthMax;

	@Column(name="depth_med")
	private BigDecimal depthMed;

	@Column(name="depth_min")
	private BigDecimal depthMin;

	@Column(name="deterg_max")
	private BigDecimal detergMax;

	@Column(name="deterg_med")
	private BigDecimal detergMed;

	@Column(name="deterg_min")
	private BigDecimal detergMin;

	@Column(name="do_max")
	private BigDecimal doMax;

	@Column(name="do_med")
	private BigDecimal doMed;

	@Column(name="do_min")
	private BigDecimal doMin;

	@Column(name="dos_max")
	private BigDecimal dosMax;

	@Column(name="dos_med")
	private BigDecimal dosMed;

	@Column(name="dos_min")
	private BigDecimal dosMin;

	@Column(name="dos_pt_max")
	private BigDecimal dosPtMax;

	@Column(name="dos_pt_med")
	private BigDecimal dosPtMed;

	@Column(name="dos_pt_min")
	private BigDecimal dosPtMin;

	@Column(name="ec_avg")
	private BigDecimal ecAvg;

	@Column(name="ec_max")
	private BigDecimal ecMax;

	@Column(name="ec_min")
	private BigDecimal ecMin;

	@Column(name="fc_avg")
	private BigDecimal fcAvg;

	@Column(name="fc_max")
	private BigDecimal fcMax;

	@Column(name="fc_min")
	private BigDecimal fcMin;

	@Column(name="fe_max")
	private BigDecimal feMax;

	@Column(name="fe_med")
	private BigDecimal feMed;

	@Column(name="fe_min")
	private BigDecimal feMin;

	@Column(name="fl_max")
	private BigDecimal flMax;

	@Column(name="fl_med")
	private BigDecimal flMed;

	@Column(name="fl_min")
	private BigDecimal flMin;

	@Column(name="flow_max")
	private BigDecimal flowMax;

	@Column(name="flow_med")
	private BigDecimal flowMed;

	@Column(name="flow_min")
	private BigDecimal flowMin;

	@Column(name="h2s_max")
	private BigDecimal h2sMax;

	@Column(name="h2s_med")
	private BigDecimal h2sMed;

	@Column(name="h2s_min")
	private BigDecimal h2sMin;

	@Column(name="hg_max")
	private BigDecimal hgMax;

	@Column(name="hg_med")
	private BigDecimal hgMed;

	@Column(name="hg_min")
	private BigDecimal hgMin;

	@Column(name="l_ag_max")
	private String lAgMax;

	@Column(name="l_ag_med")
	private String lAgMed;

	@Column(name="l_ag_min")
	private String lAgMin;

	@Column(name="l_al_max")
	private String lAlMax;

	@Column(name="l_al_med")
	private String lAlMed;

	@Column(name="l_al_min")
	private String lAlMin;

	@Column(name="l_arsenic_max")
	private String lArsenicMax;

	@Column(name="l_arsenic_med")
	private String lArsenicMed;

	@Column(name="l_arsenic_min")
	private String lArsenicMin;

	@Column(name="l_b_max")
	private String lBMax;

	@Column(name="l_b_med")
	private String lBMed;

	@Column(name="l_b_min")
	private String lBMin;

	@Column(name="l_ba_max")
	private String lBaMax;

	@Column(name="l_ba_med")
	private String lBaMed;

	@Column(name="l_ba_min")
	private String lBaMin;

	@Column(name="l_be_max")
	private String lBeMax;

	@Column(name="l_be_med")
	private String lBeMed;

	@Column(name="l_be_min")
	private String lBeMin;

	@Column(name="l_bod5_max")
	private String lBod5Max;

	@Column(name="l_bod5_med")
	private String lBod5Med;

	@Column(name="l_bod5_min")
	private String lBod5Min;

	@Column(name="l_cd_max")
	private String lCdMax;

	@Column(name="l_cd_med")
	private String lCdMed;

	@Column(name="l_cd_min")
	private String lCdMin;

	@Column(name="l_chl_max")
	private String lChlMax;

	@Column(name="l_chl_med")
	private String lChlMed;

	@Column(name="l_chl_min")
	private String lChlMin;

	@Column(name="l_cl_max")
	private String lClMax;

	@Column(name="l_cl_med")
	private String lClMed;

	@Column(name="l_cl_min")
	private String lClMin;

	@Column(name="l_cod_max")
	private String lCodMax;

	@Column(name="l_cod_med")
	private String lCodMed;

	@Column(name="l_cod_min")
	private String lCodMin;

	@Column(name="l_cond_max")
	private String lCondMax;

	@Column(name="l_cond_med")
	private String lCondMed;

	@Column(name="l_cond_min")
	private String lCondMin;

	@Column(name="l_cr_max")
	private String lCrMax;

	@Column(name="l_cr_med")
	private String lCrMed;

	@Column(name="l_cr_min")
	private String lCrMin;

	@Column(name="l_cu_max")
	private String lCuMax;

	@Column(name="l_cu_med")
	private String lCuMed;

	@Column(name="l_cu_min")
	private String lCuMin;

	@Column(name="l_deterg_max")
	private String lDetergMax;

	@Column(name="l_deterg_med")
	private String lDetergMed;

	@Column(name="l_deterg_min")
	private String lDetergMin;

	@Column(name="l_do_max")
	private String lDoMax;

	@Column(name="l_do_med")
	private String lDoMed;

	@Column(name="l_do_min")
	private String lDoMin;

	@Column(name="l_dos_max")
	private String lDosMax;

	@Column(name="l_dos_med")
	private String lDosMed;

	@Column(name="l_dos_min")
	private String lDosMin;

	@Column(name="l_ec_avg")
	private String lEcAvg;

	@Column(name="l_ec_max")
	private String lEcMax;

	@Column(name="l_ec_min")
	private String lEcMin;

	@Column(name="l_fc_avg")
	private String lFcAvg;

	@Column(name="l_fc_max")
	private String lFcMax;

	@Column(name="l_fc_min")
	private String lFcMin;

	@Column(name="l_fe_max")
	private String lFeMax;

	@Column(name="l_fe_med")
	private String lFeMed;

	@Column(name="l_fe_min")
	private String lFeMin;

	@Column(name="l_fl_max")
	private String lFlMax;

	@Column(name="l_fl_med")
	private String lFlMed;

	@Column(name="l_fl_min")
	private String lFlMin;

	@Column(name="l_h2s_max")
	private String lH2sMax;

	@Column(name="l_h2s_med")
	private String lH2sMed;

	@Column(name="l_h2s_min")
	private String lH2sMin;

	@Column(name="l_hg_max")
	private String lHgMax;

	@Column(name="l_hg_med")
	private String lHgMed;

	@Column(name="l_hg_min")
	private String lHgMin;

	@Column(name="l_mn_max")
	private String lMnMax;

	@Column(name="l_mn_med")
	private String lMnMed;

	@Column(name="l_mn_min")
	private String lMnMin;

	@Column(name="l_mo_max")
	private String lMoMax;

	@Column(name="l_mo_med")
	private String lMoMed;

	@Column(name="l_mo_min")
	private String lMoMin;

	@Column(name="l_nh3_max")
	private String lNh3Max;

	@Column(name="l_nh3_med")
	private String lNh3Med;

	@Column(name="l_nh3_min")
	private String lNh3Min;

	@Column(name="l_nh4_max")
	private String lNh4Max;

	@Column(name="l_nh4_med")
	private String lNh4Med;

	@Column(name="l_nh4_min")
	private String lNh4Min;

	@Column(name="l_ni_max")
	private String lNiMax;

	@Column(name="l_ni_med")
	private String lNiMed;

	@Column(name="l_ni_min")
	private String lNiMin;

	@Column(name="l_no2_max")
	private String lNo2Max;

	@Column(name="l_no2_med")
	private String lNo2Med;

	@Column(name="l_no2_min")
	private String lNo2Min;

	@Column(name="l_no3_max")
	private String lNo3Max;

	@Column(name="l_no3_med")
	private String lNo3Med;

	@Column(name="l_no3_min")
	private String lNo3Min;

	@Column(name="l_oil_max")
	private String lOilMax;

	@Column(name="l_oil_med")
	private String lOilMed;

	@Column(name="l_oil_min")
	private String lOilMin;

	@Column(name="l_pb_max")
	private String lPbMax;

	@Column(name="l_pb_med")
	private String lPbMed;

	@Column(name="l_pb_min")
	private String lPbMin;

	@Column(name="l_ph_max")
	private String lPhMax;

	@Column(name="l_ph_med")
	private String lPhMed;

	@Column(name="l_ph_min")
	private String lPhMin;

	@Column(name="l_pheo_max")
	private String lPheoMax;

	@Column(name="l_pheo_med")
	private String lPheoMed;

	@Column(name="l_pheo_min")
	private String lPheoMin;

	@Column(name="l_po4_max")
	private String lPo4Max;

	@Column(name="l_po4_med")
	private String lPo4Med;

	@Column(name="l_po4_min")
	private String lPo4Min;

	@Column(name="l_sal_max")
	private String lSalMax;

	@Column(name="l_sal_med")
	private String lSalMed;

	@Column(name="l_sal_min")
	private String lSalMin;

	@Column(name="l_sb_max")
	private String lSbMax;

	@Column(name="l_sb_med")
	private String lSbMed;

	@Column(name="l_sb_min")
	private String lSbMin;

	@Column(name="l_sil_max")
	private String lSilMax;

	@Column(name="l_sil_med")
	private String lSilMed;

	@Column(name="l_sil_min")
	private String lSilMin;

	@Column(name="l_ss_max")
	private String lSsMax;

	@Column(name="l_ss_med")
	private String lSsMed;

	@Column(name="l_ss_min")
	private String lSsMin;

	@Column(name="l_ssp_max")
	private String lSspMax;

	@Column(name="l_ssp_med")
	private String lSspMed;

	@Column(name="l_ssp_min")
	private String lSspMin;

	@Column(name="l_sulp_max")
	private String lSulpMax;

	@Column(name="l_sulp_med")
	private String lSulpMed;

	@Column(name="l_sulp_min")
	private String lSulpMin;

	@Column(name="l_tcyn_max")
	private String lTcynMax;

	@Column(name="l_tcyn_med")
	private String lTcynMed;

	@Column(name="l_tcyn_min")
	private String lTcynMin;

	@Column(name="l_tin_max")
	private String lTinMax;

	@Column(name="l_tin_med")
	private String lTinMed;

	@Column(name="l_tin_min")
	private String lTinMin;

	@Column(name="l_tkns_max")
	private String lTknsMax;

	@Column(name="l_tkns_med")
	private String lTknsMed;

	@Column(name="l_tkns_min")
	private String lTknsMin;

	@Column(name="l_tknsp_max")
	private String lTknspMax;

	@Column(name="l_tknsp_med")
	private String lTknspMed;

	@Column(name="l_tknsp_min")
	private String lTknspMin;

	@Column(name="l_tl_max")
	private String lTlMax;

	@Column(name="l_tl_med")
	private String lTlMed;

	@Column(name="l_tl_min")
	private String lTlMin;

	@Column(name="l_tn_max")
	private String lTnMax;

	@Column(name="l_tn_med")
	private String lTnMed;

	@Column(name="l_tn_min")
	private String lTnMin;

	@Column(name="l_toc_max")
	private String lTocMax;

	@Column(name="l_toc_med")
	private String lTocMed;

	@Column(name="l_toc_min")
	private String lTocMin;

	@Column(name="l_tps_max")
	private String lTpsMax;

	@Column(name="l_tps_med")
	private String lTpsMed;

	@Column(name="l_tps_min")
	private String lTpsMin;

	@Column(name="l_tpsp_max")
	private String lTpspMax;

	@Column(name="l_tpsp_med")
	private String lTpspMed;

	@Column(name="l_tpsp_min")
	private String lTpspMin;

	@Column(name="l_ts_max")
	private String lTsMax;

	@Column(name="l_ts_med")
	private String lTsMed;

	@Column(name="l_ts_min")
	private String lTsMin;

	@Column(name="l_turb_max")
	private String lTurbMax;

	@Column(name="l_turb_med")
	private String lTurbMed;

	@Column(name="l_turb_min")
	private String lTurbMin;

	@Column(name="l_tvs_max")
	private String lTvsMax;

	@Column(name="l_tvs_med")
	private String lTvsMed;

	@Column(name="l_tvs_min")
	private String lTvsMin;

	@Column(name="l_v_max")
	private String lVMax;

	@Column(name="l_v_med")
	private String lVMed;

	@Column(name="l_v_min")
	private String lVMin;

	@Column(name="l_zn_max")
	private String lZnMax;

	@Column(name="l_zn_med")
	private String lZnMed;

	@Column(name="l_zn_min")
	private String lZnMin;

	@Column(name="mn_max")
	private BigDecimal mnMax;

	@Column(name="mn_med")
	private BigDecimal mnMed;

	@Column(name="mn_min")
	private BigDecimal mnMin;

	@Column(name="mo_max")
	private BigDecimal moMax;

	@Column(name="mo_med")
	private BigDecimal moMed;

	@Column(name="mo_min")
	private BigDecimal moMin;

	@Column(name="nh3_max")
	private BigDecimal nh3Max;

	@Column(name="nh3_med")
	private BigDecimal nh3Med;

	@Column(name="nh3_min")
	private BigDecimal nh3Min;

	@Column(name="nh4_max")
	private BigDecimal nh4Max;

	@Column(name="nh4_med")
	private BigDecimal nh4Med;

	@Column(name="nh4_min")
	private BigDecimal nh4Min;

	@Column(name="nh4_pt_max")
	private BigDecimal nh4PtMax;

	@Column(name="nh4_pt_med")
	private BigDecimal nh4PtMed;

	@Column(name="nh4_pt_min")
	private BigDecimal nh4PtMin;

	@Column(name="ni_max")
	private BigDecimal niMax;

	@Column(name="ni_med")
	private BigDecimal niMed;

	@Column(name="ni_min")
	private BigDecimal niMin;

	@Column(name="no2_max")
	private BigDecimal no2Max;

	@Column(name="no2_med")
	private BigDecimal no2Med;

	@Column(name="no2_min")
	private BigDecimal no2Min;

	@Column(name="no3_max")
	private BigDecimal no3Max;

	@Column(name="no3_med")
	private BigDecimal no3Med;

	@Column(name="no3_min")
	private BigDecimal no3Min;

	@Column(name="oil_max")
	private BigDecimal oilMax;

	@Column(name="oil_med")
	private BigDecimal oilMed;

	@Column(name="oil_min")
	private BigDecimal oilMin;

	@Column(name="pb_max")
	private BigDecimal pbMax;

	@Column(name="pb_med")
	private BigDecimal pbMed;

	@Column(name="pb_min")
	private BigDecimal pbMin;

	@Column(name="ph_max")
	private BigDecimal phMax;

	@Column(name="ph_med")
	private BigDecimal phMed;

	@Column(name="ph_min")
	private BigDecimal phMin;

	@Column(name="pheo_max")
	private BigDecimal pheoMax;

	@Column(name="pheo_med")
	private BigDecimal pheoMed;

	@Column(name="pheo_min")
	private BigDecimal pheoMin;

	@Column(name="po4_max")
	private BigDecimal po4Max;

	@Column(name="po4_med")
	private BigDecimal po4Med;

	@Column(name="po4_min")
	private BigDecimal po4Min;

	private String river;

	@Column(name="sal_max")
	private BigDecimal salMax;

	@Column(name="sal_med")
	private BigDecimal salMed;

	@Column(name="sal_min")
	private BigDecimal salMin;

	@Column(name="sb_max")
	private BigDecimal sbMax;

	@Column(name="sb_med")
	private BigDecimal sbMed;

	@Column(name="sb_min")
	private BigDecimal sbMin;

	@Column(name="sil_max")
	private BigDecimal silMax;

	@Column(name="sil_med")
	private BigDecimal silMed;

	@Column(name="sil_min")
	private BigDecimal silMin;

	@Column(name="ss_max")
	private BigDecimal ssMax;

	@Column(name="ss_med")
	private BigDecimal ssMed;

	@Column(name="ss_min")
	private BigDecimal ssMin;

	@Column(name="ssp_max")
	private BigDecimal sspMax;

	@Column(name="ssp_med")
	private BigDecimal sspMed;

	@Column(name="ssp_min")
	private BigDecimal sspMin;

	private String station;

	private String subzone;

	@Column(name="sulp_max")
	private BigDecimal sulpMax;

	@Column(name="sulp_med")
	private BigDecimal sulpMed;

	@Column(name="sulp_min")
	private BigDecimal sulpMin;

	@Column(name="tcyn_max")
	private BigDecimal tcynMax;

	@Column(name="tcyn_med")
	private BigDecimal tcynMed;

	@Column(name="tcyn_min")
	private BigDecimal tcynMin;

	@Column(name="temper_max")
	private BigDecimal temperMax;

	@Column(name="temper_med")
	private BigDecimal temperMed;

	@Column(name="temper_min")
	private BigDecimal temperMin;

	@Column(name="tin_max")
	private BigDecimal tinMax;

	@Column(name="tin_med")
	private BigDecimal tinMed;

	@Column(name="tin_min")
	private BigDecimal tinMin;

	@Column(name="tkns_max")
	private BigDecimal tknsMax;

	@Column(name="tkns_med")
	private BigDecimal tknsMed;

	@Column(name="tkns_min")
	private BigDecimal tknsMin;

	@Column(name="tknsp_max")
	private BigDecimal tknspMax;

	@Column(name="tknsp_med")
	private BigDecimal tknspMed;

	@Column(name="tknsp_min")
	private BigDecimal tknspMin;

	@Column(name="tl_max")
	private BigDecimal tlMax;

	@Column(name="tl_med")
	private BigDecimal tlMed;

	@Column(name="tl_min")
	private BigDecimal tlMin;

	@Column(name="tn_max")
	private BigDecimal tnMax;

	@Column(name="tn_med")
	private BigDecimal tnMed;

	@Column(name="tn_min")
	private BigDecimal tnMin;

	@Column(name="toc_max")
	private BigDecimal tocMax;

	@Column(name="toc_med")
	private BigDecimal tocMed;

	@Column(name="toc_min")
	private BigDecimal tocMin;

	private Long total;

	@Column(name="tps_max")
	private BigDecimal tpsMax;

	@Column(name="tps_med")
	private BigDecimal tpsMed;

	@Column(name="tps_min")
	private BigDecimal tpsMin;

	@Column(name="tpsp_max")
	private BigDecimal tpspMax;

	@Column(name="tpsp_med")
	private BigDecimal tpspMed;

	@Column(name="tpsp_min")
	private BigDecimal tpspMin;

	@Column(name="ts_max")
	private BigDecimal tsMax;

	@Column(name="ts_med")
	private BigDecimal tsMed;

	@Column(name="ts_min")
	private BigDecimal tsMin;

	@Column(name="turb_max")
	private BigDecimal turbMax;

	@Column(name="turb_med")
	private BigDecimal turbMed;

	@Column(name="turb_min")
	private BigDecimal turbMin;

	@Column(name="tvs_max")
	private BigDecimal tvsMax;

	@Column(name="tvs_med")
	private BigDecimal tvsMed;

	@Column(name="tvs_min")
	private BigDecimal tvsMin;

	@Column(name="v_max")
	private BigDecimal vMax;

	@Column(name="v_med")
	private BigDecimal vMed;

	@Column(name="v_min")
	private BigDecimal vMin;

	@Column(name="vel_max")
	private BigDecimal velMax;

	@Column(name="vel_med")
	private BigDecimal velMed;

	@Column(name="vel_min")
	private BigDecimal velMin;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	@Column(name="width_max")
	private BigDecimal widthMax;

	@Column(name="width_med")
	private BigDecimal widthMed;

	@Column(name="width_min")
	private BigDecimal widthMin;

	@Column(name="wqi_grade_max")
	private String wqiGradeMax;

	@Column(name="wqi_grade_med")
	private String wqiGradeMed;

	@Column(name="wqi_grade_min")
	private String wqiGradeMin;

	@Column(name="wqi_pt_max")
	private BigDecimal wqiPtMax;

	@Column(name="wqi_pt_med")
	private BigDecimal wqiPtMed;

	@Column(name="wqi_pt_min")
	private BigDecimal wqiPtMin;

	private double yr;

	@Column(name="zn_max")
	private BigDecimal znMax;

	@Column(name="zn_med")
	private BigDecimal znMed;

	@Column(name="zn_min")
	private BigDecimal znMin;

	private String zone;

	public RiverWaterSummary1() {
	}

	public BigDecimal getAgMax() {
		return this.agMax;
	}

	public void setAgMax(BigDecimal agMax) {
		this.agMax = agMax;
	}

	public BigDecimal getAgMed() {
		return this.agMed;
	}

	public void setAgMed(BigDecimal agMed) {
		this.agMed = agMed;
	}

	public BigDecimal getAgMin() {
		return this.agMin;
	}

	public void setAgMin(BigDecimal agMin) {
		this.agMin = agMin;
	}

	public BigDecimal getAlMax() {
		return this.alMax;
	}

	public void setAlMax(BigDecimal alMax) {
		this.alMax = alMax;
	}

	public BigDecimal getAlMed() {
		return this.alMed;
	}

	public void setAlMed(BigDecimal alMed) {
		this.alMed = alMed;
	}

	public BigDecimal getAlMin() {
		return this.alMin;
	}

	public void setAlMin(BigDecimal alMin) {
		this.alMin = alMin;
	}

	public BigDecimal getArsenicMax() {
		return this.arsenicMax;
	}

	public void setArsenicMax(BigDecimal arsenicMax) {
		this.arsenicMax = arsenicMax;
	}

	public BigDecimal getArsenicMed() {
		return this.arsenicMed;
	}

	public void setArsenicMed(BigDecimal arsenicMed) {
		this.arsenicMed = arsenicMed;
	}

	public BigDecimal getArsenicMin() {
		return this.arsenicMin;
	}

	public void setArsenicMin(BigDecimal arsenicMin) {
		this.arsenicMin = arsenicMin;
	}

	public BigDecimal getBMax() {
		return this.bMax;
	}

	public void setBMax(BigDecimal bMax) {
		this.bMax = bMax;
	}

	public BigDecimal getBMed() {
		return this.bMed;
	}

	public void setBMed(BigDecimal bMed) {
		this.bMed = bMed;
	}

	public BigDecimal getBMin() {
		return this.bMin;
	}

	public void setBMin(BigDecimal bMin) {
		this.bMin = bMin;
	}

	public BigDecimal getBaMax() {
		return this.baMax;
	}

	public void setBaMax(BigDecimal baMax) {
		this.baMax = baMax;
	}

	public BigDecimal getBaMed() {
		return this.baMed;
	}

	public void setBaMed(BigDecimal baMed) {
		this.baMed = baMed;
	}

	public BigDecimal getBaMin() {
		return this.baMin;
	}

	public void setBaMin(BigDecimal baMin) {
		this.baMin = baMin;
	}

	public BigDecimal getBeMax() {
		return this.beMax;
	}

	public void setBeMax(BigDecimal beMax) {
		this.beMax = beMax;
	}

	public BigDecimal getBeMed() {
		return this.beMed;
	}

	public void setBeMed(BigDecimal beMed) {
		this.beMed = beMed;
	}

	public BigDecimal getBeMin() {
		return this.beMin;
	}

	public void setBeMin(BigDecimal beMin) {
		this.beMin = beMin;
	}

	public BigDecimal getBod5Max() {
		return this.bod5Max;
	}

	public void setBod5Max(BigDecimal bod5Max) {
		this.bod5Max = bod5Max;
	}

	public BigDecimal getBod5Med() {
		return this.bod5Med;
	}

	public void setBod5Med(BigDecimal bod5Med) {
		this.bod5Med = bod5Med;
	}

	public BigDecimal getBod5Min() {
		return this.bod5Min;
	}

	public void setBod5Min(BigDecimal bod5Min) {
		this.bod5Min = bod5Min;
	}

	public BigDecimal getBod5PtMax() {
		return this.bod5PtMax;
	}

	public void setBod5PtMax(BigDecimal bod5PtMax) {
		this.bod5PtMax = bod5PtMax;
	}

	public BigDecimal getBod5PtMed() {
		return this.bod5PtMed;
	}

	public void setBod5PtMed(BigDecimal bod5PtMed) {
		this.bod5PtMed = bod5PtMed;
	}

	public BigDecimal getBod5PtMin() {
		return this.bod5PtMin;
	}

	public void setBod5PtMin(BigDecimal bod5PtMin) {
		this.bod5PtMin = bod5PtMin;
	}

	public BigDecimal getCdMax() {
		return this.cdMax;
	}

	public void setCdMax(BigDecimal cdMax) {
		this.cdMax = cdMax;
	}

	public BigDecimal getCdMed() {
		return this.cdMed;
	}

	public void setCdMed(BigDecimal cdMed) {
		this.cdMed = cdMed;
	}

	public BigDecimal getCdMin() {
		return this.cdMin;
	}

	public void setCdMin(BigDecimal cdMin) {
		this.cdMin = cdMin;
	}

	public BigDecimal getChlMax() {
		return this.chlMax;
	}

	public void setChlMax(BigDecimal chlMax) {
		this.chlMax = chlMax;
	}

	public BigDecimal getChlMed() {
		return this.chlMed;
	}

	public void setChlMed(BigDecimal chlMed) {
		this.chlMed = chlMed;
	}

	public BigDecimal getChlMin() {
		return this.chlMin;
	}

	public void setChlMin(BigDecimal chlMin) {
		this.chlMin = chlMin;
	}

	public BigDecimal getClMax() {
		return this.clMax;
	}

	public void setClMax(BigDecimal clMax) {
		this.clMax = clMax;
	}

	public BigDecimal getClMed() {
		return this.clMed;
	}

	public void setClMed(BigDecimal clMed) {
		this.clMed = clMed;
	}

	public BigDecimal getClMin() {
		return this.clMin;
	}

	public void setClMin(BigDecimal clMin) {
		this.clMin = clMin;
	}

	public BigDecimal getCodMax() {
		return this.codMax;
	}

	public void setCodMax(BigDecimal codMax) {
		this.codMax = codMax;
	}

	public BigDecimal getCodMed() {
		return this.codMed;
	}

	public void setCodMed(BigDecimal codMed) {
		this.codMed = codMed;
	}

	public BigDecimal getCodMin() {
		return this.codMin;
	}

	public void setCodMin(BigDecimal codMin) {
		this.codMin = codMin;
	}

	public BigDecimal getCondMax() {
		return this.condMax;
	}

	public void setCondMax(BigDecimal condMax) {
		this.condMax = condMax;
	}

	public BigDecimal getCondMed() {
		return this.condMed;
	}

	public void setCondMed(BigDecimal condMed) {
		this.condMed = condMed;
	}

	public BigDecimal getCondMin() {
		return this.condMin;
	}

	public void setCondMin(BigDecimal condMin) {
		this.condMin = condMin;
	}

	public BigDecimal getCrMax() {
		return this.crMax;
	}

	public void setCrMax(BigDecimal crMax) {
		this.crMax = crMax;
	}

	public BigDecimal getCrMed() {
		return this.crMed;
	}

	public void setCrMed(BigDecimal crMed) {
		this.crMed = crMed;
	}

	public BigDecimal getCrMin() {
		return this.crMin;
	}

	public void setCrMin(BigDecimal crMin) {
		this.crMin = crMin;
	}

	public BigDecimal getCuMax() {
		return this.cuMax;
	}

	public void setCuMax(BigDecimal cuMax) {
		this.cuMax = cuMax;
	}

	public BigDecimal getCuMed() {
		return this.cuMed;
	}

	public void setCuMed(BigDecimal cuMed) {
		this.cuMed = cuMed;
	}

	public BigDecimal getCuMin() {
		return this.cuMin;
	}

	public void setCuMin(BigDecimal cuMin) {
		this.cuMin = cuMin;
	}

	public BigDecimal getDepthMax() {
		return this.depthMax;
	}

	public void setDepthMax(BigDecimal depthMax) {
		this.depthMax = depthMax;
	}

	public BigDecimal getDepthMed() {
		return this.depthMed;
	}

	public void setDepthMed(BigDecimal depthMed) {
		this.depthMed = depthMed;
	}

	public BigDecimal getDepthMin() {
		return this.depthMin;
	}

	public void setDepthMin(BigDecimal depthMin) {
		this.depthMin = depthMin;
	}

	public BigDecimal getDetergMax() {
		return this.detergMax;
	}

	public void setDetergMax(BigDecimal detergMax) {
		this.detergMax = detergMax;
	}

	public BigDecimal getDetergMed() {
		return this.detergMed;
	}

	public void setDetergMed(BigDecimal detergMed) {
		this.detergMed = detergMed;
	}

	public BigDecimal getDetergMin() {
		return this.detergMin;
	}

	public void setDetergMin(BigDecimal detergMin) {
		this.detergMin = detergMin;
	}

	public BigDecimal getDoMax() {
		return this.doMax;
	}

	public void setDoMax(BigDecimal doMax) {
		this.doMax = doMax;
	}

	public BigDecimal getDoMed() {
		return this.doMed;
	}

	public void setDoMed(BigDecimal doMed) {
		this.doMed = doMed;
	}

	public BigDecimal getDoMin() {
		return this.doMin;
	}

	public void setDoMin(BigDecimal doMin) {
		this.doMin = doMin;
	}

	public BigDecimal getDosMax() {
		return this.dosMax;
	}

	public void setDosMax(BigDecimal dosMax) {
		this.dosMax = dosMax;
	}

	public BigDecimal getDosMed() {
		return this.dosMed;
	}

	public void setDosMed(BigDecimal dosMed) {
		this.dosMed = dosMed;
	}

	public BigDecimal getDosMin() {
		return this.dosMin;
	}

	public void setDosMin(BigDecimal dosMin) {
		this.dosMin = dosMin;
	}

	public BigDecimal getDosPtMax() {
		return this.dosPtMax;
	}

	public void setDosPtMax(BigDecimal dosPtMax) {
		this.dosPtMax = dosPtMax;
	}

	public BigDecimal getDosPtMed() {
		return this.dosPtMed;
	}

	public void setDosPtMed(BigDecimal dosPtMed) {
		this.dosPtMed = dosPtMed;
	}

	public BigDecimal getDosPtMin() {
		return this.dosPtMin;
	}

	public void setDosPtMin(BigDecimal dosPtMin) {
		this.dosPtMin = dosPtMin;
	}

	public BigDecimal getEcAvg() {
		return this.ecAvg;
	}

	public void setEcAvg(BigDecimal ecAvg) {
		this.ecAvg = ecAvg;
	}

	public BigDecimal getEcMax() {
		return this.ecMax;
	}

	public void setEcMax(BigDecimal ecMax) {
		this.ecMax = ecMax;
	}

	public BigDecimal getEcMin() {
		return this.ecMin;
	}

	public void setEcMin(BigDecimal ecMin) {
		this.ecMin = ecMin;
	}

	public BigDecimal getFcAvg() {
		return this.fcAvg;
	}

	public void setFcAvg(BigDecimal fcAvg) {
		this.fcAvg = fcAvg;
	}

	public BigDecimal getFcMax() {
		return this.fcMax;
	}

	public void setFcMax(BigDecimal fcMax) {
		this.fcMax = fcMax;
	}

	public BigDecimal getFcMin() {
		return this.fcMin;
	}

	public void setFcMin(BigDecimal fcMin) {
		this.fcMin = fcMin;
	}

	public BigDecimal getFeMax() {
		return this.feMax;
	}

	public void setFeMax(BigDecimal feMax) {
		this.feMax = feMax;
	}

	public BigDecimal getFeMed() {
		return this.feMed;
	}

	public void setFeMed(BigDecimal feMed) {
		this.feMed = feMed;
	}

	public BigDecimal getFeMin() {
		return this.feMin;
	}

	public void setFeMin(BigDecimal feMin) {
		this.feMin = feMin;
	}

	public BigDecimal getFlMax() {
		return this.flMax;
	}

	public void setFlMax(BigDecimal flMax) {
		this.flMax = flMax;
	}

	public BigDecimal getFlMed() {
		return this.flMed;
	}

	public void setFlMed(BigDecimal flMed) {
		this.flMed = flMed;
	}

	public BigDecimal getFlMin() {
		return this.flMin;
	}

	public void setFlMin(BigDecimal flMin) {
		this.flMin = flMin;
	}

	public BigDecimal getFlowMax() {
		return this.flowMax;
	}

	public void setFlowMax(BigDecimal flowMax) {
		this.flowMax = flowMax;
	}

	public BigDecimal getFlowMed() {
		return this.flowMed;
	}

	public void setFlowMed(BigDecimal flowMed) {
		this.flowMed = flowMed;
	}

	public BigDecimal getFlowMin() {
		return this.flowMin;
	}

	public void setFlowMin(BigDecimal flowMin) {
		this.flowMin = flowMin;
	}

	public BigDecimal getH2sMax() {
		return this.h2sMax;
	}

	public void setH2sMax(BigDecimal h2sMax) {
		this.h2sMax = h2sMax;
	}

	public BigDecimal getH2sMed() {
		return this.h2sMed;
	}

	public void setH2sMed(BigDecimal h2sMed) {
		this.h2sMed = h2sMed;
	}

	public BigDecimal getH2sMin() {
		return this.h2sMin;
	}

	public void setH2sMin(BigDecimal h2sMin) {
		this.h2sMin = h2sMin;
	}

	public BigDecimal getHgMax() {
		return this.hgMax;
	}

	public void setHgMax(BigDecimal hgMax) {
		this.hgMax = hgMax;
	}

	public BigDecimal getHgMed() {
		return this.hgMed;
	}

	public void setHgMed(BigDecimal hgMed) {
		this.hgMed = hgMed;
	}

	public BigDecimal getHgMin() {
		return this.hgMin;
	}

	public void setHgMin(BigDecimal hgMin) {
		this.hgMin = hgMin;
	}

	public String getLAgMax() {
		return this.lAgMax;
	}

	public void setLAgMax(String lAgMax) {
		this.lAgMax = lAgMax;
	}

	public String getLAgMed() {
		return this.lAgMed;
	}

	public void setLAgMed(String lAgMed) {
		this.lAgMed = lAgMed;
	}

	public String getLAgMin() {
		return this.lAgMin;
	}

	public void setLAgMin(String lAgMin) {
		this.lAgMin = lAgMin;
	}

	public String getLAlMax() {
		return this.lAlMax;
	}

	public void setLAlMax(String lAlMax) {
		this.lAlMax = lAlMax;
	}

	public String getLAlMed() {
		return this.lAlMed;
	}

	public void setLAlMed(String lAlMed) {
		this.lAlMed = lAlMed;
	}

	public String getLAlMin() {
		return this.lAlMin;
	}

	public void setLAlMin(String lAlMin) {
		this.lAlMin = lAlMin;
	}

	public String getLArsenicMax() {
		return this.lArsenicMax;
	}

	public void setLArsenicMax(String lArsenicMax) {
		this.lArsenicMax = lArsenicMax;
	}

	public String getLArsenicMed() {
		return this.lArsenicMed;
	}

	public void setLArsenicMed(String lArsenicMed) {
		this.lArsenicMed = lArsenicMed;
	}

	public String getLArsenicMin() {
		return this.lArsenicMin;
	}

	public void setLArsenicMin(String lArsenicMin) {
		this.lArsenicMin = lArsenicMin;
	}

	public String getLBMax() {
		return this.lBMax;
	}

	public void setLBMax(String lBMax) {
		this.lBMax = lBMax;
	}

	public String getLBMed() {
		return this.lBMed;
	}

	public void setLBMed(String lBMed) {
		this.lBMed = lBMed;
	}

	public String getLBMin() {
		return this.lBMin;
	}

	public void setLBMin(String lBMin) {
		this.lBMin = lBMin;
	}

	public String getLBaMax() {
		return this.lBaMax;
	}

	public void setLBaMax(String lBaMax) {
		this.lBaMax = lBaMax;
	}

	public String getLBaMed() {
		return this.lBaMed;
	}

	public void setLBaMed(String lBaMed) {
		this.lBaMed = lBaMed;
	}

	public String getLBaMin() {
		return this.lBaMin;
	}

	public void setLBaMin(String lBaMin) {
		this.lBaMin = lBaMin;
	}

	public String getLBeMax() {
		return this.lBeMax;
	}

	public void setLBeMax(String lBeMax) {
		this.lBeMax = lBeMax;
	}

	public String getLBeMed() {
		return this.lBeMed;
	}

	public void setLBeMed(String lBeMed) {
		this.lBeMed = lBeMed;
	}

	public String getLBeMin() {
		return this.lBeMin;
	}

	public void setLBeMin(String lBeMin) {
		this.lBeMin = lBeMin;
	}

	public String getLBod5Max() {
		return this.lBod5Max;
	}

	public void setLBod5Max(String lBod5Max) {
		this.lBod5Max = lBod5Max;
	}

	public String getLBod5Med() {
		return this.lBod5Med;
	}

	public void setLBod5Med(String lBod5Med) {
		this.lBod5Med = lBod5Med;
	}

	public String getLBod5Min() {
		return this.lBod5Min;
	}

	public void setLBod5Min(String lBod5Min) {
		this.lBod5Min = lBod5Min;
	}

	public String getLCdMax() {
		return this.lCdMax;
	}

	public void setLCdMax(String lCdMax) {
		this.lCdMax = lCdMax;
	}

	public String getLCdMed() {
		return this.lCdMed;
	}

	public void setLCdMed(String lCdMed) {
		this.lCdMed = lCdMed;
	}

	public String getLCdMin() {
		return this.lCdMin;
	}

	public void setLCdMin(String lCdMin) {
		this.lCdMin = lCdMin;
	}

	public String getLChlMax() {
		return this.lChlMax;
	}

	public void setLChlMax(String lChlMax) {
		this.lChlMax = lChlMax;
	}

	public String getLChlMed() {
		return this.lChlMed;
	}

	public void setLChlMed(String lChlMed) {
		this.lChlMed = lChlMed;
	}

	public String getLChlMin() {
		return this.lChlMin;
	}

	public void setLChlMin(String lChlMin) {
		this.lChlMin = lChlMin;
	}

	public String getLClMax() {
		return this.lClMax;
	}

	public void setLClMax(String lClMax) {
		this.lClMax = lClMax;
	}

	public String getLClMed() {
		return this.lClMed;
	}

	public void setLClMed(String lClMed) {
		this.lClMed = lClMed;
	}

	public String getLClMin() {
		return this.lClMin;
	}

	public void setLClMin(String lClMin) {
		this.lClMin = lClMin;
	}

	public String getLCodMax() {
		return this.lCodMax;
	}

	public void setLCodMax(String lCodMax) {
		this.lCodMax = lCodMax;
	}

	public String getLCodMed() {
		return this.lCodMed;
	}

	public void setLCodMed(String lCodMed) {
		this.lCodMed = lCodMed;
	}

	public String getLCodMin() {
		return this.lCodMin;
	}

	public void setLCodMin(String lCodMin) {
		this.lCodMin = lCodMin;
	}

	public String getLCondMax() {
		return this.lCondMax;
	}

	public void setLCondMax(String lCondMax) {
		this.lCondMax = lCondMax;
	}

	public String getLCondMed() {
		return this.lCondMed;
	}

	public void setLCondMed(String lCondMed) {
		this.lCondMed = lCondMed;
	}

	public String getLCondMin() {
		return this.lCondMin;
	}

	public void setLCondMin(String lCondMin) {
		this.lCondMin = lCondMin;
	}

	public String getLCrMax() {
		return this.lCrMax;
	}

	public void setLCrMax(String lCrMax) {
		this.lCrMax = lCrMax;
	}

	public String getLCrMed() {
		return this.lCrMed;
	}

	public void setLCrMed(String lCrMed) {
		this.lCrMed = lCrMed;
	}

	public String getLCrMin() {
		return this.lCrMin;
	}

	public void setLCrMin(String lCrMin) {
		this.lCrMin = lCrMin;
	}

	public String getLCuMax() {
		return this.lCuMax;
	}

	public void setLCuMax(String lCuMax) {
		this.lCuMax = lCuMax;
	}

	public String getLCuMed() {
		return this.lCuMed;
	}

	public void setLCuMed(String lCuMed) {
		this.lCuMed = lCuMed;
	}

	public String getLCuMin() {
		return this.lCuMin;
	}

	public void setLCuMin(String lCuMin) {
		this.lCuMin = lCuMin;
	}

	public String getLDetergMax() {
		return this.lDetergMax;
	}

	public void setLDetergMax(String lDetergMax) {
		this.lDetergMax = lDetergMax;
	}

	public String getLDetergMed() {
		return this.lDetergMed;
	}

	public void setLDetergMed(String lDetergMed) {
		this.lDetergMed = lDetergMed;
	}

	public String getLDetergMin() {
		return this.lDetergMin;
	}

	public void setLDetergMin(String lDetergMin) {
		this.lDetergMin = lDetergMin;
	}

	public String getLDoMax() {
		return this.lDoMax;
	}

	public void setLDoMax(String lDoMax) {
		this.lDoMax = lDoMax;
	}

	public String getLDoMed() {
		return this.lDoMed;
	}

	public void setLDoMed(String lDoMed) {
		this.lDoMed = lDoMed;
	}

	public String getLDoMin() {
		return this.lDoMin;
	}

	public void setLDoMin(String lDoMin) {
		this.lDoMin = lDoMin;
	}

	public String getLDosMax() {
		return this.lDosMax;
	}

	public void setLDosMax(String lDosMax) {
		this.lDosMax = lDosMax;
	}

	public String getLDosMed() {
		return this.lDosMed;
	}

	public void setLDosMed(String lDosMed) {
		this.lDosMed = lDosMed;
	}

	public String getLDosMin() {
		return this.lDosMin;
	}

	public void setLDosMin(String lDosMin) {
		this.lDosMin = lDosMin;
	}

	public String getLEcAvg() {
		return this.lEcAvg;
	}

	public void setLEcAvg(String lEcAvg) {
		this.lEcAvg = lEcAvg;
	}

	public String getLEcMax() {
		return this.lEcMax;
	}

	public void setLEcMax(String lEcMax) {
		this.lEcMax = lEcMax;
	}

	public String getLEcMin() {
		return this.lEcMin;
	}

	public void setLEcMin(String lEcMin) {
		this.lEcMin = lEcMin;
	}

	public String getLFcAvg() {
		return this.lFcAvg;
	}

	public void setLFcAvg(String lFcAvg) {
		this.lFcAvg = lFcAvg;
	}

	public String getLFcMax() {
		return this.lFcMax;
	}

	public void setLFcMax(String lFcMax) {
		this.lFcMax = lFcMax;
	}

	public String getLFcMin() {
		return this.lFcMin;
	}

	public void setLFcMin(String lFcMin) {
		this.lFcMin = lFcMin;
	}

	public String getLFeMax() {
		return this.lFeMax;
	}

	public void setLFeMax(String lFeMax) {
		this.lFeMax = lFeMax;
	}

	public String getLFeMed() {
		return this.lFeMed;
	}

	public void setLFeMed(String lFeMed) {
		this.lFeMed = lFeMed;
	}

	public String getLFeMin() {
		return this.lFeMin;
	}

	public void setLFeMin(String lFeMin) {
		this.lFeMin = lFeMin;
	}

	public String getLFlMax() {
		return this.lFlMax;
	}

	public void setLFlMax(String lFlMax) {
		this.lFlMax = lFlMax;
	}

	public String getLFlMed() {
		return this.lFlMed;
	}

	public void setLFlMed(String lFlMed) {
		this.lFlMed = lFlMed;
	}

	public String getLFlMin() {
		return this.lFlMin;
	}

	public void setLFlMin(String lFlMin) {
		this.lFlMin = lFlMin;
	}

	public String getLH2sMax() {
		return this.lH2sMax;
	}

	public void setLH2sMax(String lH2sMax) {
		this.lH2sMax = lH2sMax;
	}

	public String getLH2sMed() {
		return this.lH2sMed;
	}

	public void setLH2sMed(String lH2sMed) {
		this.lH2sMed = lH2sMed;
	}

	public String getLH2sMin() {
		return this.lH2sMin;
	}

	public void setLH2sMin(String lH2sMin) {
		this.lH2sMin = lH2sMin;
	}

	public String getLHgMax() {
		return this.lHgMax;
	}

	public void setLHgMax(String lHgMax) {
		this.lHgMax = lHgMax;
	}

	public String getLHgMed() {
		return this.lHgMed;
	}

	public void setLHgMed(String lHgMed) {
		this.lHgMed = lHgMed;
	}

	public String getLHgMin() {
		return this.lHgMin;
	}

	public void setLHgMin(String lHgMin) {
		this.lHgMin = lHgMin;
	}

	public String getLMnMax() {
		return this.lMnMax;
	}

	public void setLMnMax(String lMnMax) {
		this.lMnMax = lMnMax;
	}

	public String getLMnMed() {
		return this.lMnMed;
	}

	public void setLMnMed(String lMnMed) {
		this.lMnMed = lMnMed;
	}

	public String getLMnMin() {
		return this.lMnMin;
	}

	public void setLMnMin(String lMnMin) {
		this.lMnMin = lMnMin;
	}

	public String getLMoMax() {
		return this.lMoMax;
	}

	public void setLMoMax(String lMoMax) {
		this.lMoMax = lMoMax;
	}

	public String getLMoMed() {
		return this.lMoMed;
	}

	public void setLMoMed(String lMoMed) {
		this.lMoMed = lMoMed;
	}

	public String getLMoMin() {
		return this.lMoMin;
	}

	public void setLMoMin(String lMoMin) {
		this.lMoMin = lMoMin;
	}

	public String getLNh3Max() {
		return this.lNh3Max;
	}

	public void setLNh3Max(String lNh3Max) {
		this.lNh3Max = lNh3Max;
	}

	public String getLNh3Med() {
		return this.lNh3Med;
	}

	public void setLNh3Med(String lNh3Med) {
		this.lNh3Med = lNh3Med;
	}

	public String getLNh3Min() {
		return this.lNh3Min;
	}

	public void setLNh3Min(String lNh3Min) {
		this.lNh3Min = lNh3Min;
	}

	public String getLNh4Max() {
		return this.lNh4Max;
	}

	public void setLNh4Max(String lNh4Max) {
		this.lNh4Max = lNh4Max;
	}

	public String getLNh4Med() {
		return this.lNh4Med;
	}

	public void setLNh4Med(String lNh4Med) {
		this.lNh4Med = lNh4Med;
	}

	public String getLNh4Min() {
		return this.lNh4Min;
	}

	public void setLNh4Min(String lNh4Min) {
		this.lNh4Min = lNh4Min;
	}

	public String getLNiMax() {
		return this.lNiMax;
	}

	public void setLNiMax(String lNiMax) {
		this.lNiMax = lNiMax;
	}

	public String getLNiMed() {
		return this.lNiMed;
	}

	public void setLNiMed(String lNiMed) {
		this.lNiMed = lNiMed;
	}

	public String getLNiMin() {
		return this.lNiMin;
	}

	public void setLNiMin(String lNiMin) {
		this.lNiMin = lNiMin;
	}

	public String getLNo2Max() {
		return this.lNo2Max;
	}

	public void setLNo2Max(String lNo2Max) {
		this.lNo2Max = lNo2Max;
	}

	public String getLNo2Med() {
		return this.lNo2Med;
	}

	public void setLNo2Med(String lNo2Med) {
		this.lNo2Med = lNo2Med;
	}

	public String getLNo2Min() {
		return this.lNo2Min;
	}

	public void setLNo2Min(String lNo2Min) {
		this.lNo2Min = lNo2Min;
	}

	public String getLNo3Max() {
		return this.lNo3Max;
	}

	public void setLNo3Max(String lNo3Max) {
		this.lNo3Max = lNo3Max;
	}

	public String getLNo3Med() {
		return this.lNo3Med;
	}

	public void setLNo3Med(String lNo3Med) {
		this.lNo3Med = lNo3Med;
	}

	public String getLNo3Min() {
		return this.lNo3Min;
	}

	public void setLNo3Min(String lNo3Min) {
		this.lNo3Min = lNo3Min;
	}

	public String getLOilMax() {
		return this.lOilMax;
	}

	public void setLOilMax(String lOilMax) {
		this.lOilMax = lOilMax;
	}

	public String getLOilMed() {
		return this.lOilMed;
	}

	public void setLOilMed(String lOilMed) {
		this.lOilMed = lOilMed;
	}

	public String getLOilMin() {
		return this.lOilMin;
	}

	public void setLOilMin(String lOilMin) {
		this.lOilMin = lOilMin;
	}

	public String getLPbMax() {
		return this.lPbMax;
	}

	public void setLPbMax(String lPbMax) {
		this.lPbMax = lPbMax;
	}

	public String getLPbMed() {
		return this.lPbMed;
	}

	public void setLPbMed(String lPbMed) {
		this.lPbMed = lPbMed;
	}

	public String getLPbMin() {
		return this.lPbMin;
	}

	public void setLPbMin(String lPbMin) {
		this.lPbMin = lPbMin;
	}

	public String getLPhMax() {
		return this.lPhMax;
	}

	public void setLPhMax(String lPhMax) {
		this.lPhMax = lPhMax;
	}

	public String getLPhMed() {
		return this.lPhMed;
	}

	public void setLPhMed(String lPhMed) {
		this.lPhMed = lPhMed;
	}

	public String getLPhMin() {
		return this.lPhMin;
	}

	public void setLPhMin(String lPhMin) {
		this.lPhMin = lPhMin;
	}

	public String getLPheoMax() {
		return this.lPheoMax;
	}

	public void setLPheoMax(String lPheoMax) {
		this.lPheoMax = lPheoMax;
	}

	public String getLPheoMed() {
		return this.lPheoMed;
	}

	public void setLPheoMed(String lPheoMed) {
		this.lPheoMed = lPheoMed;
	}

	public String getLPheoMin() {
		return this.lPheoMin;
	}

	public void setLPheoMin(String lPheoMin) {
		this.lPheoMin = lPheoMin;
	}

	public String getLPo4Max() {
		return this.lPo4Max;
	}

	public void setLPo4Max(String lPo4Max) {
		this.lPo4Max = lPo4Max;
	}

	public String getLPo4Med() {
		return this.lPo4Med;
	}

	public void setLPo4Med(String lPo4Med) {
		this.lPo4Med = lPo4Med;
	}

	public String getLPo4Min() {
		return this.lPo4Min;
	}

	public void setLPo4Min(String lPo4Min) {
		this.lPo4Min = lPo4Min;
	}

	public String getLSalMax() {
		return this.lSalMax;
	}

	public void setLSalMax(String lSalMax) {
		this.lSalMax = lSalMax;
	}

	public String getLSalMed() {
		return this.lSalMed;
	}

	public void setLSalMed(String lSalMed) {
		this.lSalMed = lSalMed;
	}

	public String getLSalMin() {
		return this.lSalMin;
	}

	public void setLSalMin(String lSalMin) {
		this.lSalMin = lSalMin;
	}

	public String getLSbMax() {
		return this.lSbMax;
	}

	public void setLSbMax(String lSbMax) {
		this.lSbMax = lSbMax;
	}

	public String getLSbMed() {
		return this.lSbMed;
	}

	public void setLSbMed(String lSbMed) {
		this.lSbMed = lSbMed;
	}

	public String getLSbMin() {
		return this.lSbMin;
	}

	public void setLSbMin(String lSbMin) {
		this.lSbMin = lSbMin;
	}

	public String getLSilMax() {
		return this.lSilMax;
	}

	public void setLSilMax(String lSilMax) {
		this.lSilMax = lSilMax;
	}

	public String getLSilMed() {
		return this.lSilMed;
	}

	public void setLSilMed(String lSilMed) {
		this.lSilMed = lSilMed;
	}

	public String getLSilMin() {
		return this.lSilMin;
	}

	public void setLSilMin(String lSilMin) {
		this.lSilMin = lSilMin;
	}

	public String getLSsMax() {
		return this.lSsMax;
	}

	public void setLSsMax(String lSsMax) {
		this.lSsMax = lSsMax;
	}

	public String getLSsMed() {
		return this.lSsMed;
	}

	public void setLSsMed(String lSsMed) {
		this.lSsMed = lSsMed;
	}

	public String getLSsMin() {
		return this.lSsMin;
	}

	public void setLSsMin(String lSsMin) {
		this.lSsMin = lSsMin;
	}

	public String getLSspMax() {
		return this.lSspMax;
	}

	public void setLSspMax(String lSspMax) {
		this.lSspMax = lSspMax;
	}

	public String getLSspMed() {
		return this.lSspMed;
	}

	public void setLSspMed(String lSspMed) {
		this.lSspMed = lSspMed;
	}

	public String getLSspMin() {
		return this.lSspMin;
	}

	public void setLSspMin(String lSspMin) {
		this.lSspMin = lSspMin;
	}

	public String getLSulpMax() {
		return this.lSulpMax;
	}

	public void setLSulpMax(String lSulpMax) {
		this.lSulpMax = lSulpMax;
	}

	public String getLSulpMed() {
		return this.lSulpMed;
	}

	public void setLSulpMed(String lSulpMed) {
		this.lSulpMed = lSulpMed;
	}

	public String getLSulpMin() {
		return this.lSulpMin;
	}

	public void setLSulpMin(String lSulpMin) {
		this.lSulpMin = lSulpMin;
	}

	public String getLTcynMax() {
		return this.lTcynMax;
	}

	public void setLTcynMax(String lTcynMax) {
		this.lTcynMax = lTcynMax;
	}

	public String getLTcynMed() {
		return this.lTcynMed;
	}

	public void setLTcynMed(String lTcynMed) {
		this.lTcynMed = lTcynMed;
	}

	public String getLTcynMin() {
		return this.lTcynMin;
	}

	public void setLTcynMin(String lTcynMin) {
		this.lTcynMin = lTcynMin;
	}

	public String getLTinMax() {
		return this.lTinMax;
	}

	public void setLTinMax(String lTinMax) {
		this.lTinMax = lTinMax;
	}

	public String getLTinMed() {
		return this.lTinMed;
	}

	public void setLTinMed(String lTinMed) {
		this.lTinMed = lTinMed;
	}

	public String getLTinMin() {
		return this.lTinMin;
	}

	public void setLTinMin(String lTinMin) {
		this.lTinMin = lTinMin;
	}

	public String getLTknsMax() {
		return this.lTknsMax;
	}

	public void setLTknsMax(String lTknsMax) {
		this.lTknsMax = lTknsMax;
	}

	public String getLTknsMed() {
		return this.lTknsMed;
	}

	public void setLTknsMed(String lTknsMed) {
		this.lTknsMed = lTknsMed;
	}

	public String getLTknsMin() {
		return this.lTknsMin;
	}

	public void setLTknsMin(String lTknsMin) {
		this.lTknsMin = lTknsMin;
	}

	public String getLTknspMax() {
		return this.lTknspMax;
	}

	public void setLTknspMax(String lTknspMax) {
		this.lTknspMax = lTknspMax;
	}

	public String getLTknspMed() {
		return this.lTknspMed;
	}

	public void setLTknspMed(String lTknspMed) {
		this.lTknspMed = lTknspMed;
	}

	public String getLTknspMin() {
		return this.lTknspMin;
	}

	public void setLTknspMin(String lTknspMin) {
		this.lTknspMin = lTknspMin;
	}

	public String getLTlMax() {
		return this.lTlMax;
	}

	public void setLTlMax(String lTlMax) {
		this.lTlMax = lTlMax;
	}

	public String getLTlMed() {
		return this.lTlMed;
	}

	public void setLTlMed(String lTlMed) {
		this.lTlMed = lTlMed;
	}

	public String getLTlMin() {
		return this.lTlMin;
	}

	public void setLTlMin(String lTlMin) {
		this.lTlMin = lTlMin;
	}

	public String getLTnMax() {
		return this.lTnMax;
	}

	public void setLTnMax(String lTnMax) {
		this.lTnMax = lTnMax;
	}

	public String getLTnMed() {
		return this.lTnMed;
	}

	public void setLTnMed(String lTnMed) {
		this.lTnMed = lTnMed;
	}

	public String getLTnMin() {
		return this.lTnMin;
	}

	public void setLTnMin(String lTnMin) {
		this.lTnMin = lTnMin;
	}

	public String getLTocMax() {
		return this.lTocMax;
	}

	public void setLTocMax(String lTocMax) {
		this.lTocMax = lTocMax;
	}

	public String getLTocMed() {
		return this.lTocMed;
	}

	public void setLTocMed(String lTocMed) {
		this.lTocMed = lTocMed;
	}

	public String getLTocMin() {
		return this.lTocMin;
	}

	public void setLTocMin(String lTocMin) {
		this.lTocMin = lTocMin;
	}

	public String getLTpsMax() {
		return this.lTpsMax;
	}

	public void setLTpsMax(String lTpsMax) {
		this.lTpsMax = lTpsMax;
	}

	public String getLTpsMed() {
		return this.lTpsMed;
	}

	public void setLTpsMed(String lTpsMed) {
		this.lTpsMed = lTpsMed;
	}

	public String getLTpsMin() {
		return this.lTpsMin;
	}

	public void setLTpsMin(String lTpsMin) {
		this.lTpsMin = lTpsMin;
	}

	public String getLTpspMax() {
		return this.lTpspMax;
	}

	public void setLTpspMax(String lTpspMax) {
		this.lTpspMax = lTpspMax;
	}

	public String getLTpspMed() {
		return this.lTpspMed;
	}

	public void setLTpspMed(String lTpspMed) {
		this.lTpspMed = lTpspMed;
	}

	public String getLTpspMin() {
		return this.lTpspMin;
	}

	public void setLTpspMin(String lTpspMin) {
		this.lTpspMin = lTpspMin;
	}

	public String getLTsMax() {
		return this.lTsMax;
	}

	public void setLTsMax(String lTsMax) {
		this.lTsMax = lTsMax;
	}

	public String getLTsMed() {
		return this.lTsMed;
	}

	public void setLTsMed(String lTsMed) {
		this.lTsMed = lTsMed;
	}

	public String getLTsMin() {
		return this.lTsMin;
	}

	public void setLTsMin(String lTsMin) {
		this.lTsMin = lTsMin;
	}

	public String getLTurbMax() {
		return this.lTurbMax;
	}

	public void setLTurbMax(String lTurbMax) {
		this.lTurbMax = lTurbMax;
	}

	public String getLTurbMed() {
		return this.lTurbMed;
	}

	public void setLTurbMed(String lTurbMed) {
		this.lTurbMed = lTurbMed;
	}

	public String getLTurbMin() {
		return this.lTurbMin;
	}

	public void setLTurbMin(String lTurbMin) {
		this.lTurbMin = lTurbMin;
	}

	public String getLTvsMax() {
		return this.lTvsMax;
	}

	public void setLTvsMax(String lTvsMax) {
		this.lTvsMax = lTvsMax;
	}

	public String getLTvsMed() {
		return this.lTvsMed;
	}

	public void setLTvsMed(String lTvsMed) {
		this.lTvsMed = lTvsMed;
	}

	public String getLTvsMin() {
		return this.lTvsMin;
	}

	public void setLTvsMin(String lTvsMin) {
		this.lTvsMin = lTvsMin;
	}

	public String getLVMax() {
		return this.lVMax;
	}

	public void setLVMax(String lVMax) {
		this.lVMax = lVMax;
	}

	public String getLVMed() {
		return this.lVMed;
	}

	public void setLVMed(String lVMed) {
		this.lVMed = lVMed;
	}

	public String getLVMin() {
		return this.lVMin;
	}

	public void setLVMin(String lVMin) {
		this.lVMin = lVMin;
	}

	public String getLZnMax() {
		return this.lZnMax;
	}

	public void setLZnMax(String lZnMax) {
		this.lZnMax = lZnMax;
	}

	public String getLZnMed() {
		return this.lZnMed;
	}

	public void setLZnMed(String lZnMed) {
		this.lZnMed = lZnMed;
	}

	public String getLZnMin() {
		return this.lZnMin;
	}

	public void setLZnMin(String lZnMin) {
		this.lZnMin = lZnMin;
	}

	public BigDecimal getMnMax() {
		return this.mnMax;
	}

	public void setMnMax(BigDecimal mnMax) {
		this.mnMax = mnMax;
	}

	public BigDecimal getMnMed() {
		return this.mnMed;
	}

	public void setMnMed(BigDecimal mnMed) {
		this.mnMed = mnMed;
	}

	public BigDecimal getMnMin() {
		return this.mnMin;
	}

	public void setMnMin(BigDecimal mnMin) {
		this.mnMin = mnMin;
	}

	public BigDecimal getMoMax() {
		return this.moMax;
	}

	public void setMoMax(BigDecimal moMax) {
		this.moMax = moMax;
	}

	public BigDecimal getMoMed() {
		return this.moMed;
	}

	public void setMoMed(BigDecimal moMed) {
		this.moMed = moMed;
	}

	public BigDecimal getMoMin() {
		return this.moMin;
	}

	public void setMoMin(BigDecimal moMin) {
		this.moMin = moMin;
	}

	public BigDecimal getNh3Max() {
		return this.nh3Max;
	}

	public void setNh3Max(BigDecimal nh3Max) {
		this.nh3Max = nh3Max;
	}

	public BigDecimal getNh3Med() {
		return this.nh3Med;
	}

	public void setNh3Med(BigDecimal nh3Med) {
		this.nh3Med = nh3Med;
	}

	public BigDecimal getNh3Min() {
		return this.nh3Min;
	}

	public void setNh3Min(BigDecimal nh3Min) {
		this.nh3Min = nh3Min;
	}

	public BigDecimal getNh4Max() {
		return this.nh4Max;
	}

	public void setNh4Max(BigDecimal nh4Max) {
		this.nh4Max = nh4Max;
	}

	public BigDecimal getNh4Med() {
		return this.nh4Med;
	}

	public void setNh4Med(BigDecimal nh4Med) {
		this.nh4Med = nh4Med;
	}

	public BigDecimal getNh4Min() {
		return this.nh4Min;
	}

	public void setNh4Min(BigDecimal nh4Min) {
		this.nh4Min = nh4Min;
	}

	public BigDecimal getNh4PtMax() {
		return this.nh4PtMax;
	}

	public void setNh4PtMax(BigDecimal nh4PtMax) {
		this.nh4PtMax = nh4PtMax;
	}

	public BigDecimal getNh4PtMed() {
		return this.nh4PtMed;
	}

	public void setNh4PtMed(BigDecimal nh4PtMed) {
		this.nh4PtMed = nh4PtMed;
	}

	public BigDecimal getNh4PtMin() {
		return this.nh4PtMin;
	}

	public void setNh4PtMin(BigDecimal nh4PtMin) {
		this.nh4PtMin = nh4PtMin;
	}

	public BigDecimal getNiMax() {
		return this.niMax;
	}

	public void setNiMax(BigDecimal niMax) {
		this.niMax = niMax;
	}

	public BigDecimal getNiMed() {
		return this.niMed;
	}

	public void setNiMed(BigDecimal niMed) {
		this.niMed = niMed;
	}

	public BigDecimal getNiMin() {
		return this.niMin;
	}

	public void setNiMin(BigDecimal niMin) {
		this.niMin = niMin;
	}

	public BigDecimal getNo2Max() {
		return this.no2Max;
	}

	public void setNo2Max(BigDecimal no2Max) {
		this.no2Max = no2Max;
	}

	public BigDecimal getNo2Med() {
		return this.no2Med;
	}

	public void setNo2Med(BigDecimal no2Med) {
		this.no2Med = no2Med;
	}

	public BigDecimal getNo2Min() {
		return this.no2Min;
	}

	public void setNo2Min(BigDecimal no2Min) {
		this.no2Min = no2Min;
	}

	public BigDecimal getNo3Max() {
		return this.no3Max;
	}

	public void setNo3Max(BigDecimal no3Max) {
		this.no3Max = no3Max;
	}

	public BigDecimal getNo3Med() {
		return this.no3Med;
	}

	public void setNo3Med(BigDecimal no3Med) {
		this.no3Med = no3Med;
	}

	public BigDecimal getNo3Min() {
		return this.no3Min;
	}

	public void setNo3Min(BigDecimal no3Min) {
		this.no3Min = no3Min;
	}

	public BigDecimal getOilMax() {
		return this.oilMax;
	}

	public void setOilMax(BigDecimal oilMax) {
		this.oilMax = oilMax;
	}

	public BigDecimal getOilMed() {
		return this.oilMed;
	}

	public void setOilMed(BigDecimal oilMed) {
		this.oilMed = oilMed;
	}

	public BigDecimal getOilMin() {
		return this.oilMin;
	}

	public void setOilMin(BigDecimal oilMin) {
		this.oilMin = oilMin;
	}

	public BigDecimal getPbMax() {
		return this.pbMax;
	}

	public void setPbMax(BigDecimal pbMax) {
		this.pbMax = pbMax;
	}

	public BigDecimal getPbMed() {
		return this.pbMed;
	}

	public void setPbMed(BigDecimal pbMed) {
		this.pbMed = pbMed;
	}

	public BigDecimal getPbMin() {
		return this.pbMin;
	}

	public void setPbMin(BigDecimal pbMin) {
		this.pbMin = pbMin;
	}

	public BigDecimal getPhMax() {
		return this.phMax;
	}

	public void setPhMax(BigDecimal phMax) {
		this.phMax = phMax;
	}

	public BigDecimal getPhMed() {
		return this.phMed;
	}

	public void setPhMed(BigDecimal phMed) {
		this.phMed = phMed;
	}

	public BigDecimal getPhMin() {
		return this.phMin;
	}

	public void setPhMin(BigDecimal phMin) {
		this.phMin = phMin;
	}

	public BigDecimal getPheoMax() {
		return this.pheoMax;
	}

	public void setPheoMax(BigDecimal pheoMax) {
		this.pheoMax = pheoMax;
	}

	public BigDecimal getPheoMed() {
		return this.pheoMed;
	}

	public void setPheoMed(BigDecimal pheoMed) {
		this.pheoMed = pheoMed;
	}

	public BigDecimal getPheoMin() {
		return this.pheoMin;
	}

	public void setPheoMin(BigDecimal pheoMin) {
		this.pheoMin = pheoMin;
	}

	public BigDecimal getPo4Max() {
		return this.po4Max;
	}

	public void setPo4Max(BigDecimal po4Max) {
		this.po4Max = po4Max;
	}

	public BigDecimal getPo4Med() {
		return this.po4Med;
	}

	public void setPo4Med(BigDecimal po4Med) {
		this.po4Med = po4Med;
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

	public BigDecimal getSalMax() {
		return this.salMax;
	}

	public void setSalMax(BigDecimal salMax) {
		this.salMax = salMax;
	}

	public BigDecimal getSalMed() {
		return this.salMed;
	}

	public void setSalMed(BigDecimal salMed) {
		this.salMed = salMed;
	}

	public BigDecimal getSalMin() {
		return this.salMin;
	}

	public void setSalMin(BigDecimal salMin) {
		this.salMin = salMin;
	}

	public BigDecimal getSbMax() {
		return this.sbMax;
	}

	public void setSbMax(BigDecimal sbMax) {
		this.sbMax = sbMax;
	}

	public BigDecimal getSbMed() {
		return this.sbMed;
	}

	public void setSbMed(BigDecimal sbMed) {
		this.sbMed = sbMed;
	}

	public BigDecimal getSbMin() {
		return this.sbMin;
	}

	public void setSbMin(BigDecimal sbMin) {
		this.sbMin = sbMin;
	}

	public BigDecimal getSilMax() {
		return this.silMax;
	}

	public void setSilMax(BigDecimal silMax) {
		this.silMax = silMax;
	}

	public BigDecimal getSilMed() {
		return this.silMed;
	}

	public void setSilMed(BigDecimal silMed) {
		this.silMed = silMed;
	}

	public BigDecimal getSilMin() {
		return this.silMin;
	}

	public void setSilMin(BigDecimal silMin) {
		this.silMin = silMin;
	}

	public BigDecimal getSsMax() {
		return this.ssMax;
	}

	public void setSsMax(BigDecimal ssMax) {
		this.ssMax = ssMax;
	}

	public BigDecimal getSsMed() {
		return this.ssMed;
	}

	public void setSsMed(BigDecimal ssMed) {
		this.ssMed = ssMed;
	}

	public BigDecimal getSsMin() {
		return this.ssMin;
	}

	public void setSsMin(BigDecimal ssMin) {
		this.ssMin = ssMin;
	}

	public BigDecimal getSspMax() {
		return this.sspMax;
	}

	public void setSspMax(BigDecimal sspMax) {
		this.sspMax = sspMax;
	}

	public BigDecimal getSspMed() {
		return this.sspMed;
	}

	public void setSspMed(BigDecimal sspMed) {
		this.sspMed = sspMed;
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

	public BigDecimal getSulpMax() {
		return this.sulpMax;
	}

	public void setSulpMax(BigDecimal sulpMax) {
		this.sulpMax = sulpMax;
	}

	public BigDecimal getSulpMed() {
		return this.sulpMed;
	}

	public void setSulpMed(BigDecimal sulpMed) {
		this.sulpMed = sulpMed;
	}

	public BigDecimal getSulpMin() {
		return this.sulpMin;
	}

	public void setSulpMin(BigDecimal sulpMin) {
		this.sulpMin = sulpMin;
	}

	public BigDecimal getTcynMax() {
		return this.tcynMax;
	}

	public void setTcynMax(BigDecimal tcynMax) {
		this.tcynMax = tcynMax;
	}

	public BigDecimal getTcynMed() {
		return this.tcynMed;
	}

	public void setTcynMed(BigDecimal tcynMed) {
		this.tcynMed = tcynMed;
	}

	public BigDecimal getTcynMin() {
		return this.tcynMin;
	}

	public void setTcynMin(BigDecimal tcynMin) {
		this.tcynMin = tcynMin;
	}

	public BigDecimal getTemperMax() {
		return this.temperMax;
	}

	public void setTemperMax(BigDecimal temperMax) {
		this.temperMax = temperMax;
	}

	public BigDecimal getTemperMed() {
		return this.temperMed;
	}

	public void setTemperMed(BigDecimal temperMed) {
		this.temperMed = temperMed;
	}

	public BigDecimal getTemperMin() {
		return this.temperMin;
	}

	public void setTemperMin(BigDecimal temperMin) {
		this.temperMin = temperMin;
	}

	public BigDecimal getTinMax() {
		return this.tinMax;
	}

	public void setTinMax(BigDecimal tinMax) {
		this.tinMax = tinMax;
	}

	public BigDecimal getTinMed() {
		return this.tinMed;
	}

	public void setTinMed(BigDecimal tinMed) {
		this.tinMed = tinMed;
	}

	public BigDecimal getTinMin() {
		return this.tinMin;
	}

	public void setTinMin(BigDecimal tinMin) {
		this.tinMin = tinMin;
	}

	public BigDecimal getTknsMax() {
		return this.tknsMax;
	}

	public void setTknsMax(BigDecimal tknsMax) {
		this.tknsMax = tknsMax;
	}

	public BigDecimal getTknsMed() {
		return this.tknsMed;
	}

	public void setTknsMed(BigDecimal tknsMed) {
		this.tknsMed = tknsMed;
	}

	public BigDecimal getTknsMin() {
		return this.tknsMin;
	}

	public void setTknsMin(BigDecimal tknsMin) {
		this.tknsMin = tknsMin;
	}

	public BigDecimal getTknspMax() {
		return this.tknspMax;
	}

	public void setTknspMax(BigDecimal tknspMax) {
		this.tknspMax = tknspMax;
	}

	public BigDecimal getTknspMed() {
		return this.tknspMed;
	}

	public void setTknspMed(BigDecimal tknspMed) {
		this.tknspMed = tknspMed;
	}

	public BigDecimal getTknspMin() {
		return this.tknspMin;
	}

	public void setTknspMin(BigDecimal tknspMin) {
		this.tknspMin = tknspMin;
	}

	public BigDecimal getTlMax() {
		return this.tlMax;
	}

	public void setTlMax(BigDecimal tlMax) {
		this.tlMax = tlMax;
	}

	public BigDecimal getTlMed() {
		return this.tlMed;
	}

	public void setTlMed(BigDecimal tlMed) {
		this.tlMed = tlMed;
	}

	public BigDecimal getTlMin() {
		return this.tlMin;
	}

	public void setTlMin(BigDecimal tlMin) {
		this.tlMin = tlMin;
	}

	public BigDecimal getTnMax() {
		return this.tnMax;
	}

	public void setTnMax(BigDecimal tnMax) {
		this.tnMax = tnMax;
	}

	public BigDecimal getTnMed() {
		return this.tnMed;
	}

	public void setTnMed(BigDecimal tnMed) {
		this.tnMed = tnMed;
	}

	public BigDecimal getTnMin() {
		return this.tnMin;
	}

	public void setTnMin(BigDecimal tnMin) {
		this.tnMin = tnMin;
	}

	public BigDecimal getTocMax() {
		return this.tocMax;
	}

	public void setTocMax(BigDecimal tocMax) {
		this.tocMax = tocMax;
	}

	public BigDecimal getTocMed() {
		return this.tocMed;
	}

	public void setTocMed(BigDecimal tocMed) {
		this.tocMed = tocMed;
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

	public BigDecimal getTpsMax() {
		return this.tpsMax;
	}

	public void setTpsMax(BigDecimal tpsMax) {
		this.tpsMax = tpsMax;
	}

	public BigDecimal getTpsMed() {
		return this.tpsMed;
	}

	public void setTpsMed(BigDecimal tpsMed) {
		this.tpsMed = tpsMed;
	}

	public BigDecimal getTpsMin() {
		return this.tpsMin;
	}

	public void setTpsMin(BigDecimal tpsMin) {
		this.tpsMin = tpsMin;
	}

	public BigDecimal getTpspMax() {
		return this.tpspMax;
	}

	public void setTpspMax(BigDecimal tpspMax) {
		this.tpspMax = tpspMax;
	}

	public BigDecimal getTpspMed() {
		return this.tpspMed;
	}

	public void setTpspMed(BigDecimal tpspMed) {
		this.tpspMed = tpspMed;
	}

	public BigDecimal getTpspMin() {
		return this.tpspMin;
	}

	public void setTpspMin(BigDecimal tpspMin) {
		this.tpspMin = tpspMin;
	}

	public BigDecimal getTsMax() {
		return this.tsMax;
	}

	public void setTsMax(BigDecimal tsMax) {
		this.tsMax = tsMax;
	}

	public BigDecimal getTsMed() {
		return this.tsMed;
	}

	public void setTsMed(BigDecimal tsMed) {
		this.tsMed = tsMed;
	}

	public BigDecimal getTsMin() {
		return this.tsMin;
	}

	public void setTsMin(BigDecimal tsMin) {
		this.tsMin = tsMin;
	}

	public BigDecimal getTurbMax() {
		return this.turbMax;
	}

	public void setTurbMax(BigDecimal turbMax) {
		this.turbMax = turbMax;
	}

	public BigDecimal getTurbMed() {
		return this.turbMed;
	}

	public void setTurbMed(BigDecimal turbMed) {
		this.turbMed = turbMed;
	}

	public BigDecimal getTurbMin() {
		return this.turbMin;
	}

	public void setTurbMin(BigDecimal turbMin) {
		this.turbMin = turbMin;
	}

	public BigDecimal getTvsMax() {
		return this.tvsMax;
	}

	public void setTvsMax(BigDecimal tvsMax) {
		this.tvsMax = tvsMax;
	}

	public BigDecimal getTvsMed() {
		return this.tvsMed;
	}

	public void setTvsMed(BigDecimal tvsMed) {
		this.tvsMed = tvsMed;
	}

	public BigDecimal getTvsMin() {
		return this.tvsMin;
	}

	public void setTvsMin(BigDecimal tvsMin) {
		this.tvsMin = tvsMin;
	}

	public BigDecimal getVMax() {
		return this.vMax;
	}

	public void setVMax(BigDecimal vMax) {
		this.vMax = vMax;
	}

	public BigDecimal getVMed() {
		return this.vMed;
	}

	public void setVMed(BigDecimal vMed) {
		this.vMed = vMed;
	}

	public BigDecimal getVMin() {
		return this.vMin;
	}

	public void setVMin(BigDecimal vMin) {
		this.vMin = vMin;
	}

	public BigDecimal getVelMax() {
		return this.velMax;
	}

	public void setVelMax(BigDecimal velMax) {
		this.velMax = velMax;
	}

	public BigDecimal getVelMed() {
		return this.velMed;
	}

	public void setVelMed(BigDecimal velMed) {
		this.velMed = velMed;
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

	public BigDecimal getWidthMax() {
		return this.widthMax;
	}

	public void setWidthMax(BigDecimal widthMax) {
		this.widthMax = widthMax;
	}

	public BigDecimal getWidthMed() {
		return this.widthMed;
	}

	public void setWidthMed(BigDecimal widthMed) {
		this.widthMed = widthMed;
	}

	public BigDecimal getWidthMin() {
		return this.widthMin;
	}

	public void setWidthMin(BigDecimal widthMin) {
		this.widthMin = widthMin;
	}

	public String getWqiGradeMax() {
		return this.wqiGradeMax;
	}

	public void setWqiGradeMax(String wqiGradeMax) {
		this.wqiGradeMax = wqiGradeMax;
	}

	public String getWqiGradeMed() {
		return this.wqiGradeMed;
	}

	public void setWqiGradeMed(String wqiGradeMed) {
		this.wqiGradeMed = wqiGradeMed;
	}

	public String getWqiGradeMin() {
		return this.wqiGradeMin;
	}

	public void setWqiGradeMin(String wqiGradeMin) {
		this.wqiGradeMin = wqiGradeMin;
	}

	public BigDecimal getWqiPtMax() {
		return this.wqiPtMax;
	}

	public void setWqiPtMax(BigDecimal wqiPtMax) {
		this.wqiPtMax = wqiPtMax;
	}

	public BigDecimal getWqiPtMed() {
		return this.wqiPtMed;
	}

	public void setWqiPtMed(BigDecimal wqiPtMed) {
		this.wqiPtMed = wqiPtMed;
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

	public BigDecimal getZnMax() {
		return this.znMax;
	}

	public void setZnMax(BigDecimal znMax) {
		this.znMax = znMax;
	}

	public BigDecimal getZnMed() {
		return this.znMed;
	}

	public void setZnMed(BigDecimal znMed) {
		this.znMed = znMed;
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