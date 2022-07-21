package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ms_ps database table.
 * 
 */
@Entity
@Table(name="ms_ps")
@NamedQuery(name="MsP.findAll", query="SELECT m FROM MsP m")
public class MsP implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="msvisit_id")
	private String msvisitId;

	private BigDecimal eh;

	@Column(name="msvisit_id_old")
	private String msvisitIdOld;

	@Column(name="sz_1000")
	private BigDecimal sz1000;

	@Column(name="sz_125")
	private BigDecimal sz125;

	@Column(name="sz_2000")
	private BigDecimal sz2000;

	@Column(name="sz_250")
	private BigDecimal sz250;

	@Column(name="sz_4000")
	private BigDecimal sz4000;

	@Column(name="sz_500")
	private BigDecimal sz500;

	@Column(name="sz_63")
	private BigDecimal sz63;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public MsP() {
	}

	public String getMsvisitId() {
		return this.msvisitId;
	}

	public void setMsvisitId(String msvisitId) {
		this.msvisitId = msvisitId;
	}

	public BigDecimal getEh() {
		return this.eh;
	}

	public void setEh(BigDecimal eh) {
		this.eh = eh;
	}

	public String getMsvisitIdOld() {
		return this.msvisitIdOld;
	}

	public void setMsvisitIdOld(String msvisitIdOld) {
		this.msvisitIdOld = msvisitIdOld;
	}

	public BigDecimal getSz1000() {
		return this.sz1000;
	}

	public void setSz1000(BigDecimal sz1000) {
		this.sz1000 = sz1000;
	}

	public BigDecimal getSz125() {
		return this.sz125;
	}

	public void setSz125(BigDecimal sz125) {
		this.sz125 = sz125;
	}

	public BigDecimal getSz2000() {
		return this.sz2000;
	}

	public void setSz2000(BigDecimal sz2000) {
		this.sz2000 = sz2000;
	}

	public BigDecimal getSz250() {
		return this.sz250;
	}

	public void setSz250(BigDecimal sz250) {
		this.sz250 = sz250;
	}

	public BigDecimal getSz4000() {
		return this.sz4000;
	}

	public void setSz4000(BigDecimal sz4000) {
		this.sz4000 = sz4000;
	}

	public BigDecimal getSz500() {
		return this.sz500;
	}

	public void setSz500(BigDecimal sz500) {
		this.sz500 = sz500;
	}

	public BigDecimal getSz63() {
		return this.sz63;
	}

	public void setSz63(BigDecimal sz63) {
		this.sz63 = sz63;
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