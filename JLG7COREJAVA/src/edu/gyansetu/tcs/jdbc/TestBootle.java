package edu.gyansetu.tcs.jdbc;

import java.util.ArrayList;

public class TestBootle {

	public static void main(String[] args) {

		BottleRepo bottleRepo = new BottleRepo();

		Bottle bottle = new Bottle(2, "bottle 3", 68797);
		
		for (int i = 3; i <7; i++) {
			bottle = new Bottle(i, "bottle "+i, 68797+i);
			try {
				bottleRepo.createBottle(bottle);
			} catch (MyProjectException e) {

				e.printStackTrace();
			}
		}
	
		
		assertFindAll();

		
	}

	private static void assertFindAll() {
		BottleRepo bottleRepo =  new BottleRepo();
		
		ArrayList<Bottle> bottles =  bottleRepo.findAll();
		
		bottles.forEach(bottle->{
			System.out.println(bottle);
		});
		
	}

}
