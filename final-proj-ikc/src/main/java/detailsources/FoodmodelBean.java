package detailsources;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "members")
public class FoodmodelBean {
	@Id
	@Column(name = "Foodid")
	private Integer foodid;

	@Column(name = "FoodName")
	private String foodname;

	@Column(name = "Calorie")
	private Integer calorie;

	@Column(name = "FatPercentage")
	private Integer fatpercentage;

	@Column(name = "GramsPerServing")
	private Integer gramsperserving;

	@Override
	public String toString() {
		return "FoodmodelBean [" + foodid + ", " + foodname + ", " + calorie + ", " + fatpercentage + ", "
				+ gramsperserving + "]";
	}

	public Integer getFoodid() {
		return foodid;
	}

	public void setFoodid(Integer foodid) {
		this.foodid = foodid;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public Integer getCalorie() {
		return calorie;
	}

	public void setCalorie(Integer calorie) {
		this.calorie = calorie;
	}

	public Integer getFatpercentage() {
		return fatpercentage;
	}

	public void setFatpercentage(Integer fatpercentage) {
		this.fatpercentage = fatpercentage;
	}

	public Integer getGramsperServing() {
		return gramsperserving;
	}

	public void setGramsperServing(Integer gramsperserving) {
		this.gramsperserving = gramsperserving;
	}
}