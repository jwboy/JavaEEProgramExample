package beans;

public class Score {	
    private int javaScore;
    private int j2eeScore;
    private int ccScore;
    private double aveScore;
	
	
	public int getCcScore() {
		return ccScore;
	}
	public void setCcScore(int ccScore) {
		this.ccScore = ccScore;
	}
	public int getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}
	
	public int getJ2eeScore() {
		return j2eeScore;
	}
	public void setJ2eeScore(int j2eeScore) {
		this.j2eeScore = j2eeScore;
	}
	
	public double getAveScore() {
		return aveScore;
	}
	public void setAveScore(double aveScore) {
		this.aveScore = aveScore;
	}
	@Override
	public String toString() {
		return "Score [aveScore=" + aveScore + ", cScore=" + ccScore
				+ ", j2eeScore=" + j2eeScore + ", javaScore=" + javaScore + "]";
	}
	
}
