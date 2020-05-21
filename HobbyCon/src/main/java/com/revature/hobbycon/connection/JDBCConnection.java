package com.revature.hobbycon.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

//import com.revature.hobbycon.app.ConnectionFactory;

public class JDBCConnection {
	private static Logger logger = Logger.getRootLogger();
	
	private static String hostname;
	private static String username;
	private static String password;
	private static String dbName; 
	private static String port;
	
	public static Connection getRemoteConnection() {
		//System.out.println("Running");
	   
	      try {
	      System.out.println("Connecting...");
	      Class.forName("org.postgresql.Driver");
	      dbName = System.getenv("HOBBY_CON_DBNAME");
	      username = System.getenv("HOBBY_CON_USERNAME");
	      password = System.getenv("HOBBY_CON_PASSWORD");
	      hostname = System.getenv("HOBBY_CON_URL");
	      port = System.getenv("HOBBY_CON_PORT");
	      String jdbcUrl = "jdbc:postgresql://" + hostname + ":" + "5432" + "/" + dbName + "?user=" + username + "&password=" + password;
	      logger.trace("Getting remote connection with connection string from environment variables.");
	      Connection con = DriverManager.getConnection(jdbcUrl);
	      logger.info("Remote connection successful.");
	      System.out.println("Connected!");
	     
	      return con;
	    } catch (ClassNotFoundException e) { 
	    	logger.warn(e.toString());
	    } catch (SQLException e) {
	    	logger.warn(e.toString());
	    }
	    
	    
	    return null;
	  }
	
	
}
