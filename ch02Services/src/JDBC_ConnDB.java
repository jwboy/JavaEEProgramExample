import java.sql.*;

public class JDBC_ConnDB {
	public static void main(String args[]) {
		Connection c = null;
		try {
			// Class.forName("org.sqlite.JDBC");
			// c = DriverManager.getConnection("jdbc:sqlite:test.db");
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
	}
}
