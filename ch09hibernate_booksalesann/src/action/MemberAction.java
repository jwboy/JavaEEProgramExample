package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.MemberDAO;
import vo.Member;

public class MemberAction extends ActionSupport implements ModelDriven<Member> {
	private Member member = new Member();

	@Override
	public Member getModel() {
		// TODO Auto-generated method stub
		return member;
	}

	public String loginValidate() throws Exception {
	 
	     System.out.println(getModel().getUsername());
	     System.out.println(getModel().getPassword());
	     
		MemberDAO mdao=new MemberDAO();
	     List<Member> lm=mdao.findByUsername(getModel().getUsername());
	     if(lm.size()!=1)
	     {
	    	//ÓÃ»§Ãû´íÎó 
	    	 this.addActionError("ÓÃ»§Ãû´íÎó£¡£¡£¡");
	    	 return INPUT;
	     }
	    else
	    if(lm.get(0).getPassword().equals(getModel().getPassword())){
	    	//ÃÜÂë´íÎó
	    	this.addActionError("ÃÜÂë´íÎó£¡£¡£¡");
	     	 return INPUT;	 
	     }
		return SUCCESS;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		super.validate();
	}

}
