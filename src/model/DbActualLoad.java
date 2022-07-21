package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the db_actual_load database table.
 * 
 */
//@Entity
@Table(name="db_actual_load")
@NamedQuery(name="DbActualLoad.findAll", query="SELECT d FROM DbActualLoad d")
public class DbActualLoad implements Serializable {
	private static final long serialVersionUID = 1L;

	private Timestamp edate;

	@Column(name="pl_bod")
	private BigDecimal plBod;

	@Column(name="pl_cu_tot")
	private BigDecimal plCuTot;

	@Column(name="pl_flow")
	private BigDecimal plFlow;

	@Column(name="pl_tn")
	private BigDecimal plTn;

	@Column(name="pl_tp")
	private BigDecimal plTp;

	@Column(name="river_id")
	private BigDecimal riverId;

	@Column(name="river_name")
	private String riverName;

	private String scode;

	private Timestamp sdate;

	public DbActualLoad() {
	}

	public Timestamp getEdate() {
		return this.edate;
	}

	public void setEdate(Timestamp edate) {
		this.edate = edate;
	}

	public BigDecimal getPlBod() {
		return this.plBod;
	}

	public void setPlBod(BigDecimal plBod) {
		this.plBod = plBod;
	}

	public BigDecimal getPlCuTot() {
		return this.plCuTot;
	}

	public void setPlCuTot(BigDecimal plCuTot) {
		this.plCuTot = plCuTot;
	}

	public BigDecimal getPlFlow() {
		return this.plFlow;
	}

	public void setPlFlow(BigDecimal plFlow) {
		this.plFlow = plFlow;
	}

	public BigDecimal getPlTn() {
		return this.plTn;
	}

	public void setPlTn(BigDecimal plTn) {
		this.plTn = plTn;
	}

	public BigDecimal getPlTp() {
		return this.plTp;
	}

	public void setPlTp(BigDecimal plTp) {
		this.plTp = plTp;
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

	public Timestamp getSdate() {
		return this.sdate;
	}

	public void setSdate(Timestamp sdate) {
		this.sdate = sdate;
	}

}