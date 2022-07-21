package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the rw_wqi database table.
 * 
 */
//@Entity
@Table(name="rw_wqi")
@NamedQuery(name="RwWqi.findAll", query="SELECT r FROM RwWqi r")
public class RwWqi implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal bod5;

	@Column(name="bod5_pt")
	private BigDecimal bod5Pt;

	private BigDecimal dos;

	@Column(name="dos_pt")
	private BigDecimal dosPt;

	@Column(name="l_bod5")
	private String lBod5;

	@Column(name="l_dos")
	private String lDos;

	@Column(name="l_nh4")
	private String lNh4;

	private Timestamp mdate;

	private BigDecimal nh4;

	@Column(name="nh4_pt")
	private BigDecimal nh4Pt;

	@Column(name="rwvisit_id")
	private String rwvisitId;

	@Column(name="sample_no")
	private Integer sampleNo;

	@Column(name="site_id")
	private BigDecimal siteId;

	private BigDecimal stime;

	@Column(name="wqi_grade")
	private String wqiGrade;

	@Column(name="wqi_pt")
	private BigDecimal wqiPt;

	public RwWqi() {
	}

	public BigDecimal getBod5() {
		return this.bod5;
	}

	public void setBod5(BigDecimal bod5) {
		this.bod5 = bod5;
	}

	public BigDecimal getBod5Pt() {
		return this.bod5Pt;
	}

	public void setBod5Pt(BigDecimal bod5Pt) {
		this.bod5Pt = bod5Pt;
	}

	public BigDecimal getDos() {
		return this.dos;
	}

	public void setDos(BigDecimal dos) {
		this.dos = dos;
	}

	public BigDecimal getDosPt() {
		return this.dosPt;
	}

	public void setDosPt(BigDecimal dosPt) {
		this.dosPt = dosPt;
	}

	public String getLBod5() {
		return this.lBod5;
	}

	public void setLBod5(String lBod5) {
		this.lBod5 = lBod5;
	}

	public String getLDos() {
		return this.lDos;
	}

	public void setLDos(String lDos) {
		this.lDos = lDos;
	}

	public String getLNh4() {
		return this.lNh4;
	}

	public void setLNh4(String lNh4) {
		this.lNh4 = lNh4;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getNh4() {
		return this.nh4;
	}

	public void setNh4(BigDecimal nh4) {
		this.nh4 = nh4;
	}

	public BigDecimal getNh4Pt() {
		return this.nh4Pt;
	}

	public void setNh4Pt(BigDecimal nh4Pt) {
		this.nh4Pt = nh4Pt;
	}

	public String getRwvisitId() {
		return this.rwvisitId;
	}

	public void setRwvisitId(String rwvisitId) {
		this.rwvisitId = rwvisitId;
	}

	public Integer getSampleNo() {
		return this.sampleNo;
	}

	public void setSampleNo(Integer sampleNo) {
		this.sampleNo = sampleNo;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getStime() {
		return this.stime;
	}

	public void setStime(BigDecimal stime) {
		this.stime = stime;
	}

	public String getWqiGrade() {
		return this.wqiGrade;
	}

	public void setWqiGrade(String wqiGrade) {
		this.wqiGrade = wqiGrade;
	}

	public BigDecimal getWqiPt() {
		return this.wqiPt;
	}

	public void setWqiPt(BigDecimal wqiPt) {
		this.wqiPt = wqiPt;
	}

}