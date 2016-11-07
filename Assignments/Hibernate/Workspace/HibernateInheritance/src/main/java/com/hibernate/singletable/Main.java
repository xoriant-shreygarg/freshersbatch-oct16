package com.hibernate.singletable;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure(new File("src/hibernate.cfg.xml"));
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Vehicle vehicle = new Vehicle("Model1", 10000);
		Car car = new Car("Model2", 20000, 1);
		Bike bike = new Bike("Model3", 50000, 2);
		Transaction tx = session.beginTransaction();
		session.save(vehicle);
		session.save(car);
		session.save(bike);
		tx.commit();
		session.close();
		sessionFactory.close();
	}

}