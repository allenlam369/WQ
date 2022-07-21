package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the river_water_wqo_sum_r1 database table.
 * 
 */
//@Entity
@Table(name="river_water_wqo_sum_r1")
@NamedQuery(name="RiverWaterWqoSumR1.findAll", query="SELECT r FROM RiverWaterWqoSumR1 r")
public class RiverWaterWqoSumR1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="amd_ss")
	private BigDecimal amdSs;

	@Column(name="m_bod5")
	private Long mBod5;

	@Column(name="m_cod")
	private Long mCod;

	@Column(name="m_do")
	private Long mDo;

	@Column(name="m_nh4")
	private Long mNh4;

	@Column(name="m_ph")
	private Long mPh;

	@Column(name="max_aam_nh3")
	private BigDecimal maxAamNh3;

	@Column(name="max_amd_ss")
	private BigDecimal maxAmdSs;

	@Column(name="max_bod5")
	private BigDecimal maxBod5;

	@Column(name="max_cod")
	private BigDecimal maxCod;

	@Column(name="max_nh4")
	private BigDecimal maxNh4;

	@Column(name="max_ph")
	private BigDecimal maxPh;

	@Column(name="min_do")
	private BigDecimal minDo;

	@Column(name="min_ph")
	private BigDecimal minPh;

	@Column(name="n_bod5")
	private Long nBod5;

	@Column(name="n_cod")
	private Long nCod;

	@Column(name="n_do")
	private Long nDo;

	@Column(name="n_nh4")
	private Long nNh4;

	@Column(name="n_ph")
	private Long nPh;

	@Column(name="n_ss")
	private Long nSs;

	@Column(name="nh3_aam")
	private BigDecimal nh3Aam;

	@Column(name="rate_4wqo")
	private BigDecimal rate4wqo;

	@Column(name="rate_5wqo")
	private BigDecimal rate5wqo;

	@Column(name="rate_6wqo")
	private BigDecimal rate6wqo;

	@Column(name="rate_bod5")
	private BigDecimal rateBod5;

	@Column(name="rate_cod")
	private BigDecimal rateCod;

	@Column(name="rate_do")
	private BigDecimal rateDo;

	@Column(name="rate_nh3_aam")
	private Integer rateNh3Aam;

	@Column(name="rate_nh4")
	private BigDecimal rateNh4;

	@Column(name="rate_ph")
	private BigDecimal ratePh;

	@Column(name="rate_ss_amd")
	private BigDecimal rateSsAmd;

	private String river;

	private Long total;

	private double yr;

	private String zone;

	public RiverWaterWqoSumR1() {
	}

	public BigDecimal getAmdSs() {
		return this.amdSs;
	}

	public void setAmdSs(BigDecimal amdSs) {
		this.amdSs = amdSs;
	}

	public Long getMBod5() {
		return this.mBod5;
	}

	public void setMBod5(Long mBod5) {
		this.mBod5 = mBod5;
	}

	public Long getMCod() {
		return this.mCod;
	}

	public void setMCod(Long mCod) {
		this.mCod = mCod;
	}

	public Long getMDo() {
		return this.mDo;
	}

	public void setMDo(Long mDo) {
		this.mDo = mDo;
	}

	public Long getMNh4() {
		return this.mNh4;
	}

	public void setMNh4(Long mNh4) {
		this.mNh4 = mNh4;
	}

	public Long getMPh() {
		return this.mPh;
	}

	public void setMPh(Long mPh) {
		this.mPh = mPh;
	}

	public BigDecimal getMaxAamNh3() {
		return this.maxAamNh3;
	}

	public void setMaxAamNh3(BigDecimal maxAamNh3) {
		this.maxAamNh3 = maxAamNh3;
	}

	public BigDecimal getMaxAmdSs() {
		return this.maxAmdSs;
	}

	public void setMaxAmdSs(BigDecimal maxAmdSs) {
		this.maxAmdSs = maxAmdSs;
	}

	public BigDecimal getMaxBod5() {
		return this.maxBod5;
	}

	public void setMaxBod5(BigDecimal maxBod5) {
		this.maxBod5 = maxBod5;
	}

	public BigDecimal getMaxCod() {
		return this.maxCod;
	}

	public void setMaxCod(BigDecimal maxCod) {
		this.maxCod = maxCod;
	}

	public BigDecimal getMaxNh4() {
		return this.maxNh4;
	}

	public void setMaxNh4(BigDecimal maxNh4) {
		this.maxNh4 = maxNh4;
	}

	public BigDecimal getMaxPh() {
		return this.maxPh;
	}

	public void setMaxPh(BigDecimal maxPh) {
		this.maxPh = maxPh;
	}

	public BigDecimal getMinDo() {
		return this.minDo;
	}

	public void setMinDo(BigDecimal minDo) {
		this.minDo = minDo;
	}

	public BigDecimal getMinPh() {
		return this.minPh;
	}

	public void setMinPh(BigDecimal minPh) {
		this.minPh = minPh;
	}

	public Long getNBod5() {
		return this.nBod5;
	}

	public void setNBod5(Long nBod5) {
		this.nBod5 = nBod5;
	}

	public Long getNCod() {
		return this.nCod;
	}

	public void setNCod(Long nCod) {
		this.nCod = nCod;
	}

	public Long getNDo() {
		return this.nDo;
	}

	public void setNDo(Long nDo) {
		this.nDo = nDo;
	}

	public Long getNNh4() {
		return this.nNh4;
	}

	public void setNNh4(Long nNh4) {
		this.nNh4 = nNh4;
	}

	public Long getNPh() {
		return this.nPh;
	}

	public void setNPh(Long nPh) {
		this.nPh = nPh;
	}

	public Long getNSs() {
		return this.nSs;
	}

	public void setNSs(Long nSs) {
		this.nSs = nSs;
	}

	public BigDecimal getNh3Aam() {
		return this.nh3Aam;
	}

	public void setNh3Aam(BigDecimal nh3Aam) {
		this.nh3Aam = nh3Aam;
	}

	public BigDecimal getRate4wqo() {
		return this.rate4wqo;
	}

	public void setRate4wqo(BigDecimal rate4wqo) {
		this.rate4wqo = rate4wqo;
	}

	public BigDecimal getRate5wqo() {
		return this.rate5wqo;
	}

	public void setRate5wqo(BigDecimal rate5wqo) {
		this.rate5wqo = rate5wqo;
	}

	public BigDecimal getRate6wqo() {
		return this.rate6wqo;
	}

	public void setRate6wqo(BigDecimal rate6wqo) {
		this.rate6wqo = rate6wqo;
	}

	public BigDecimal getRateBod5() {
		return this.rateBod5;
	}

	public void setRateBod5(BigDecimal rateBod5) {
		this.rateBod5 = rateBod5;
	}

	public BigDecimal getRateCod() {
		return this.rateCod;
	}

	public void setRateCod(BigDecimal rateCod) {
		this.rateCod = rateCod;
	}

	public BigDecimal getRateDo() {
		return this.rateDo;
	}

	public void setRateDo(BigDecimal rateDo) {
		this.rateDo = rateDo;
	}

	public Integer getRateNh3Aam() {
		return this.rateNh3Aam;
	}

	public void setRateNh3Aam(Integer rateNh3Aam) {
		this.rateNh3Aam = rateNh3Aam;
	}

	public BigDecimal getRateNh4() {
		return this.rateNh4;
	}

	public void setRateNh4(BigDecimal rateNh4) {
		this.rateNh4 = rateNh4;
	}

	public BigDecimal getRatePh() {
		return this.ratePh;
	}

	public void setRatePh(BigDecimal ratePh) {
		this.ratePh = ratePh;
	}

	public BigDecimal getRateSsAmd() {
		return this.rateSsAmd;
	}

	public void setRateSsAmd(BigDecimal rateSsAmd) {
		this.rateSsAmd = rateSsAmd;
	}

	public String getRiver() {
		return this.river;
	}

	public void setRiver(String river) {
		this.river = river;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}