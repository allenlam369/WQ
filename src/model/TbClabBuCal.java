package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tb_clab_bu_cal database table.
 * 
 */
//@Entity
@Table(name="tb_clab_bu_cal")
@NamedQuery(name="TbClabBuCal.findAll", query="SELECT t FROM TbClabBuCal t")
public class TbClabBuCal implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal kepone;

	@Column(name="l_kepone")
	private String lKepone;

	@Column(name="l_pfosf")
	private String lPfosf;

	private BigDecimal pfosf;

	@Column(name="tbvisit_id")
	private String tbvisitId;

	private String type;

	public TbClabBuCal() {
	}

	public BigDecimal getKepone() {
		return this.kepone;
	}

	public void setKepone(BigDecimal kepone) {
		this.kepone = kepone;
	}

	public String getLKepone() {
		return this.lKepone;
	}

	public void setLKepone(String lKepone) {
		this.lKepone = lKepone;
	}

	public String getLPfosf() {
		return this.lPfosf;
	}

	public void setLPfosf(String lPfosf) {
		this.lPfosf = lPfosf;
	}

	public BigDecimal getPfosf() {
		return this.pfosf;
	}

	public void setPfosf(BigDecimal pfosf) {
		this.pfosf = pfosf;
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

}