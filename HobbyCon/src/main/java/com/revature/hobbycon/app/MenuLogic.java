package com.revature.hobbycon.app;

import java.util.Scanner;

public class MenuLogic {
	
	public void clearScreen() {
	    System.out.println("Thanks for Using HobbyCon!");
	}
	
	public int getInput() {
		Scanner kb = new Scanner(System.in);
		int choice = -1;
		while(choice < 1 ||choice > 3) {
			try {
				System.out.println("\nEnter a number 1-3.");
				choice = Integer.parseInt(kb.nextLine());
			}catch(NumberFormatException e){
				System.out.println("Invalid selection, please enter a number 1-3");
			}
		}
		
		return choice;
	}
}
