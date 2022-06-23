package members;

import java.util.List;

public interface SleepingDAO {
	public abstract SleepingBean select(Integer sleepingid);
	
    public abstract List <SleepingBean>  select();
	
	public abstract SleepingBean insert(SleepingBean bean);
	
	public abstract SleepingBean delete(Integer sleepingid);
	
	public abstract SleepingBean updata(Integer sleepingid,String UserAccount,java.util.Date SleepingDate,Integer SleetimeID,Float SleepingHour);


}
