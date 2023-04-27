package com.spring_core.p_Schema;

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
        
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        
        Student student1= (Student) container.getBean("student1");
        Student st2= (Student) container.getBean("student2");

        System.out.println(student1);
        System.out.println(st2);
        
    }
}
