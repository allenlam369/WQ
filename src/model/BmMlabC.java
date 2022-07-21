package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_mlab_c database table.
 * 
 */
@Entity
@Table(name="bm_mlab_c")
@NamedQuery(name="BmMlabC.findAll", query="SELECT b FROM BmMlabC b")
public class BmMlabC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="beach_code")
	private String beachCode;

	@Column(name="bmvisit_id")
	private String bmvisitId;

	@Column(name="date_received")
	private Timestamp dateReceived;

	@Column(name="date_reported")
	private Timestamp dateReported;

	private BigDecimal ec;

	private BigDecimal entrc;

	@Column(name="est_ec")
	private String estEc;

	@Column(name="est_entrc")
	private String estEntrc;

	private BigDecimal fc;

	@Column(name="l_ec")
	private String lEc;

	@Column(name="l_entrc")
	private String lEntrc;

	@Column(name="l_fc")
	private String lFc;

	@Column(name="lab_no")
	private String labNo;

	@Column(name="location_code")
	private String locationCode;

	private BigDecimal ph;

	private BigDecimal sal;

	@Column(name="sample_date")
	private Timestamp sampleDate;

	@Column(name="sample_mark")
	private String sampleMark;

	private BigDecimal turb;

	@Column(name="valid_code")
	private Integer validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public BmMlabC() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBeachCode() {
		return this.beachCode;
	}

	public void setBeachCode(String beachCode) {
		this.beachCode = beachCode;
	}

	public String getBmvisitId() {
		return this.bmvisitId;
	}

	public void setBmvisitId(String bmvisitId) {
		this.bmvisitId = bmvisitId;
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

	public BigDecimal getEc() {
		return this.ec;
	}

	public void setEc(BigDecimal ec) {
		this.ec = ec;
	}

	public BigDecimal getEntrc() {
		return this.entrc;
	}

	public void setEntrc(BigDecimal entrc) {
		this.entrc = entrc;
	}

	public String getEstEc() {
		return this.estEc;
	}

	public void setEstEc(String estEc) {
		this.estEc = estEc;
	}

	public String getEstEntrc() {
		return this.estEntrc;
	}

	public void setEstEntrc(String estEntrc) {
		this.estEntrc = estEntrc;
	}

	public BigDecimal getFc() {
		return this.fc;
	}

	public void setFc(BigDecimal fc) {
		this.fc = fc;
	}

	public String getLEc() {
		return this.lEc;
	}

	public void setLEc(String lEc) {
		this.lEc = lEc;
	}

	public String getLEntrc() {
		return this.lEntrc;
	}

	public void setLEntrc(String lEntrc) {
		this.lEntrc = lEntrc;
	}

	public String getLFc() {
		return this.lFc;
	}

	public void setLFc(String lFc) {
		this.lFc = lFc;
	}

	public String getLabNo() {
		return this.labNo;
	}

	public void setLabNo(String labNo) {
		this.labNo = labNo;
	}

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public BigDecimal getPh() {
		return this.ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public BigDecimal getSal() {
		return this.sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

	public Timestamp getSampleDate() {
		return this.sampleDate;
	}

	public void setSampleDate(Timestamp sampleDate) {
		this.sampleDate = sampleDate;
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

	public Integer getValidCode() {
		return this.validCode;
	}

	public void setValidCode(Integer validCode) {
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