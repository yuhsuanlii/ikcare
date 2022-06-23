package members;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BodyInformation")
public class BodyInformationBean {
	@Id
	@Column(name = "BodyID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bodyid;

	@Column(name = "UserAccount")
	private String useraccount;

	@Column(name = "MemberHeight")
	private Float memberheight;

	@Column(name = "MemberWeight")
	private Float memberweight;

	@Override
	public String toString() {
		return "BodyInformationBean [" + bodyid + ", " + useraccount + ", " + memberheight + ", " + memberweight + "]";
	}

	public Integer getBodyid() {
		return bodyid;
	}

	public void setBodyid(Integer bodyid) {
		this.bodyid = bodyid;
	}

	public String getUseraccount() {
		return useraccount;
	}

	public void setUseraccount(String useraccount) {
		this.useraccount = useraccount;
	}

	public Float getMemberheight() {
		return memberheight;
	}

	public void setMemberheight(Float memberheight) {
		this.memberheight = memberheight;
	}

	public Float getMemberweight() {
		return memberweight;
	}

	public void setMemberweight(Float memberweight) {
		this.memberweight = memberweight;
	}
}