package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ms_glabn database table.
 * 
 */
@Entity
@Table(name="ms_glabn")
@NamedQuery(name="MsGlabn.findAll", query="SELECT m FROM MsGlabn m")
public class MsGlabn implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MsGlabnPK id;

	private BigDecimal cn;

	private BigDecimal cod;

	@Column(name="date_received")
	private Timestamp dateReceived;

	@Column(name="date_reported")
	private Timestamp dateReported;

	@Column(name="l_cn")
	private String lCn;

	@Column(name="l_cod")
	private String lCod;

	@Column(name="l_nh")
	private String lNh;

	@Column(name="l_ph")
	private String lPh;

	@Column(name="l_sg")
	private String lSg;

	@Column(name="l_sulphide")
	private String lSulphide;

	@Column(name="l_tc")
	private String lTc;

	@Column(name="l_tic")
	private String lTic;

	@Column(name="l_tkn")
	private String lTkn;

	@Column(name="l_toc")
	private String lToc;

	@Column(name="l_tp")
	private String lTp;

	@Column(name="l_ts")
	private String lTs;

	@Column(name="l_tvs")
	private String lTvs;

	@Column(name="lab_no")
	private String labNo;

	@Column(name="msn_dwr")
	private BigDecimal msnDwr;

	@Column(name="msvisit_id_old")
	private String msvisitIdOld;

	private BigDecimal nh;

	private BigDecimal ph;

	@Column(name="sample_mark")
	private String sampleMark;

	private BigDecimal sg;

	private BigDecimal sulphide;

	private BigDecimal tc;

	private BigDecimal tic;

	private BigDecimal tkn;

	private BigDecimal toc;

	private BigDecimal tp;

	private BigDecimal ts;

	private BigDecimal tvs;

	@Column(name="valid_code")
	private BigDecimal validCode;

	@Column(name="valid_date")
	private Timestamp validDate;

	@Column(name="valid_user")
	private String validUser;

	public MsGlabn() {
	}

	public MsGlabnPK getId() {
		return this.id;
	}

	public void setId(MsGlabnPK id) {
		this.id = id;
	}

	public BigDecimal getCn() {
		return this.cn;
	}

	public void setCn(BigDecimal cn) {
		this.cn = cn;
	}

	public BigDecimal getCod() {
		return this.cod;
	}

	public void setCod(BigDecimal cod) {
		this.cod = cod;
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

	public String getLCn() {
		return this.lCn;
	}

	public void setLCn(String lCn) {
		this.lCn = lCn;
	}

	public String getLCod() {
		return this.lCod;
	}

	public void setLCod(String lCod) {
		this.lCod = lCod;
	}

	public String getLNh() {
		return this.lNh;
	}

	public void setLNh(String lNh) {
		this.lNh = lNh;
	}

	public String getLPh() {
		return this.lPh;
	}

	public void setLPh(String lPh) {
		this.lPh = lPh;
	}

	public String getLSg() {
		return this.lSg;
	}

	public void setLSg(String lSg) {
		this.lSg = lSg;
	}

	public String getLSulphide() {
		return this.lSulphide;
	}

	public void setLSulphide(String lSulphide) {
		this.lSulphide = lSulphide;
	}

	public String getLTc() {
		return this.lTc;
	}

	public void setLTc(String lTc) {
		this.lTc = lTc;
	}

	public String getLTic() {
		return this.lTic;
	}

	public void setLTic(String lTic) {
		this.lTic = lTic;
	}

	public String getLTkn() {
		return this.lTkn;
	}

	public void setLTkn(String lTkn) {
		this.lTkn = lTkn;
	}

	public String getLToc() {
		return this.lToc;
	}

	public void setLToc(String lToc) {
		this.lToc = lToc;
	}

	public String getLTp() {
		return this.lTp;
	}

	public void setLTp(String lTp) {
		this.lTp = lTp;
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

	public String getLabNo() {
		return this.labNo;
	}

	public void setLabNo(String labNo) {
		this.labNo = labNo;
	}

	public BigDecimal getMsnDwr() {
		return this.msnDwr;
	}

	public void setMsnDwr(BigDecimal msnDwr) {
		this.msnDwr = msnDwr;
	}

	public String getMsvisitIdOld() {
		return this.msvisitIdOld;
	}

	public void setMsvisitIdOld(String msvisitIdOld) {
		this.msvisitIdOld = msvisitIdOld;
	}

	public BigDecimal getNh() {
		return this.nh;
	}

	public void setNh(BigDecimal nh) {
		this.nh = nh;
	}

	public BigDecimal getPh() {
		return this.ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public String getSampleMark() {
		return this.sampleMark;
	}

	public void setSampleMark(String sampleMark) {
		this.sampleMark = sampleMark;
	}

	public BigDecimal getSg() {
		return this.sg;
	}

	public void setSg(BigDecimal sg) {
		this.sg = sg;
	}

	public BigDecimal getSulphide() {
		return this.sulphide;
	}

	public void setSulphide(BigDecimal sulphide) {
		this.sulphide = sulphide;
	}

	public BigDecimal getTc() {
		return this.tc;
	}

	public void setTc(BigDecimal tc) {
		this.tc = tc;
	}

	public BigDecimal getTic() {
		return this.tic;
	}

	public void setTic(BigDecimal tic) {
		this.tic = tic;
	}

	public BigDecimal getTkn() {
		return this.tkn;
	}

	public void setTkn(BigDecimal tkn) {
		this.tkn = tkn;
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