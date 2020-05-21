package com.revature.hobbycon.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.hobbycon.data.UserData;

public class LoginTest {

	private UserData ud;
	
	private static final String USER_PW = "Ferrari";
	private static final String FULL_NAME = "Guy Ferrari";
	
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ud = new UserData();
		ud.setUserName(FULL_NAME);
		ud.setUserPW(USER_PW);
		ud.getUserName();
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testName() {
		
		assertEquals("User's full name is ", FULL_NAME, ud.getUserName());
	}

//	@Test
//	public void testLettersOnly() {
//	
//		assertTrue(FULL_NAME);
//		assertFalse(1234);
//	}
}
