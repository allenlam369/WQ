package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bm_visit_summary_temp99 database table.
 * 
 */
//@Entity
@Table(name="bm_visit_summary_temp99")
@NamedQuery(name="BmVisitSummaryTemp99.findAll", query="SELECT b FROM BmVisitSummaryTemp99 b")
public class BmVisitSummaryTemp99 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="adj_log_gm")
	private BigDecimal adjLogGm;

	@Column(name="adj_log_gm_fc")
	private BigDecimal adjLogGmFc;

	@Column(name="beach_code")
	private String beachCode;

	@Column(name="bmvisit_id")
	private String bmvisitId;

	@Column(name="\"DO\"")
	private BigDecimal do_;

	private BigDecimal dos;

	@Column(name="g_mean")
	private BigDecimal gMean;

	@Column(name="g_mean_fc")
	private BigDecimal gMeanFc;

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

	private BigDecimal temper;

	private BigDecimal turb;

	public BmVisitSummaryTemp99() {
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

	public String getBmvisitId() {
		return this.bmvisitId;
	}

	public void setBmvisitId(String bmvisitId) {
		this.bmvisitId = bmvisitId;
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