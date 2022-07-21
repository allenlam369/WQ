package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the tb_glab_hh database table.
 * 
 */
@Entity
@Table(name="tb_glab_hh")
@NamedQuery(name="TbGlabHh.findAll", query="SELECT t FROM TbGlabHh t")
public class TbGlabHh implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbGlabHhPK id;

	private BigDecimal bdcm;

	private BigDecimal brom;

	private BigDecimal btcm;

	private BigDecimal cdbm;

	@Column(name="date_received")
	private Timestamp dateReceived;

	@Column(name="date_reported")
	private Timestamp dateReported;

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

	@Column(name="lab_no")
	private String labNo;

	private BigDecimal mdcb;

	private BigDecimal odcb;

	@Column(name="sample_mark")
	private String sampleMark;

	@Column(name="tbvisit_id_old")
	private String tbvisitIdOld;

	private BigDecimal tce;

	private BigDecimal tcm;

	private BigDecimal thms;

	private BigDecimal trce;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public TbGlabHh() {
	}

	public TbGlabHhPK getId() {
		return this.id;
	}

	public void setId(TbGlabHhPK id) {
		this.id = id;
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

	public Timestamp getDateReceived() {
		return this.dateReceived;
	}

	public void setDateReceived(Timestamp dateReceived) {
		this.dateReceived = dateReceived;
	}

	public Timestamp getDateReported() {
		return this.dateReported;
	}

	public void setDateReported(Timestamp dateReported) {
		this.dateReported = dateReported;
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

	public String getLabNo() {
		return this.labNo;
	}

	public void setLabNo(String labNo) {
		this.labNo = labNo;
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

	public String getSampleMark() {
		return this.sampleMark;
	}

	public void setSampleMark(String sampleMark) {
		this.sampleMark = sampleMark;
	}

	public String getTbvisitIdOld() {
		return this.tbvisitIdOld;
	}

	public void setTbvisitIdOld(String tbvisitIdOld) {
		this.tbvisitIdOld = tbvisitIdOld;
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