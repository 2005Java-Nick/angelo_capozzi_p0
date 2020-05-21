package com.revature.hobbycon.menus;

import java.util.Scanner;

import com.revature.hobbycon.app.MenuLogic;

public class GroupMenu {
	boolean exit;
	Scanner userInput = new Scanner(System.in);
	
	
	MenuLogic ml = new MenuLogic();
	//Menu menu = new Menu();
	public void runGroupMenu() {
		
		while(!exit) {
			runHobbyGroup();
			printGroupMenu();
			int choice = ml.getInput();
			groupMenuSelection(choice);
			
		}
	}
	
	public void runHobbyGroup() {
		System.out.println("+-------------------------+");
		System.out.println("|                         |");
		System.out.println("|=====HobbyCon Members====|");                       
		System.out.println("|                         |");
		System.out.println("+-------------------------+");
		
		System.out.println();
		
	}
	
    public void groupMenuSelection(int action) {		
    	
    	HobbyMenu hm = new HobbyMenu();
    	Menu menu = new Menu();
    	
		action = userInput.nextInt();
		switch(action) {
		
		case 1:
			//change hobby method			
			hm.runHobbyList();
			break;
		case 2:
			//return to main menu             
			menu.runMenu();
			break;
		case 3:
			System.out.println("Thanks for using HobbyCon, see you next time :)");
			System.exit(0);
			break;
		default:
			System.out.println("An unknown error occurred");
		}
	}
	
	private void printGroupMenu() {
		System.out.println("1.) Change Hobbies: ");
		System.out.println("2.) Return to Login/Signup");
		System.out.println("3.) Exit");
	};
}
