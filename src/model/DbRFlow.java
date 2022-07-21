package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the db_r_flow database table.
 * 
 */
//@Entity
@Table(name="db_r_flow")
@NamedQuery(name="DbRFlow.findAll", query="SELECT d FROM DbRFlow d")
public class DbRFlow implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal depth;

	private BigDecimal flow;

	private Timestamp mdate;

	@Column(name="river_id")
	private BigDecimal riverId;

	@Column(name="river_name")
	private String riverName;

	private String scode;

	private BigDecimal time;

	public DbRFlow() {
	}

	public BigDecimal getDepth() {
		return this.depth;
	}

	public void setDepth(BigDecimal depth) {
		this.depth = depth;
	}

	public BigDecimal getFlow() {
		return this.flow;
	}

	public void setFlow(BigDecimal flow) {
		this.flow = flow;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getRiverId() {
		return this.riverId;
	}

	public void setRiverId(BigDecimal riverId) {
		this.riverId = riverId;
	}

	public String getRiverName() {
		return this.riverName;
	}

	public void setRiverName(String riverName) {
		this.riverName = riverName;
	}

	public String getScode() {
		return this.scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}

	public BigDecimal getTime() {
		return this.time;
	}

	public void setTime(BigDecimal time) {
		this.time = time;
	}

}