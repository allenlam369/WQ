package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the rw_other database table.
 * 
 */
@Embeddable
public class RwOtherPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="field_name")
	private String fieldName;

	@Column(name="rwvisit_id")
	private String rwvisitId;

	public RwOtherPK() {
	}
	public String getFieldName() {
		return this.fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getRwvisitId() {
		return this.rwvisitId;
	}
	public void setRwvisitId(String rwvisitId) {
		this.rwvisitId = rwvisitId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RwOtherPK)) {
			return false;
		}
		RwOtherPK castOther = (RwOtherPK)other;
		return 
			this.fieldName.equals(castOther.fieldName)
			&& this.rwvisitId.equals(castOther.rwvisitId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.fieldName.hashCode();
		hash = hash * prime + this.rwvisitId.hashCode();
		
		return hash;
	}
}