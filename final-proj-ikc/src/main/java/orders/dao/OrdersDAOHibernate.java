package orders.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import orders.OrdersBean;
import orders.OrdersDAO;

@Repository
public class OrdersDAOHibernate implements OrdersDAO{
	@PersistenceContext
	private Session session;
	
	public Session getSession() {
		return session;
	}

	@Override
	public OrdersBean select(Integer orderID) {
		if(orderID!=null) {
			return this.getSession().get(OrdersBean.class, orderID);
		}
		return null;
	}

	@Override
	public List<OrdersBean> select() {
		CriteriaBuilder criteriaBuilder = this.getSession().getCriteriaBuilder();
		CriteriaQuery<OrdersBean> criteriaQuery = criteriaBuilder.createQuery(OrdersBean.class);
		
		Root<OrdersBean> root = criteriaQuery.from(OrdersBean.class);
		
		TypedQuery<OrdersBean> typedQuery = this.getSession().createQuery(criteriaQuery);
		List<OrdersBean> result = typedQuery.getResultList();
		if(result!=null && !result.isEmpty()) {
			System.out.println("[hibernate]:"+result);
			return result;
		}
		
		return null;
	}

	@Override
	public OrdersBean insert(OrdersBean bean) {
		if(bean!=null && bean.getOrderID()!=null) {
			System.out.println("[DAOHibernate]I got bean and i'm going to select");
			OrdersBean temp = this.getSession().get(OrdersBean.class, bean.getOrderID());
			if(temp==null) {
				System.out.println("[DAOHibernate]I got bean also it have saved");
				this.getSession().save(bean);
				return bean;
			}
		}
		return null;
	}

	public OrdersBean update(OrdersBean bean) {
		if(bean!=null && bean.getOrderID()!=null) {
			OrdersBean temp = this.getSession().get(OrdersBean.class, bean.getOrderID());
			if(temp!=null) {
				return (OrdersBean) this.getSession().merge(bean);
			}
		}
		return null;
	}
	
	@Override
	public OrdersBean update(Integer orderID, String userAccount, Date orderTime, Date orderEndTime, String orderAdress,
			String orderArea, String orderStatus, String payment, String delivery) {
		if(orderID!=null) {
			OrdersBean temp = this.getSession().get(OrdersBean.class, orderID);
			if(temp!=null) {
				temp.setUserAccount(userAccount);
				temp.setOrderTime(orderTime);
				temp.setOrderEndTime(orderEndTime);
				temp.setOrderAdress(orderAdress);
				temp.setOrderArea(orderArea);
				temp.setOrderStatus(orderStatus);
				temp.setPayment(payment);
				temp.setDelivery(delivery);
				return temp;
			}
		}
		return null;
	}

	@Override
	public boolean delete(Integer orderID) {
		if(orderID!=null) {
			OrdersBean temp = this.getSession().get(OrdersBean.class, orderID);
			if(temp!=null) {
				this.getSession().delete(temp);
				return true;
			}
		}
		return false;
	}
	
}
