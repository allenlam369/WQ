package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the river_water_trend database table.
 * 
 */
//@Entity
@Table(name="river_water_trend")
@NamedQuery(name="RiverWaterTrend.findAll", query="SELECT r FROM RiverWaterTrend r")
public class RiverWaterTrend implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal c;

	@Column(name="end_year")
	private Integer endYear;

	private BigDecimal m;

	private double p;

	@Column(name="para_seq")
	private Integer paraSeq;

	@Column(name="start_year")
	private Integer startYear;

	private String station;

	private double stau;

	private Integer t;

	@Column(name="valid_date")
	private Timestamp validDate;

	private String wqpara;

	private Integer y1;

	private Integer y2;

	public RiverWaterTrend() {
	}

	public BigDecimal getC() {
		return this.c;
	}

	public void setC(BigDecimal c) {
		this.c = c;
	}

	public Integer getEndYear() {
		return this.endYear;
	}

	public void setEndYear(Integer endYear) {
		this.endYear = endYear;
	}

	public BigDecimal getM() {
		return this.m;
	}

	public void setM(BigDecimal m) {
		this.m = m;
	}

	public double getP() {
		return this.p;
	}

	public void setP(double p) {
		this.p = p;
	}

	public Integer getParaSeq() {
		return this.paraSeq;
	}

	public void setParaSeq(Integer paraSeq) {
		this.paraSeq = paraSeq;
	}

	public Integer getStartYear() {
		return this.startYear;
	}

	public void setStartYear(Integer startYear) {
		this.startYear = startYear;
	}

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public double getStau() {
		return this.stau;
	}

	public void setStau(double stau) {
		this.stau = stau;
	}

	public Integer getT() {
		return this.t;
	}

	public void setT(Integer t) {
		this.t = t;
	}

	public Timestamp getValidDate() {
		return this.validDate;
	}

	public void setValidDate(Timestamp validDate) {
		this.validDate = validDate;
	}

	public String getWqpara() {
		return this.wqpara;
	}

	public void setWqpara(String wqpara) {
		this.wqpara = wqpara;
	}

	public Integer getY1() {
		return this.y1;
	}

	public void setY1(Integer y1) {
		this.y1 = y1;
	}

	public Integer getY2() {
		return this.y2;
	}

	public void setY2(Integer y2) {
		this.y2 = y2;
	}

}