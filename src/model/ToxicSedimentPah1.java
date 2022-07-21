package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the toxic_sediment_pah1 database table.
 * 
 */
//@Entity
@Table(name="toxic_sediment_pah1")
@NamedQuery(name="ToxicSedimentPah1.findAll", query="SELECT t FROM ToxicSedimentPah1 t")
public class ToxicSedimentPah1 implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal acen;

	private BigDecimal acph;

	private BigDecimal anth;

	private BigDecimal bant;

	private BigDecimal bapy;

	private BigDecimal bbfl;

	private BigDecimal bgpe;

	private BigDecimal bkfl;

	private BigDecimal chry;

	private BigDecimal daan;

	private BigDecimal fluo;

	private BigDecimal flut;

	private BigDecimal inpy;

	@Column(name="l_acen")
	private String lAcen;

	@Column(name="l_acph")
	private String lAcph;

	@Column(name="l_anth")
	private String lAnth;

	@Column(name="l_bant")
	private String lBant;

	@Column(name="l_bapy")
	private String lBapy;

	@Column(name="l_bbfl")
	private String lBbfl;

	@Column(name="l_bgpe")
	private String lBgpe;

	@Column(name="l_bkfl")
	private String lBkfl;

	@Column(name="l_chry")
	private String lChry;

	@Column(name="l_daan")
	private String lDaan;

	@Column(name="l_fluo")
	private String lFluo;

	@Column(name="l_flut")
	private String lFlut;

	@Column(name="l_inpy")
	private String lInpy;

	@Column(name="l_naph")
	private String lNaph;

	@Column(name="l_pfoa")
	private String lPfoa;

	@Column(name="l_pfos")
	private String lPfos;

	@Column(name="l_phen")
	private String lPhen;

	@Column(name="l_pyre")
	private String lPyre;

	private Timestamp mdate;

	private BigDecimal naph;

	private BigDecimal pah;

	private BigDecimal pfoa;

	private BigDecimal pfos;

	@Column(name="pfos_dwr")
	private BigDecimal pfosDwr;

	private BigDecimal phen;

	private BigDecimal pyre;

	@Column(name="sam_no")
	private BigDecimal samNo;

	private String station;

	private BigDecimal stime;

	private String subzone;

	private String type;

	@Column(name="view_no")
	private BigDecimal viewNo;

	private String wcz;

	private String zone;

	public ToxicSedimentPah1() {
	}

	public BigDecimal getAcen() {
		return this.acen;
	}

	public void setAcen(BigDecimal acen) {
		this.acen = acen;
	}

	public BigDecimal getAcph() {
		return this.acph;
	}

	public void setAcph(BigDecimal acph) {
		this.acph = acph;
	}

	public BigDecimal getAnth() {
		return this.anth;
	}

	public void setAnth(BigDecimal anth) {
		this.anth = anth;
	}

	public BigDecimal getBant() {
		return this.bant;
	}

	public void setBant(BigDecimal bant) {
		this.bant = bant;
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

	public BigDecimal getDaan() {
		return this.daan;
	}

	public void setDaan(BigDecimal daan) {
		this.daan = daan;
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

	public BigDecimal getInpy() {
		return this.inpy;
	}

	public void setInpy(BigDecimal inpy) {
		this.inpy = inpy;
	}

	public String getLAcen() {
		return this.lAcen;
	}

	public void setLAcen(String lAcen) {
		this.lAcen = lAcen;
	}

	public String getLAcph() {
		return this.lAcph;
	}

	public void setLAcph(String lAcph) {
		this.lAcph = lAcph;
	}

	public String getLAnth() {
		return this.lAnth;
	}

	public void setLAnth(String lAnth) {
		this.lAnth = lAnth;
	}

	public String getLBant() {
		return this.lBant;
	}

	public void setLBant(String lBant) {
		this.lBant = lBant;
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

	public String getLDaan() {
		return this.lDaan;
	}

	public void setLDaan(String lDaan) {
		this.lDaan = lDaan;
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

	public String getLInpy() {
		return this.lInpy;
	}

	public void setLInpy(String lInpy) {
		this.lInpy = lInpy;
	}

	public String getLNaph() {
		return this.lNaph;
	}

	public void setLNaph(String lNaph) {
		this.lNaph = lNaph;
	}

	public String getLPfoa() {
		return this.lPfoa;
	}

	public void setLPfoa(String lPfoa) {
		this.lPfoa = lPfoa;
	}

	public String getLPfos() {
		return this.lPfos;
	}

	public void setLPfos(String lPfos) {
		this.lPfos = lPfos;
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

	public Timestamp getMdate() {
		return this.mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

	public BigDecimal getNaph() {
		return this.naph;
	}

	public void setNaph(BigDecimal naph) {
		this.naph = naph;
	}

	public BigDecimal getPah() {
		return this.pah;
	}

	public void setPah(BigDecimal pah) {
		this.pah = pah;
	}

	public BigDecimal getPfoa() {
		return this.pfoa;
	}

	public void setPfoa(BigDecimal pfoa) {
		this.pfoa = pfoa;
	}

	public BigDecimal getPfos() {
		return this.pfos;
	}

	public void setPfos(BigDecimal pfos) {
		this.pfos = pfos;
	}

	public BigDecimal getPfosDwr() {
		return this.pfosDwr;
	}

	public void setPfosDwr(BigDecimal pfosDwr) {
		this.pfosDwr = pfosDwr;
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

	public BigDecimal getSamNo() {
		return this.samNo;
	}

	public void setSamNo(BigDecimal samNo) {
		this.samNo = samNo;
	}

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public BigDecimal getStime() {
		return this.stime;
	}

	public void setStime(BigDecimal stime) {
		this.stime = stime;
	}

	public String getSubzone() {
		return this.subzone;
	}

	public void setSubzone(String subzone) {
		this.subzone = subzone;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}