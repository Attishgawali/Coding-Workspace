package com.spring_core.Life_cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("life-cycle-config.xml");
//      Registring shut down hook
		context.registerShutdownHook();

//		Samosa s1 = (Samosa) context.getBean("s1");
//		System.out.println(s1);

		System.out.println("******************************************");

		Pepsi p1 = (Pepsi) context.getBean("p1");

		System.out.println(p1);

	}
}
