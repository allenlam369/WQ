package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the bm_flow_20140102_bak database table.
 * 
 */
@Entity
@Table(name="bm_flow_20140102_bak")
@NamedQuery(name="BmFlow20140102Bak.findAll", query="SELECT b FROM BmFlow20140102Bak b")
public class BmFlow20140102Bak implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bmvisit_id")
	private String bmvisitId;

	@Column(name="flow_code")
	private String flowCode;

	@Id
	private Integer id;

	@Column(name="source_code")
	private String sourceCode;

	@Column(name="valid_code")
	private Integer validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public BmFlow20140102Bak() {
	}

	public String getBmvisitId() {
		return this.bmvisitId;
	}

	public void setBmvisitId(String bmvisitId) {
		this.bmvisitId = bmvisitId;
	}

	public String getFlowCode() {
		return this.flowCode;
	}

	public void setFlowCode(String flowCode) {
		this.flowCode = flowCode;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSourceCode() {
		return this.sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
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