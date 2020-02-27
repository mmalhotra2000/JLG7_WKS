package com.bb.spring.core.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationcontext.xml");

		// testcase1(applicationContext);

		Coach coach = applicationContext.getBean("tennis_abc_Coach", Coach.class);
		Tennis_abc_Coach abc_Coach = (Tennis_abc_Coach) coach;
		System.out.println(coach.getDailyWorkout());
		System.out.println(abc_Coach.getResultFromFortuneService());

		applicationContext.close();
	}

	private static void testcase1(ClassPathXmlApplicationContext applicationContext) {
		Book book = applicationContext.getBean("book", Book.class);

		System.out.println(book);

		Coach coach = applicationContext.getBean("myCoach", Coach.class);

		System.out.println(coach.getDailyWorkout());

		BaseBallCoach ballCoach = (BaseBallCoach) coach;
		System.out.println(ballCoach.getResultFromFortuneService());
	}

}
