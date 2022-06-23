package products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productmatchelm")
public class ProductMatchelmBean {
	
	@Id
	@Column(name = "MatchID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer matchid;
	
	@Column(name = "ProductID")
	private Integer productid;
	
	@Column(name = "ElementID")
	private Integer elementid;

	@Override
	public String toString() {
		return "ProductMatchelmBean [" + matchid + "," + productid + "," + elementid
				+ "]";
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

	public int getElementid() {
		return elementid;
	}

	public void setElementid(int elementid) {
		this.elementid = elementid;
	}
	
	
}
