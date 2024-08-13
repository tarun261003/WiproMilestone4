package com.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf= cfg.buildSessionFactory();
		Session session =sf.openSession();
		Transaction tr = session.beginTransaction();
		Query query=session.createQuery("update Manager m set m.dept=:d where dept=:s");
		query.setParameter("s", "Marketing");
		query.setParameter("d", "Market");
		query.executeUpdate();
		
		
		tr.commit();
		session.close();
		sf.close();

	}

}
