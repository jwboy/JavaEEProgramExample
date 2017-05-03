package dao;

import java.sql.*; 
import java.util.*;
import vo.*;
import util.*;

public class StudentDAO {
	//For database operations
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	//Retrieve all students
	public List<Student> getAllStudents() {
		List<Student> list = new ArrayList();
		String sSql = "select * from Student0";
		try {
			rs = executeQuery(sSql);
			while(rs.next()) {
				Student temp = new Student();
				temp.setSid(rs.getString(1));
				temp.setSname(rs.getString(2));
				temp.setIage(rs.getInt(3));
				list.add(temp);
			}
		} catch(Exception e) {
			System.out.println(e.toString());
		} finally {
			close();
		}
		return list;
	}
	
	//Find a student by id
	public Student findStudentByID(String sID) {
		String sSql = "select * from Student0 where id = '" + sID + "'";
		try {
			rs = executeQuery(sSql);
			while(rs.next()) {
				Student temp = new Student();
				temp.setSid(rs.getString(1));
				temp.setSname(rs.getString(2));
				temp.setIage(rs.getInt(3));
				return temp;
			}
		} catch(Exception e) {
			System.out.println(e.toString());
		} finally {
			close();
		}
		return null;
	}
	
	//Add a student
	public void add(Student student) {
		String sSql = "insert into Student0(id, name, age) values('" 
			+ student.getSid() + "', '" + student.getSname() + "', " + student.getIage() + ")";
		try {
			executeUpdate(sSql);
		} catch(Exception e) {
			System.out.println(e.toString());
		} finally {
			close();
		}
	}
	
	//Delete a student
	public void delete(String sID) {
		String sSql = "delete from Student0 where id = '" + sID + "'";
		try {
			executeUpdate(sSql);
		} catch(Exception e) {
			System.out.println(e.toString());
		} finally {
			close();
		}
	}
	
	//Edit a student
	public void edit(Student student) {
		String sSql = "update Student0 set name = '" + student.getSname() + "', age = " 
			+ student.getIage() + " where id = '" + student.getSid() + "'";
		try {
			executeUpdate(sSql);
		} catch(Exception e) {
			System.out.println(e.toString());
		} finally {
			close();
		}
	}
	
	//Execute sql update
	public int executeUpdate(String sSql) throws SQLException, ClassNotFoundException {
		return getStatement().executeUpdate(sSql);
	}
	
	//Execute sql query
	public ResultSet executeQuery(String sSql) throws SQLException, ClassNotFoundException {
		return getStatement().executeQuery(sSql);
	}
	
	//Obtain statement
	public Statement getStatement() throws SQLException, ClassNotFoundException {
		if(stmt == null) {
			stmt = DBConnection.getConnection().createStatement();
		}
		return stmt;
	}
	
	public void close() {
		if(rs != null) {
			try {
				rs.close();
			} catch(Exception e) {
				System.out.println(e.toString());
			}
		}
		if(stmt != null) {
			try {
				stmt.close();
			} catch(Exception e) {
				System.out.println(e.toString());
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}
	
	public void creatDB(){
		Connection c = null;
		Statement stmt = null;
		try {
			 Class.forName("org.sqlite.JDBC");
			 c= DriverManager.getConnection("jdbc:sqlite:d://ch07db.s3db");
			//Class.forName("com.mysql.jdbc.Driver");
			//c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			//String sql = "CREATE TABLE COMPANY " + "(ID INT PRIMARY KEY     NOT NULL,"
			//		+ " NAME           TEXT    NOT NULL, " + " AGE            INT     NOT NULL, "
			//		+ " ADDRESS        CHAR(50), " + " SALARY         REAL)";    
			String sql ="create table Student0 "
					    + "  (id   DECIMAL(20), "
						+ "   name CHAR(20),   "
					    + "   age  DECIMAL(3)) ";					
					
					
			stmt.executeUpdate(sql);
			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Table created successfully");
	}
}
