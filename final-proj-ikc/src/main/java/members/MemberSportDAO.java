package members;

import java.util.List;

public interface MemberSportDAO {
	public abstract MemberSportBean select(Integer sprotid);
	
	public abstract List<MemberSportBean> select();
	
	public abstract MemberSportBean insert(MemberSportBean bean);
	
	public abstract MemberSportBean update(Integer sprotid,String useraccount,java.util.Date sprotdate,Integer sportclass,Float sporthour);
	
	public abstract boolean delete(Integer sprotid);
}
