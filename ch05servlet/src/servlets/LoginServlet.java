package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

@WebServlet(name="LoginServlet",urlPatterns="/servlet/loginservlet")
public class LoginServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public LoginServlet() {
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
		doPost(request, response);
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

		// 从提交参数中获取用户名和口令
		String uName = request.getParameter("uName");
		String passwd = request.getParameter("passwd");

		// 若从参数中没有获取到登录信息，则从Cookie中获取
		if (uName == null) {
			Cookie[] cks = request.getCookies();
			if (cks != null) {
				for (Cookie ck : cks) {
					if ("uName".equals(ck.getName())) {
						uName = ck.getValue();
					}
					if ("passwd".equals(ck.getName())) {
						passwd = ck.getValue();
					}
				}
			}
		}

		if ("maxii".equals(uName) && "1234".equals(passwd)) {
			// 验证成功，将用户名和口令写入Cookie保存到客户端
			Cookie ck = new Cookie("uName", uName);
			// 设置7天后过期
			ck.setMaxAge(60 * 60 * 24 * 7);
			response.addCookie(ck);
			ck = new Cookie("passwd", passwd);
			ck.setMaxAge(60 * 60 * 24 * 7);
			response.addCookie(ck);
			// 此处加入跳转到登录后应看到的页面
			PrintWriter out = response.getWriter();
			out.println("<h1>登录成功！！</h1>");
			out.flush();
			out.close();
		} else {
			// 转向登录页面
			response.sendRedirect("../login01.html");
		}
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
