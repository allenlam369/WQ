package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_parameter database table.
 * 
 */
@Entity
@Table(name="bm_parameter")
@NamedQuery(name="BmParameter.findAll", query="SELECT b FROM BmParameter b")
public class BmParameter implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BmParameterPK id;

	@Column(name="parameter_code")
	private String parameterCode;

	@Column(name="parameter_label")
	private String parameterLabel;

	@Column(name="parameter_name")
	private String parameterName;

	@Column(name="valid_code")
	private Integer validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public BmParameter() {
	}

	public BmParameterPK getId() {
		return this.id;
	}

	public void setId(BmParameterPK id) {
		this.id = id;
	}

	public String getParameterCode() {
		return this.parameterCode;
	}

	public void setParameterCode(String parameterCode) {
		this.parameterCode = parameterCode;
	}

	public String getParameterLabel() {
		return this.parameterLabel;
	}

	public void setParameterLabel(String parameterLabel) {
		this.parameterLabel = parameterLabel;
	}

	public String getParameterName() {
		return this.parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
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