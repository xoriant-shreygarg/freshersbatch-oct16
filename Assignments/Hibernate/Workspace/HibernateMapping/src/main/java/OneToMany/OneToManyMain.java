package OneToMany;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyMain {

	static Session session;

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure(new File("src/hibernate.cfg.xml"));
		SessionFactory factory = configuration.buildSessionFactory();
		session = factory.openSession();

		// addMarket();

		// addStock(51);

		// updateStock(51,53,"Stock1");

		session.flush();
		session.close();

	}

	private static void updateStock(int i, int j, String string) {
		session.beginTransaction();
		Market market = session.get(Market.class, i);
		Set<Stock> stocks = market.getStocks();
		Stock s = null;
		for (Iterator iterator = stocks.iterator(); iterator.hasNext();) {
			Stock stock = (Stock) iterator.next();
			if (stock.getId() == j)
				s = stock;
		}
		System.out.println(s);
		session.getTransaction().commit();
	}

	private static void addStock(int marketId) {
		session.beginTransaction();
		Market market = session.get(Market.class, marketId);
		market.getStocks().add(new Stock("S1", market));
		market.getStocks().add(new Stock("S2", market));
		session.getTransaction().commit();
	}

	private static void addMarket() {
		session.beginTransaction();
		session.save(new Market("M1", new HashSet<Stock>()));
		session.getTransaction().commit();
	}

}