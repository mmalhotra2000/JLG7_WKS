package com.bb.spring.core.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp1 {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationcontext.xml");

		 m1(applicationContext);

		//m2(applicationContext);

		applicationContext.close();
	}

	private static void m2(ClassPathXmlApplicationContext applicationContext) {
		Book bok1 = applicationContext.getBean("book1", Book.class);
		System.out.println("bok1 fro ap1::" + bok1.hashCode());

		applicationContext.close();

		ClassPathXmlApplicationContext applicationContext2 = new ClassPathXmlApplicationContext(
				"applicationcontext2.xml");

		// m1(applicationContext);

		Book bok2 = applicationContext2.getBean("book1", Book.class);
		System.out.println("bok2 fro ap2::" + bok2.hashCode());

		applicationContext2.close();
	}

	private static void m1(ClassPathXmlApplicationContext applicationContext) {
		TestServlet servlet = applicationContext.getBean("testServlet", TestServlet.class);
		servlet.doPost("httpReq", "httpResp");

		System.out.println("instance 1 " + servlet);

		TestServlet servlet1 = applicationContext.getBean("testServlet", TestServlet.class);

		System.out.println("instance 2 " + servlet1);
	}

}
