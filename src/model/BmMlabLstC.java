package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the bm_mlab_lst_c database table.
 * 
 */
//@Entity
@Table(name="bm_mlab_lst_c")
@NamedQuery(name="BmMlabLstC.findAll", query="SELECT b FROM BmMlabLstC b")
public class BmMlabLstC implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="bmvisit_id")
	private String bmvisitId;

	@Column(name="ec_a1")
	private BigDecimal ecA1;

	@Column(name="ec_a2")
	private BigDecimal ecA2;

	@Column(name="ec_a3")
	private BigDecimal ecA3;

	@Column(name="ec_a4")
	private BigDecimal ecA4;

	@Column(name="ec_a5")
	private BigDecimal ecA5;

	@Column(name="ec_l")
	private BigDecimal ecL;

	@Column(name="ec_m")
	private BigDecimal ecM;

	@Column(name="ec_o")
	private BigDecimal ecO;

	@Column(name="ec_r")
	private BigDecimal ecR;

	@Column(name="entrc_a1")
	private BigDecimal entrcA1;

	@Column(name="entrc_a2")
	private BigDecimal entrcA2;

	@Column(name="entrc_a3")
	private BigDecimal entrcA3;

	@Column(name="entrc_a4")
	private BigDecimal entrcA4;

	@Column(name="entrc_a5")
	private BigDecimal entrcA5;

	@Column(name="entrc_l")
	private BigDecimal entrcL;

	@Column(name="entrc_m")
	private BigDecimal entrcM;

	@Column(name="entrc_o")
	private BigDecimal entrcO;

	@Column(name="entrc_r")
	private BigDecimal entrcR;

	@Column(name="est_ec_a1")
	private String estEcA1;

	@Column(name="est_ec_a2")
	private String estEcA2;

	@Column(name="est_ec_a3")
	private String estEcA3;

	@Column(name="est_ec_a4")
	private String estEcA4;

	@Column(name="est_ec_a5")
	private String estEcA5;

	@Column(name="est_ec_l")
	private String estEcL;

	@Column(name="est_ec_m")
	private String estEcM;

	@Column(name="est_ec_o")
	private String estEcO;

	@Column(name="est_ec_r")
	private String estEcR;

	@Column(name="est_entrc_a1")
	private String estEntrcA1;

	@Column(name="est_entrc_a2")
	private String estEntrcA2;

	@Column(name="est_entrc_a3")
	private String estEntrcA3;

	@Column(name="est_entrc_a4")
	private String estEntrcA4;

	@Column(name="est_entrc_a5")
	private String estEntrcA5;

	@Column(name="est_entrc_l")
	private String estEntrcL;

	@Column(name="est_entrc_m")
	private String estEntrcM;

	@Column(name="est_entrc_o")
	private String estEntrcO;

	@Column(name="est_entrc_r")
	private String estEntrcR;

	@Column(name="l_ec_a1")
	private String lEcA1;

	@Column(name="l_ec_a2")
	private String lEcA2;

	@Column(name="l_ec_a3")
	private String lEcA3;

	@Column(name="l_ec_a4")
	private String lEcA4;

	@Column(name="l_ec_a5")
	private String lEcA5;

	@Column(name="l_ec_l")
	private String lEcL;

	@Column(name="l_ec_m")
	private String lEcM;

	@Column(name="l_ec_o")
	private String lEcO;

	@Column(name="l_ec_r")
	private String lEcR;

	@Column(name="l_entrc_a1")
	private String lEntrcA1;

	@Column(name="l_entrc_a2")
	private String lEntrcA2;

	@Column(name="l_entrc_a3")
	private String lEntrcA3;

	@Column(name="l_entrc_a4")
	private String lEntrcA4;

	@Column(name="l_entrc_a5")
	private String lEntrcA5;

	@Column(name="l_entrc_l")
	private String lEntrcL;

	@Column(name="l_entrc_m")
	private String lEntrcM;

	@Column(name="l_entrc_o")
	private String lEntrcO;

	@Column(name="l_entrc_r")
	private String lEntrcR;

	public BmMlabLstC() {
	}

	public String getBmvisitId() {
		return this.bmvisitId;
	}

	public void setBmvisitId(String bmvisitId) {
		this.bmvisitId = bmvisitId;
	}

	public BigDecimal getEcA1() {
		return this.ecA1;
	}

	public void setEcA1(BigDecimal ecA1) {
		this.ecA1 = ecA1;
	}

	public BigDecimal getEcA2() {
		return this.ecA2;
	}

	public void setEcA2(BigDecimal ecA2) {
		this.ecA2 = ecA2;
	}

	public BigDecimal getEcA3() {
		return this.ecA3;
	}

	public void setEcA3(BigDecimal ecA3) {
		this.ecA3 = ecA3;
	}

	public BigDecimal getEcA4() {
		return this.ecA4;
	}

	public void setEcA4(BigDecimal ecA4) {
		this.ecA4 = ecA4;
	}

	public BigDecimal getEcA5() {
		return this.ecA5;
	}

	public void setEcA5(BigDecimal ecA5) {
		this.ecA5 = ecA5;
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

	public BigDecimal getEntrcA1() {
		return this.entrcA1;
	}

	public void setEntrcA1(BigDecimal entrcA1) {
		this.entrcA1 = entrcA1;
	}

	public BigDecimal getEntrcA2() {
		return this.entrcA2;
	}

	public void setEntrcA2(BigDecimal entrcA2) {
		this.entrcA2 = entrcA2;
	}

	public BigDecimal getEntrcA3() {
		return this.entrcA3;
	}

	public void setEntrcA3(BigDecimal entrcA3) {
		this.entrcA3 = entrcA3;
	}

	public BigDecimal getEntrcA4() {
		return this.entrcA4;
	}

	public void setEntrcA4(BigDecimal entrcA4) {
		this.entrcA4 = entrcA4;
	}

	public BigDecimal getEntrcA5() {
		return this.entrcA5;
	}

	public void setEntrcA5(BigDecimal entrcA5) {
		this.entrcA5 = entrcA5;
	}

	public BigDecimal getEntrcL() {
		return this.entrcL;
	}

	public void setEntrcL(BigDecimal entrcL) {
		this.entrcL = entrcL;
	}

	public BigDecimal getEntrcM() {
		return this.entrcM;
	}

	public void setEntrcM(BigDecimal entrcM) {
		this.entrcM = entrcM;
	}

	public BigDecimal getEntrcO() {
		return this.entrcO;
	}

	public void setEntrcO(BigDecimal entrcO) {
		this.entrcO = entrcO;
	}

	public BigDecimal getEntrcR() {
		return this.entrcR;
	}

	public void setEntrcR(BigDecimal entrcR) {
		this.entrcR = entrcR;
	}

	public String getEstEcA1() {
		return this.estEcA1;
	}

	public void setEstEcA1(String estEcA1) {
		this.estEcA1 = estEcA1;
	}

	public String getEstEcA2() {
		return this.estEcA2;
	}

	public void setEstEcA2(String estEcA2) {
		this.estEcA2 = estEcA2;
	}

	public String getEstEcA3() {
		return this.estEcA3;
	}

	public void setEstEcA3(String estEcA3) {
		this.estEcA3 = estEcA3;
	}

	public String getEstEcA4() {
		return this.estEcA4;
	}

	public void setEstEcA4(String estEcA4) {
		this.estEcA4 = estEcA4;
	}

	public String getEstEcA5() {
		return this.estEcA5;
	}

	public void setEstEcA5(String estEcA5) {
		this.estEcA5 = estEcA5;
	}

	public String getEstEcL() {
		return this.estEcL;
	}

	public void setEstEcL(String estEcL) {
		this.estEcL = estEcL;
	}

	public String getEstEcM() {
		return this.estEcM;
	}

	public void setEstEcM(String estEcM) {
		this.estEcM = estEcM;
	}

	public String getEstEcO() {
		return this.estEcO;
	}

	public void setEstEcO(String estEcO) {
		this.estEcO = estEcO;
	}

	public String getEstEcR() {
		return this.estEcR;
	}

	public void setEstEcR(String estEcR) {
		this.estEcR = estEcR;
	}

	public String getEstEntrcA1() {
		return this.estEntrcA1;
	}

	public void setEstEntrcA1(String estEntrcA1) {
		this.estEntrcA1 = estEntrcA1;
	}

	public String getEstEntrcA2() {
		return this.estEntrcA2;
	}

	public void setEstEntrcA2(String estEntrcA2) {
		this.estEntrcA2 = estEntrcA2;
	}

	public String getEstEntrcA3() {
		return this.estEntrcA3;
	}

	public void setEstEntrcA3(String estEntrcA3) {
		this.estEntrcA3 = estEntrcA3;
	}

	public String getEstEntrcA4() {
		return this.estEntrcA4;
	}

	public void setEstEntrcA4(String estEntrcA4) {
		this.estEntrcA4 = estEntrcA4;
	}

	public String getEstEntrcA5() {
		return this.estEntrcA5;
	}

	public void setEstEntrcA5(String estEntrcA5) {
		this.estEntrcA5 = estEntrcA5;
	}

	public String getEstEntrcL() {
		return this.estEntrcL;
	}

	public void setEstEntrcL(String estEntrcL) {
		this.estEntrcL = estEntrcL;
	}

	public String getEstEntrcM() {
		return this.estEntrcM;
	}

	public void setEstEntrcM(String estEntrcM) {
		this.estEntrcM = estEntrcM;
	}

	public String getEstEntrcO() {
		return this.estEntrcO;
	}

	public void setEstEntrcO(String estEntrcO) {
		this.estEntrcO = estEntrcO;
	}

	public String getEstEntrcR() {
		return this.estEntrcR;
	}

	public void setEstEntrcR(String estEntrcR) {
		this.estEntrcR = estEntrcR;
	}

	public String getLEcA1() {
		return this.lEcA1;
	}

	public void setLEcA1(String lEcA1) {
		this.lEcA1 = lEcA1;
	}

	public String getLEcA2() {
		return this.lEcA2;
	}

	public void setLEcA2(String lEcA2) {
		this.lEcA2 = lEcA2;
	}

	public String getLEcA3() {
		return this.lEcA3;
	}

	public void setLEcA3(String lEcA3) {
		this.lEcA3 = lEcA3;
	}

	public String getLEcA4() {
		return this.lEcA4;
	}

	public void setLEcA4(String lEcA4) {
		this.lEcA4 = lEcA4;
	}

	public String getLEcA5() {
		return this.lEcA5;
	}

	public void setLEcA5(String lEcA5) {
		this.lEcA5 = lEcA5;
	}

	public String getLEcL() {
		return this.lEcL;
	}

	public void setLEcL(String lEcL) {
		this.lEcL = lEcL;
	}

	public String getLEcM() {
		return this.lEcM;
	}

	public void setLEcM(String lEcM) {
		this.lEcM = lEcM;
	}

	public String getLEcO() {
		return this.lEcO;
	}

	public void setLEcO(String lEcO) {
		this.lEcO = lEcO;
	}

	public String getLEcR() {
		return this.lEcR;
	}

	public void setLEcR(String lEcR) {
		this.lEcR = lEcR;
	}

	public String getLEntrcA1() {
		return this.lEntrcA1;
	}

	public void setLEntrcA1(String lEntrcA1) {
		this.lEntrcA1 = lEntrcA1;
	}

	public String getLEntrcA2() {
		return this.lEntrcA2;
	}

	public void setLEntrcA2(String lEntrcA2) {
		this.lEntrcA2 = lEntrcA2;
	}

	public String getLEntrcA3() {
		return this.lEntrcA3;
	}

	public void setLEntrcA3(String lEntrcA3) {
		this.lEntrcA3 = lEntrcA3;
	}

	public String getLEntrcA4() {
		return this.lEntrcA4;
	}

	public void setLEntrcA4(String lEntrcA4) {
		this.lEntrcA4 = lEntrcA4;
	}

	public String getLEntrcA5() {
		return this.lEntrcA5;
	}

	public void setLEntrcA5(String lEntrcA5) {
		this.lEntrcA5 = lEntrcA5;
	}

	public String getLEntrcL() {
		return this.lEntrcL;
	}

	public void setLEntrcL(String lEntrcL) {
		this.lEntrcL = lEntrcL;
	}

	public String getLEntrcM() {
		return this.lEntrcM;
	}

	public void setLEntrcM(String lEntrcM) {
		this.lEntrcM = lEntrcM;
	}

	public String getLEntrcO() {
		return this.lEntrcO;
	}

	public void setLEntrcO(String lEntrcO) {
		this.lEntrcO = lEntrcO;
	}

	public String getLEntrcR() {
		return this.lEntrcR;
	}

	public void setLEntrcR(String lEntrcR) {
		this.lEntrcR = lEntrcR;
	}

}