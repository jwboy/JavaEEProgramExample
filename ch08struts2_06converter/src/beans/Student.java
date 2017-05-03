package beans;

public class Student {
	private String name;
	private long number;
	private Score score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", score="
				+ score + "]";
	}
	
}
