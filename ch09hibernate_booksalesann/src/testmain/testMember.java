package testmain;

import java.util.List;

import dao.MemberDAO;
import vo.Member;

public class testMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDAO mdao=new MemberDAO();
		Member member = new Member();
		member.setUsername("zhangsan");
		member.setPassword("000000");
		//mdao.getSession().getTransaction().begin();
		mdao.save(member);
		//mdao.getSession().getTransaction().commit();
		List<Member> ml = mdao.findByPassword("000");
		for (Member m1 : ml) {
			System.out.println(m1.getId());
			System.out.println(m1.getUsername());
			System.out.println(m1.getPassword());
			System.out.println(m1.getCreatedate());
		}
	}

}
