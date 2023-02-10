package com.sivasoft.hibernate.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sivasoft.hibernate.entity.Product;

public class HibernateSimpleMappingMain {

	public static void main(String[] args) {
		Product prod = new Product(1001,"P1",100.00, new Date());
		Product prod1 = new Product(1002,"P2",200.00, new Date());
		Product prod2 = new Product(1003,"P3",300.00, new Date());
		Product prod3 = new Product(1004,"P4",400.00, new Date());
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
	//	session.save(prod);
	//	session.save(prod1);
	//	session.save(prod2);
	//	session.save(prod3);
		
	//	session.delete(prod2);
	//	session.update(prod2);
		
	Product load = (Product)session.load(Product.class, 1002);	
	System.out.println(load);	
	
		transaction.commit();
		
		session.close();
	}
}
