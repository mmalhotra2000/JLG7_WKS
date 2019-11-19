package edu.gyansetu.tcs.oops.p2;

public class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean isFilled) {
		super(color, isFilled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getPeri() {
		return 2*Math.PI*radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", isFilled=" + isFilled + "]";
	}

	

	
	
}
