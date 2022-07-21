package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the dioxin_sediment_avg2 database table.
 * 
 */
//@Entity
@Table(name="dioxin_sediment_avg2")
@NamedQuery(name="DioxinSedimentAvg2.findAll", query="SELECT d FROM DioxinSedimentAvg2 d")
public class DioxinSedimentAvg2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="dsd_dwr")
	private BigDecimal dsdDwr;

	private BigDecimal hpcdd1;

	private BigDecimal hpcdf1;

	private BigDecimal hpcdf2;

	private BigDecimal hxcdd1;

	private BigDecimal hxcdd2;

	private BigDecimal hxcdd3;

	private BigDecimal hxcdf1;

	private BigDecimal hxcdf2;

	private BigDecimal hxcdf3;

	private BigDecimal hxcdf4;

	private BigDecimal ocdd;

	private BigDecimal ocdf;

	private BigDecimal pecdd1;

	private BigDecimal pecdf1;

	private BigDecimal pecdf2;

	private String station;

	private String subzone;

	private BigDecimal tcdd1;

	private BigDecimal tcdf1;

	private Long total;

	private String type;

	private String wcz;

	private double yr;

	private String zone;

	public DioxinSedimentAvg2() {
	}

	public BigDecimal getDsdDwr() {
		return this.dsdDwr;
	}

	public void setDsdDwr(BigDecimal dsdDwr) {
		this.dsdDwr = dsdDwr;
	}

	public BigDecimal getHpcdd1() {
		return this.hpcdd1;
	}

	public void setHpcdd1(BigDecimal hpcdd1) {
		this.hpcdd1 = hpcdd1;
	}

	public BigDecimal getHpcdf1() {
		return this.hpcdf1;
	}

	public void setHpcdf1(BigDecimal hpcdf1) {
		this.hpcdf1 = hpcdf1;
	}

	public BigDecimal getHpcdf2() {
		return this.hpcdf2;
	}

	public void setHpcdf2(BigDecimal hpcdf2) {
		this.hpcdf2 = hpcdf2;
	}

	public BigDecimal getHxcdd1() {
		return this.hxcdd1;
	}

	public void setHxcdd1(BigDecimal hxcdd1) {
		this.hxcdd1 = hxcdd1;
	}

	public BigDecimal getHxcdd2() {
		return this.hxcdd2;
	}

	public void setHxcdd2(BigDecimal hxcdd2) {
		this.hxcdd2 = hxcdd2;
	}

	public BigDecimal getHxcdd3() {
		return this.hxcdd3;
	}

	public void setHxcdd3(BigDecimal hxcdd3) {
		this.hxcdd3 = hxcdd3;
	}

	public BigDecimal getHxcdf1() {
		return this.hxcdf1;
	}

	public void setHxcdf1(BigDecimal hxcdf1) {
		this.hxcdf1 = hxcdf1;
	}

	public BigDecimal getHxcdf2() {
		return this.hxcdf2;
	}

	public void setHxcdf2(BigDecimal hxcdf2) {
		this.hxcdf2 = hxcdf2;
	}

	public BigDecimal getHxcdf3() {
		return this.hxcdf3;
	}

	public void setHxcdf3(BigDecimal hxcdf3) {
		this.hxcdf3 = hxcdf3;
	}

	public BigDecimal getHxcdf4() {
		return this.hxcdf4;
	}

	public void setHxcdf4(BigDecimal hxcdf4) {
		this.hxcdf4 = hxcdf4;
	}

	public BigDecimal getOcdd() {
		return this.ocdd;
	}

	public void setOcdd(BigDecimal ocdd) {
		this.ocdd = ocdd;
	}

	public BigDecimal getOcdf() {
		return this.ocdf;
	}

	public void setOcdf(BigDecimal ocdf) {
		this.ocdf = ocdf;
	}

	public BigDecimal getPecdd1() {
		return this.pecdd1;
	}

	public void setPecdd1(BigDecimal pecdd1) {
		this.pecdd1 = pecdd1;
	}

	public BigDecimal getPecdf1() {
		return this.pecdf1;
	}

	public void setPecdf1(BigDecimal pecdf1) {
		this.pecdf1 = pecdf1;
	}

	public BigDecimal getPecdf2() {
		return this.pecdf2;
	}

	public void setPecdf2(BigDecimal pecdf2) {
		this.pecdf2 = pecdf2;
	}

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getSubzone() {
		return this.subzone;
	}

	public void setSubzone(String subzone) {
		this.subzone = subzone;
	}

	public BigDecimal getTcdd1() {
		return this.tcdd1;
	}

	public void setTcdd1(BigDecimal tcdd1) {
		this.tcdd1 = tcdd1;
	}

	public BigDecimal getTcdf1() {
		return this.tcdf1;
	}

	public void setTcdf1(BigDecimal tcdf1) {
		this.tcdf1 = tcdf1;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWcz() {
		return this.wcz;
	}

	public void setWcz(String wcz) {
		this.wcz = wcz;
	}

	public double getYr() {
		return this.yr;
	}

	public void setYr(double yr) {
		this.yr = yr;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}