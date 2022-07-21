package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the mt_sz_wqo database table.
 * 
 */
@Entity
@Table(name="mt_sz_wqo")
@NamedQuery(name="MtSzWqo.findAll", query="SELECT m FROM MtSzWqo m")
public class MtSzWqo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sz_id")
	private String szId;

	@Column(name="max_ecoli_agm")
	private BigDecimal maxEcoliAgm;

	@Column(name="max_nh3_aam")
	private BigDecimal maxNh3Aam;

	@Column(name="max_tin_aam")
	private BigDecimal maxTinAam;

	@Column(name="min_doa")
	private BigDecimal minDoa;

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

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public MtSzWqo() {
	}

	public String getSzId() {
		return this.szId;
	}

	public void setSzId(String szId) {
		this.szId = szId;
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

	public BigDecimal getMinDoa() {
		return this.minDoa;
	}

	public void setMinDoa(BigDecimal minDoa) {
		this.minDoa = minDoa;
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

	public BigDecimal getValidCode() {
		return this.validCode;
	}

	public void setValidCode(BigDecimal validCode) {
		this.validCode = validCode;
	}

	public Timestamp getValidDate() {
		return this.validDate;
	}

	public void setValidDate(Timestamp validDate) {
		this.validDate = validDate;
	}

	public String getValidUser() {
		return this.validUser;
	}

	public void setValidUser(String validUser) {
		this.validUser = validUser;
	}

}