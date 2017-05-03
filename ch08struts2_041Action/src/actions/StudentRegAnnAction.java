package actions;

import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("struts-default")
@Results({ @Result(name = "success", location = "/student/studentRegInforShow.jsp"),
		@Result(name = "input", location = "/student/StudentRegisterAnnotated.jsp") })
public class StudentRegAnnAction extends ActionSupport {
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

	@Override
	public void validate() {
		if (studentName == null || studentName.trim().length() == 0) {
			this.addFieldError("studentName", "用户名不能为空");
		}
		if (studentNo == null || studentNo.trim().length() == 0) {
			this.addFieldError("studentNo", "学号不能为空");
		}
		if (age <= 0 || age >= 100) {
			this.addFieldError("age", "年龄不符合规定");
		}
	}
}
