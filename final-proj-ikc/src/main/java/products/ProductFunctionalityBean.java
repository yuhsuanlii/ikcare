package products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productfunctionality")
public class ProductFunctionalityBean {
	
	@Id
	@Column(name = "FunctionalityID")
	private Integer functionalityid;
	
	@Column(name = "Functionality")
	private String functionality;

	@Override
	public String toString() {
		return "ProductFunctionality [" + functionalityid + "," + functionality + "]";
	}

	public int getFunctionalityid() {
		return functionalityid;
	}

	public void setFunctionalityid(int functionalityid) {
		this.functionalityid = functionalityid;
	}

	public String getFunctionality() {
		return functionality;
	}

	public void setFunctionality(String functionality) {
		this.functionality = functionality;
	}
	
	
}
