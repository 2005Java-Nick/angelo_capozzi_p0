package com.revature.hobbycon.data;

import java.util.Scanner;

import com.revature.hobbycon.menus.LoginMenu;

public class HobbyData {
	boolean exit;
	LoginMenu lm = new LoginMenu();
	public void runHobbyList() {
		while(!exit) {
			printHobbyList();
			int choice = getInput();
			hobbyList(choice);
			System.out.println("welcome to hobbyCon! please login!\n");
			lm.login();
		}
	}
	
	public void hobbyList(int hob) {
		switch(hob) {
		case 1:
			System.out.println("You chose Sports!");
			break;
		case 2:
			System.out.println("You chose Movies!");
			break;
		case 3:
			System.out.println("You chose Arts!");
			break;
		case 4:
			System.out.println("You chose Games!");
			break;
		case 5:
			System.out.println("You chose Cooking!");
			break;
		case 6:
			System.out.println("You chose Music!");
			break;
		case 7:
			System.out.println("You chose Other...");
			break;
		default:
			System.out.println("unknown error...");
			
		}
	}
	
	private void printHobbyList() {
		System.out.println("1.) Sports");
		System.out.println("2.) Movies");
		System.out.println("3.) Art");
		System.out.println("4.) Games");
		System.out.println("5.) Cooking");
		System.out.println("6.) Music");
		System.out.println("7.) Other");
	}
	
	private int getInput() {
		Scanner kb = new Scanner(System.in);
		int choice = -1;
		while(choice < 1 ||choice > 7) {
			try {
				System.out.println("\nEnter a number 1-7.");
				choice = Integer.parseInt(kb.nextLine());
			}catch(NumberFormatException e){
				System.out.println("Invalid selection, please enter a number 1-7");
			}
		}
		
		return choice;
	}

}
