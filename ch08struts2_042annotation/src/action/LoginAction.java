package action;

import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;


import com.opensymphony.xwork2.ActionSupport;


@ParentPackage("struts-default")
@Result(location = "/login.jsp")
public class LoginAction extends ActionSupport {

}
