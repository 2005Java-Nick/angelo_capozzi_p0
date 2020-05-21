package com.revature.hobbycon.tests;

import java.util.Scanner;

import org.junit.Before;

//import static org.junit.Assert.*;

import org.junit.Test;

//import com.revature.hobbycon.app.ConnectionFactory;

import com.revature.hobbycon.connection.JDBCConnection;
import com.revature.hobbycon.dao.UserDAOPostgres;
import com.revature.hobbycon.data.UserData;

public class ConnectionTest {

	UserDAOPostgres udp = new UserDAOPostgres();
	private static UserData user; 
	private static final String NEW_NAME = "Pepper";
	private static final String NEW_PW = "iloveliver";
	private static final String NEW_HOBBY = "art";
//	Scanner scan = new Scanner(System.in);
//	String input = scan.nextLine();
	
	
	
	@Before
	public void setup() {
		user = new UserData();
		user.userName = NEW_NAME;
		user.userPW = NEW_PW;
		user.hobbyName = NEW_HOBBY;
		
		
		
	}
	@Test
	public void test() {
		//ConnectionFactory.getConnection();
		System.out.println("test1");
		JDBCConnection.getRemoteConnection();
		
	}
	@Test
	public void getUserTest() {
		udp.getUser(null, null);
		
		
	} 
	@Test
	public void setNewUser() {
		//user.getUserInfo();	
		System.out.println("checkin for test runs");
		udp.createNewUser(user);
	}

}
