package com.revature.hobbycon.menus;

import java.util.Scanner;



public class LoginMenu {
	private Scanner scan = new Scanner(System.in);
	private String userName;
	protected String userPW;
	UserMenu um = new UserMenu();
	public void login() {
		System.out.println("Login Menu");
		System.out.println("User Name?");
		userName = scan.nextLine();
		System.out.println("Password??");
		userPW = scan.nextLine();
		System.out.println("================================================");
		System.out.println("|    Welcome " + userName + " to HobbyCon      |");	
		System.out.println("================================================\n");
		
		um.runUserMenu();
	
	}
}
