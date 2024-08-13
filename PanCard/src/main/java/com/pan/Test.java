package com.pan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf =cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		
		PanCard pan = new PanCard();
		pan.setCardNumber("ABLPA1234D");
		Person per = new Person();
		per.setName("Rahul Mehta");
		pan.setPerson(per);
		per.setCard(pan);
		session.save(per);
		
		tr.commit();
		session.close();
		sf.close();

	}

}
