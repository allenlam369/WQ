package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the tb_visit database table.
 * 
 */
@Entity
@Table(name="tb_visit")
@NamedQuery(name="TbVisit.findAll", query="SELECT t FROM TbVisit t")
public class TbVisit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tbvisit_id")
	private String tbvisitId;

	private Timestamp mdate;

	@Column(name="sample_no")
	private BigDecimal sampleNo;

	private BigDecimal stime;

	@Column(name="tb_spcode_id")
	private String tbSpcodeId;

	@Column(name="tbvisit_id_old")
	private String tbvisitIdOld;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	@Column(name="wcz_id")
	private String wczId;

	public TbVisit() {
	}

	public String getTbvisitId() {
		return this.tbvisitId;
	}

	public void setTbvisitId(String tbvisitId) {
		this.tbvisitId = tbvisitId;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getSampleNo() {
		return this.sampleNo;
	}

	public void setSampleNo(BigDecimal sampleNo) {
		this.sampleNo = sampleNo;
	}

	public BigDecimal getStime() {
		return this.stime;
	}

	public void setStime(BigDecimal stime) {
		this.stime = stime;
	}

	public String getTbSpcodeId() {
		return this.tbSpcodeId;
	}

	public void setTbSpcodeId(String tbSpcodeId) {
		this.tbSpcodeId = tbSpcodeId;
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

	public String getWczId() {
		return this.wczId;
	}

	public void setWczId(String wczId) {
		this.wczId = wczId;
	}

}