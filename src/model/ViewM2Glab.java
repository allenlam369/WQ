package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the view_m2_glab database table.
 * 
 */
//@Entity
@Table(name="view_m2_glab")
@NamedQuery(name="ViewM2Glab.findAll", query="SELECT v FROM ViewM2Glab v")
public class ViewM2Glab implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal chy;

	@Column(name="depth_code")
	private String depthCode;

	@Column(name="mwvisit_id")
	private String mwvisitId;

	@Column(name="nh4_n")
	private BigDecimal nh4N;

	@Column(name="no2_n")
	private BigDecimal no2N;

	@Column(name="no3_n")
	private BigDecimal no3N;

	private BigDecimal phae;

	@Column(name="po4_p")
	private BigDecimal po4P;

	@Column(name="qtp_ps")
	private String qtpPs;

	private String quchy;

	@Column(name="qunh4_n")
	private String qunh4N;

	@Column(name="quno2_n")
	private String quno2N;

	@Column(name="quno3_n")
	private String quno3N;

	private String quphae;

	@Column(name="qupo4_p")
	private String qupo4P;

	private String quss;

	@Column(name="qutkn_s_ps")
	private String qutknSPs;

	private String qutkns;

	@Column(name="qutp_ps")
	private BigDecimal qutpPs;

	private String qutvs;

	private BigDecimal ss;

	@Column(name="tkn_s_ps")
	private BigDecimal tknSPs;

	private BigDecimal tkns;

	private BigDecimal tvs;

	public ViewM2Glab() {
	}

	public BigDecimal getChy() {
		return this.chy;
	}

	public void setChy(BigDecimal chy) {
		this.chy = chy;
	}

	public String getDepthCode() {
		return this.depthCode;
	}

	public void setDepthCode(String depthCode) {
		this.depthCode = depthCode;
	}

	public String getMwvisitId() {
		return this.mwvisitId;
	}

	public void setMwvisitId(String mwvisitId) {
		this.mwvisitId = mwvisitId;
	}

	public BigDecimal getNh4N() {
		return this.nh4N;
	}

	public void setNh4N(BigDecimal nh4N) {
		this.nh4N = nh4N;
	}

	public BigDecimal getNo2N() {
		return this.no2N;
	}

	public void setNo2N(BigDecimal no2N) {
		this.no2N = no2N;
	}

	public BigDecimal getNo3N() {
		return this.no3N;
	}

	public void setNo3N(BigDecimal no3N) {
		this.no3N = no3N;
	}

	public BigDecimal getPhae() {
		return this.phae;
	}

	public void setPhae(BigDecimal phae) {
		this.phae = phae;
	}

	public BigDecimal getPo4P() {
		return this.po4P;
	}

	public void setPo4P(BigDecimal po4P) {
		this.po4P = po4P;
	}

	public String getQtpPs() {
		return this.qtpPs;
	}

	public void setQtpPs(String qtpPs) {
		this.qtpPs = qtpPs;
	}

	public String getQuchy() {
		return this.quchy;
	}

	public void setQuchy(String quchy) {
		this.quchy = quchy;
	}

	public String getQunh4N() {
		return this.qunh4N;
	}

	public void setQunh4N(String qunh4N) {
		this.qunh4N = qunh4N;
	}

	public String getQuno2N() {
		return this.quno2N;
	}

	public void setQuno2N(String quno2N) {
		this.quno2N = quno2N;
	}

	public String getQuno3N() {
		return this.quno3N;
	}

	public void setQuno3N(String quno3N) {
		this.quno3N = quno3N;
	}

	public String getQuphae() {
		return this.quphae;
	}

	public void setQuphae(String quphae) {
		this.quphae = quphae;
	}

	public String getQupo4P() {
		return this.qupo4P;
	}

	public void setQupo4P(String qupo4P) {
		this.qupo4P = qupo4P;
	}

	public String getQuss() {
		return this.quss;
	}

	public void setQuss(String quss) {
		this.quss = quss;
	}

	public String getQutknSPs() {
		return this.qutknSPs;
	}

	public void setQutknSPs(String qutknSPs) {
		this.qutknSPs = qutknSPs;
	}

	public String getQutkns() {
		return this.qutkns;
	}

	public void setQutkns(String qutkns) {
		this.qutkns = qutkns;
	}

	public BigDecimal getQutpPs() {
		return this.qutpPs;
	}

	public void setQutpPs(BigDecimal qutpPs) {
		this.qutpPs = qutpPs;
	}

	public String getQutvs() {
		return this.qutvs;
	}

	public void setQutvs(String qutvs) {
		this.qutvs = qutvs;
	}

	public BigDecimal getSs() {
		return this.ss;
	}

	public void setSs(BigDecimal ss) {
		this.ss = ss;
	}

	public BigDecimal getTknSPs() {
		return this.tknSPs;
	}

	public void setTknSPs(BigDecimal tknSPs) {
		this.tknSPs = tknSPs;
	}

	public BigDecimal getTkns() {
		return this.tkns;
	}

	public void setTkns(BigDecimal tkns) {
		this.tkns = tkns;
	}

	public BigDecimal getTvs() {
		return this.tvs;
	}

	public void setTvs(BigDecimal tvs) {
		this.tvs = tvs;
	}

}