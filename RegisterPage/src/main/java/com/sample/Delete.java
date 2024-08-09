package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		Configuration cnf = new Configuration().configure();
		SessionFactory sf=cnf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tf = session.beginTransaction();
		
		Registration obj =(Registration) session.get(Registration.class, 5);
		session.delete(obj);
		tf.commit();
		session.close();
		sf.close();

	}

}
