package members;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MemberSportService {
	@Autowired
	private MemberSportDAO memberSportDAO;
	
	public List<MemberSportBean> select(MemberSportBean bean) {
		List<MemberSportBean> result = null;
		if (bean != null && bean.getSprotid() != null && bean.getSprotid() != 0) {
			MemberSportBean temp = memberSportDAO.select(bean.getSprotid());
			if (temp != null) {
				result = new ArrayList<MemberSportBean>();
				result.add(temp);
			}
		} else {
			result = memberSportDAO.select();
		}
		return result;
	}
}
