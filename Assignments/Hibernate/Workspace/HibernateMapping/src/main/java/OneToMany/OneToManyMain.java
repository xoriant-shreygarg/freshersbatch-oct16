package OneToMany;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyMain {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure(new File("src/hibernate.cfg.xml"));
		SessionFactory factory = configuration.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

//		ArrayList<Stock> stocks = new ArrayList<Stock>();
//		  = new ("1", stocks);
//		stocks.add(new Stock("Stock1", ));
//		.setStocks(stocks);
//		session.save();
		
//		  = session.get(.class, 27);
//		List<Stock> stocks = .getStocks();
//		stocks.add(new Stock("Stock2", ));
//		.setStocks(stocks);
		
//		  = session.get(.class, 27);
//		List<Stock> stocks = .getStocks();
//		Stock stock = stocks.get(0);
//		stock.setName("Stock3");
//		.setStocks(stocks);
		
//		ArrayList<Stock> stocks = new ArrayList<Stock>();
//		  = new ("2", stocks);
//		stocks.add(new Stock("Stock11", ));
//		.setStocks(stocks);
//		session.save();
		
//		  = session.get(.class, 27);
//		 2 = session.get(.class, 30);
//		List<Stock> stocks = .getStocks();
//		Stock stock = stocks.get(0);
//		stock.set(2);
//		.setStocks(stocks);
		
//		  = session.get(.class, 30);
//		List<Stock> stocks = .getStocks();
//		stocks.remove(0);
//		.setStocks(stocks);
		
		Market market = new Market();
		market.setName("Sales");

		Stock emp1 = new Stock("Nina",market);
		Stock emp2 = new Stock("Tony",market);
		
		market.setStocks(new ArrayList<Stock>());
		market.getStocks().add(emp1);
		market.getStocks().add(emp2);
		
		session.save(market);
		
		transaction.commit();
		session.flush();
		session.close();
		
	}

}
