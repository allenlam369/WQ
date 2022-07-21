package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the wb_bc_g database table.
 * 
 */
//@Entity
@Table(name="wb_bc_g")
@NamedQuery(name="WbBcG.findAll", query="SELECT w FROM WbBcG w")
public class WbBcG implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal biomass;

	@Column(name="m_date")
	private Timestamp mDate;

	@Column(name="no_sp")
	private Long noSp;

	private BigDecimal population;

	@Column(name="s_time")
	private BigDecimal sTime;

	@Column(name="sp_div")
	private BigDecimal spDiv;

	@Column(name="sp_even")
	private BigDecimal spEven;

	@Column(name="sp_group")
	private String spGroup;

	@Column(name="sp_rich")
	private BigDecimal spRich;

	@Column(name="station_id")
	private String stationId;

	public WbBcG() {
	}

	public BigDecimal getBiomass() {
		return this.biomass;
	}

	public void setBiomass(BigDecimal biomass) {
		this.biomass = biomass;
	}

	public Timestamp getMDate() {
		return this.mDate;
	}

	public void setMDate(Timestamp mDate) {
		this.mDate = mDate;
	}

	public Long getNoSp() {
		return this.noSp;
	}

	public void setNoSp(Long noSp) {
		this.noSp = noSp;
	}

	public BigDecimal getPopulation() {
		return this.population;
	}

	public void setPopulation(BigDecimal population) {
		this.population = population;
	}

	public BigDecimal getSTime() {
		return this.sTime;
	}

	public void setSTime(BigDecimal sTime) {
		this.sTime = sTime;
	}

	public BigDecimal getSpDiv() {
		return this.spDiv;
	}

	public void setSpDiv(BigDecimal spDiv) {
		this.spDiv = spDiv;
	}

	public BigDecimal getSpEven() {
		return this.spEven;
	}

	public void setSpEven(BigDecimal spEven) {
		this.spEven = spEven;
	}

	public String getSpGroup() {
		return this.spGroup;
	}

	public void setSpGroup(String spGroup) {
		this.spGroup = spGroup;
	}

	public BigDecimal getSpRich() {
		return this.spRich;
	}

	public void setSpRich(BigDecimal spRich) {
		this.spRich = spRich;
	}

	public String getStationId() {
		return this.stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

}