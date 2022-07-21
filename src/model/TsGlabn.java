package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ts_glabn database table.
 * 
 */
@Entity
@Table(name="ts_glabn")
@NamedQuery(name="TsGlabn.findAll", query="SELECT t FROM TsGlabn t")
public class TsGlabn implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TsGlabnPK id;

	@Column(name="date_received")
	private Timestamp dateReceived;

	@Column(name="date_reported")
	private Timestamp dateReported;

	@Column(name="l_tc")
	private String lTc;

	@Column(name="l_tic")
	private String lTic;

	@Column(name="l_toc")
	private String lToc;

	@Column(name="lab_no")
	private String labNo;

	@Column(name="sample_mark")
	private String sampleMark;

	private BigDecimal tc;

	private BigDecimal tic;

	private BigDecimal toc;

	@Column(name="tsn_drw")
	private BigDecimal tsnDrw;

	@Column(name="tsvisit_id_old")
	private String tsvisitIdOld;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public TsGlabn() {
	}

	public TsGlabnPK getId() {
		return this.id;
	}

	public void setId(TsGlabnPK id) {
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

	public String getLTc() {
		return this.lTc;
	}

	public void setLTc(String lTc) {
		this.lTc = lTc;
	}

	public String getLTic() {
		return this.lTic;
	}

	public void setLTic(String lTic) {
		this.lTic = lTic;
	}

	public String getLToc() {
		return this.lToc;
	}

	public void setLToc(String lToc) {
		this.lToc = lToc;
	}

	public String getLabNo() {
		return this.labNo;
	}

	public void setLabNo(String labNo) {
		this.labNo = labNo;
	}

	public String getSampleMark() {
		return this.sampleMark;
	}

	public void setSampleMark(String sampleMark) {
		this.sampleMark = sampleMark;
	}

	public BigDecimal getTc() {
		return this.tc;
	}

	public void setTc(BigDecimal tc) {
		this.tc = tc;
	}

	public BigDecimal getTic() {
		return this.tic;
	}

	public void setTic(BigDecimal tic) {
		this.tic = tic;
	}

	public BigDecimal getToc() {
		return this.toc;
	}

	public void setToc(BigDecimal toc) {
		this.toc = toc;
	}

	public BigDecimal getTsnDrw() {
		return this.tsnDrw;
	}

	public void setTsnDrw(BigDecimal tsnDrw) {
		this.tsnDrw = tsnDrw;
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