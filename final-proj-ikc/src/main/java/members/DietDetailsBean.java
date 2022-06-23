package members;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dietdetails")
public class DietDetailsBean {
	@Id
	@Column(name = "DietDetailID ")
	private Integer dietdetailid ;
	
	@Column(name = "DietID ")
	private Integer dietid ;
	
	@Column(name = "SampleId ")
	private Integer sampleid ;
	
	@Column(name = "FoodID ")
	private Integer foodid ;
	
	@Column(name = "FoodNumber ")
	private Integer foodnumber ;

	@Override
	public String toString() {
		return "DietDetailsBean [" + dietdetailid + ", " + dietid + ", " + sampleid + ", " + foodid + ", " + foodnumber
				+ "]";
	}

	public Integer getDietdetailid() {
		return dietdetailid;
	}

	public void setDietdetailid(Integer dietdetailid) {
		this.dietdetailid = dietdetailid;
	}

	public Integer getDietid() {
		return dietid;
	}

	public void setDietid(Integer dietid) {
		this.dietid = dietid;
	}

	public Integer getSampleid() {
		return sampleid;
	}

	public void setSampleid(Integer sampleid) {
		this.sampleid = sampleid;
	}

	public Integer getFoodid() {
		return foodid;
	}

	public void setFoodid(Integer foodid) {
		this.foodid = foodid;
	}

	public Integer getFoodnumber() {
		return foodnumber;
	}

	public void setFoodnumber(Integer foodnumber) {
		this.foodnumber = foodnumber;
	}

}
