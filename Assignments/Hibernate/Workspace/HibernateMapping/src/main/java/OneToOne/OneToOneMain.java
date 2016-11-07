package OneToOne;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMain {
	
	static Session session;

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure(new File("src/hibernate.cfg.xml"));
		SessionFactory factory = configuration.buildSessionFactory();
		session = factory.openSession();

//		saveCustomer("Shrey", "Hi.");
		
//		saveCustomer("Archit", "Hey.");		
		
//		deleteCustomer(43);
		
//		updateEnquiry(45,"Good day.");
		
//		deleteEnquiry(45);
		
//		session.beginTransaction();
//		Customer customer = session.get(Customer.class, 45);
//		System.out.println(customer);
//		customer.getEnquiry().setId(47);
//		session.getTransaction().commit();	
		
		session.flush();
		session.close();
		
	}
	
	private static void deleteEnquiry(int i) {
		session.beginTransaction();
		Enquiry enquiry = session.get(Customer.class, i).getEnquiry();
		session.delete(enquiry);
		session.getTransaction().commit();
	}

	private static void updateEnquiry(int customerId, String string) {
		session.beginTransaction();
		Customer customer = session.get(Customer.class, customerId);
		customer.setEnquiry(new Enquiry(string));
		session.getTransaction().commit();		
	}

	private static void deleteCustomer(int i) {
		session.beginTransaction();
		Customer customer = session.get(Customer.class, i);
		session.delete(customer);
		session.getTransaction().commit();
	}

	public static void saveCustomer(String customerName, String query) {
		session.beginTransaction();
		Customer customer = new Customer(customerName, new Enquiry(query));
		session.save(customer);
		session.getTransaction().commit();
	}

}
