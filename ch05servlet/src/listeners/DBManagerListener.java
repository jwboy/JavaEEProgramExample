package listeners;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DBManagerListener implements ServletContextListener {
	// 应用将被关闭时调用此方法
	public void contextDestroyed(ServletContextEvent sce) {
		// 得到上下文对象
		ServletContext ctx = sce.getServletContext();
		// 获取绑定的数据库连接对象
		Object con = ctx.getAttribute("DBCon");
		if (con != null) {
			Connection conn = (Connection) con;
			try {
				if (!conn.isClosed()) {
					conn.close();
					System.out.println("关闭数据库连接......");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 应用被创建时调用该方法
	public void contextInitialized(ServletContextEvent sce) {
		try {
			// 创建数据库连接
			//Class.forName("com.mysql.jdbc.Driver");
			//Connection con = DriverManager.getConnection(	"jdbc:mysql://localhost:3306/test", "root", "");
			 Class.forName("org.sqlite.JDBC");
			 Connection con = DriverManager.getConnection("jdbc:sqlite:test.db");


			// 得到上下文对象
			ServletContext ctx = sce.getServletContext();
			// 将连接对象绑定到上下文
			ctx.setAttribute("DBCon", con);
			System.out.println("创建数据库连接成功......");
		} catch (ClassNotFoundException e) {
			System.out.println("创建数据库连接失败......");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("创建数据库连接失败......");
			e.printStackTrace();
		}
	}
}
