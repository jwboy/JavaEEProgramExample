package actions;

import beans.Student;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudentRegisterModelDriverAction extends ActionSupport implements ModelDriven<Student> {
	private Student student = new Student();
	public Student getModel() {
		return student;
	}
	public StudentRegisterModelDriverAction(){
		System.out.println("start to construtor");
		getModel().setStudentName("张三");
		getModel().setStudentNo("111111");
		getModel().setAge(18);		
	}
	public String oneNewRegister(){	
		System.out.println("start to oneNewRegister");
		getModel().setAge(120);
		getModel().setStudentName("李四");
		getModel().setStudentNo("12345");
		return SUCCESS;
	}

	@Override
	public String execute() throws Exception {		
		return SUCCESS;
	}
	@Override
	public void validate() {
		System.out.println("start to validate");
		if(student.getStudentName() == null||student.getStudentName().trim().length()==0){
			this.addFieldError("studentName", "用户名不能为空");
		}
		if(student.getStudentNo()== null||student.getStudentNo().trim().length()==0){
			this.addFieldError("studentNo", "学号不能为空");
		}

		if(student.getAge()<=0||student.getAge()>=100){
			this.addFieldError("age", "年龄不符合规定");
		}		
	}
}
