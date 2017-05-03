package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import povo.Notice;
import service.NoticeService;

/**
 * Servlet implementation class NoticeServlet
 */
@WebServlet("/NoticeServlet")
public class NoticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		String action =request.getParameter("action");
		NoticeService noticeService=new NoticeService();
		if("add".equals(action)){
			try{
				Notice notice=new Notice();
				notice.setTitle(request.getParameter("title"));
				notice.setLinktag(request.getParameter("linktag"));
				notice.setContent(request.getParameter("content"));
				notice.setAuthor(request.getParameter("author"));
				notice.setPhone(request.getParameter("phone"));
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				Date pt=sdf.parse(request.getParameter("publictime"));				
				notice.setPublictime(pt);
				noticeService.add(notice);
				String sForwardPage="success.jsp";
				RequestDispatcher rd=request.getRequestDispatcher(sForwardPage);
				rd.forward(request, response);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
