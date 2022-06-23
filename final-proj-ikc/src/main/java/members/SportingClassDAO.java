package members;

import java.util.List;

public interface SportingClassDAO {
	public abstract SportingClassBean select(Integer SportClass);

	public abstract List<SportingClassBean> select();
}
