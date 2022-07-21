package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the rw_sz_wqo database table.
 * 
 */
@Entity
@Table(name="rw_sz_wqo")
@NamedQuery(name="RwSzWqo.findAll", query="SELECT r FROM RwSzWqo r")
public class RwSzWqo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sz_id")
	private String szId;

	@Column(name="max_5gm_ec")
	private BigDecimal max5gmEc;

	@Column(name="max_5md_ec")
	private BigDecimal max5mdEc;

	@Column(name="max_aam_nh3")
	private BigDecimal maxAamNh3;

	@Column(name="max_agm_ec")
	private BigDecimal maxAgmEc;

	@Column(name="max_amd_ss")
	private BigDecimal maxAmdSs;

	@Column(name="max_bod5")
	private BigDecimal maxBod5;

	@Column(name="max_cod")
	private BigDecimal maxCod;

	@Column(name="max_nh4")
	private BigDecimal maxNh4;

	@Column(name="max_ph")
	private BigDecimal maxPh;

	@Column(name="min_do")
	private BigDecimal minDo;

	@Column(name="min_ph")
	private BigDecimal minPh;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public RwSzWqo() {
	}

	public String getSzId() {
		return this.szId;
	}

	public void setSzId(String szId) {
		this.szId = szId;
	}

	public BigDecimal getMax5gmEc() {
		return this.max5gmEc;
	}

	public void setMax5gmEc(BigDecimal max5gmEc) {
		this.max5gmEc = max5gmEc;
	}

	public BigDecimal getMax5mdEc() {
		return this.max5mdEc;
	}

	public void setMax5mdEc(BigDecimal max5mdEc) {
		this.max5mdEc = max5mdEc;
	}

	public BigDecimal getMaxAamNh3() {
		return this.maxAamNh3;
	}

	public void setMaxAamNh3(BigDecimal maxAamNh3) {
		this.maxAamNh3 = maxAamNh3;
	}

	public BigDecimal getMaxAgmEc() {
		return this.maxAgmEc;
	}

	public void setMaxAgmEc(BigDecimal maxAgmEc) {
		this.maxAgmEc = maxAgmEc;
	}

	public BigDecimal getMaxAmdSs() {
		return this.maxAmdSs;
	}

	public void setMaxAmdSs(BigDecimal maxAmdSs) {
		this.maxAmdSs = maxAmdSs;
	}

	public BigDecimal getMaxBod5() {
		return this.maxBod5;
	}

	public void setMaxBod5(BigDecimal maxBod5) {
		this.maxBod5 = maxBod5;
	}

	public BigDecimal getMaxCod() {
		return this.maxCod;
	}

	public void setMaxCod(BigDecimal maxCod) {
		this.maxCod = maxCod;
	}

	public BigDecimal getMaxNh4() {
		return this.maxNh4;
	}

	public void setMaxNh4(BigDecimal maxNh4) {
		this.maxNh4 = maxNh4;
	}

	public BigDecimal getMaxPh() {
		return this.maxPh;
	}

	public void setMaxPh(BigDecimal maxPh) {
		this.maxPh = maxPh;
	}

	public BigDecimal getMinDo() {
		return this.minDo;
	}

	public void setMinDo(BigDecimal minDo) {
		this.minDo = minDo;
	}

	public BigDecimal getMinPh() {
		return this.minPh;
	}

	public void setMinPh(BigDecimal minPh) {
		this.minPh = minPh;
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