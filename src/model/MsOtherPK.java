package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ms_other database table.
 * 
 */
@Embeddable
public class MsOtherPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="field_name")
	private String fieldName;

	@Column(name="msvisit_id")
	private String msvisitId;

	private String type;

	public MsOtherPK() {
	}
	public String getFieldName() {
		return this.fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getMsvisitId() {
		return this.msvisitId;
	}
	public void setMsvisitId(String msvisitId) {
		this.msvisitId = msvisitId;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MsOtherPK)) {
			return false;
		}
		MsOtherPK castOther = (MsOtherPK)other;
		return 
			this.fieldName.equals(castOther.fieldName)
			&& this.msvisitId.equals(castOther.msvisitId)
			&& this.type.equals(castOther.type);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.fieldName.hashCode();
		hash = hash * prime + this.msvisitId.hashCode();
		hash = hash * prime + this.type.hashCode();
		
		return hash;
	}
}