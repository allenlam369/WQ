package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the rw_flow database table.
 * 
 */
@Embeddable
public class RwFlowPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="rwvisit_id")
	private String rwvisitId;

	@Column(name="data_no")
	private long dataNo;

	public RwFlowPK() {
	}
	public String getRwvisitId() {
		return this.rwvisitId;
	}
	public void setRwvisitId(String rwvisitId) {
		this.rwvisitId = rwvisitId;
	}
	public long getDataNo() {
		return this.dataNo;
	}
	public void setDataNo(long dataNo) {
		this.dataNo = dataNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RwFlowPK)) {
			return false;
		}
		RwFlowPK castOther = (RwFlowPK)other;
		return 
			this.rwvisitId.equals(castOther.rwvisitId)
			&& (this.dataNo == castOther.dataNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.rwvisitId.hashCode();
		hash = hash * prime + ((int) (this.dataNo ^ (this.dataNo >>> 32)));
		
		return hash;
	}
}