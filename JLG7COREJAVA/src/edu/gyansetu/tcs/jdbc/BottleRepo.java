package edu.gyansetu.tcs.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BottleRepo extends BaseRepo{

	

	public void createBottle(Bottle bottle) throws MyProjectException {

		String query = "insert into bottle values (?,?,?)";

		try {
			connection = DBManager.getConnection();
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

	public ArrayList<Bottle> findAll() {

		String query = "select * from bottle";
		ArrayList<Bottle> bottles = new ArrayList<>();

		try {
			connection = DBManager.getConnection();
			preparedStatement = connection.prepareStatement(query);

			Bottle bottle = null;

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				bottle = new Bottle();
				bottle.setId(resultSet.getInt(1));
				bottle.setName(resultSet.getString("name"));
				bottle.setPrice(resultSet.getInt("price"));
				bottles.add(bottle);
			}
		}

		catch (SQLException exception) {
			exception.printStackTrace();
		}

		return bottles;

	}
}
