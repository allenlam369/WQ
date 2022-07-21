package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the column_info database table.
 * 
 */
@Embeddable
public class ColumnInfoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="table_name")
	private String tableName;

	@Column(name="column_name")
	private String columnName;

	public ColumnInfoPK() {
	}
	public String getTableName() {
		return this.tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getColumnName() {
		return this.columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ColumnInfoPK)) {
			return false;
		}
		ColumnInfoPK castOther = (ColumnInfoPK)other;
		return 
			this.tableName.equals(castOther.tableName)
			&& this.columnName.equals(castOther.columnName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.tableName.hashCode();
		hash = hash * prime + this.columnName.hashCode();
		
		return hash;
	}
}