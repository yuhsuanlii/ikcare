package detailsources;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "members")
public class FoodDataBean {
	@Id
	@Column(name = "SampleId ")
	private Integer sampleid ;

	@Column(name = "Foodclass")
	private String foodclass;

	@Column(name = "SampleName")
	private String samplename;

	@Column(name = "Calories")
	private Float calories;

	@Column(name = "FixCalories")
	private Float fixcalories;

	@Column(name = "Moisture")
	private Float moisture;

	@Column(name = "CrudeProtein")
	private Float crudeprotein;

	@Column(name = "CrudeFat")
	private Float crudefat;

	@Column(name = "SaturatedFats")
	private Float saturatedfats;

	@Column(name = "Carbohydrate")
	private Float carbohydrate;

	@Column(name = "DietaryFiber")
	private Float dietaryfiber;

	@Column(name = "Glucose")
	private Float glucose;

	@Column(name = "Fructose")
	private Float fructose;

	@Column(name = "Sucrose")
	private Float sucrose;

	@Column(name = "Lactose")
	private Float lactose;

	@Column(name = "Sodium")
	private Float sodium;

	@Column(name = "Potassium")
	private Float potassium;

	@Column(name = "Calcium")
	private Float calcium;

	@Column(name = "Magnesium")
	private Float magnesium;

	@Column(name = "Ferrum")
	private Float ferrum;

	@Column(name = "Zinc")
	private Float zinc;

	@Column(name = "Phosphor")
	private Float phosphor;

	@Column(name = "Copper")
	private Float copper;

	@Column(name = "Manganese")
	private Float manganese;

	@Column(name = "VitaminA")
	private Float vitaminA;

	@Column(name = "αCarotene")
	private Float caroteneα;

	@Column(name = "βCarotene")
	private Float caroteneβ;

	@Column(name = "VitaminDIU")
	private Float vitaminDIU;

	@Column(name = "VitaminDUG")
	private Float vitaminDUG;

	@Column(name = "VitaminE")
	private Float vitaminE;

	@Column(name = "VitaminK1")
	private Float vitaminK1;

	@Column(name = "VitaminB1")
	private Float vitaminB1;

	@Column(name = "VitaminB2")
	private Float vitaminB2;

	@Column(name = "Niacin")
	private Float niacin;

	@Column(name = "VitaminB6")
	private Float vitaminB6;

	@Column(name = "VitaminB12")
	private Float vitaminB12;

	@Column(name = "Folate")
	private Float folate;

	@Column(name = "VitaminC")
	private Float vitaminC;

	@Column(name = "FattyAcidS")
	private Float fattyacidS;

	@Column(name = "PalmiticAcid")
	private Float palmiticacid;

	@Column(name = "StearicAcid")
	private Float stearicacid;

	@Column(name = "EicosanoicAcid")
	private Float eicosanoicacid;

	@Column(name = "FattyAcidM")
	private Float fattyacidM;

	@Column(name = "OleicAcid")
	private Float oleicacid;

	@Column(name = "GadoleicAcid")
	private Float gadoleicacid;

	@Column(name = "ErucicAcid")
	private Float erucicacid;

	@Column(name = "FattyAcidP")
	private Float fattyacidP;

	@Column(name = "LinoleicAcid")
	private Float linoleicacid;

	@Column(name = "LinolenicAcid")
	private Float linolenicacid;

	@Column(name = "ArachidonicAcid")
	private Float arachidonicacid;

	@Column(name = "EicosapentaenoicAcid")
	private Float eicosapentaenoicacid;

	@Column(name = "DocosapentenoicAcid")
	private Float docosapentenoicacid;

	@Column(name = "DocosahexaenoicAcid")
	private Float docosahexaenoicacid;

	@Column(name = "TransFat")
	private Float transfat;

	@Column(name = "Tyrosine")
	private Float tyrosine;

	@Column(name = "Cholesterol")
	private Float cholesterol;

	@Column(name = "Alcohol")
	private Float alcohol;

	@Override
	public String toString() {
		return "FoodDataBean [" + sampleid + ", " + foodclass + ", " + samplename + ", " + calories + ", " + fixcalories
				+ ", " + moisture + ", " + crudeprotein + ", " + crudefat + ", " + saturatedfats + ", " + carbohydrate
				+ ", " + dietaryfiber + ", " + glucose + ", " + fructose + ", " + sucrose + ", " + lactose + ", "
				+ sodium + ", " + potassium + ", " + calcium + ", " + magnesium + ", " + ferrum + ", " + zinc + ", "
				+ phosphor + ", " + copper + ", " + manganese + ", " + vitaminA + ", " + caroteneα + ", " + caroteneβ
				+ ", " + vitaminDIU + ", " + vitaminDUG + ", " + vitaminE + ", " + vitaminK1 + ", " + vitaminB1 + ", "
				+ vitaminB2 + ", " + niacin + ", " + vitaminB6 + ", " + vitaminB12 + ", " + folate + ", " + vitaminC
				+ ", " + fattyacidS + ", " + palmiticacid + ", " + stearicacid + ", " + eicosanoicacid + ", "
				+ fattyacidM + ", " + oleicacid + ", " + gadoleicacid + ", " + erucicacid + ", " + fattyacidP + ", "
				+ linoleicacid + ", " + linolenicacid + ", " + arachidonicacid + ", " + eicosapentaenoicacid + ", "
				+ docosapentenoicacid + ", " + docosahexaenoicacid + ", " + transfat + ", " + tyrosine + ", "
				+ cholesterol + ", " + alcohol + "]";
	}

	public Integer getSampleid() {
		return sampleid;
	}

	public void setSampleid(Integer sampleid) {
		this.sampleid = sampleid;
	}

	public String getFoodclass() {
		return foodclass;
	}

	public void setFoodclass(String foodclass) {
		this.foodclass = foodclass;
	}

	public String getSamplename() {
		return samplename;
	}

	public void setSamplename(String samplename) {
		this.samplename = samplename;
	}

	public Float getCalories() {
		return calories;
	}

	public void setCalories(Float calories) {
		this.calories = calories;
	}

	public Float getFixcalories() {
		return fixcalories;
	}

	public void setFixcalories(Float fixcalories) {
		this.fixcalories = fixcalories;
	}

	public Float getMoisture() {
		return moisture;
	}

	public void setMoisture(Float moisture) {
		this.moisture = moisture;
	}

	public Float getCrudeprotein() {
		return crudeprotein;
	}

	public void setCrudeprotein(Float crudeprotein) {
		this.crudeprotein = crudeprotein;
	}

	public Float getCrudefat() {
		return crudefat;
	}

	public void setCrudefat(Float crudefat) {
		this.crudefat = crudefat;
	}

	public Float getSaturatedfats() {
		return saturatedfats;
	}

	public void setSaturatedfats(Float saturatedfats) {
		this.saturatedfats = saturatedfats;
	}

	public Float getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(Float carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public Float getDietaryfiber() {
		return dietaryfiber;
	}

	public void setDietaryfiber(Float dietaryfiber) {
		this.dietaryfiber = dietaryfiber;
	}

	public Float getGlucose() {
		return glucose;
	}

	public void setGlucose(Float glucose) {
		this.glucose = glucose;
	}

	public Float getFructose() {
		return fructose;
	}

	public void setFructose(Float fructose) {
		this.fructose = fructose;
	}

	public Float getSucrose() {
		return sucrose;
	}

	public void setSucrose(Float sucrose) {
		this.sucrose = sucrose;
	}

	public Float getLactose() {
		return lactose;
	}

	public void setLactose(Float lactose) {
		this.lactose = lactose;
	}

	public Float getSodium() {
		return sodium;
	}

	public void setSodium(Float sodium) {
		this.sodium = sodium;
	}

	public Float getPotassium() {
		return potassium;
	}

	public void setPotassium(Float potassium) {
		this.potassium = potassium;
	}

	public Float getCalcium() {
		return calcium;
	}

	public void setCalcium(Float calcium) {
		this.calcium = calcium;
	}

	public Float getMagnesium() {
		return magnesium;
	}

	public void setMagnesium(Float magnesium) {
		this.magnesium = magnesium;
	}

	public Float getFerrum() {
		return ferrum;
	}

	public void setFerrum(Float ferrum) {
		this.ferrum = ferrum;
	}

	public Float getZinc() {
		return zinc;
	}

	public void setZinc(Float zinc) {
		this.zinc = zinc;
	}

	public Float getPhosphor() {
		return phosphor;
	}

	public void setPhosphor(Float phosphor) {
		this.phosphor = phosphor;
	}

	public Float getCopper() {
		return copper;
	}

	public void setCopper(Float copper) {
		this.copper = copper;
	}

	public Float getManganese() {
		return manganese;
	}

	public void setManganese(Float manganese) {
		this.manganese = manganese;
	}

	public Float getVitaminA() {
		return vitaminA;
	}

	public void setVitaminA(Float vitaminA) {
		this.vitaminA = vitaminA;
	}

	public Float getCaroteneα() {
		return caroteneα;
	}

	public void setCaroteneα(Float caroteneα) {
		this.caroteneα = caroteneα;
	}

	public Float getCaroteneβ() {
		return caroteneβ;
	}

	public void setCaroteneβ(Float caroteneβ) {
		this.caroteneβ = caroteneβ;
	}

	public Float getVitaminDIU() {
		return vitaminDIU;
	}

	public void setVitaminDIU(Float vitaminDIU) {
		this.vitaminDIU = vitaminDIU;
	}

	public Float getVitaminDUG() {
		return vitaminDUG;
	}

	public void setVitaminDUG(Float vitaminDUG) {
		this.vitaminDUG = vitaminDUG;
	}

	public Float getVitaminE() {
		return vitaminE;
	}

	public void setVitaminE(Float vitaminE) {
		this.vitaminE = vitaminE;
	}

	public Float getVitaminK1() {
		return vitaminK1;
	}

	public void setVitaminK1(Float vitaminK1) {
		this.vitaminK1 = vitaminK1;
	}

	public Float getVitaminB1() {
		return vitaminB1;
	}

	public void setVitaminB1(Float vitaminB1) {
		this.vitaminB1 = vitaminB1;
	}

	public Float getVitaminB2() {
		return vitaminB2;
	}

	public void setVitaminB2(Float vitaminB2) {
		this.vitaminB2 = vitaminB2;
	}

	public Float getNiacin() {
		return niacin;
	}

	public void setNiacin(Float niacin) {
		this.niacin = niacin;
	}

	public Float getVitaminB6() {
		return vitaminB6;
	}

	public void setVitaminB6(Float vitaminB6) {
		this.vitaminB6 = vitaminB6;
	}

	public Float getVitaminB12() {
		return vitaminB12;
	}

	public void setVitaminB12(Float vitaminB12) {
		this.vitaminB12 = vitaminB12;
	}

	public Float getFolate() {
		return folate;
	}

	public void setFolate(Float folate) {
		this.folate = folate;
	}

	public Float getVitaminC() {
		return vitaminC;
	}

	public void setVitaminC(Float vitaminC) {
		this.vitaminC = vitaminC;
	}

	public Float getFattyacidS() {
		return fattyacidS;
	}

	public void setFattyacidS(Float fattyacidS) {
		this.fattyacidS = fattyacidS;
	}

	public Float getPalmiticacid() {
		return palmiticacid;
	}

	public void setPalmiticacid(Float palmiticacid) {
		this.palmiticacid = palmiticacid;
	}

	public Float getStearicacid() {
		return stearicacid;
	}

	public void setStearicacid(Float stearicacid) {
		this.stearicacid = stearicacid;
	}

	public Float getEicosanoicacid() {
		return eicosanoicacid;
	}

	public void setEicosanoicacid(Float eicosanoicacid) {
		this.eicosanoicacid = eicosanoicacid;
	}

	public Float getFattyacidM() {
		return fattyacidM;
	}

	public void setFattyacidM(Float fattyacidM) {
		this.fattyacidM = fattyacidM;
	}

	public Float getOleicacid() {
		return oleicacid;
	}

	public void setOleicacid(Float oleicacid) {
		this.oleicacid = oleicacid;
	}

	public Float getGadoleicacid() {
		return gadoleicacid;
	}

	public void setGadoleicacid(Float gadoleicacid) {
		this.gadoleicacid = gadoleicacid;
	}

	public Float getErucicacid() {
		return erucicacid;
	}

	public void setErucicacid(Float erucicacid) {
		this.erucicacid = erucicacid;
	}

	public Float getFattyacidP() {
		return fattyacidP;
	}

	public void setFattyacidP(Float fattyacidP) {
		this.fattyacidP = fattyacidP;
	}

	public Float getLinoleicacid() {
		return linoleicacid;
	}

	public void setLinoleicacid(Float linoleicacid) {
		this.linoleicacid = linoleicacid;
	}

	public Float getLinolenicacid() {
		return linolenicacid;
	}

	public void setLinolenicacid(Float linolenicacid) {
		this.linolenicacid = linolenicacid;
	}

	public Float getArachidonicacid() {
		return arachidonicacid;
	}

	public void setArachidonicacid(Float arachidonicacid) {
		this.arachidonicacid = arachidonicacid;
	}

	public Float getEicosapentaenoicacid() {
		return eicosapentaenoicacid;
	}

	public void setEicosapentaenoicacid(Float eicosapentaenoicacid) {
		this.eicosapentaenoicacid = eicosapentaenoicacid;
	}

	public Float getDocosapentenoicacid() {
		return docosapentenoicacid;
	}

	public void setDocosapentenoicacid(Float docosapentenoicacid) {
		this.docosapentenoicacid = docosapentenoicacid;
	}

	public Float getDocosahexaenoicacid() {
		return docosahexaenoicacid;
	}

	public void setDocosahexaenoicacid(Float docosahexaenoicacid) {
		this.docosahexaenoicacid = docosahexaenoicacid;
	}

	public Float getTransfat() {
		return transfat;
	}

	public void setTransfat(Float transfat) {
		this.transfat = transfat;
	}

	public Float getTyrosine() {
		return tyrosine;
	}

	public void setTyrosine(Float tyrosine) {
		this.tyrosine = tyrosine;
	}

	public Float getCholesterol() {
		return cholesterol;
	}

	public void setCholesterol(Float cholesterol) {
		this.cholesterol = cholesterol;
	}

	public Float getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(Float alcohol) {
		this.alcohol = alcohol;
	}

}