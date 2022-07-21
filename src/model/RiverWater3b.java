package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the river_water_3b database table.
 * 
 */
//@Entity
@Table(name="river_water_3b")
@NamedQuery(name="RiverWater3b.findAll", query="SELECT r FROM RiverWater3b r")
public class RiverWater3b implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"5-day Biochemical Oxygen Demand (BOD5) (mg/L)\"")
	private String __day_Biochemical_Oxygen_Demand__BOD5___mg_L_;

	@Column(name="\"Aluminium (μg/L)\"")
	private String aluminium__μg_L_;

	@Column(name="\"Ammonia-nitrogen(NH3-N) (mg/L)\"")
	private String ammonia_nitrogen_NH3_N___mg_L_;

	@Column(name="\"Anionic surfactants (as Manoxol OT) (mg/L)\"")
	private String anionic_surfactants__as_Manoxol_OT___mg_L_;

	@Column(name="\"Antimony (μg/L)\"")
	private String antimony__μg_L_;

	@Column(name="\"Arsenic (μg/L)\"")
	private String arsenic__μg_L_;

	@Column(name="\"Barium (μg/L)\"")
	private String barium__μg_L_;

	@Column(name="\"Beryllium (μg/L)\"")
	private String beryllium__μg_L_;

	@Column(name="\"Boron (μg/L)\"")
	private String boron__μg_L_;

	@Column(name="\"Cadmium (μg/L)\"")
	private String cadmium__μg_L_;

	@Column(name="\"Chemical Oxygen Demand (COD) (mg/L)\"")
	private String chemical_Oxygen_Demand__COD___mg_L_;

	@Column(name="\"Chlorophyll-a  (μg/L)\"")
	private String chlorophyll_a___μg_L_;

	@Column(name="\"Chromium (μg/L)\"")
	private String chromium__μg_L_;

	@Column(name="\"Conductivity (μS/cm)\"")
	private String conductivity__μS_cm_;

	@Column(name="\"Copper (μg/L)\"")
	private String copper__μg_L_;

	@Column(name="\"Cyanide (mg/L)\"")
	private String cyanide__mg_L_;

	@Column(name="\"Dissolved Oxygen (% saturation)\"")
	private String dissolved_Oxygen____saturation_;

	@Column(name="\"Dissolved Oxygen (mg/L)\"")
	private String dissolved_Oxygen__mg_L_;

	@Column(name="\"Escherichia coli (E. coli) (cfu/100ml)\"")
	private String escherichia_coli__E__coli___cfu_100ml_;

	@Column(name="\"Faecal Coliforms (cfu/100ml)\"")
	private String faecal_Coliforms__cfu_100ml_;

	@Column(name="\"Flow (m3/s)\"")
	private String flow__m3_s_;

	@Column(name="\"Fluoride (mg/L)\"")
	private String fluoride__mg_L_;

	@Column(name="\"Free hydrogen sulphide (mg/L)\"")
	private String free_hydrogen_sulphide__mg_L_;

	@Column(name="\"Iron (μg/L)\"")
	private String iron__μg_L_;

	@Column(name="\"Lead (μg/L)\"")
	private String lead__μg_L_;

	@Column(name="\"Manganese (μg/L)\"")
	private String manganese__μg_L_;

	@Column(name="\"Mercury (μg/L)\"")
	private String mercury__μg_L_;

	@Column(name="\"Molybdate-reactive silica (mg/L)\"")
	private String molybdate_reactive_silica__mg_L_;

	@Column(name="\"Molybdenum (μg/L)\"")
	private String molybdenum__μg_L_;

	@Column(name="\"Nickel (μg/L)\"")
	private String nickel__μg_L_;

	@Column(name="\"Nitrate-nitrogen (NO3-N) (mg/L)\"")
	private String nitrate_nitrogen__NO3_N___mg_L_;

	@Column(name="\"Nitrite-nitrogen (NO2-N) (mg/L)\"")
	private String nitrite_nitrogen__NO2_N___mg_L_;

	@Column(name="\"Oil and grease (mg/L)\"")
	private String oil_and_grease__mg_L_;

	@Column(name="\"Ortho-phosphate as phosphorus (PO4-P) (mg/L)\"")
	private String ortho_phosphate_as_phosphorus__PO4_P___mg_L_;

	private String ph;

	@Column(name="\"Pheo-pigment  (μg/L)\"")
	private String pheo_pigment___μg_L_;

	private String river;

	@Column(name="\"Sample Number\"")
	private Integer sample_Number;

	@Column(name="\"Sampling Date\"")
	private Timestamp sampling_Date;

	@Column(name="\"Silver (μg/L)\"")
	private String silver__μg_L_;

	private String station;

	@Column(name="\"Sulphide (soluble & particulate) (mg/L)\"")
	private String sulphide__soluble___particulate___mg_L_;

	@Column(name="\"Suspended Solids (mg/L)\"")
	private String suspended_Solids__mg_L_;

	@Column(name="\"Thallium (μg/L)\"")
	private String thallium__μg_L_;

	@Column(name="\"Total Kjeldahl Nitrogen (soluble & particulate) (mg/L)\"")
	private String total_Kjeldahl_Nitrogen__soluble___particulate___mg_L_;

	@Column(name="\"Total Organic Carbon (TOC) (mg/L)\"")
	private String total_Organic_Carbon__TOC___mg_L_;

	@Column(name="\"Total Phosphorus (soluble & particulate) (mg/L)\"")
	private String total_Phosphorus__soluble___particulate___mg_L_;

	@Column(name="\"Total Solids (mg/L)\"")
	private String total_Solids__mg_L_;

	@Column(name="\"Total Volatile Solids (mg/L)\"")
	private String total_Volatile_Solids__mg_L_;

	@Column(name="\"Turbidity (NTU)\"")
	private String turbidity__NTU_;

	@Column(name="\"Vanadium (μg/L)\"")
	private String vanadium__μg_L_;

	@Column(name="\"Water Control Zone\"")
	private String water_Control_Zone;

	@Column(name="\"Water Temperature (°C)\"")
	private String water_Temperature___C_;

	@Column(name="\"Zinc (μg/L)\"")
	private String zinc__μg_L_;

	public RiverWater3b() {
	}

	public String get__day_Biochemical_Oxygen_Demand__BOD5___mg_L_() {
		return this.__day_Biochemical_Oxygen_Demand__BOD5___mg_L_;
	}

	public void set__day_Biochemical_Oxygen_Demand__BOD5___mg_L_(String __day_Biochemical_Oxygen_Demand__BOD5___mg_L_) {
		this.__day_Biochemical_Oxygen_Demand__BOD5___mg_L_ = __day_Biochemical_Oxygen_Demand__BOD5___mg_L_;
	}

	public String getAluminium__μg_L_() {
		return this.aluminium__μg_L_;
	}

	public void setAluminium__μg_L_(String aluminium__μg_L_) {
		this.aluminium__μg_L_ = aluminium__μg_L_;
	}

	public String getAmmonia_nitrogen_NH3_N___mg_L_() {
		return this.ammonia_nitrogen_NH3_N___mg_L_;
	}

	public void setAmmonia_nitrogen_NH3_N___mg_L_(String ammonia_nitrogen_NH3_N___mg_L_) {
		this.ammonia_nitrogen_NH3_N___mg_L_ = ammonia_nitrogen_NH3_N___mg_L_;
	}

	public String getAnionic_surfactants__as_Manoxol_OT___mg_L_() {
		return this.anionic_surfactants__as_Manoxol_OT___mg_L_;
	}

	public void setAnionic_surfactants__as_Manoxol_OT___mg_L_(String anionic_surfactants__as_Manoxol_OT___mg_L_) {
		this.anionic_surfactants__as_Manoxol_OT___mg_L_ = anionic_surfactants__as_Manoxol_OT___mg_L_;
	}

	public String getAntimony__μg_L_() {
		return this.antimony__μg_L_;
	}

	public void setAntimony__μg_L_(String antimony__μg_L_) {
		this.antimony__μg_L_ = antimony__μg_L_;
	}

	public String getArsenic__μg_L_() {
		return this.arsenic__μg_L_;
	}

	public void setArsenic__μg_L_(String arsenic__μg_L_) {
		this.arsenic__μg_L_ = arsenic__μg_L_;
	}

	public String getBarium__μg_L_() {
		return this.barium__μg_L_;
	}

	public void setBarium__μg_L_(String barium__μg_L_) {
		this.barium__μg_L_ = barium__μg_L_;
	}

	public String getBeryllium__μg_L_() {
		return this.beryllium__μg_L_;
	}

	public void setBeryllium__μg_L_(String beryllium__μg_L_) {
		this.beryllium__μg_L_ = beryllium__μg_L_;
	}

	public String getBoron__μg_L_() {
		return this.boron__μg_L_;
	}

	public void setBoron__μg_L_(String boron__μg_L_) {
		this.boron__μg_L_ = boron__μg_L_;
	}

	public String getCadmium__μg_L_() {
		return this.cadmium__μg_L_;
	}

	public void setCadmium__μg_L_(String cadmium__μg_L_) {
		this.cadmium__μg_L_ = cadmium__μg_L_;
	}

	public String getChemical_Oxygen_Demand__COD___mg_L_() {
		return this.chemical_Oxygen_Demand__COD___mg_L_;
	}

	public void setChemical_Oxygen_Demand__COD___mg_L_(String chemical_Oxygen_Demand__COD___mg_L_) {
		this.chemical_Oxygen_Demand__COD___mg_L_ = chemical_Oxygen_Demand__COD___mg_L_;
	}

	public String getChlorophyll_a___μg_L_() {
		return this.chlorophyll_a___μg_L_;
	}

	public void setChlorophyll_a___μg_L_(String chlorophyll_a___μg_L_) {
		this.chlorophyll_a___μg_L_ = chlorophyll_a___μg_L_;
	}

	public String getChromium__μg_L_() {
		return this.chromium__μg_L_;
	}

	public void setChromium__μg_L_(String chromium__μg_L_) {
		this.chromium__μg_L_ = chromium__μg_L_;
	}

	public String getConductivity__μS_cm_() {
		return this.conductivity__μS_cm_;
	}

	public void setConductivity__μS_cm_(String conductivity__μS_cm_) {
		this.conductivity__μS_cm_ = conductivity__μS_cm_;
	}

	public String getCopper__μg_L_() {
		return this.copper__μg_L_;
	}

	public void setCopper__μg_L_(String copper__μg_L_) {
		this.copper__μg_L_ = copper__μg_L_;
	}

	public String getCyanide__mg_L_() {
		return this.cyanide__mg_L_;
	}

	public void setCyanide__mg_L_(String cyanide__mg_L_) {
		this.cyanide__mg_L_ = cyanide__mg_L_;
	}

	public String getDissolved_Oxygen____saturation_() {
		return this.dissolved_Oxygen____saturation_;
	}

	public void setDissolved_Oxygen____saturation_(String dissolved_Oxygen____saturation_) {
		this.dissolved_Oxygen____saturation_ = dissolved_Oxygen____saturation_;
	}

	public String getDissolved_Oxygen__mg_L_() {
		return this.dissolved_Oxygen__mg_L_;
	}

	public void setDissolved_Oxygen__mg_L_(String dissolved_Oxygen__mg_L_) {
		this.dissolved_Oxygen__mg_L_ = dissolved_Oxygen__mg_L_;
	}

	public String getEscherichia_coli__E__coli___cfu_100ml_() {
		return this.escherichia_coli__E__coli___cfu_100ml_;
	}

	public void setEscherichia_coli__E__coli___cfu_100ml_(String escherichia_coli__E__coli___cfu_100ml_) {
		this.escherichia_coli__E__coli___cfu_100ml_ = escherichia_coli__E__coli___cfu_100ml_;
	}

	public String getFaecal_Coliforms__cfu_100ml_() {
		return this.faecal_Coliforms__cfu_100ml_;
	}

	public void setFaecal_Coliforms__cfu_100ml_(String faecal_Coliforms__cfu_100ml_) {
		this.faecal_Coliforms__cfu_100ml_ = faecal_Coliforms__cfu_100ml_;
	}

	public String getFlow__m3_s_() {
		return this.flow__m3_s_;
	}

	public void setFlow__m3_s_(String flow__m3_s_) {
		this.flow__m3_s_ = flow__m3_s_;
	}

	public String getFluoride__mg_L_() {
		return this.fluoride__mg_L_;
	}

	public void setFluoride__mg_L_(String fluoride__mg_L_) {
		this.fluoride__mg_L_ = fluoride__mg_L_;
	}

	public String getFree_hydrogen_sulphide__mg_L_() {
		return this.free_hydrogen_sulphide__mg_L_;
	}

	public void setFree_hydrogen_sulphide__mg_L_(String free_hydrogen_sulphide__mg_L_) {
		this.free_hydrogen_sulphide__mg_L_ = free_hydrogen_sulphide__mg_L_;
	}

	public String getIron__μg_L_() {
		return this.iron__μg_L_;
	}

	public void setIron__μg_L_(String iron__μg_L_) {
		this.iron__μg_L_ = iron__μg_L_;
	}

	public String getLead__μg_L_() {
		return this.lead__μg_L_;
	}

	public void setLead__μg_L_(String lead__μg_L_) {
		this.lead__μg_L_ = lead__μg_L_;
	}

	public String getManganese__μg_L_() {
		return this.manganese__μg_L_;
	}

	public void setManganese__μg_L_(String manganese__μg_L_) {
		this.manganese__μg_L_ = manganese__μg_L_;
	}

	public String getMercury__μg_L_() {
		return this.mercury__μg_L_;
	}

	public void setMercury__μg_L_(String mercury__μg_L_) {
		this.mercury__μg_L_ = mercury__μg_L_;
	}

	public String getMolybdate_reactive_silica__mg_L_() {
		return this.molybdate_reactive_silica__mg_L_;
	}

	public void setMolybdate_reactive_silica__mg_L_(String molybdate_reactive_silica__mg_L_) {
		this.molybdate_reactive_silica__mg_L_ = molybdate_reactive_silica__mg_L_;
	}

	public String getMolybdenum__μg_L_() {
		return this.molybdenum__μg_L_;
	}

	public void setMolybdenum__μg_L_(String molybdenum__μg_L_) {
		this.molybdenum__μg_L_ = molybdenum__μg_L_;
	}

	public String getNickel__μg_L_() {
		return this.nickel__μg_L_;
	}

	public void setNickel__μg_L_(String nickel__μg_L_) {
		this.nickel__μg_L_ = nickel__μg_L_;
	}

	public String getNitrate_nitrogen__NO3_N___mg_L_() {
		return this.nitrate_nitrogen__NO3_N___mg_L_;
	}

	public void setNitrate_nitrogen__NO3_N___mg_L_(String nitrate_nitrogen__NO3_N___mg_L_) {
		this.nitrate_nitrogen__NO3_N___mg_L_ = nitrate_nitrogen__NO3_N___mg_L_;
	}

	public String getNitrite_nitrogen__NO2_N___mg_L_() {
		return this.nitrite_nitrogen__NO2_N___mg_L_;
	}

	public void setNitrite_nitrogen__NO2_N___mg_L_(String nitrite_nitrogen__NO2_N___mg_L_) {
		this.nitrite_nitrogen__NO2_N___mg_L_ = nitrite_nitrogen__NO2_N___mg_L_;
	}

	public String getOil_and_grease__mg_L_() {
		return this.oil_and_grease__mg_L_;
	}

	public void setOil_and_grease__mg_L_(String oil_and_grease__mg_L_) {
		this.oil_and_grease__mg_L_ = oil_and_grease__mg_L_;
	}

	public String getOrtho_phosphate_as_phosphorus__PO4_P___mg_L_() {
		return this.ortho_phosphate_as_phosphorus__PO4_P___mg_L_;
	}

	public void setOrtho_phosphate_as_phosphorus__PO4_P___mg_L_(String ortho_phosphate_as_phosphorus__PO4_P___mg_L_) {
		this.ortho_phosphate_as_phosphorus__PO4_P___mg_L_ = ortho_phosphate_as_phosphorus__PO4_P___mg_L_;
	}

	public String getPh() {
		return this.ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}

	public String getPheo_pigment___μg_L_() {
		return this.pheo_pigment___μg_L_;
	}

	public void setPheo_pigment___μg_L_(String pheo_pigment___μg_L_) {
		this.pheo_pigment___μg_L_ = pheo_pigment___μg_L_;
	}

	public String getRiver() {
		return this.river;
	}

	public void setRiver(String river) {
		this.river = river;
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

	public String getSilver__μg_L_() {
		return this.silver__μg_L_;
	}

	public void setSilver__μg_L_(String silver__μg_L_) {
		this.silver__μg_L_ = silver__μg_L_;
	}

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getSulphide__soluble___particulate___mg_L_() {
		return this.sulphide__soluble___particulate___mg_L_;
	}

	public void setSulphide__soluble___particulate___mg_L_(String sulphide__soluble___particulate___mg_L_) {
		this.sulphide__soluble___particulate___mg_L_ = sulphide__soluble___particulate___mg_L_;
	}

	public String getSuspended_Solids__mg_L_() {
		return this.suspended_Solids__mg_L_;
	}

	public void setSuspended_Solids__mg_L_(String suspended_Solids__mg_L_) {
		this.suspended_Solids__mg_L_ = suspended_Solids__mg_L_;
	}

	public String getThallium__μg_L_() {
		return this.thallium__μg_L_;
	}

	public void setThallium__μg_L_(String thallium__μg_L_) {
		this.thallium__μg_L_ = thallium__μg_L_;
	}

	public String getTotal_Kjeldahl_Nitrogen__soluble___particulate___mg_L_() {
		return this.total_Kjeldahl_Nitrogen__soluble___particulate___mg_L_;
	}

	public void setTotal_Kjeldahl_Nitrogen__soluble___particulate___mg_L_(String total_Kjeldahl_Nitrogen__soluble___particulate___mg_L_) {
		this.total_Kjeldahl_Nitrogen__soluble___particulate___mg_L_ = total_Kjeldahl_Nitrogen__soluble___particulate___mg_L_;
	}

	public String getTotal_Organic_Carbon__TOC___mg_L_() {
		return this.total_Organic_Carbon__TOC___mg_L_;
	}

	public void setTotal_Organic_Carbon__TOC___mg_L_(String total_Organic_Carbon__TOC___mg_L_) {
		this.total_Organic_Carbon__TOC___mg_L_ = total_Organic_Carbon__TOC___mg_L_;
	}

	public String getTotal_Phosphorus__soluble___particulate___mg_L_() {
		return this.total_Phosphorus__soluble___particulate___mg_L_;
	}

	public void setTotal_Phosphorus__soluble___particulate___mg_L_(String total_Phosphorus__soluble___particulate___mg_L_) {
		this.total_Phosphorus__soluble___particulate___mg_L_ = total_Phosphorus__soluble___particulate___mg_L_;
	}

	public String getTotal_Solids__mg_L_() {
		return this.total_Solids__mg_L_;
	}

	public void setTotal_Solids__mg_L_(String total_Solids__mg_L_) {
		this.total_Solids__mg_L_ = total_Solids__mg_L_;
	}

	public String getTotal_Volatile_Solids__mg_L_() {
		return this.total_Volatile_Solids__mg_L_;
	}

	public void setTotal_Volatile_Solids__mg_L_(String total_Volatile_Solids__mg_L_) {
		this.total_Volatile_Solids__mg_L_ = total_Volatile_Solids__mg_L_;
	}

	public String getTurbidity__NTU_() {
		return this.turbidity__NTU_;
	}

	public void setTurbidity__NTU_(String turbidity__NTU_) {
		this.turbidity__NTU_ = turbidity__NTU_;
	}

	public String getVanadium__μg_L_() {
		return this.vanadium__μg_L_;
	}

	public void setVanadium__μg_L_(String vanadium__μg_L_) {
		this.vanadium__μg_L_ = vanadium__μg_L_;
	}

	public String getWater_Control_Zone() {
		return this.water_Control_Zone;
	}

	public void setWater_Control_Zone(String water_Control_Zone) {
		this.water_Control_Zone = water_Control_Zone;
	}

	public String getWater_Temperature___C_() {
		return this.water_Temperature___C_;
	}

	public void setWater_Temperature___C_(String water_Temperature___C_) {
		this.water_Temperature___C_ = water_Temperature___C_;
	}

	public String getZinc__μg_L_() {
		return this.zinc__μg_L_;
	}

	public void setZinc__μg_L_(String zinc__μg_L_) {
		this.zinc__μg_L_ = zinc__μg_L_;
	}

}