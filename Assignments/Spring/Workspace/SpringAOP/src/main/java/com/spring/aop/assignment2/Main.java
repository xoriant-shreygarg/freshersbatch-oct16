package com.spring.aop.assignment2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans_aop_assignment2.xml");
		UserHandler handler = (UserHandler) context.getBean("user_handler");
		
		
		try {
			handler.register("shrey", "shrey", "shrey", "India");
			handler.login("shrey", "shrey");
			Thread.sleep(1000);
			handler.logout();
			handler.logout();
//			handler.register("s", "s", "s", "India");
		} catch (MyException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}