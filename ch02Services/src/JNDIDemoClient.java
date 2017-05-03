
import javax.naming.*;
import java.util.Properties;

public class JNDIDemoClient {
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
			String s = (String) ctx.lookup(sName);
			System.out.println(sName + " lookup: " + s);
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
