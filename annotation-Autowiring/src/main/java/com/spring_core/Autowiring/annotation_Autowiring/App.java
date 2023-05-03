package com.spring_core.Autowiring.annotation_Autowiring;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("Annotation-config.xml");
        
        Student stu = (Student)context.getBean("temp1");
        
        System.out.println(stu);
    }
}
