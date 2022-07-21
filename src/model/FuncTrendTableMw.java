package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the func_trend_table_mw database table.
 * 
 */
//@Entity
@Table(name="func_trend_table_mw")
@NamedQuery(name="FuncTrendTableMw.findAll", query="SELECT f FROM FuncTrendTableMw f")
public class FuncTrendTableMw implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer mth;

	private Integer n;

	private BigDecimal wq;

	private Integer yr;

	public FuncTrendTableMw() {
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