package detailsources;

import java.util.List;

public interface MealExchangeListDAO {
	public abstract MealExchangeListBean select(Integer mealExchangeID);
	public abstract List<MealExchangeListBean> selectType(String foodtype);
}
