package members;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sportingclass")
public class SportingClassBean {
	@Id
	@Column(name = "SportClass ")
	private Integer sportclass ;
	
	@Column(name = "CalorieExpenditure ")
	private Float calorieexpenditure ;
	
	@Column(name = "Sporting ")
	private String sporting ;

	public Integer getSportclass() {
		return sportclass;
	}

	public void setSportclass(Integer sportclass) {
		this.sportclass = sportclass;
	}

	public Float getCalorieexpenditure() {
		return calorieexpenditure;
	}

	public void setCalorieexpenditure(Float calorieexpenditure) {
		this.calorieexpenditure = calorieexpenditure;
	}

	public String getSporting() {
		return sporting;
	}

	public void setSporting(String sporting) {
		this.sporting = sporting;
	}

	@Override
	public String toString() {
		return "SportingClassBean [" + sportclass + ", " + calorieexpenditure + ", " + sporting + "]";
	}
	
	
	

}
