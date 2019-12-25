package edu.gs.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.gs.model.Address;
import edu.gs.model.Employee;

public class TestHib1 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		testcase1(sessionFactory);

		testcase2(sessionFactory);
		
		
		Address address1 =  new Address("gh1", "pach vihar");
		Address address2 =  new Address("ggn", "haryana");
		
		Session session =  sessionFactory.openSession();
		Transaction transaction= session.getTransaction();
		transaction.begin();
		session.save(address1);
		session.save(address2);
		transaction.commit();
		session.close();

	}

	private static void testcase2(SessionFactory sessionFactory) {
		// Get on the basis of pK

		// load
		// get vs load
		// eager vs lazy
		// proxy obj // pattern

		Session session = sessionFactory.openSession();

		// Employee employee = session.get(Employee.class, new Long(90)); // get will
		// retrun Null
		//
		// System.out.println("pk :: id is " + employee.getId());
		// // System.out.println("name :: " + employee.getFirstName());

		Employee employee = session.load(Employee.class, new Long(2)); // get will retrun proxy obj

		System.out.println("pk :: id is " + employee.getId());

		// System.out.println("name :: " + employee.getFirstName());

		session.close();
	}

	private static void testcase1(SessionFactory sessionFactory) {
		Date currentDate = new Date();

		Employee employee1 = new Employee("Mohit", "Malhotra", currentDate, currentDate, currentDate, "temp1");
		Employee employee2 = new Employee("Rohit", "Malhotra", currentDate, currentDate, currentDate, "temp1");
		Employee employee3 = new Employee("Sumit", "Malhotra", currentDate, currentDate, currentDate, "temp1");

		// File file = new
		// File("/Users/mohitmalhotra/JLG7_WKS/jlg7-hib/hibernate.cfg.xml");
		// // Step 1 : SessionFactory
		// SessionFactory sessionFactory = new
		// Configuration().configure(file).buildSessionFactory();
		// // Step 2 : session obj <--> Connection

		// jdbc : autocommit true :
		// hib : autocomit : false

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(employee1);

		// String name = null;
		// name.toLowerCase();

		session.save(employee2);

		session.save(employee3);

		transaction.commit();

		session.close();
	}

}
