package com.spring_core.life_cycle_;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("life-cycle-Annotaion.xml");
        
        context.registerShutdownHook();
        
        Example ex= (Example)context.getBean("ex1");
        System.out.println(ex);
        
    }
}
