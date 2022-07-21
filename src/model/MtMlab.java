package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the mt_mlab database table.
 * 
 */
@Entity
@Table(name="mt_mlab")
@NamedQuery(name="MtMlab.findAll", query="SELECT m FROM MtMlab m")
public class MtMlab implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MtMlabPK id;

	private BigDecimal bod5;

	@Column(name="date_received")
	private Timestamp dateReceived;

	@Column(name="date_reported")
	private Timestamp dateReported;

	private BigDecimal ecoli;

	private BigDecimal fc;

	@Column(name="l_bod5")
	private String lBod5;

	@Column(name="l_ecoli")
	private String lEcoli;

	@Column(name="l_fc")
	private String lFc;

	@Column(name="l_ph")
	private String lPh;

	@Column(name="l_turb")
	private String lTurb;

	@Column(name="lab_no")
	private String labNo;

	@Column(name="mwvisit_id_old")
	private String mwvisitIdOld;

	private BigDecimal ph;

	@Column(name="sample_mark")
	private String sampleMark;

	private BigDecimal turb;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public MtMlab() {
	}

	public MtMlabPK getId() {
		return this.id;
	}

	public void setId(MtMlabPK id) {
		this.id = id;
	}

	public BigDecimal getBod5() {
		return this.bod5;
	}

	public void setBod5(BigDecimal bod5) {
		this.bod5 = bod5;
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

	public BigDecimal getEcoli() {
		return this.ecoli;
	}

	public void setEcoli(BigDecimal ecoli) {
		this.ecoli = ecoli;
	}

	public BigDecimal getFc() {
		return this.fc;
	}

	public void setFc(BigDecimal fc) {
		this.fc = fc;
	}

	public String getLBod5() {
		return this.lBod5;
	}

	public void setLBod5(String lBod5) {
		this.lBod5 = lBod5;
	}

	public String getLEcoli() {
		return this.lEcoli;
	}

	public void setLEcoli(String lEcoli) {
		this.lEcoli = lEcoli;
	}

	public String getLFc() {
		return this.lFc;
	}

	public void setLFc(String lFc) {
		this.lFc = lFc;
	}

	public String getLPh() {
		return this.lPh;
	}

	public void setLPh(String lPh) {
		this.lPh = lPh;
	}

	public String getLTurb() {
		return this.lTurb;
	}

	public void setLTurb(String lTurb) {
		this.lTurb = lTurb;
	}

	public String getLabNo() {
		return this.labNo;
	}

	public void setLabNo(String labNo) {
		this.labNo = labNo;
	}

	public String getMwvisitIdOld() {
		return this.mwvisitIdOld;
	}

	public void setMwvisitIdOld(String mwvisitIdOld) {
		this.mwvisitIdOld = mwvisitIdOld;
	}

	public BigDecimal getPh() {
		return this.ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public String getSampleMark() {
		return this.sampleMark;
	}

	public void setSampleMark(String sampleMark) {
		this.sampleMark = sampleMark;
	}

	public BigDecimal getTurb() {
		return this.turb;
	}

	public void setTurb(BigDecimal turb) {
		this.turb = turb;
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