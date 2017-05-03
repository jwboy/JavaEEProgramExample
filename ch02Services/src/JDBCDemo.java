import java.sql.*;
import java.io.*;

public class JDBCDemo {
	public static void main(String args[]) {
		/* 初始化变量 */
		String user = "root"; // 用户名
		String pass = ""; // 口令
		String url = "jdbc:mysql://localhost:3306/acc"; // 数据源
		String driver = "org.gjt.mm.mysql.Driver"; // 数据库驱动程序
		// String driver = "com.mysql.jdbc.driver"; //数据库驱动程序
		String tableName = "member"; // 数据库中表名
		String sqlstr; // sql语句
		Connection con = null; // 连接对象
		Statement stmt = null; // 语句对象
		ResultSet rs = null; // 结果集对象
		try {
			/*
			 * 数据库连接 装载驱动――获取连接――创建语句对象
			 */
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
//			con = DriverManager.getConnection(url);
			stmt = con.createStatement();

			/* 书写SQL语句实现功能一 */
			sqlstr = "insert into " + tableName
					+ " values('000099990', 'zhhdhh', '123456')";
			stmt.executeUpdate(sqlstr);

			/* 书写SQL语句实现功能二 */
			sqlstr = "select * from " + tableName;
			rs = stmt.executeQuery(sqlstr);

			/* 进行数据处理 */
			ResultSetMetaData rsmd = rs.getMetaData(); // 获取元数据
			int j = 0;
			j = rsmd.getColumnCount(); // 获得结果集的行数
			for (int k = 0; k < j; k++) {
				System.out.print(rsmd.getColumnName(k + 1)); // 显示表中字段属性
				System.out.print("\t");
			}
			System.out.print("\n");
			while (rs.next()) // 显示结果集的内容
			{
				for (int i = 0; i < j; i++) {
					System.out.print(rs.getString(i + 1));
					System.out.print("\t");
				}
				System.out.print("\n");
			}
		}
		/* 异常处理 */
		catch (ClassNotFoundException e1) {
			System.out.println("数据库驱动不存在！");
			System.out.println(e1.toString());
		} catch (SQLException e2) {
			System.out.println("数据库异常！");
			System.out.println(e2.toString());
		}
		/* 关闭连接 */
		finally {
			try {
				/* 关闭对象 */
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				System.out.println(e.toString());
			}
		}
	}
}
