package com.springcore;

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
        System.out.println( "App.java is called ..." );
        
        try {
        	ApplicationContext context;
        	
        	context = new ClassPathXmlApplicationContext("config.xml");
        	
        	
//        	Message Service 
        	MessageService msg = (MessageService) context.getBean("messageBean");
        	System.out.println(msg);
        	
        	MessageService senderName = (MessageService) context.getBean("senderMessageBean");
        	System.out.println(senderName.getSenderName());
        	
        	
//        	Audio Service
        	Audio au = (Audio)context.getBean("audioBean");
        	System.out.println(au);
        	
        	
        } catch(Exception e) {
        	e.printStackTrace();
        	System.err.println("Error occured while executing App ...");
        }
    }
}