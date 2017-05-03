package cn.slg.jw.javaee.ch10spring10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestXML {
  public static void main(String args[]){   
         @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("/beans2xml.xml");   
         PersonService personService = (PersonService)context.getBean("personService");   
         personService.save("administator");   
      }   
}
