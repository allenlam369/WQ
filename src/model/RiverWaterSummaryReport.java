package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the river_water_summary_report database table.
 * 
 */
//@Entity
@Table(name="river_water_summary_report")
@NamedQuery(name="RiverWaterSummaryReport.findAll", query="SELECT r FROM RiverWaterSummaryReport r")
public class RiverWaterSummaryReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="al_max")
	private BigDecimal alMax;

	@Column(name="al_med")
	private BigDecimal alMed;

	@Column(name="al_min")
	private BigDecimal alMin;

	@Column(name="bod5_max")
	private BigDecimal bod5Max;

	@Column(name="bod5_med")
	private BigDecimal bod5Med;

	@Column(name="bod5_min")
	private BigDecimal bod5Min;

	@Column(name="cd_max")
	private BigDecimal cdMax;

	@Column(name="cd_med")
	private BigDecimal cdMed;

	@Column(name="cd_min")
	private BigDecimal cdMin;

	@Column(name="cod_max")
	private BigDecimal codMax;

	@Column(name="cod_med")
	private BigDecimal codMed;

	@Column(name="cod_min")
	private BigDecimal codMin;

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

	@Column(name="do_max")
	private BigDecimal doMax;

	@Column(name="do_med")
	private BigDecimal doMed;

	@Column(name="do_min")
	private BigDecimal doMin;

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

	@Column(name="flow_max")
	private BigDecimal flowMax;

	@Column(name="flow_med")
	private BigDecimal flowMed;

	@Column(name="flow_min")
	private BigDecimal flowMin;

	@Column(name="l_al_max")
	private String lAlMax;

	@Column(name="l_al_med")
	private String lAlMed;

	@Column(name="l_al_min")
	private String lAlMin;

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

	@Column(name="l_cod_max")
	private String lCodMax;

	@Column(name="l_cod_med")
	private String lCodMed;

	@Column(name="l_cod_min")
	private String lCodMin;

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

	@Column(name="l_do_max")
	private String lDoMax;

	@Column(name="l_do_med")
	private String lDoMed;

	@Column(name="l_do_min")
	private String lDoMin;

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

	@Column(name="l_nh4_max")
	private String lNh4Max;

	@Column(name="l_nh4_med")
	private String lNh4Med;

	@Column(name="l_nh4_min")
	private String lNh4Min;

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

	@Column(name="l_po4_max")
	private String lPo4Max;

	@Column(name="l_po4_med")
	private String lPo4Med;

	@Column(name="l_po4_min")
	private String lPo4Min;

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

	@Column(name="l_tknsp_max")
	private String lTknspMax;

	@Column(name="l_tknsp_med")
	private String lTknspMed;

	@Column(name="l_tknsp_min")
	private String lTknspMin;

	@Column(name="l_tpsp_max")
	private String lTpspMax;

	@Column(name="l_tpsp_med")
	private String lTpspMed;

	@Column(name="l_tpsp_min")
	private String lTpspMin;

	@Column(name="l_zn_max")
	private String lZnMax;

	@Column(name="l_zn_med")
	private String lZnMed;

	@Column(name="l_zn_min")
	private String lZnMin;

	@Column(name="nh4_max")
	private BigDecimal nh4Max;

	@Column(name="nh4_med")
	private BigDecimal nh4Med;

	@Column(name="nh4_min")
	private BigDecimal nh4Min;

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

	@Column(name="po4_max")
	private BigDecimal po4Max;

	@Column(name="po4_med")
	private BigDecimal po4Med;

	@Column(name="po4_min")
	private BigDecimal po4Min;

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

	@Column(name="tknsp_max")
	private BigDecimal tknspMax;

	@Column(name="tknsp_med")
	private BigDecimal tknspMed;

	@Column(name="tknsp_min")
	private BigDecimal tknspMin;

	@Column(name="tpsp_max")
	private BigDecimal tpspMax;

	@Column(name="tpsp_med")
	private BigDecimal tpspMed;

	@Column(name="tpsp_min")
	private BigDecimal tpspMin;

	@Column(name="valid_date")
	private Timestamp validDate;

	private Integer yr;

	@Column(name="zn_max")
	private BigDecimal znMax;

	@Column(name="zn_med")
	private BigDecimal znMed;

	@Column(name="zn_min")
	private BigDecimal znMin;

	private String zone;

	public RiverWaterSummaryReport() {
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

	public Timestamp getValidDate() {
		return this.validDate;
	}

	public void setValidDate(Timestamp validDate) {
		this.validDate = validDate;
	}

	public Integer getYr() {
		return this.yr;
	}

	public void setYr(Integer yr) {
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