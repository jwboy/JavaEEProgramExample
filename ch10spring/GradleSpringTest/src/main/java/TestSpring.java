import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class TestSpring {
	public static void main(String[] args) {
	      ApplicationContext ctx = new FileSystemXmlApplicationContext("applicationContext.xml");
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	    Human human = null;    
	    human = (Human) ctx.getBean("chinese");    	//依赖注入获取"chinese"
	    human.eat();    
	    human.walk();    
	    human = (Human) ctx.getBean("american");    	//依赖注入获取"american"
	    human.eat();    
	    human.walk();    
	}
}
