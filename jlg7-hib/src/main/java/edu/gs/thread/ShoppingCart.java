package edu.gs.thread;

import java.util.Collections;
import java.util.HashMap;

class Book {

	String title;
	int copiesSold = 0;

	Book(String title) {
		this.title = title;
	}

	public void newSale() {
		synchronized (Book.class) {
			int reg = copiesSold;
			reg++;
			copiesSold = reg;

		}

		//
		//
		//
		//

	}

	public synchronized void returnBook() {
		int reg = copiesSold;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		reg--;
		copiesSold = reg;
	}

}

class OnlineBuy extends Thread {
	Book myBook;

	public OnlineBuy(Book myBook) {
		super();
		this.myBook = myBook;
	}

	@Override
	public void run() {
		myBook.newSale();
	}

}

class OnlineReturn extends Thread {
	Book book;

	public OnlineReturn(Book book) {
		this.book = book;
	}

	@Override
	public void run() {
		book.returnBook();
	}

}

public class ShoppingCart {
	public static void main(String[] args) throws InterruptedException {
		Book book = new Book("Java");

		Book book1 = new Book("c++");

		Thread onlineBuy1 = new OnlineBuy(book);
		Thread onlineBuy2 = new OnlineBuy(book1);
		Thread onlineReturn = new OnlineReturn(book);

		// onlineReturn.start();
		onlineBuy1.start();
		onlineBuy2.start();

		onlineBuy1.join();
		onlineBuy1.join();
		onlineReturn.join();

		System.out.println(book.copiesSold);
		
		HashMap< String, String> map  = new HashMap<String, String>();
		Collections.synchronizedMap(map);

	}
}