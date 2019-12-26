package edu.gs.test;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHib2 {

	public static void main(String[] args) {
		// b1 : a1
		// b1 : a2
		// b2 : a1
		// b2 : a2

		Book book1 = new Book("book1");
		Book book2 = new Book("book2");

		Book book3 = new Book("book3");
		Book book4 = new Book("book4");

		ArrayList<Book> booksForAuthor1 = new ArrayList<Book>();
		booksForAuthor1.add(book1);
		booksForAuthor1.add(book2);

		ArrayList<Book> booksForAuthor2 = new ArrayList<Book>();
		booksForAuthor2.add(book2);
		booksForAuthor2.add(book3);
		booksForAuthor2.add(book4);

		Author author1 = new Author("author1");
		Author author2 = new Author("author2");

		ArrayList<Author> authorForBook1 = new ArrayList<Author>();
		authorForBook1.add(author1);

		ArrayList<Author> authorForBook2 = new ArrayList<Author>();
		authorForBook2.add(author1);
		authorForBook2.add(author2);

		ArrayList<Author> authorForBook3 = new ArrayList<Author>();
		authorForBook3.add(author2);

		ArrayList<Author> authorForBook4 = new ArrayList<Author>();
		authorForBook4.add(author2);

		author1.setBooks(booksForAuthor1);
		author2.setBooks(booksForAuthor2);

		book1.setAuthors(authorForBook1);
		book2.setAuthors(authorForBook2);
		book3.setAuthors(authorForBook3);
		book4.setAuthors(authorForBook4);

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();
		session.save(book1);
		session.save(book2);
		session.save(book3);
		session.save(book4);
		session.save(author1);
		session.save(author2);
		session.getTransaction().commit();
		session.close();
	}

}
