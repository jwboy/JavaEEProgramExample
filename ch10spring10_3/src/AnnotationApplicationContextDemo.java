import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pojo.User;

public class AnnotationApplicationContextDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Annotation.class);
		User user = (User) ctx.getBean("user", User.class);
		System.out.println("user bean is called successfully.");
		System.out.println(user.toString());
	}
}
