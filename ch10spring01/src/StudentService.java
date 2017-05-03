
import dao.StudentDAO;
import model.Student;

public class StudentService {
	private StudentDAO studentDAO;

	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void add(Student student) {
		studentDAO.save(student);
	}

	public StudentDAO getStudentDAO() {
		return studentDAO;
	}

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

}
