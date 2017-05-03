package dao;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vo.CategoryItem;
import vo.CategoryItemId;

/**
 * A data access object (DAO) providing persistence and search support for
 * CategoryItem entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see vo.CategoryItem
 * @author MyEclipse Persistence Tools
 */
public class CategoryItemDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(CategoryItemDAO.class);
	// property constants

	public void save(CategoryItem transientInstance) {
		log.debug("saving CategoryItem instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CategoryItem persistentInstance) {
		log.debug("deleting CategoryItem instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CategoryItem findById(vo.CategoryItemId id) {
		log.debug("getting CategoryItem instance with id: " + id);
		try {
			CategoryItem instance = (CategoryItem) getSession().get("vo.CategoryItem", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<CategoryItem> findByExample(CategoryItem instance) {
		log.debug("finding CategoryItem instance by example");
		try {
			List<CategoryItem> results = (List<CategoryItem>) getSession().createCriteria("vo.CategoryItem")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding CategoryItem instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from CategoryItem as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CategoryItem instances");
		try {
			String queryString = "from CategoryItem";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CategoryItem merge(CategoryItem detachedInstance) {
		log.debug("merging CategoryItem instance");
		try {
			CategoryItem result = (CategoryItem) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CategoryItem instance) {
		log.debug("attaching dirty CategoryItem instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CategoryItem instance) {
		log.debug("attaching clean CategoryItem instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}