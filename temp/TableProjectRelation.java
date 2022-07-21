package modelXX;

import java.io.Serializable;
import javax.persistence.*;

import model.ProjectInfo;
import model.TableInfo;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the table_project_relation database table.
 * 
 */
@Entity
@Table(name="table_project_relation")
@NamedQuery(name="TableProjectRelation.findAll", query="SELECT t FROM TableProjectRelation t")
public class TableProjectRelation implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TableProjectRelationPK id;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	//bi-directional many-to-one association to ProjectInfo
	@ManyToOne
	@JoinColumn(name="project_id")
	private ProjectInfo projectInfo;

	//bi-directional many-to-one association to TableInfo
	@ManyToOne
	@JoinColumn(name="table_name")
	private TableInfo tableInfo;

	public TableProjectRelation() {
	}

	public TableProjectRelationPK getId() {
		return this.id;
	}

	public void setId(TableProjectRelationPK id) {
		this.id = id;
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

	public ProjectInfo getProjectInfo() {
		return this.projectInfo;
	}

	public void setProjectInfo(ProjectInfo projectInfo) {
		this.projectInfo = projectInfo;
	}

	public TableInfo getTableInfo() {
		return this.tableInfo;
	}

	public void setTableInfo(TableInfo tableInfo) {
		this.tableInfo = tableInfo;
	}

}