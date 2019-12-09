package edu.gyansetu.tcs.oops.design;

interface Wheel {

	public void tyreTestMethod();

}

class MarutiWheel implements Wheel {

	@Override
	public void tyreTestMethod() {
		System.out.println("from MarutiWheel ");
	}

}

class FordWheel implements Wheel{

	@Override
	public void tyreTestMethod() {
		System.out.println("from FordWheel ");

	}

}

class Car {
	private int id;
	private Wheel wheel;

	public Car(int id, Wheel wheel) {
		super();
		this.id = id;
		this.wheel = wheel;
	}

	public void testWheel() {
		wheel.tyreTestMethod();
	}

}

public class DITest {

	public static void main(String[] args) {

		Wheel wheel1 = new FordWheel();
				//spring.getObject(MarutiWheel.class);
		Wheel wheel2 = new MarutiWheel();

		Car car = new Car(12, wheel2);
		car.testWheel();

	}

}
