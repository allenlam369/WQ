package model;

import java.io.Serializable;
import javax.persistence.*;

import modelXX.TableProjectRelation;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the project_info database table.
 * 
 */
@Entity
@Table(name="project_info")
@NamedQuery(name="ProjectInfo.findAll", query="SELECT p FROM ProjectInfo p")
public class ProjectInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="project_id")
	private String projectId;

	@Column(name="start_date")
	private String startDate;

	private String status;

	private String supervisor;

	private String title;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	//bi-directional many-to-one association to TableProjectRelation
	@OneToMany(mappedBy="projectInfo")
	private List<TableProjectRelation> tableProjectRelations;

	public ProjectInfo() {
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSupervisor() {
		return this.supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
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
		tableProjectRelation.setProjectInfo(this);

		return tableProjectRelation;
	}

	public TableProjectRelation removeTableProjectRelation(TableProjectRelation tableProjectRelation) {
		getTableProjectRelations().remove(tableProjectRelation);
		tableProjectRelation.setProjectInfo(null);

		return tableProjectRelation;
	}

}