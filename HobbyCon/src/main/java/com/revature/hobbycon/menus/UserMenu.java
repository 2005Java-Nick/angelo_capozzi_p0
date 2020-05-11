package com.revature.hobbycon.menus;

import java.util.Scanner;

import com.revature.hobbycon.app.MenuLogic;

public class UserMenu {
	boolean exit;
	Scanner userInput = new Scanner(System.in);
	MenuLogic ml = new MenuLogic();
	public void runUserMenu() {
		
		while(!exit) {
			printUserMenu();
			int choice = ml.getInput();
			userMenuSelection(choice);
			
		}
	}
	
	public void userMenuSelection(int action) {
		
		action = userInput.nextInt();
		switch(action) {
		
		case 1:
			//change hobby method
			break;
		case 2:
			//look up other user
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
		System.out.println("2.) Look up other User");
		System.out.println("3.) Exit");
	};
}
