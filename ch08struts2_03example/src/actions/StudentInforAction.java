package actions;

import com.opensymphony.xwork2.ActionSupport;

public class StudentInforAction extends ActionSupport {
	private String studentName;
	private String studentNo;
	private String password;
	private String major;
	
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.SUCCESS;
	}

}
