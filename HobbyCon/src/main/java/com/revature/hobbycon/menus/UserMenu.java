package com.revature.hobbycon.menus;

import java.util.Scanner;

import com.revature.hobbycon.app.MenuLogic;
import com.revature.hobbycon.data.UserData;

public class UserMenu extends UserData {
	boolean exit;
	Scanner userInput = new Scanner(System.in);
	MenuLogic ml = new MenuLogic();
	
	GroupMenu hg = new GroupMenu();
	public void runUserMenu(UserData ud) {
//		 user = new UserData();
//		String name = user.getUserName();
//		//call username from database,
		this.userName = ud.getUserName();
		System.out.println("Your name: " + userName);
		//ystem.out.println("Your name: " + user.userName);
		
		
		while(!exit) {
			printUserMenu();
			int choice = ml.getInput();
			userMenuSelection(choice);
			
		}
	}
	
	public void userMenuSelection(int action) {		
		
		HobbyMenu hm = new HobbyMenu();
		GroupMenu gm = new GroupMenu();
		
		action = userInput.nextInt();
		switch(action) {
		
		case 1:
			//change hobby method			
			hm.runHobbyList(this);
			break;
		case 2:
			//look up other user
			gm.runGroupMenu();
			break;
		case 3:
			System.out.println("Thanks for using HobbyCon, see you next time :)");
			System.exit(0);
			break;
		default:
			System.out.println("An unknown error occurred");
		}
	}
	
	private void printUserMenu() {
		System.out.println("1.) Change Hobbies: ");
		System.out.println("2.) Look up other User: ");
		System.out.println("3.) Exit");
	};
}
