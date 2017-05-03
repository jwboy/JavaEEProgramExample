package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.User;

public class XMLApplicationContextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/*.xml");
		User user = (User) ctx.getBean("user", User.class);
		System.out.println("user bean is called successfully.");
		System.out.println(user.toString());
		ctx.close();
	}
}
