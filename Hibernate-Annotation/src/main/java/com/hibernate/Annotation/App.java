package com.hibernate.Annotation;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import com.hibernate.Annotation.Certificate;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		
		Student st= new Student();
		
		st.setStuId(101);
		st.setName("Akash");
		
		Certificate certificate = new Certificate();
		certificate.setCourse("JFSD");
		certificate.setDuration(3);
		
		st.setCerti(certificate);
		
		Student st2= new Student();
		
		st2.setStuId(102);
		st2.setName("Ajay");
		
		Certificate certificate2 = new Certificate();
		certificate2.setCourse("Hibernate");
		certificate2.setDuration(2);
		
		st.setCerti(certificate);
		st2.setCerti(certificate2);
		
		Transaction tx = session.beginTransaction();
		session.save(st);
		session.save(st2);
		tx.commit();
		
		factory.close();
		session.close();
	
    }
}