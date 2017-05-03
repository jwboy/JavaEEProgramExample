package testmain;

import java.util.Date;
import java.util.List;

import dao.MemberDAO;
import vo.Member;

public class testMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDAO mdao = new MemberDAO();
		
		Member[] m= new Member[1];
		for(int i=0;i<m.length;i++){
			m[i]=new Member();
			m[i].setUsername("aaa");
			m[i].setPassword("000");
			m[i].setCreatedate(new Date());
			mdao.save(m[i]);		
		}
		List<Member> lm = mdao.findByPassword("000");
		for (Member m1 : lm) {
			System.out.println(m1.getId());
			System.out.println(m1.getUsername());
			System.out.println(m1.getPassword());
			System.out.println(m1.getCreatedate());
		}
	}
}
