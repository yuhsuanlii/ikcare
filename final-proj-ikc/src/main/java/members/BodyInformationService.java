package members;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BodyInformationService {
	@Autowired
	private BodyInformationDAO bodyInformationDAO;
	
	public List<BodyInformationBean> select(BodyInformationBean bean) {
		List<BodyInformationBean> result = null;
		if (bean != null && bean.getBodyid() != null && bean.getBodyid() != 0) {
			BodyInformationBean temp = bodyInformationDAO.select(bean.getBodyid());
			if (temp != null) {
				result = new ArrayList<BodyInformationBean>();
				result.add(temp);
			}
		} else {
			result = bodyInformationDAO.select();
		}
		return result;
	}
}
