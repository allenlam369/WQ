package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the eb_bc_s_wcz database table.
 * 
 */
//@Entity
@Table(name="eb_bc_s_wcz")
@NamedQuery(name="EbBcSWcz.findAll", query="SELECT e FROM EbBcSWcz e")
public class EbBcSWcz implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bio_vol")
	private BigDecimal bioVol;

	private BigDecimal density;

	private double month;

	private BigDecimal scan;

	@Column(name="sp_name")
	private String spName;

	private String wcz;

	public EbBcSWcz() {
	}

	public BigDecimal getBioVol() {
		return this.bioVol;
	}

	public void setBioVol(BigDecimal bioVol) {
		this.bioVol = bioVol;
	}

	public BigDecimal getDensity() {
		return this.density;
	}

	public void setDensity(BigDecimal density) {
		this.density = density;
	}

	public double getMonth() {
		return this.month;
	}

	public void setMonth(double month) {
		this.month = month;
	}

	public BigDecimal getScan() {
		return this.scan;
	}

	public void setScan(BigDecimal scan) {
		this.scan = scan;
	}

	public String getSpName() {
		return this.spName;
	}

	public void setSpName(String spName) {
		this.spName = spName;
	}

	public String getWcz() {
		return this.wcz;
	}

	public void setWcz(String wcz) {
		this.wcz = wcz;
	}

}