package com.java8.lambda;

import java.util.Optional;
import java.util.function.BiFunction;

interface Walkable {

	public void walk();
}

class MyClass2 {

	MyClass2() {
		System.out.println("from cons");
	}

	public static void m1() {
		System.out.println("hello from m1");
	}

	public void m2() {
		System.out.println("hello from m2");
	}

}

class Arithmetic {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
}

public class TestMethodRef {

	public static void main(String[] args) {

		Walkable walkable = MyClass2::new;
		// walk :: m1
		testMethods(walkable);

		BiFunction<Integer, Integer, Integer> biFunction = new Arithmetic()::add;

		int ress = biFunction.apply(34, 4);
		
		biFunction = new Arithmetic()::sub;
		
		String name =  getData().get();
		System.out.println(name);
		
	
		
		System.out.println(ress);

	}

	private static Optional<String> getData() {
		// TODO Auto-generated method stub
		return Optional.of("mohit");
	}

	public static void testMethods(Walkable walkable) {
		walkable.walk();
	}
}
