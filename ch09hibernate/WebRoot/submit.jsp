<%@ page language="java" import="java.util.*, hs.*, dao.*, vo.*"
	pageEncoding="UTF-8"%>
<%!
public static String codeString(String s) { //乱码处理
		String str = s;
		try {
			byte b[] = str.getBytes("ISO-8859-1");
			str = new String(b, "UTF-8");
			return str;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
%>
<%
	String username = codeString(request.getParameter("username")); //获取用户名
	String password = codeString(request.getParameter("password")); //获取密码
	MemberDAO memberDAO = new MemberDAO();
	Member member = new Member(); //封装
	member.setUsername(username);
	member.setPassword(password);
	memberDAO.save(member); //调用方法保存对象
	out.print("注册成功<br>");
	List l = memberDAO.findByProperty("username", username); //从数据库中加载对象
	Iterator it = l.iterator();
	if (it.hasNext()) {
		Member m = (Member) it.next();
		out.print("用户名：" + m.getUsername() + "<br>");
		out.print("密码：" + m.getPassword() + "<br>");
	} else {
		out.print("数据库中不存在该用户！");
	}
%>
