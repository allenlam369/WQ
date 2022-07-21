package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_beach_r_m_l_sal database table.
 * 
 */
//@Entity
@Table(name="bm_beach_r_m_l_sal")
@NamedQuery(name="BmBeachRMLSal.findAll", query="SELECT b FROM BmBeachRMLSal b")
public class BmBeachRMLSal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="beach_code")
	private String beachCode;

	@Column(name="bmvisit_id")
	private String bmvisitId;

	@Column(name="sal_l")
	private BigDecimal salL;

	@Column(name="sal_m")
	private BigDecimal salM;

	@Column(name="sal_r")
	private BigDecimal salR;

	@Column(name="sample_date")
	private Timestamp sampleDate;

	public BmBeachRMLSal() {
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

	public BigDecimal getSalL() {
		return this.salL;
	}

	public void setSalL(BigDecimal salL) {
		this.salL = salL;
	}

	public BigDecimal getSalM() {
		return this.salM;
	}

	public void setSalM(BigDecimal salM) {
		this.salM = salM;
	}

	public BigDecimal getSalR() {
		return this.salR;
	}

	public void setSalR(BigDecimal salR) {
		this.salR = salR;
	}

	public Timestamp getSampleDate() {
		return this.sampleDate;
	}

	public void setSampleDate(Timestamp sampleDate) {
		this.sampleDate = sampleDate;
	}

}