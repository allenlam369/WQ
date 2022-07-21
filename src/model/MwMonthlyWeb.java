package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the mw_monthly_web database table.
 * 
 */
//@Entity
@Table(name="mw_monthly_web")
@NamedQuery(name="MwMonthlyWeb.findAll", query="SELECT m FROM MwMonthlyWeb m")
public class MwMonthlyWeb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"DO\"")
	private BigDecimal do_;

	private BigDecimal ecoli;

	private Timestamp mdate;

	@Column(name="ph_sc")
	private BigDecimal phSc;

	private BigDecimal sal;

	private String station;

	private String zone;

	public MwMonthlyWeb() {
	}

	public BigDecimal getDo_() {
		return this.do_;
	}

	public void setDo_(BigDecimal do_) {
		this.do_ = do_;
	}

	public BigDecimal getEcoli() {
		return this.ecoli;
	}

	public void setEcoli(BigDecimal ecoli) {
		this.ecoli = ecoli;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getPhSc() {
		return this.phSc;
	}

	public void setPhSc(BigDecimal phSc) {
		this.phSc = phSc;
	}

	public BigDecimal getSal() {
		return this.sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}