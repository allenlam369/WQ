package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tpms_gov_lab database table.
 * 
 */
//@Entity
@Table(name="tpms_gov_lab")
@NamedQuery(name="TpmsGovLab.findAll", query="SELECT t FROM TpmsGovLab t")
public class TpmsGovLab implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="_1_2_3_4_6_7_8_hpcdd")
	private double _234678Hpcdd;

	@Column(name="_1_2_3_4_6_7_8_hpcdf")
	private double _234678Hpcdf;

	@Column(name="_1_2_3_4_7_8_9_hpcdf")
	private double _234789Hpcdf;

	@Column(name="_1_2_3_4_7_8_hxcdd")
	private double _23478Hxcdd;

	@Column(name="_1_2_3_4_7_8_hxcdf")
	private double _23478Hxcdf;

	@Column(name="_1_2_3_6_7_8_hxcdd")
	private double _23678Hxcdd;

	@Column(name="_1_2_3_6_7_8_hxcdf")
	private double _23678Hxcdf;

	@Column(name="_1_2_3_7_8_9_hxcdd")
	private double _23789Hxcdd;

	@Column(name="_1_2_3_7_8_9_hxcdf")
	private double _23789Hxcdf;

	@Column(name="_1_2_3_7_8_pecdd")
	private double _2378Pecdd;

	@Column(name="_1_2_3_7_8_pecdf")
	private double _2378Pecdf;

	@Column(name="_2_3_4_6_7_8_hxcdf")
	private double _34678Hxcdf;

	@Column(name="_2_3_4_7_8_pecdf")
	private double _3478Pecdf;

	@Column(name="_2_3_7_8_tcdd")
	private double _378Tcdd;

	@Column(name="_2_3_7_8_tcdf")
	private double _378Tcdf;

	@Column(name="batch_no")
	private String batchNo;

	private double dwr;

	@Column(name="l_1_2_3_4_6_7_8_hpcdd")
	private String l1234678Hpcdd;

	@Column(name="l_1_2_3_4_6_7_8_hpcdf")
	private String l1234678Hpcdf;

	@Column(name="l_1_2_3_4_7_8_9_hpcdf")
	private String l1234789Hpcdf;

	@Column(name="l_1_2_3_4_7_8_hxcdd")
	private String l123478Hxcdd;

	@Column(name="l_1_2_3_4_7_8_hxcdf")
	private String l123478Hxcdf;

	@Column(name="l_1_2_3_6_7_8_hxcdd")
	private String l123678Hxcdd;

	@Column(name="l_1_2_3_6_7_8_hxcdf")
	private String l123678Hxcdf;

	@Column(name="l_1_2_3_7_8_9_hxcdd")
	private String l123789Hxcdd;

	@Column(name="l_1_2_3_7_8_9_hxcdf")
	private String l123789Hxcdf;

	@Column(name="l_1_2_3_7_8_pecdd")
	private String l12378Pecdd;

	@Column(name="l_1_2_3_7_8_pecdf")
	private String l12378Pecdf;

	@Column(name="l_2_3_4_6_7_8_hxcdf")
	private String l234678Hxcdf;

	@Column(name="l_2_3_4_7_8_pecdf")
	private String l23478Pecdf;

	@Column(name="l_2_3_7_8_tcdd")
	private String l2378Tcdd;

	@Column(name="l_2_3_7_8_tcdf")
	private String l2378Tcdf;

	@Column(name="l_dwr")
	private String lDwr;

	@Column(name="l_ocdd")
	private String lOcdd;

	@Column(name="l_ocdf")
	private String lOcdf;

	@Column(name="l_pcb_101")
	private String lPcb101;

	@Column(name="l_pcb_105")
	private String lPcb105;

	@Column(name="l_pcb_114")
	private String lPcb114;

	@Column(name="l_pcb_118")
	private String lPcb118;

	@Column(name="l_pcb_123")
	private String lPcb123;

	@Column(name="l_pcb_126")
	private String lPcb126;

	@Column(name="l_pcb_128")
	private String lPcb128;

	@Column(name="l_pcb_138")
	private String lPcb138;

	@Column(name="l_pcb_149")
	private String lPcb149;

	@Column(name="l_pcb_153")
	private String lPcb153;

	@Column(name="l_pcb_156")
	private String lPcb156;

	@Column(name="l_pcb_157")
	private String lPcb157;

	@Column(name="l_pcb_167")
	private String lPcb167;

	@Column(name="l_pcb_169")
	private String lPcb169;

	@Column(name="l_pcb_170")
	private String lPcb170;

	@Column(name="l_pcb_18")
	private String lPcb18;

	@Column(name="l_pcb_180")
	private String lPcb180;

	@Column(name="l_pcb_187")
	private String lPcb187;

	@Column(name="l_pcb_189")
	private String lPcb189;

	@Column(name="l_pcb_28")
	private String lPcb28;

	@Column(name="l_pcb_31")
	private String lPcb31;

	@Column(name="l_pcb_44")
	private String lPcb44;

	@Column(name="l_pcb_52")
	private String lPcb52;

	@Column(name="l_pcb_66")
	private String lPcb66;

	@Column(name="l_pcb_77")
	private String lPcb77;

	@Column(name="l_pcb_8")
	private String lPcb8;

	@Column(name="l_pcb_81")
	private String lPcb81;

	@Column(name="lab_no")
	private String labNo;

	private double ocdd;

	private double ocdf;

	@Column(name="pcb_101")
	private double pcb101;

	@Column(name="pcb_105")
	private double pcb105;

	@Column(name="pcb_114")
	private double pcb114;

	@Column(name="pcb_118")
	private double pcb118;

	@Column(name="pcb_123")
	private double pcb123;

	@Column(name="pcb_126")
	private double pcb126;

	@Column(name="pcb_128")
	private double pcb128;

	@Column(name="pcb_138")
	private double pcb138;

	@Column(name="pcb_149")
	private double pcb149;

	@Column(name="pcb_153")
	private double pcb153;

	@Column(name="pcb_156")
	private double pcb156;

	@Column(name="pcb_157")
	private double pcb157;

	@Column(name="pcb_167")
	private double pcb167;

	@Column(name="pcb_169")
	private double pcb169;

	@Column(name="pcb_170")
	private double pcb170;

	@Column(name="pcb_18")
	private double pcb18;

	@Column(name="pcb_180")
	private double pcb180;

	@Column(name="pcb_187")
	private double pcb187;

	@Column(name="pcb_189")
	private double pcb189;

	@Column(name="pcb_28")
	private double pcb28;

	@Column(name="pcb_31")
	private double pcb31;

	@Column(name="pcb_44")
	private double pcb44;

	@Column(name="pcb_52")
	private double pcb52;

	@Column(name="pcb_66")
	private double pcb66;

	@Column(name="pcb_77")
	private double pcb77;

	@Column(name="pcb_8")
	private double pcb8;

	@Column(name="pcb_81")
	private double pcb81;

	@Column(name="sample_id")
	private String sampleId;

	@Column(name="sample_mark")
	private String sampleMark;

	public TpmsGovLab() {
	}

	public double get_234678Hpcdd() {
		return this._234678Hpcdd;
	}

	public void set_234678Hpcdd(double _234678Hpcdd) {
		this._234678Hpcdd = _234678Hpcdd;
	}

	public double get_234678Hpcdf() {
		return this._234678Hpcdf;
	}

	public void set_234678Hpcdf(double _234678Hpcdf) {
		this._234678Hpcdf = _234678Hpcdf;
	}

	public double get_234789Hpcdf() {
		return this._234789Hpcdf;
	}

	public void set_234789Hpcdf(double _234789Hpcdf) {
		this._234789Hpcdf = _234789Hpcdf;
	}

	public double get_23478Hxcdd() {
		return this._23478Hxcdd;
	}

	public void set_23478Hxcdd(double _23478Hxcdd) {
		this._23478Hxcdd = _23478Hxcdd;
	}

	public double get_23478Hxcdf() {
		return this._23478Hxcdf;
	}

	public void set_23478Hxcdf(double _23478Hxcdf) {
		this._23478Hxcdf = _23478Hxcdf;
	}

	public double get_23678Hxcdd() {
		return this._23678Hxcdd;
	}

	public void set_23678Hxcdd(double _23678Hxcdd) {
		this._23678Hxcdd = _23678Hxcdd;
	}

	public double get_23678Hxcdf() {
		return this._23678Hxcdf;
	}

	public void set_23678Hxcdf(double _23678Hxcdf) {
		this._23678Hxcdf = _23678Hxcdf;
	}

	public double get_23789Hxcdd() {
		return this._23789Hxcdd;
	}

	public void set_23789Hxcdd(double _23789Hxcdd) {
		this._23789Hxcdd = _23789Hxcdd;
	}

	public double get_23789Hxcdf() {
		return this._23789Hxcdf;
	}

	public void set_23789Hxcdf(double _23789Hxcdf) {
		this._23789Hxcdf = _23789Hxcdf;
	}

	public double get_2378Pecdd() {
		return this._2378Pecdd;
	}

	public void set_2378Pecdd(double _2378Pecdd) {
		this._2378Pecdd = _2378Pecdd;
	}

	public double get_2378Pecdf() {
		return this._2378Pecdf;
	}

	public void set_2378Pecdf(double _2378Pecdf) {
		this._2378Pecdf = _2378Pecdf;
	}

	public double get_34678Hxcdf() {
		return this._34678Hxcdf;
	}

	public void set_34678Hxcdf(double _34678Hxcdf) {
		this._34678Hxcdf = _34678Hxcdf;
	}

	public double get_3478Pecdf() {
		return this._3478Pecdf;
	}

	public void set_3478Pecdf(double _3478Pecdf) {
		this._3478Pecdf = _3478Pecdf;
	}

	public double get_378Tcdd() {
		return this._378Tcdd;
	}

	public void set_378Tcdd(double _378Tcdd) {
		this._378Tcdd = _378Tcdd;
	}

	public double get_378Tcdf() {
		return this._378Tcdf;
	}

	public void set_378Tcdf(double _378Tcdf) {
		this._378Tcdf = _378Tcdf;
	}

	public String getBatchNo() {
		return this.batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public double getDwr() {
		return this.dwr;
	}

	public void setDwr(double dwr) {
		this.dwr = dwr;
	}

	public String getL1234678Hpcdd() {
		return this.l1234678Hpcdd;
	}

	public void setL1234678Hpcdd(String l1234678Hpcdd) {
		this.l1234678Hpcdd = l1234678Hpcdd;
	}

	public String getL1234678Hpcdf() {
		return this.l1234678Hpcdf;
	}

	public void setL1234678Hpcdf(String l1234678Hpcdf) {
		this.l1234678Hpcdf = l1234678Hpcdf;
	}

	public String getL1234789Hpcdf() {
		return this.l1234789Hpcdf;
	}

	public void setL1234789Hpcdf(String l1234789Hpcdf) {
		this.l1234789Hpcdf = l1234789Hpcdf;
	}

	public String getL123478Hxcdd() {
		return this.l123478Hxcdd;
	}

	public void setL123478Hxcdd(String l123478Hxcdd) {
		this.l123478Hxcdd = l123478Hxcdd;
	}

	public String getL123478Hxcdf() {
		return this.l123478Hxcdf;
	}

	public void setL123478Hxcdf(String l123478Hxcdf) {
		this.l123478Hxcdf = l123478Hxcdf;
	}

	public String getL123678Hxcdd() {
		return this.l123678Hxcdd;
	}

	public void setL123678Hxcdd(String l123678Hxcdd) {
		this.l123678Hxcdd = l123678Hxcdd;
	}

	public String getL123678Hxcdf() {
		return this.l123678Hxcdf;
	}

	public void setL123678Hxcdf(String l123678Hxcdf) {
		this.l123678Hxcdf = l123678Hxcdf;
	}

	public String getL123789Hxcdd() {
		return this.l123789Hxcdd;
	}

	public void setL123789Hxcdd(String l123789Hxcdd) {
		this.l123789Hxcdd = l123789Hxcdd;
	}

	public String getL123789Hxcdf() {
		return this.l123789Hxcdf;
	}

	public void setL123789Hxcdf(String l123789Hxcdf) {
		this.l123789Hxcdf = l123789Hxcdf;
	}

	public String getL12378Pecdd() {
		return this.l12378Pecdd;
	}

	public void setL12378Pecdd(String l12378Pecdd) {
		this.l12378Pecdd = l12378Pecdd;
	}

	public String getL12378Pecdf() {
		return this.l12378Pecdf;
	}

	public void setL12378Pecdf(String l12378Pecdf) {
		this.l12378Pecdf = l12378Pecdf;
	}

	public String getL234678Hxcdf() {
		return this.l234678Hxcdf;
	}

	public void setL234678Hxcdf(String l234678Hxcdf) {
		this.l234678Hxcdf = l234678Hxcdf;
	}

	public String getL23478Pecdf() {
		return this.l23478Pecdf;
	}

	public void setL23478Pecdf(String l23478Pecdf) {
		this.l23478Pecdf = l23478Pecdf;
	}

	public String getL2378Tcdd() {
		return this.l2378Tcdd;
	}

	public void setL2378Tcdd(String l2378Tcdd) {
		this.l2378Tcdd = l2378Tcdd;
	}

	public String getL2378Tcdf() {
		return this.l2378Tcdf;
	}

	public void setL2378Tcdf(String l2378Tcdf) {
		this.l2378Tcdf = l2378Tcdf;
	}

	public String getLDwr() {
		return this.lDwr;
	}

	public void setLDwr(String lDwr) {
		this.lDwr = lDwr;
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

	public String getLPcb101() {
		return this.lPcb101;
	}

	public void setLPcb101(String lPcb101) {
		this.lPcb101 = lPcb101;
	}

	public String getLPcb105() {
		return this.lPcb105;
	}

	public void setLPcb105(String lPcb105) {
		this.lPcb105 = lPcb105;
	}

	public String getLPcb114() {
		return this.lPcb114;
	}

	public void setLPcb114(String lPcb114) {
		this.lPcb114 = lPcb114;
	}

	public String getLPcb118() {
		return this.lPcb118;
	}

	public void setLPcb118(String lPcb118) {
		this.lPcb118 = lPcb118;
	}

	public String getLPcb123() {
		return this.lPcb123;
	}

	public void setLPcb123(String lPcb123) {
		this.lPcb123 = lPcb123;
	}

	public String getLPcb126() {
		return this.lPcb126;
	}

	public void setLPcb126(String lPcb126) {
		this.lPcb126 = lPcb126;
	}

	public String getLPcb128() {
		return this.lPcb128;
	}

	public void setLPcb128(String lPcb128) {
		this.lPcb128 = lPcb128;
	}

	public String getLPcb138() {
		return this.lPcb138;
	}

	public void setLPcb138(String lPcb138) {
		this.lPcb138 = lPcb138;
	}

	public String getLPcb149() {
		return this.lPcb149;
	}

	public void setLPcb149(String lPcb149) {
		this.lPcb149 = lPcb149;
	}

	public String getLPcb153() {
		return this.lPcb153;
	}

	public void setLPcb153(String lPcb153) {
		this.lPcb153 = lPcb153;
	}

	public String getLPcb156() {
		return this.lPcb156;
	}

	public void setLPcb156(String lPcb156) {
		this.lPcb156 = lPcb156;
	}

	public String getLPcb157() {
		return this.lPcb157;
	}

	public void setLPcb157(String lPcb157) {
		this.lPcb157 = lPcb157;
	}

	public String getLPcb167() {
		return this.lPcb167;
	}

	public void setLPcb167(String lPcb167) {
		this.lPcb167 = lPcb167;
	}

	public String getLPcb169() {
		return this.lPcb169;
	}

	public void setLPcb169(String lPcb169) {
		this.lPcb169 = lPcb169;
	}

	public String getLPcb170() {
		return this.lPcb170;
	}

	public void setLPcb170(String lPcb170) {
		this.lPcb170 = lPcb170;
	}

	public String getLPcb18() {
		return this.lPcb18;
	}

	public void setLPcb18(String lPcb18) {
		this.lPcb18 = lPcb18;
	}

	public String getLPcb180() {
		return this.lPcb180;
	}

	public void setLPcb180(String lPcb180) {
		this.lPcb180 = lPcb180;
	}

	public String getLPcb187() {
		return this.lPcb187;
	}

	public void setLPcb187(String lPcb187) {
		this.lPcb187 = lPcb187;
	}

	public String getLPcb189() {
		return this.lPcb189;
	}

	public void setLPcb189(String lPcb189) {
		this.lPcb189 = lPcb189;
	}

	public String getLPcb28() {
		return this.lPcb28;
	}

	public void setLPcb28(String lPcb28) {
		this.lPcb28 = lPcb28;
	}

	public String getLPcb31() {
		return this.lPcb31;
	}

	public void setLPcb31(String lPcb31) {
		this.lPcb31 = lPcb31;
	}

	public String getLPcb44() {
		return this.lPcb44;
	}

	public void setLPcb44(String lPcb44) {
		this.lPcb44 = lPcb44;
	}

	public String getLPcb52() {
		return this.lPcb52;
	}

	public void setLPcb52(String lPcb52) {
		this.lPcb52 = lPcb52;
	}

	public String getLPcb66() {
		return this.lPcb66;
	}

	public void setLPcb66(String lPcb66) {
		this.lPcb66 = lPcb66;
	}

	public String getLPcb77() {
		return this.lPcb77;
	}

	public void setLPcb77(String lPcb77) {
		this.lPcb77 = lPcb77;
	}

	public String getLPcb8() {
		return this.lPcb8;
	}

	public void setLPcb8(String lPcb8) {
		this.lPcb8 = lPcb8;
	}

	public String getLPcb81() {
		return this.lPcb81;
	}

	public void setLPcb81(String lPcb81) {
		this.lPcb81 = lPcb81;
	}

	public String getLabNo() {
		return this.labNo;
	}

	public void setLabNo(String labNo) {
		this.labNo = labNo;
	}

	public double getOcdd() {
		return this.ocdd;
	}

	public void setOcdd(double ocdd) {
		this.ocdd = ocdd;
	}

	public double getOcdf() {
		return this.ocdf;
	}

	public void setOcdf(double ocdf) {
		this.ocdf = ocdf;
	}

	public double getPcb101() {
		return this.pcb101;
	}

	public void setPcb101(double pcb101) {
		this.pcb101 = pcb101;
	}

	public double getPcb105() {
		return this.pcb105;
	}

	public void setPcb105(double pcb105) {
		this.pcb105 = pcb105;
	}

	public double getPcb114() {
		return this.pcb114;
	}

	public void setPcb114(double pcb114) {
		this.pcb114 = pcb114;
	}

	public double getPcb118() {
		return this.pcb118;
	}

	public void setPcb118(double pcb118) {
		this.pcb118 = pcb118;
	}

	public double getPcb123() {
		return this.pcb123;
	}

	public void setPcb123(double pcb123) {
		this.pcb123 = pcb123;
	}

	public double getPcb126() {
		return this.pcb126;
	}

	public void setPcb126(double pcb126) {
		this.pcb126 = pcb126;
	}

	public double getPcb128() {
		return this.pcb128;
	}

	public void setPcb128(double pcb128) {
		this.pcb128 = pcb128;
	}

	public double getPcb138() {
		return this.pcb138;
	}

	public void setPcb138(double pcb138) {
		this.pcb138 = pcb138;
	}

	public double getPcb149() {
		return this.pcb149;
	}

	public void setPcb149(double pcb149) {
		this.pcb149 = pcb149;
	}

	public double getPcb153() {
		return this.pcb153;
	}

	public void setPcb153(double pcb153) {
		this.pcb153 = pcb153;
	}

	public double getPcb156() {
		return this.pcb156;
	}

	public void setPcb156(double pcb156) {
		this.pcb156 = pcb156;
	}

	public double getPcb157() {
		return this.pcb157;
	}

	public void setPcb157(double pcb157) {
		this.pcb157 = pcb157;
	}

	public double getPcb167() {
		return this.pcb167;
	}

	public void setPcb167(double pcb167) {
		this.pcb167 = pcb167;
	}

	public double getPcb169() {
		return this.pcb169;
	}

	public void setPcb169(double pcb169) {
		this.pcb169 = pcb169;
	}

	public double getPcb170() {
		return this.pcb170;
	}

	public void setPcb170(double pcb170) {
		this.pcb170 = pcb170;
	}

	public double getPcb18() {
		return this.pcb18;
	}

	public void setPcb18(double pcb18) {
		this.pcb18 = pcb18;
	}

	public double getPcb180() {
		return this.pcb180;
	}

	public void setPcb180(double pcb180) {
		this.pcb180 = pcb180;
	}

	public double getPcb187() {
		return this.pcb187;
	}

	public void setPcb187(double pcb187) {
		this.pcb187 = pcb187;
	}

	public double getPcb189() {
		return this.pcb189;
	}

	public void setPcb189(double pcb189) {
		this.pcb189 = pcb189;
	}

	public double getPcb28() {
		return this.pcb28;
	}

	public void setPcb28(double pcb28) {
		this.pcb28 = pcb28;
	}

	public double getPcb31() {
		return this.pcb31;
	}

	public void setPcb31(double pcb31) {
		this.pcb31 = pcb31;
	}

	public double getPcb44() {
		return this.pcb44;
	}

	public void setPcb44(double pcb44) {
		this.pcb44 = pcb44;
	}

	public double getPcb52() {
		return this.pcb52;
	}

	public void setPcb52(double pcb52) {
		this.pcb52 = pcb52;
	}

	public double getPcb66() {
		return this.pcb66;
	}

	public void setPcb66(double pcb66) {
		this.pcb66 = pcb66;
	}

	public double getPcb77() {
		return this.pcb77;
	}

	public void setPcb77(double pcb77) {
		this.pcb77 = pcb77;
	}

	public double getPcb8() {
		return this.pcb8;
	}

	public void setPcb8(double pcb8) {
		this.pcb8 = pcb8;
	}

	public double getPcb81() {
		return this.pcb81;
	}

	public void setPcb81(double pcb81) {
		this.pcb81 = pcb81;
	}

	public String getSampleId() {
		return this.sampleId;
	}

	public void setSampleId(String sampleId) {
		this.sampleId = sampleId;
	}

	public String getSampleMark() {
		return this.sampleMark;
	}

	public void setSampleMark(String sampleMark) {
		this.sampleMark = sampleMark;
	}

}