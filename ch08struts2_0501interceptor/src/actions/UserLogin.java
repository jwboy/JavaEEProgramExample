package actions;
import com.opensymphony.xwork2.ActionSupport;
public class UserLogin extends ActionSupport {
	private int time;
	private String username;
	private String password;

	@Override
	public String execute() throws Exception {
		return super.SUCCESS;
	}

	public String testTime() throws Exception {		
		Thread.sleep(5000);
		setUsername("jiawei");
		setPassword("passwd");
		timesAdd1();		
		return "timertest";
	}
	
	public String testToken(){
		return "tokenTest";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public  int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public  void timesAdd1(){
		time++;
	}
}
