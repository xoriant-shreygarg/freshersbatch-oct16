package com.spring.core.assignment3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans_assignment3.xml");
		Chatroom chatroom = (Chatroom) context.getBean("chatroom_1");
		System.out.println(chatroom);
		System.out.println("\n\n");
		Chatroom chatroom2 = (Chatroom) context.getBean("chatroom_2");
		System.out.println(chatroom2);
		context.registerShutdownHook();
	}
	
}
