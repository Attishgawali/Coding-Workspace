package com.spring_core.constructor_injection_spring;

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
        
        ApplicationContext context = new ClassPathXmlApplicationContext("ci-config.xml");
        
        Person p1= (Person) context.getBean("person");
        
        System.out.println(p1);
        System.out.println(p1.getPhones());
    }
}
