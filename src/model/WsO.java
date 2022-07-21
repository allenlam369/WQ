package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ws_o database table.
 * 
 */
//@Entity
@Table(name="ws_o")
@NamedQuery(name="WsO.findAll", query="SELECT w FROM WsO w")
public class WsO implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal aldr;

	private BigDecimal anth;

	private BigDecimal bapy;

	private BigDecimal bbfl;

	private BigDecimal bgpe;

	private BigDecimal bhc;

	private BigDecimal bkfl;

	private BigDecimal chry;

	private String depth;

	private BigDecimal endr;

	private BigDecimal fluo;

	private BigDecimal flut;

	private BigDecimal hcb;

	private BigDecimal hepo;

	private BigDecimal hept;

	@Column(name="l_aldr")
	private String lAldr;

	@Column(name="l_anth")
	private String lAnth;

	@Column(name="l_bapy")
	private String lBapy;

	@Column(name="l_bbfl")
	private String lBbfl;

	@Column(name="l_bgpe")
	private String lBgpe;

	@Column(name="l_bhc")
	private String lBhc;

	@Column(name="l_bkfl")
	private String lBkfl;

	@Column(name="l_chry")
	private String lChry;

	@Column(name="l_endr")
	private String lEndr;

	@Column(name="l_fluo")
	private String lFluo;

	@Column(name="l_flut")
	private String lFlut;

	@Column(name="l_hepo")
	private String lHepo;

	@Column(name="l_hept")
	private String lHept;

	@Column(name="l_mdcb")
	private String lMdcb;

	@Column(name="l_odcb")
	private String lOdcb;

	@Column(name="l_oddd")
	private String lOddd;

	@Column(name="l_odde")
	private String lOdde;

	@Column(name="l_oddt")
	private String lOddt;

	@Column(name="l_pah")
	private String lPah;

	@Column(name="l_pcb")
	private String lPcb;

	@Column(name="l_pddd")
	private String lPddd;

	@Column(name="l_pdde")
	private String lPdde;

	@Column(name="l_pddt")
	private String lPddt;

	@Column(name="l_phen")
	private String lPhen;

	@Column(name="l_pyre")
	private String lPyre;

	@Column(name="l_thms")
	private String lThms;

	@Column(name="l_trce")
	private String lTrce;

	@Column(name="l_ttce")
	private String lTtce;

	private String lhcb;

	@Column(name="lt_chs")
	private String ltChs;

	@Column(name="lt_ocps")
	private String ltOcps;

	@Column(name="m_date")
	private Timestamp mDate;

	private BigDecimal mdcb;

	private BigDecimal odcb;

	private BigDecimal oddd;

	private BigDecimal odde;

	private BigDecimal oddt;

	private BigDecimal pah;

	private BigDecimal pcb;

	private BigDecimal pddd;

	private BigDecimal pdde;

	private BigDecimal pddt;

	private BigDecimal phen;

	private BigDecimal pyre;

	@Column(name="s_time")
	private BigDecimal sTime;

	@Column(name="s_type")
	private String sType;

	private BigDecimal samples;

	@Column(name="station_id")
	private String stationId;

	@Column(name="t_chs")
	private BigDecimal tChs;

	@Column(name="t_ocps")
	private BigDecimal tOcps;

	private BigDecimal thms;

	private BigDecimal todwr;

	private BigDecimal trce;

	private BigDecimal ttce;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	@Column(name="w_visit_id")
	private String wVisitId;

	public WsO() {
	}

	public BigDecimal getAldr() {
		return this.aldr;
	}

	public void setAldr(BigDecimal aldr) {
		this.aldr = aldr;
	}

	public BigDecimal getAnth() {
		return this.anth;
	}

	public void setAnth(BigDecimal anth) {
		this.anth = anth;
	}

	public BigDecimal getBapy() {
		return this.bapy;
	}

	public void setBapy(BigDecimal bapy) {
		this.bapy = bapy;
	}

	public BigDecimal getBbfl() {
		return this.bbfl;
	}

	public void setBbfl(BigDecimal bbfl) {
		this.bbfl = bbfl;
	}

	public BigDecimal getBgpe() {
		return this.bgpe;
	}

	public void setBgpe(BigDecimal bgpe) {
		this.bgpe = bgpe;
	}

	public BigDecimal getBhc() {
		return this.bhc;
	}

	public void setBhc(BigDecimal bhc) {
		this.bhc = bhc;
	}

	public BigDecimal getBkfl() {
		return this.bkfl;
	}

	public void setBkfl(BigDecimal bkfl) {
		this.bkfl = bkfl;
	}

	public BigDecimal getChry() {
		return this.chry;
	}

	public void setChry(BigDecimal chry) {
		this.chry = chry;
	}

	public String getDepth() {
		return this.depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}

	public BigDecimal getEndr() {
		return this.endr;
	}

	public void setEndr(BigDecimal endr) {
		this.endr = endr;
	}

	public BigDecimal getFluo() {
		return this.fluo;
	}

	public void setFluo(BigDecimal fluo) {
		this.fluo = fluo;
	}

	public BigDecimal getFlut() {
		return this.flut;
	}

	public void setFlut(BigDecimal flut) {
		this.flut = flut;
	}

	public BigDecimal getHcb() {
		return this.hcb;
	}

	public void setHcb(BigDecimal hcb) {
		this.hcb = hcb;
	}

	public BigDecimal getHepo() {
		return this.hepo;
	}

	public void setHepo(BigDecimal hepo) {
		this.hepo = hepo;
	}

	public BigDecimal getHept() {
		return this.hept;
	}

	public void setHept(BigDecimal hept) {
		this.hept = hept;
	}

	public String getLAldr() {
		return this.lAldr;
	}

	public void setLAldr(String lAldr) {
		this.lAldr = lAldr;
	}

	public String getLAnth() {
		return this.lAnth;
	}

	public void setLAnth(String lAnth) {
		this.lAnth = lAnth;
	}

	public String getLBapy() {
		return this.lBapy;
	}

	public void setLBapy(String lBapy) {
		this.lBapy = lBapy;
	}

	public String getLBbfl() {
		return this.lBbfl;
	}

	public void setLBbfl(String lBbfl) {
		this.lBbfl = lBbfl;
	}

	public String getLBgpe() {
		return this.lBgpe;
	}

	public void setLBgpe(String lBgpe) {
		this.lBgpe = lBgpe;
	}

	public String getLBhc() {
		return this.lBhc;
	}

	public void setLBhc(String lBhc) {
		this.lBhc = lBhc;
	}

	public String getLBkfl() {
		return this.lBkfl;
	}

	public void setLBkfl(String lBkfl) {
		this.lBkfl = lBkfl;
	}

	public String getLChry() {
		return this.lChry;
	}

	public void setLChry(String lChry) {
		this.lChry = lChry;
	}

	public String getLEndr() {
		return this.lEndr;
	}

	public void setLEndr(String lEndr) {
		this.lEndr = lEndr;
	}

	public String getLFluo() {
		return this.lFluo;
	}

	public void setLFluo(String lFluo) {
		this.lFluo = lFluo;
	}

	public String getLFlut() {
		return this.lFlut;
	}

	public void setLFlut(String lFlut) {
		this.lFlut = lFlut;
	}

	public String getLHepo() {
		return this.lHepo;
	}

	public void setLHepo(String lHepo) {
		this.lHepo = lHepo;
	}

	public String getLHept() {
		return this.lHept;
	}

	public void setLHept(String lHept) {
		this.lHept = lHept;
	}

	public String getLMdcb() {
		return this.lMdcb;
	}

	public void setLMdcb(String lMdcb) {
		this.lMdcb = lMdcb;
	}

	public String getLOdcb() {
		return this.lOdcb;
	}

	public void setLOdcb(String lOdcb) {
		this.lOdcb = lOdcb;
	}

	public String getLOddd() {
		return this.lOddd;
	}

	public void setLOddd(String lOddd) {
		this.lOddd = lOddd;
	}

	public String getLOdde() {
		return this.lOdde;
	}

	public void setLOdde(String lOdde) {
		this.lOdde = lOdde;
	}

	public String getLOddt() {
		return this.lOddt;
	}

	public void setLOddt(String lOddt) {
		this.lOddt = lOddt;
	}

	public String getLPah() {
		return this.lPah;
	}

	public void setLPah(String lPah) {
		this.lPah = lPah;
	}

	public String getLPcb() {
		return this.lPcb;
	}

	public void setLPcb(String lPcb) {
		this.lPcb = lPcb;
	}

	public String getLPddd() {
		return this.lPddd;
	}

	public void setLPddd(String lPddd) {
		this.lPddd = lPddd;
	}

	public String getLPdde() {
		return this.lPdde;
	}

	public void setLPdde(String lPdde) {
		this.lPdde = lPdde;
	}

	public String getLPddt() {
		return this.lPddt;
	}

	public void setLPddt(String lPddt) {
		this.lPddt = lPddt;
	}

	public String getLPhen() {
		return this.lPhen;
	}

	public void setLPhen(String lPhen) {
		this.lPhen = lPhen;
	}

	public String getLPyre() {
		return this.lPyre;
	}

	public void setLPyre(String lPyre) {
		this.lPyre = lPyre;
	}

	public String getLThms() {
		return this.lThms;
	}

	public void setLThms(String lThms) {
		this.lThms = lThms;
	}

	public String getLTrce() {
		return this.lTrce;
	}

	public void setLTrce(String lTrce) {
		this.lTrce = lTrce;
	}

	public String getLTtce() {
		return this.lTtce;
	}

	public void setLTtce(String lTtce) {
		this.lTtce = lTtce;
	}

	public String getLhcb() {
		return this.lhcb;
	}

	public void setLhcb(String lhcb) {
		this.lhcb = lhcb;
	}

	public String getLtChs() {
		return this.ltChs;
	}

	public void setLtChs(String ltChs) {
		this.ltChs = ltChs;
	}

	public String getLtOcps() {
		return this.ltOcps;
	}

	public void setLtOcps(String ltOcps) {
		this.ltOcps = ltOcps;
	}

	public Timestamp getMDate() {
		return this.mDate;
	}

	public void setMDate(Timestamp mDate) {
		this.mDate = mDate;
	}

	public BigDecimal getMdcb() {
		return this.mdcb;
	}

	public void setMdcb(BigDecimal mdcb) {
		this.mdcb = mdcb;
	}

	public BigDecimal getOdcb() {
		return this.odcb;
	}

	public void setOdcb(BigDecimal odcb) {
		this.odcb = odcb;
	}

	public BigDecimal getOddd() {
		return this.oddd;
	}

	public void setOddd(BigDecimal oddd) {
		this.oddd = oddd;
	}

	public BigDecimal getOdde() {
		return this.odde;
	}

	public void setOdde(BigDecimal odde) {
		this.odde = odde;
	}

	public BigDecimal getOddt() {
		return this.oddt;
	}

	public void setOddt(BigDecimal oddt) {
		this.oddt = oddt;
	}

	public BigDecimal getPah() {
		return this.pah;
	}

	public void setPah(BigDecimal pah) {
		this.pah = pah;
	}

	public BigDecimal getPcb() {
		return this.pcb;
	}

	public void setPcb(BigDecimal pcb) {
		this.pcb = pcb;
	}

	public BigDecimal getPddd() {
		return this.pddd;
	}

	public void setPddd(BigDecimal pddd) {
		this.pddd = pddd;
	}

	public BigDecimal getPdde() {
		return this.pdde;
	}

	public void setPdde(BigDecimal pdde) {
		this.pdde = pdde;
	}

	public BigDecimal getPddt() {
		return this.pddt;
	}

	public void setPddt(BigDecimal pddt) {
		this.pddt = pddt;
	}

	public BigDecimal getPhen() {
		return this.phen;
	}

	public void setPhen(BigDecimal phen) {
		this.phen = phen;
	}

	public BigDecimal getPyre() {
		return this.pyre;
	}

	public void setPyre(BigDecimal pyre) {
		this.pyre = pyre;
	}

	public BigDecimal getSTime() {
		return this.sTime;
	}

	public void setSTime(BigDecimal sTime) {
		this.sTime = sTime;
	}

	public String getSType() {
		return this.sType;
	}

	public void setSType(String sType) {
		this.sType = sType;
	}

	public BigDecimal getSamples() {
		return this.samples;
	}

	public void setSamples(BigDecimal samples) {
		this.samples = samples;
	}

	public String getStationId() {
		return this.stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public BigDecimal getTChs() {
		return this.tChs;
	}

	public void setTChs(BigDecimal tChs) {
		this.tChs = tChs;
	}

	public BigDecimal getTOcps() {
		return this.tOcps;
	}

	public void setTOcps(BigDecimal tOcps) {
		this.tOcps = tOcps;
	}

	public BigDecimal getThms() {
		return this.thms;
	}

	public void setThms(BigDecimal thms) {
		this.thms = thms;
	}

	public BigDecimal getTodwr() {
		return this.todwr;
	}

	public void setTodwr(BigDecimal todwr) {
		this.todwr = todwr;
	}

	public BigDecimal getTrce() {
		return this.trce;
	}

	public void setTrce(BigDecimal trce) {
		this.trce = trce;
	}

	public BigDecimal getTtce() {
		return this.ttce;
	}

	public void setTtce(BigDecimal ttce) {
		this.ttce = ttce;
	}

	public BigDecimal getValidCode() {
		return this.validCode;
	}

	public void setValidCode(BigDecimal validCode) {
		this.validCode = validCode;
	}

	public Timestamp getValidDate() {
		return this.validDate;
	}

	public void setValidDate(Timestamp validDate) {
		this.validDate = validDate;
	}

	public String getValidUser() {
		return this.validUser;
	}

	public void setValidUser(String validUser) {
		this.validUser = validUser;
	}

	public String getWVisitId() {
		return this.wVisitId;
	}

	public void setWVisitId(String wVisitId) {
		this.wVisitId = wVisitId;
	}

}