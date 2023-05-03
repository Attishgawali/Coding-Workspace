package com.spring_core.Autowiring.Stereotype_Annotation;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("stereo-config.xml");
        Student s1= (Student)context.getBean("student");        
        System.out.println(s1.getAddress());
        
        Student s2= (Student)context.getBean("student");        
        System.out.println(s2.getAddress());
        
        
        
    }
}
