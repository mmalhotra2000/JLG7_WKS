package edu.gyansetu.tcs.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection {
	public static void main(String[] args) {

		Connection connection;
		try {
			connection = DBManager.getConnectionFromCloud();
			System.out.println(connection);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
