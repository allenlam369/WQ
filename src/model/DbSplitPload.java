package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the db_split_pload database table.
 * 
 */
//@Entity
@Table(name="db_split_pload")
@NamedQuery(name="DbSplitPload.findAll", query="SELECT d FROM DbSplitPload d")
public class DbSplitPload implements Serializable {
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

	private String scenario;

	private String site;

	private BigDecimal year;

	public DbSplitPload() {
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

	public String getScenario() {
		return this.scenario;
	}

	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public BigDecimal getYear() {
		return this.year;
	}

	public void setYear(BigDecimal year) {
		this.year = year;
	}

}