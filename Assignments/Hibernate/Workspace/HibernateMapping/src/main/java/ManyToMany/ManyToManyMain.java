package ManyToMany;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyMain {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure(new File("src/hibernate.cfg.xml"));
		SessionFactory factory = configuration.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		
		
		transaction.commit();
		session.flush();
		session.close();
		
	}

}
