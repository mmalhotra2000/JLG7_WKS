package edu.gyansetu.tcs.eqaulscontract;

public class Equals1 {
	public static void main(String[] args) {

		Car car1 = new Car(12, 22.3);

		Car car2 = new Car(12, 22.3);

		String name = "test";

		System.out.println(car1);
		System.out.println(car2);

		if (car1.equals(name)) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}

		// edu.gyansetu.tcs.eqaulscontract.Car@33909752
		// edu.gyansetu.tcs.eqaulscontract.Car@55f96302

		Automobile automobile = new Automobile();
		if (car1.equals(automobile)) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}

	}
}
