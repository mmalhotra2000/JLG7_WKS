package edu.gyansetu.tcs.exceptionhandling;

public class ErrorHandling {

	public static void main(String[] args) {

		m1();
	}

	private static void m1() {
		try {
			System.out.println("m1");
			m1();
		} catch (StackOverflowError e) {
			System.out.println("error caught");
		}
	}

}
