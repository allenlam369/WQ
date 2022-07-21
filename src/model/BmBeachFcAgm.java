package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bm_beach_fc_agm database table.
 * 
 */
//@Entity
@Table(name="bm_beach_fc_agm")
@NamedQuery(name="BmBeachFcAgm.findAll", query="SELECT b FROM BmBeachFcAgm b")
public class BmBeachFcAgm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="annual_g_mean_fc")
	private BigDecimal annualGMeanFc;

	@Column(name="annual_log_g_mean_fc")
	private BigDecimal annualLogGMeanFc;

	@Column(name="beach_code")
	private String beachCode;

	@Column(name="sample_count")
	private Long sampleCount;

	private String type;

	private double year;

	public BmBeachFcAgm() {
	}

	public BigDecimal getAnnualGMeanFc() {
		return this.annualGMeanFc;
	}

	public void setAnnualGMeanFc(BigDecimal annualGMeanFc) {
		this.annualGMeanFc = annualGMeanFc;
	}

	public BigDecimal getAnnualLogGMeanFc() {
		return this.annualLogGMeanFc;
	}

	public void setAnnualLogGMeanFc(BigDecimal annualLogGMeanFc) {
		this.annualLogGMeanFc = annualLogGMeanFc;
	}

	public String getBeachCode() {
		return this.beachCode;
	}

	public void setBeachCode(String beachCode) {
		this.beachCode = beachCode;
	}

	public Long getSampleCount() {
		return this.sampleCount;
	}

	public void setSampleCount(Long sampleCount) {
		this.sampleCount = sampleCount;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getYear() {
		return this.year;
	}

	public void setYear(double year) {
		this.year = year;
	}

}