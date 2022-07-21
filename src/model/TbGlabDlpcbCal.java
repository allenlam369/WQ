package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tb_glab_dlpcb_cal database table.
 * 
 */
//@Entity
@Table(name="tb_glab_dlpcb_cal")
@NamedQuery(name="TbGlabDlpcbCal.findAll", query="SELECT t FROM TbGlabDlpcbCal t")
public class TbGlabDlpcbCal implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal dlpcb;

	private BigDecimal dlpcb105;

	private BigDecimal dlpcb114;

	private BigDecimal dlpcb118;

	private BigDecimal dlpcb123;

	private BigDecimal dlpcb126;

	private BigDecimal dlpcb156;

	private BigDecimal dlpcb157;

	private BigDecimal dlpcb167;

	private BigDecimal dlpcb169;

	private BigDecimal dlpcb189;

	private BigDecimal dlpcb77;

	private BigDecimal dlpcb81;

	@Column(name="l_dlpcb105")
	private String lDlpcb105;

	@Column(name="l_dlpcb114")
	private String lDlpcb114;

	@Column(name="l_dlpcb118")
	private String lDlpcb118;

	@Column(name="l_dlpcb123")
	private String lDlpcb123;

	@Column(name="l_dlpcb126")
	private String lDlpcb126;

	@Column(name="l_dlpcb156")
	private String lDlpcb156;

	@Column(name="l_dlpcb157")
	private String lDlpcb157;

	@Column(name="l_dlpcb167")
	private String lDlpcb167;

	@Column(name="l_dlpcb169")
	private String lDlpcb169;

	@Column(name="l_dlpcb189")
	private String lDlpcb189;

	@Column(name="l_dlpcb77")
	private String lDlpcb77;

	@Column(name="l_dlpcb81")
	private String lDlpcb81;

	@Column(name="tbvisit_id")
	private String tbvisitId;

	@Column(name="teq_type")
	private String teqType;

	private String type;

	public TbGlabDlpcbCal() {
	}

	public BigDecimal getDlpcb() {
		return this.dlpcb;
	}

	public void setDlpcb(BigDecimal dlpcb) {
		this.dlpcb = dlpcb;
	}

	public BigDecimal getDlpcb105() {
		return this.dlpcb105;
	}

	public void setDlpcb105(BigDecimal dlpcb105) {
		this.dlpcb105 = dlpcb105;
	}

	public BigDecimal getDlpcb114() {
		return this.dlpcb114;
	}

	public void setDlpcb114(BigDecimal dlpcb114) {
		this.dlpcb114 = dlpcb114;
	}

	public BigDecimal getDlpcb118() {
		return this.dlpcb118;
	}

	public void setDlpcb118(BigDecimal dlpcb118) {
		this.dlpcb118 = dlpcb118;
	}

	public BigDecimal getDlpcb123() {
		return this.dlpcb123;
	}

	public void setDlpcb123(BigDecimal dlpcb123) {
		this.dlpcb123 = dlpcb123;
	}

	public BigDecimal getDlpcb126() {
		return this.dlpcb126;
	}

	public void setDlpcb126(BigDecimal dlpcb126) {
		this.dlpcb126 = dlpcb126;
	}

	public BigDecimal getDlpcb156() {
		return this.dlpcb156;
	}

	public void setDlpcb156(BigDecimal dlpcb156) {
		this.dlpcb156 = dlpcb156;
	}

	public BigDecimal getDlpcb157() {
		return this.dlpcb157;
	}

	public void setDlpcb157(BigDecimal dlpcb157) {
		this.dlpcb157 = dlpcb157;
	}

	public BigDecimal getDlpcb167() {
		return this.dlpcb167;
	}

	public void setDlpcb167(BigDecimal dlpcb167) {
		this.dlpcb167 = dlpcb167;
	}

	public BigDecimal getDlpcb169() {
		return this.dlpcb169;
	}

	public void setDlpcb169(BigDecimal dlpcb169) {
		this.dlpcb169 = dlpcb169;
	}

	public BigDecimal getDlpcb189() {
		return this.dlpcb189;
	}

	public void setDlpcb189(BigDecimal dlpcb189) {
		this.dlpcb189 = dlpcb189;
	}

	public BigDecimal getDlpcb77() {
		return this.dlpcb77;
	}

	public void setDlpcb77(BigDecimal dlpcb77) {
		this.dlpcb77 = dlpcb77;
	}

	public BigDecimal getDlpcb81() {
		return this.dlpcb81;
	}

	public void setDlpcb81(BigDecimal dlpcb81) {
		this.dlpcb81 = dlpcb81;
	}

	public String getLDlpcb105() {
		return this.lDlpcb105;
	}

	public void setLDlpcb105(String lDlpcb105) {
		this.lDlpcb105 = lDlpcb105;
	}

	public String getLDlpcb114() {
		return this.lDlpcb114;
	}

	public void setLDlpcb114(String lDlpcb114) {
		this.lDlpcb114 = lDlpcb114;
	}

	public String getLDlpcb118() {
		return this.lDlpcb118;
	}

	public void setLDlpcb118(String lDlpcb118) {
		this.lDlpcb118 = lDlpcb118;
	}

	public String getLDlpcb123() {
		return this.lDlpcb123;
	}

	public void setLDlpcb123(String lDlpcb123) {
		this.lDlpcb123 = lDlpcb123;
	}

	public String getLDlpcb126() {
		return this.lDlpcb126;
	}

	public void setLDlpcb126(String lDlpcb126) {
		this.lDlpcb126 = lDlpcb126;
	}

	public String getLDlpcb156() {
		return this.lDlpcb156;
	}

	public void setLDlpcb156(String lDlpcb156) {
		this.lDlpcb156 = lDlpcb156;
	}

	public String getLDlpcb157() {
		return this.lDlpcb157;
	}

	public void setLDlpcb157(String lDlpcb157) {
		this.lDlpcb157 = lDlpcb157;
	}

	public String getLDlpcb167() {
		return this.lDlpcb167;
	}

	public void setLDlpcb167(String lDlpcb167) {
		this.lDlpcb167 = lDlpcb167;
	}

	public String getLDlpcb169() {
		return this.lDlpcb169;
	}

	public void setLDlpcb169(String lDlpcb169) {
		this.lDlpcb169 = lDlpcb169;
	}

	public String getLDlpcb189() {
		return this.lDlpcb189;
	}

	public void setLDlpcb189(String lDlpcb189) {
		this.lDlpcb189 = lDlpcb189;
	}

	public String getLDlpcb77() {
		return this.lDlpcb77;
	}

	public void setLDlpcb77(String lDlpcb77) {
		this.lDlpcb77 = lDlpcb77;
	}

	public String getLDlpcb81() {
		return this.lDlpcb81;
	}

	public void setLDlpcb81(String lDlpcb81) {
		this.lDlpcb81 = lDlpcb81;
	}

	public String getTbvisitId() {
		return this.tbvisitId;
	}

	public void setTbvisitId(String tbvisitId) {
		this.tbvisitId = tbvisitId;
	}

	public String getTeqType() {
		return this.teqType;
	}

	public void setTeqType(String teqType) {
		this.teqType = teqType;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}