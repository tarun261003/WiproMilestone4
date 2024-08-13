package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr=session.beginTransaction();
		Employee emp = new Employee();
		emp.setName("Frank Wilson");
		emp.setDept("Engineering");
		Address addr = new Address();
		addr.setCity("Hyderabad");
		addr.setCountry("India");
		addr.setHno("F-606");
		addr.setState("Telangana");
		addr.setStreet("987 Cedar Street");
		addr.setPin(500006);
	
		
		emp.setAddress(addr);
		addr.setEmployee(emp);
		session.save(emp);
		tr.commit();
		session.close();
		sf.close();

	}

}
