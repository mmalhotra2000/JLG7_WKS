package edu.gyansetu.tcs.revision.oops.exceptionhandling;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestExp3 {

	public static void main(String[] args) {

		try {
			clickOnViewProfile("Mohit");
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void clickOnViewProfile(String name) throws UserNotFoundException {

		checkAndLoadProfile(name);

	}

	private static void checkAndLoadProfile(String name) throws UserNotFoundException {

		accessDBAndLoadProfile(name);

	}

	private static void accessDBAndLoadProfile(String name) throws UserNotFoundException {

		try {
			DriverManager.getConnection("jdbc:mysql:www.aws.com:3303");
		} catch (SQLException e) {
			
			throw new UserNotFoundException("User is not present",e);
		}

	}

}
