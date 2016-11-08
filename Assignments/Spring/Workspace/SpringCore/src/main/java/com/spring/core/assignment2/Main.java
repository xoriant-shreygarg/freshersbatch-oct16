package com.spring.core.assignment2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans_assignment2.xml");
		SampleBean bean = (SampleBean) context.getBean("sample_bean1");
		System.out.println(bean);
		context.registerShutdownHook();
	}
	
}