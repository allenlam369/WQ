package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the marine_sediment_ps1 database table.
 * 
 */
//@Entity
@Table(name="marine_sediment_ps1")
@NamedQuery(name="MarineSedimentPs1.findAll", query="SELECT m FROM MarineSedimentPs1 m")
public class MarineSedimentPs1 implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal eh;

	private Timestamp mdate;

	@Column(name="sam_no")
	private BigDecimal samNo;

	private String station;

	private BigDecimal stime;

	private String subzone;

	@Column(name="sz_1000")
	private BigDecimal sz1000;

	@Column(name="sz_125")
	private BigDecimal sz125;

	@Column(name="sz_2000")
	private BigDecimal sz2000;

	@Column(name="sz_250")
	private BigDecimal sz250;

	@Column(name="sz_4000")
	private BigDecimal sz4000;

	@Column(name="sz_500")
	private BigDecimal sz500;

	@Column(name="sz_63")
	private BigDecimal sz63;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	private String zone;

	public MarineSedimentPs1() {
	}

	public BigDecimal getEh() {
		return this.eh;
	}

	public void setEh(BigDecimal eh) {
		this.eh = eh;
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

	public BigDecimal getSz1000() {
		return this.sz1000;
	}

	public void setSz1000(BigDecimal sz1000) {
		this.sz1000 = sz1000;
	}

	public BigDecimal getSz125() {
		return this.sz125;
	}

	public void setSz125(BigDecimal sz125) {
		this.sz125 = sz125;
	}

	public BigDecimal getSz2000() {
		return this.sz2000;
	}

	public void setSz2000(BigDecimal sz2000) {
		this.sz2000 = sz2000;
	}

	public BigDecimal getSz250() {
		return this.sz250;
	}

	public void setSz250(BigDecimal sz250) {
		this.sz250 = sz250;
	}

	public BigDecimal getSz4000() {
		return this.sz4000;
	}

	public void setSz4000(BigDecimal sz4000) {
		this.sz4000 = sz4000;
	}

	public BigDecimal getSz500() {
		return this.sz500;
	}

	public void setSz500(BigDecimal sz500) {
		this.sz500 = sz500;
	}

	public BigDecimal getSz63() {
		return this.sz63;
	}

	public void setSz63(BigDecimal sz63) {
		this.sz63 = sz63;
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

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}