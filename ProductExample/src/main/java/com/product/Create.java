package com.product;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Create {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr=session.beginTransaction();
		Product p1=new Product();
		p1.setId(5);
		p1.setType("Groucery");
		p1.setPrice(2000.00);
		session.save(p1);
		
		tr.commit();
		session.close();
		sf.close();
	}

}
