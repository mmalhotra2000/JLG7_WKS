package edu.gyansetu.tcs.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BottleRepo {

	Connection connection = null;
	PreparedStatement preparedStatement = null;

	public void createBottle(Bottle bottle) throws MyProjectException {

		String query = "insert into bottle values (?,?,?)";

		try {
			connection = DBManager.getConnectionFromCloud();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, bottle.getId());
			preparedStatement.setString(2, bottle.getName());
			preparedStatement.setInt(3, bottle.getPrice());
			preparedStatement.execute();

		} catch (SQLException e) {

			throw new MyProjectException("Something went wrong", e);

		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (null != preparedStatement) {
					preparedStatement.close();
				}
			} catch (SQLException e) {

				throw new MyProjectException("Something went wrong", e);
			}
		}

	}

}
