package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the db_cloud database table.
 * 
 */
//@Entity
@Table(name="db_cloud")
@NamedQuery(name="DbCloud.findAll", query="SELECT d FROM DbCloud d")
public class DbCloud implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal h0;

	private BigDecimal h1;

	private BigDecimal h10;

	private BigDecimal h11;

	private BigDecimal h12;

	private BigDecimal h13;

	private BigDecimal h14;

	private BigDecimal h15;

	private BigDecimal h16;

	private BigDecimal h17;

	private BigDecimal h18;

	private BigDecimal h19;

	private BigDecimal h2;

	private BigDecimal h20;

	private BigDecimal h21;

	private BigDecimal h22;

	private BigDecimal h23;

	private BigDecimal h3;

	private BigDecimal h4;

	private BigDecimal h5;

	private BigDecimal h6;

	private BigDecimal h7;

	private BigDecimal h8;

	private BigDecimal h9;

	private Timestamp mdate;

	public DbCloud() {
	}

	public BigDecimal getH0() {
		return this.h0;
	}

	public void setH0(BigDecimal h0) {
		this.h0 = h0;
	}

	public BigDecimal getH1() {
		return this.h1;
	}

	public void setH1(BigDecimal h1) {
		this.h1 = h1;
	}

	public BigDecimal getH10() {
		return this.h10;
	}

	public void setH10(BigDecimal h10) {
		this.h10 = h10;
	}

	public BigDecimal getH11() {
		return this.h11;
	}

	public void setH11(BigDecimal h11) {
		this.h11 = h11;
	}

	public BigDecimal getH12() {
		return this.h12;
	}

	public void setH12(BigDecimal h12) {
		this.h12 = h12;
	}

	public BigDecimal getH13() {
		return this.h13;
	}

	public void setH13(BigDecimal h13) {
		this.h13 = h13;
	}

	public BigDecimal getH14() {
		return this.h14;
	}

	public void setH14(BigDecimal h14) {
		this.h14 = h14;
	}

	public BigDecimal getH15() {
		return this.h15;
	}

	public void setH15(BigDecimal h15) {
		this.h15 = h15;
	}

	public BigDecimal getH16() {
		return this.h16;
	}

	public void setH16(BigDecimal h16) {
		this.h16 = h16;
	}

	public BigDecimal getH17() {
		return this.h17;
	}

	public void setH17(BigDecimal h17) {
		this.h17 = h17;
	}

	public BigDecimal getH18() {
		return this.h18;
	}

	public void setH18(BigDecimal h18) {
		this.h18 = h18;
	}

	public BigDecimal getH19() {
		return this.h19;
	}

	public void setH19(BigDecimal h19) {
		this.h19 = h19;
	}

	public BigDecimal getH2() {
		return this.h2;
	}

	public void setH2(BigDecimal h2) {
		this.h2 = h2;
	}

	public BigDecimal getH20() {
		return this.h20;
	}

	public void setH20(BigDecimal h20) {
		this.h20 = h20;
	}

	public BigDecimal getH21() {
		return this.h21;
	}

	public void setH21(BigDecimal h21) {
		this.h21 = h21;
	}

	public BigDecimal getH22() {
		return this.h22;
	}

	public void setH22(BigDecimal h22) {
		this.h22 = h22;
	}

	public BigDecimal getH23() {
		return this.h23;
	}

	public void setH23(BigDecimal h23) {
		this.h23 = h23;
	}

	public BigDecimal getH3() {
		return this.h3;
	}

	public void setH3(BigDecimal h3) {
		this.h3 = h3;
	}

	public BigDecimal getH4() {
		return this.h4;
	}

	public void setH4(BigDecimal h4) {
		this.h4 = h4;
	}

	public BigDecimal getH5() {
		return this.h5;
	}

	public void setH5(BigDecimal h5) {
		this.h5 = h5;
	}

	public BigDecimal getH6() {
		return this.h6;
	}

	public void setH6(BigDecimal h6) {
		this.h6 = h6;
	}

	public BigDecimal getH7() {
		return this.h7;
	}

	public void setH7(BigDecimal h7) {
		this.h7 = h7;
	}

	public BigDecimal getH8() {
		return this.h8;
	}

	public void setH8(BigDecimal h8) {
		this.h8 = h8;
	}

	public BigDecimal getH9() {
		return this.h9;
	}

	public void setH9(BigDecimal h9) {
		this.h9 = h9;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

}