package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ts_clab_bu database table.
 * 
 */
@Entity
@Table(name="ts_clab_bu")
@NamedQuery(name="TsClabBu.findAll", query="SELECT t FROM TsClabBu t")
public class TsClabBu implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TsClabBuPK id;

	@Column(name="date_received")
	private Timestamp dateReceived;

	@Column(name="date_reported")
	private Timestamp dateReported;

	@Column(name="l_pfosf")
	private String lPfosf;

	@Column(name="lab_no")
	private String labNo;

	private BigDecimal pfosf;

	@Column(name="sample_mark")
	private String sampleMark;

	@Column(name="tsvisit_id_old")
	private String tsvisitIdOld;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public TsClabBu() {
	}

	public TsClabBuPK getId() {
		return this.id;
	}

	public void setId(TsClabBuPK id) {
		this.id = id;
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

	public String getLPfosf() {
		return this.lPfosf;
	}

	public void setLPfosf(String lPfosf) {
		this.lPfosf = lPfosf;
	}

	public String getLabNo() {
		return this.labNo;
	}

	public void setLabNo(String labNo) {
		this.labNo = labNo;
	}

	public BigDecimal getPfosf() {
		return this.pfosf;
	}

	public void setPfosf(BigDecimal pfosf) {
		this.pfosf = pfosf;
	}

	public String getSampleMark() {
		return this.sampleMark;
	}

	public void setSampleMark(String sampleMark) {
		this.sampleMark = sampleMark;
	}

	public String getTsvisitIdOld() {
		return this.tsvisitIdOld;
	}

	public void setTsvisitIdOld(String tsvisitIdOld) {
		this.tsvisitIdOld = tsvisitIdOld;
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