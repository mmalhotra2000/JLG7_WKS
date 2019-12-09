package edu.gyansetu.tcs.revision.oops.exceptionhandling;

public class TestErro1 {

	public static void main(String[] args) {
// outofmemory
		try {
			fact(3);
		}
		catch(StackOverflowError error) {
			error.printStackTrace();
		}
		
		System.out.println("errro caught");
		
	}

	private static void fact(int i) {

		fact(i);

	}

}
