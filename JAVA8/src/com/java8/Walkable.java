package com.java8;

@FunctionalInterface
 interface Walkable {
	
	public void walk();
	
	public String toString();
	
	public default void m1() {
		System.out.println("def 1");
	}

	
	//public void talk();

}
