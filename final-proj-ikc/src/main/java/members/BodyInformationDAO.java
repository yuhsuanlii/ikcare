package members;

import java.util.List;

public interface BodyInformationDAO {
	public abstract BodyInformationBean select(Integer bodyid);

	public abstract List<BodyInformationBean> select();

	public abstract BodyInformationBean insert(BodyInformationBean bean);

	public abstract BodyInformationBean update(Integer bodyid, String useraccount, Float memberheight,
			Float memberweight);

	public abstract boolean delete(Integer bodyid);

}