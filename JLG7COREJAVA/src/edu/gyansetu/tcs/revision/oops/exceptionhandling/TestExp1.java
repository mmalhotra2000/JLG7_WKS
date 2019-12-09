package edu.gyansetu.tcs.revision.oops.exceptionhandling;

public class TestExp1 {

	public static void main(String[] args) {

		System.out.println("before exp");

		// runtime exp arrayindex... , nullpoi...., arithe ,.... classcast
		// try and catch

		// int num=90;
		// int num2 = 0;
		// System.out.println(num/num2);

		// sql connection : db connection
		
		

		try {
			String name = null;
			if (null != name) {
				name.toLowerCase();

			}
			int num = 90;
			int num2 = 0;
			if (num2 != 0) {
				System.out.println(num / num2);
			}

			int[] arr = { 2, 3, 4 };

			int index = 7;
			if (index < arr.length) {

				System.out.println(arr[index]);
			}
			// class
			
			// intanceOf

			System.out.println("exp occured");
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			System.out.println("i will always execute");
		}

		// String name = null;
		// name.toLowerCase();

		System.out.println("after exp");

	}

}
