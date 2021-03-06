package dao;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vo.Passport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Passport entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see vo.Passport
 * @author MyEclipse Persistence Tools
 */
public class PassportDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(PassportDAO.class);
	// property constants
	public static final String PASSPORT_NO = "passportNo";
	public static final String PASSPORT_TYPE = "passportType";

	public void save(Passport transientInstance) {
		log.debug("saving Passport instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Passport persistentInstance) {
		log.debug("deleting Passport instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Passport findById(java.lang.Integer id) {
		log.debug("getting Passport instance with id: " + id);
		try {
			Passport instance = (Passport) getSession().get("vo.Passport", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Passport instance) {
		log.debug("finding Passport instance by example");
		try {
			List results = getSession().createCriteria("vo.Passport").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Passport instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Passport as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPassportNo(Object passportNo) {
		return findByProperty(PASSPORT_NO, passportNo);
	}

	public List findByPassportType(Object passportType) {
		return findByProperty(PASSPORT_TYPE, passportType);
	}

	public List findAll() {
		log.debug("finding all Passport instances");
		try {
			String queryString = "from Passport";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Passport merge(Passport detachedInstance) {
		log.debug("merging Passport instance");
		try {
			Passport result = (Passport) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Passport instance) {
		log.debug("attaching dirty Passport instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Passport instance) {
		log.debug("attaching clean Passport instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}