package edu.gs.test;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_gen")
	@SequenceGenerator(name = "book_gen", sequenceName = "book_sq", initialValue = 1, allocationSize = 1)
	private long book_id;

	private String bookName;

	@ManyToMany(mappedBy="books")
	private List<Author> authors;

	public Book(String bookName) {
		super();
		this.bookName = bookName;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getBook_id() {
		return book_id;
	}

	public void setBook_id(long book_id) {
		this.book_id = book_id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

}
