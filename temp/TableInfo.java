package model;

import java.io.Serializable;
import javax.persistence.*;

import modelXX.TableProjectRelation;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the table_info database table.
 * 
 */
@Entity
@Table(name="table_info")
@NamedQuery(name="TableInfo.findAll", query="SELECT t FROM TableInfo t")
public class TableInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String name;

	private String description;

	private String status;

	private String type;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	//bi-directional many-to-one association to TableProjectRelation
	@OneToMany(mappedBy="tableInfo")
	private List<TableProjectRelation> tableProjectRelations;

	public TableInfo() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
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

	public List<TableProjectRelation> getTableProjectRelations() {
		return this.tableProjectRelations;
	}

	public void setTableProjectRelations(List<TableProjectRelation> tableProjectRelations) {
		this.tableProjectRelations = tableProjectRelations;
	}

	public TableProjectRelation addTableProjectRelation(TableProjectRelation tableProjectRelation) {
		getTableProjectRelations().add(tableProjectRelation);
		tableProjectRelation.setTableInfo(this);

		return tableProjectRelation;
	}

	public TableProjectRelation removeTableProjectRelation(TableProjectRelation tableProjectRelation) {
		getTableProjectRelations().remove(tableProjectRelation);
		tableProjectRelation.setTableInfo(null);

		return tableProjectRelation;
	}

}