package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the sr_rs_glabn database table.
 * 
 */
//@Entity
@Table(name="sr_rs_glabn")
@NamedQuery(name="SrRsGlabn.findAll", query="SELECT s FROM SrRsGlabn s")
public class SrRsGlabn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="delete_date")
	private Timestamp deleteDate;

	@Column(name="delete_user")
	private String deleteUser;

	@Column(name="l_tc")
	private String lTc;

	@Column(name="l_ts")
	private String lTs;

	@Column(name="l_tvs")
	private String lTvs;

	@Column(name="rsvisit_id")
	private String rsvisitId;

	@Column(name="rsvisit_id_old")
	private String rsvisitIdOld;

	private BigDecimal tc;

	private BigDecimal ts;

	private BigDecimal tvs;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public SrRsGlabn() {
	}

	public Timestamp getDeleteDate() {
		return this.deleteDate;
	}

	public void setDeleteDate(Timestamp deleteDate) {
		this.deleteDate = deleteDate;
	}

	public String getDeleteUser() {
		return this.deleteUser;
	}

	public void setDeleteUser(String deleteUser) {
		this.deleteUser = deleteUser;
	}

	public String getLTc() {
		return this.lTc;
	}

	public void setLTc(String lTc) {
		this.lTc = lTc;
	}

	public String getLTs() {
		return this.lTs;
	}

	public void setLTs(String lTs) {
		this.lTs = lTs;
	}

	public String getLTvs() {
		return this.lTvs;
	}

	public void setLTvs(String lTvs) {
		this.lTvs = lTvs;
	}

	public String getRsvisitId() {
		return this.rsvisitId;
	}

	public void setRsvisitId(String rsvisitId) {
		this.rsvisitId = rsvisitId;
	}

	public String getRsvisitIdOld() {
		return this.rsvisitIdOld;
	}

	public void setRsvisitIdOld(String rsvisitIdOld) {
		this.rsvisitIdOld = rsvisitIdOld;
	}

	public BigDecimal getTc() {
		return this.tc;
	}

	public void setTc(BigDecimal tc) {
		this.tc = tc;
	}

	public BigDecimal getTs() {
		return this.ts;
	}

	public void setTs(BigDecimal ts) {
		this.ts = ts;
	}

	public BigDecimal getTvs() {
		return this.tvs;
	}

	public void setTvs(BigDecimal tvs) {
		this.tvs = tvs;
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