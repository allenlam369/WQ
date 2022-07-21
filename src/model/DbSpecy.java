package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the db_species database table.
 * 
 */
//@Entity
@Table(name="db_species")
@NamedQuery(name="DbSpecy.findAll", query="SELECT d FROM DbSpecy d")
public class DbSpecy implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal abundance;

	private String code;

	private BigDecimal density;

	private String genus;

	private Timestamp mdate;

	@Column(name="no_of_species")
	private BigDecimal noOfSpecies;

	@Column(name="r_density")
	private BigDecimal rDensity;

	private BigDecimal time;

	public DbSpecy() {
	}

	public BigDecimal getAbundance() {
		return this.abundance;
	}

	public void setAbundance(BigDecimal abundance) {
		this.abundance = abundance;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getDensity() {
		return this.density;
	}

	public void setDensity(BigDecimal density) {
		this.density = density;
	}

	public String getGenus() {
		return this.genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getNoOfSpecies() {
		return this.noOfSpecies;
	}

	public void setNoOfSpecies(BigDecimal noOfSpecies) {
		this.noOfSpecies = noOfSpecies;
	}

	public BigDecimal getRDensity() {
		return this.rDensity;
	}

	public void setRDensity(BigDecimal rDensity) {
		this.rDensity = rDensity;
	}

	public BigDecimal getTime() {
		return this.time;
	}

	public void setTime(BigDecimal time) {
		this.time = time;
	}

}