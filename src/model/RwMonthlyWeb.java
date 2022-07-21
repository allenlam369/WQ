package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the rw_monthly_web database table.
 * 
 */
//@Entity
@Table(name="rw_monthly_web")
@NamedQuery(name="RwMonthlyWeb.findAll", query="SELECT r FROM RwMonthlyWeb r")
public class RwMonthlyWeb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"DO\"")
	private BigDecimal do_;

	private BigDecimal ec;

	private Timestamp mdate;

	private BigDecimal ph;

	private String river;

	private BigDecimal sal;

	private String station;

	public RwMonthlyWeb() {
	}

	public BigDecimal getDo_() {
		return this.do_;
	}

	public void setDo_(BigDecimal do_) {
		this.do_ = do_;
	}

	public BigDecimal getEc() {
		return this.ec;
	}

	public void setEc(BigDecimal ec) {
		this.ec = ec;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getPh() {
		return this.ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public String getRiver() {
		return this.river;
	}

	public void setRiver(String river) {
		this.river = river;
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

}