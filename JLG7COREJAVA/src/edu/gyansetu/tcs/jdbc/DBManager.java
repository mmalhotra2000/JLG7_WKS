package edu.gyansetu.tcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

	private static final String url = "jdbc:postgresql://localhost:5433/JLG7";
	private static final String user = "postgres";
	private static final String password = "Sai@1508";

	static {

		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}

	public static Connection getConnectionFromCloud() throws SQLException {
		String url = "jdbc:postgresql://rajje.db.elephantsql.com:5432/mjkwijtt";
		String user = "mjkwijtt";
		String password = "JPdHsWWlZnoUBGtjCKinxWl2eat6S3dg";

		return DriverManager.getConnection(url, user, password);
	}

}
