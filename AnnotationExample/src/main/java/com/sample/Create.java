package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Create {

	public static void main(String[] args) {
		Configuration cnf = new Configuration().configure();
		SessionFactory sf = cnf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tf = session.beginTransaction();
		Manage obj = new Manage();
		obj.setName("Akash");
		obj.setDept("HR");
		obj.setExp(15);
		session.save(obj);
		tf.commit();
		session.close();
		sf.close();

	}

}
