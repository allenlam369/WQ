package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the tb_clab database table.
 * 
 */
@Entity
@Table(name="tb_clab")
@NamedQuery(name="TbClab.findAll", query="SELECT t FROM TbClab t")
public class TbClab implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbClabPK id;

	@Column(name="\"AS\"")
	private BigDecimal as;

	@Column(name="as_inorg")
	private BigDecimal asInorg;

	@Column(name="date_received")
	private Timestamp dateReceived;

	@Column(name="date_reported")
	private Timestamp dateReported;

	private BigDecimal dbt;

	@Column(name="l_as")
	private String lAs;

	@Column(name="l_as_inorg")
	private String lAsInorg;

	@Column(name="l_dbt")
	private String lDbt;

	@Column(name="l_mbt")
	private String lMbt;

	@Column(name="l_mehg")
	private String lMehg;

	@Column(name="l_osn")
	private String lOsn;

	@Column(name="l_pbb")
	private String lPbb;

	@Column(name="l_se")
	private String lSe;

	@Column(name="l_tbt")
	private String lTbt;

	@Column(name="lab_no")
	private String labNo;

	private BigDecimal mbt;

	private BigDecimal mehg;

	private BigDecimal osn;

	private BigDecimal pbb;

	@Column(name="sample_mark")
	private String sampleMark;

	private BigDecimal se;

	private BigDecimal tbt;

	@Column(name="tbvisit_id_old")
	private String tbvisitIdOld;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public TbClab() {
	}

	public TbClabPK getId() {
		return this.id;
	}

	public void setId(TbClabPK id) {
		this.id = id;
	}

	public BigDecimal getAs() {
		return this.as;
	}

	public void setAs(BigDecimal as) {
		this.as = as;
	}

	public BigDecimal getAsInorg() {
		return this.asInorg;
	}

	public void setAsInorg(BigDecimal asInorg) {
		this.asInorg = asInorg;
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

	public BigDecimal getDbt() {
		return this.dbt;
	}

	public void setDbt(BigDecimal dbt) {
		this.dbt = dbt;
	}

	public String getLAs() {
		return this.lAs;
	}

	public void setLAs(String lAs) {
		this.lAs = lAs;
	}

	public String getLAsInorg() {
		return this.lAsInorg;
	}

	public void setLAsInorg(String lAsInorg) {
		this.lAsInorg = lAsInorg;
	}

	public String getLDbt() {
		return this.lDbt;
	}

	public void setLDbt(String lDbt) {
		this.lDbt = lDbt;
	}

	public String getLMbt() {
		return this.lMbt;
	}

	public void setLMbt(String lMbt) {
		this.lMbt = lMbt;
	}

	public String getLMehg() {
		return this.lMehg;
	}

	public void setLMehg(String lMehg) {
		this.lMehg = lMehg;
	}

	public String getLOsn() {
		return this.lOsn;
	}

	public void setLOsn(String lOsn) {
		this.lOsn = lOsn;
	}

	public String getLPbb() {
		return this.lPbb;
	}

	public void setLPbb(String lPbb) {
		this.lPbb = lPbb;
	}

	public String getLSe() {
		return this.lSe;
	}

	public void setLSe(String lSe) {
		this.lSe = lSe;
	}

	public String getLTbt() {
		return this.lTbt;
	}

	public void setLTbt(String lTbt) {
		this.lTbt = lTbt;
	}

	public String getLabNo() {
		return this.labNo;
	}

	public void setLabNo(String labNo) {
		this.labNo = labNo;
	}

	public BigDecimal getMbt() {
		return this.mbt;
	}

	public void setMbt(BigDecimal mbt) {
		this.mbt = mbt;
	}

	public BigDecimal getMehg() {
		return this.mehg;
	}

	public void setMehg(BigDecimal mehg) {
		this.mehg = mehg;
	}

	public BigDecimal getOsn() {
		return this.osn;
	}

	public void setOsn(BigDecimal osn) {
		this.osn = osn;
	}

	public BigDecimal getPbb() {
		return this.pbb;
	}

	public void setPbb(BigDecimal pbb) {
		this.pbb = pbb;
	}

	public String getSampleMark() {
		return this.sampleMark;
	}

	public void setSampleMark(String sampleMark) {
		this.sampleMark = sampleMark;
	}

	public BigDecimal getSe() {
		return this.se;
	}

	public void setSe(BigDecimal se) {
		this.se = se;
	}

	public BigDecimal getTbt() {
		return this.tbt;
	}

	public void setTbt(BigDecimal tbt) {
		this.tbt = tbt;
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