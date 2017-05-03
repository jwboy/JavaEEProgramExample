package dao;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vo.BaseHibernateDAO;
import vo.Seller;

/**
 * A data access object (DAO) providing persistence and search support for
 * Seller entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see vo.Seller
 * @author MyEclipse Persistence Tools
 */
public class SellerDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(SellerDAO.class);
	// property constants
	public static final String SELLER_NAME = "sellerName";
	public static final String SELLER_ACCOUNT = "sellerAccount";
	public static final String SELLER_PASSWORD = "sellerPassword";
	public static final String CREATED_AMOUNT = "createdAmount";

	public void save(Seller transientInstance) {
		log.debug("saving Seller instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Seller persistentInstance) {
		log.debug("deleting Seller instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Seller findById(java.lang.Integer id) {
		log.debug("getting Seller instance with id: " + id);
		try {
			Seller instance = (Seller) getSession().get("vo.Seller", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Seller instance) {
		log.debug("finding Seller instance by example");
		try {
			List results = getSession().createCriteria("vo.Seller").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Seller instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Seller as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySellerName(Object sellerName) {
		return findByProperty(SELLER_NAME, sellerName);
	}

	public List findBySellerAccount(Object sellerAccount) {
		return findByProperty(SELLER_ACCOUNT, sellerAccount);
	}

	public List findBySellerPassword(Object sellerPassword) {
		return findByProperty(SELLER_PASSWORD, sellerPassword);
	}

	public List findByCreatedAmount(Object createdAmount) {
		return findByProperty(CREATED_AMOUNT, createdAmount);
	}

	public List findAll() {
		log.debug("finding all Seller instances");
		try {
			String queryString = "from Seller";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Seller merge(Seller detachedInstance) {
		log.debug("merging Seller instance");
		try {
			Seller result = (Seller) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Seller instance) {
		log.debug("attaching dirty Seller instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Seller instance) {
		log.debug("attaching clean Seller instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}