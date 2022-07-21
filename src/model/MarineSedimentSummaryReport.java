package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the marine_sediment_summary_report database table.
 * 
 */
//@Entity
@Table(name="marine_sediment_summary_report")
@NamedQuery(name="MarineSedimentSummaryReport.findAll", query="SELECT m FROM MarineSedimentSummaryReport m")
public class MarineSedimentSummaryReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ag_avg")
	private BigDecimal agAvg;

	@Column(name="ag_max")
	private BigDecimal agMax;

	@Column(name="ag_min")
	private BigDecimal agMin;

	@Column(name="ars_avg")
	private BigDecimal arsAvg;

	@Column(name="ars_max")
	private BigDecimal arsMax;

	@Column(name="ars_min")
	private BigDecimal arsMin;

	@Column(name="cd_avg")
	private BigDecimal cdAvg;

	@Column(name="cd_max")
	private BigDecimal cdMax;

	@Column(name="cd_min")
	private BigDecimal cdMin;

	@Column(name="cn_avg")
	private BigDecimal cnAvg;

	@Column(name="cn_max")
	private BigDecimal cnMax;

	@Column(name="cn_min")
	private BigDecimal cnMin;

	@Column(name="cod_avg")
	private BigDecimal codAvg;

	@Column(name="cod_max")
	private BigDecimal codMax;

	@Column(name="cod_min")
	private BigDecimal codMin;

	@Column(name="cr_avg")
	private BigDecimal crAvg;

	@Column(name="cr_max")
	private BigDecimal crMax;

	@Column(name="cr_min")
	private BigDecimal crMin;

	@Column(name="cu_avg")
	private BigDecimal cuAvg;

	@Column(name="cu_max")
	private BigDecimal cuMax;

	@Column(name="cu_min")
	private BigDecimal cuMin;

	@Column(name="eh_avg")
	private BigDecimal ehAvg;

	@Column(name="eh_max")
	private BigDecimal ehMax;

	@Column(name="eh_min")
	private BigDecimal ehMin;

	@Column(name="hg_avg")
	private BigDecimal hgAvg;

	@Column(name="hg_max")
	private BigDecimal hgMax;

	@Column(name="hg_min")
	private BigDecimal hgMin;

	@Column(name="ins_avg")
	private BigDecimal insAvg;

	@Column(name="ins_max")
	private BigDecimal insMax;

	@Column(name="ins_min")
	private BigDecimal insMin;

	@Column(name="l_ag_avg")
	private String lAgAvg;

	@Column(name="l_ag_max")
	private String lAgMax;

	@Column(name="l_ag_min")
	private String lAgMin;

	@Column(name="l_ars_avg")
	private String lArsAvg;

	@Column(name="l_ars_max")
	private String lArsMax;

	@Column(name="l_ars_min")
	private String lArsMin;

	@Column(name="l_cd_avg")
	private String lCdAvg;

	@Column(name="l_cd_max")
	private String lCdMax;

	@Column(name="l_cd_min")
	private String lCdMin;

	@Column(name="l_cn_avg")
	private String lCnAvg;

	@Column(name="l_cn_max")
	private String lCnMax;

	@Column(name="l_cn_min")
	private String lCnMin;

	@Column(name="l_cod_avg")
	private String lCodAvg;

	@Column(name="l_cod_max")
	private String lCodMax;

	@Column(name="l_cod_min")
	private String lCodMin;

	@Column(name="l_cr_avg")
	private String lCrAvg;

	@Column(name="l_cr_max")
	private String lCrMax;

	@Column(name="l_cr_min")
	private String lCrMin;

	@Column(name="l_cu_avg")
	private String lCuAvg;

	@Column(name="l_cu_max")
	private String lCuMax;

	@Column(name="l_cu_min")
	private String lCuMin;

	@Column(name="l_hg_avg")
	private String lHgAvg;

	@Column(name="l_hg_max")
	private String lHgMax;

	@Column(name="l_hg_min")
	private String lHgMin;

	@Column(name="l_ins_avg")
	private String lInsAvg;

	@Column(name="l_ins_max")
	private String lInsMax;

	@Column(name="l_ins_min")
	private String lInsMin;

	@Column(name="l_nh_avg")
	private String lNhAvg;

	@Column(name="l_nh_max")
	private String lNhMax;

	@Column(name="l_nh_min")
	private String lNhMin;

	@Column(name="l_ni_avg")
	private String lNiAvg;

	@Column(name="l_ni_max")
	private String lNiMax;

	@Column(name="l_ni_min")
	private String lNiMin;

	@Column(name="l_pb_avg")
	private String lPbAvg;

	@Column(name="l_pb_max")
	private String lPbMax;

	@Column(name="l_pb_min")
	private String lPbMin;

	@Column(name="l_tc_avg")
	private String lTcAvg;

	@Column(name="l_tc_max")
	private String lTcMax;

	@Column(name="l_tc_min")
	private String lTcMin;

	@Column(name="l_tkn_avg")
	private String lTknAvg;

	@Column(name="l_tkn_max")
	private String lTknMax;

	@Column(name="l_tkn_min")
	private String lTknMin;

	@Column(name="l_tp_avg")
	private String lTpAvg;

	@Column(name="l_tp_max")
	private String lTpMax;

	@Column(name="l_tp_min")
	private String lTpMin;

	@Column(name="l_ts_avg")
	private String lTsAvg;

	@Column(name="l_ts_max")
	private String lTsMax;

	@Column(name="l_ts_min")
	private String lTsMin;

	@Column(name="l_tvs_avg")
	private String lTvsAvg;

	@Column(name="l_tvs_max")
	private String lTvsMax;

	@Column(name="l_tvs_min")
	private String lTvsMin;

	@Column(name="l_zn_avg")
	private String lZnAvg;

	@Column(name="l_zn_max")
	private String lZnMax;

	@Column(name="l_zn_min")
	private String lZnMin;

	@Column(name="nh_avg")
	private BigDecimal nhAvg;

	@Column(name="nh_max")
	private BigDecimal nhMax;

	@Column(name="nh_min")
	private BigDecimal nhMin;

	@Column(name="ni_avg")
	private BigDecimal niAvg;

	@Column(name="ni_max")
	private BigDecimal niMax;

	@Column(name="ni_min")
	private BigDecimal niMin;

	@Column(name="pb_avg")
	private BigDecimal pbAvg;

	@Column(name="pb_max")
	private BigDecimal pbMax;

	@Column(name="pb_min")
	private BigDecimal pbMin;

	private String station;

	@Column(name="sum10hmpah_avg")
	private BigDecimal sum10hmpahAvg;

	@Column(name="sum10hmpah_max")
	private BigDecimal sum10hmpahMax;

	@Column(name="sum10hmpah_min")
	private BigDecimal sum10hmpahMin;

	@Column(name="sum18pcb_avg")
	private BigDecimal sum18pcbAvg;

	@Column(name="sum18pcb_max")
	private BigDecimal sum18pcbMax;

	@Column(name="sum18pcb_min")
	private BigDecimal sum18pcbMin;

	@Column(name="sum6lmpah_avg")
	private BigDecimal sum6lmpahAvg;

	@Column(name="sum6lmpah_max")
	private BigDecimal sum6lmpahMax;

	@Column(name="sum6lmpah_min")
	private BigDecimal sum6lmpahMin;

	@Column(name="sz_63_avg")
	private BigDecimal sz63Avg;

	@Column(name="sz_63_max")
	private BigDecimal sz63Max;

	@Column(name="sz_63_min")
	private BigDecimal sz63Min;

	@Column(name="tc_avg")
	private BigDecimal tcAvg;

	@Column(name="tc_max")
	private BigDecimal tcMax;

	@Column(name="tc_min")
	private BigDecimal tcMin;

	@Column(name="tkn_avg")
	private BigDecimal tknAvg;

	@Column(name="tkn_max")
	private BigDecimal tknMax;

	@Column(name="tkn_min")
	private BigDecimal tknMin;

	private Integer total;

	@Column(name="tp_avg")
	private BigDecimal tpAvg;

	@Column(name="tp_max")
	private BigDecimal tpMax;

	@Column(name="tp_min")
	private BigDecimal tpMin;

	@Column(name="ts_avg")
	private BigDecimal tsAvg;

	@Column(name="ts_max")
	private BigDecimal tsMax;

	@Column(name="ts_min")
	private BigDecimal tsMin;

	@Column(name="tvs_avg")
	private BigDecimal tvsAvg;

	@Column(name="tvs_max")
	private BigDecimal tvsMax;

	@Column(name="tvs_min")
	private BigDecimal tvsMin;

	private String type;

	@Column(name="valid_date")
	private Timestamp validDate;

	private Integer yr;

	@Column(name="zn_avg")
	private BigDecimal znAvg;

	@Column(name="zn_max")
	private BigDecimal znMax;

	@Column(name="zn_min")
	private BigDecimal znMin;

	private String zone;

	public MarineSedimentSummaryReport() {
	}

	public BigDecimal getAgAvg() {
		return this.agAvg;
	}

	public void setAgAvg(BigDecimal agAvg) {
		this.agAvg = agAvg;
	}

	public BigDecimal getAgMax() {
		return this.agMax;
	}

	public void setAgMax(BigDecimal agMax) {
		this.agMax = agMax;
	}

	public BigDecimal getAgMin() {
		return this.agMin;
	}

	public void setAgMin(BigDecimal agMin) {
		this.agMin = agMin;
	}

	public BigDecimal getArsAvg() {
		return this.arsAvg;
	}

	public void setArsAvg(BigDecimal arsAvg) {
		this.arsAvg = arsAvg;
	}

	public BigDecimal getArsMax() {
		return this.arsMax;
	}

	public void setArsMax(BigDecimal arsMax) {
		this.arsMax = arsMax;
	}

	public BigDecimal getArsMin() {
		return this.arsMin;
	}

	public void setArsMin(BigDecimal arsMin) {
		this.arsMin = arsMin;
	}

	public BigDecimal getCdAvg() {
		return this.cdAvg;
	}

	public void setCdAvg(BigDecimal cdAvg) {
		this.cdAvg = cdAvg;
	}

	public BigDecimal getCdMax() {
		return this.cdMax;
	}

	public void setCdMax(BigDecimal cdMax) {
		this.cdMax = cdMax;
	}

	public BigDecimal getCdMin() {
		return this.cdMin;
	}

	public void setCdMin(BigDecimal cdMin) {
		this.cdMin = cdMin;
	}

	public BigDecimal getCnAvg() {
		return this.cnAvg;
	}

	public void setCnAvg(BigDecimal cnAvg) {
		this.cnAvg = cnAvg;
	}

	public BigDecimal getCnMax() {
		return this.cnMax;
	}

	public void setCnMax(BigDecimal cnMax) {
		this.cnMax = cnMax;
	}

	public BigDecimal getCnMin() {
		return this.cnMin;
	}

	public void setCnMin(BigDecimal cnMin) {
		this.cnMin = cnMin;
	}

	public BigDecimal getCodAvg() {
		return this.codAvg;
	}

	public void setCodAvg(BigDecimal codAvg) {
		this.codAvg = codAvg;
	}

	public BigDecimal getCodMax() {
		return this.codMax;
	}

	public void setCodMax(BigDecimal codMax) {
		this.codMax = codMax;
	}

	public BigDecimal getCodMin() {
		return this.codMin;
	}

	public void setCodMin(BigDecimal codMin) {
		this.codMin = codMin;
	}

	public BigDecimal getCrAvg() {
		return this.crAvg;
	}

	public void setCrAvg(BigDecimal crAvg) {
		this.crAvg = crAvg;
	}

	public BigDecimal getCrMax() {
		return this.crMax;
	}

	public void setCrMax(BigDecimal crMax) {
		this.crMax = crMax;
	}

	public BigDecimal getCrMin() {
		return this.crMin;
	}

	public void setCrMin(BigDecimal crMin) {
		this.crMin = crMin;
	}

	public BigDecimal getCuAvg() {
		return this.cuAvg;
	}

	public void setCuAvg(BigDecimal cuAvg) {
		this.cuAvg = cuAvg;
	}

	public BigDecimal getCuMax() {
		return this.cuMax;
	}

	public void setCuMax(BigDecimal cuMax) {
		this.cuMax = cuMax;
	}

	public BigDecimal getCuMin() {
		return this.cuMin;
	}

	public void setCuMin(BigDecimal cuMin) {
		this.cuMin = cuMin;
	}

	public BigDecimal getEhAvg() {
		return this.ehAvg;
	}

	public void setEhAvg(BigDecimal ehAvg) {
		this.ehAvg = ehAvg;
	}

	public BigDecimal getEhMax() {
		return this.ehMax;
	}

	public void setEhMax(BigDecimal ehMax) {
		this.ehMax = ehMax;
	}

	public BigDecimal getEhMin() {
		return this.ehMin;
	}

	public void setEhMin(BigDecimal ehMin) {
		this.ehMin = ehMin;
	}

	public BigDecimal getHgAvg() {
		return this.hgAvg;
	}

	public void setHgAvg(BigDecimal hgAvg) {
		this.hgAvg = hgAvg;
	}

	public BigDecimal getHgMax() {
		return this.hgMax;
	}

	public void setHgMax(BigDecimal hgMax) {
		this.hgMax = hgMax;
	}

	public BigDecimal getHgMin() {
		return this.hgMin;
	}

	public void setHgMin(BigDecimal hgMin) {
		this.hgMin = hgMin;
	}

	public BigDecimal getInsAvg() {
		return this.insAvg;
	}

	public void setInsAvg(BigDecimal insAvg) {
		this.insAvg = insAvg;
	}

	public BigDecimal getInsMax() {
		return this.insMax;
	}

	public void setInsMax(BigDecimal insMax) {
		this.insMax = insMax;
	}

	public BigDecimal getInsMin() {
		return this.insMin;
	}

	public void setInsMin(BigDecimal insMin) {
		this.insMin = insMin;
	}

	public String getLAgAvg() {
		return this.lAgAvg;
	}

	public void setLAgAvg(String lAgAvg) {
		this.lAgAvg = lAgAvg;
	}

	public String getLAgMax() {
		return this.lAgMax;
	}

	public void setLAgMax(String lAgMax) {
		this.lAgMax = lAgMax;
	}

	public String getLAgMin() {
		return this.lAgMin;
	}

	public void setLAgMin(String lAgMin) {
		this.lAgMin = lAgMin;
	}

	public String getLArsAvg() {
		return this.lArsAvg;
	}

	public void setLArsAvg(String lArsAvg) {
		this.lArsAvg = lArsAvg;
	}

	public String getLArsMax() {
		return this.lArsMax;
	}

	public void setLArsMax(String lArsMax) {
		this.lArsMax = lArsMax;
	}

	public String getLArsMin() {
		return this.lArsMin;
	}

	public void setLArsMin(String lArsMin) {
		this.lArsMin = lArsMin;
	}

	public String getLCdAvg() {
		return this.lCdAvg;
	}

	public void setLCdAvg(String lCdAvg) {
		this.lCdAvg = lCdAvg;
	}

	public String getLCdMax() {
		return this.lCdMax;
	}

	public void setLCdMax(String lCdMax) {
		this.lCdMax = lCdMax;
	}

	public String getLCdMin() {
		return this.lCdMin;
	}

	public void setLCdMin(String lCdMin) {
		this.lCdMin = lCdMin;
	}

	public String getLCnAvg() {
		return this.lCnAvg;
	}

	public void setLCnAvg(String lCnAvg) {
		this.lCnAvg = lCnAvg;
	}

	public String getLCnMax() {
		return this.lCnMax;
	}

	public void setLCnMax(String lCnMax) {
		this.lCnMax = lCnMax;
	}

	public String getLCnMin() {
		return this.lCnMin;
	}

	public void setLCnMin(String lCnMin) {
		this.lCnMin = lCnMin;
	}

	public String getLCodAvg() {
		return this.lCodAvg;
	}

	public void setLCodAvg(String lCodAvg) {
		this.lCodAvg = lCodAvg;
	}

	public String getLCodMax() {
		return this.lCodMax;
	}

	public void setLCodMax(String lCodMax) {
		this.lCodMax = lCodMax;
	}

	public String getLCodMin() {
		return this.lCodMin;
	}

	public void setLCodMin(String lCodMin) {
		this.lCodMin = lCodMin;
	}

	public String getLCrAvg() {
		return this.lCrAvg;
	}

	public void setLCrAvg(String lCrAvg) {
		this.lCrAvg = lCrAvg;
	}

	public String getLCrMax() {
		return this.lCrMax;
	}

	public void setLCrMax(String lCrMax) {
		this.lCrMax = lCrMax;
	}

	public String getLCrMin() {
		return this.lCrMin;
	}

	public void setLCrMin(String lCrMin) {
		this.lCrMin = lCrMin;
	}

	public String getLCuAvg() {
		return this.lCuAvg;
	}

	public void setLCuAvg(String lCuAvg) {
		this.lCuAvg = lCuAvg;
	}

	public String getLCuMax() {
		return this.lCuMax;
	}

	public void setLCuMax(String lCuMax) {
		this.lCuMax = lCuMax;
	}

	public String getLCuMin() {
		return this.lCuMin;
	}

	public void setLCuMin(String lCuMin) {
		this.lCuMin = lCuMin;
	}

	public String getLHgAvg() {
		return this.lHgAvg;
	}

	public void setLHgAvg(String lHgAvg) {
		this.lHgAvg = lHgAvg;
	}

	public String getLHgMax() {
		return this.lHgMax;
	}

	public void setLHgMax(String lHgMax) {
		this.lHgMax = lHgMax;
	}

	public String getLHgMin() {
		return this.lHgMin;
	}

	public void setLHgMin(String lHgMin) {
		this.lHgMin = lHgMin;
	}

	public String getLInsAvg() {
		return this.lInsAvg;
	}

	public void setLInsAvg(String lInsAvg) {
		this.lInsAvg = lInsAvg;
	}

	public String getLInsMax() {
		return this.lInsMax;
	}

	public void setLInsMax(String lInsMax) {
		this.lInsMax = lInsMax;
	}

	public String getLInsMin() {
		return this.lInsMin;
	}

	public void setLInsMin(String lInsMin) {
		this.lInsMin = lInsMin;
	}

	public String getLNhAvg() {
		return this.lNhAvg;
	}

	public void setLNhAvg(String lNhAvg) {
		this.lNhAvg = lNhAvg;
	}

	public String getLNhMax() {
		return this.lNhMax;
	}

	public void setLNhMax(String lNhMax) {
		this.lNhMax = lNhMax;
	}

	public String getLNhMin() {
		return this.lNhMin;
	}

	public void setLNhMin(String lNhMin) {
		this.lNhMin = lNhMin;
	}

	public String getLNiAvg() {
		return this.lNiAvg;
	}

	public void setLNiAvg(String lNiAvg) {
		this.lNiAvg = lNiAvg;
	}

	public String getLNiMax() {
		return this.lNiMax;
	}

	public void setLNiMax(String lNiMax) {
		this.lNiMax = lNiMax;
	}

	public String getLNiMin() {
		return this.lNiMin;
	}

	public void setLNiMin(String lNiMin) {
		this.lNiMin = lNiMin;
	}

	public String getLPbAvg() {
		return this.lPbAvg;
	}

	public void setLPbAvg(String lPbAvg) {
		this.lPbAvg = lPbAvg;
	}

	public String getLPbMax() {
		return this.lPbMax;
	}

	public void setLPbMax(String lPbMax) {
		this.lPbMax = lPbMax;
	}

	public String getLPbMin() {
		return this.lPbMin;
	}

	public void setLPbMin(String lPbMin) {
		this.lPbMin = lPbMin;
	}

	public String getLTcAvg() {
		return this.lTcAvg;
	}

	public void setLTcAvg(String lTcAvg) {
		this.lTcAvg = lTcAvg;
	}

	public String getLTcMax() {
		return this.lTcMax;
	}

	public void setLTcMax(String lTcMax) {
		this.lTcMax = lTcMax;
	}

	public String getLTcMin() {
		return this.lTcMin;
	}

	public void setLTcMin(String lTcMin) {
		this.lTcMin = lTcMin;
	}

	public String getLTknAvg() {
		return this.lTknAvg;
	}

	public void setLTknAvg(String lTknAvg) {
		this.lTknAvg = lTknAvg;
	}

	public String getLTknMax() {
		return this.lTknMax;
	}

	public void setLTknMax(String lTknMax) {
		this.lTknMax = lTknMax;
	}

	public String getLTknMin() {
		return this.lTknMin;
	}

	public void setLTknMin(String lTknMin) {
		this.lTknMin = lTknMin;
	}

	public String getLTpAvg() {
		return this.lTpAvg;
	}

	public void setLTpAvg(String lTpAvg) {
		this.lTpAvg = lTpAvg;
	}

	public String getLTpMax() {
		return this.lTpMax;
	}

	public void setLTpMax(String lTpMax) {
		this.lTpMax = lTpMax;
	}

	public String getLTpMin() {
		return this.lTpMin;
	}

	public void setLTpMin(String lTpMin) {
		this.lTpMin = lTpMin;
	}

	public String getLTsAvg() {
		return this.lTsAvg;
	}

	public void setLTsAvg(String lTsAvg) {
		this.lTsAvg = lTsAvg;
	}

	public String getLTsMax() {
		return this.lTsMax;
	}

	public void setLTsMax(String lTsMax) {
		this.lTsMax = lTsMax;
	}

	public String getLTsMin() {
		return this.lTsMin;
	}

	public void setLTsMin(String lTsMin) {
		this.lTsMin = lTsMin;
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

	public String getLZnAvg() {
		return this.lZnAvg;
	}

	public void setLZnAvg(String lZnAvg) {
		this.lZnAvg = lZnAvg;
	}

	public String getLZnMax() {
		return this.lZnMax;
	}

	public void setLZnMax(String lZnMax) {
		this.lZnMax = lZnMax;
	}

	public String getLZnMin() {
		return this.lZnMin;
	}

	public void setLZnMin(String lZnMin) {
		this.lZnMin = lZnMin;
	}

	public BigDecimal getNhAvg() {
		return this.nhAvg;
	}

	public void setNhAvg(BigDecimal nhAvg) {
		this.nhAvg = nhAvg;
	}

	public BigDecimal getNhMax() {
		return this.nhMax;
	}

	public void setNhMax(BigDecimal nhMax) {
		this.nhMax = nhMax;
	}

	public BigDecimal getNhMin() {
		return this.nhMin;
	}

	public void setNhMin(BigDecimal nhMin) {
		this.nhMin = nhMin;
	}

	public BigDecimal getNiAvg() {
		return this.niAvg;
	}

	public void setNiAvg(BigDecimal niAvg) {
		this.niAvg = niAvg;
	}

	public BigDecimal getNiMax() {
		return this.niMax;
	}

	public void setNiMax(BigDecimal niMax) {
		this.niMax = niMax;
	}

	public BigDecimal getNiMin() {
		return this.niMin;
	}

	public void setNiMin(BigDecimal niMin) {
		this.niMin = niMin;
	}

	public BigDecimal getPbAvg() {
		return this.pbAvg;
	}

	public void setPbAvg(BigDecimal pbAvg) {
		this.pbAvg = pbAvg;
	}

	public BigDecimal getPbMax() {
		return this.pbMax;
	}

	public void setPbMax(BigDecimal pbMax) {
		this.pbMax = pbMax;
	}

	public BigDecimal getPbMin() {
		return this.pbMin;
	}

	public void setPbMin(BigDecimal pbMin) {
		this.pbMin = pbMin;
	}

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public BigDecimal getSum10hmpahAvg() {
		return this.sum10hmpahAvg;
	}

	public void setSum10hmpahAvg(BigDecimal sum10hmpahAvg) {
		this.sum10hmpahAvg = sum10hmpahAvg;
	}

	public BigDecimal getSum10hmpahMax() {
		return this.sum10hmpahMax;
	}

	public void setSum10hmpahMax(BigDecimal sum10hmpahMax) {
		this.sum10hmpahMax = sum10hmpahMax;
	}

	public BigDecimal getSum10hmpahMin() {
		return this.sum10hmpahMin;
	}

	public void setSum10hmpahMin(BigDecimal sum10hmpahMin) {
		this.sum10hmpahMin = sum10hmpahMin;
	}

	public BigDecimal getSum18pcbAvg() {
		return this.sum18pcbAvg;
	}

	public void setSum18pcbAvg(BigDecimal sum18pcbAvg) {
		this.sum18pcbAvg = sum18pcbAvg;
	}

	public BigDecimal getSum18pcbMax() {
		return this.sum18pcbMax;
	}

	public void setSum18pcbMax(BigDecimal sum18pcbMax) {
		this.sum18pcbMax = sum18pcbMax;
	}

	public BigDecimal getSum18pcbMin() {
		return this.sum18pcbMin;
	}

	public void setSum18pcbMin(BigDecimal sum18pcbMin) {
		this.sum18pcbMin = sum18pcbMin;
	}

	public BigDecimal getSum6lmpahAvg() {
		return this.sum6lmpahAvg;
	}

	public void setSum6lmpahAvg(BigDecimal sum6lmpahAvg) {
		this.sum6lmpahAvg = sum6lmpahAvg;
	}

	public BigDecimal getSum6lmpahMax() {
		return this.sum6lmpahMax;
	}

	public void setSum6lmpahMax(BigDecimal sum6lmpahMax) {
		this.sum6lmpahMax = sum6lmpahMax;
	}

	public BigDecimal getSum6lmpahMin() {
		return this.sum6lmpahMin;
	}

	public void setSum6lmpahMin(BigDecimal sum6lmpahMin) {
		this.sum6lmpahMin = sum6lmpahMin;
	}

	public BigDecimal getSz63Avg() {
		return this.sz63Avg;
	}

	public void setSz63Avg(BigDecimal sz63Avg) {
		this.sz63Avg = sz63Avg;
	}

	public BigDecimal getSz63Max() {
		return this.sz63Max;
	}

	public void setSz63Max(BigDecimal sz63Max) {
		this.sz63Max = sz63Max;
	}

	public BigDecimal getSz63Min() {
		return this.sz63Min;
	}

	public void setSz63Min(BigDecimal sz63Min) {
		this.sz63Min = sz63Min;
	}

	public BigDecimal getTcAvg() {
		return this.tcAvg;
	}

	public void setTcAvg(BigDecimal tcAvg) {
		this.tcAvg = tcAvg;
	}

	public BigDecimal getTcMax() {
		return this.tcMax;
	}

	public void setTcMax(BigDecimal tcMax) {
		this.tcMax = tcMax;
	}

	public BigDecimal getTcMin() {
		return this.tcMin;
	}

	public void setTcMin(BigDecimal tcMin) {
		this.tcMin = tcMin;
	}

	public BigDecimal getTknAvg() {
		return this.tknAvg;
	}

	public void setTknAvg(BigDecimal tknAvg) {
		this.tknAvg = tknAvg;
	}

	public BigDecimal getTknMax() {
		return this.tknMax;
	}

	public void setTknMax(BigDecimal tknMax) {
		this.tknMax = tknMax;
	}

	public BigDecimal getTknMin() {
		return this.tknMin;
	}

	public void setTknMin(BigDecimal tknMin) {
		this.tknMin = tknMin;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public BigDecimal getTpAvg() {
		return this.tpAvg;
	}

	public void setTpAvg(BigDecimal tpAvg) {
		this.tpAvg = tpAvg;
	}

	public BigDecimal getTpMax() {
		return this.tpMax;
	}

	public void setTpMax(BigDecimal tpMax) {
		this.tpMax = tpMax;
	}

	public BigDecimal getTpMin() {
		return this.tpMin;
	}

	public void setTpMin(BigDecimal tpMin) {
		this.tpMin = tpMin;
	}

	public BigDecimal getTsAvg() {
		return this.tsAvg;
	}

	public void setTsAvg(BigDecimal tsAvg) {
		this.tsAvg = tsAvg;
	}

	public BigDecimal getTsMax() {
		return this.tsMax;
	}

	public void setTsMax(BigDecimal tsMax) {
		this.tsMax = tsMax;
	}

	public BigDecimal getTsMin() {
		return this.tsMin;
	}

	public void setTsMin(BigDecimal tsMin) {
		this.tsMin = tsMin;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
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

	public BigDecimal getZnAvg() {
		return this.znAvg;
	}

	public void setZnAvg(BigDecimal znAvg) {
		this.znAvg = znAvg;
	}

	public BigDecimal getZnMax() {
		return this.znMax;
	}

	public void setZnMax(BigDecimal znMax) {
		this.znMax = znMax;
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