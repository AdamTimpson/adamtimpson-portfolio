package com.adamtimpson.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseConnection {

	private static Connection connection = null;
	private static Statement statement = null;
	
	private static final String DATABASE_NAME = "adamtimpson-portfolio";
	
	/**
	 * Method to connect to the DB
	 */
	public static void initDb() {
		try {
			String url = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
			
			connection = DriverManager.getConnection(url, "root", "admin");
			
			statement = connection.createStatement();
			
			System.out.println("Connected to: " + DATABASE_NAME);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Method to send a query to the DB
	 * @param sql SQL query to be sent 
	 * @return ResultSet 
	 * @throws SQLException
	 */
	public static ResultSet sendQuery(String sql) throws SQLException {
		return statement.executeQuery(sql);
	}
	
	/**
	 * Method to send an update to the DB
	 * @param sql SQL update to be sent
	 * @throws SQLException 
	 */
	public static void sendUpdate(String sql) throws SQLException {
		statement.executeUpdate(sql);
	}
	
	/**
	 * Method to close the connection from the DB
	 */
	public static void cleanUp() {
		try {
			connection.close();
			System.out.println("Disconnected from: " + DATABASE_NAME);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
