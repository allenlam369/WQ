package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_mlab_med_test database table.
 * 
 */
//@Entity
@Table(name="rw_mlab_med_test")
@NamedQuery(name="RwMlabMedTest.findAll", query="SELECT r FROM RwMlabMedTest r")
public class RwMlabMedTest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bod5_med")
	private BigDecimal bod5Med;

	@Column(name="ec_med")
	private BigDecimal ecMed;

	@Column(name="fc_med")
	private BigDecimal fcMed;

	@Column(name="site_id")
	private BigDecimal siteId;

	private Integer yr;

	private Integer yyyy;

	public RwMlabMedTest() {
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

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public Integer getYr() {
		return this.yr;
	}

	public void setYr(Integer yr) {
		this.yr = yr;
	}

	public Integer getYyyy() {
		return this.yyyy;
	}

	public void setYyyy(Integer yyyy) {
		this.yyyy = yyyy;
	}

}