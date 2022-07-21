package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the river_water_ecd1 database table.
 * 
 */
//@Entity
@Table(name="river_water_ecd1")
@NamedQuery(name="RiverWaterEcd1.findAll", query="SELECT r FROM RiverWaterEcd1 r")
public class RiverWaterEcd1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"5-day Biochemical Oxygen Demand (BOD5) (mg/L)\"")
	private BigDecimal __day_Biochemical_Oxygen_Demand__BOD5___mg_L_;

	@Column(name="\"Aluminium (μg/L)\"")
	private BigDecimal aluminium__μg_L_;

	@Column(name="\"Ammonia-nitrogen(NH3-N) (mg/L)\"")
	private BigDecimal ammonia_nitrogen_NH3_N___mg_L_;

	@Column(name="\"Anionic surfactants (as Manoxol OT) (mg/L)\"")
	private BigDecimal anionic_surfactants__as_Manoxol_OT___mg_L_;

	@Column(name="\"Antimony (μg/L)\"")
	private BigDecimal antimony__μg_L_;

	@Column(name="\"Arsenic (μg/L)\"")
	private BigDecimal arsenic__μg_L_;

	@Column(name="\"Barium (μg/L)\"")
	private BigDecimal barium__μg_L_;

	@Column(name="\"Beryllium (μg/L)\"")
	private BigDecimal beryllium__μg_L_;

	@Column(name="\"Boron (μg/L)\"")
	private BigDecimal boron__μg_L_;

	@Column(name="\"Cadmium (μg/L)\"")
	private BigDecimal cadmium__μg_L_;

	@Column(name="\"Chemical Oxygen Demand (COD) (mg/L)\"")
	private BigDecimal chemical_Oxygen_Demand__COD___mg_L_;

	@Column(name="\"Chlorophyll-a  (μg/L)\"")
	private BigDecimal chlorophyll_a___μg_L_;

	@Column(name="\"Chromium (μg/L)\"")
	private BigDecimal chromium__μg_L_;

	@Column(name="\"Conductivity (μS/cm)\"")
	private BigDecimal conductivity__μS_cm_;

	@Column(name="\"Copper (μg/L)\"")
	private BigDecimal copper__μg_L_;

	@Column(name="\"Cyanide (mg/L)\"")
	private BigDecimal cyanide__mg_L_;

	@Column(name="\"Dissolved Oxygen (% saturation)\"")
	private BigDecimal dissolved_Oxygen____saturation_;

	@Column(name="\"Dissolved Oxygen (mg/L)\"")
	private BigDecimal dissolved_Oxygen__mg_L_;

	@Column(name="\"Faecal Coliforms (cfu/100ml)\"")
	private BigDecimal faecal_Coliforms__cfu_100ml_;

	@Column(name="\"Flow (m3/s)\"")
	private BigDecimal flow__m3_s_;

	@Column(name="\"Fluoride (mg/L)\"")
	private BigDecimal fluoride__mg_L_;

	@Column(name="\"Free hydrogen sulphide (mg/L)\"")
	private BigDecimal free_hydrogen_sulphide__mg_L_;

	@Column(name="\"Iron (μg/L)\"")
	private BigDecimal iron__μg_L_;

	@Column(name="\"Lead (μg/L)\"")
	private BigDecimal lead__μg_L_;

	@Column(name="\"Manganese (μg/L)\"")
	private BigDecimal manganese__μg_L_;

	@Column(name="\"Mercury (μg/L)\"")
	private BigDecimal mercury__μg_L_;

	@Column(name="\"Molybdate-reactive silica (mg/L)\"")
	private BigDecimal molybdate_reactive_silica__mg_L_;

	@Column(name="\"Molybdenum (μg/L)\"")
	private BigDecimal molybdenum__μg_L_;

	private String month;

	@Column(name="\"Nickel (μg/L)\"")
	private BigDecimal nickel__μg_L_;

	@Column(name="\"Nitrate-nitrogen (NO3-N) (mg/L)\"")
	private BigDecimal nitrate_nitrogen__NO3_N___mg_L_;

	@Column(name="\"Nitrite-nitrogen (NO2-N) (mg/L)\"")
	private BigDecimal nitrite_nitrogen__NO2_N___mg_L_;

	@Column(name="\"Oil and grease (mg/L)\"")
	private BigDecimal oil_and_grease__mg_L_;

	@Column(name="\"Ortho-phosphate as phosphorus (PO4-P) (mg/L)\"")
	private BigDecimal ortho_phosphate_as_phosphorus__PO4_P___mg_L_;

	private BigDecimal ph;

	@Column(name="\"Pheo-pigment  (μg/L)\"")
	private BigDecimal pheo_pigment___μg_L_;

	private String river;

	private String ro;

	@Column(name="\"Sample Number\"")
	private Integer sample_Number;

	@Column(name="\"Sampling Date\"")
	private Timestamp sampling_Date;

	@Column(name="\"Silver (μg/L)\"")
	private BigDecimal silver__μg_L_;

	private String station;

	@Column(name="\"Sulphide (soluble & particulate) (mg/L)\"")
	private BigDecimal sulphide__soluble___particulate___mg_L_;

	@Column(name="\"Suspended Solids (mg/L)\"")
	private BigDecimal suspended_Solids__mg_L_;

	@Column(name="\"Thallium (μg/L)\"")
	private BigDecimal thallium__μg_L_;

	@Column(name="\"Total Kjeldahl Nitrogen (soluble & particulate) (mg/L)\"")
	private BigDecimal total_Kjeldahl_Nitrogen__soluble___particulate___mg_L_;

	@Column(name="\"Total Organic Carbon (TOC) (mg/L)\"")
	private BigDecimal total_Organic_Carbon__TOC___mg_L_;

	@Column(name="\"Total Phosphorus (soluble & particulate) (mg/L)\"")
	private BigDecimal total_Phosphorus__soluble___particulate___mg_L_;

	@Column(name="\"Total Solids (mg/L)\"")
	private BigDecimal total_Solids__mg_L_;

	@Column(name="\"Total Volatile Solids (mg/L)\"")
	private BigDecimal total_Volatile_Solids__mg_L_;

	@Column(name="\"Total WQI Point\"")
	private BigDecimal total_WQI_Point;

	@Column(name="\"Turbidity (NTU)\"")
	private BigDecimal turbidity__NTU_;

	@Column(name="\"Vanadium (μg/L)\"")
	private BigDecimal vanadium__μg_L_;

	@Column(name="\"Water Temperature (°C)\"")
	private BigDecimal water_Temperature___C_;

	private String wcz;

	@Column(name="\"WQI Grade\"")
	private String WQI_Grade;

	@Column(name="\"WQI point awarded from BOD5\"")
	private BigDecimal WQI_point_awarded_from_BOD5;

	@Column(name="\"WQI point awarded from DO\"")
	private BigDecimal WQI_point_awarded_from_DO;

	@Column(name="\"WQI point awarded from NH4\"")
	private BigDecimal WQI_point_awarded_from_NH4;

	@Column(name="\"Zinc (μg/L)\"")
	private BigDecimal zinc__μg_L_;

	public RiverWaterEcd1() {
	}

	public BigDecimal get__day_Biochemical_Oxygen_Demand__BOD5___mg_L_() {
		return this.__day_Biochemical_Oxygen_Demand__BOD5___mg_L_;
	}

	public void set__day_Biochemical_Oxygen_Demand__BOD5___mg_L_(BigDecimal __day_Biochemical_Oxygen_Demand__BOD5___mg_L_) {
		this.__day_Biochemical_Oxygen_Demand__BOD5___mg_L_ = __day_Biochemical_Oxygen_Demand__BOD5___mg_L_;
	}

	public BigDecimal getAluminium__μg_L_() {
		return this.aluminium__μg_L_;
	}

	public void setAluminium__μg_L_(BigDecimal aluminium__μg_L_) {
		this.aluminium__μg_L_ = aluminium__μg_L_;
	}

	public BigDecimal getAmmonia_nitrogen_NH3_N___mg_L_() {
		return this.ammonia_nitrogen_NH3_N___mg_L_;
	}

	public void setAmmonia_nitrogen_NH3_N___mg_L_(BigDecimal ammonia_nitrogen_NH3_N___mg_L_) {
		this.ammonia_nitrogen_NH3_N___mg_L_ = ammonia_nitrogen_NH3_N___mg_L_;
	}

	public BigDecimal getAnionic_surfactants__as_Manoxol_OT___mg_L_() {
		return this.anionic_surfactants__as_Manoxol_OT___mg_L_;
	}

	public void setAnionic_surfactants__as_Manoxol_OT___mg_L_(BigDecimal anionic_surfactants__as_Manoxol_OT___mg_L_) {
		this.anionic_surfactants__as_Manoxol_OT___mg_L_ = anionic_surfactants__as_Manoxol_OT___mg_L_;
	}

	public BigDecimal getAntimony__μg_L_() {
		return this.antimony__μg_L_;
	}

	public void setAntimony__μg_L_(BigDecimal antimony__μg_L_) {
		this.antimony__μg_L_ = antimony__μg_L_;
	}

	public BigDecimal getArsenic__μg_L_() {
		return this.arsenic__μg_L_;
	}

	public void setArsenic__μg_L_(BigDecimal arsenic__μg_L_) {
		this.arsenic__μg_L_ = arsenic__μg_L_;
	}

	public BigDecimal getBarium__μg_L_() {
		return this.barium__μg_L_;
	}

	public void setBarium__μg_L_(BigDecimal barium__μg_L_) {
		this.barium__μg_L_ = barium__μg_L_;
	}

	public BigDecimal getBeryllium__μg_L_() {
		return this.beryllium__μg_L_;
	}

	public void setBeryllium__μg_L_(BigDecimal beryllium__μg_L_) {
		this.beryllium__μg_L_ = beryllium__μg_L_;
	}

	public BigDecimal getBoron__μg_L_() {
		return this.boron__μg_L_;
	}

	public void setBoron__μg_L_(BigDecimal boron__μg_L_) {
		this.boron__μg_L_ = boron__μg_L_;
	}

	public BigDecimal getCadmium__μg_L_() {
		return this.cadmium__μg_L_;
	}

	public void setCadmium__μg_L_(BigDecimal cadmium__μg_L_) {
		this.cadmium__μg_L_ = cadmium__μg_L_;
	}

	public BigDecimal getChemical_Oxygen_Demand__COD___mg_L_() {
		return this.chemical_Oxygen_Demand__COD___mg_L_;
	}

	public void setChemical_Oxygen_Demand__COD___mg_L_(BigDecimal chemical_Oxygen_Demand__COD___mg_L_) {
		this.chemical_Oxygen_Demand__COD___mg_L_ = chemical_Oxygen_Demand__COD___mg_L_;
	}

	public BigDecimal getChlorophyll_a___μg_L_() {
		return this.chlorophyll_a___μg_L_;
	}

	public void setChlorophyll_a___μg_L_(BigDecimal chlorophyll_a___μg_L_) {
		this.chlorophyll_a___μg_L_ = chlorophyll_a___μg_L_;
	}

	public BigDecimal getChromium__μg_L_() {
		return this.chromium__μg_L_;
	}

	public void setChromium__μg_L_(BigDecimal chromium__μg_L_) {
		this.chromium__μg_L_ = chromium__μg_L_;
	}

	public BigDecimal getConductivity__μS_cm_() {
		return this.conductivity__μS_cm_;
	}

	public void setConductivity__μS_cm_(BigDecimal conductivity__μS_cm_) {
		this.conductivity__μS_cm_ = conductivity__μS_cm_;
	}

	public BigDecimal getCopper__μg_L_() {
		return this.copper__μg_L_;
	}

	public void setCopper__μg_L_(BigDecimal copper__μg_L_) {
		this.copper__μg_L_ = copper__μg_L_;
	}

	public BigDecimal getCyanide__mg_L_() {
		return this.cyanide__mg_L_;
	}

	public void setCyanide__mg_L_(BigDecimal cyanide__mg_L_) {
		this.cyanide__mg_L_ = cyanide__mg_L_;
	}

	public BigDecimal getDissolved_Oxygen____saturation_() {
		return this.dissolved_Oxygen____saturation_;
	}

	public void setDissolved_Oxygen____saturation_(BigDecimal dissolved_Oxygen____saturation_) {
		this.dissolved_Oxygen____saturation_ = dissolved_Oxygen____saturation_;
	}

	public BigDecimal getDissolved_Oxygen__mg_L_() {
		return this.dissolved_Oxygen__mg_L_;
	}

	public void setDissolved_Oxygen__mg_L_(BigDecimal dissolved_Oxygen__mg_L_) {
		this.dissolved_Oxygen__mg_L_ = dissolved_Oxygen__mg_L_;
	}

	public BigDecimal getFaecal_Coliforms__cfu_100ml_() {
		return this.faecal_Coliforms__cfu_100ml_;
	}

	public void setFaecal_Coliforms__cfu_100ml_(BigDecimal faecal_Coliforms__cfu_100ml_) {
		this.faecal_Coliforms__cfu_100ml_ = faecal_Coliforms__cfu_100ml_;
	}

	public BigDecimal getFlow__m3_s_() {
		return this.flow__m3_s_;
	}

	public void setFlow__m3_s_(BigDecimal flow__m3_s_) {
		this.flow__m3_s_ = flow__m3_s_;
	}

	public BigDecimal getFluoride__mg_L_() {
		return this.fluoride__mg_L_;
	}

	public void setFluoride__mg_L_(BigDecimal fluoride__mg_L_) {
		this.fluoride__mg_L_ = fluoride__mg_L_;
	}

	public BigDecimal getFree_hydrogen_sulphide__mg_L_() {
		return this.free_hydrogen_sulphide__mg_L_;
	}

	public void setFree_hydrogen_sulphide__mg_L_(BigDecimal free_hydrogen_sulphide__mg_L_) {
		this.free_hydrogen_sulphide__mg_L_ = free_hydrogen_sulphide__mg_L_;
	}

	public BigDecimal getIron__μg_L_() {
		return this.iron__μg_L_;
	}

	public void setIron__μg_L_(BigDecimal iron__μg_L_) {
		this.iron__μg_L_ = iron__μg_L_;
	}

	public BigDecimal getLead__μg_L_() {
		return this.lead__μg_L_;
	}

	public void setLead__μg_L_(BigDecimal lead__μg_L_) {
		this.lead__μg_L_ = lead__μg_L_;
	}

	public BigDecimal getManganese__μg_L_() {
		return this.manganese__μg_L_;
	}

	public void setManganese__μg_L_(BigDecimal manganese__μg_L_) {
		this.manganese__μg_L_ = manganese__μg_L_;
	}

	public BigDecimal getMercury__μg_L_() {
		return this.mercury__μg_L_;
	}

	public void setMercury__μg_L_(BigDecimal mercury__μg_L_) {
		this.mercury__μg_L_ = mercury__μg_L_;
	}

	public BigDecimal getMolybdate_reactive_silica__mg_L_() {
		return this.molybdate_reactive_silica__mg_L_;
	}

	public void setMolybdate_reactive_silica__mg_L_(BigDecimal molybdate_reactive_silica__mg_L_) {
		this.molybdate_reactive_silica__mg_L_ = molybdate_reactive_silica__mg_L_;
	}

	public BigDecimal getMolybdenum__μg_L_() {
		return this.molybdenum__μg_L_;
	}

	public void setMolybdenum__μg_L_(BigDecimal molybdenum__μg_L_) {
		this.molybdenum__μg_L_ = molybdenum__μg_L_;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public BigDecimal getNickel__μg_L_() {
		return this.nickel__μg_L_;
	}

	public void setNickel__μg_L_(BigDecimal nickel__μg_L_) {
		this.nickel__μg_L_ = nickel__μg_L_;
	}

	public BigDecimal getNitrate_nitrogen__NO3_N___mg_L_() {
		return this.nitrate_nitrogen__NO3_N___mg_L_;
	}

	public void setNitrate_nitrogen__NO3_N___mg_L_(BigDecimal nitrate_nitrogen__NO3_N___mg_L_) {
		this.nitrate_nitrogen__NO3_N___mg_L_ = nitrate_nitrogen__NO3_N___mg_L_;
	}

	public BigDecimal getNitrite_nitrogen__NO2_N___mg_L_() {
		return this.nitrite_nitrogen__NO2_N___mg_L_;
	}

	public void setNitrite_nitrogen__NO2_N___mg_L_(BigDecimal nitrite_nitrogen__NO2_N___mg_L_) {
		this.nitrite_nitrogen__NO2_N___mg_L_ = nitrite_nitrogen__NO2_N___mg_L_;
	}

	public BigDecimal getOil_and_grease__mg_L_() {
		return this.oil_and_grease__mg_L_;
	}

	public void setOil_and_grease__mg_L_(BigDecimal oil_and_grease__mg_L_) {
		this.oil_and_grease__mg_L_ = oil_and_grease__mg_L_;
	}

	public BigDecimal getOrtho_phosphate_as_phosphorus__PO4_P___mg_L_() {
		return this.ortho_phosphate_as_phosphorus__PO4_P___mg_L_;
	}

	public void setOrtho_phosphate_as_phosphorus__PO4_P___mg_L_(BigDecimal ortho_phosphate_as_phosphorus__PO4_P___mg_L_) {
		this.ortho_phosphate_as_phosphorus__PO4_P___mg_L_ = ortho_phosphate_as_phosphorus__PO4_P___mg_L_;
	}

	public BigDecimal getPh() {
		return this.ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public BigDecimal getPheo_pigment___μg_L_() {
		return this.pheo_pigment___μg_L_;
	}

	public void setPheo_pigment___μg_L_(BigDecimal pheo_pigment___μg_L_) {
		this.pheo_pigment___μg_L_ = pheo_pigment___μg_L_;
	}

	public String getRiver() {
		return this.river;
	}

	public void setRiver(String river) {
		this.river = river;
	}

	public String getRo() {
		return this.ro;
	}

	public void setRo(String ro) {
		this.ro = ro;
	}

	public Integer getSample_Number() {
		return this.sample_Number;
	}

	public void setSample_Number(Integer sample_Number) {
		this.sample_Number = sample_Number;
	}

	public Timestamp getSampling_Date() {
		return this.sampling_Date;
	}

	public void setSampling_Date(Timestamp sampling_Date) {
		this.sampling_Date = sampling_Date;
	}

	public BigDecimal getSilver__μg_L_() {
		return this.silver__μg_L_;
	}

	public void setSilver__μg_L_(BigDecimal silver__μg_L_) {
		this.silver__μg_L_ = silver__μg_L_;
	}

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public BigDecimal getSulphide__soluble___particulate___mg_L_() {
		return this.sulphide__soluble___particulate___mg_L_;
	}

	public void setSulphide__soluble___particulate___mg_L_(BigDecimal sulphide__soluble___particulate___mg_L_) {
		this.sulphide__soluble___particulate___mg_L_ = sulphide__soluble___particulate___mg_L_;
	}

	public BigDecimal getSuspended_Solids__mg_L_() {
		return this.suspended_Solids__mg_L_;
	}

	public void setSuspended_Solids__mg_L_(BigDecimal suspended_Solids__mg_L_) {
		this.suspended_Solids__mg_L_ = suspended_Solids__mg_L_;
	}

	public BigDecimal getThallium__μg_L_() {
		return this.thallium__μg_L_;
	}

	public void setThallium__μg_L_(BigDecimal thallium__μg_L_) {
		this.thallium__μg_L_ = thallium__μg_L_;
	}

	public BigDecimal getTotal_Kjeldahl_Nitrogen__soluble___particulate___mg_L_() {
		return this.total_Kjeldahl_Nitrogen__soluble___particulate___mg_L_;
	}

	public void setTotal_Kjeldahl_Nitrogen__soluble___particulate___mg_L_(BigDecimal total_Kjeldahl_Nitrogen__soluble___particulate___mg_L_) {
		this.total_Kjeldahl_Nitrogen__soluble___particulate___mg_L_ = total_Kjeldahl_Nitrogen__soluble___particulate___mg_L_;
	}

	public BigDecimal getTotal_Organic_Carbon__TOC___mg_L_() {
		return this.total_Organic_Carbon__TOC___mg_L_;
	}

	public void setTotal_Organic_Carbon__TOC___mg_L_(BigDecimal total_Organic_Carbon__TOC___mg_L_) {
		this.total_Organic_Carbon__TOC___mg_L_ = total_Organic_Carbon__TOC___mg_L_;
	}

	public BigDecimal getTotal_Phosphorus__soluble___particulate___mg_L_() {
		return this.total_Phosphorus__soluble___particulate___mg_L_;
	}

	public void setTotal_Phosphorus__soluble___particulate___mg_L_(BigDecimal total_Phosphorus__soluble___particulate___mg_L_) {
		this.total_Phosphorus__soluble___particulate___mg_L_ = total_Phosphorus__soluble___particulate___mg_L_;
	}

	public BigDecimal getTotal_Solids__mg_L_() {
		return this.total_Solids__mg_L_;
	}

	public void setTotal_Solids__mg_L_(BigDecimal total_Solids__mg_L_) {
		this.total_Solids__mg_L_ = total_Solids__mg_L_;
	}

	public BigDecimal getTotal_Volatile_Solids__mg_L_() {
		return this.total_Volatile_Solids__mg_L_;
	}

	public void setTotal_Volatile_Solids__mg_L_(BigDecimal total_Volatile_Solids__mg_L_) {
		this.total_Volatile_Solids__mg_L_ = total_Volatile_Solids__mg_L_;
	}

	public BigDecimal getTotal_WQI_Point() {
		return this.total_WQI_Point;
	}

	public void setTotal_WQI_Point(BigDecimal total_WQI_Point) {
		this.total_WQI_Point = total_WQI_Point;
	}

	public BigDecimal getTurbidity__NTU_() {
		return this.turbidity__NTU_;
	}

	public void setTurbidity__NTU_(BigDecimal turbidity__NTU_) {
		this.turbidity__NTU_ = turbidity__NTU_;
	}

	public BigDecimal getVanadium__μg_L_() {
		return this.vanadium__μg_L_;
	}

	public void setVanadium__μg_L_(BigDecimal vanadium__μg_L_) {
		this.vanadium__μg_L_ = vanadium__μg_L_;
	}

	public BigDecimal getWater_Temperature___C_() {
		return this.water_Temperature___C_;
	}

	public void setWater_Temperature___C_(BigDecimal water_Temperature___C_) {
		this.water_Temperature___C_ = water_Temperature___C_;
	}

	public String getWcz() {
		return this.wcz;
	}

	public void setWcz(String wcz) {
		this.wcz = wcz;
	}

	public String getWQI_Grade() {
		return this.WQI_Grade;
	}

	public void setWQI_Grade(String WQI_Grade) {
		this.WQI_Grade = WQI_Grade;
	}

	public BigDecimal getWQI_point_awarded_from_BOD5() {
		return this.WQI_point_awarded_from_BOD5;
	}

	public void setWQI_point_awarded_from_BOD5(BigDecimal WQI_point_awarded_from_BOD5) {
		this.WQI_point_awarded_from_BOD5 = WQI_point_awarded_from_BOD5;
	}

	public BigDecimal getWQI_point_awarded_from_DO() {
		return this.WQI_point_awarded_from_DO;
	}

	public void setWQI_point_awarded_from_DO(BigDecimal WQI_point_awarded_from_DO) {
		this.WQI_point_awarded_from_DO = WQI_point_awarded_from_DO;
	}

	public BigDecimal getWQI_point_awarded_from_NH4() {
		return this.WQI_point_awarded_from_NH4;
	}

	public void setWQI_point_awarded_from_NH4(BigDecimal WQI_point_awarded_from_NH4) {
		this.WQI_point_awarded_from_NH4 = WQI_point_awarded_from_NH4;
	}

	public BigDecimal getZinc__μg_L_() {
		return this.zinc__μg_L_;
	}

	public void setZinc__μg_L_(BigDecimal zinc__μg_L_) {
		this.zinc__μg_L_ = zinc__μg_L_;
	}

}