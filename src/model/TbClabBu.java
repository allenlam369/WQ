package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the tb_clab_bu database table.
 * 
 */
@Entity
@Table(name="tb_clab_bu")
@NamedQuery(name="TbClabBu.findAll", query="SELECT t FROM TbClabBu t")
public class TbClabBu implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbClabBuPK id;

	@Column(name="date_received")
	private Timestamp dateReceived;

	@Column(name="date_reported")
	private Timestamp dateReported;

	private BigDecimal kepone;

	@Column(name="l_kepone")
	private String lKepone;

	@Column(name="l_pfosf")
	private String lPfosf;

	@Column(name="lab_no")
	private String labNo;

	private BigDecimal pfosf;

	@Column(name="sample_mark")
	private String sampleMark;

	@Column(name="tbvisit_id_old")
	private String tbvisitIdOld;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public TbClabBu() {
	}

	public TbClabBuPK getId() {
		return this.id;
	}

	public void setId(TbClabBuPK id) {
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

	public BigDecimal getKepone() {
		return this.kepone;
	}

	public void setKepone(BigDecimal kepone) {
		this.kepone = kepone;
	}

	public String getLKepone() {
		return this.lKepone;
	}

	public void setLKepone(String lKepone) {
		this.lKepone = lKepone;
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

	public String getTbvisitIdOld() {
		return this.tbvisitIdOld;
	}

	public void setTbvisitIdOld(String tbvisitIdOld) {
		this.tbvisitIdOld = tbvisitIdOld;
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