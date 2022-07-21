package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the marine_water_summary_report database table.
 * 
 */
//@Entity
@Table(name="marine_water_summary_report")
@NamedQuery(name="MarineWaterSummaryReport.findAll", query="SELECT m FROM MarineWaterSummaryReport m")
public class MarineWaterSummaryReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bod5_avg")
	private BigDecimal bod5Avg;

	@Column(name="bod5_max")
	private BigDecimal bod5Max;

	@Column(name="bod5_min")
	private BigDecimal bod5Min;

	@Column(name="chl_avg")
	private BigDecimal chlAvg;

	@Column(name="chl_max")
	private BigDecimal chlMax;

	@Column(name="chl_min")
	private BigDecimal chlMin;

	@Column(name="d_code")
	private String dCode;

	@Column(name="do_avg")
	private BigDecimal doAvg;

	@Column(name="do_max")
	private BigDecimal doMax;

	@Column(name="do_min")
	private BigDecimal doMin;

	@Column(name="do_sat_avg")
	private BigDecimal doSatAvg;

	@Column(name="do_sat_max")
	private BigDecimal doSatMax;

	@Column(name="do_sat_min")
	private BigDecimal doSatMin;

	@Column(name="ecoli_avg")
	private BigDecimal ecoliAvg;

	@Column(name="ecoli_max")
	private BigDecimal ecoliMax;

	@Column(name="ecoli_min")
	private BigDecimal ecoliMin;

	@Column(name="fc_avg")
	private BigDecimal fcAvg;

	@Column(name="fc_max")
	private BigDecimal fcMax;

	@Column(name="fc_min")
	private BigDecimal fcMin;

	@Column(name="l_bod5_avg")
	private String lBod5Avg;

	@Column(name="l_bod5_max")
	private String lBod5Max;

	@Column(name="l_bod5_min")
	private String lBod5Min;

	@Column(name="l_chl_avg")
	private String lChlAvg;

	@Column(name="l_chl_max")
	private String lChlMax;

	@Column(name="l_chl_min")
	private String lChlMin;

	@Column(name="l_ecoli_avg")
	private String lEcoliAvg;

	@Column(name="l_ecoli_max")
	private String lEcoliMax;

	@Column(name="l_ecoli_min")
	private String lEcoliMin;

	@Column(name="l_fc_avg")
	private String lFcAvg;

	@Column(name="l_fc_max")
	private String lFcMax;

	@Column(name="l_fc_min")
	private String lFcMin;

	@Column(name="l_nh4_avg")
	private String lNh4Avg;

	@Column(name="l_nh4_max")
	private String lNh4Max;

	@Column(name="l_nh4_min")
	private String lNh4Min;

	@Column(name="l_no2_avg")
	private String lNo2Avg;

	@Column(name="l_no2_max")
	private String lNo2Max;

	@Column(name="l_no2_min")
	private String lNo2Min;

	@Column(name="l_no3_avg")
	private String lNo3Avg;

	@Column(name="l_no3_max")
	private String lNo3Max;

	@Column(name="l_no3_min")
	private String lNo3Min;

	@Column(name="l_po4_avg")
	private String lPo4Avg;

	@Column(name="l_po4_max")
	private String lPo4Max;

	@Column(name="l_po4_min")
	private String lPo4Min;

	@Column(name="l_sio2_avg")
	private String lSio2Avg;

	@Column(name="l_sio2_max")
	private String lSio2Max;

	@Column(name="l_sio2_min")
	private String lSio2Min;

	@Column(name="l_ss_avg")
	private String lSsAvg;

	@Column(name="l_ss_max")
	private String lSsMax;

	@Column(name="l_ss_min")
	private String lSsMin;

	@Column(name="l_tkn_sp_avg")
	private String lTknSpAvg;

	@Column(name="l_tkn_sp_max")
	private String lTknSpMax;

	@Column(name="l_tkn_sp_min")
	private String lTknSpMin;

	@Column(name="l_tp_sp_avg")
	private String lTpSpAvg;

	@Column(name="l_tp_sp_max")
	private String lTpSpMax;

	@Column(name="l_tp_sp_min")
	private String lTpSpMin;

	@Column(name="l_tvs_avg")
	private String lTvsAvg;

	@Column(name="l_tvs_max")
	private String lTvsMax;

	@Column(name="l_tvs_min")
	private String lTvsMin;

	@Column(name="nh3_avg")
	private BigDecimal nh3Avg;

	@Column(name="nh3_max")
	private BigDecimal nh3Max;

	@Column(name="nh3_min")
	private BigDecimal nh3Min;

	@Column(name="nh4_avg")
	private BigDecimal nh4Avg;

	@Column(name="nh4_max")
	private BigDecimal nh4Max;

	@Column(name="nh4_min")
	private BigDecimal nh4Min;

	@Column(name="no2_avg")
	private BigDecimal no2Avg;

	@Column(name="no2_max")
	private BigDecimal no2Max;

	@Column(name="no2_min")
	private BigDecimal no2Min;

	@Column(name="no3_avg")
	private BigDecimal no3Avg;

	@Column(name="no3_max")
	private BigDecimal no3Max;

	@Column(name="no3_min")
	private BigDecimal no3Min;

	@Column(name="ph_sc_avg")
	private BigDecimal phScAvg;

	@Column(name="ph_sc_max")
	private BigDecimal phScMax;

	@Column(name="ph_sc_min")
	private BigDecimal phScMin;

	@Column(name="po4_avg")
	private BigDecimal po4Avg;

	@Column(name="po4_max")
	private BigDecimal po4Max;

	@Column(name="po4_min")
	private BigDecimal po4Min;

	@Column(name="sal_avg")
	private BigDecimal salAvg;

	@Column(name="sal_max")
	private BigDecimal salMax;

	@Column(name="sal_min")
	private BigDecimal salMin;

	@Column(name="sd_avg")
	private BigDecimal sdAvg;

	@Column(name="sd_max")
	private BigDecimal sdMax;

	@Column(name="sd_min")
	private BigDecimal sdMin;

	@Column(name="sio2_avg")
	private BigDecimal sio2Avg;

	@Column(name="sio2_max")
	private BigDecimal sio2Max;

	@Column(name="sio2_min")
	private BigDecimal sio2Min;

	@Column(name="ss_avg")
	private BigDecimal ssAvg;

	@Column(name="ss_max")
	private BigDecimal ssMax;

	@Column(name="ss_min")
	private BigDecimal ssMin;

	private String station;

	@Column(name="temper_avg")
	private BigDecimal temperAvg;

	@Column(name="temper_max")
	private BigDecimal temperMax;

	@Column(name="temper_min")
	private BigDecimal temperMin;

	@Column(name="tin_avg")
	private BigDecimal tinAvg;

	@Column(name="tin_max")
	private BigDecimal tinMax;

	@Column(name="tin_min")
	private BigDecimal tinMin;

	@Column(name="tkn_sp_avg")
	private BigDecimal tknSpAvg;

	@Column(name="tkn_sp_max")
	private BigDecimal tknSpMax;

	@Column(name="tkn_sp_min")
	private BigDecimal tknSpMin;

	@Column(name="tn_avg")
	private BigDecimal tnAvg;

	@Column(name="tn_max")
	private BigDecimal tnMax;

	@Column(name="tn_min")
	private BigDecimal tnMin;

	private Integer total;

	@Column(name="tp_sp_avg")
	private BigDecimal tpSpAvg;

	@Column(name="tp_sp_max")
	private BigDecimal tpSpMax;

	@Column(name="tp_sp_min")
	private BigDecimal tpSpMin;

	@Column(name="turb_sc_avg")
	private BigDecimal turbScAvg;

	@Column(name="turb_sc_max")
	private BigDecimal turbScMax;

	@Column(name="turb_sc_min")
	private BigDecimal turbScMin;

	@Column(name="tvs_avg")
	private BigDecimal tvsAvg;

	@Column(name="tvs_max")
	private BigDecimal tvsMax;

	@Column(name="tvs_min")
	private BigDecimal tvsMin;

	@Column(name="valid_date")
	private Timestamp validDate;

	private Integer yr;

	private String zone;

	public MarineWaterSummaryReport() {
	}

	public BigDecimal getBod5Avg() {
		return this.bod5Avg;
	}

	public void setBod5Avg(BigDecimal bod5Avg) {
		this.bod5Avg = bod5Avg;
	}

	public BigDecimal getBod5Max() {
		return this.bod5Max;
	}

	public void setBod5Max(BigDecimal bod5Max) {
		this.bod5Max = bod5Max;
	}

	public BigDecimal getBod5Min() {
		return this.bod5Min;
	}

	public void setBod5Min(BigDecimal bod5Min) {
		this.bod5Min = bod5Min;
	}

	public BigDecimal getChlAvg() {
		return this.chlAvg;
	}

	public void setChlAvg(BigDecimal chlAvg) {
		this.chlAvg = chlAvg;
	}

	public BigDecimal getChlMax() {
		return this.chlMax;
	}

	public void setChlMax(BigDecimal chlMax) {
		this.chlMax = chlMax;
	}

	public BigDecimal getChlMin() {
		return this.chlMin;
	}

	public void setChlMin(BigDecimal chlMin) {
		this.chlMin = chlMin;
	}

	public String getDCode() {
		return this.dCode;
	}

	public void setDCode(String dCode) {
		this.dCode = dCode;
	}

	public BigDecimal getDoAvg() {
		return this.doAvg;
	}

	public void setDoAvg(BigDecimal doAvg) {
		this.doAvg = doAvg;
	}

	public BigDecimal getDoMax() {
		return this.doMax;
	}

	public void setDoMax(BigDecimal doMax) {
		this.doMax = doMax;
	}

	public BigDecimal getDoMin() {
		return this.doMin;
	}

	public void setDoMin(BigDecimal doMin) {
		this.doMin = doMin;
	}

	public BigDecimal getDoSatAvg() {
		return this.doSatAvg;
	}

	public void setDoSatAvg(BigDecimal doSatAvg) {
		this.doSatAvg = doSatAvg;
	}

	public BigDecimal getDoSatMax() {
		return this.doSatMax;
	}

	public void setDoSatMax(BigDecimal doSatMax) {
		this.doSatMax = doSatMax;
	}

	public BigDecimal getDoSatMin() {
		return this.doSatMin;
	}

	public void setDoSatMin(BigDecimal doSatMin) {
		this.doSatMin = doSatMin;
	}

	public BigDecimal getEcoliAvg() {
		return this.ecoliAvg;
	}

	public void setEcoliAvg(BigDecimal ecoliAvg) {
		this.ecoliAvg = ecoliAvg;
	}

	public BigDecimal getEcoliMax() {
		return this.ecoliMax;
	}

	public void setEcoliMax(BigDecimal ecoliMax) {
		this.ecoliMax = ecoliMax;
	}

	public BigDecimal getEcoliMin() {
		return this.ecoliMin;
	}

	public void setEcoliMin(BigDecimal ecoliMin) {
		this.ecoliMin = ecoliMin;
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

	public String getLBod5Avg() {
		return this.lBod5Avg;
	}

	public void setLBod5Avg(String lBod5Avg) {
		this.lBod5Avg = lBod5Avg;
	}

	public String getLBod5Max() {
		return this.lBod5Max;
	}

	public void setLBod5Max(String lBod5Max) {
		this.lBod5Max = lBod5Max;
	}

	public String getLBod5Min() {
		return this.lBod5Min;
	}

	public void setLBod5Min(String lBod5Min) {
		this.lBod5Min = lBod5Min;
	}

	public String getLChlAvg() {
		return this.lChlAvg;
	}

	public void setLChlAvg(String lChlAvg) {
		this.lChlAvg = lChlAvg;
	}

	public String getLChlMax() {
		return this.lChlMax;
	}

	public void setLChlMax(String lChlMax) {
		this.lChlMax = lChlMax;
	}

	public String getLChlMin() {
		return this.lChlMin;
	}

	public void setLChlMin(String lChlMin) {
		this.lChlMin = lChlMin;
	}

	public String getLEcoliAvg() {
		return this.lEcoliAvg;
	}

	public void setLEcoliAvg(String lEcoliAvg) {
		this.lEcoliAvg = lEcoliAvg;
	}

	public String getLEcoliMax() {
		return this.lEcoliMax;
	}

	public void setLEcoliMax(String lEcoliMax) {
		this.lEcoliMax = lEcoliMax;
	}

	public String getLEcoliMin() {
		return this.lEcoliMin;
	}

	public void setLEcoliMin(String lEcoliMin) {
		this.lEcoliMin = lEcoliMin;
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

	public String getLNh4Avg() {
		return this.lNh4Avg;
	}

	public void setLNh4Avg(String lNh4Avg) {
		this.lNh4Avg = lNh4Avg;
	}

	public String getLNh4Max() {
		return this.lNh4Max;
	}

	public void setLNh4Max(String lNh4Max) {
		this.lNh4Max = lNh4Max;
	}

	public String getLNh4Min() {
		return this.lNh4Min;
	}

	public void setLNh4Min(String lNh4Min) {
		this.lNh4Min = lNh4Min;
	}

	public String getLNo2Avg() {
		return this.lNo2Avg;
	}

	public void setLNo2Avg(String lNo2Avg) {
		this.lNo2Avg = lNo2Avg;
	}

	public String getLNo2Max() {
		return this.lNo2Max;
	}

	public void setLNo2Max(String lNo2Max) {
		this.lNo2Max = lNo2Max;
	}

	public String getLNo2Min() {
		return this.lNo2Min;
	}

	public void setLNo2Min(String lNo2Min) {
		this.lNo2Min = lNo2Min;
	}

	public String getLNo3Avg() {
		return this.lNo3Avg;
	}

	public void setLNo3Avg(String lNo3Avg) {
		this.lNo3Avg = lNo3Avg;
	}

	public String getLNo3Max() {
		return this.lNo3Max;
	}

	public void setLNo3Max(String lNo3Max) {
		this.lNo3Max = lNo3Max;
	}

	public String getLNo3Min() {
		return this.lNo3Min;
	}

	public void setLNo3Min(String lNo3Min) {
		this.lNo3Min = lNo3Min;
	}

	public String getLPo4Avg() {
		return this.lPo4Avg;
	}

	public void setLPo4Avg(String lPo4Avg) {
		this.lPo4Avg = lPo4Avg;
	}

	public String getLPo4Max() {
		return this.lPo4Max;
	}

	public void setLPo4Max(String lPo4Max) {
		this.lPo4Max = lPo4Max;
	}

	public String getLPo4Min() {
		return this.lPo4Min;
	}

	public void setLPo4Min(String lPo4Min) {
		this.lPo4Min = lPo4Min;
	}

	public String getLSio2Avg() {
		return this.lSio2Avg;
	}

	public void setLSio2Avg(String lSio2Avg) {
		this.lSio2Avg = lSio2Avg;
	}

	public String getLSio2Max() {
		return this.lSio2Max;
	}

	public void setLSio2Max(String lSio2Max) {
		this.lSio2Max = lSio2Max;
	}

	public String getLSio2Min() {
		return this.lSio2Min;
	}

	public void setLSio2Min(String lSio2Min) {
		this.lSio2Min = lSio2Min;
	}

	public String getLSsAvg() {
		return this.lSsAvg;
	}

	public void setLSsAvg(String lSsAvg) {
		this.lSsAvg = lSsAvg;
	}

	public String getLSsMax() {
		return this.lSsMax;
	}

	public void setLSsMax(String lSsMax) {
		this.lSsMax = lSsMax;
	}

	public String getLSsMin() {
		return this.lSsMin;
	}

	public void setLSsMin(String lSsMin) {
		this.lSsMin = lSsMin;
	}

	public String getLTknSpAvg() {
		return this.lTknSpAvg;
	}

	public void setLTknSpAvg(String lTknSpAvg) {
		this.lTknSpAvg = lTknSpAvg;
	}

	public String getLTknSpMax() {
		return this.lTknSpMax;
	}

	public void setLTknSpMax(String lTknSpMax) {
		this.lTknSpMax = lTknSpMax;
	}

	public String getLTknSpMin() {
		return this.lTknSpMin;
	}

	public void setLTknSpMin(String lTknSpMin) {
		this.lTknSpMin = lTknSpMin;
	}

	public String getLTpSpAvg() {
		return this.lTpSpAvg;
	}

	public void setLTpSpAvg(String lTpSpAvg) {
		this.lTpSpAvg = lTpSpAvg;
	}

	public String getLTpSpMax() {
		return this.lTpSpMax;
	}

	public void setLTpSpMax(String lTpSpMax) {
		this.lTpSpMax = lTpSpMax;
	}

	public String getLTpSpMin() {
		return this.lTpSpMin;
	}

	public void setLTpSpMin(String lTpSpMin) {
		this.lTpSpMin = lTpSpMin;
	}

	public String getLTvsAvg() {
		return this.lTvsAvg;
	}

	public void setLTvsAvg(String lTvsAvg) {
		this.lTvsAvg = lTvsAvg;
	}

	public String getLTvsMax() {
		return this.lTvsMax;
	}

	public void setLTvsMax(String lTvsMax) {
		this.lTvsMax = lTvsMax;
	}

	public String getLTvsMin() {
		return this.lTvsMin;
	}

	public void setLTvsMin(String lTvsMin) {
		this.lTvsMin = lTvsMin;
	}

	public BigDecimal getNh3Avg() {
		return this.nh3Avg;
	}

	public void setNh3Avg(BigDecimal nh3Avg) {
		this.nh3Avg = nh3Avg;
	}

	public BigDecimal getNh3Max() {
		return this.nh3Max;
	}

	public void setNh3Max(BigDecimal nh3Max) {
		this.nh3Max = nh3Max;
	}

	public BigDecimal getNh3Min() {
		return this.nh3Min;
	}

	public void setNh3Min(BigDecimal nh3Min) {
		this.nh3Min = nh3Min;
	}

	public BigDecimal getNh4Avg() {
		return this.nh4Avg;
	}

	public void setNh4Avg(BigDecimal nh4Avg) {
		this.nh4Avg = nh4Avg;
	}

	public BigDecimal getNh4Max() {
		return this.nh4Max;
	}

	public void setNh4Max(BigDecimal nh4Max) {
		this.nh4Max = nh4Max;
	}

	public BigDecimal getNh4Min() {
		return this.nh4Min;
	}

	public void setNh4Min(BigDecimal nh4Min) {
		this.nh4Min = nh4Min;
	}

	public BigDecimal getNo2Avg() {
		return this.no2Avg;
	}

	public void setNo2Avg(BigDecimal no2Avg) {
		this.no2Avg = no2Avg;
	}

	public BigDecimal getNo2Max() {
		return this.no2Max;
	}

	public void setNo2Max(BigDecimal no2Max) {
		this.no2Max = no2Max;
	}

	public BigDecimal getNo2Min() {
		return this.no2Min;
	}

	public void setNo2Min(BigDecimal no2Min) {
		this.no2Min = no2Min;
	}

	public BigDecimal getNo3Avg() {
		return this.no3Avg;
	}

	public void setNo3Avg(BigDecimal no3Avg) {
		this.no3Avg = no3Avg;
	}

	public BigDecimal getNo3Max() {
		return this.no3Max;
	}

	public void setNo3Max(BigDecimal no3Max) {
		this.no3Max = no3Max;
	}

	public BigDecimal getNo3Min() {
		return this.no3Min;
	}

	public void setNo3Min(BigDecimal no3Min) {
		this.no3Min = no3Min;
	}

	public BigDecimal getPhScAvg() {
		return this.phScAvg;
	}

	public void setPhScAvg(BigDecimal phScAvg) {
		this.phScAvg = phScAvg;
	}

	public BigDecimal getPhScMax() {
		return this.phScMax;
	}

	public void setPhScMax(BigDecimal phScMax) {
		this.phScMax = phScMax;
	}

	public BigDecimal getPhScMin() {
		return this.phScMin;
	}

	public void setPhScMin(BigDecimal phScMin) {
		this.phScMin = phScMin;
	}

	public BigDecimal getPo4Avg() {
		return this.po4Avg;
	}

	public void setPo4Avg(BigDecimal po4Avg) {
		this.po4Avg = po4Avg;
	}

	public BigDecimal getPo4Max() {
		return this.po4Max;
	}

	public void setPo4Max(BigDecimal po4Max) {
		this.po4Max = po4Max;
	}

	public BigDecimal getPo4Min() {
		return this.po4Min;
	}

	public void setPo4Min(BigDecimal po4Min) {
		this.po4Min = po4Min;
	}

	public BigDecimal getSalAvg() {
		return this.salAvg;
	}

	public void setSalAvg(BigDecimal salAvg) {
		this.salAvg = salAvg;
	}

	public BigDecimal getSalMax() {
		return this.salMax;
	}

	public void setSalMax(BigDecimal salMax) {
		this.salMax = salMax;
	}

	public BigDecimal getSalMin() {
		return this.salMin;
	}

	public void setSalMin(BigDecimal salMin) {
		this.salMin = salMin;
	}

	public BigDecimal getSdAvg() {
		return this.sdAvg;
	}

	public void setSdAvg(BigDecimal sdAvg) {
		this.sdAvg = sdAvg;
	}

	public BigDecimal getSdMax() {
		return this.sdMax;
	}

	public void setSdMax(BigDecimal sdMax) {
		this.sdMax = sdMax;
	}

	public BigDecimal getSdMin() {
		return this.sdMin;
	}

	public void setSdMin(BigDecimal sdMin) {
		this.sdMin = sdMin;
	}

	public BigDecimal getSio2Avg() {
		return this.sio2Avg;
	}

	public void setSio2Avg(BigDecimal sio2Avg) {
		this.sio2Avg = sio2Avg;
	}

	public BigDecimal getSio2Max() {
		return this.sio2Max;
	}

	public void setSio2Max(BigDecimal sio2Max) {
		this.sio2Max = sio2Max;
	}

	public BigDecimal getSio2Min() {
		return this.sio2Min;
	}

	public void setSio2Min(BigDecimal sio2Min) {
		this.sio2Min = sio2Min;
	}

	public BigDecimal getSsAvg() {
		return this.ssAvg;
	}

	public void setSsAvg(BigDecimal ssAvg) {
		this.ssAvg = ssAvg;
	}

	public BigDecimal getSsMax() {
		return this.ssMax;
	}

	public void setSsMax(BigDecimal ssMax) {
		this.ssMax = ssMax;
	}

	public BigDecimal getSsMin() {
		return this.ssMin;
	}

	public void setSsMin(BigDecimal ssMin) {
		this.ssMin = ssMin;
	}

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public BigDecimal getTemperAvg() {
		return this.temperAvg;
	}

	public void setTemperAvg(BigDecimal temperAvg) {
		this.temperAvg = temperAvg;
	}

	public BigDecimal getTemperMax() {
		return this.temperMax;
	}

	public void setTemperMax(BigDecimal temperMax) {
		this.temperMax = temperMax;
	}

	public BigDecimal getTemperMin() {
		return this.temperMin;
	}

	public void setTemperMin(BigDecimal temperMin) {
		this.temperMin = temperMin;
	}

	public BigDecimal getTinAvg() {
		return this.tinAvg;
	}

	public void setTinAvg(BigDecimal tinAvg) {
		this.tinAvg = tinAvg;
	}

	public BigDecimal getTinMax() {
		return this.tinMax;
	}

	public void setTinMax(BigDecimal tinMax) {
		this.tinMax = tinMax;
	}

	public BigDecimal getTinMin() {
		return this.tinMin;
	}

	public void setTinMin(BigDecimal tinMin) {
		this.tinMin = tinMin;
	}

	public BigDecimal getTknSpAvg() {
		return this.tknSpAvg;
	}

	public void setTknSpAvg(BigDecimal tknSpAvg) {
		this.tknSpAvg = tknSpAvg;
	}

	public BigDecimal getTknSpMax() {
		return this.tknSpMax;
	}

	public void setTknSpMax(BigDecimal tknSpMax) {
		this.tknSpMax = tknSpMax;
	}

	public BigDecimal getTknSpMin() {
		return this.tknSpMin;
	}

	public void setTknSpMin(BigDecimal tknSpMin) {
		this.tknSpMin = tknSpMin;
	}

	public BigDecimal getTnAvg() {
		return this.tnAvg;
	}

	public void setTnAvg(BigDecimal tnAvg) {
		this.tnAvg = tnAvg;
	}

	public BigDecimal getTnMax() {
		return this.tnMax;
	}

	public void setTnMax(BigDecimal tnMax) {
		this.tnMax = tnMax;
	}

	public BigDecimal getTnMin() {
		return this.tnMin;
	}

	public void setTnMin(BigDecimal tnMin) {
		this.tnMin = tnMin;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public BigDecimal getTpSpAvg() {
		return this.tpSpAvg;
	}

	public void setTpSpAvg(BigDecimal tpSpAvg) {
		this.tpSpAvg = tpSpAvg;
	}

	public BigDecimal getTpSpMax() {
		return this.tpSpMax;
	}

	public void setTpSpMax(BigDecimal tpSpMax) {
		this.tpSpMax = tpSpMax;
	}

	public BigDecimal getTpSpMin() {
		return this.tpSpMin;
	}

	public void setTpSpMin(BigDecimal tpSpMin) {
		this.tpSpMin = tpSpMin;
	}

	public BigDecimal getTurbScAvg() {
		return this.turbScAvg;
	}

	public void setTurbScAvg(BigDecimal turbScAvg) {
		this.turbScAvg = turbScAvg;
	}

	public BigDecimal getTurbScMax() {
		return this.turbScMax;
	}

	public void setTurbScMax(BigDecimal turbScMax) {
		this.turbScMax = turbScMax;
	}

	public BigDecimal getTurbScMin() {
		return this.turbScMin;
	}

	public void setTurbScMin(BigDecimal turbScMin) {
		this.turbScMin = turbScMin;
	}

	public BigDecimal getTvsAvg() {
		return this.tvsAvg;
	}

	public void setTvsAvg(BigDecimal tvsAvg) {
		this.tvsAvg = tvsAvg;
	}

	public BigDecimal getTvsMax() {
		return this.tvsMax;
	}

	public void setTvsMax(BigDecimal tvsMax) {
		this.tvsMax = tvsMax;
	}

	public BigDecimal getTvsMin() {
		return this.tvsMin;
	}

	public void setTvsMin(BigDecimal tvsMin) {
		this.tvsMin = tvsMin;
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

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}