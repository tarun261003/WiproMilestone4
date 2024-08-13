package com.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Create {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf= cfg.buildSessionFactory();
		Session session =sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Manager mr=new Manager();
		mr.setDept("Marketing");
		mr.setExp(12);
		mr.setSalary(80000.00);
		mr.setName("okok");
		session.save(mr);
		
		
		tr.commit();
		session.close();
		sf.close();
		
	}

}
