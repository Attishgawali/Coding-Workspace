package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringContainer {
	
	public static void main(String[] args) {
		
		String [] configFileArray = {"config.xml","config2.xml"};
		ApplicationContext context1 = new ClassPathXmlApplicationContext(configFileArray);
		
		System.out.println("TestSpringContainer.java is called ...");
		
	}
	
	
	
	

}
