package edu.gyansetu.tcs.oops1;

interface Walkable {

	public static final int var = 2;

	void walk();
}

abstract class Shape {

	public void m1() {
		System.out.println("method of class shape");
	}

	public abstract void display();
}

class Circle extends Shape implements Walkable {

	@Override
	public void display() {

		System.out.println("i am in circle");
	}

	@Override
	public void walk() {
		System.out.println("walking");

	}
}

public class TestAbs1 {

	public static void main(String[] args) {
		Shape shape1= new Circle();
		
		shape1.display();
		
		Circle circle =(Circle) shape1;
		
		Walkable cs = circle;
		
		//cs.var=90;
		
	}

}
