package edu.gyansetu.tcs.oops.practice;

public class TestCircle {

	public static void main(String[] args) {
		Circle circle = new Circle();

		double rad = circle.getRadius();
		System.out.println("rad is " + rad);

		Circle circle2 = new Circle(44);

		double rad22 = circle2.getRadius();
		System.out.println("rad22 is " + rad22);
		
		System.out.println(circle2);

	}

}
