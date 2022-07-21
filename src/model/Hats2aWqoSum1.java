package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the hats_2a_wqo_sum1 database table.
 * 
 */
//@Entity
@Table(name="hats_2a_wqo_sum1")
@NamedQuery(name="Hats2aWqoSum1.findAll", query="SELECT h FROM Hats2aWqoSum1 h")
public class Hats2aWqoSum1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="comply_do")
	private String complyDo;

	@Column(name="comply_doa")
	private String complyDoa;

	@Column(name="comply_dob")
	private String complyDob;

	@Column(name="comply_doc")
	private String complyDoc;

	@Column(name="comply_dom")
	private String complyDom;

	@Column(name="comply_dos")
	private String complyDos;

	@Column(name="comply_ecoli")
	private String complyEcoli;

	@Column(name="comply_nh3")
	private String complyNh3;

	@Column(name="comply_tin")
	private String complyTin;

	private BigDecimal ecoli;

	@Column(name="m_doa")
	private Long mDoa;

	@Column(name="m_dob")
	private Long mDob;

	@Column(name="m_doc")
	private Long mDoc;

	@Column(name="m_dom")
	private Long mDom;

	@Column(name="m_dos")
	private Long mDos;

	@Column(name="max_ecoli_agm")
	private BigDecimal maxEcoliAgm;

	@Column(name="max_nh3_aam")
	private BigDecimal maxNh3Aam;

	@Column(name="max_tin_aam")
	private BigDecimal maxTinAam;

	@Column(name="min_doa_pc")
	private BigDecimal minDoaPc;

	@Column(name="min_dob")
	private BigDecimal minDob;

	@Column(name="min_dob_pc")
	private BigDecimal minDobPc;

	@Column(name="min_doc")
	private BigDecimal minDoc;

	@Column(name="min_doc_pc")
	private BigDecimal minDocPc;

	@Column(name="min_dom")
	private BigDecimal minDom;

	@Column(name="min_dom_pc")
	private BigDecimal minDomPc;

	@Column(name="min_dos")
	private BigDecimal minDos;

	@Column(name="min_dos_pc")
	private BigDecimal minDosPc;

	@Column(name="n_doa")
	private Long nDoa;

	@Column(name="n_dob")
	private Long nDob;

	@Column(name="n_doc")
	private Long nDoc;

	@Column(name="n_dom")
	private Long nDom;

	@Column(name="n_dos")
	private Long nDos;

	private BigDecimal nh3;

	@Column(name="pc_doa")
	private Long pcDoa;

	@Column(name="pc_dob")
	private Long pcDob;

	@Column(name="pc_doc")
	private Long pcDoc;

	@Column(name="pc_dom")
	private Long pcDom;

	@Column(name="pc_dos")
	private Long pcDos;

	private String station;

	private String subzone;

	private BigDecimal tin;

	private Long total;

	private String wcz;

	private double yr;

	private String zone;

	public Hats2aWqoSum1() {
	}

	public String getComplyDo() {
		return this.complyDo;
	}

	public void setComplyDo(String complyDo) {
		this.complyDo = complyDo;
	}

	public String getComplyDoa() {
		return this.complyDoa;
	}

	public void setComplyDoa(String complyDoa) {
		this.complyDoa = complyDoa;
	}

	public String getComplyDob() {
		return this.complyDob;
	}

	public void setComplyDob(String complyDob) {
		this.complyDob = complyDob;
	}

	public String getComplyDoc() {
		return this.complyDoc;
	}

	public void setComplyDoc(String complyDoc) {
		this.complyDoc = complyDoc;
	}

	public String getComplyDom() {
		return this.complyDom;
	}

	public void setComplyDom(String complyDom) {
		this.complyDom = complyDom;
	}

	public String getComplyDos() {
		return this.complyDos;
	}

	public void setComplyDos(String complyDos) {
		this.complyDos = complyDos;
	}

	public String getComplyEcoli() {
		return this.complyEcoli;
	}

	public void setComplyEcoli(String complyEcoli) {
		this.complyEcoli = complyEcoli;
	}

	public String getComplyNh3() {
		return this.complyNh3;
	}

	public void setComplyNh3(String complyNh3) {
		this.complyNh3 = complyNh3;
	}

	public String getComplyTin() {
		return this.complyTin;
	}

	public void setComplyTin(String complyTin) {
		this.complyTin = complyTin;
	}

	public BigDecimal getEcoli() {
		return this.ecoli;
	}

	public void setEcoli(BigDecimal ecoli) {
		this.ecoli = ecoli;
	}

	public Long getMDoa() {
		return this.mDoa;
	}

	public void setMDoa(Long mDoa) {
		this.mDoa = mDoa;
	}

	public Long getMDob() {
		return this.mDob;
	}

	public void setMDob(Long mDob) {
		this.mDob = mDob;
	}

	public Long getMDoc() {
		return this.mDoc;
	}

	public void setMDoc(Long mDoc) {
		this.mDoc = mDoc;
	}

	public Long getMDom() {
		return this.mDom;
	}

	public void setMDom(Long mDom) {
		this.mDom = mDom;
	}

	public Long getMDos() {
		return this.mDos;
	}

	public void setMDos(Long mDos) {
		this.mDos = mDos;
	}

	public BigDecimal getMaxEcoliAgm() {
		return this.maxEcoliAgm;
	}

	public void setMaxEcoliAgm(BigDecimal maxEcoliAgm) {
		this.maxEcoliAgm = maxEcoliAgm;
	}

	public BigDecimal getMaxNh3Aam() {
		return this.maxNh3Aam;
	}

	public void setMaxNh3Aam(BigDecimal maxNh3Aam) {
		this.maxNh3Aam = maxNh3Aam;
	}

	public BigDecimal getMaxTinAam() {
		return this.maxTinAam;
	}

	public void setMaxTinAam(BigDecimal maxTinAam) {
		this.maxTinAam = maxTinAam;
	}

	public BigDecimal getMinDoaPc() {
		return this.minDoaPc;
	}

	public void setMinDoaPc(BigDecimal minDoaPc) {
		this.minDoaPc = minDoaPc;
	}

	public BigDecimal getMinDob() {
		return this.minDob;
	}

	public void setMinDob(BigDecimal minDob) {
		this.minDob = minDob;
	}

	public BigDecimal getMinDobPc() {
		return this.minDobPc;
	}

	public void setMinDobPc(BigDecimal minDobPc) {
		this.minDobPc = minDobPc;
	}

	public BigDecimal getMinDoc() {
		return this.minDoc;
	}

	public void setMinDoc(BigDecimal minDoc) {
		this.minDoc = minDoc;
	}

	public BigDecimal getMinDocPc() {
		return this.minDocPc;
	}

	public void setMinDocPc(BigDecimal minDocPc) {
		this.minDocPc = minDocPc;
	}

	public BigDecimal getMinDom() {
		return this.minDom;
	}

	public void setMinDom(BigDecimal minDom) {
		this.minDom = minDom;
	}

	public BigDecimal getMinDomPc() {
		return this.minDomPc;
	}

	public void setMinDomPc(BigDecimal minDomPc) {
		this.minDomPc = minDomPc;
	}

	public BigDecimal getMinDos() {
		return this.minDos;
	}

	public void setMinDos(BigDecimal minDos) {
		this.minDos = minDos;
	}

	public BigDecimal getMinDosPc() {
		return this.minDosPc;
	}

	public void setMinDosPc(BigDecimal minDosPc) {
		this.minDosPc = minDosPc;
	}

	public Long getNDoa() {
		return this.nDoa;
	}

	public void setNDoa(Long nDoa) {
		this.nDoa = nDoa;
	}

	public Long getNDob() {
		return this.nDob;
	}

	public void setNDob(Long nDob) {
		this.nDob = nDob;
	}

	public Long getNDoc() {
		return this.nDoc;
	}

	public void setNDoc(Long nDoc) {
		this.nDoc = nDoc;
	}

	public Long getNDom() {
		return this.nDom;
	}

	public void setNDom(Long nDom) {
		this.nDom = nDom;
	}

	public Long getNDos() {
		return this.nDos;
	}

	public void setNDos(Long nDos) {
		this.nDos = nDos;
	}

	public BigDecimal getNh3() {
		return this.nh3;
	}

	public void setNh3(BigDecimal nh3) {
		this.nh3 = nh3;
	}

	public Long getPcDoa() {
		return this.pcDoa;
	}

	public void setPcDoa(Long pcDoa) {
		this.pcDoa = pcDoa;
	}

	public Long getPcDob() {
		return this.pcDob;
	}

	public void setPcDob(Long pcDob) {
		this.pcDob = pcDob;
	}

	public Long getPcDoc() {
		return this.pcDoc;
	}

	public void setPcDoc(Long pcDoc) {
		this.pcDoc = pcDoc;
	}

	public Long getPcDom() {
		return this.pcDom;
	}

	public void setPcDom(Long pcDom) {
		this.pcDom = pcDom;
	}

	public Long getPcDos() {
		return this.pcDos;
	}

	public void setPcDos(Long pcDos) {
		this.pcDos = pcDos;
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

	public BigDecimal getTin() {
		return this.tin;
	}

	public void setTin(BigDecimal tin) {
		this.tin = tin;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
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