package edu.gyansetu.tcs.oops.practice;

public class Circle {

	private double radius;
	private String color;

	public Circle() {
		radius = 1.0;
		color = "red";
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}

	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}


}
