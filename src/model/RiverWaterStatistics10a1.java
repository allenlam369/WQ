package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the river_water_statistics10a1 database table.
 * 
 */
//@Entity
@Table(name="river_water_statistics10a1")
@NamedQuery(name="RiverWaterStatistics10a1.findAll", query="SELECT r FROM RiverWaterStatistics10a1 r")
public class RiverWaterStatistics10a1 implements Serializable {
	private static final long serialVersionUID = 1L;

	private double ag;

	private double al;

	private double arsenic;

	private double b;

	private double ba;

	private double be;

	private double bod5;

	@Column(name="bod5_pt")
	private double bod5Pt;

	private double cd;

	private double chl;

	private double cl;

	private double cod;

	private String color;

	private double cond;

	private double cr;

	private double cu;

	private double depth;

	private double deterg;

	@Column(name="disp_seq")
	private Integer dispSeq;

	@Column(name="disp_stats")
	private String dispStats;

	@Column(name="\"DO\"")
	private double do_;

	private double dos;

	@Column(name="dos_pt")
	private double dosPt;

	private double ec;

	private double fc;

	private double fe;

	private double fl;

	private double flow;

	private double h2s;

	private double hg;

	@Column(name="l_ag")
	private String lAg;

	@Column(name="l_al")
	private String lAl;

	@Column(name="l_arsenic")
	private String lArsenic;

	@Column(name="l_b")
	private String lB;

	@Column(name="l_ba")
	private String lBa;

	@Column(name="l_be")
	private String lBe;

	@Column(name="l_bod5")
	private String lBod5;

	@Column(name="l_cd")
	private String lCd;

	@Column(name="l_chl")
	private String lChl;

	@Column(name="l_cl")
	private String lCl;

	@Column(name="l_cod")
	private String lCod;

	@Column(name="l_cond")
	private String lCond;

	@Column(name="l_cr")
	private String lCr;

	@Column(name="l_cu")
	private String lCu;

	@Column(name="l_deterg")
	private String lDeterg;

	@Column(name="l_do")
	private String lDo;

	@Column(name="l_dos")
	private String lDos;

	@Column(name="l_ec")
	private String lEc;

	@Column(name="l_fc")
	private String lFc;

	@Column(name="l_fe")
	private String lFe;

	@Column(name="l_fl")
	private String lFl;

	@Column(name="l_h2s")
	private String lH2s;

	@Column(name="l_hg")
	private String lHg;

	@Column(name="l_mn")
	private String lMn;

	@Column(name="l_mo")
	private String lMo;

	@Column(name="l_nh3")
	private String lNh3;

	@Column(name="l_nh4")
	private String lNh4;

	@Column(name="l_ni")
	private String lNi;

	@Column(name="l_no2")
	private String lNo2;

	@Column(name="l_no3")
	private String lNo3;

	@Column(name="l_oil")
	private String lOil;

	@Column(name="l_pb")
	private String lPb;

	@Column(name="l_ph")
	private String lPh;

	@Column(name="l_pheo")
	private String lPheo;

	@Column(name="l_po4")
	private String lPo4;

	@Column(name="l_sal")
	private String lSal;

	@Column(name="l_sb")
	private String lSb;

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

	@Column(name="l_tl")
	private String lTl;

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

	@Column(name="l_turb")
	private String lTurb;

	@Column(name="l_tvs")
	private String lTvs;

	@Column(name="l_v")
	private String lV;

	@Column(name="l_zn")
	private String lZn;

	private double mn;

	private double mo;

	private double nh3;

	private double nh4;

	@Column(name="nh4_pt")
	private double nh4Pt;

	private double ni;

	private double no2;

	private double no3;

	private double oil;

	private double pb;

	private double ph;

	private double pheo;

	private double po4;

	private String rainfall;

	private String river;

	private double sal;

	private double sb;

	private double sil;

	@Column(name="site_id")
	private BigDecimal siteId;

	private String smell;

	private double ss;

	private double ssp;

	private String station;

	private String subzone;

	private double sulp;

	private double tcyn;

	private double temper;

	private String tide;

	private double tin;

	private double tkns;

	private double tknsp;

	private double tl;

	private double tn;

	private double toc;

	private Integer total;

	private double tps;

	private double tpsp;

	private double ts;

	private double turb;

	private double tvs;

	private double v;

	private double vel;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	private String weather;

	private BigDecimal width;

	@Column(name="wqi_grade")
	private String wqiGrade;

	@Column(name="wqi_pt")
	private double wqiPt;

	private Integer yr;

	private double zn;

	private String zone;

	public RiverWaterStatistics10a1() {
	}

	public double getAg() {
		return this.ag;
	}

	public void setAg(double ag) {
		this.ag = ag;
	}

	public double getAl() {
		return this.al;
	}

	public void setAl(double al) {
		this.al = al;
	}

	public double getArsenic() {
		return this.arsenic;
	}

	public void setArsenic(double arsenic) {
		this.arsenic = arsenic;
	}

	public double getB() {
		return this.b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getBa() {
		return this.ba;
	}

	public void setBa(double ba) {
		this.ba = ba;
	}

	public double getBe() {
		return this.be;
	}

	public void setBe(double be) {
		this.be = be;
	}

	public double getBod5() {
		return this.bod5;
	}

	public void setBod5(double bod5) {
		this.bod5 = bod5;
	}

	public double getBod5Pt() {
		return this.bod5Pt;
	}

	public void setBod5Pt(double bod5Pt) {
		this.bod5Pt = bod5Pt;
	}

	public double getCd() {
		return this.cd;
	}

	public void setCd(double cd) {
		this.cd = cd;
	}

	public double getChl() {
		return this.chl;
	}

	public void setChl(double chl) {
		this.chl = chl;
	}

	public double getCl() {
		return this.cl;
	}

	public void setCl(double cl) {
		this.cl = cl;
	}

	public double getCod() {
		return this.cod;
	}

	public void setCod(double cod) {
		this.cod = cod;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCond() {
		return this.cond;
	}

	public void setCond(double cond) {
		this.cond = cond;
	}

	public double getCr() {
		return this.cr;
	}

	public void setCr(double cr) {
		this.cr = cr;
	}

	public double getCu() {
		return this.cu;
	}

	public void setCu(double cu) {
		this.cu = cu;
	}

	public double getDepth() {
		return this.depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getDeterg() {
		return this.deterg;
	}

	public void setDeterg(double deterg) {
		this.deterg = deterg;
	}

	public Integer getDispSeq() {
		return this.dispSeq;
	}

	public void setDispSeq(Integer dispSeq) {
		this.dispSeq = dispSeq;
	}

	public String getDispStats() {
		return this.dispStats;
	}

	public void setDispStats(String dispStats) {
		this.dispStats = dispStats;
	}

	public double getDo_() {
		return this.do_;
	}

	public void setDo_(double do_) {
		this.do_ = do_;
	}

	public double getDos() {
		return this.dos;
	}

	public void setDos(double dos) {
		this.dos = dos;
	}

	public double getDosPt() {
		return this.dosPt;
	}

	public void setDosPt(double dosPt) {
		this.dosPt = dosPt;
	}

	public double getEc() {
		return this.ec;
	}

	public void setEc(double ec) {
		this.ec = ec;
	}

	public double getFc() {
		return this.fc;
	}

	public void setFc(double fc) {
		this.fc = fc;
	}

	public double getFe() {
		return this.fe;
	}

	public void setFe(double fe) {
		this.fe = fe;
	}

	public double getFl() {
		return this.fl;
	}

	public void setFl(double fl) {
		this.fl = fl;
	}

	public double getFlow() {
		return this.flow;
	}

	public void setFlow(double flow) {
		this.flow = flow;
	}

	public double getH2s() {
		return this.h2s;
	}

	public void setH2s(double h2s) {
		this.h2s = h2s;
	}

	public double getHg() {
		return this.hg;
	}

	public void setHg(double hg) {
		this.hg = hg;
	}

	public String getLAg() {
		return this.lAg;
	}

	public void setLAg(String lAg) {
		this.lAg = lAg;
	}

	public String getLAl() {
		return this.lAl;
	}

	public void setLAl(String lAl) {
		this.lAl = lAl;
	}

	public String getLArsenic() {
		return this.lArsenic;
	}

	public void setLArsenic(String lArsenic) {
		this.lArsenic = lArsenic;
	}

	public String getLB() {
		return this.lB;
	}

	public void setLB(String lB) {
		this.lB = lB;
	}

	public String getLBa() {
		return this.lBa;
	}

	public void setLBa(String lBa) {
		this.lBa = lBa;
	}

	public String getLBe() {
		return this.lBe;
	}

	public void setLBe(String lBe) {
		this.lBe = lBe;
	}

	public String getLBod5() {
		return this.lBod5;
	}

	public void setLBod5(String lBod5) {
		this.lBod5 = lBod5;
	}

	public String getLCd() {
		return this.lCd;
	}

	public void setLCd(String lCd) {
		this.lCd = lCd;
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

	public String getLCond() {
		return this.lCond;
	}

	public void setLCond(String lCond) {
		this.lCond = lCond;
	}

	public String getLCr() {
		return this.lCr;
	}

	public void setLCr(String lCr) {
		this.lCr = lCr;
	}

	public String getLCu() {
		return this.lCu;
	}

	public void setLCu(String lCu) {
		this.lCu = lCu;
	}

	public String getLDeterg() {
		return this.lDeterg;
	}

	public void setLDeterg(String lDeterg) {
		this.lDeterg = lDeterg;
	}

	public String getLDo() {
		return this.lDo;
	}

	public void setLDo(String lDo) {
		this.lDo = lDo;
	}

	public String getLDos() {
		return this.lDos;
	}

	public void setLDos(String lDos) {
		this.lDos = lDos;
	}

	public String getLEc() {
		return this.lEc;
	}

	public void setLEc(String lEc) {
		this.lEc = lEc;
	}

	public String getLFc() {
		return this.lFc;
	}

	public void setLFc(String lFc) {
		this.lFc = lFc;
	}

	public String getLFe() {
		return this.lFe;
	}

	public void setLFe(String lFe) {
		this.lFe = lFe;
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

	public String getLHg() {
		return this.lHg;
	}

	public void setLHg(String lHg) {
		this.lHg = lHg;
	}

	public String getLMn() {
		return this.lMn;
	}

	public void setLMn(String lMn) {
		this.lMn = lMn;
	}

	public String getLMo() {
		return this.lMo;
	}

	public void setLMo(String lMo) {
		this.lMo = lMo;
	}

	public String getLNh3() {
		return this.lNh3;
	}

	public void setLNh3(String lNh3) {
		this.lNh3 = lNh3;
	}

	public String getLNh4() {
		return this.lNh4;
	}

	public void setLNh4(String lNh4) {
		this.lNh4 = lNh4;
	}

	public String getLNi() {
		return this.lNi;
	}

	public void setLNi(String lNi) {
		this.lNi = lNi;
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

	public String getLPb() {
		return this.lPb;
	}

	public void setLPb(String lPb) {
		this.lPb = lPb;
	}

	public String getLPh() {
		return this.lPh;
	}

	public void setLPh(String lPh) {
		this.lPh = lPh;
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

	public String getLSal() {
		return this.lSal;
	}

	public void setLSal(String lSal) {
		this.lSal = lSal;
	}

	public String getLSb() {
		return this.lSb;
	}

	public void setLSb(String lSb) {
		this.lSb = lSb;
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

	public String getLTl() {
		return this.lTl;
	}

	public void setLTl(String lTl) {
		this.lTl = lTl;
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

	public String getLTurb() {
		return this.lTurb;
	}

	public void setLTurb(String lTurb) {
		this.lTurb = lTurb;
	}

	public String getLTvs() {
		return this.lTvs;
	}

	public void setLTvs(String lTvs) {
		this.lTvs = lTvs;
	}

	public String getLV() {
		return this.lV;
	}

	public void setLV(String lV) {
		this.lV = lV;
	}

	public String getLZn() {
		return this.lZn;
	}

	public void setLZn(String lZn) {
		this.lZn = lZn;
	}

	public double getMn() {
		return this.mn;
	}

	public void setMn(double mn) {
		this.mn = mn;
	}

	public double getMo() {
		return this.mo;
	}

	public void setMo(double mo) {
		this.mo = mo;
	}

	public double getNh3() {
		return this.nh3;
	}

	public void setNh3(double nh3) {
		this.nh3 = nh3;
	}

	public double getNh4() {
		return this.nh4;
	}

	public void setNh4(double nh4) {
		this.nh4 = nh4;
	}

	public double getNh4Pt() {
		return this.nh4Pt;
	}

	public void setNh4Pt(double nh4Pt) {
		this.nh4Pt = nh4Pt;
	}

	public double getNi() {
		return this.ni;
	}

	public void setNi(double ni) {
		this.ni = ni;
	}

	public double getNo2() {
		return this.no2;
	}

	public void setNo2(double no2) {
		this.no2 = no2;
	}

	public double getNo3() {
		return this.no3;
	}

	public void setNo3(double no3) {
		this.no3 = no3;
	}

	public double getOil() {
		return this.oil;
	}

	public void setOil(double oil) {
		this.oil = oil;
	}

	public double getPb() {
		return this.pb;
	}

	public void setPb(double pb) {
		this.pb = pb;
	}

	public double getPh() {
		return this.ph;
	}

	public void setPh(double ph) {
		this.ph = ph;
	}

	public double getPheo() {
		return this.pheo;
	}

	public void setPheo(double pheo) {
		this.pheo = pheo;
	}

	public double getPo4() {
		return this.po4;
	}

	public void setPo4(double po4) {
		this.po4 = po4;
	}

	public String getRainfall() {
		return this.rainfall;
	}

	public void setRainfall(String rainfall) {
		this.rainfall = rainfall;
	}

	public String getRiver() {
		return this.river;
	}

	public void setRiver(String river) {
		this.river = river;
	}

	public double getSal() {
		return this.sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getSb() {
		return this.sb;
	}

	public void setSb(double sb) {
		this.sb = sb;
	}

	public double getSil() {
		return this.sil;
	}

	public void setSil(double sil) {
		this.sil = sil;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public String getSmell() {
		return this.smell;
	}

	public void setSmell(String smell) {
		this.smell = smell;
	}

	public double getSs() {
		return this.ss;
	}

	public void setSs(double ss) {
		this.ss = ss;
	}

	public double getSsp() {
		return this.ssp;
	}

	public void setSsp(double ssp) {
		this.ssp = ssp;
	}

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getSubzone() {
		return this.subzone;
	}

	public void setSubzone(String subzone) {
		this.subzone = subzone;
	}

	public double getSulp() {
		return this.sulp;
	}

	public void setSulp(double sulp) {
		this.sulp = sulp;
	}

	public double getTcyn() {
		return this.tcyn;
	}

	public void setTcyn(double tcyn) {
		this.tcyn = tcyn;
	}

	public double getTemper() {
		return this.temper;
	}

	public void setTemper(double temper) {
		this.temper = temper;
	}

	public String getTide() {
		return this.tide;
	}

	public void setTide(String tide) {
		this.tide = tide;
	}

	public double getTin() {
		return this.tin;
	}

	public void setTin(double tin) {
		this.tin = tin;
	}

	public double getTkns() {
		return this.tkns;
	}

	public void setTkns(double tkns) {
		this.tkns = tkns;
	}

	public double getTknsp() {
		return this.tknsp;
	}

	public void setTknsp(double tknsp) {
		this.tknsp = tknsp;
	}

	public double getTl() {
		return this.tl;
	}

	public void setTl(double tl) {
		this.tl = tl;
	}

	public double getTn() {
		return this.tn;
	}

	public void setTn(double tn) {
		this.tn = tn;
	}

	public double getToc() {
		return this.toc;
	}

	public void setToc(double toc) {
		this.toc = toc;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public double getTps() {
		return this.tps;
	}

	public void setTps(double tps) {
		this.tps = tps;
	}

	public double getTpsp() {
		return this.tpsp;
	}

	public void setTpsp(double tpsp) {
		this.tpsp = tpsp;
	}

	public double getTs() {
		return this.ts;
	}

	public void setTs(double ts) {
		this.ts = ts;
	}

	public double getTurb() {
		return this.turb;
	}

	public void setTurb(double turb) {
		this.turb = turb;
	}

	public double getTvs() {
		return this.tvs;
	}

	public void setTvs(double tvs) {
		this.tvs = tvs;
	}

	public double getV() {
		return this.v;
	}

	public void setV(double v) {
		this.v = v;
	}

	public double getVel() {
		return this.vel;
	}

	public void setVel(double vel) {
		this.vel = vel;
	}

	public BigDecimal getViewNo() {
		return this.viewNo;
	}

	public void setViewNo(BigDecimal viewNo) {
		this.viewNo = viewNo;
	}

	public String getWcz() {
		return this.wcz;
	}

	public void setWcz(String wcz) {
		this.wcz = wcz;
	}

	public String getWeather() {
		return this.weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public BigDecimal getWidth() {
		return this.width;
	}

	public void setWidth(BigDecimal width) {
		this.width = width;
	}

	public String getWqiGrade() {
		return this.wqiGrade;
	}

	public void setWqiGrade(String wqiGrade) {
		this.wqiGrade = wqiGrade;
	}

	public double getWqiPt() {
		return this.wqiPt;
	}

	public void setWqiPt(double wqiPt) {
		this.wqiPt = wqiPt;
	}

	public Integer getYr() {
		return this.yr;
	}

	public void setYr(Integer yr) {
		this.yr = yr;
	}

	public double getZn() {
		return this.zn;
	}

	public void setZn(double zn) {
		this.zn = zn;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}