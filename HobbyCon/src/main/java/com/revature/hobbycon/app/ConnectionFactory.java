package com.revature.hobbycon.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static String url;
	private static String username;
	private static String password;
	private static final String DB_NAME = "acap_chin_db_1";
	private static ConnectionFactory cf;
	
	private ConnectionFactory() {
		url = System.getProperty("HOBBY_CON_URL");
		url = "jdbc:postgresql://" + url + ":5432/" +  DB_NAME + "?user=" + username + "&password=" + password;
		username = System.getProperty("HOBBY_CON_USERNAME");
		password = System.getProperty("HOBBY_CON_PASSWORD");
		//String jdbcUrl = "jdbc:postgresql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;
	}
	
	private Connection createConnection() {
		Connection conn = null;		
		try {
			Class.forName("org.postgresql.Driver");
		} catch(ClassNotFoundException e) {
			System.out.println("Failed to load driver");
			e.printStackTrace();
		}		
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch(SQLException e) {
			
			System.out.println("Unable to make Connection");
			e.printStackTrace();
		}		
		return conn;		
	}	
	
	public static Connection getConnection() {
		if(cf == null) {
			cf = new ConnectionFactory();
		}
		return cf.createConnection();
	}
	
}
