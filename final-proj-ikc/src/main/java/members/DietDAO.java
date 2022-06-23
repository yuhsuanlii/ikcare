package members;

import java.util.List;

public interface DietDAO {
	public abstract DietBean select(Integer dietid);

	public abstract List<DietBean> select();
	
	public abstract DietBean insert(DietBean bean);
	
	public abstract DietBean delete(Integer dietid);
	
	public abstract DietBean updata(Integer dietid,String useraccount,java.util.Date dietdate,String  diettime);
}