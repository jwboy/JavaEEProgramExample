package actions;

import com.opensymphony.xwork2.ActionSupport;

public class VisitorRegisterAction extends ActionSupport{
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
}
