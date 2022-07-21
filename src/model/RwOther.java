package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the rw_other database table.
 * 
 */
@Entity
@Table(name="rw_other")
@NamedQuery(name="RwOther.findAll", query="SELECT r FROM RwOther r")
public class RwOther implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RwOtherPK id;

	@Column(name="field_value")
	private BigDecimal fieldValue;

	@Column(name="l_field")
	private String lField;

	@Column(name="valid_code")
	private Integer validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public RwOther() {
	}

	public RwOtherPK getId() {
		return this.id;
	}

	public void setId(RwOtherPK id) {
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