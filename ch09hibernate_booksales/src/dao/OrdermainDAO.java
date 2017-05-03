package dao;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vo.Ordermain;

/**
 * A data access object (DAO) providing persistence and search support for
 * Ordermain entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see vo.Ordermain
 * @author MyEclipse Persistence Tools
 */
public class OrdermainDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(OrdermainDAO.class);
	// property constants
	public static final String ORDER_NAME = "orderName";
	public static final String ORDER_STATUS = "orderStatus";
	public static final String BUYER_NAME = "buyerName";

	public void save(Ordermain transientInstance) {
		log.debug("saving Ordermain instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Ordermain persistentInstance) {
		log.debug("deleting Ordermain instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ordermain findById(java.lang.Integer id) {
		log.debug("getting Ordermain instance with id: " + id);
		try {
			Ordermain instance = (Ordermain) getSession().get("vo.Ordermain", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Ordermain instance) {
		log.debug("finding Ordermain instance by example");
		try {
			List results = getSession().createCriteria("vo.Ordermain").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Ordermain instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Ordermain as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOrderName(Object orderName) {
		return findByProperty(ORDER_NAME, orderName);
	}

	public List findByOrderStatus(Object orderStatus) {
		return findByProperty(ORDER_STATUS, orderStatus);
	}

	public List findByBuyerName(Object buyerName) {
		return findByProperty(BUYER_NAME, buyerName);
	}

	public List findAll() {
		log.debug("finding all Ordermain instances");
		try {
			String queryString = "from Ordermain";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Ordermain merge(Ordermain detachedInstance) {
		log.debug("merging Ordermain instance");
		try {
			Ordermain result = (Ordermain) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Ordermain instance) {
		log.debug("attaching dirty Ordermain instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ordermain instance) {
		log.debug("attaching clean Ordermain instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}