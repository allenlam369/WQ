package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ts_clab database table.
 * 
 */
@Entity
@Table(name="ts_clab")
@NamedQuery(name="TsClab.findAll", query="SELECT t FROM TsClab t")
public class TsClab implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TsClabPK id;

	private BigDecimal bpa;

	@Column(name="date_received")
	private Timestamp dateReceived;

	@Column(name="date_reported")
	private Timestamp dateReported;

	private BigDecimal dbt;

	private BigDecimal e1;

	@Column(name="e2_17a")
	private BigDecimal e217a;

	@Column(name="e2_17b")
	private BigDecimal e217b;

	private BigDecimal e3;

	private BigDecimal ee2;

	private BigDecimal f4;

	@Column(name="l_bpa")
	private String lBpa;

	@Column(name="l_dbt")
	private String lDbt;

	@Column(name="l_e1")
	private String lE1;

	@Column(name="l_e2_17a")
	private String lE217a;

	@Column(name="l_e2_17b")
	private String lE217b;

	@Column(name="l_e3")
	private String lE3;

	@Column(name="l_ee2")
	private String lEe2;

	@Column(name="l_f4")
	private String lF4;

	@Column(name="l_mbt")
	private String lMbt;

	@Column(name="l_np")
	private String lNp;

	@Column(name="l_npde")
	private String lNpde;

	@Column(name="l_npe")
	private String lNpe;

	@Column(name="l_npme")
	private String lNpme;

	@Column(name="l_osn")
	private String lOsn;

	@Column(name="l_pbb")
	private String lPbb;

	@Column(name="l_pf")
	private String lPf;

	@Column(name="l_tbt")
	private String lTbt;

	@Column(name="lab_no")
	private String labNo;

	private BigDecimal mbt;

	private BigDecimal np;

	private BigDecimal npde;

	private BigDecimal npe;

	private BigDecimal npme;

	private BigDecimal osn;

	private BigDecimal pbb;

	private BigDecimal pf;

	@Column(name="sample_mark")
	private String sampleMark;

	private BigDecimal tbt;

	@Column(name="tsvisit_id_old")
	private String tsvisitIdOld;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public TsClab() {
	}

	public TsClabPK getId() {
		return this.id;
	}

	public void setId(TsClabPK id) {
		this.id = id;
	}

	public BigDecimal getBpa() {
		return this.bpa;
	}

	public void setBpa(BigDecimal bpa) {
		this.bpa = bpa;
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

	public BigDecimal getDbt() {
		return this.dbt;
	}

	public void setDbt(BigDecimal dbt) {
		this.dbt = dbt;
	}

	public BigDecimal getE1() {
		return this.e1;
	}

	public void setE1(BigDecimal e1) {
		this.e1 = e1;
	}

	public BigDecimal getE217a() {
		return this.e217a;
	}

	public void setE217a(BigDecimal e217a) {
		this.e217a = e217a;
	}

	public BigDecimal getE217b() {
		return this.e217b;
	}

	public void setE217b(BigDecimal e217b) {
		this.e217b = e217b;
	}

	public BigDecimal getE3() {
		return this.e3;
	}

	public void setE3(BigDecimal e3) {
		this.e3 = e3;
	}

	public BigDecimal getEe2() {
		return this.ee2;
	}

	public void setEe2(BigDecimal ee2) {
		this.ee2 = ee2;
	}

	public BigDecimal getF4() {
		return this.f4;
	}

	public void setF4(BigDecimal f4) {
		this.f4 = f4;
	}

	public String getLBpa() {
		return this.lBpa;
	}

	public void setLBpa(String lBpa) {
		this.lBpa = lBpa;
	}

	public String getLDbt() {
		return this.lDbt;
	}

	public void setLDbt(String lDbt) {
		this.lDbt = lDbt;
	}

	public String getLE1() {
		return this.lE1;
	}

	public void setLE1(String lE1) {
		this.lE1 = lE1;
	}

	public String getLE217a() {
		return this.lE217a;
	}

	public void setLE217a(String lE217a) {
		this.lE217a = lE217a;
	}

	public String getLE217b() {
		return this.lE217b;
	}

	public void setLE217b(String lE217b) {
		this.lE217b = lE217b;
	}

	public String getLE3() {
		return this.lE3;
	}

	public void setLE3(String lE3) {
		this.lE3 = lE3;
	}

	public String getLEe2() {
		return this.lEe2;
	}

	public void setLEe2(String lEe2) {
		this.lEe2 = lEe2;
	}

	public String getLF4() {
		return this.lF4;
	}

	public void setLF4(String lF4) {
		this.lF4 = lF4;
	}

	public String getLMbt() {
		return this.lMbt;
	}

	public void setLMbt(String lMbt) {
		this.lMbt = lMbt;
	}

	public String getLNp() {
		return this.lNp;
	}

	public void setLNp(String lNp) {
		this.lNp = lNp;
	}

	public String getLNpde() {
		return this.lNpde;
	}

	public void setLNpde(String lNpde) {
		this.lNpde = lNpde;
	}

	public String getLNpe() {
		return this.lNpe;
	}

	public void setLNpe(String lNpe) {
		this.lNpe = lNpe;
	}

	public String getLNpme() {
		return this.lNpme;
	}

	public void setLNpme(String lNpme) {
		this.lNpme = lNpme;
	}

	public String getLOsn() {
		return this.lOsn;
	}

	public void setLOsn(String lOsn) {
		this.lOsn = lOsn;
	}

	public String getLPbb() {
		return this.lPbb;
	}

	public void setLPbb(String lPbb) {
		this.lPbb = lPbb;
	}

	public String getLPf() {
		return this.lPf;
	}

	public void setLPf(String lPf) {
		this.lPf = lPf;
	}

	public String getLTbt() {
		return this.lTbt;
	}

	public void setLTbt(String lTbt) {
		this.lTbt = lTbt;
	}

	public String getLabNo() {
		return this.labNo;
	}

	public void setLabNo(String labNo) {
		this.labNo = labNo;
	}

	public BigDecimal getMbt() {
		return this.mbt;
	}

	public void setMbt(BigDecimal mbt) {
		this.mbt = mbt;
	}

	public BigDecimal getNp() {
		return this.np;
	}

	public void setNp(BigDecimal np) {
		this.np = np;
	}

	public BigDecimal getNpde() {
		return this.npde;
	}

	public void setNpde(BigDecimal npde) {
		this.npde = npde;
	}

	public BigDecimal getNpe() {
		return this.npe;
	}

	public void setNpe(BigDecimal npe) {
		this.npe = npe;
	}

	public BigDecimal getNpme() {
		return this.npme;
	}

	public void setNpme(BigDecimal npme) {
		this.npme = npme;
	}

	public BigDecimal getOsn() {
		return this.osn;
	}

	public void setOsn(BigDecimal osn) {
		this.osn = osn;
	}

	public BigDecimal getPbb() {
		return this.pbb;
	}

	public void setPbb(BigDecimal pbb) {
		this.pbb = pbb;
	}

	public BigDecimal getPf() {
		return this.pf;
	}

	public void setPf(BigDecimal pf) {
		this.pf = pf;
	}

	public String getSampleMark() {
		return this.sampleMark;
	}

	public void setSampleMark(String sampleMark) {
		this.sampleMark = sampleMark;
	}

	public BigDecimal getTbt() {
		return this.tbt;
	}

	public void setTbt(BigDecimal tbt) {
		this.tbt = tbt;
	}

	public String getTsvisitIdOld() {
		return this.tsvisitIdOld;
	}

	public void setTsvisitIdOld(String tsvisitIdOld) {
		this.tsvisitIdOld = tsvisitIdOld;
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