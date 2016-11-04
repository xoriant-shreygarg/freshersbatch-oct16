package com.hibernate;

import java.io.File;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure(new File("src/hibernate.cfg.xml"));
		SessionFactory factory = configuration.buildSessionFactory();

		// CREATE
		 Session session1 = factory.openSession();
		 Transaction transaction = session1.beginTransaction();
		 Product product1 = new Product("iPhone 7+",70000);
		 session1.save(product1);
		 product1 = new Product("iPhone 7+",70000);
		 session1.save(product1);
		 product1 = new Product("iPhone 7+",70000);
		 session1.save(product1);
		 product1 = new Product("iPhone 7+",70000);
		 session1.save(product1);
		 product1 = new Product("iPhone 7+",70000);
		 session1.save(product1);
		 product1 = new Product("iPhone 7+",70000);
		 session1.save(product1);
		 transaction.commit();
		 session1.close();

		// READ
		// Session session2 = factory.openSession();
		// Product product2 = session2.get(Product.class, 2l);
		// System.out.println(product2);
		// session2.close();

		// UPDATE
		// Session session3 = factory.openSession();
		// Transaction transaction3 = session3.beginTransaction();
		// Product product3 = session3.get(Product.class, 2l);
		// product3.setName("SGS7 Edge+");
		// session3.update(product3);
		// transaction3.commit();
		// System.out.println(session3.get(Product.class, 2l));
		// session3.close();

		// DELETE
		// Session session4 = factory.openSession();
		// Transaction transaction4 = session4.beginTransaction();
		// Product product4 = session4.get(Product.class, 3l);
		//// session4.delete(product4);
		// Query query = session4.createQuery("delete from Product");
		// int x = query.executeUpdate();
		// System.out.println(x);
		// transaction4.commit();
		// session4.close();

		factory.close();
	}
}
