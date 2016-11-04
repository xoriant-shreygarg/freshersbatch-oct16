package com.hibernate;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CRUD_Operations2 {

	public static void main(String[] args) throws Exception {

		Configuration configuration = new Configuration();
		configuration.configure(new File("src/hibernate.cfg.xml"));
		SessionFactory sessionFactory = configuration.buildSessionFactory();

//		 Session session_2 = sessionFactory.openSession();
////		 Product product_2 = session_2.load(Product.class, 15l);
//		// OR
//		 Product product_2 = session_2.get(Product.class, 5l);
//		 System.out.println(product_2);
//		 session_2.close();

//		Session session = sessionFactory.openSession();
//		Transaction transaction = session.beginTransaction();
//		SQLQuery sqlQuery = session
//				.createSQLQuery("INSERT INTO PRODUCT_MASTER" + " VALUES (" + 8.0 + "," + "'Mobile'" + "," + 50000 + ")");
//		int inserted = sqlQuery.executeUpdate();
//		System.out.println(inserted);
//		transaction.commit();
//		session.close();
		
		Session session1 = sessionFactory.openSession();
		Product product1 = new Product("iPhone 7+", 70000);
		Transaction transaction = session1.beginTransaction();
		session1.save(product1);
		transaction.commit();
		session1.close();
		
		
		
		sessionFactory.close();
	}

}
