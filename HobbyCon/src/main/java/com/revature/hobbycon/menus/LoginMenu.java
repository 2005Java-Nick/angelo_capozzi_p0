package com.revature.hobbycon.menus;

import java.util.Scanner;

import com.revature.hobbycon.dao.UserDAO;
import com.revature.hobbycon.dao.UserDAOPostgres;

import com.revature.hobbycon.data.UserData;



public class LoginMenu extends UserData {

	private Scanner scan = new Scanner(System.in);
	private static UserDAOPostgres userDao = new UserDAOPostgres();		  
	UserMenu um = new UserMenu();
	
	public void login() {
		System.out.println("--Login Menu--");
		System.out.println("\nUser Name?");
		String userName = scan.nextLine();
		System.out.println("Password??");
		String userPW = scan.nextLine();
		//check and see if user has an account
		
		UserData usern = userDao.getUser(userName, userPW);
		if(usern.getUserName() == null) {
			System.out.println("Record not found, please try again or create an account");
			
		} else {
		
		System.out.println("================================================");
		System.out.println("|    Welcome " + userName + " to HobbyCon      |");	
		System.out.println("================================================\n");
		
		um.runUserMenu(usern);
		}
	}
}
