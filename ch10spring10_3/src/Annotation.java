import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pojo.User;

@Configuration
public class Annotation {
	@Bean(name="user")
	User getUser(){
		User user=new User();
		user.setName("zhangsan");
		user.setAge(18);
		user.setType("admin");
		return user;		
	}
}
