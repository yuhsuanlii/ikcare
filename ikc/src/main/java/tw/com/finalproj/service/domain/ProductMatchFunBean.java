package tw.com.finalproj.service.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productmatchfun")
public class ProductMatchFunBean {


	@Id
	@Column(name = "matchid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer matchid;
	
	@Column(name = "productid")
	private Integer productid;
	
	@Column(name = "functionalityid")
	private Integer functionalityid;

	@Override
	public String toString() {
		return "ProductMatchFunBean [" + matchid + "," + productid + ","
				+ functionalityid + "]";
	}

	public Integer getMatchid() {
		return matchid;
	}

	public void setMatchid(Integer matchid) {
		this.matchid = matchid;
	}

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	public Integer getFunctionalityid() {
		return functionalityid;
	}

	public void setFunctionalityid(Integer functionalityid) {
		this.functionalityid = functionalityid;
	}
	
	
}
