package products;

import java.util.List;

public interface ProductFunctionalityDAO {
	public abstract ProductFunctionalityBean select(Integer functionalityid);
	
	public abstract List<ProductFunctionalityBean> select();
	
	public abstract ProductFunctionalityBean insert(ProductFunctionalityBean bean);
	
	public abstract ProductFunctionalityBean update(Integer functionalityid, String functionality);
	
	public abstract boolean delete(Integer functionalityid);
}
