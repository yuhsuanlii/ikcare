package orders;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrdersService {
	@Autowired
	private OrdersDAO ordersDAO;
	
	@Transactional(readOnly = true)
	public List<OrdersBean> select(OrdersBean bean){
		List<OrdersBean> result = null;
		if(bean!=null && bean.getOrderID()!=null && !bean.getOrderID().equals(0)) {
			OrdersBean temp = ordersDAO.select(bean.getOrderID());
			if(temp!=null) {
				result = new ArrayList<OrdersBean>();
				result.add(temp);
			}
		} else {
			result = ordersDAO.select();
		}
		return result;
	}
	public OrdersBean insert(OrdersBean bean) {
		OrdersBean result = null;
		if(bean!=null && bean.getOrderID()!=null) {
			result = ordersDAO.insert(bean);
			System.out.println("I'm from service and i have result");
		}
		return result;
	}
	public OrdersBean update(OrdersBean bean) {
		OrdersBean result = null;
		if(bean!=null && bean.getOrderID()!=null) {
			result = ordersDAO.update(bean.getOrderID(), bean.getUserAccount(),
					bean.getOrderTime(), bean.getOrderEndTime(), bean.getOrderAdress(),
					bean.getOrderArea(),bean.getOrderStatus(),bean.getPayment(),bean.getDelivery());
		}
		return result;
	}
	public boolean delete(OrdersBean bean) {
		boolean result = false;
		if(bean!=null && bean.getOrderID()!=null) {
			result = ordersDAO.delete(bean.getOrderID());
		}
		return result;
	}
}
