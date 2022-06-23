package orders;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetails")
public class OrderDetailsBean {
	@Id
	@Column(name = "OrderDetailID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderDetailID;
	
	@Column(name = "OrderID")
	private Integer orderID;
	
	@Column(name = "ProductID")
	private Integer productID;
	
	@Column(name = "unitPrice")
	private Integer unitPrice;
	
	@Column(name = "OrderQuantity")
	private Byte orderQuantity;
	
	@Column(name = "Discount")
	private Float discount;
	
	@Override
	public String toString() {
		return "OrderDetails [" + orderDetailID + "," + orderID + "," + productID
				+ "," + unitPrice + "," + orderQuantity + "," + discount + "]";
	}
	public Integer getOrderDetailID() {
		return orderDetailID;
	}
	public void setOrderDetailID(Integer orderDetailID) {
		this.orderDetailID = orderDetailID;
	}
	public Integer getOrderID() {
		return orderID;
	}
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	public Integer getProductID() {
		return productID;
	}
	public void setProductID(Integer productID) {
		this.productID = productID;
	}
	public Integer getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Byte getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(Byte orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public Float getDiscount() {
		return discount;
	}
	public void setDiscount(Float discount) {
		this.discount = discount;
	}
}
