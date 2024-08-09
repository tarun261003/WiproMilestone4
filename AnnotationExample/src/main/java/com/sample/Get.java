package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Get {

	public static void main(String[] args) {
		Configuration cnf = new Configuration().configure();
		SessionFactory sf = cnf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tf = session.beginTransaction();
		
		
//		Manage obj =(Manage) session.load(Manage.class, 3);
//		System.out.println(obj);
		Manage obj =(Manage) session.get(Manage.class, 6);
		System.out.println(obj);
		
		tf.commit();
		session.close();
		sf.close();

	}

}
