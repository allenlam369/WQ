package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the hs_other database table.
 * 
 */
@Embeddable
public class HsOtherPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="field_name")
	private String fieldName;

	@Column(name="mwvisit_id")
	private String mwvisitId;

	@Column(name="depth_code")
	private String depthCode;

	public HsOtherPK() {
	}
	public String getFieldName() {
		return this.fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getMwvisitId() {
		return this.mwvisitId;
	}
	public void setMwvisitId(String mwvisitId) {
		this.mwvisitId = mwvisitId;
	}
	public String getDepthCode() {
		return this.depthCode;
	}
	public void setDepthCode(String depthCode) {
		this.depthCode = depthCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof HsOtherPK)) {
			return false;
		}
		HsOtherPK castOther = (HsOtherPK)other;
		return 
			this.fieldName.equals(castOther.fieldName)
			&& this.mwvisitId.equals(castOther.mwvisitId)
			&& this.depthCode.equals(castOther.depthCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.fieldName.hashCode();
		hash = hash * prime + this.mwvisitId.hashCode();
		hash = hash * prime + this.depthCode.hashCode();
		
		return hash;
	}
}