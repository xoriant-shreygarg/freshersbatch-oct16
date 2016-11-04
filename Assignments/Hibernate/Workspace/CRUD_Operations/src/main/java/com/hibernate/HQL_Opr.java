package com.hibernate;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class HQL_Opr {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure(new File("src/hibernate.cfg.xml"));
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session1 = sessionFactory.openSession();

		// Query query1 = session1.createQuery("select sum(P.price) from Product
		// P");
		// List<Integer> list = query1.list();
		// System.out.println("Total cost = "+list.get(0));

		// Query query1 = session1.createQuery("select e.name as name,e.salary
		// as salary from Employee e order by e.salary");
		// query1.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		// List<Map> list = query1.list();
		// for(Map hmap:list)
		// System.out.println(hmap.get("name") + " - " + hmap.get("salary"));

		// Query query1 = session1.createQuery("select avg(salary)"
		// + "as avg_salary from Employee e order by e.salary");
		// query1.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		// List<Map> list = query1.list();
		// for(Map hmap:list)
		// System.out.println(hmap.get("avg_salary"));

		// Query query1 = session1.createQuery("select e.name as name,e.salary
		// as salary" + " from Employee e where e.salary > 10000");
		// query1.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		// List<Map> list = query1.list();
		// for (Map hmap : list)
		// System.out.println(hmap.get("name") + " - " + hmap.get("salary"));

		// -- Named Queries

		// Query query1 = session1.getNamedQuery("totalSalary");
		// List<Double> list = query1.list();
		// System.out.println("Total salary = "+list.get(0));

		// Query query1 = session1.getNamedQuery("sortedBySalary");
		// query1.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		// List<Map> list = query1.list();
		// for(Map hmap:list)
		// System.out.println(hmap.get("name") + " - " + hmap.get("salary"));

		// Query query1 = session1.getNamedQuery("avgSal");
		// query1.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		// List<Map> list = query1.list();
		// for(Map hmap:list)
		// System.out.println(hmap.get("avg_salary"));

		// Query query1 = session1
		// .getNamedQuery("salaryGreaterThen10000");
		// query1.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		// List<Map> list = query1.list();
		// for (Map hmap : list)
		// System.out.println(hmap.get("name") + " - " + hmap.get("salary"));

		// -- Criteria

		// Criteria cr = session1.createCriteria(Employee2.class);
		// cr.setProjection(Projections.sum("salary"));
		// List totalSalary = cr.list();
		// System.out.println("Total Salary : " + totalSalary.get(0) );

		// Criteria cr = session1.createCriteria(Employee.class);
		// cr.addOrder(Order.desc("salary"));
		// List<Map> list = cr.list();
		// for (Map hmap : list)
		// System.out.println(hmap.get("name") + " - " + hmap.get("salary"));

		// Transaction transaction = session1.beginTransaction();
		// session1.save(new Employee2("a",100222, "pune"));
		// session1.save(new Employee2("a",102, "mumbai"));
		// session1.save(new Employee2("a",100422, "mumbai"));
		// session1.save(new Employee2("a",1022, "pune"));
		// session1.save(new Employee2("a",100442, "pune"));
		// session1.save(new Employee2("a",100212, "mumbai"));
		// session1.save(new Employee2("a",1022, "pune"));
		// session1.save(new Employee2("a",1002122, "pune"));
		// transaction.commit();

		// Criteria cr = session1.createCriteria(Employee2.class);
		// cr.setProjection(Projections.avg("salary"));
		// List averagSal = cr.list();
		// System.out.println("Average Salary : " + averagSal.get(0) );

		// Criteria cr = session1.createCriteria(Employee2.class);
		// cr.add(Restrictions.gt("salary", 10000));
		// List<Employee2> list = cr.list();
		// for (Employee2 employee : list)
		// System.out.println(employee);

		// Criteria cr = session1.createCriteria(Employee2.class);
		// cr.addOrder(Order.desc("salary"));
		// List<Employee2> list = cr.list();
		// for (Employee2 hmap : list)
		// System.out.println(hmap.getName() + " - " + hmap.getSalary());

		// -- Group by

		// Query query1 = session1
		// .createQuery("select sum(e.salary) as salSum,e.city as City from
		// Employee2 e group by e.city");
		// query1.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		// List<Map> list = query1.list();
		// for (Map hmap : list)
		// System.out.println(hmap.get("salSum") + " - " + hmap.get("City"));

		// Criteria cr = session1.createCriteria(Employee2.class);
		// cr.setProjection(Projections.projectionList().add(Projections.sum("salary").as("salarySum"))
		// .add(Projections.groupProperty("city").as("city")));
		//
		// cr.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		// List<Map> list = cr.list();
		// for (Map hmap : list)
		// System.out.println(hmap.get("city") + " - " + hmap.get("salarySum"));

		session1.close();
		sessionFactory.close();

	}

}
