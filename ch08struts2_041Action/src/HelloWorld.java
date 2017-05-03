
//package tutorial;
import com.opensymphony.xwork2.ActionSupport;
public class HelloWorld extends ActionSupport {
    private String message;  
    
    public void setMessage(String message){
        this.message = message;
    }
 
    public String getMessage() {
        return message;
    }
    public String execute() throws Exception {
        setMessage( "Struts is up and running ...！！！！！！！！！");
        return SUCCESS;
    }
}
