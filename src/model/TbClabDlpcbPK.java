package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tb_clab_dlpcb database table.
 * 
 */
@Embeddable
public class TbClabDlpcbPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="tbvisit_id")
	private String tbvisitId;

	private String type;

	@Column(name="teq_type")
	private String teqType;

	public TbClabDlpcbPK() {
	}
	public String getTbvisitId() {
		return this.tbvisitId;
	}
	public void setTbvisitId(String tbvisitId) {
		this.tbvisitId = tbvisitId;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTeqType() {
		return this.teqType;
	}
	public void setTeqType(String teqType) {
		this.teqType = teqType;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TbClabDlpcbPK)) {
			return false;
		}
		TbClabDlpcbPK castOther = (TbClabDlpcbPK)other;
		return 
			this.tbvisitId.equals(castOther.tbvisitId)
			&& this.type.equals(castOther.type)
			&& this.teqType.equals(castOther.teqType);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.tbvisitId.hashCode();
		hash = hash * prime + this.type.hashCode();
		hash = hash * prime + this.teqType.hashCode();
		
		return hash;
	}
}