package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_mlab_med_a database table.
 * 
 */
//@Entity
@Table(name="rw_mlab_med_a")
@NamedQuery(name="RwMlabMedA.findAll", query="SELECT r FROM RwMlabMedA r")
public class RwMlabMedA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bod5_med")
	private BigDecimal bod5Med;

	@Column(name="ec_med")
	private BigDecimal ecMed;

	@Column(name="fc_med")
	private BigDecimal fcMed;

	@Column(name="l_bod5_med")
	private String lBod5Med;

	@Column(name="l_ec_med")
	private String lEcMed;

	@Column(name="l_fc_med")
	private String lFcMed;

	@Column(name="site_id")
	private BigDecimal siteId;

	private Long total;

	private double yr;

	public RwMlabMedA() {
	}

	public BigDecimal getBod5Med() {
		return this.bod5Med;
	}

	public void setBod5Med(BigDecimal bod5Med) {
		this.bod5Med = bod5Med;
	}

	public BigDecimal getEcMed() {
		return this.ecMed;
	}

	public void setEcMed(BigDecimal ecMed) {
		this.ecMed = ecMed;
	}

	public BigDecimal getFcMed() {
		return this.fcMed;
	}

	public void setFcMed(BigDecimal fcMed) {
		this.fcMed = fcMed;
	}

	public String getLBod5Med() {
		return this.lBod5Med;
	}

	public void setLBod5Med(String lBod5Med) {
		this.lBod5Med = lBod5Med;
	}

	public String getLEcMed() {
		return this.lEcMed;
	}

	public void setLEcMed(String lEcMed) {
		this.lEcMed = lEcMed;
	}

	public String getLFcMed() {
		return this.lFcMed;
	}

	public void setLFcMed(String lFcMed) {
		this.lFcMed = lFcMed;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
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

}