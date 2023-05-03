package com.spring_core.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring_core/standalone/standalone-config.xml");
		
		Person p1=context.getBean("person1",Person.class);
		System.out.println(p1);
		System.out.println("******************************");
		System.out.println(p1.getFeestructure());
		System.out.println(p1.getFeestructure().getClass().getName());
		
		
		
	}

}
