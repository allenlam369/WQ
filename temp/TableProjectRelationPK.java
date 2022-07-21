package modelXX;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the table_project_relation database table.
 * 
 */
@Embeddable
public class TableProjectRelationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="project_id", insertable=false, updatable=false)
	private String projectId;

	@Column(name="table_name", insertable=false, updatable=false)
	private String tableName;

	public TableProjectRelationPK() {
	}
	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getTableName() {
		return this.tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TableProjectRelationPK)) {
			return false;
		}
		TableProjectRelationPK castOther = (TableProjectRelationPK)other;
		return 
			this.projectId.equals(castOther.projectId)
			&& this.tableName.equals(castOther.tableName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.projectId.hashCode();
		hash = hash * prime + this.tableName.hashCode();
		
		return hash;
	}
}