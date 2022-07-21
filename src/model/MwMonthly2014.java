package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mw_monthly_2014 database table.
 * 
 */
//@Entity
@Table(name="mw_monthly_2014")
@NamedQuery(name="MwMonthly2014.findAll", query="SELECT m FROM MwMonthly2014 m")
public class MwMonthly2014 implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal measure;

	private Integer mth;

	@Column(name="mwvisit_id")
	private String mwvisitId;

	private String para;

	@Column(name="site_id")
	private BigDecimal siteId;

	private String station;

	private Integer yr;

	public MwMonthly2014() {
	}

	public BigDecimal getMeasure() {
		return this.measure;
	}

	public void setMeasure(BigDecimal measure) {
		this.measure = measure;
	}

	public Integer getMth() {
		return this.mth;
	}

	public void setMth(Integer mth) {
		this.mth = mth;
	}

	public String getMwvisitId() {
		return this.mwvisitId;
	}

	public void setMwvisitId(String mwvisitId) {
		this.mwvisitId = mwvisitId;
	}

	public String getPara() {
		return this.para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public Integer getYr() {
		return this.yr;
	}

	public void setYr(Integer yr) {
		this.yr = yr;
	}

}