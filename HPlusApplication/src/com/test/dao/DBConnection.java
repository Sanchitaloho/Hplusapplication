package com.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnectionToDatabase() {
		Connection connection = null;

		try {

			// load the driver class
			Class.forName("com.sqlserver.jdbc.Driver");
			System.out.println("SQL server JDBC Driver Registered!");

			// get hold of the DriverManager
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hplus", "root", "root");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your SQL JDBC Driver?");
			e.printStackTrace();

		}

		catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();

		}

		if (connection != null) {
			System.out.println("Connection made to DB!");
		}
		return connection;
	}

}
