package com.revature.hobbycon.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.hobbycon.data.UserData;
import com.revature.hobbycon.menus.Menu;

public class TestLettersOnly {

	
	
	private UserData ud;
	private Menu me;
	
	public static boolean isALetter(CharSequence charSeq) {
		if(noChar(charSeq)) {
			return false;
		}
		
		final int ch = charSeq.length();
		for(int i = 0; i < ch; i++) {
			if(!Character.isLetter(charSeq.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean noChar(CharSequence charSeq) {
		return charSeq == null || charSeq.length() == 0;
	}
	
//	me.runMenu() {
//		printWelcome();
//		while(!exit) {
//			printMenu();
//			int choice = ml.getInput();
//			menuSelection(choice);
//			
//		}
//	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 ud = new UserData();
		 ud.setFirstName("Gregg");
		 ud.setLastName("Cooper");
		 ud.getUserName();	 
		 me.runMenu();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertFalse(isALetter(null));
		assertFalse(isALetter(" "));
		assertFalse(isALetter(""));
		assertTrue(isALetter("Pepper"));
		assertTrue(isALetter(ud.getFirstName()));
		assertFalse(isALetter(ud.getUserName()));
		
	}
	
	@Test
	public void testingRunMethod() {
		
	}
	

}
