package edu.gyansetu.tcs.jdbc;

public class TestBootle {

	public static void main(String[] args) {

		BottleRepo bottleRepo = new BottleRepo();

		Bottle bottle = new Bottle(4, "bottle 4", 68797);

		try {
			bottleRepo.createBottle(bottle);
		} catch (MyProjectException e) {

			e.printStackTrace();
		}
	}

}
