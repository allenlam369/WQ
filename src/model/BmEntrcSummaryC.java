package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_entrc_summary_c database table.
 * 
 */
@Entity
@Table(name="bm_entrc_summary_c")
@NamedQuery(name="BmEntrcSummaryC.findAll", query="SELECT b FROM BmEntrcSummaryC b")
public class BmEntrcSummaryC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="adj_log_gm")
	private BigDecimal adjLogGm;

	@Column(name="beach_code")
	private String beachCode;

	@Column(name="bmvisit_id")
	private String bmvisitId;

	@Column(name="g_mean")
	private BigDecimal gMean;

	@Id
	private Integer id;

	@Column(name="log_g_mean")
	private BigDecimal logGMean;

	@Column(name="move_avg")
	private BigDecimal moveAvg;

	@Column(name="r_g_mean")
	private BigDecimal rGMean;

	@Column(name="sample_date")
	private Timestamp sampleDate;

	@Column(name="valid_code")
	private Integer validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public BmEntrcSummaryC() {
	}

	public BigDecimal getAdjLogGm() {
		return this.adjLogGm;
	}

	public void setAdjLogGm(BigDecimal adjLogGm) {
		this.adjLogGm = adjLogGm;
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

	public BigDecimal getGMean() {
		return this.gMean;
	}

	public void setGMean(BigDecimal gMean) {
		this.gMean = gMean;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getLogGMean() {
		return this.logGMean;
	}

	public void setLogGMean(BigDecimal logGMean) {
		this.logGMean = logGMean;
	}

	public BigDecimal getMoveAvg() {
		return this.moveAvg;
	}

	public void setMoveAvg(BigDecimal moveAvg) {
		this.moveAvg = moveAvg;
	}

	public BigDecimal getRGMean() {
		return this.rGMean;
	}

	public void setRGMean(BigDecimal rGMean) {
		this.rGMean = rGMean;
	}

	public Timestamp getSampleDate() {
		return this.sampleDate;
	}

	public void setSampleDate(Timestamp sampleDate) {
		this.sampleDate = sampleDate;
	}

	public Integer getValidCode() {
		return this.validCode;
	}

	public void setValidCode(Integer validCode) {
		this.validCode = validCode;
	}

	public Timestamp getValidDate() {
		return this.validDate;
	}

	public void setValidDate(Timestamp validDate) {
		this.validDate = validDate;
	}

	public String getValidUser() {
		return this.validUser;
	}

	public void setValidUser(String validUser) {
		this.validUser = validUser;
	}

}