package members;

import java.util.List;

public interface MembersDAO {
	public abstract MembersBean select(String useraccount);

	public abstract List<MembersBean> select();

	public abstract MembersBean insert(MembersBean bean);

	public abstract MembersBean update(String useraccount, String userpassword, String membername,
			java.util.Date birthday, String address, String telephone, String cellphone, String email, String userlevel,
			String area, String gender);

	public abstract boolean delete(String useraccount);

}