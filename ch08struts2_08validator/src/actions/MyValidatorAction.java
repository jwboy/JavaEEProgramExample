package actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class MyValidatorAction extends ActionSupport{
	private String schoolName;
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
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String execute() throws Exception {
		return super.SUCCESS;
	}
	
}
