package com.spring_core.SpringExpLang.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spEl-config.xml");
        Employee emp = (Employee)context.getBean("employee");
        System.out.println(emp);
        
    }
}
