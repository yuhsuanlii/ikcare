package members;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sleetimetpye")
public class SleetimeTypeBean {
	
	@Id
	@Column(name = "SleetimeID ")
	private Integer sleetimeid ;
	
	@Column(name = "SleetimeAge ")
	private String sleetimeage ;
	
	@Column(name = "MinSleetime ")
	private Integer minsleetime ;

	@Column(name = "MaxSleetime ")
	private Integer maxsleetime ;

	public Integer getSleetimeid() {
		return sleetimeid;
	}

	public void setSleetimeid(Integer sleetimeid) {
		this.sleetimeid = sleetimeid;
	}

	public String getSleetimeage() {
		return sleetimeage;
	}

	public void setSleetimeage(String sleetimeage) {
		this.sleetimeage = sleetimeage;
	}

	public Integer getMinsleetime() {
		return minsleetime;
	}

	public void setMinsleetime(Integer minsleetime) {
		this.minsleetime = minsleetime;
	}

	public Integer getMaxsleetime() {
		return maxsleetime;
	}

	public void setMaxsleetime(Integer maxsleetime) {
		this.maxsleetime = maxsleetime;
	}

	@Override
	public String toString() {
		return "SleetimeType [" + sleetimeid + ", " + sleetimeage + ", " + minsleetime + ", " + maxsleetime + "]";
	}
	
	
}
