package edu.gyansetu.tcs.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class WebApp {

	public static void main(String[] args) {

		try {
			loadHomePage();
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			System.out.println("error 404 not found");
		}

	}

	private static void loadHomePage() throws UserNotFoundException {
		// TODO Auto-generated method stub
		clickOnFindUser();
	}

	private static void clickOnFindUser() throws UserNotFoundException {
		// TODO Auto-generated method stub
		getUserByUserId();

	}

	private static void getUserByUserId() throws UserNotFoundException{
		// TODO Auto-generated method stub
		findUserFromDB();
	}

	private static void findUserFromDB() throws UserNotFoundException {

		try {
			
		
			Connection connection = DriverManager.getConnection("jdbc:postgre://local");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new UserNotFoundException("db connection failed",e);
		}
	}

}