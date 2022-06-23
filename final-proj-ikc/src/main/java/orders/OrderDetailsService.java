package orders;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderDetailsService {
	@Autowired
	private OrderDetailsDAO orderDetailsDAO;
	
	@Transactional(readOnly = true)
	public List<OrderDetailsBean> selectFK(OrderDetailsBean bean) {
		List<OrderDetailsBean> result = null;
		if (bean != null && bean.getOrderID() != null && !bean.getOrderID().equals(0)) {
			List<OrderDetailsBean> temp = orderDetailsDAO.selectFK(bean.getOrderID());
			System.out.println("[service] "+temp);
			if (temp != null) {
				result = new ArrayList<OrderDetailsBean>();
				result = temp;
			}
		}
		return result;
	}
	
	public List<OrderDetailsBean> select(OrderDetailsBean bean){
		List<OrderDetailsBean> result = null;
		if(bean!=null && bean.getOrderDetailID()!=null && !bean.getOrderDetailID().equals(0)) {
			OrderDetailsBean temp = orderDetailsDAO.select(bean.getOrderDetailID());
			if(temp!=null) {
				result = new ArrayList<OrderDetailsBean>();
				result.add(temp);
			}
		} else {
			result = orderDetailsDAO.select();
		}
		return result;	
	}

	public OrderDetailsBean insert(OrderDetailsBean bean) {
		OrderDetailsBean result = null;
		if (bean != null && bean.getOrderID() != null && bean.getProductID() != null) {
			result = orderDetailsDAO.insert(bean);
		}
		return result;
	}

	public OrderDetailsBean update(OrderDetailsBean bean) {
		OrderDetailsBean result = null;
		if (bean != null && bean.getOrderDetailID() != null) {
			result = orderDetailsDAO.update(bean.getOrderDetailID(), bean.getOrderID(), bean.getProductID(),
					bean.getUnitPrice(), bean.getOrderQuantity(), bean.getDiscount());
		}
		return result;
	}

	public boolean delete(OrderDetailsBean bean) {
		boolean result = false;
		if (bean != null && bean.getOrderDetailID() != null) {
			result = orderDetailsDAO.delete(bean.getOrderID());
		}
		return result;
	}

}
