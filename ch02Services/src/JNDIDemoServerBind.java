
import javax.naming.*;
import java.util.Properties;

public class JNDIDemoServerBind {
	public static void main(String[] args) {
		Context ctx = null;
		// 设定JNDI命名和目录服务管理器的相关属性
		Properties p = new Properties();
		p.put(Context.INITIAL_CONTEXT_FACTORY,
				"org.jnp.interfaces.NamingContextFactory");
		p.put(Context.PROVIDER_URL, "jnp://localhost:1099");
		try {
			ctx = new InitialContext(p); // 初始化JNDI上下文
			String sName = "jnditest";
			ctx.bind(sName, "JNDI Test"); // 将名字name绑定为字符串对象JNDI Test
			System.out.println(sName + " bind: " + sName);
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
