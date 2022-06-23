package supplies;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SuppliesService {
	@Autowired
	private SuppliesDAO suppliesDAO ;

	@Transactional(readOnly = true)
	public SuppliesBean select(short suppliesid) {
		SuppliesBean bean = suppliesDAO.select(suppliesid);
		if (bean != null) {
			if (suppliesid>0 ) {
				//Integer id = bean.getSuppliesid();
				
				
					return bean;
				
			}
		}
		return null;
	}
	
	@Transactional(readOnly = true)
	public List<SuppliesBean> select(SuppliesBean bean) {
		List<SuppliesBean> result = null;
		if(bean!=null && bean.getSuppliesid()!=null && bean.getSuppliesid() != 0) {
			System.out.println(bean.getSuppliesid());
			SuppliesBean temp = suppliesDAO.select(bean.getSuppliesid());
			System.out.println(temp+"測試一");
			if(temp!=null) {
				result = new ArrayList<SuppliesBean>();
				result.add(temp);
			}
		} else {
			System.out.println("我在這");
			result = suppliesDAO.select();
		}
		return result;
	}

	public SuppliesBean insert(SuppliesBean bean) {
		SuppliesBean result = null;
		if (bean != null && bean.getSuppliesname() != null) {
			result = suppliesDAO.insert(bean);
		}
		return result;
	}
	
	public SuppliesBean update(SuppliesBean bean) {
		SuppliesBean result = null;
		if(bean!=null && bean.getSuppliesname()!=null) {
			System.out.println("測試二"+bean);
			result = suppliesDAO.update(bean.getSuppliesid(),bean.getSuppliesname(), bean.getContactperson(),
					bean.getPosition(), bean.getSuppliesphone(), bean.getFax(),bean.getSuppliesadress()
					,bean.getSuppliesarea());
		}
		return result;
	}
	public boolean delete(SuppliesBean bean) {
		boolean result = false;
		if(bean!=null && bean.getSuppliesname()!=null) {
			result = suppliesDAO.delete(bean.getSuppliesid());
		}
		return result;
	}
	
	
}
