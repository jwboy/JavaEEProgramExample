package actions;

import com.opensymphony.xwork2.ActionSupport;

public class StudentRegisterAction extends ActionSupport {
	private String studentName;
	private String studentNo;
	private int age;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String execute() throws Exception {		
		return SUCCESS;
	}
}
