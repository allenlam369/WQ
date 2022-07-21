package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tb_glab_hh_cal database table.
 * 
 */
//@Entity
@Table(name="tb_glab_hh_cal")
@NamedQuery(name="TbGlabHhCal.findAll", query="SELECT t FROM TbGlabHhCal t")
public class TbGlabHhCal implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal bdcm;

	private BigDecimal brom;

	private BigDecimal btcm;

	private BigDecimal cdbm;

	@Column(name="l_bdcm")
	private String lBdcm;

	@Column(name="l_brom")
	private String lBrom;

	@Column(name="l_btcm")
	private String lBtcm;

	@Column(name="l_cdbm")
	private String lCdbm;

	@Column(name="l_mdcb")
	private String lMdcb;

	@Column(name="l_odcb")
	private String lOdcb;

	@Column(name="l_tce")
	private String lTce;

	@Column(name="l_tcm")
	private String lTcm;

	@Column(name="l_thms")
	private String lThms;

	@Column(name="l_trce")
	private String lTrce;

	private BigDecimal mdcb;

	private BigDecimal odcb;

	@Column(name="tbvisit_id")
	private String tbvisitId;

	private BigDecimal tce;

	private BigDecimal tcm;

	private BigDecimal thms;

	private BigDecimal trce;

	private String type;

	public TbGlabHhCal() {
	}

	public BigDecimal getBdcm() {
		return this.bdcm;
	}

	public void setBdcm(BigDecimal bdcm) {
		this.bdcm = bdcm;
	}

	public BigDecimal getBrom() {
		return this.brom;
	}

	public void setBrom(BigDecimal brom) {
		this.brom = brom;
	}

	public BigDecimal getBtcm() {
		return this.btcm;
	}

	public void setBtcm(BigDecimal btcm) {
		this.btcm = btcm;
	}

	public BigDecimal getCdbm() {
		return this.cdbm;
	}

	public void setCdbm(BigDecimal cdbm) {
		this.cdbm = cdbm;
	}

	public String getLBdcm() {
		return this.lBdcm;
	}

	public void setLBdcm(String lBdcm) {
		this.lBdcm = lBdcm;
	}

	public String getLBrom() {
		return this.lBrom;
	}

	public void setLBrom(String lBrom) {
		this.lBrom = lBrom;
	}

	public String getLBtcm() {
		return this.lBtcm;
	}

	public void setLBtcm(String lBtcm) {
		this.lBtcm = lBtcm;
	}

	public String getLCdbm() {
		return this.lCdbm;
	}

	public void setLCdbm(String lCdbm) {
		this.lCdbm = lCdbm;
	}

	public String getLMdcb() {
		return this.lMdcb;
	}

	public void setLMdcb(String lMdcb) {
		this.lMdcb = lMdcb;
	}

	public String getLOdcb() {
		return this.lOdcb;
	}

	public void setLOdcb(String lOdcb) {
		this.lOdcb = lOdcb;
	}

	public String getLTce() {
		return this.lTce;
	}

	public void setLTce(String lTce) {
		this.lTce = lTce;
	}

	public String getLTcm() {
		return this.lTcm;
	}

	public void setLTcm(String lTcm) {
		this.lTcm = lTcm;
	}

	public String getLThms() {
		return this.lThms;
	}

	public void setLThms(String lThms) {
		this.lThms = lThms;
	}

	public String getLTrce() {
		return this.lTrce;
	}

	public void setLTrce(String lTrce) {
		this.lTrce = lTrce;
	}

	public BigDecimal getMdcb() {
		return this.mdcb;
	}

	public void setMdcb(BigDecimal mdcb) {
		this.mdcb = mdcb;
	}

	public BigDecimal getOdcb() {
		return this.odcb;
	}

	public void setOdcb(BigDecimal odcb) {
		this.odcb = odcb;
	}

	public String getTbvisitId() {
		return this.tbvisitId;
	}

	public void setTbvisitId(String tbvisitId) {
		this.tbvisitId = tbvisitId;
	}

	public BigDecimal getTce() {
		return this.tce;
	}

	public void setTce(BigDecimal tce) {
		this.tce = tce;
	}

	public BigDecimal getTcm() {
		return this.tcm;
	}

	public void setTcm(BigDecimal tcm) {
		this.tcm = tcm;
	}

	public BigDecimal getThms() {
		return this.thms;
	}

	public void setThms(BigDecimal thms) {
		this.thms = thms;
	}

	public BigDecimal getTrce() {
		return this.trce;
	}

	public void setTrce(BigDecimal trce) {
		this.trce = trce;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}