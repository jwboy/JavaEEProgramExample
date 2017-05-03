package actions;

import java.math.BigDecimal;
import java.util.List;

import beans.Score;
import beans.Student;

import com.opensymphony.xwork2.ActionSupport;

public class ScoreAction extends ActionSupport {
	private List<Student> students;
	

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}


	@Override
	public String execute() throws Exception {
		int size = students.size();
		for(int i = 0; i<size; i++){
			Student st = students.get(i);
			Score score = st.getScore();
			double aveScore = (score.getCcScore()+score.getJ2eeScore()+score.getJavaScore())/3.0;
			BigDecimal   b   =   new   BigDecimal(aveScore); 
			aveScore   =   b.setScale(1,   BigDecimal.ROUND_HALF_UP).doubleValue();  
			score.setAveScore(aveScore);
		}
		return super.SUCCESS;
	}
}
