package orders;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "orders")
public class OrdersBean {
	@Id
	@Column(name = "OrderID ")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderID;
	
	@Column(name = "UserAccount")
	private String userAccount;
	
	@Column(name = "OrderTime")
	private java.util.Date orderTime;
	
	@Column(name = "OrderEndTime")
	@Temporal(TemporalType.DATE)
	private java.util.Date orderEndTime;
	
	@Column(name = "OrderAdress")
	private String orderAdress;
	
	@Column(name = "OrderArea")
	private String orderArea;
	
	@Column(name = "OrderStatus")
	private String orderStatus;
	
	@Column(name = "Payment")
	private String payment;
	
	@Column(name = "Delivery")
	private String delivery;
	@Override
	public String toString() {
		return "Orders [" + orderID + "," + userAccount + "," + orderTime
				+ "," + orderEndTime + "," + orderAdress + "," + orderArea
				+ "," + orderStatus + "," + payment + "," + delivery + "]";
	}
	public Integer getOrderID() {
		return orderID;
	}
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public java.util.Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(java.util.Date orderTime) {
		this.orderTime = orderTime;
	}
	public java.util.Date getOrderEndTime() {
		return orderEndTime;
	}
	public void setOrderEndTime(java.util.Date orderEndTime) {
		this.orderEndTime = orderEndTime;
	}
	public String getOrderAdress() {
		return orderAdress;
	}
	public void setOrderAdress(String orderAdress) {
		this.orderAdress = orderAdress;
	}
	public String getOrderArea() {
		return orderArea;
	}
	public void setOrderArea(String orderArea) {
		this.orderArea = orderArea;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	
}
