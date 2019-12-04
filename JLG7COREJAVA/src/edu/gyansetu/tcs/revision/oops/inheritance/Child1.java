package edu.gyansetu.tcs.revision.oops.inheritance;

public class Child1 extends Parent {

	int age;

	Child1(int age, String ptr) {
		super(ptr);
		this.age = age;
	}
	
	
	public void doMarriage() {
		System.out.println("Do marriage by my choice with " + name);
	}

}
