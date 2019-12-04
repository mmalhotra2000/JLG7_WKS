package edu.gyansetu.tcs.datastructures;

public class MyStackTest {
	
	public static void main(String[] args) {
		
		
		MyStack myStack1 = new MyStack();
		
		myStack1.push("www.abc.com");
		myStack1.push("www.xyz.com");

		myStack1.push("www.oop.com");

		myStack1.push("www.javat.com");
		
		//
		
		System.out.println(myStack1.pop());

	}

}
