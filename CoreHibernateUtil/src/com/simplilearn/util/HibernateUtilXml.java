package com.simplilearn.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtilXml {

	public static void main(String[] args) {
		
		try {
			SessionFactory factory;
			
			{
				Configuration cfg = new Configuration();
				
				cfg = cfg.configure();
				
				factory = cfg.buildSessionFactory();
			}
			
			
			public static SessionFactory getSessionFactory() {
				return factory;
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println("Erroer occured during loading util ");
		}
		
		
	}

}
