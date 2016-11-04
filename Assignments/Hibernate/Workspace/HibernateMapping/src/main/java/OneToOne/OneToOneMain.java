package OneToOne;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMain {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure(new File("src/hibernate.cfg.xml"));
		SessionFactory factory = configuration.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

//		Customer customer = new Customer("Shrey", new Enquiry("What is the day tomorrow?"));
//		session.save(customer);
		
//		Customer customer = new Customer("Archit", new Enquiry("Hello!"));
//		session.save(customer);
		
//		Customer customer = session.get(Customer.class, 19);
//		session.delete(customer);
		
//		Enquiry enquiry = new Enquiry("Hello!");
//		Customer customer = new Customer("Archit", enquiry);
//		session.save(customer);
//		transaction.commit();
		
//		Customer customer = session.get(Customer.class, 19);
//		customer.setEnquiry(new Enquiry("Hey!"));
//		transaction.commit();

//		transaction = session.beginTransaction();
//		session.evict(customer);
		
		Enquiry enquiry = session.get(Enquiry.class, 30);
		enquiry.setId(40);
		
		transaction.commit();
		session.flush();
		session.close();
		
	}

}
