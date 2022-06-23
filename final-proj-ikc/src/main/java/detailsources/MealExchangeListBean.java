package detailsources;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mealexchangelist")
public class MealExchangeListBean {
	@Id
	@Column(name = "MealExchangeID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mealExchangeID;
	
	@Column(name = "FoodName")
	private String foodName;
	
	@Column(name = "FoodType")
	private String foodtype;
	
	@Column(name = "ServingSize")
	private String servingSize;
	
	@Column(name = "EdiblePart")
	private Float ediblePart;
	
	@Override
	public String toString() {
		return "MealExchangeListBean [" + mealExchangeID + "," + foodName + ","
				+ foodtype + "," + servingSize + "," + ediblePart + "]";
	}
	public Integer getMealExchangeID() {
		return mealExchangeID;
	}
	public void setMealExchangeID(Integer mealExchangeID) {
		this.mealExchangeID = mealExchangeID;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodtype() {
		return foodtype;
	}
	public void setFoodtype(String foodtype) {
		this.foodtype = foodtype;
	}
	public String getServingSize() {
		return servingSize;
	}
	public void setServingSize(String servingSize) {
		this.servingSize = servingSize;
	}
	public Float getEdiblePart() {
		return ediblePart;
	}
	public void setEdiblePart(Float ediblePart) {
		this.ediblePart = ediblePart;
	}
}
