package main;


import java.util.Calendar;
import java.util.Date;

import org.hibernate.Transaction;

import dao.BaseHibernateDAO;
import dao.MemberDAO;
import vo.Member;

public class testMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Member m=new Member();
       m.setUsername("jiawei");
       m.setPassword("123456");
       Calendar cal=Calendar.getInstance();
       Date today=cal.getTime();
       m.setCreatedate(today);  
      // BaseHibernateDAO bdao=new BaseHibernateDAO();
      // Transaction ts=bdao.getSession().beginTransaction();
       MemberDAO mdao=new MemberDAO();
       mdao.save(m);
      // ts.commit();
       
	}

}
