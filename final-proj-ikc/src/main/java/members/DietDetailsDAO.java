package members;

import java.util.List;

public interface DietDetailsDAO {
	public abstract DietBean select(Integer dietdetailid);

	public abstract List <DietDetailsBean>  select();
	
	public abstract DietDetailsBean insert(DietDetailsBean bean);
	
	public abstract DietDetailsBean delete(Integer dietdetailid);
	
	public abstract DietDetailsBean updata(Integer dietdetailid,Integer dietid,Integer sampleid,Integer foodid,Integer foodnumber);
}