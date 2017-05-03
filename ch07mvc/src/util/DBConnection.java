package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection(){
		Connection conn=null;
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			//conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");			
			 Class.forName("org.sqlite.JDBC");
			 conn= DriverManager.getConnection("jdbc:sqlite:d://ch07db.s3db");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}
