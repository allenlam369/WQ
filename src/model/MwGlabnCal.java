package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the mw_glabn_cal database table.
 * 
 */
//@Entity
@Table(name="mw_glabn_cal")
@NamedQuery(name="MwGlabnCal.findAll", query="SELECT m FROM MwGlabnCal m")
public class MwGlabnCal implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal chl;

	@Column(name="depth_code")
	private String depthCode;

	@Column(name="l_chl")
	private String lChl;

	@Column(name="l_nh4")
	private String lNh4;

	@Column(name="l_no2")
	private String lNo2;

	@Column(name="l_no3")
	private String lNo3;

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

	@Column(name="l_tur")
	private String lTur;

	@Column(name="l_tvs")
	private String lTvs;

	@Column(name="mwvisit_id")
	private String mwvisitId;

	private BigDecimal nh4;

	@Column(name="nh4_nm")
	private BigDecimal nh4Nm;

	private BigDecimal no2;

	@Column(name="no2_nm")
	private BigDecimal no2Nm;

	private BigDecimal no3;

	@Column(name="no3_nm")
	private BigDecimal no3Nm;

	@Column(name="nox_nm")
	private BigDecimal noxNm;

	private BigDecimal phae;

	private BigDecimal po4;

	@Column(name="po4_pm")
	private BigDecimal po4Pm;

	private BigDecimal sio2;

	private BigDecimal ss;

	private BigDecimal tin;

	@Column(name="tin_nm")
	private BigDecimal tinNm;

	@Column(name="tin_po4_mmr")
	private BigDecimal tinPo4Mmr;

	@Column(name="tkn_nm")
	private BigDecimal tknNm;

	@Column(name="tkn_p")
	private BigDecimal tknP;

	@Column(name="tkn_s")
	private BigDecimal tknS;

	@Column(name="tkn_sp")
	private BigDecimal tknSp;

	private BigDecimal tn;

	@Column(name="tn_nm")
	private BigDecimal tnNm;

	@Column(name="tn_tp_mmr")
	private BigDecimal tnTpMmr;

	@Column(name="tp_p")
	private BigDecimal tpP;

	@Column(name="tp_pm")
	private BigDecimal tpPm;

	@Column(name="tp_s")
	private BigDecimal tpS;

	@Column(name="tp_sp")
	private BigDecimal tpSp;

	private BigDecimal tur;

	private BigDecimal tvs;

	public MwGlabnCal() {
	}

	public BigDecimal getChl() {
		return this.chl;
	}

	public void setChl(BigDecimal chl) {
		this.chl = chl;
	}

	public String getDepthCode() {
		return this.depthCode;
	}

	public void setDepthCode(String depthCode) {
		this.depthCode = depthCode;
	}

	public String getLChl() {
		return this.lChl;
	}

	public void setLChl(String lChl) {
		this.lChl = lChl;
	}

	public String getLNh4() {
		return this.lNh4;
	}

	public void setLNh4(String lNh4) {
		this.lNh4 = lNh4;
	}

	public String getLNo2() {
		return this.lNo2;
	}

	public void setLNo2(String lNo2) {
		this.lNo2 = lNo2;
	}

	public String getLNo3() {
		return this.lNo3;
	}

	public void setLNo3(String lNo3) {
		this.lNo3 = lNo3;
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

	public String getLTur() {
		return this.lTur;
	}

	public void setLTur(String lTur) {
		this.lTur = lTur;
	}

	public String getLTvs() {
		return this.lTvs;
	}

	public void setLTvs(String lTvs) {
		this.lTvs = lTvs;
	}

	public String getMwvisitId() {
		return this.mwvisitId;
	}

	public void setMwvisitId(String mwvisitId) {
		this.mwvisitId = mwvisitId;
	}

	public BigDecimal getNh4() {
		return this.nh4;
	}

	public void setNh4(BigDecimal nh4) {
		this.nh4 = nh4;
	}

	public BigDecimal getNh4Nm() {
		return this.nh4Nm;
	}

	public void setNh4Nm(BigDecimal nh4Nm) {
		this.nh4Nm = nh4Nm;
	}

	public BigDecimal getNo2() {
		return this.no2;
	}

	public void setNo2(BigDecimal no2) {
		this.no2 = no2;
	}

	public BigDecimal getNo2Nm() {
		return this.no2Nm;
	}

	public void setNo2Nm(BigDecimal no2Nm) {
		this.no2Nm = no2Nm;
	}

	public BigDecimal getNo3() {
		return this.no3;
	}

	public void setNo3(BigDecimal no3) {
		this.no3 = no3;
	}

	public BigDecimal getNo3Nm() {
		return this.no3Nm;
	}

	public void setNo3Nm(BigDecimal no3Nm) {
		this.no3Nm = no3Nm;
	}

	public BigDecimal getNoxNm() {
		return this.noxNm;
	}

	public void setNoxNm(BigDecimal noxNm) {
		this.noxNm = noxNm;
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

	public BigDecimal getPo4Pm() {
		return this.po4Pm;
	}

	public void setPo4Pm(BigDecimal po4Pm) {
		this.po4Pm = po4Pm;
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

	public BigDecimal getTin() {
		return this.tin;
	}

	public void setTin(BigDecimal tin) {
		this.tin = tin;
	}

	public BigDecimal getTinNm() {
		return this.tinNm;
	}

	public void setTinNm(BigDecimal tinNm) {
		this.tinNm = tinNm;
	}

	public BigDecimal getTinPo4Mmr() {
		return this.tinPo4Mmr;
	}

	public void setTinPo4Mmr(BigDecimal tinPo4Mmr) {
		this.tinPo4Mmr = tinPo4Mmr;
	}

	public BigDecimal getTknNm() {
		return this.tknNm;
	}

	public void setTknNm(BigDecimal tknNm) {
		this.tknNm = tknNm;
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

	public BigDecimal getTn() {
		return this.tn;
	}

	public void setTn(BigDecimal tn) {
		this.tn = tn;
	}

	public BigDecimal getTnNm() {
		return this.tnNm;
	}

	public void setTnNm(BigDecimal tnNm) {
		this.tnNm = tnNm;
	}

	public BigDecimal getTnTpMmr() {
		return this.tnTpMmr;
	}

	public void setTnTpMmr(BigDecimal tnTpMmr) {
		this.tnTpMmr = tnTpMmr;
	}

	public BigDecimal getTpP() {
		return this.tpP;
	}

	public void setTpP(BigDecimal tpP) {
		this.tpP = tpP;
	}

	public BigDecimal getTpPm() {
		return this.tpPm;
	}

	public void setTpPm(BigDecimal tpPm) {
		this.tpPm = tpPm;
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

	public BigDecimal getTur() {
		return this.tur;
	}

	public void setTur(BigDecimal tur) {
		this.tur = tur;
	}

	public BigDecimal getTvs() {
		return this.tvs;
	}

	public void setTvs(BigDecimal tvs) {
		this.tvs = tvs;
	}

}