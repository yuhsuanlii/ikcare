package products;

import java.util.List;

public interface ProductElementDAO {
	public abstract ProductElementBean select(Integer elementid);
	
	public abstract List<ProductElementBean> select();
	
	public abstract ProductElementBean insert(ProductElementBean bean);
	
	public abstract ProductElementBean update(Integer elementid, String elements);
	
	public abstract boolean delete(Integer elementid);
}
