package products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productmatchfun")
public class ProductMatchfunBean {

	@Id
	@Column(name = "MatchID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer matchid;
	
	@Column(name = "ProductID")
	private Integer productid;
	
	@Column(name = "FunctionalityID")
	private Integer functionalityid;

	@Override
	public String toString() {
		return "ProductMatchfun [" + matchid + "," + productid + ","
				+ functionalityid + "]";
	}

	public int getMatchid() {
		return matchid;
	}

	public void setMatchid(int matchid) {
		this.matchid = matchid;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public int getFunctionalityid() {
		return functionalityid;
	}

	public void setFunctionalityid(int functionalityid) {
		this.functionalityid = functionalityid;
	}
	
	
}
