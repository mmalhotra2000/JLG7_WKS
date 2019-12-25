package com.java8.lambda;

interface Flyable {

	void fly(String name, int wings);
}

interface Multiplyable {

	int multiply(int a, int b);
}

public class TestLambda1 {

	public static void main(String[] args) {

		// Flyable flyable = new Flyable() {
		//
		// @Override
		// public void fly() {
		// System.out.println("fly");
		//
		// }
		// };

		// flyable.fly();

		Flyable flyable2 = (name, w) -> {
			System.out.println("flying inside lambda " + name + w);
		};

		flyable2.fly("mohit", 78);

		Multiplyable multiplyable = (int a,int  b) -> {
			return a * b;
		};

		// (a, b) -> (a * b);

		int res = multiplyable.multiply(3, 4);
		System.out.println(res);

	}

}
