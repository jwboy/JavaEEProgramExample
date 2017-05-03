<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    //userList用于模拟一个用户信息表，每个用户信息为一个map，包括登录名、口令、昵称
    ArrayList<HashMap<String,String>> userList = new ArrayList<HashMap<String,String>>();
    HashMap<String,String> user1 = new HashMap<String,String>();
    user1.put("loginName","luccy");//登录名
    user1.put("passwd","123456");//登录口令
    user1.put("nickName","李杰");//昵称
    userList.add(user1);    
    HashMap<String,String> user2 = new HashMap<String,String>();
    user2.put("loginName","tty");//登录名
    user2.put("passwd","123456");//登录口令
    user2.put("nickName","王茜");//昵称
    userList.add(user2);
    HashMap<String,String> user3 = new HashMap<String,String>();
    user3.put("loginName","nym");//登录名
    user3.put("passwd","123");//登录口令
    user3.put("nickName","聂");//昵称
    userList.add(user3);

    
    //获取提交的用户名和口令
    String uName = request.getParameter("uName");
    String passwd = request.getParameter("uPasswd");    
    //验证
    boolean checkOK = false;
    for(HashMap<String,String> user:userList){
    	  if(user.get("loginName").equals(uName) && user.get("passwd").equals(passwd)){
    			checkOK = true;
    			session.setAttribute("userInfo",user);
    			break;
    	  }
}
    
    //根据验证结果跳转
    if(checkOK){
    	  response.sendRedirect("protect.jsp");
    }
    else{
      response.sendRedirect("sessionLogin.html");
    }
%> 
