package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the tw_glab_oc database table.
 * 
 */
@Entity
@Table(name="tw_glab_oc")
@NamedQuery(name="TwGlabOc.findAll", query="SELECT t FROM TwGlabOc t")
public class TwGlabOc implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TwGlabOcPK id;

	private BigDecimal abhc;

	private BigDecimal achd;

	private BigDecimal aldr;

	private BigDecimal bbhc;

	private BigDecimal cnon;

	@Column(name="date_received")
	private Timestamp dateReceived;

	@Column(name="date_reported")
	private Timestamp dateReported;

	private BigDecimal dbhc;

	private BigDecimal diel;

	private BigDecimal end1;

	private BigDecimal end2;

	private BigDecimal endr;

	private BigDecimal gbhc;

	private BigDecimal gchd;

	private BigDecimal hcb;

	private BigDecimal hepo;

	private BigDecimal hept;

	private BigDecimal kepone;

	@Column(name="l_abhc")
	private String lAbhc;

	@Column(name="l_achd")
	private String lAchd;

	@Column(name="l_aldr")
	private String lAldr;

	@Column(name="l_bbhc")
	private String lBbhc;

	@Column(name="l_cnon")
	private String lCnon;

	@Column(name="l_dbhc")
	private String lDbhc;

	@Column(name="l_diel")
	private String lDiel;

	@Column(name="l_end1")
	private String lEnd1;

	@Column(name="l_end2")
	private String lEnd2;

	@Column(name="l_endr")
	private String lEndr;

	@Column(name="l_gbhc")
	private String lGbhc;

	@Column(name="l_gchd")
	private String lGchd;

	@Column(name="l_hcb")
	private String lHcb;

	@Column(name="l_hepo")
	private String lHepo;

	@Column(name="l_hept")
	private String lHept;

	@Column(name="l_kepone")
	private String lKepone;

	@Column(name="l_mirx")
	private String lMirx;

	@Column(name="l_ochd")
	private String lOchd;

	@Column(name="l_oddd")
	private String lOddd;

	@Column(name="l_odde")
	private String lOdde;

	@Column(name="l_oddt")
	private String lOddt;

	@Column(name="l_pddd")
	private String lPddd;

	@Column(name="l_pdde")
	private String lPdde;

	@Column(name="l_pddt")
	private String lPddt;

	@Column(name="l_pecb")
	private String lPecb;

	@Column(name="l_tnon")
	private String lTnon;

	@Column(name="l_tox")
	private String lTox;

	@Column(name="l_tox_p26")
	private String lToxP26;

	@Column(name="l_tox_p50")
	private String lToxP50;

	@Column(name="l_tox_p62")
	private String lToxP62;

	@Column(name="lab_no")
	private String labNo;

	private BigDecimal mirx;

	private BigDecimal ochd;

	private BigDecimal oddd;

	private BigDecimal odde;

	private BigDecimal oddt;

	private BigDecimal pddd;

	private BigDecimal pdde;

	private BigDecimal pddt;

	private BigDecimal pecb;

	@Column(name="sample_mark")
	private String sampleMark;

	private BigDecimal tnon;

	private BigDecimal tox;

	@Column(name="tox_p26")
	private BigDecimal toxP26;

	@Column(name="tox_p50")
	private BigDecimal toxP50;

	@Column(name="tox_p62")
	private BigDecimal toxP62;

	@Column(name="twvisit_id_old")
	private String twvisitIdOld;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public TwGlabOc() {
	}

	public TwGlabOcPK getId() {
		return this.id;
	}

	public void setId(TwGlabOcPK id) {
		this.id = id;
	}

	public BigDecimal getAbhc() {
		return this.abhc;
	}

	public void setAbhc(BigDecimal abhc) {
		this.abhc = abhc;
	}

	public BigDecimal getAchd() {
		return this.achd;
	}

	public void setAchd(BigDecimal achd) {
		this.achd = achd;
	}

	public BigDecimal getAldr() {
		return this.aldr;
	}

	public void setAldr(BigDecimal aldr) {
		this.aldr = aldr;
	}

	public BigDecimal getBbhc() {
		return this.bbhc;
	}

	public void setBbhc(BigDecimal bbhc) {
		this.bbhc = bbhc;
	}

	public BigDecimal getCnon() {
		return this.cnon;
	}

	public void setCnon(BigDecimal cnon) {
		this.cnon = cnon;
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

	public BigDecimal getDbhc() {
		return this.dbhc;
	}

	public void setDbhc(BigDecimal dbhc) {
		this.dbhc = dbhc;
	}

	public BigDecimal getDiel() {
		return this.diel;
	}

	public void setDiel(BigDecimal diel) {
		this.diel = diel;
	}

	public BigDecimal getEnd1() {
		return this.end1;
	}

	public void setEnd1(BigDecimal end1) {
		this.end1 = end1;
	}

	public BigDecimal getEnd2() {
		return this.end2;
	}

	public void setEnd2(BigDecimal end2) {
		this.end2 = end2;
	}

	public BigDecimal getEndr() {
		return this.endr;
	}

	public void setEndr(BigDecimal endr) {
		this.endr = endr;
	}

	public BigDecimal getGbhc() {
		return this.gbhc;
	}

	public void setGbhc(BigDecimal gbhc) {
		this.gbhc = gbhc;
	}

	public BigDecimal getGchd() {
		return this.gchd;
	}

	public void setGchd(BigDecimal gchd) {
		this.gchd = gchd;
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

	public BigDecimal getKepone() {
		return this.kepone;
	}

	public void setKepone(BigDecimal kepone) {
		this.kepone = kepone;
	}

	public String getLAbhc() {
		return this.lAbhc;
	}

	public void setLAbhc(String lAbhc) {
		this.lAbhc = lAbhc;
	}

	public String getLAchd() {
		return this.lAchd;
	}

	public void setLAchd(String lAchd) {
		this.lAchd = lAchd;
	}

	public String getLAldr() {
		return this.lAldr;
	}

	public void setLAldr(String lAldr) {
		this.lAldr = lAldr;
	}

	public String getLBbhc() {
		return this.lBbhc;
	}

	public void setLBbhc(String lBbhc) {
		this.lBbhc = lBbhc;
	}

	public String getLCnon() {
		return this.lCnon;
	}

	public void setLCnon(String lCnon) {
		this.lCnon = lCnon;
	}

	public String getLDbhc() {
		return this.lDbhc;
	}

	public void setLDbhc(String lDbhc) {
		this.lDbhc = lDbhc;
	}

	public String getLDiel() {
		return this.lDiel;
	}

	public void setLDiel(String lDiel) {
		this.lDiel = lDiel;
	}

	public String getLEnd1() {
		return this.lEnd1;
	}

	public void setLEnd1(String lEnd1) {
		this.lEnd1 = lEnd1;
	}

	public String getLEnd2() {
		return this.lEnd2;
	}

	public void setLEnd2(String lEnd2) {
		this.lEnd2 = lEnd2;
	}

	public String getLEndr() {
		return this.lEndr;
	}

	public void setLEndr(String lEndr) {
		this.lEndr = lEndr;
	}

	public String getLGbhc() {
		return this.lGbhc;
	}

	public void setLGbhc(String lGbhc) {
		this.lGbhc = lGbhc;
	}

	public String getLGchd() {
		return this.lGchd;
	}

	public void setLGchd(String lGchd) {
		this.lGchd = lGchd;
	}

	public String getLHcb() {
		return this.lHcb;
	}

	public void setLHcb(String lHcb) {
		this.lHcb = lHcb;
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

	public String getLKepone() {
		return this.lKepone;
	}

	public void setLKepone(String lKepone) {
		this.lKepone = lKepone;
	}

	public String getLMirx() {
		return this.lMirx;
	}

	public void setLMirx(String lMirx) {
		this.lMirx = lMirx;
	}

	public String getLOchd() {
		return this.lOchd;
	}

	public void setLOchd(String lOchd) {
		this.lOchd = lOchd;
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

	public String getLPecb() {
		return this.lPecb;
	}

	public void setLPecb(String lPecb) {
		this.lPecb = lPecb;
	}

	public String getLTnon() {
		return this.lTnon;
	}

	public void setLTnon(String lTnon) {
		this.lTnon = lTnon;
	}

	public String getLTox() {
		return this.lTox;
	}

	public void setLTox(String lTox) {
		this.lTox = lTox;
	}

	public String getLToxP26() {
		return this.lToxP26;
	}

	public void setLToxP26(String lToxP26) {
		this.lToxP26 = lToxP26;
	}

	public String getLToxP50() {
		return this.lToxP50;
	}

	public void setLToxP50(String lToxP50) {
		this.lToxP50 = lToxP50;
	}

	public String getLToxP62() {
		return this.lToxP62;
	}

	public void setLToxP62(String lToxP62) {
		this.lToxP62 = lToxP62;
	}

	public String getLabNo() {
		return this.labNo;
	}

	public void setLabNo(String labNo) {
		this.labNo = labNo;
	}

	public BigDecimal getMirx() {
		return this.mirx;
	}

	public void setMirx(BigDecimal mirx) {
		this.mirx = mirx;
	}

	public BigDecimal getOchd() {
		return this.ochd;
	}

	public void setOchd(BigDecimal ochd) {
		this.ochd = ochd;
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

	public BigDecimal getPecb() {
		return this.pecb;
	}

	public void setPecb(BigDecimal pecb) {
		this.pecb = pecb;
	}

	public String getSampleMark() {
		return this.sampleMark;
	}

	public void setSampleMark(String sampleMark) {
		this.sampleMark = sampleMark;
	}

	public BigDecimal getTnon() {
		return this.tnon;
	}

	public void setTnon(BigDecimal tnon) {
		this.tnon = tnon;
	}

	public BigDecimal getTox() {
		return this.tox;
	}

	public void setTox(BigDecimal tox) {
		this.tox = tox;
	}

	public BigDecimal getToxP26() {
		return this.toxP26;
	}

	public void setToxP26(BigDecimal toxP26) {
		this.toxP26 = toxP26;
	}

	public BigDecimal getToxP50() {
		return this.toxP50;
	}

	public void setToxP50(BigDecimal toxP50) {
		this.toxP50 = toxP50;
	}

	public BigDecimal getToxP62() {
		return this.toxP62;
	}

	public void setToxP62(BigDecimal toxP62) {
		this.toxP62 = toxP62;
	}

	public String getTwvisitIdOld() {
		return this.twvisitIdOld;
	}

	public void setTwvisitIdOld(String twvisitIdOld) {
		this.twvisitIdOld = twvisitIdOld;
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