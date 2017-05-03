import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class Test {
    public static void main(String[] args) {
	    ApplicationContext ctx = new FileSystemXmlApplicationContext("src/applicationContext.xml");
	    Human human = null;    
	    human = (Human) ctx.getBean("chinese");    
	    human.speak();  
    }
}
