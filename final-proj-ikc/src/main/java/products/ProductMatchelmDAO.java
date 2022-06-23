package products;

import java.util.List;

public interface ProductMatchelmDAO {
	public abstract ProductMatchelmBean select(Integer matchid);
	
	public abstract List<ProductMatchelmBean> select();
	
	public abstract ProductMatchelmBean insert(ProductMatchelmBean bean);
	
	public abstract ProductMatchelmBean update(Integer matchid, Integer productid, Integer elementid);
	
	public abstract boolean delete(Integer matchid);
}
