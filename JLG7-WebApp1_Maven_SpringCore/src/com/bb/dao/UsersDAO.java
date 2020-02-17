package com.bb.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bb.entity.Users;

public class UsersDAO {

	private UsersDAO() {

	}

	private static UsersDAO usersDAO = null;

	public static UsersDAO getInstance() {
		if (usersDAO == null) {
			usersDAO = new UsersDAO();
		}
		return usersDAO;
	}

	public void createOrUpdate(Users users) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.saveOrUpdate(users);
		session.getTransaction().commit();
		session.close();
	}

	public List<Users> findAll() {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createNamedQuery("Users.getALL");
		List<Users> usersList = query.getResultList();
		session.close();
		return usersList;

	}

	public Users findById(Long id) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Users users = session.get(Users.class, id);
		session.close();
		return users;

	}

}
