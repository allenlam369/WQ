package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_rainfall_lst database table.
 * 
 */
//@Entity
@Table(name="bm_rainfall_lst")
@NamedQuery(name="BmRainfallLst.findAll", query="SELECT b FROM BmRainfallLst b")
public class BmRainfallLst implements Serializable {
	private static final long serialVersionUID = 1L;

	private Timestamp date;

	private BigDecimal h15;

	private BigDecimal h21;

	private BigDecimal h30;

	private BigDecimal hour;

	private BigDecimal lam;

	private BigDecimal n07;

	private BigDecimal n10;

	private BigDecimal n15;

	private BigDecimal n18;

	private BigDecimal r18;

	private BigDecimal r31;

	private Timestamp sdatetime;

	public BmRainfallLst() {
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public BigDecimal getH15() {
		return this.h15;
	}

	public void setH15(BigDecimal h15) {
		this.h15 = h15;
	}

	public BigDecimal getH21() {
		return this.h21;
	}

	public void setH21(BigDecimal h21) {
		this.h21 = h21;
	}

	public BigDecimal getH30() {
		return this.h30;
	}

	public void setH30(BigDecimal h30) {
		this.h30 = h30;
	}

	public BigDecimal getHour() {
		return this.hour;
	}

	public void setHour(BigDecimal hour) {
		this.hour = hour;
	}

	public BigDecimal getLam() {
		return this.lam;
	}

	public void setLam(BigDecimal lam) {
		this.lam = lam;
	}

	public BigDecimal getN07() {
		return this.n07;
	}

	public void setN07(BigDecimal n07) {
		this.n07 = n07;
	}

	public BigDecimal getN10() {
		return this.n10;
	}

	public void setN10(BigDecimal n10) {
		this.n10 = n10;
	}

	public BigDecimal getN15() {
		return this.n15;
	}

	public void setN15(BigDecimal n15) {
		this.n15 = n15;
	}

	public BigDecimal getN18() {
		return this.n18;
	}

	public void setN18(BigDecimal n18) {
		this.n18 = n18;
	}

	public BigDecimal getR18() {
		return this.r18;
	}

	public void setR18(BigDecimal r18) {
		this.r18 = r18;
	}

	public BigDecimal getR31() {
		return this.r31;
	}

	public void setR31(BigDecimal r31) {
		this.r31 = r31;
	}

	public Timestamp getSdatetime() {
		return this.sdatetime;
	}

	public void setSdatetime(Timestamp sdatetime) {
		this.sdatetime = sdatetime;
	}

}