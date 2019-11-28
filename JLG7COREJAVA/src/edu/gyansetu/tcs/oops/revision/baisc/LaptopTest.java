package edu.gyansetu.tcs.oops.revision.baisc;

public class LaptopTest {
	
	public static void main(String[] args) {

		System.out.println("hello");

		// obj ref variable
		Laptop mac = new Laptop();

		mac.price = 23;
		mac.type = "i8";

		Laptop hp = new Laptop();

		hp.price = 89;
		hp.type = "i5";
		
		
		hp.displayResult(hp);

	}

}
