package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the toxic_biota_visit1 database table.
 * 
 */
//@Entity
@Table(name="toxic_biota_visit1")
@NamedQuery(name="ToxicBiotaVisit1.findAll", query="SELECT t FROM ToxicBiotaVisit1 t")
public class ToxicBiotaVisit1 implements Serializable {
	private static final long serialVersionUID = 1L;

	private Timestamp mdate;

	@Column(name="sam_no")
	private BigDecimal samNo;

	@Column(name="sp_name")
	private String spName;

	private BigDecimal stime;

	private String wcz;

	private String zone;

	public ToxicBiotaVisit1() {
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getSamNo() {
		return this.samNo;
	}

	public void setSamNo(BigDecimal samNo) {
		this.samNo = samNo;
	}

	public String getSpName() {
		return this.spName;
	}

	public void setSpName(String spName) {
		this.spName = spName;
	}

	public BigDecimal getStime() {
		return this.stime;
	}

	public void setStime(BigDecimal stime) {
		this.stime = stime;
	}

	public String getWcz() {
		return this.wcz;
	}

	public void setWcz(String wcz) {
		this.wcz = wcz;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}