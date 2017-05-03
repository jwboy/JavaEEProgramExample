package servlet;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.RequestDispatcher;
import java.util.*;
import vo.*;
import dao.*;


public class StudentServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public StudentServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");	
		
		String sID = request.getParameter("sid");
		String sName = request.getParameter("sname");
		String sAge = request.getParameter("sage");
		//System.out.println("age: " + sAge);
		
		String sAction = request.getParameter("action");
		System.out.println("action: " + sAction);
		
		StudentDAO studentDAO = new StudentDAO();
		
		String sForward="student?action=list";
		if(sAction.equals("list")) {
			List<Student> list = studentDAO.getAllStudents();
			request.setAttribute("studentlist", list);
			sForward = "studentlist.jsp";
		} else if(sAction.equals("addsave")) {
			Student student = new Student();
			student.setSid(sID);
			student.setSname(sName);
			int iAge = Integer.valueOf(sAge);
			student.setIage(iAge);
			studentDAO.add(student);
			sForward = "student?action=list";
		}else if(sAction.equals("editsave")) {
			Student student = new Student();
			student.setSid(sID);
			student.setSname(sName);
			int iAge = Integer.valueOf(sAge);
			student.setIage(iAge);
			studentDAO.edit(student);
			sForward = "student?action=list";
		}else if(sAction.equals("addnew")) {
			request.setAttribute("type", "add");
			sForward = "edituser.jsp";
		} else if(sAction.equals("findedit")) {
			Student student = studentDAO.findStudentByID(sID);
			request.setAttribute("student", student);
			request.setAttribute("type", "edit");
			sForward = "edituser.jsp";
		} else if(sAction.equals("delete")) {
			studentDAO.delete(sID);
			sForward = "student?action=list";
		} else {
			sForward = "student?action=list";
		}

		RequestDispatcher rd = request.getRequestDispatcher(sForward);
		rd.forward(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
		
	}

}
