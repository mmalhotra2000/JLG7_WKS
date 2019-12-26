package edu.gs.test;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_gen")
	@SequenceGenerator(name = "author_gen", sequenceName = "author_sq", initialValue = 1, allocationSize = 1)
	private long authId;

	private String authorName;

	@ManyToMany
	private List<Book> books;

	public Author(String authorName) {
		super();
		this.authorName = authorName;
	}

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getAuthId() {
		return authId;
	}

	public void setAuthId(long authId) {
		this.authId = authId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

}
