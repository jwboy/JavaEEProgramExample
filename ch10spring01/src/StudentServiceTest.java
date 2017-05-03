
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Student;
import service.StudentService;

public class StudentServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService service = (StudentService) ctx.getBean("studentService");
		Student s = new Student();
		s.setStudentid(20170101);
		s.setName("zhansan");
		s.setGender("male");
		service.add(s);

	}

}
