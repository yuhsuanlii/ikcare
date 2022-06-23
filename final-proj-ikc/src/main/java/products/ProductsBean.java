package products;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class ProductsBean {

	@Id
	@Column(name = "ProductID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productid;
	
	@Column(name = "ProductName")
	private String productname;
	
	@Column(name = "SuppliesID")
	private short suppliesid;
	
	@Lob
	@Column(name = "ProductImg")
	private byte[] productImg;

	@Column(name = "StandardCost")
	private Integer standardcost;
	
	@Column(name = "ProductStock")
	private Integer productstock;
	
	@Column(name = "ProductDescribe")
	private String productdescribe;
	
	@Column(name = "ProductStatus")
	private String productstatus;

	@Override
	public String toString() {
		return "ProductsBean [" + productid + "," + productname + "," + suppliesid
				+ "," + Arrays.toString(productImg) + "," + standardcost + ","
				+ productstock + "," + productdescribe + "," + productstatus + "]";
	}

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public short getSuppliesid() {
		return suppliesid;
	}

	public void setSuppliesid(short suppliesid) {
		this.suppliesid = suppliesid;
	}

	public byte[] getProductImg() {
		return productImg;
	}

	public void setProductlmg(byte[] productImg) {
		this.productImg = productImg;
	}

	public Integer getStandardcost() {
		return standardcost;
	}

	public void setStandardcost(Integer standardcost) {
		this.standardcost = standardcost;
	}

	public int getProductstock() {
		return productstock;
	}

	public void setProductstock(Integer productstock) {
		this.productstock = productstock;
	}

	public String getProductdescribe() {
		return productdescribe;
	}

	public void setProductdescribe(String productdescribe) {
		this.productdescribe = productdescribe;
	}

	public String getProductstatus() {
		return productstatus;
	}

	public void setProductstatus(String productstatus) {
		this.productstatus = productstatus;
	}
	
	
}
