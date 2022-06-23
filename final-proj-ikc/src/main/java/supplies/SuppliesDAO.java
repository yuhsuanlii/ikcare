package supplies;

import java.util.List;

public interface SuppliesDAO {
	
    public abstract SuppliesBean select(short suppliesid);
    
    public abstract List<SuppliesBean> select();
	
	public abstract SuppliesBean insert(SuppliesBean bean);
	
	public abstract boolean  delete(short suppliesid);
	
	
	public abstract SuppliesBean update(short suppliesid,String suppliesname,String contactperson,String position,String suppliesphone,
			String fax,String suppliesadress,String suppliesarea
			);

}
