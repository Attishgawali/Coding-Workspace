package com.spring_core.reference_type;

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
        
        ApplicationContext context = new ClassPathXmlApplicationContext("ref-config.xml");
        
        A a= (A)context.getBean("aref");
        
        System.out.println(a);
        System.out.println(a.getX());
        System.out.println(a.getOb());
    }
}
