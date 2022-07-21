package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the toxic_water_glabm1 database table.
 * 
 */
//@Entity
@Table(name="toxic_water_glabm1")
@NamedQuery(name="ToxicWaterGlabm1.findAll", query="SELECT t FROM ToxicWaterGlabm1 t")
public class ToxicWaterGlabm1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"AS\"")
	private BigDecimal as;

	@Column(name="as_inorg")
	private BigDecimal asInorg;

	private BigDecimal cd;

	@Column(name="l_as")
	private String lAs;

	@Column(name="l_as_inorg")
	private String lAsInorg;

	@Column(name="l_cd")
	private String lCd;

	@Column(name="l_zn")
	private String lZn;

	private Timestamp mdate;

	@Column(name="sam_no")
	private BigDecimal samNo;

	private String station;

	private BigDecimal stime;

	private String subzone;

	private String type;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	private BigDecimal zn;

	private String zone;

	public ToxicWaterGlabm1() {
	}

	public BigDecimal getAs() {
		return this.as;
	}

	public void setAs(BigDecimal as) {
		this.as = as;
	}

	public BigDecimal getAsInorg() {
		return this.asInorg;
	}

	public void setAsInorg(BigDecimal asInorg) {
		this.asInorg = asInorg;
	}

	public BigDecimal getCd() {
		return this.cd;
	}

	public void setCd(BigDecimal cd) {
		this.cd = cd;
	}

	public String getLAs() {
		return this.lAs;
	}

	public void setLAs(String lAs) {
		this.lAs = lAs;
	}

	public String getLAsInorg() {
		return this.lAsInorg;
	}

	public void setLAsInorg(String lAsInorg) {
		this.lAsInorg = lAsInorg;
	}

	public String getLCd() {
		return this.lCd;
	}

	public void setLCd(String lCd) {
		this.lCd = lCd;
	}

	public String getLZn() {
		return this.lZn;
	}

	public void setLZn(String lZn) {
		this.lZn = lZn;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getSamNo() {
		return this.samNo;
	}

	public void setSamNo(BigDecimal samNo) {
		this.samNo = samNo;
	}

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public BigDecimal getStime() {
		return this.stime;
	}

	public void setStime(BigDecimal stime) {
		this.stime = stime;
	}

	public String getSubzone() {
		return this.subzone;
	}

	public void setSubzone(String subzone) {
		this.subzone = subzone;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getViewNo() {
		return this.viewNo;
	}

	public void setViewNo(BigDecimal viewNo) {
		this.viewNo = viewNo;
	}

	public String getWcz() {
		return this.wcz;
	}

	public void setWcz(String wcz) {
		this.wcz = wcz;
	}

	public BigDecimal getZn() {
		return this.zn;
	}

	public void setZn(BigDecimal zn) {
		this.zn = zn;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}