package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import pojo.User;

public class BeanFactoryDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourcePatternResolver resolver=new PathMatchingResourcePatternResolver();
		Resource res=resolver.getResource("classpath:/beans.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		User user= (User) factory.getBean("user",User.class);
		System.out.println("user bean is called successfully.");
		System.out.println(user.toString());
	}

}
