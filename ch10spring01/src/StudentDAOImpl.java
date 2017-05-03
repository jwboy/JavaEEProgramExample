
import dao.StudentDAO;
import model.Student;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		System.out.println(student);
		System.out.println("Student is saved");
	}

}
