package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session =sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee e1= new Employee();
		e1.setId(77773);
		e1.setName("Tarun");
		e1.setDept("CSD");
		session.save(e1);
		Employee e2=new Employee();
		e2.setId(434);
		e2.setName("Tardfassaddsun");
		e2.setDept("CsadSD");
		session.save(e2);
		
		tr.commit();
		session.close();
		sf.close();

	}

}
