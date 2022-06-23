package products;

import java.util.List;

public interface ProductsDAO {
	public abstract ProductsBean select( Integer productid);
	
	public abstract List<ProductsBean> select();
	
	public abstract ProductsBean insert(ProductsBean bean);
	
	public abstract ProductsBean update(Integer productid, String productname,
				short suppliesid, byte[] productImg, Integer standardcost, Integer productstock, String productdescribe, String productstatus);
	
	public abstract boolean delete(Integer productid);	
}
