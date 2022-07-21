package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ms_glab_pah database table.
 * 
 */
@Entity
@Table(name="ms_glab_pah")
@NamedQuery(name="MsGlabPah.findAll", query="SELECT m FROM MsGlabPah m")
public class MsGlabPah implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MsGlabPahPK id;

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

	@Column(name="date_received")
	private Timestamp dateReceived;

	@Column(name="date_reported")
	private Timestamp dateReported;

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

	@Column(name="l_pah")
	private String lPah;

	@Column(name="l_phen")
	private String lPhen;

	@Column(name="l_pyre")
	private String lPyre;

	@Column(name="lab_no")
	private String labNo;

	@Column(name="msvisit_id_old")
	private String msvisitIdOld;

	private BigDecimal naph;

	private BigDecimal pah;

	private BigDecimal phen;

	private BigDecimal pyre;

	@Column(name="sample_mark")
	private String sampleMark;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public MsGlabPah() {
	}

	public MsGlabPahPK getId() {
		return this.id;
	}

	public void setId(MsGlabPahPK id) {
		this.id = id;
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

	public Timestamp getDateReceived() {
		return this.dateReceived;
	}

	public void setDateReceived(Timestamp dateReceived) {
		this.dateReceived = dateReceived;
	}

	public Timestamp getDateReported() {
		return this.dateReported;
	}

	public void setDateReported(Timestamp dateReported) {
		this.dateReported = dateReported;
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

	public String getLPah() {
		return this.lPah;
	}

	public void setLPah(String lPah) {
		this.lPah = lPah;
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

	public String getLabNo() {
		return this.labNo;
	}

	public void setLabNo(String labNo) {
		this.labNo = labNo;
	}

	public String getMsvisitIdOld() {
		return this.msvisitIdOld;
	}

	public void setMsvisitIdOld(String msvisitIdOld) {
		this.msvisitIdOld = msvisitIdOld;
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

	public String getSampleMark() {
		return this.sampleMark;
	}

	public void setSampleMark(String sampleMark) {
		this.sampleMark = sampleMark;
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

}