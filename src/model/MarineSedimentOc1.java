package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the marine_sediment_oc1 database table.
 * 
 */
//@Entity
@Table(name="marine_sediment_oc1")
@NamedQuery(name="MarineSedimentOc1.findAll", query="SELECT m FROM MarineSedimentOc1 m")
public class MarineSedimentOc1 implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal abhc;

	private BigDecimal aldr;

	private BigDecimal bbhc;

	private BigDecimal dbhc;

	private BigDecimal diel;

	private BigDecimal end1;

	private BigDecimal end2;

	private BigDecimal endr;

	private BigDecimal gbhc;

	private BigDecimal hcb;

	private BigDecimal hepo;

	private BigDecimal hept;

	@Column(name="l_abhc")
	private String lAbhc;

	@Column(name="l_aldr")
	private String lAldr;

	@Column(name="l_bbhc")
	private String lBbhc;

	@Column(name="l_dbhc")
	private String lDbhc;

	@Column(name="l_diel")
	private String lDiel;

	@Column(name="l_end1")
	private String lEnd1;

	@Column(name="l_end2")
	private String lEnd2;

	@Column(name="l_endr")
	private String lEndr;

	@Column(name="l_gbhc")
	private String lGbhc;

	@Column(name="l_hcb")
	private String lHcb;

	@Column(name="l_hepo")
	private String lHepo;

	@Column(name="l_hept")
	private String lHept;

	@Column(name="l_oddd")
	private String lOddd;

	@Column(name="l_odde")
	private String lOdde;

	@Column(name="l_oddt")
	private String lOddt;

	@Column(name="l_pddd")
	private String lPddd;

	@Column(name="l_pdde")
	private String lPdde;

	@Column(name="l_pddt")
	private String lPddt;

	private Timestamp mdate;

	private BigDecimal oddd;

	private BigDecimal odde;

	private BigDecimal oddt;

	private BigDecimal pddd;

	private BigDecimal pdde;

	private BigDecimal pddt;

	@Column(name="sam_no")
	private BigDecimal samNo;

	private String station;

	private BigDecimal stime;

	private String subzone;

	private String type;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	private String zone;

	public MarineSedimentOc1() {
	}

	public BigDecimal getAbhc() {
		return this.abhc;
	}

	public void setAbhc(BigDecimal abhc) {
		this.abhc = abhc;
	}

	public BigDecimal getAldr() {
		return this.aldr;
	}

	public void setAldr(BigDecimal aldr) {
		this.aldr = aldr;
	}

	public BigDecimal getBbhc() {
		return this.bbhc;
	}

	public void setBbhc(BigDecimal bbhc) {
		this.bbhc = bbhc;
	}

	public BigDecimal getDbhc() {
		return this.dbhc;
	}

	public void setDbhc(BigDecimal dbhc) {
		this.dbhc = dbhc;
	}

	public BigDecimal getDiel() {
		return this.diel;
	}

	public void setDiel(BigDecimal diel) {
		this.diel = diel;
	}

	public BigDecimal getEnd1() {
		return this.end1;
	}

	public void setEnd1(BigDecimal end1) {
		this.end1 = end1;
	}

	public BigDecimal getEnd2() {
		return this.end2;
	}

	public void setEnd2(BigDecimal end2) {
		this.end2 = end2;
	}

	public BigDecimal getEndr() {
		return this.endr;
	}

	public void setEndr(BigDecimal endr) {
		this.endr = endr;
	}

	public BigDecimal getGbhc() {
		return this.gbhc;
	}

	public void setGbhc(BigDecimal gbhc) {
		this.gbhc = gbhc;
	}

	public BigDecimal getHcb() {
		return this.hcb;
	}

	public void setHcb(BigDecimal hcb) {
		this.hcb = hcb;
	}

	public BigDecimal getHepo() {
		return this.hepo;
	}

	public void setHepo(BigDecimal hepo) {
		this.hepo = hepo;
	}

	public BigDecimal getHept() {
		return this.hept;
	}

	public void setHept(BigDecimal hept) {
		this.hept = hept;
	}

	public String getLAbhc() {
		return this.lAbhc;
	}

	public void setLAbhc(String lAbhc) {
		this.lAbhc = lAbhc;
	}

	public String getLAldr() {
		return this.lAldr;
	}

	public void setLAldr(String lAldr) {
		this.lAldr = lAldr;
	}

	public String getLBbhc() {
		return this.lBbhc;
	}

	public void setLBbhc(String lBbhc) {
		this.lBbhc = lBbhc;
	}

	public String getLDbhc() {
		return this.lDbhc;
	}

	public void setLDbhc(String lDbhc) {
		this.lDbhc = lDbhc;
	}

	public String getLDiel() {
		return this.lDiel;
	}

	public void setLDiel(String lDiel) {
		this.lDiel = lDiel;
	}

	public String getLEnd1() {
		return this.lEnd1;
	}

	public void setLEnd1(String lEnd1) {
		this.lEnd1 = lEnd1;
	}

	public String getLEnd2() {
		return this.lEnd2;
	}

	public void setLEnd2(String lEnd2) {
		this.lEnd2 = lEnd2;
	}

	public String getLEndr() {
		return this.lEndr;
	}

	public void setLEndr(String lEndr) {
		this.lEndr = lEndr;
	}

	public String getLGbhc() {
		return this.lGbhc;
	}

	public void setLGbhc(String lGbhc) {
		this.lGbhc = lGbhc;
	}

	public String getLHcb() {
		return this.lHcb;
	}

	public void setLHcb(String lHcb) {
		this.lHcb = lHcb;
	}

	public String getLHepo() {
		return this.lHepo;
	}

	public void setLHepo(String lHepo) {
		this.lHepo = lHepo;
	}

	public String getLHept() {
		return this.lHept;
	}

	public void setLHept(String lHept) {
		this.lHept = lHept;
	}

	public String getLOddd() {
		return this.lOddd;
	}

	public void setLOddd(String lOddd) {
		this.lOddd = lOddd;
	}

	public String getLOdde() {
		return this.lOdde;
	}

	public void setLOdde(String lOdde) {
		this.lOdde = lOdde;
	}

	public String getLOddt() {
		return this.lOddt;
	}

	public void setLOddt(String lOddt) {
		this.lOddt = lOddt;
	}

	public String getLPddd() {
		return this.lPddd;
	}

	public void setLPddd(String lPddd) {
		this.lPddd = lPddd;
	}

	public String getLPdde() {
		return this.lPdde;
	}

	public void setLPdde(String lPdde) {
		this.lPdde = lPdde;
	}

	public String getLPddt() {
		return this.lPddt;
	}

	public void setLPddt(String lPddt) {
		this.lPddt = lPddt;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getOddd() {
		return this.oddd;
	}

	public void setOddd(BigDecimal oddd) {
		this.oddd = oddd;
	}

	public BigDecimal getOdde() {
		return this.odde;
	}

	public void setOdde(BigDecimal odde) {
		this.odde = odde;
	}

	public BigDecimal getOddt() {
		return this.oddt;
	}

	public void setOddt(BigDecimal oddt) {
		this.oddt = oddt;
	}

	public BigDecimal getPddd() {
		return this.pddd;
	}

	public void setPddd(BigDecimal pddd) {
		this.pddd = pddd;
	}

	public BigDecimal getPdde() {
		return this.pdde;
	}

	public void setPdde(BigDecimal pdde) {
		this.pdde = pdde;
	}

	public BigDecimal getPddt() {
		return this.pddt;
	}

	public void setPddt(BigDecimal pddt) {
		this.pddt = pddt;
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

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}