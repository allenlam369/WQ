package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tw_clab_cal database table.
 * 
 */
//@Entity
@Table(name="tw_clab_cal")
@NamedQuery(name="TwClabCal.findAll", query="SELECT t FROM TwClabCal t")
public class TwClabCal implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal dbt;

	@Column(name="l_dbt")
	private String lDbt;

	@Column(name="l_mbt")
	private String lMbt;

	@Column(name="l_np")
	private String lNp;

	@Column(name="l_npde")
	private String lNpde;

	@Column(name="l_npe")
	private String lNpe;

	@Column(name="l_npme")
	private String lNpme;

	@Column(name="l_pbb")
	private String lPbb;

	@Column(name="l_pf")
	private String lPf;

	@Column(name="l_tbt")
	private String lTbt;

	private BigDecimal mbt;

	private BigDecimal np;

	private BigDecimal npde;

	private BigDecimal npe;

	private BigDecimal npme;

	private BigDecimal osn;

	private BigDecimal pbb;

	private BigDecimal pf;

	private BigDecimal tbt;

	@Column(name="twvisit_id")
	private String twvisitId;

	private String type;

	public TwClabCal() {
	}

	public BigDecimal getDbt() {
		return this.dbt;
	}

	public void setDbt(BigDecimal dbt) {
		this.dbt = dbt;
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

	public String getLNp() {
		return this.lNp;
	}

	public void setLNp(String lNp) {
		this.lNp = lNp;
	}

	public String getLNpde() {
		return this.lNpde;
	}

	public void setLNpde(String lNpde) {
		this.lNpde = lNpde;
	}

	public String getLNpe() {
		return this.lNpe;
	}

	public void setLNpe(String lNpe) {
		this.lNpe = lNpe;
	}

	public String getLNpme() {
		return this.lNpme;
	}

	public void setLNpme(String lNpme) {
		this.lNpme = lNpme;
	}

	public String getLPbb() {
		return this.lPbb;
	}

	public void setLPbb(String lPbb) {
		this.lPbb = lPbb;
	}

	public String getLPf() {
		return this.lPf;
	}

	public void setLPf(String lPf) {
		this.lPf = lPf;
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

	public BigDecimal getNp() {
		return this.np;
	}

	public void setNp(BigDecimal np) {
		this.np = np;
	}

	public BigDecimal getNpde() {
		return this.npde;
	}

	public void setNpde(BigDecimal npde) {
		this.npde = npde;
	}

	public BigDecimal getNpe() {
		return this.npe;
	}

	public void setNpe(BigDecimal npe) {
		this.npe = npe;
	}

	public BigDecimal getNpme() {
		return this.npme;
	}

	public void setNpme(BigDecimal npme) {
		this.npme = npme;
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

	public BigDecimal getPf() {
		return this.pf;
	}

	public void setPf(BigDecimal pf) {
		this.pf = pf;
	}

	public BigDecimal getTbt() {
		return this.tbt;
	}

	public void setTbt(BigDecimal tbt) {
		this.tbt = tbt;
	}

	public String getTwvisitId() {
		return this.twvisitId;
	}

	public void setTwvisitId(String twvisitId) {
		this.twvisitId = twvisitId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}