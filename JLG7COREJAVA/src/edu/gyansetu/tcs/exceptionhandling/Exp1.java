package edu.gyansetu.tcs.exceptionhandling;

public class Exp1 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };
		String name = null;
				//"mohit";

		System.out.println("before exp");
		try {
			if(null!=name) {
				name.toLowerCase();				
			}
			String some= "sddv";
			
			Integer integer = Integer.valueOf("123");
			int index = 5;
			if(index<arr.length) {				
				System.out.println(arr[index]);
			}
			System.out.println("line3");

		} catch (RuntimeException e) {
			System.out.println("array index exp caught");
			e.printStackTrace();
		}
		finally {
			System.out.println("close db connection");
		}
		System.out.println("after exp");

	}
}