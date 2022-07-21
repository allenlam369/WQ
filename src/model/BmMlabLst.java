package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bm_mlab_lst database table.
 * 
 */
//@Entity
@Table(name="bm_mlab_lst")
@NamedQuery(name="BmMlabLst.findAll", query="SELECT b FROM BmMlabLst b")
public class BmMlabLst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bmvisit_id")
	private String bmvisitId;

	@Column(name="ec_f1")
	private BigDecimal ecF1;

	@Column(name="ec_f2")
	private BigDecimal ecF2;

	@Column(name="ec_f3")
	private BigDecimal ecF3;

	@Column(name="ec_f4")
	private BigDecimal ecF4;

	@Column(name="ec_f5")
	private BigDecimal ecF5;

	@Column(name="ec_l")
	private BigDecimal ecL;

	@Column(name="ec_m")
	private BigDecimal ecM;

	@Column(name="ec_o")
	private BigDecimal ecO;

	@Column(name="ec_r")
	private BigDecimal ecR;

	@Column(name="ec_s1")
	private BigDecimal ecS1;

	@Column(name="ec_s2")
	private BigDecimal ecS2;

	@Column(name="ec_s3")
	private BigDecimal ecS3;

	@Column(name="ec_s4")
	private BigDecimal ecS4;

	@Column(name="ec_s5")
	private BigDecimal ecS5;

	@Column(name="fc_f1")
	private BigDecimal fcF1;

	@Column(name="fc_f2")
	private BigDecimal fcF2;

	@Column(name="fc_f3")
	private BigDecimal fcF3;

	@Column(name="fc_f4")
	private BigDecimal fcF4;

	@Column(name="fc_f5")
	private BigDecimal fcF5;

	@Column(name="fc_l")
	private BigDecimal fcL;

	@Column(name="fc_m")
	private BigDecimal fcM;

	@Column(name="fc_o")
	private BigDecimal fcO;

	@Column(name="fc_r")
	private BigDecimal fcR;

	@Column(name="fc_s1")
	private BigDecimal fcS1;

	@Column(name="fc_s2")
	private BigDecimal fcS2;

	@Column(name="fc_s3")
	private BigDecimal fcS3;

	@Column(name="fc_s4")
	private BigDecimal fcS4;

	@Column(name="fc_s5")
	private BigDecimal fcS5;

	private BigDecimal ph;

	private BigDecimal sal;

	@Column(name="sal_f1_2")
	private BigDecimal salF12;

	@Column(name="sal_f2_2")
	private BigDecimal salF22;

	@Column(name="sal_f3_2")
	private BigDecimal salF32;

	@Column(name="sal_f4_2")
	private BigDecimal salF42;

	@Column(name="sal_f5_2")
	private BigDecimal salF52;

	@Column(name="sal_l")
	private BigDecimal salL;

	@Column(name="sal_m")
	private BigDecimal salM;

	@Column(name="sal_o")
	private BigDecimal salO;

	@Column(name="sal_r")
	private BigDecimal salR;

	@Column(name="sal_s1")
	private BigDecimal salS1;

	@Column(name="sal_s1_2")
	private BigDecimal salS12;

	@Column(name="sal_s2")
	private BigDecimal salS2;

	@Column(name="sal_s2_2")
	private BigDecimal salS22;

	@Column(name="sal_s3")
	private BigDecimal salS3;

	@Column(name="sal_s3_2")
	private BigDecimal salS32;

	@Column(name="sal_s4")
	private BigDecimal salS4;

	@Column(name="sal_s4_2")
	private BigDecimal salS42;

	@Column(name="sal_s5")
	private BigDecimal salS5;

	@Column(name="sal_s5_2")
	private BigDecimal salS52;

	private BigDecimal turb;

	public BmMlabLst() {
	}

	public String getBmvisitId() {
		return this.bmvisitId;
	}

	public void setBmvisitId(String bmvisitId) {
		this.bmvisitId = bmvisitId;
	}

	public BigDecimal getEcF1() {
		return this.ecF1;
	}

	public void setEcF1(BigDecimal ecF1) {
		this.ecF1 = ecF1;
	}

	public BigDecimal getEcF2() {
		return this.ecF2;
	}

	public void setEcF2(BigDecimal ecF2) {
		this.ecF2 = ecF2;
	}

	public BigDecimal getEcF3() {
		return this.ecF3;
	}

	public void setEcF3(BigDecimal ecF3) {
		this.ecF3 = ecF3;
	}

	public BigDecimal getEcF4() {
		return this.ecF4;
	}

	public void setEcF4(BigDecimal ecF4) {
		this.ecF4 = ecF4;
	}

	public BigDecimal getEcF5() {
		return this.ecF5;
	}

	public void setEcF5(BigDecimal ecF5) {
		this.ecF5 = ecF5;
	}

	public BigDecimal getEcL() {
		return this.ecL;
	}

	public void setEcL(BigDecimal ecL) {
		this.ecL = ecL;
	}

	public BigDecimal getEcM() {
		return this.ecM;
	}

	public void setEcM(BigDecimal ecM) {
		this.ecM = ecM;
	}

	public BigDecimal getEcO() {
		return this.ecO;
	}

	public void setEcO(BigDecimal ecO) {
		this.ecO = ecO;
	}

	public BigDecimal getEcR() {
		return this.ecR;
	}

	public void setEcR(BigDecimal ecR) {
		this.ecR = ecR;
	}

	public BigDecimal getEcS1() {
		return this.ecS1;
	}

	public void setEcS1(BigDecimal ecS1) {
		this.ecS1 = ecS1;
	}

	public BigDecimal getEcS2() {
		return this.ecS2;
	}

	public void setEcS2(BigDecimal ecS2) {
		this.ecS2 = ecS2;
	}

	public BigDecimal getEcS3() {
		return this.ecS3;
	}

	public void setEcS3(BigDecimal ecS3) {
		this.ecS3 = ecS3;
	}

	public BigDecimal getEcS4() {
		return this.ecS4;
	}

	public void setEcS4(BigDecimal ecS4) {
		this.ecS4 = ecS4;
	}

	public BigDecimal getEcS5() {
		return this.ecS5;
	}

	public void setEcS5(BigDecimal ecS5) {
		this.ecS5 = ecS5;
	}

	public BigDecimal getFcF1() {
		return this.fcF1;
	}

	public void setFcF1(BigDecimal fcF1) {
		this.fcF1 = fcF1;
	}

	public BigDecimal getFcF2() {
		return this.fcF2;
	}

	public void setFcF2(BigDecimal fcF2) {
		this.fcF2 = fcF2;
	}

	public BigDecimal getFcF3() {
		return this.fcF3;
	}

	public void setFcF3(BigDecimal fcF3) {
		this.fcF3 = fcF3;
	}

	public BigDecimal getFcF4() {
		return this.fcF4;
	}

	public void setFcF4(BigDecimal fcF4) {
		this.fcF4 = fcF4;
	}

	public BigDecimal getFcF5() {
		return this.fcF5;
	}

	public void setFcF5(BigDecimal fcF5) {
		this.fcF5 = fcF5;
	}

	public BigDecimal getFcL() {
		return this.fcL;
	}

	public void setFcL(BigDecimal fcL) {
		this.fcL = fcL;
	}

	public BigDecimal getFcM() {
		return this.fcM;
	}

	public void setFcM(BigDecimal fcM) {
		this.fcM = fcM;
	}

	public BigDecimal getFcO() {
		return this.fcO;
	}

	public void setFcO(BigDecimal fcO) {
		this.fcO = fcO;
	}

	public BigDecimal getFcR() {
		return this.fcR;
	}

	public void setFcR(BigDecimal fcR) {
		this.fcR = fcR;
	}

	public BigDecimal getFcS1() {
		return this.fcS1;
	}

	public void setFcS1(BigDecimal fcS1) {
		this.fcS1 = fcS1;
	}

	public BigDecimal getFcS2() {
		return this.fcS2;
	}

	public void setFcS2(BigDecimal fcS2) {
		this.fcS2 = fcS2;
	}

	public BigDecimal getFcS3() {
		return this.fcS3;
	}

	public void setFcS3(BigDecimal fcS3) {
		this.fcS3 = fcS3;
	}

	public BigDecimal getFcS4() {
		return this.fcS4;
	}

	public void setFcS4(BigDecimal fcS4) {
		this.fcS4 = fcS4;
	}

	public BigDecimal getFcS5() {
		return this.fcS5;
	}

	public void setFcS5(BigDecimal fcS5) {
		this.fcS5 = fcS5;
	}

	public BigDecimal getPh() {
		return this.ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public BigDecimal getSal() {
		return this.sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

	public BigDecimal getSalF12() {
		return this.salF12;
	}

	public void setSalF12(BigDecimal salF12) {
		this.salF12 = salF12;
	}

	public BigDecimal getSalF22() {
		return this.salF22;
	}

	public void setSalF22(BigDecimal salF22) {
		this.salF22 = salF22;
	}

	public BigDecimal getSalF32() {
		return this.salF32;
	}

	public void setSalF32(BigDecimal salF32) {
		this.salF32 = salF32;
	}

	public BigDecimal getSalF42() {
		return this.salF42;
	}

	public void setSalF42(BigDecimal salF42) {
		this.salF42 = salF42;
	}

	public BigDecimal getSalF52() {
		return this.salF52;
	}

	public void setSalF52(BigDecimal salF52) {
		this.salF52 = salF52;
	}

	public BigDecimal getSalL() {
		return this.salL;
	}

	public void setSalL(BigDecimal salL) {
		this.salL = salL;
	}

	public BigDecimal getSalM() {
		return this.salM;
	}

	public void setSalM(BigDecimal salM) {
		this.salM = salM;
	}

	public BigDecimal getSalO() {
		return this.salO;
	}

	public void setSalO(BigDecimal salO) {
		this.salO = salO;
	}

	public BigDecimal getSalR() {
		return this.salR;
	}

	public void setSalR(BigDecimal salR) {
		this.salR = salR;
	}

	public BigDecimal getSalS1() {
		return this.salS1;
	}

	public void setSalS1(BigDecimal salS1) {
		this.salS1 = salS1;
	}

	public BigDecimal getSalS12() {
		return this.salS12;
	}

	public void setSalS12(BigDecimal salS12) {
		this.salS12 = salS12;
	}

	public BigDecimal getSalS2() {
		return this.salS2;
	}

	public void setSalS2(BigDecimal salS2) {
		this.salS2 = salS2;
	}

	public BigDecimal getSalS22() {
		return this.salS22;
	}

	public void setSalS22(BigDecimal salS22) {
		this.salS22 = salS22;
	}

	public BigDecimal getSalS3() {
		return this.salS3;
	}

	public void setSalS3(BigDecimal salS3) {
		this.salS3 = salS3;
	}

	public BigDecimal getSalS32() {
		return this.salS32;
	}

	public void setSalS32(BigDecimal salS32) {
		this.salS32 = salS32;
	}

	public BigDecimal getSalS4() {
		return this.salS4;
	}

	public void setSalS4(BigDecimal salS4) {
		this.salS4 = salS4;
	}

	public BigDecimal getSalS42() {
		return this.salS42;
	}

	public void setSalS42(BigDecimal salS42) {
		this.salS42 = salS42;
	}

	public BigDecimal getSalS5() {
		return this.salS5;
	}

	public void setSalS5(BigDecimal salS5) {
		this.salS5 = salS5;
	}

	public BigDecimal getSalS52() {
		return this.salS52;
	}

	public void setSalS52(BigDecimal salS52) {
		this.salS52 = salS52;
	}

	public BigDecimal getTurb() {
		return this.turb;
	}

	public void setTurb(BigDecimal turb) {
		this.turb = turb;
	}

}