package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the mw_other database table.
 * 
 */
@Entity
@Table(name="mw_other")
@NamedQuery(name="MwOther.findAll", query="SELECT m FROM MwOther m")
public class MwOther implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MwOtherPK id;

	private BigDecimal depth;

	@Column(name="field_value")
	private BigDecimal fieldValue;

	@Column(name="l_field")
	private String lField;

	@Column(name="mwvisit_id_old")
	private String mwvisitIdOld;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public MwOther() {
	}

	public MwOtherPK getId() {
		return this.id;
	}

	public void setId(MwOtherPK id) {
		this.id = id;
	}

	public BigDecimal getDepth() {
		return this.depth;
	}

	public void setDepth(BigDecimal depth) {
		this.depth = depth;
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

	public String getMwvisitIdOld() {
		return this.mwvisitIdOld;
	}

	public void setMwvisitIdOld(String mwvisitIdOld) {
		this.mwvisitIdOld = mwvisitIdOld;
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