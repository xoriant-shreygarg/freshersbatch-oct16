package com.spring.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans_aop.xml");
		CollectionOpr opr = (CollectionOpr) context.getBean("collectionOprBean");
		opr.addInVector();
		opr.addInList();
	}

}
