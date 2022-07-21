package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the rw_glabn_cal_a database table.
 * 
 */
//@Entity
@Table(name="rw_glabn_cal_a")
@NamedQuery(name="RwGlabnCalA.findAll", query="SELECT r FROM RwGlabnCalA r")
public class RwGlabnCalA implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal chl;

	private BigDecimal cl;

	private BigDecimal cod;

	private BigDecimal deterg;

	private BigDecimal fl;

	private BigDecimal h2s;

	@Column(name="l_chl")
	private String lChl;

	@Column(name="l_cl")
	private String lCl;

	@Column(name="l_cod")
	private String lCod;

	@Column(name="l_deterg")
	private String lDeterg;

	@Column(name="l_fl")
	private String lFl;

	@Column(name="l_h2s")
	private String lH2s;

	@Column(name="l_nh4")
	private String lNh4;

	@Column(name="l_no2")
	private String lNo2;

	@Column(name="l_no3")
	private String lNo3;

	@Column(name="l_oil")
	private String lOil;

	@Column(name="l_pheo")
	private String lPheo;

	@Column(name="l_po4")
	private String lPo4;

	@Column(name="l_sil")
	private String lSil;

	@Column(name="l_ss")
	private String lSs;

	@Column(name="l_ssp")
	private String lSsp;

	@Column(name="l_sulp")
	private String lSulp;

	@Column(name="l_tcyn")
	private String lTcyn;

	@Column(name="l_tin")
	private String lTin;

	@Column(name="l_tkns")
	private String lTkns;

	@Column(name="l_tknsp")
	private String lTknsp;

	@Column(name="l_tn")
	private String lTn;

	@Column(name="l_toc")
	private String lToc;

	@Column(name="l_tps")
	private String lTps;

	@Column(name="l_tpsp")
	private String lTpsp;

	@Column(name="l_ts")
	private String lTs;

	@Column(name="l_tvs")
	private String lTvs;

	private BigDecimal nh4;

	private BigDecimal no2;

	private BigDecimal no3;

	private BigDecimal oil;

	private BigDecimal pheo;

	private BigDecimal po4;

	@Column(name="rwvisit_id")
	private String rwvisitId;

	private BigDecimal sil;

	private BigDecimal ss;

	private BigDecimal ssp;

	private BigDecimal sulp;

	private BigDecimal tcyn;

	private BigDecimal tin;

	private BigDecimal tkns;

	private BigDecimal tknsp;

	private BigDecimal tn;

	private BigDecimal toc;

	private BigDecimal tps;

	private BigDecimal tpsp;

	private BigDecimal ts;

	private BigDecimal tvs;

	public RwGlabnCalA() {
	}

	public BigDecimal getChl() {
		return this.chl;
	}

	public void setChl(BigDecimal chl) {
		this.chl = chl;
	}

	public BigDecimal getCl() {
		return this.cl;
	}

	public void setCl(BigDecimal cl) {
		this.cl = cl;
	}

	public BigDecimal getCod() {
		return this.cod;
	}

	public void setCod(BigDecimal cod) {
		this.cod = cod;
	}

	public BigDecimal getDeterg() {
		return this.deterg;
	}

	public void setDeterg(BigDecimal deterg) {
		this.deterg = deterg;
	}

	public BigDecimal getFl() {
		return this.fl;
	}

	public void setFl(BigDecimal fl) {
		this.fl = fl;
	}

	public BigDecimal getH2s() {
		return this.h2s;
	}

	public void setH2s(BigDecimal h2s) {
		this.h2s = h2s;
	}

	public String getLChl() {
		return this.lChl;
	}

	public void setLChl(String lChl) {
		this.lChl = lChl;
	}

	public String getLCl() {
		return this.lCl;
	}

	public void setLCl(String lCl) {
		this.lCl = lCl;
	}

	public String getLCod() {
		return this.lCod;
	}

	public void setLCod(String lCod) {
		this.lCod = lCod;
	}

	public String getLDeterg() {
		return this.lDeterg;
	}

	public void setLDeterg(String lDeterg) {
		this.lDeterg = lDeterg;
	}

	public String getLFl() {
		return this.lFl;
	}

	public void setLFl(String lFl) {
		this.lFl = lFl;
	}

	public String getLH2s() {
		return this.lH2s;
	}

	public void setLH2s(String lH2s) {
		this.lH2s = lH2s;
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

	public String getLOil() {
		return this.lOil;
	}

	public void setLOil(String lOil) {
		this.lOil = lOil;
	}

	public String getLPheo() {
		return this.lPheo;
	}

	public void setLPheo(String lPheo) {
		this.lPheo = lPheo;
	}

	public String getLPo4() {
		return this.lPo4;
	}

	public void setLPo4(String lPo4) {
		this.lPo4 = lPo4;
	}

	public String getLSil() {
		return this.lSil;
	}

	public void setLSil(String lSil) {
		this.lSil = lSil;
	}

	public String getLSs() {
		return this.lSs;
	}

	public void setLSs(String lSs) {
		this.lSs = lSs;
	}

	public String getLSsp() {
		return this.lSsp;
	}

	public void setLSsp(String lSsp) {
		this.lSsp = lSsp;
	}

	public String getLSulp() {
		return this.lSulp;
	}

	public void setLSulp(String lSulp) {
		this.lSulp = lSulp;
	}

	public String getLTcyn() {
		return this.lTcyn;
	}

	public void setLTcyn(String lTcyn) {
		this.lTcyn = lTcyn;
	}

	public String getLTin() {
		return this.lTin;
	}

	public void setLTin(String lTin) {
		this.lTin = lTin;
	}

	public String getLTkns() {
		return this.lTkns;
	}

	public void setLTkns(String lTkns) {
		this.lTkns = lTkns;
	}

	public String getLTknsp() {
		return this.lTknsp;
	}

	public void setLTknsp(String lTknsp) {
		this.lTknsp = lTknsp;
	}

	public String getLTn() {
		return this.lTn;
	}

	public void setLTn(String lTn) {
		this.lTn = lTn;
	}

	public String getLToc() {
		return this.lToc;
	}

	public void setLToc(String lToc) {
		this.lToc = lToc;
	}

	public String getLTps() {
		return this.lTps;
	}

	public void setLTps(String lTps) {
		this.lTps = lTps;
	}

	public String getLTpsp() {
		return this.lTpsp;
	}

	public void setLTpsp(String lTpsp) {
		this.lTpsp = lTpsp;
	}

	public String getLTs() {
		return this.lTs;
	}

	public void setLTs(String lTs) {
		this.lTs = lTs;
	}

	public String getLTvs() {
		return this.lTvs;
	}

	public void setLTvs(String lTvs) {
		this.lTvs = lTvs;
	}

	public BigDecimal getNh4() {
		return this.nh4;
	}

	public void setNh4(BigDecimal nh4) {
		this.nh4 = nh4;
	}

	public BigDecimal getNo2() {
		return this.no2;
	}

	public void setNo2(BigDecimal no2) {
		this.no2 = no2;
	}

	public BigDecimal getNo3() {
		return this.no3;
	}

	public void setNo3(BigDecimal no3) {
		this.no3 = no3;
	}

	public BigDecimal getOil() {
		return this.oil;
	}

	public void setOil(BigDecimal oil) {
		this.oil = oil;
	}

	public BigDecimal getPheo() {
		return this.pheo;
	}

	public void setPheo(BigDecimal pheo) {
		this.pheo = pheo;
	}

	public BigDecimal getPo4() {
		return this.po4;
	}

	public void setPo4(BigDecimal po4) {
		this.po4 = po4;
	}

	public String getRwvisitId() {
		return this.rwvisitId;
	}

	public void setRwvisitId(String rwvisitId) {
		this.rwvisitId = rwvisitId;
	}

	public BigDecimal getSil() {
		return this.sil;
	}

	public void setSil(BigDecimal sil) {
		this.sil = sil;
	}

	public BigDecimal getSs() {
		return this.ss;
	}

	public void setSs(BigDecimal ss) {
		this.ss = ss;
	}

	public BigDecimal getSsp() {
		return this.ssp;
	}

	public void setSsp(BigDecimal ssp) {
		this.ssp = ssp;
	}

	public BigDecimal getSulp() {
		return this.sulp;
	}

	public void setSulp(BigDecimal sulp) {
		this.sulp = sulp;
	}

	public BigDecimal getTcyn() {
		return this.tcyn;
	}

	public void setTcyn(BigDecimal tcyn) {
		this.tcyn = tcyn;
	}

	public BigDecimal getTin() {
		return this.tin;
	}

	public void setTin(BigDecimal tin) {
		this.tin = tin;
	}

	public BigDecimal getTkns() {
		return this.tkns;
	}

	public void setTkns(BigDecimal tkns) {
		this.tkns = tkns;
	}

	public BigDecimal getTknsp() {
		return this.tknsp;
	}

	public void setTknsp(BigDecimal tknsp) {
		this.tknsp = tknsp;
	}

	public BigDecimal getTn() {
		return this.tn;
	}

	public void setTn(BigDecimal tn) {
		this.tn = tn;
	}

	public BigDecimal getToc() {
		return this.toc;
	}

	public void setToc(BigDecimal toc) {
		this.toc = toc;
	}

	public BigDecimal getTps() {
		return this.tps;
	}

	public void setTps(BigDecimal tps) {
		this.tps = tps;
	}

	public BigDecimal getTpsp() {
		return this.tpsp;
	}

	public void setTpsp(BigDecimal tpsp) {
		this.tpsp = tpsp;
	}

	public BigDecimal getTs() {
		return this.ts;
	}

	public void setTs(BigDecimal ts) {
		this.ts = ts;
	}

	public BigDecimal getTvs() {
		return this.tvs;
	}

	public void setTvs(BigDecimal tvs) {
		this.tvs = tvs;
	}

}