package com.spring_core.PureAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        
        Student stu= (Student) context.getBean("getStudent",Student.class);
        stu.Study();
    }
}
