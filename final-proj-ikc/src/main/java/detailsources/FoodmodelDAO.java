package detailsources;

import java.util.List;

public interface FoodmodelDAO {
	public abstract FoodmodelBean select(Integer foodid);

	public abstract List<FoodmodelBean> select();

	public abstract FoodmodelBean insert(FoodmodelBean bean);

	public abstract FoodmodelBean update(Integer foodid, String foodname, Integer calorie, Integer fatpercentage,
			Integer gramsperserving);

	public abstract boolean delete(Integer foodid);

}