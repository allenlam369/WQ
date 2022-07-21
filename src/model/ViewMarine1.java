package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the view_marine_1 database table.
 * 
 */
//@Entity
@Table(name="view_marine_1")
@NamedQuery(name="ViewMarine1.findAll", query="SELECT v FROM ViewMarine1 v")
public class ViewMarine1 implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal chl;

	@Column(name="l_chl")
	private String lChl;

	@Column(name="l_phae")
	private String lPhae;

	@Column(name="l_po4")
	private String lPo4;

	@Column(name="l_sio2")
	private String lSio2;

	@Column(name="l_ss")
	private String lSs;

	@Column(name="l_tkn_p")
	private String lTknP;

	@Column(name="l_tkn_s")
	private String lTknS;

	@Column(name="l_tkn_sp")
	private String lTknSp;

	@Column(name="l_tp_p")
	private String lTpP;

	@Column(name="l_tp_s")
	private String lTpS;

	@Column(name="l_tp_sp")
	private String lTpSp;

	@Column(name="l_tvs")
	private String lTvs;

	private Timestamp mdate;

	@Column(name="mwvisit_id")
	private String mwvisitId;

	@Column(name="nh4_n")
	private BigDecimal nh4N;

	@Column(name="no2_n")
	private BigDecimal no2N;

	@Column(name="no3_n")
	private BigDecimal no3N;

	private BigDecimal phae;

	private BigDecimal po4;

	@Column(name="qunh4_n")
	private String qunh4N;

	@Column(name="quno2_n")
	private String quno2N;

	@Column(name="quno3_n")
	private String quno3N;

	private BigDecimal sd;

	private BigDecimal sio2;

	private BigDecimal ss;

	private BigDecimal station;

	@Column(name="tkn_p")
	private BigDecimal tknP;

	@Column(name="tkn_s")
	private BigDecimal tknS;

	@Column(name="tkn_sp")
	private BigDecimal tknSp;

	@Column(name="tp_p")
	private BigDecimal tpP;

	@Column(name="tp_s")
	private BigDecimal tpS;

	@Column(name="tp_sp")
	private BigDecimal tpSp;

	private BigDecimal tvs;

	public ViewMarine1() {
	}

	public BigDecimal getChl() {
		return this.chl;
	}

	public void setChl(BigDecimal chl) {
		this.chl = chl;
	}

	public String getLChl() {
		return this.lChl;
	}

	public void setLChl(String lChl) {
		this.lChl = lChl;
	}

	public String getLPhae() {
		return this.lPhae;
	}

	public void setLPhae(String lPhae) {
		this.lPhae = lPhae;
	}

	public String getLPo4() {
		return this.lPo4;
	}

	public void setLPo4(String lPo4) {
		this.lPo4 = lPo4;
	}

	public String getLSio2() {
		return this.lSio2;
	}

	public void setLSio2(String lSio2) {
		this.lSio2 = lSio2;
	}

	public String getLSs() {
		return this.lSs;
	}

	public void setLSs(String lSs) {
		this.lSs = lSs;
	}

	public String getLTknP() {
		return this.lTknP;
	}

	public void setLTknP(String lTknP) {
		this.lTknP = lTknP;
	}

	public String getLTknS() {
		return this.lTknS;
	}

	public void setLTknS(String lTknS) {
		this.lTknS = lTknS;
	}

	public String getLTknSp() {
		return this.lTknSp;
	}

	public void setLTknSp(String lTknSp) {
		this.lTknSp = lTknSp;
	}

	public String getLTpP() {
		return this.lTpP;
	}

	public void setLTpP(String lTpP) {
		this.lTpP = lTpP;
	}

	public String getLTpS() {
		return this.lTpS;
	}

	public void setLTpS(String lTpS) {
		this.lTpS = lTpS;
	}

	public String getLTpSp() {
		return this.lTpSp;
	}

	public void setLTpSp(String lTpSp) {
		this.lTpSp = lTpSp;
	}

	public String getLTvs() {
		return this.lTvs;
	}

	public void setLTvs(String lTvs) {
		this.lTvs = lTvs;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
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

	public BigDecimal getPo4() {
		return this.po4;
	}

	public void setPo4(BigDecimal po4) {
		this.po4 = po4;
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

	public BigDecimal getSd() {
		return this.sd;
	}

	public void setSd(BigDecimal sd) {
		this.sd = sd;
	}

	public BigDecimal getSio2() {
		return this.sio2;
	}

	public void setSio2(BigDecimal sio2) {
		this.sio2 = sio2;
	}

	public BigDecimal getSs() {
		return this.ss;
	}

	public void setSs(BigDecimal ss) {
		this.ss = ss;
	}

	public BigDecimal getStation() {
		return this.station;
	}

	public void setStation(BigDecimal station) {
		this.station = station;
	}

	public BigDecimal getTknP() {
		return this.tknP;
	}

	public void setTknP(BigDecimal tknP) {
		this.tknP = tknP;
	}

	public BigDecimal getTknS() {
		return this.tknS;
	}

	public void setTknS(BigDecimal tknS) {
		this.tknS = tknS;
	}

	public BigDecimal getTknSp() {
		return this.tknSp;
	}

	public void setTknSp(BigDecimal tknSp) {
		this.tknSp = tknSp;
	}

	public BigDecimal getTpP() {
		return this.tpP;
	}

	public void setTpP(BigDecimal tpP) {
		this.tpP = tpP;
	}

	public BigDecimal getTpS() {
		return this.tpS;
	}

	public void setTpS(BigDecimal tpS) {
		this.tpS = tpS;
	}

	public BigDecimal getTpSp() {
		return this.tpSp;
	}

	public void setTpSp(BigDecimal tpSp) {
		this.tpSp = tpSp;
	}

	public BigDecimal getTvs() {
		return this.tvs;
	}

	public void setTvs(BigDecimal tvs) {
		this.tvs = tvs;
	}

}