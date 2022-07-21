package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mm_glabm database table.
 * 
 */
@Embeddable
public class MmGlabmPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="mwvisit_id")
	private String mwvisitId;

	@Column(name="depth_code")
	private String depthCode;

	private String type;

	public MmGlabmPK() {
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
		if (!(other instanceof MmGlabmPK)) {
			return false;
		}
		MmGlabmPK castOther = (MmGlabmPK)other;
		return 
			this.mwvisitId.equals(castOther.mwvisitId)
			&& this.depthCode.equals(castOther.depthCode)
			&& this.type.equals(castOther.type);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.mwvisitId.hashCode();
		hash = hash * prime + this.depthCode.hashCode();
		hash = hash * prime + this.type.hashCode();
		
		return hash;
	}
}