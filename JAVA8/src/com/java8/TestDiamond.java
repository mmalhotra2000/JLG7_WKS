package com.java8;

interface I1 {
	default void m1() {
		System.out.println("I1:m1");
	}
}

interface I2 {
	default void m1() {
		System.out.println("I2:m1");
	}
}

class Child implements I1,I2{

	@Override
	public void m1() {
		System.out.println("hello");
	}
	
}

public class TestDiamond {
	public static void main(String[] args) {
		I1 i1 =  new Child();
		i1.m1();
	}

}
