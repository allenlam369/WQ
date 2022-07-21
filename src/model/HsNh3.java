package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the hs_nh3 database table.
 * 
 */
//@Entity
@Table(name="hs_nh3")
@NamedQuery(name="HsNh3.findAll", query="SELECT h FROM HsNh3 h")
public class HsNh3 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="depth_code")
	private String depthCode;

	@Column(name="l_nh3")
	private String lNh3;

	@Column(name="l_nh4")
	private String lNh4;

	@Column(name="mwvisit_id")
	private String mwvisitId;

	private BigDecimal nh3;

	private BigDecimal nh4;

	private BigDecimal ph;

	private BigDecimal sal;

	private BigDecimal temper;

	public HsNh3() {
	}

	public String getDepthCode() {
		return this.depthCode;
	}

	public void setDepthCode(String depthCode) {
		this.depthCode = depthCode;
	}

	public String getLNh3() {
		return this.lNh3;
	}

	public void setLNh3(String lNh3) {
		this.lNh3 = lNh3;
	}

	public String getLNh4() {
		return this.lNh4;
	}

	public void setLNh4(String lNh4) {
		this.lNh4 = lNh4;
	}

	public String getMwvisitId() {
		return this.mwvisitId;
	}

	public void setMwvisitId(String mwvisitId) {
		this.mwvisitId = mwvisitId;
	}

	public BigDecimal getNh3() {
		return this.nh3;
	}

	public void setNh3(BigDecimal nh3) {
		this.nh3 = nh3;
	}

	public BigDecimal getNh4() {
		return this.nh4;
	}

	public void setNh4(BigDecimal nh4) {
		this.nh4 = nh4;
	}

	public BigDecimal getPh() {
		return this.ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public BigDecimal getSal() {
		return this.sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

	public BigDecimal getTemper() {
		return this.temper;
	}

	public void setTemper(BigDecimal temper) {
		this.temper = temper;
	}

}