package orders;

import java.util.List;

public interface OrdersDAO {
	public abstract OrdersBean select(Integer orderID);
	public abstract List<OrdersBean> select();
	public abstract OrdersBean insert(OrdersBean bean);
	public abstract OrdersBean update(Integer orderID,String userAccount,java.util.Date orderTime,java.util.Date orderEndTime,String orderAdress,String orderArea,String orderStatus,String payment,String delivery);
	public abstract boolean delete(Integer orderID);
}
