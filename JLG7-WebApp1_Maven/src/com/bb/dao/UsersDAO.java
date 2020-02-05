package com.bb.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bb.entity.Users;

public class UsersDAO {

	public void createUser(Users users) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(users);
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

}
