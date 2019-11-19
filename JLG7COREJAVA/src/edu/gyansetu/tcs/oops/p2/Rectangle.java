package edu.gyansetu.tcs.oops.p2;

public class Rectangle extends Shape {

	private double width;
	private double length;

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle(String color, boolean isFilled, double width, double length) {
		super(color, isFilled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getPeri() {
		return 2 * (length + width);
	}

	public double getArea() {
		return length * width;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", color=" + color + ", isFilled=" + isFilled + "]";
	}

}
