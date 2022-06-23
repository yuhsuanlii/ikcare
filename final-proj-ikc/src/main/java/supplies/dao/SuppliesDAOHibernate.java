package supplies.dao;


import java.util.List;

import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import supplies.SuppliesBean;
import supplies.SuppliesDAO;

@Repository
public class SuppliesDAOHibernate implements SuppliesDAO {
	@PersistenceContext
	private Session session;

	public Session getSession() {
		return session;
	}
	
	@Override
	public SuppliesBean insert(SuppliesBean bean) {
		if (bean != null && bean.getSuppliesid() != null) {
			SuppliesBean temp = this.getSession().get(SuppliesBean.class, bean.getSuppliesid());
			if (temp == null) {
				this.getSession().save(bean);
				return bean;
			}
		}
		return null;
	}
	
	@Override
	public SuppliesBean select(short suppliesid) {
		if (suppliesid < 0) {
			return this.getSession().get(SuppliesBean.class, suppliesid);
		}
		return null;
		
	}
	
	@Override
	public List<SuppliesBean> select() {
//		return this.getSession().createQuery(
//				"FROM ProductBean", ProductBean.class).list();

		CriteriaBuilder criteriaBuilder = this.getSession().getCriteriaBuilder();
		CriteriaQuery<SuppliesBean> criteriaQuery = criteriaBuilder.createQuery(SuppliesBean.class);
		
//		FROM product
		Root<SuppliesBean> root = criteriaQuery.from(SuppliesBean.class);
		
		TypedQuery<SuppliesBean> typedQuery = this.getSession().createQuery(criteriaQuery);
		List<SuppliesBean> result = typedQuery.getResultList();
		if(result!=null && !result.isEmpty()) {
			return result;
		}
		return null;
	}
	

	public SuppliesBean update(SuppliesBean bean) {
		if(bean!=null && bean.getSuppliesid()!=null) {
			SuppliesBean temp = this.getSession().get(SuppliesBean.class, bean.getSuppliesid());
			if(temp!=null) {
				return (SuppliesBean) this.getSession().merge(bean);
			}
		}
		return null;
	}
	
	@Override
	public SuppliesBean update(short suppliesid,String suppliesname,String contactperson,String position,String suppliesphone,
			String fax,String suppliesadress,String suppliesarea) {
		if(suppliesid!=0) {
			SuppliesBean temp = this.getSession().get(SuppliesBean.class, suppliesid);
			if(temp!=null) {
				temp.setSuppliesid(suppliesid);
				temp.setSuppliesname(suppliesname);
				temp.setContactperson(contactperson);
				temp.setPosition(position);
				temp.setSuppliesphone(suppliesphone);
				temp.setFax(fax);
				temp.setSuppliesadress(suppliesadress);
				temp.setSuppliesarea(suppliesarea);
				return temp;
			}
		}
		return null;
	}
	
	@Override
	public boolean delete(short suppliesid) {
		if(suppliesid > 0) {
			SuppliesBean temp = this.getSession().get(SuppliesBean.class, suppliesid);
			if(temp!=null) {
				this.getSession().delete(temp);
				return true;
			}
		}
		return false;
	}
}

