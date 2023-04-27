package com.hibernate.Annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		
		// Question object creation

		Question qu = new Question();
		qu.setQueId(1001);
		qu.setQue("how are you");
		
		Question qu1 = new Question();
		qu1.setQueId(1002);
		qu1.setQue("what is gravity");
		
		
		// Answer object creation
		Answer an = new Answer();
		an.setAnsId(2001);
		an.setAns("I am Fine");
		qu.setAns(an);
		
		Answer an1 = new Answer();
		an1.setAnsId(2002);
		an1.setAns("Gravity is a force");
		qu1.setAns(an1);

		// session
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(qu);
		s.save(an);
		
		s.save(qu1);
		s.save(an1);
	

		tx.commit();
		
		factory.close();
		s.close();

	}

}
