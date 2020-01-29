package edu.gs.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import edu.gs.model.Address;
import edu.gs.model.Employee;

public class TestHib3 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		// testcase1(sessionFactory);

		// testcase2(sessionFactory);

		Session session = sessionFactory.openSession();
		Query query = session.createNamedQuery("Address.getAddressPlusEmpByEmpFname");
		query.setParameter(1, "Rohit");
		List<EmpAddTempModel>  empAddTempModels =  query.getResultList();
		System.out.println(empAddTempModels);
	//	testcase3(query);
		
		
		session.close();

	}

	private static void testcase3(Query query) {
		List<Object[]> rows = query.getResultList();

		List<EmpAddTempModel> empAddTempModels = null;
		if (null != rows && !rows.isEmpty()) {
			empAddTempModels = new ArrayList<EmpAddTempModel>(rows.size());
		}

		for (Object[] row : rows) {
			// System.out.print(row[0] + " " + row[1] + " " + row[2]);
			// System.out.println();
			EmpAddTempModel addTempModel1 = new EmpAddTempModel(row[0].toString(), row[1].toString(),
					row[2].toString());
			empAddTempModels.add(addTempModel1);
		}

		System.out.println(empAddTempModels);
	}

	private static void testcase2(SessionFactory sessionFactory) {
		Session session = sessionFactory.openSession();
		Query query = session.createNamedQuery("Address.getAddressByEmpFname");
		query.setParameter(1, "Mohit");
		List<Address> addresses = query.getResultList();
		System.out.println(addresses);
	}

	private static void testcase1(SessionFactory sessionFactory) {
		Session session = sessionFactory.openSession();

		Query query = session.createNamedQuery("Employee.getEmpByFname");
		query.setParameter("fname", "Mohit");
		List<Employee> employees = query.getResultList();
		System.out.println(employees);

		session.close();
	}

}
