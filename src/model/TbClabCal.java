package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tb_clab_cal database table.
 * 
 */
//@Entity
@Table(name="tb_clab_cal")
@NamedQuery(name="TbClabCal.findAll", query="SELECT t FROM TbClabCal t")
public class TbClabCal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"AS\"")
	private BigDecimal as;

	@Column(name="as_inorg")
	private BigDecimal asInorg;

	private BigDecimal dbt;

	@Column(name="l_as")
	private String lAs;

	@Column(name="l_as_inorg")
	private String lAsInorg;

	@Column(name="l_dbt")
	private String lDbt;

	@Column(name="l_mbt")
	private String lMbt;

	@Column(name="l_mehg")
	private String lMehg;

	@Column(name="l_pbb")
	private String lPbb;

	@Column(name="l_se")
	private String lSe;

	@Column(name="l_tbt")
	private String lTbt;

	private BigDecimal mbt;

	private BigDecimal mehg;

	private BigDecimal osn;

	private BigDecimal pbb;

	private BigDecimal se;

	private BigDecimal tbt;

	@Column(name="tbvisit_id")
	private String tbvisitId;

	private String type;

	public TbClabCal() {
	}

	public BigDecimal getAs() {
		return this.as;
	}

	public void setAs(BigDecimal as) {
		this.as = as;
	}

	public BigDecimal getAsInorg() {
		return this.asInorg;
	}

	public void setAsInorg(BigDecimal asInorg) {
		this.asInorg = asInorg;
	}

	public BigDecimal getDbt() {
		return this.dbt;
	}

	public void setDbt(BigDecimal dbt) {
		this.dbt = dbt;
	}

	public String getLAs() {
		return this.lAs;
	}

	public void setLAs(String lAs) {
		this.lAs = lAs;
	}

	public String getLAsInorg() {
		return this.lAsInorg;
	}

	public void setLAsInorg(String lAsInorg) {
		this.lAsInorg = lAsInorg;
	}

	public String getLDbt() {
		return this.lDbt;
	}

	public void setLDbt(String lDbt) {
		this.lDbt = lDbt;
	}

	public String getLMbt() {
		return this.lMbt;
	}

	public void setLMbt(String lMbt) {
		this.lMbt = lMbt;
	}

	public String getLMehg() {
		return this.lMehg;
	}

	public void setLMehg(String lMehg) {
		this.lMehg = lMehg;
	}

	public String getLPbb() {
		return this.lPbb;
	}

	public void setLPbb(String lPbb) {
		this.lPbb = lPbb;
	}

	public String getLSe() {
		return this.lSe;
	}

	public void setLSe(String lSe) {
		this.lSe = lSe;
	}

	public String getLTbt() {
		return this.lTbt;
	}

	public void setLTbt(String lTbt) {
		this.lTbt = lTbt;
	}

	public BigDecimal getMbt() {
		return this.mbt;
	}

	public void setMbt(BigDecimal mbt) {
		this.mbt = mbt;
	}

	public BigDecimal getMehg() {
		return this.mehg;
	}

	public void setMehg(BigDecimal mehg) {
		this.mehg = mehg;
	}

	public BigDecimal getOsn() {
		return this.osn;
	}

	public void setOsn(BigDecimal osn) {
		this.osn = osn;
	}

	public BigDecimal getPbb() {
		return this.pbb;
	}

	public void setPbb(BigDecimal pbb) {
		this.pbb = pbb;
	}

	public BigDecimal getSe() {
		return this.se;
	}

	public void setSe(BigDecimal se) {
		this.se = se;
	}

	public BigDecimal getTbt() {
		return this.tbt;
	}

	public void setTbt(BigDecimal tbt) {
		this.tbt = tbt;
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