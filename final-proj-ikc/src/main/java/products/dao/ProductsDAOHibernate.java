package products.dao;

import java.util.List;

import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import products.ProductsBean;
import products.ProductsDAO;

@Repository
public class ProductsDAOHibernate implements ProductsDAO {
	@PersistenceContext
	private Session session;

	public Session getSession() {
		return session;
	}

	@Override
	public ProductsBean select(Integer productid) {
		if (productid != null) {
			return this.getSession().get(ProductsBean.class, productid);
		}
		return null;
	}

	@Override
	public ProductsBean insert(ProductsBean bean) {
		if (bean != null && bean.getProductid() != null) {
			ProductsBean temp = this.getSession().get(ProductsBean.class, bean.getProductid());
			if (temp == null) {
				this.getSession().save(bean);
				return bean;
			}
		}
		return null;
	}

	@Override
	public List<ProductsBean> select() {
		
		CriteriaBuilder criteriaBuilder = this.getSession().getCriteriaBuilder();
		
		CriteriaQuery<ProductsBean> criteriaQuery = criteriaBuilder.createQuery(ProductsBean.class);
		
		
//		FROM product
		Root<ProductsBean> root = criteriaQuery.from(ProductsBean.class);
		
		TypedQuery<ProductsBean> typedQuery = this.getSession().createQuery(criteriaQuery);
		List<ProductsBean> result = typedQuery.getResultList();
		if(result!=null && !result.isEmpty()) {
			return result;
		}
		return null;
	}

	@Override
	public ProductsBean update(Integer productid, String productname,
			short suppliesid, byte[] productlmg, Integer standardcost, Integer productstock, String productdescribe, String productstatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer productname) {
		if(productname!=null) {
			ProductsBean temp = this.getSession().get(ProductsBean.class, productname);
			if(temp!=null) {
				this.getSession().delete(temp);
				return true;
			}
		}
		return false;
	}
}
