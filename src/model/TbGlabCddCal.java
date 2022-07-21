package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tb_glab_cdd_cal database table.
 * 
 */
//@Entity
@Table(name="tb_glab_cdd_cal")
@NamedQuery(name="TbGlabCddCal.findAll", query="SELECT t FROM TbGlabCddCal t")
public class TbGlabCddCal implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal cdd;

	private BigDecimal hpcdd1;

	private BigDecimal hpcdf1;

	private BigDecimal hpcdf2;

	private BigDecimal hxcdd1;

	private BigDecimal hxcdd2;

	private BigDecimal hxcdd3;

	private BigDecimal hxcdf1;

	private BigDecimal hxcdf2;

	private BigDecimal hxcdf3;

	private BigDecimal hxcdf4;

	@Column(name="l_hpcdd1")
	private String lHpcdd1;

	@Column(name="l_hpcdf1")
	private String lHpcdf1;

	@Column(name="l_hpcdf2")
	private String lHpcdf2;

	@Column(name="l_hxcdd1")
	private String lHxcdd1;

	@Column(name="l_hxcdd2")
	private String lHxcdd2;

	@Column(name="l_hxcdd3")
	private String lHxcdd3;

	@Column(name="l_hxcdf1")
	private String lHxcdf1;

	@Column(name="l_hxcdf2")
	private String lHxcdf2;

	@Column(name="l_hxcdf3")
	private String lHxcdf3;

	@Column(name="l_hxcdf4")
	private String lHxcdf4;

	@Column(name="l_ocdd")
	private String lOcdd;

	@Column(name="l_ocdf")
	private String lOcdf;

	@Column(name="l_pecdd1")
	private String lPecdd1;

	@Column(name="l_pecdf1")
	private String lPecdf1;

	@Column(name="l_pecdf2")
	private String lPecdf2;

	@Column(name="l_tcdd1")
	private String lTcdd1;

	@Column(name="l_tcdf1")
	private String lTcdf1;

	private BigDecimal ocdd;

	private BigDecimal ocdf;

	private BigDecimal pecdd1;

	private BigDecimal pecdf1;

	private BigDecimal pecdf2;

	@Column(name="tbvisit_id")
	private String tbvisitId;

	private BigDecimal tcdd1;

	private BigDecimal tcdf1;

	@Column(name="teq_type")
	private String teqType;

	@Column(name="tsd_dwr")
	private BigDecimal tsdDwr;

	private String type;

	public TbGlabCddCal() {
	}

	public BigDecimal getCdd() {
		return this.cdd;
	}

	public void setCdd(BigDecimal cdd) {
		this.cdd = cdd;
	}

	public BigDecimal getHpcdd1() {
		return this.hpcdd1;
	}

	public void setHpcdd1(BigDecimal hpcdd1) {
		this.hpcdd1 = hpcdd1;
	}

	public BigDecimal getHpcdf1() {
		return this.hpcdf1;
	}

	public void setHpcdf1(BigDecimal hpcdf1) {
		this.hpcdf1 = hpcdf1;
	}

	public BigDecimal getHpcdf2() {
		return this.hpcdf2;
	}

	public void setHpcdf2(BigDecimal hpcdf2) {
		this.hpcdf2 = hpcdf2;
	}

	public BigDecimal getHxcdd1() {
		return this.hxcdd1;
	}

	public void setHxcdd1(BigDecimal hxcdd1) {
		this.hxcdd1 = hxcdd1;
	}

	public BigDecimal getHxcdd2() {
		return this.hxcdd2;
	}

	public void setHxcdd2(BigDecimal hxcdd2) {
		this.hxcdd2 = hxcdd2;
	}

	public BigDecimal getHxcdd3() {
		return this.hxcdd3;
	}

	public void setHxcdd3(BigDecimal hxcdd3) {
		this.hxcdd3 = hxcdd3;
	}

	public BigDecimal getHxcdf1() {
		return this.hxcdf1;
	}

	public void setHxcdf1(BigDecimal hxcdf1) {
		this.hxcdf1 = hxcdf1;
	}

	public BigDecimal getHxcdf2() {
		return this.hxcdf2;
	}

	public void setHxcdf2(BigDecimal hxcdf2) {
		this.hxcdf2 = hxcdf2;
	}

	public BigDecimal getHxcdf3() {
		return this.hxcdf3;
	}

	public void setHxcdf3(BigDecimal hxcdf3) {
		this.hxcdf3 = hxcdf3;
	}

	public BigDecimal getHxcdf4() {
		return this.hxcdf4;
	}

	public void setHxcdf4(BigDecimal hxcdf4) {
		this.hxcdf4 = hxcdf4;
	}

	public String getLHpcdd1() {
		return this.lHpcdd1;
	}

	public void setLHpcdd1(String lHpcdd1) {
		this.lHpcdd1 = lHpcdd1;
	}

	public String getLHpcdf1() {
		return this.lHpcdf1;
	}

	public void setLHpcdf1(String lHpcdf1) {
		this.lHpcdf1 = lHpcdf1;
	}

	public String getLHpcdf2() {
		return this.lHpcdf2;
	}

	public void setLHpcdf2(String lHpcdf2) {
		this.lHpcdf2 = lHpcdf2;
	}

	public String getLHxcdd1() {
		return this.lHxcdd1;
	}

	public void setLHxcdd1(String lHxcdd1) {
		this.lHxcdd1 = lHxcdd1;
	}

	public String getLHxcdd2() {
		return this.lHxcdd2;
	}

	public void setLHxcdd2(String lHxcdd2) {
		this.lHxcdd2 = lHxcdd2;
	}

	public String getLHxcdd3() {
		return this.lHxcdd3;
	}

	public void setLHxcdd3(String lHxcdd3) {
		this.lHxcdd3 = lHxcdd3;
	}

	public String getLHxcdf1() {
		return this.lHxcdf1;
	}

	public void setLHxcdf1(String lHxcdf1) {
		this.lHxcdf1 = lHxcdf1;
	}

	public String getLHxcdf2() {
		return this.lHxcdf2;
	}

	public void setLHxcdf2(String lHxcdf2) {
		this.lHxcdf2 = lHxcdf2;
	}

	public String getLHxcdf3() {
		return this.lHxcdf3;
	}

	public void setLHxcdf3(String lHxcdf3) {
		this.lHxcdf3 = lHxcdf3;
	}

	public String getLHxcdf4() {
		return this.lHxcdf4;
	}

	public void setLHxcdf4(String lHxcdf4) {
		this.lHxcdf4 = lHxcdf4;
	}

	public String getLOcdd() {
		return this.lOcdd;
	}

	public void setLOcdd(String lOcdd) {
		this.lOcdd = lOcdd;
	}

	public String getLOcdf() {
		return this.lOcdf;
	}

	public void setLOcdf(String lOcdf) {
		this.lOcdf = lOcdf;
	}

	public String getLPecdd1() {
		return this.lPecdd1;
	}

	public void setLPecdd1(String lPecdd1) {
		this.lPecdd1 = lPecdd1;
	}

	public String getLPecdf1() {
		return this.lPecdf1;
	}

	public void setLPecdf1(String lPecdf1) {
		this.lPecdf1 = lPecdf1;
	}

	public String getLPecdf2() {
		return this.lPecdf2;
	}

	public void setLPecdf2(String lPecdf2) {
		this.lPecdf2 = lPecdf2;
	}

	public String getLTcdd1() {
		return this.lTcdd1;
	}

	public void setLTcdd1(String lTcdd1) {
		this.lTcdd1 = lTcdd1;
	}

	public String getLTcdf1() {
		return this.lTcdf1;
	}

	public void setLTcdf1(String lTcdf1) {
		this.lTcdf1 = lTcdf1;
	}

	public BigDecimal getOcdd() {
		return this.ocdd;
	}

	public void setOcdd(BigDecimal ocdd) {
		this.ocdd = ocdd;
	}

	public BigDecimal getOcdf() {
		return this.ocdf;
	}

	public void setOcdf(BigDecimal ocdf) {
		this.ocdf = ocdf;
	}

	public BigDecimal getPecdd1() {
		return this.pecdd1;
	}

	public void setPecdd1(BigDecimal pecdd1) {
		this.pecdd1 = pecdd1;
	}

	public BigDecimal getPecdf1() {
		return this.pecdf1;
	}

	public void setPecdf1(BigDecimal pecdf1) {
		this.pecdf1 = pecdf1;
	}

	public BigDecimal getPecdf2() {
		return this.pecdf2;
	}

	public void setPecdf2(BigDecimal pecdf2) {
		this.pecdf2 = pecdf2;
	}

	public String getTbvisitId() {
		return this.tbvisitId;
	}

	public void setTbvisitId(String tbvisitId) {
		this.tbvisitId = tbvisitId;
	}

	public BigDecimal getTcdd1() {
		return this.tcdd1;
	}

	public void setTcdd1(BigDecimal tcdd1) {
		this.tcdd1 = tcdd1;
	}

	public BigDecimal getTcdf1() {
		return this.tcdf1;
	}

	public void setTcdf1(BigDecimal tcdf1) {
		this.tcdf1 = tcdf1;
	}

	public String getTeqType() {
		return this.teqType;
	}

	public void setTeqType(String teqType) {
		this.teqType = teqType;
	}

	public BigDecimal getTsdDwr() {
		return this.tsdDwr;
	}

	public void setTsdDwr(BigDecimal tsdDwr) {
		this.tsdDwr = tsdDwr;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}