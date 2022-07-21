package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bm_tempview_select2012fc database table.
 * 
 */
//@Entity
@Table(name="bm_tempview_select2012fc")
@NamedQuery(name="BmTempviewSelect2012fc.findAll", query="SELECT b FROM BmTempviewSelect2012fc b")
public class BmTempviewSelect2012fc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bmvisit_id")
	private String bmvisitId;

	public BmTempviewSelect2012fc() {
	}

	public String getBmvisitId() {
		return this.bmvisitId;
	}

	public void setBmvisitId(String bmvisitId) {
		this.bmvisitId = bmvisitId;
	}

}