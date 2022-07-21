package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the wb_sl database table.
 * 
 */
//@Entity
@Table(name="wb_sl")
@NamedQuery(name="WbSl.findAll", query="SELECT w FROM WbSl w")
public class WbSl implements Serializable {
	private static final long serialVersionUID = 1L;

	private String appearance;

	private String authority;

	@Column(name="class")
	private String class_;

	@Column(name="com_name")
	private String comName;

	private String family;

	private String genus;

	private String phylum;

	private String remark;

	@Column(name="sp_group")
	private String spGroup;

	@Column(name="sp_id")
	private BigDecimal spId;

	@Column(name="sp_name")
	private String spName;

	@Column(name="sp_order")
	private String spOrder;

	private String species;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public WbSl() {
	}

	public String getAppearance() {
		return this.appearance;
	}

	public void setAppearance(String appearance) {
		this.appearance = appearance;
	}

	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public String getComName() {
		return this.comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getFamily() {
		return this.family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getGenus() {
		return this.genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public String getPhylum() {
		return this.phylum;
	}

	public void setPhylum(String phylum) {
		this.phylum = phylum;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSpGroup() {
		return this.spGroup;
	}

	public void setSpGroup(String spGroup) {
		this.spGroup = spGroup;
	}

	public BigDecimal getSpId() {
		return this.spId;
	}

	public void setSpId(BigDecimal spId) {
		this.spId = spId;
	}

	public String getSpName() {
		return this.spName;
	}

	public void setSpName(String spName) {
		this.spName = spName;
	}

	public String getSpOrder() {
		return this.spOrder;
	}

	public void setSpOrder(String spOrder) {
		this.spOrder = spOrder;
	}

	public String getSpecies() {
		return this.species;
	}

	public void setSpecies(String species) {
		this.species = species;
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