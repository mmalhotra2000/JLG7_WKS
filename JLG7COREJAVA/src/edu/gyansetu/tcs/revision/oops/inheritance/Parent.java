package edu.gyansetu.tcs.revision.oops.inheritance;

public final class Parent {

	String name;
	
	

	public Parent(String name) {
		this.name = name;
	}



	public final void doMarriage() {
		System.out.println("Do marriage by parent's choice with " + name);
	}

}
