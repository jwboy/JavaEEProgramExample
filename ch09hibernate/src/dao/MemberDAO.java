package dao;

import vo.*;
import hs.*;
import java.util.List;
import org.hibernate.*;

public class MemberDAO {
	public void save(Member transientInstance) { // 保存对象
		try {
			getSession().save(transientInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	// 由属性获取对象
	public List<Member> findByProperty(String propertyName, Object value) {
		try {
			String queryString = "from Member as model where model." + propertyName + "= ?";
			Query<Member> queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			throw re;
		}
	}
	
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
}
