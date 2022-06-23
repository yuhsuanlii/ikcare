package members.dao;

import java.util.List;

import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import members.BodyInformationBean;
import members.BodyInformationDAO;



@Repository
public class BodyInformationHibernate implements BodyInformationDAO {
	@PersistenceContext
	private Session session;

	public Session getSession() {
		return session;
	}

	@Override
	public BodyInformationBean select(Integer bodyid) {
		if (bodyid != null) {
			return this.getSession().get(BodyInformationBean.class, bodyid);
		}
		return null;
	}

	@Override
	public List<BodyInformationBean> select() {
		CriteriaBuilder criteriaBuilder = this.getSession().getCriteriaBuilder();
		CriteriaQuery<BodyInformationBean> criteriaQuery = criteriaBuilder.createQuery(BodyInformationBean.class);

		Root<BodyInformationBean> root = criteriaQuery.from(BodyInformationBean.class);

		TypedQuery<BodyInformationBean> typedQuery = this.getSession().createQuery(criteriaQuery);
		List<BodyInformationBean> result = typedQuery.getResultList();
		if (result != null && !result.isEmpty()) {
			return result;
		}
		return null;
	}
	
	@Override
	public BodyInformationBean insert(BodyInformationBean bean) {
		if (bean != null && bean.getUseraccount() != null) {
			BodyInformationBean temp = this.getSession().get(BodyInformationBean.class, bean.getUseraccount());
			if (temp == null) {
				this.getSession().save(bean);
				return bean;
			}
		}
		return null;
	}

	@Override
	public BodyInformationBean update(Integer bodyid, String useraccount, Float memberheight, Float memberweight) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer bodyid) {
		// TODO Auto-generated method stub
		return false;
	}
}
