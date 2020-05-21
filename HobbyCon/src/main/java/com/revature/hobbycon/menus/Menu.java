package com.revature.hobbycon.menus;



import java.util.Scanner;

import com.revature.hobbycon.app.MenuLogic;


               
public class Menu {

	
	//MenuLogic ml = new MenuLogic();
	LoginMenu lm = new LoginMenu();
	SignupMenu sm = new SignupMenu();
	public void runMenu() {
		char exit = 'n';
		String input;
		int choice;	
		Scanner scan = new Scanner(System.in);
		printWelcome();
		
		while(exit != 'y') {
//			printMenu();
//			 choice = ml.getInput();
//			menuSelection(choice);
			System.out.println("Please choose"
					  + "\n1.) Login"
					  + "\n2.) Sign up"
					  + "\n3.) Exit");
			  choice = scan.nextInt();
			  switch(choice){
				case 1:
					lm.login();
					break;
				case 2:
					sm.signup();
					break;
				case 3:
					exit = 'y';
					System.out.println("Thanks for using HobbyCon, see you next time :)");
					break;
				default:
					System.out.println("An unknown error occurred");
			}
			
			 System.out.println("Would you like to exit? y/n.");
			  input = scan.next().toLowerCase();
			  exit = input.charAt(0);
			
		}
	}
	private void printWelcome() {
		
		System.out.println("================================================");
		System.out.println("|             Welcome to HobbyCon              |");
		System.out.println("|          Where Hobbyists Connect!            |");
		System.out.println("================================================\n");
		
	}
	
//	private void printMenu() {
//		
//		System.out.println("Please select a menu option: ");
//		System.out.println("1.) Login");
//		System.out.println("2.) Signup");
//		System.out.println("3.) Quit");
//	
//	}
//	


//	private void menuSelection(int choice) {
//		switch(choice){
//			case 1:
//				lm.login();
//				break;
//			case 2:
//				sm.signup();
//				break;
//			case 3:
//				exit = 'y';
//				System.out.println("Thanks for using HobbyCon, see you next time :)");
//				break;
//			default:
//				System.out.println("An unknown error occurred");
//		}
//	}
}
