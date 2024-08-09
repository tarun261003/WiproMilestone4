package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Create {

	public static void main(String[] args) {
		Configuration cnf = new Configuration().configure();
		SessionFactory sf=cnf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tf = session.beginTransaction();
		
		Registration obj=new Registration();
		obj.setEmail("delete@gmail.com");
		obj.setGen("delete");
		obj.setF_name("delete");
		obj.setL_name("d");
		obj.setPassword("root1asdsd23");
		session.save(obj);
		tf.commit();
		session.close();
		sf.close();

	}

}
