package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the rs_other database table.
 * 
 */
@Entity
@Table(name="rs_other")
@NamedQuery(name="RsOther.findAll", query="SELECT r FROM RsOther r")
public class RsOther implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RsOtherPK id;

	@Column(name="field_value")
	private BigDecimal fieldValue;

	@Column(name="l_field")
	private String lField;

	@Column(name="rsvisit_id_old")
	private String rsvisitIdOld;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public RsOther() {
	}

	public RsOtherPK getId() {
		return this.id;
	}

	public void setId(RsOtherPK id) {
		this.id = id;
	}

	public BigDecimal getFieldValue() {
		return this.fieldValue;
	}

	public void setFieldValue(BigDecimal fieldValue) {
		this.fieldValue = fieldValue;
	}

	public String getLField() {
		return this.lField;
	}

	public void setLField(String lField) {
		this.lField = lField;
	}

	public String getRsvisitIdOld() {
		return this.rsvisitIdOld;
	}

	public void setRsvisitIdOld(String rsvisitIdOld) {
		this.rsvisitIdOld = rsvisitIdOld;
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