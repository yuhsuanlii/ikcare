package members;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DietService {
	@Autowired
	private DietDAO dietDAO;
	
	public List<DietBean> select(DietBean bean) {
		List<DietBean> result = null;
		if (bean != null && bean.getDietid() != null && bean.getDietid() != 0) {
			DietBean temp = dietDAO.select(bean.getDietid());
			if (temp != null) {
				result = new ArrayList<DietBean>();
				result.add(temp);
			}
		} else {
			result = dietDAO.select();
		}
		return result;
	}
}
