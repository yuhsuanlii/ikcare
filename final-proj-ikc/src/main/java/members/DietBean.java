package members;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Diet")
public class DietBean {
	@Id
	@Column(name = "DietID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dietid;

	@Column(name = "UserAccount")
	private String useraccount;

	@Column(name = "DietDate")
	@Temporal(TemporalType.DATE)
	private java.util.Date dietdate;

	@Column(name = "DietTime")
	private String diettime;

	@Override
	public String toString() {
		return "DietBean [" + dietid + ", " + useraccount + ", " + dietdate + ", " + diettime + "]";
	}

	public Integer getDietid() {
		return dietid;
	}

	public void setDietid(Integer dietid) {
		this.dietid = dietid;
	}

	public String getUseraccount() {
		return useraccount;
	}

	public void setUseraccount(String useraccount) {
		this.useraccount = useraccount;
	}

	public java.util.Date getDietdate() {
		return dietdate;
	}

	public void setDietdate(java.util.Date dietdate) {
		this.dietdate = dietdate;
	}

	public String getDiettime() {
		return diettime;
	}

	public void setDiettime(String diettime) {
		this.diettime = diettime;
	}
	
}
