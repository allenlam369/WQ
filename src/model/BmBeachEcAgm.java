package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bm_beach_ec_agm database table.
 * 
 */
//@Entity
@Table(name="bm_beach_ec_agm")
@NamedQuery(name="BmBeachEcAgm.findAll", query="SELECT b FROM BmBeachEcAgm b")
public class BmBeachEcAgm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="annual_g_mean")
	private BigDecimal annualGMean;

	@Column(name="annual_log_g_mean")
	private BigDecimal annualLogGMean;

	@Column(name="beach_code")
	private String beachCode;

	@Column(name="sample_count")
	private Long sampleCount;

	private String type;

	private double year;

	public BmBeachEcAgm() {
	}

	public BigDecimal getAnnualGMean() {
		return this.annualGMean;
	}

	public void setAnnualGMean(BigDecimal annualGMean) {
		this.annualGMean = annualGMean;
	}

	public BigDecimal getAnnualLogGMean() {
		return this.annualLogGMean;
	}

	public void setAnnualLogGMean(BigDecimal annualLogGMean) {
		this.annualLogGMean = annualLogGMean;
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