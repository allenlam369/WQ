package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the db_rw_quality database table.
 * 
 */
//@Entity
@Table(name="db_rw_quality")
@NamedQuery(name="DbRwQuality.findAll", query="SELECT d FROM DbRwQuality d")
public class DbRwQuality implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal bod;

	@Column(name="chl_a")
	private BigDecimal chlA;

	private BigDecimal cl;

	private BigDecimal cod;

	private BigDecimal cond;

	@Column(name="cu_diss")
	private BigDecimal cuDiss;

	@Column(name="cu_tot")
	private BigDecimal cuTot;

	@Column(name="\"DO\"")
	private BigDecimal do_;

	private Timestamp mdate;

	@Column(name="nh3_n")
	private BigDecimal nh3N;

	@Column(name="no2_n")
	private BigDecimal no2N;

	@Column(name="no3_n")
	private BigDecimal no3N;

	private BigDecimal ph;

	@Column(name="po4_p")
	private BigDecimal po4P;

	@Column(name="qu_chl_a")
	private String quChlA;

	@Column(name="qu_cu_diss")
	private String quCuDiss;

	@Column(name="qu_no2_n")
	private String quNo2N;

	@Column(name="qu_no3_n")
	private String quNo3N;

	@Column(name="river_id")
	private BigDecimal riverId;

	@Column(name="river_name")
	private String riverName;

	private BigDecimal sal;

	private String scode;

	private BigDecimal si;

	private BigDecimal ss;

	private BigDecimal temp;

	private String tide;

	private BigDecimal time;

	private BigDecimal tkn;

	private BigDecimal tn;

	private BigDecimal toc;

	private BigDecimal tp;

	public DbRwQuality() {
	}

	public BigDecimal getBod() {
		return this.bod;
	}

	public void setBod(BigDecimal bod) {
		this.bod = bod;
	}

	public BigDecimal getChlA() {
		return this.chlA;
	}

	public void setChlA(BigDecimal chlA) {
		this.chlA = chlA;
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

	public BigDecimal getCond() {
		return this.cond;
	}

	public void setCond(BigDecimal cond) {
		this.cond = cond;
	}

	public BigDecimal getCuDiss() {
		return this.cuDiss;
	}

	public void setCuDiss(BigDecimal cuDiss) {
		this.cuDiss = cuDiss;
	}

	public BigDecimal getCuTot() {
		return this.cuTot;
	}

	public void setCuTot(BigDecimal cuTot) {
		this.cuTot = cuTot;
	}

	public BigDecimal getDo_() {
		return this.do_;
	}

	public void setDo_(BigDecimal do_) {
		this.do_ = do_;
	}

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getNh3N() {
		return this.nh3N;
	}

	public void setNh3N(BigDecimal nh3N) {
		this.nh3N = nh3N;
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

	public BigDecimal getPh() {
		return this.ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public BigDecimal getPo4P() {
		return this.po4P;
	}

	public void setPo4P(BigDecimal po4P) {
		this.po4P = po4P;
	}

	public String getQuChlA() {
		return this.quChlA;
	}

	public void setQuChlA(String quChlA) {
		this.quChlA = quChlA;
	}

	public String getQuCuDiss() {
		return this.quCuDiss;
	}

	public void setQuCuDiss(String quCuDiss) {
		this.quCuDiss = quCuDiss;
	}

	public String getQuNo2N() {
		return this.quNo2N;
	}

	public void setQuNo2N(String quNo2N) {
		this.quNo2N = quNo2N;
	}

	public String getQuNo3N() {
		return this.quNo3N;
	}

	public void setQuNo3N(String quNo3N) {
		this.quNo3N = quNo3N;
	}

	public BigDecimal getRiverId() {
		return this.riverId;
	}

	public void setRiverId(BigDecimal riverId) {
		this.riverId = riverId;
	}

	public String getRiverName() {
		return this.riverName;
	}

	public void setRiverName(String riverName) {
		this.riverName = riverName;
	}

	public BigDecimal getSal() {
		return this.sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

	public String getScode() {
		return this.scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}

	public BigDecimal getSi() {
		return this.si;
	}

	public void setSi(BigDecimal si) {
		this.si = si;
	}

	public BigDecimal getSs() {
		return this.ss;
	}

	public void setSs(BigDecimal ss) {
		this.ss = ss;
	}

	public BigDecimal getTemp() {
		return this.temp;
	}

	public void setTemp(BigDecimal temp) {
		this.temp = temp;
	}

	public String getTide() {
		return this.tide;
	}

	public void setTide(String tide) {
		this.tide = tide;
	}

	public BigDecimal getTime() {
		return this.time;
	}

	public void setTime(BigDecimal time) {
		this.time = time;
	}

	public BigDecimal getTkn() {
		return this.tkn;
	}

	public void setTkn(BigDecimal tkn) {
		this.tkn = tkn;
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

	public BigDecimal getTp() {
		return this.tp;
	}

	public void setTp(BigDecimal tp) {
		this.tp = tp;
	}

}