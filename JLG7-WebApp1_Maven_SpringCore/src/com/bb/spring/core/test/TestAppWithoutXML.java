package com.bb.spring.core.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAppWithoutXML {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				DmoConfig.class);

		TestServlet servlet = annotationConfigApplicationContext.getBean("testServlet", TestServlet.class);
		System.out.println(servlet);

		Book book = annotationConfigApplicationContext.getBean("book", Book.class);

		System.out.println(book.hashCode());

		Book book1 = annotationConfigApplicationContext.getBean("book", Book.class);

		System.out.println(book1.hashCode());
		annotationConfigApplicationContext.close();
	}

}
