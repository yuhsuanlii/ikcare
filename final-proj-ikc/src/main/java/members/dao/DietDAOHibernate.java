package members.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import members.DietBean;
import members.DietDAO;

@Repository
public class DietDAOHibernate implements DietDAO {
	@PersistenceContext
	private Session session;

	public Session getSession() {
		return session;
	}

	@Override
	public DietBean select(Integer dietid) {
		if (dietid != null) {
			return this.getSession().get(DietBean.class, dietid);
		}
		return null;
	}

	@Override
	public DietBean insert(DietBean bean) {
		if (bean != null && bean.getUseraccount() != null) {
			DietBean temp = this.getSession().get(DietBean.class, bean.getUseraccount());
			if (temp == null) {
				this.getSession().save(bean);
				return bean;
			}
		}
		return null;
	}

	@Override
	public List<DietBean> select() {
		CriteriaBuilder criteriaBuilder = this.getSession().getCriteriaBuilder();
		CriteriaQuery<DietBean> criteriaQuery = criteriaBuilder.createQuery(DietBean.class);

		Root<DietBean> root = criteriaQuery.from(DietBean.class);

		TypedQuery<DietBean> typedQuery = this.getSession().createQuery(criteriaQuery);
		List<DietBean> result = typedQuery.getResultList();
		if (result != null && !result.isEmpty()) {
			return result;
		}
		return null;
	}

	@Override
	public DietBean delete(Integer dietid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DietBean updata(Integer dietid, String useraccount, Date dietdate, String diettime) {
		// TODO Auto-generated method stub
		return null;
	}

}
