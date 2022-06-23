package members;

import java.util.List;

public interface SleetimeTypeDAO {
	public abstract SleetimeTypeBean select(Integer SleetimeID);

	public abstract List<SleetimeTypeBean> select();
}
