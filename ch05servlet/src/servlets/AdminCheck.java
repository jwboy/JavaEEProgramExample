package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;

public class AdminCheck extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AdminCheck() {
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
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 得到上下文
		ServletContext context = getServletContext();
		// 得到上下文参数中的管理员用户名和口令
		String admin = context.getInitParameter("adminName");
		String passwd = context.getInitParameter("adminPasswd");

		// 设置请求对象的编码为UTF-8
		request.setCharacterEncoding("UTF-8");
		// 获取客户端提交的用户名
		String uName = request.getParameter("userName");
		// 获取口令
		String uPasswd = request.getParameter("passwd");

		// 设置响应对象的编码
		response.setCharacterEncoding("UTF-8");
		// 获得输出对象，准备向客户端输出信息
		PrintWriter out = response.getWriter();
		// 设置响应内容类型
		response.setContentType("text/html;charset= UTF-8");

		// 如果提交的用户名和口令正确
		if (admin.equals(uName) && passwd.equals(uPasswd)) {
			// 得到应用部署在
			String realPath = context.getRealPath("/");
			out.println("部署的真实路径为：" + realPath);
		} else {
			out.println("用户名或口令错....");
		}

		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 当用户使用Post方法请求时，采用和Get方法相同的处理方法
		doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
