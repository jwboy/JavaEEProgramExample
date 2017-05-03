
import javax.naming.*;
import java.util.Properties;

public class JNDIDemoTomcat {
	public static void main(String[] args) {
		Context ctx = null;
		// 设定JNDI命名和目录服务管理器的相关属性
		Properties p = new Properties();
		
		//需要导入tomcat的两个包. catalina.jar(\lib下)和tomcat-juli(\bin下)
		p.put(Context.INITIAL_CONTEXT_FACTORY,
				"org.apache.naming.java.javaURLContextFactory");
		p.put(Context.PROVIDER_URL, "localhost");
		
//		p.put(Context.INITIAL_CONTEXT_FACTORY,
//			"com.sun.jndi.rmi.registry.RegistryContextFactory");
//		p.put(Context.PROVIDER_URL, "rmi://localhost:1099");

		try {
			ctx = new InitialContext(p); // 初始化JNDI上下文
			String sName = "jnditest";
			ctx.bind(sName, "JNDI Test"); // 将名字name绑定为字符串对象JNDI Test
			String s = (String) ctx.lookup(sName);
			System.out.println(sName + " lookup: " + s);
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
