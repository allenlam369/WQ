package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the func_trend_table_rw database table.
 * 
 */
//@Entity
@Table(name="func_trend_table_rw")
@NamedQuery(name="FuncTrendTableRw.findAll", query="SELECT f FROM FuncTrendTableRw f")
public class FuncTrendTableRw implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer mth;

	private Integer n;

	private BigDecimal wq;

	private Integer yr;

	public FuncTrendTableRw() {
	}

	public Integer getMth() {
		return this.mth;
	}

	public void setMth(Integer mth) {
		this.mth = mth;
	}

	public Integer getN() {
		return this.n;
	}

	public void setN(Integer n) {
		this.n = n;
	}

	public BigDecimal getWq() {
		return this.wq;
	}

	public void setWq(BigDecimal wq) {
		this.wq = wq;
	}

	public Integer getYr() {
		return this.yr;
	}

	public void setYr(Integer yr) {
		this.yr = yr;
	}

}