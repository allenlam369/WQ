package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the db_potential_load database table.
 * 
 */
//@Entity
@Table(name="db_potential_load")
@NamedQuery(name="DbPotentialLoad.findAll", query="SELECT d FROM DbPotentialLoad d")
public class DbPotentialLoad implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;

	@Column(name="pl_bod")
	private BigDecimal plBod;

	@Column(name="pl_ec")
	private BigDecimal plEc;

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

	private String scenario;

	private String sname;

	private BigDecimal year;

	public DbPotentialLoad() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPlBod() {
		return this.plBod;
	}

	public void setPlBod(BigDecimal plBod) {
		this.plBod = plBod;
	}

	public BigDecimal getPlEc() {
		return this.plEc;
	}

	public void setPlEc(BigDecimal plEc) {
		this.plEc = plEc;
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

	public String getScenario() {
		return this.scenario;
	}

	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public BigDecimal getYear() {
		return this.year;
	}

	public void setYear(BigDecimal year) {
		this.year = year;
	}

}