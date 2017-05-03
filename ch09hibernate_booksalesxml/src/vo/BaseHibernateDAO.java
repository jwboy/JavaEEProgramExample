package vo;

import hbsf.HibernateSessionFactory;
import org.hibernate.Session;

import dao.IBaseHibernateDAO;


/**
 * Data access object (DAO) for domain model
 * @author MyEclipse Persistence Tools
 */
public class BaseHibernateDAO implements IBaseHibernateDAO {
	
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
	
}