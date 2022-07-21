package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rtn_table_temp database table.
 * 
 */
//@Entity
@Table(name="rtn_table_temp")
@NamedQuery(name="RtnTableTemp.findAll", query="SELECT r FROM RtnTableTemp r")
public class RtnTableTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="adj_log_gm")
	private BigDecimal adjLogGm;

	@Column(name="adj_log_gm_fc")
	private BigDecimal adjLogGmFc;

	@Column(name="beach_code")
	private String beachCode;

	@Column(name="beach_group")
	private String beachGroup;

	@Column(name="beach_name")
	private String beachName;

	@Column(name="\"DO\"")
	private BigDecimal do_;

	private BigDecimal dos;

	@Column(name="g_mean")
	private BigDecimal gMean;

	@Column(name="g_mean_fc")
	private BigDecimal gMeanFc;

	@Column(name="hotline_district")
	private String hotlineDistrict;

	@Column(name="list_order_2")
	private String listOrder2;

	@Column(name="log_g_mean")
	private BigDecimal logGMean;

	@Column(name="log_g_mean_fc")
	private BigDecimal logGMeanFc;

	private BigDecimal ph;

	@Column(name="r_g_mean")
	private BigDecimal rGMean;

	@Column(name="r_g_mean_fc")
	private BigDecimal rGMeanFc;

	private BigDecimal rainfall;

	private BigDecimal sal;

	@Column(name="sal_l")
	private BigDecimal salL;

	@Column(name="sal_r")
	private BigDecimal salR;

	private String season;

	@Column(name="stat_order")
	private BigDecimal statOrder;

	private String statistics;

	private BigDecimal temper;

	private BigDecimal turb;

	public RtnTableTemp() {
	}

	public BigDecimal getAdjLogGm() {
		return this.adjLogGm;
	}

	public void setAdjLogGm(BigDecimal adjLogGm) {
		this.adjLogGm = adjLogGm;
	}

	public BigDecimal getAdjLogGmFc() {
		return this.adjLogGmFc;
	}

	public void setAdjLogGmFc(BigDecimal adjLogGmFc) {
		this.adjLogGmFc = adjLogGmFc;
	}

	public String getBeachCode() {
		return this.beachCode;
	}

	public void setBeachCode(String beachCode) {
		this.beachCode = beachCode;
	}

	public String getBeachGroup() {
		return this.beachGroup;
	}

	public void setBeachGroup(String beachGroup) {
		this.beachGroup = beachGroup;
	}

	public String getBeachName() {
		return this.beachName;
	}

	public void setBeachName(String beachName) {
		this.beachName = beachName;
	}

	public BigDecimal getDo_() {
		return this.do_;
	}

	public void setDo_(BigDecimal do_) {
		this.do_ = do_;
	}

	public BigDecimal getDos() {
		return this.dos;
	}

	public void setDos(BigDecimal dos) {
		this.dos = dos;
	}

	public BigDecimal getGMean() {
		return this.gMean;
	}

	public void setGMean(BigDecimal gMean) {
		this.gMean = gMean;
	}

	public BigDecimal getGMeanFc() {
		return this.gMeanFc;
	}

	public void setGMeanFc(BigDecimal gMeanFc) {
		this.gMeanFc = gMeanFc;
	}

	public String getHotlineDistrict() {
		return this.hotlineDistrict;
	}

	public void setHotlineDistrict(String hotlineDistrict) {
		this.hotlineDistrict = hotlineDistrict;
	}

	public String getListOrder2() {
		return this.listOrder2;
	}

	public void setListOrder2(String listOrder2) {
		this.listOrder2 = listOrder2;
	}

	public BigDecimal getLogGMean() {
		return this.logGMean;
	}

	public void setLogGMean(BigDecimal logGMean) {
		this.logGMean = logGMean;
	}

	public BigDecimal getLogGMeanFc() {
		return this.logGMeanFc;
	}

	public void setLogGMeanFc(BigDecimal logGMeanFc) {
		this.logGMeanFc = logGMeanFc;
	}

	public BigDecimal getPh() {
		return this.ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public BigDecimal getRGMean() {
		return this.rGMean;
	}

	public void setRGMean(BigDecimal rGMean) {
		this.rGMean = rGMean;
	}

	public BigDecimal getRGMeanFc() {
		return this.rGMeanFc;
	}

	public void setRGMeanFc(BigDecimal rGMeanFc) {
		this.rGMeanFc = rGMeanFc;
	}

	public BigDecimal getRainfall() {
		return this.rainfall;
	}

	public void setRainfall(BigDecimal rainfall) {
		this.rainfall = rainfall;
	}

	public BigDecimal getSal() {
		return this.sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

	public BigDecimal getSalL() {
		return this.salL;
	}

	public void setSalL(BigDecimal salL) {
		this.salL = salL;
	}

	public BigDecimal getSalR() {
		return this.salR;
	}

	public void setSalR(BigDecimal salR) {
		this.salR = salR;
	}

	public String getSeason() {
		return this.season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public BigDecimal getStatOrder() {
		return this.statOrder;
	}

	public void setStatOrder(BigDecimal statOrder) {
		this.statOrder = statOrder;
	}

	public String getStatistics() {
		return this.statistics;
	}

	public void setStatistics(String statistics) {
		this.statistics = statistics;
	}

	public BigDecimal getTemper() {
		return this.temper;
	}

	public void setTemper(BigDecimal temper) {
		this.temper = temper;
	}

	public BigDecimal getTurb() {
		return this.turb;
	}

	public void setTurb(BigDecimal turb) {
		this.turb = turb;
	}

}