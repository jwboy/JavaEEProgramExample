package actions;
import com.opensymphony.xwork2.ActionSupport;
public class UserLogin extends ActionSupport {
	private static int time = 0;
	private String username;
	private String password;

	@Override
	public String execute() throws Exception {
		setTime(500);
		return super.SUCCESS;
	}

	public String testTime() throws Exception {		
		setTime(500);
		timesAdd1();
		Thread.sleep(500);
		return "timerTest";
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

	public static int getTime() {
		return time;
	}

	public static void setTime(int time) {
		UserLogin.time = time;
	}

	public static void timesAdd1(){
		time++;
	}
}
