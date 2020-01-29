package edu.gs.thread;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

public class TEst4 {

	@Target({ ElementType.TYPE_PARAMETER, ElementType.TYPE_USE })
	@interface MyAnnotation {

	}

	@Retention(RUNTIME)
	@interface Hints {

		Hint[] value();
	}

	@Repeatable(Hints.class)
	@Retention(RUNTIME)
	@interface Hint {
		String value();
	}

	@Hint("hint1")
	@Hint("hint2")
	class Person {

	}

	public static void main(String[] args) {
		Hint hint = Person.class.getAnnotation(Hint.class);

		System.out.println(hint);

		Hints hints1 = Person.class.getAnnotation(Hints.class);

		System.out.println(hints1.value().length);

		Hint[] hints2 = Person.class.getAnnotationsByType(Hint.class);

		System.out.println(hints2.length);

	}

}
