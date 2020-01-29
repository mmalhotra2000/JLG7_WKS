package edu.gs.test;

class A {
	public void print() {

	}
	
	public void print(int s) {

	}
}

class B extends A {
	public void print() {

	}
	
	public void hello(){
		
	}
}

public class TestMeth {
	
	public static void main(String[] args) {
		
		A a = new B();
		//a.hello();
		B b = (B)a;
		b.hello();
		
		b.print(7 );
	}

}
