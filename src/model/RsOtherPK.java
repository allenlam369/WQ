package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the rs_other database table.
 * 
 */
@Embeddable
public class RsOtherPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="field_name")
	private String fieldName;

	@Column(name="rsvisit_id")
	private String rsvisitId;

	public RsOtherPK() {
	}
	public String getFieldName() {
		return this.fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getRsvisitId() {
		return this.rsvisitId;
	}
	public void setRsvisitId(String rsvisitId) {
		this.rsvisitId = rsvisitId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RsOtherPK)) {
			return false;
		}
		RsOtherPK castOther = (RsOtherPK)other;
		return 
			this.fieldName.equals(castOther.fieldName)
			&& this.rsvisitId.equals(castOther.rsvisitId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.fieldName.hashCode();
		hash = hash * prime + this.rsvisitId.hashCode();
		
		return hash;
	}
}