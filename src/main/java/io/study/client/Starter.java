package io.study.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.study.domain.User;
import io.study.services.UserService;

public class Starter {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
		UserService service = container.getBean("userService",UserService.class);
		User user = new User(1,"Islam","Email");
		service.registerANewUserToDB(user);
		container.close();
		
	}

}
