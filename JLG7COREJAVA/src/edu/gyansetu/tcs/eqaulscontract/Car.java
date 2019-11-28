package edu.gyansetu.tcs.eqaulscontract;

public class Car extends Automobile {

	private int carId;
	private double price;

	public Car(int carId, double price) {
		super();
		this.carId = carId;
		this.price = price;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + carId;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Car))
			return false;
		Car other = (Car) obj;
		if (carId != other.carId)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	
	
//	public boolean equals(Object obj) {
//
//		boolean isSame = false;
//
//		if (obj instanceof Car) {
//			Car car2 = (Car) obj;
//
//			if (this.carId == car2.carId && this.price == car2.price) {
//				isSame = true;
//			}
//		}
//
//
//		return isSame;
//	}

}
