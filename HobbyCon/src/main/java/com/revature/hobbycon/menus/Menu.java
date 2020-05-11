package com.revature.hobbycon.menus;



import com.revature.hobbycon.app.MenuLogic;


               
public class Menu {

	boolean exit;
	MenuLogic ml = new MenuLogic();
	LoginMenu lm = new LoginMenu();
	SignupMenu sm = new SignupMenu();
	public void runMenu() {
		printWelcome();
		while(!exit) {
			printMenu();
			int choice = ml.getInput();
			menuSelection(choice);
			
		}
	}
	private void printWelcome() {
		
		System.out.println("================================================");
		System.out.println("|             Welcome to HobbyCon              |");
		System.out.println("|          Where Hobbyists Connect!            |");
		System.out.println("================================================\n");
		
	}
	
	private void printMenu() {
		
		System.out.println("Please select a menu option: ");
		System.out.println("1.) Login");
		System.out.println("2.) Signup");
		System.out.println("3.) Quit");
	
	}
	


	private void menuSelection(int choice) {
		switch(choice){
			case 1:
				lm.login();
				break;
			case 2:
				sm.signup();
				break;
			case 3:
				exit = true;
				System.out.println("Thanks for using HobbyCon, see you next time :)");
				break;
			default:
				System.out.println("An unknown error occurred");
		}
	}
}
