package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mw_mlab database table.
 * 
 */
@Embeddable
public class MwMlabPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="mwvisit_id")
	private String mwvisitId;

	@Column(name="depth_code")
	private String depthCode;

	public MwMlabPK() {
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
		if (!(other instanceof MwMlabPK)) {
			return false;
		}
		MwMlabPK castOther = (MwMlabPK)other;
		return 
			this.mwvisitId.equals(castOther.mwvisitId)
			&& this.depthCode.equals(castOther.depthCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.mwvisitId.hashCode();
		hash = hash * prime + this.depthCode.hashCode();
		
		return hash;
	}
}