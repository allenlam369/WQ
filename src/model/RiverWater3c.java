package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the river_water_3c database table.
 * 
 */
//@Entity
@Table(name="river_water_3c")
@NamedQuery(name="RiverWater3c.findAll", query="SELECT r FROM RiverWater3c r")
public class RiverWater3c implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"五天生化需氧量 (毫克/公升)\"")
	private String 五天生化需氧量__毫克_公升_;

	@Column(name="\"亞硝酸鹽氮 (毫克/公升)\"")
	private String 亞硝酸鹽氮__毫克_公升_;

	@Column(name="\"傳電性 (μS/cm)\"")
	private String 傳電性__μS_cm_;

	@Column(name="\"凱氏氮 (可溶及粒子) (毫克/公升)\"")
	private String 凱氏氮__可溶及粒子___毫克_公升_;

	@Column(name="\"化學需氧量 (毫克/公升)\"")
	private String 化學需氧量__毫克_公升_;

	@Column(name="\"大腸桿菌 (個/100毫升)\"")
	private String 大腸桿菌__個_100毫升_;

	@Column(name="\"大腸細菌群 (個/100毫升)\"")
	private String 大腸細菌群__個_100毫升_;

	private Timestamp 日期;

	private Integer 樣本;

	@Column(name="\"正磷酸鹽磷 (毫克/公升)\"")
	private String 正磷酸鹽磷__毫克_公升_;

	@Column(name="\"氟化物 (毫克/公升)\"")
	private String 氟化物__毫克_公升_;

	@Column(name="\"氨氮 (毫克/公升)\"")
	private String 氨氮__毫克_公升_;

	@Column(name="\"氰化物總量 (毫克/公升)\"")
	private String 氰化物總量__毫克_公升_;

	@Column(name="\"水溫 (攝氏)\"")
	private String 水溫__攝氏_;

	private String 水質管制區;

	@Column(name="\"汞 (微克/公升)\"")
	private String 汞__微克_公升_;

	private String 河溪;

	@Column(name="\"油脂 (毫克/公升)\"")
	private String 油脂__毫克_公升_;

	@Column(name="\"活性硅酸鹽 (毫克/公升)\"")
	private String 活性硅酸鹽__毫克_公升_;

	@Column(name="\"流量 (立方公尺/秒)\"")
	private String 流量__立方公尺_秒_;

	@Column(name="\"混濁度 (NTU)\"")
	private String 混濁度__ntu_;

	@Column(name="\"游離硫化氫 (毫克/公升)\"")
	private String 游離硫化氫__毫克_公升_;

	@Column(name="\"溶解氧 (毫克/公升)\"")
	private String 溶解氧__毫克_公升_;

	@Column(name="\"溶解氧飽和百分率 (百分率)\"")
	private String 溶解氧飽和百分率__百分率_;

	private String 監測站;

	@Column(name="\"砷 (微克/公升)\"")
	private String 砷__微克_公升_;

	@Column(name="\"硝酸鹽氮 (毫克/公升)\"")
	private String 硝酸鹽氮__毫克_公升_;

	@Column(name="\"硫化物 (可溶及粒子) (毫克/公升)\"")
	private String 硫化物__可溶及粒子___毫克_公升_;

	@Column(name="\"硼 (微克/公升)\"")
	private String 硼__微克_公升_;

	@Column(name="\"總固體量 (毫克/公升)\"")
	private String 總固體量__毫克_公升_;

	@Column(name="\"總懸浮固體 (毫克/公升)\"")
	private String 總懸浮固體__毫克_公升_;

	@Column(name="\"總揮發性固體量 (毫克/公升)\"")
	private String 總揮發性固體量__毫克_公升_;

	@Column(name="\"總有機碳量 (毫克/公升)\"")
	private String 總有機碳量__毫克_公升_;

	@Column(name="\"總磷量 (可溶及粒子) (毫克/公升)\"")
	private String 總磷量__可溶及粒子___毫克_公升_;

	@Column(name="\"脫鎂色素 (微克/升)\"")
	private String 脫鎂色素__微克_升_;

	@Column(name="\"葉綠素-a (微克/升)\"")
	private String 葉綠素_a__微克_升_;

	@Column(name="\"酸鹼值 (pH值)\"")
	private String 酸鹼值__pH值_;

	@Column(name="\"釩 (微克/公升)\"")
	private String 釩__微克_公升_;

	@Column(name="\"鈹 (微克/公升)\"")
	private String 鈹__微克_公升_;

	@Column(name="\"鉈 (微克/公升)\"")
	private String 鉈__微克_公升_;

	@Column(name="\"鉛 (微克/公升)\"")
	private String 鉛__微克_公升_;

	@Column(name="\"鉬 (微克/公升)\"")
	private String 鉬__微克_公升_;

	@Column(name="\"鉻 (微克/公升)\"")
	private String 鉻__微克_公升_;

	@Column(name="\"銀 (微克/公升)\"")
	private String 銀__微克_公升_;

	@Column(name="\"銅 (微克/公升)\"")
	private String 銅__微克_公升_;

	@Column(name="\"銻 (微克/公升)\"")
	private String 銻__微克_公升_;

	@Column(name="\"鋁 (微克/公升)\"")
	private String 鋁__微克_公升_;

	@Column(name="\"鋅 (微克/公升)\"")
	private String 鋅__微克_公升_;

	@Column(name="\"鋇 (微克/公升)\"")
	private String 鋇__微克_公升_;

	@Column(name="\"錳 (微克/公升)\"")
	private String 錳__微克_公升_;

	@Column(name="\"鎘 (微克/公升)\"")
	private String 鎘__微克_公升_;

	@Column(name="\"鎳 (微克/公升)\"")
	private String 鎳__微克_公升_;

	@Column(name="\"鐵 (微克/公升)\"")
	private String 鐵__微克_公升_;

	@Column(name="\"陰離子洗滌劑總量 (毫克/公升)\"")
	private String 陰離子洗滌劑總量__毫克_公升_;

	public RiverWater3c() {
	}

	public String get五天生化需氧量__毫克_公升_() {
		return this.五天生化需氧量__毫克_公升_;
	}

	public void set五天生化需氧量__毫克_公升_(String 五天生化需氧量__毫克_公升_) {
		this.五天生化需氧量__毫克_公升_ = 五天生化需氧量__毫克_公升_;
	}

	public String get亞硝酸鹽氮__毫克_公升_() {
		return this.亞硝酸鹽氮__毫克_公升_;
	}

	public void set亞硝酸鹽氮__毫克_公升_(String 亞硝酸鹽氮__毫克_公升_) {
		this.亞硝酸鹽氮__毫克_公升_ = 亞硝酸鹽氮__毫克_公升_;
	}

	public String get傳電性__μS_cm_() {
		return this.傳電性__μS_cm_;
	}

	public void set傳電性__μS_cm_(String 傳電性__μS_cm_) {
		this.傳電性__μS_cm_ = 傳電性__μS_cm_;
	}

	public String get凱氏氮__可溶及粒子___毫克_公升_() {
		return this.凱氏氮__可溶及粒子___毫克_公升_;
	}

	public void set凱氏氮__可溶及粒子___毫克_公升_(String 凱氏氮__可溶及粒子___毫克_公升_) {
		this.凱氏氮__可溶及粒子___毫克_公升_ = 凱氏氮__可溶及粒子___毫克_公升_;
	}

	public String get化學需氧量__毫克_公升_() {
		return this.化學需氧量__毫克_公升_;
	}

	public void set化學需氧量__毫克_公升_(String 化學需氧量__毫克_公升_) {
		this.化學需氧量__毫克_公升_ = 化學需氧量__毫克_公升_;
	}

	public String get大腸桿菌__個_100毫升_() {
		return this.大腸桿菌__個_100毫升_;
	}

	public void set大腸桿菌__個_100毫升_(String 大腸桿菌__個_100毫升_) {
		this.大腸桿菌__個_100毫升_ = 大腸桿菌__個_100毫升_;
	}

	public String get大腸細菌群__個_100毫升_() {
		return this.大腸細菌群__個_100毫升_;
	}

	public void set大腸細菌群__個_100毫升_(String 大腸細菌群__個_100毫升_) {
		this.大腸細菌群__個_100毫升_ = 大腸細菌群__個_100毫升_;
	}

	public Timestamp get日期() {
		return this.日期;
	}

	public void set日期(Timestamp 日期) {
		this.日期 = 日期;
	}

	public Integer get樣本() {
		return this.樣本;
	}

	public void set樣本(Integer 樣本) {
		this.樣本 = 樣本;
	}

	public String get正磷酸鹽磷__毫克_公升_() {
		return this.正磷酸鹽磷__毫克_公升_;
	}

	public void set正磷酸鹽磷__毫克_公升_(String 正磷酸鹽磷__毫克_公升_) {
		this.正磷酸鹽磷__毫克_公升_ = 正磷酸鹽磷__毫克_公升_;
	}

	public String get氟化物__毫克_公升_() {
		return this.氟化物__毫克_公升_;
	}

	public void set氟化物__毫克_公升_(String 氟化物__毫克_公升_) {
		this.氟化物__毫克_公升_ = 氟化物__毫克_公升_;
	}

	public String get氨氮__毫克_公升_() {
		return this.氨氮__毫克_公升_;
	}

	public void set氨氮__毫克_公升_(String 氨氮__毫克_公升_) {
		this.氨氮__毫克_公升_ = 氨氮__毫克_公升_;
	}

	public String get氰化物總量__毫克_公升_() {
		return this.氰化物總量__毫克_公升_;
	}

	public void set氰化物總量__毫克_公升_(String 氰化物總量__毫克_公升_) {
		this.氰化物總量__毫克_公升_ = 氰化物總量__毫克_公升_;
	}

	public String get水溫__攝氏_() {
		return this.水溫__攝氏_;
	}

	public void set水溫__攝氏_(String 水溫__攝氏_) {
		this.水溫__攝氏_ = 水溫__攝氏_;
	}

	public String get水質管制區() {
		return this.水質管制區;
	}

	public void set水質管制區(String 水質管制區) {
		this.水質管制區 = 水質管制區;
	}

	public String get汞__微克_公升_() {
		return this.汞__微克_公升_;
	}

	public void set汞__微克_公升_(String 汞__微克_公升_) {
		this.汞__微克_公升_ = 汞__微克_公升_;
	}

	public String get河溪() {
		return this.河溪;
	}

	public void set河溪(String 河溪) {
		this.河溪 = 河溪;
	}

	public String get油脂__毫克_公升_() {
		return this.油脂__毫克_公升_;
	}

	public void set油脂__毫克_公升_(String 油脂__毫克_公升_) {
		this.油脂__毫克_公升_ = 油脂__毫克_公升_;
	}

	public String get活性硅酸鹽__毫克_公升_() {
		return this.活性硅酸鹽__毫克_公升_;
	}

	public void set活性硅酸鹽__毫克_公升_(String 活性硅酸鹽__毫克_公升_) {
		this.活性硅酸鹽__毫克_公升_ = 活性硅酸鹽__毫克_公升_;
	}

	public String get流量__立方公尺_秒_() {
		return this.流量__立方公尺_秒_;
	}

	public void set流量__立方公尺_秒_(String 流量__立方公尺_秒_) {
		this.流量__立方公尺_秒_ = 流量__立方公尺_秒_;
	}

	public String get混濁度__ntu_() {
		return this.混濁度__ntu_;
	}

	public void set混濁度__ntu_(String 混濁度__ntu_) {
		this.混濁度__ntu_ = 混濁度__ntu_;
	}

	public String get游離硫化氫__毫克_公升_() {
		return this.游離硫化氫__毫克_公升_;
	}

	public void set游離硫化氫__毫克_公升_(String 游離硫化氫__毫克_公升_) {
		this.游離硫化氫__毫克_公升_ = 游離硫化氫__毫克_公升_;
	}

	public String get溶解氧__毫克_公升_() {
		return this.溶解氧__毫克_公升_;
	}

	public void set溶解氧__毫克_公升_(String 溶解氧__毫克_公升_) {
		this.溶解氧__毫克_公升_ = 溶解氧__毫克_公升_;
	}

	public String get溶解氧飽和百分率__百分率_() {
		return this.溶解氧飽和百分率__百分率_;
	}

	public void set溶解氧飽和百分率__百分率_(String 溶解氧飽和百分率__百分率_) {
		this.溶解氧飽和百分率__百分率_ = 溶解氧飽和百分率__百分率_;
	}

	public String get監測站() {
		return this.監測站;
	}

	public void set監測站(String 監測站) {
		this.監測站 = 監測站;
	}

	public String get砷__微克_公升_() {
		return this.砷__微克_公升_;
	}

	public void set砷__微克_公升_(String 砷__微克_公升_) {
		this.砷__微克_公升_ = 砷__微克_公升_;
	}

	public String get硝酸鹽氮__毫克_公升_() {
		return this.硝酸鹽氮__毫克_公升_;
	}

	public void set硝酸鹽氮__毫克_公升_(String 硝酸鹽氮__毫克_公升_) {
		this.硝酸鹽氮__毫克_公升_ = 硝酸鹽氮__毫克_公升_;
	}

	public String get硫化物__可溶及粒子___毫克_公升_() {
		return this.硫化物__可溶及粒子___毫克_公升_;
	}

	public void set硫化物__可溶及粒子___毫克_公升_(String 硫化物__可溶及粒子___毫克_公升_) {
		this.硫化物__可溶及粒子___毫克_公升_ = 硫化物__可溶及粒子___毫克_公升_;
	}

	public String get硼__微克_公升_() {
		return this.硼__微克_公升_;
	}

	public void set硼__微克_公升_(String 硼__微克_公升_) {
		this.硼__微克_公升_ = 硼__微克_公升_;
	}

	public String get總固體量__毫克_公升_() {
		return this.總固體量__毫克_公升_;
	}

	public void set總固體量__毫克_公升_(String 總固體量__毫克_公升_) {
		this.總固體量__毫克_公升_ = 總固體量__毫克_公升_;
	}

	public String get總懸浮固體__毫克_公升_() {
		return this.總懸浮固體__毫克_公升_;
	}

	public void set總懸浮固體__毫克_公升_(String 總懸浮固體__毫克_公升_) {
		this.總懸浮固體__毫克_公升_ = 總懸浮固體__毫克_公升_;
	}

	public String get總揮發性固體量__毫克_公升_() {
		return this.總揮發性固體量__毫克_公升_;
	}

	public void set總揮發性固體量__毫克_公升_(String 總揮發性固體量__毫克_公升_) {
		this.總揮發性固體量__毫克_公升_ = 總揮發性固體量__毫克_公升_;
	}

	public String get總有機碳量__毫克_公升_() {
		return this.總有機碳量__毫克_公升_;
	}

	public void set總有機碳量__毫克_公升_(String 總有機碳量__毫克_公升_) {
		this.總有機碳量__毫克_公升_ = 總有機碳量__毫克_公升_;
	}

	public String get總磷量__可溶及粒子___毫克_公升_() {
		return this.總磷量__可溶及粒子___毫克_公升_;
	}

	public void set總磷量__可溶及粒子___毫克_公升_(String 總磷量__可溶及粒子___毫克_公升_) {
		this.總磷量__可溶及粒子___毫克_公升_ = 總磷量__可溶及粒子___毫克_公升_;
	}

	public String get脫鎂色素__微克_升_() {
		return this.脫鎂色素__微克_升_;
	}

	public void set脫鎂色素__微克_升_(String 脫鎂色素__微克_升_) {
		this.脫鎂色素__微克_升_ = 脫鎂色素__微克_升_;
	}

	public String get葉綠素_a__微克_升_() {
		return this.葉綠素_a__微克_升_;
	}

	public void set葉綠素_a__微克_升_(String 葉綠素_a__微克_升_) {
		this.葉綠素_a__微克_升_ = 葉綠素_a__微克_升_;
	}

	public String get酸鹼值__pH值_() {
		return this.酸鹼值__pH值_;
	}

	public void set酸鹼值__pH值_(String 酸鹼值__pH值_) {
		this.酸鹼值__pH值_ = 酸鹼值__pH值_;
	}

	public String get釩__微克_公升_() {
		return this.釩__微克_公升_;
	}

	public void set釩__微克_公升_(String 釩__微克_公升_) {
		this.釩__微克_公升_ = 釩__微克_公升_;
	}

	public String get鈹__微克_公升_() {
		return this.鈹__微克_公升_;
	}

	public void set鈹__微克_公升_(String 鈹__微克_公升_) {
		this.鈹__微克_公升_ = 鈹__微克_公升_;
	}

	public String get鉈__微克_公升_() {
		return this.鉈__微克_公升_;
	}

	public void set鉈__微克_公升_(String 鉈__微克_公升_) {
		this.鉈__微克_公升_ = 鉈__微克_公升_;
	}

	public String get鉛__微克_公升_() {
		return this.鉛__微克_公升_;
	}

	public void set鉛__微克_公升_(String 鉛__微克_公升_) {
		this.鉛__微克_公升_ = 鉛__微克_公升_;
	}

	public String get鉬__微克_公升_() {
		return this.鉬__微克_公升_;
	}

	public void set鉬__微克_公升_(String 鉬__微克_公升_) {
		this.鉬__微克_公升_ = 鉬__微克_公升_;
	}

	public String get鉻__微克_公升_() {
		return this.鉻__微克_公升_;
	}

	public void set鉻__微克_公升_(String 鉻__微克_公升_) {
		this.鉻__微克_公升_ = 鉻__微克_公升_;
	}

	public String get銀__微克_公升_() {
		return this.銀__微克_公升_;
	}

	public void set銀__微克_公升_(String 銀__微克_公升_) {
		this.銀__微克_公升_ = 銀__微克_公升_;
	}

	public String get銅__微克_公升_() {
		return this.銅__微克_公升_;
	}

	public void set銅__微克_公升_(String 銅__微克_公升_) {
		this.銅__微克_公升_ = 銅__微克_公升_;
	}

	public String get銻__微克_公升_() {
		return this.銻__微克_公升_;
	}

	public void set銻__微克_公升_(String 銻__微克_公升_) {
		this.銻__微克_公升_ = 銻__微克_公升_;
	}

	public String get鋁__微克_公升_() {
		return this.鋁__微克_公升_;
	}

	public void set鋁__微克_公升_(String 鋁__微克_公升_) {
		this.鋁__微克_公升_ = 鋁__微克_公升_;
	}

	public String get鋅__微克_公升_() {
		return this.鋅__微克_公升_;
	}

	public void set鋅__微克_公升_(String 鋅__微克_公升_) {
		this.鋅__微克_公升_ = 鋅__微克_公升_;
	}

	public String get鋇__微克_公升_() {
		return this.鋇__微克_公升_;
	}

	public void set鋇__微克_公升_(String 鋇__微克_公升_) {
		this.鋇__微克_公升_ = 鋇__微克_公升_;
	}

	public String get錳__微克_公升_() {
		return this.錳__微克_公升_;
	}

	public void set錳__微克_公升_(String 錳__微克_公升_) {
		this.錳__微克_公升_ = 錳__微克_公升_;
	}

	public String get鎘__微克_公升_() {
		return this.鎘__微克_公升_;
	}

	public void set鎘__微克_公升_(String 鎘__微克_公升_) {
		this.鎘__微克_公升_ = 鎘__微克_公升_;
	}

	public String get鎳__微克_公升_() {
		return this.鎳__微克_公升_;
	}

	public void set鎳__微克_公升_(String 鎳__微克_公升_) {
		this.鎳__微克_公升_ = 鎳__微克_公升_;
	}

	public String get鐵__微克_公升_() {
		return this.鐵__微克_公升_;
	}

	public void set鐵__微克_公升_(String 鐵__微克_公升_) {
		this.鐵__微克_公升_ = 鐵__微克_公升_;
	}

	public String get陰離子洗滌劑總量__毫克_公升_() {
		return this.陰離子洗滌劑總量__毫克_公升_;
	}

	public void set陰離子洗滌劑總量__毫克_公升_(String 陰離子洗滌劑總量__毫克_公升_) {
		this.陰離子洗滌劑總量__毫克_公升_ = 陰離子洗滌劑總量__毫克_公升_;
	}

}