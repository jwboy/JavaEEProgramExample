package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDAO {
	private Connection con;
	protected PreparedStatement pstat;
	protected Statement stat;
	protected ResultSet rs;

	public BaseDAO() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String sconnStr = "jdbc:mysql://localhost:3306/ch14cms?charaterEncoding=UTF-8";
		con = DriverManager.getConnection(sconnStr, "root", "");
	}

	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stat != null) {
				stat.close();
			}
			if (pstat != null) {
				pstat.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	protected void executeUpdate(String sql ,Object[] Params)throws SQLException{
		pstat=con.prepareStatement(sql);
		int i=1;
		for (Object param:Params){
			pstat.setObject(i++, param);
		}
		pstat.execute();
	}
	protected void getStatment() throws SQLException{
		if(stat==null){
			stat=con.createStatement();
		}
	}
}
