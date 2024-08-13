package com.hql;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Select {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf= cfg.buildSessionFactory();
		Session session =sf.openSession();
		Transaction tr = session.beginTransaction();
		
//		Manager obj=(Manager)session.load(Manager.class,3);
//		System.out.println(obj);
//		Query query = session.createQuery("from Manager");
//		List<Manager> list =query.list();
//		for(Manager obj : list) {
//			System.out.println(obj);
//		}
		Query query = session.createQuery("from Manager where salary>=:s");
		query.setParameter("s", 80000.00);
		List<Manager> list =query.list();
		if(!list.isEmpty()) {
			for(Manager obj : list) {
				System.out.println(obj.getName());
			}
		}
		else {
			System.out.println("Nothing");
		}
		tr.commit();
		session.close();
		sf.close();
	}
}
