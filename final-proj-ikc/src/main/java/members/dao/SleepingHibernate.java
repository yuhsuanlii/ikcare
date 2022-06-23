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

import members.SleepingBean;
import members.SleepingDAO;

@Repository
public class SleepingHibernate implements SleepingDAO {
	@PersistenceContext
	private Session session;

	public Session getSession() {
		return session;
	}

	@Override
	public SleepingBean select(Integer sleepingid) {
		if (sleepingid != null) {
			return this.getSession().get(SleepingBean.class, sleepingid);
		}
		return null;
	}

	@Override
	public SleepingBean insert(SleepingBean bean) {
		if (bean != null && bean.getUseraccount() != null) {
			SleepingBean temp = this.getSession().get(SleepingBean.class, bean.getUseraccount());
			if (temp == null) {
				this.getSession().save(bean);
				return bean;
			}
		}
		return null;
	}

	@Override
	public List<SleepingBean> select() {
		CriteriaBuilder criteriaBuilder = this.getSession().getCriteriaBuilder();
		CriteriaQuery<SleepingBean> criteriaQuery = criteriaBuilder.createQuery(SleepingBean.class);

		Root<SleepingBean> root = criteriaQuery.from(SleepingBean.class);

		TypedQuery<SleepingBean> typedQuery = this.getSession().createQuery(criteriaQuery);
		List<SleepingBean> result = typedQuery.getResultList();
		if (result != null && !result.isEmpty()) {
			return result;
		}
		return null;
	}

	@Override
	public SleepingBean delete(Integer sleepingid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SleepingBean updata(Integer sleepingid, String UserAccount, Date SleepingDate, Integer SleetimeID,
			Float SleepingHour) {
		// TODO Auto-generated method stub
		return null;
	}

}
