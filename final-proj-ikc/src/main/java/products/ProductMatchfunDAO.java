package products;

import java.util.List;

public interface ProductMatchfunDAO {
	public abstract ProductMatchfunBean select(Integer matchid);
	
	public abstract List<ProductMatchfunBean> select();
	
	public abstract ProductMatchfunBean insert(ProductMatchfunBean bean);
	
	public abstract ProductMatchfunBean update(Integer matchid, Integer productid, Integer functionalityid);
	
	public abstract boolean delete(Integer matchid);
}
