package com.java8;

public class MyClass implements Walkable{

	@Override
	public void walk() {
		System.out.println("walk");
	}
	
	@Override
	public void m1() {
		Walkable.super.m1();
	}

}
