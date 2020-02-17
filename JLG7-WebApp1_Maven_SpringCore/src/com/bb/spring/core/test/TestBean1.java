package com.bb.spring.core.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationcontext.xml");

		Book book = applicationContext.getBean("book", Book.class);

		System.out.println(book);

		applicationContext.close();
	}

}
