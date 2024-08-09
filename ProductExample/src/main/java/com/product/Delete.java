package com.product;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr=session.beginTransaction();
		Product p1=(Product)session.load(Product.class, 2);
		
		session.delete(p1);
		
		tr.commit();
		session.close();
		sf.close();

	}

}
