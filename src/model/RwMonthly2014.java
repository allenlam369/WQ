package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_monthly_2014 database table.
 * 
 */
//@Entity
@Table(name="rw_monthly_2014")
@NamedQuery(name="RwMonthly2014.findAll", query="SELECT r FROM RwMonthly2014 r")
public class RwMonthly2014 implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal measure;

	private Integer mth;

	private String para;

	private String river;

	@Column(name="rwvisit_id")
	private String rwvisitId;

	@Column(name="site_id")
	private BigDecimal siteId;

	private String station;

	private Integer yr;

	public RwMonthly2014() {
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

	public String getPara() {
		return this.para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public String getRiver() {
		return this.river;
	}

	public void setRiver(String river) {
		this.river = river;
	}

	public String getRwvisitId() {
		return this.rwvisitId;
	}

	public void setRwvisitId(String rwvisitId) {
		this.rwvisitId = rwvisitId;
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