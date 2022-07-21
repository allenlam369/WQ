package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the db_m_ctd database table.
 * 
 */
//@Entity
@Table(name="db_m_ctd")
@NamedQuery(name="DbMCtd.findAll", query="SELECT d FROM DbMCtd d")
public class DbMCtd implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal cond;

	@Column(name="ctd_id")
	private BigDecimal ctdId;

	private BigDecimal sal;

	@Column(name="sample_depth")
	private BigDecimal sampleDepth;

	private BigDecimal temp;

	private String type;

	public DbMCtd() {
	}

	public BigDecimal getCond() {
		return this.cond;
	}

	public void setCond(BigDecimal cond) {
		this.cond = cond;
	}

	public BigDecimal getCtdId() {
		return this.ctdId;
	}

	public void setCtdId(BigDecimal ctdId) {
		this.ctdId = ctdId;
	}

	public BigDecimal getSal() {
		return this.sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

	public BigDecimal getSampleDepth() {
		return this.sampleDepth;
	}

	public void setSampleDepth(BigDecimal sampleDepth) {
		this.sampleDepth = sampleDepth;
	}

	public BigDecimal getTemp() {
		return this.temp;
	}

	public void setTemp(BigDecimal temp) {
		this.temp = temp;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}