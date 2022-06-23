package members;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "membersport")
public class MemberSportBean {
	@Id
	@Column(name = "SprotID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sprotid;
	
	@Column(name = "UserAccount")
	private String useraccount;
	
	@Column(name = "SprotDate")
	private java.util.Date sprotdate;
	
	@Column(name = "SportClass")
	private Integer sportclass;
	
	@Column(name ="SportHour")
	private Float sporthour;

	@Override
	public String toString() {
		return "MemberSportBean [" + sprotid + ", " + useraccount + ", " + sprotdate + ", " + sportclass + ", "
				+ sporthour + "]";
	}

	public Integer getSprotid() {
		return sprotid;
	}

	public void setSprotid(Integer sprotid) {
		this.sprotid = sprotid;
	}

	public String getUseraccount() {
		return useraccount;
	}

	public void setUseraccount(String useraccount) {
		this.useraccount = useraccount;
	}

	public java.util.Date getSprotdate() {
		return sprotdate;
	}

	public void setSprotdate(java.util.Date sprotdate) {
		this.sprotdate = sprotdate;
	}

	public Integer getSportclass() {
		return sportclass;
	}

	public void setSportclass(Integer sportclass) {
		this.sportclass = sportclass;
	}

	public Float getSporthour() {
		return sporthour;
	}

	public void setSporthour(Float sporthour) {
		this.sporthour = sporthour;
	}

}
