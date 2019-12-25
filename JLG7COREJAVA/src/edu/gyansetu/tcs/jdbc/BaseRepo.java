package edu.gyansetu.tcs.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseRepo {

	protected Connection connection = null;
	protected PreparedStatement preparedStatement = null;
	protected ResultSet resultSet = null;

	
	public BaseRepo() {
		getConnection();
	}

	protected Connection getConnection() {
		try {
			connection = DBManager.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;

	}

}
