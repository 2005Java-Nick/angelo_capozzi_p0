package com.revature.hobbycon.menus;

import java.util.Scanner;

import com.revature.hobbycon.data.HobbyData;
import com.revature.hobbycon.data.UserData;

public class HobbyMenu {
	boolean exit;
	//LoginMenu lm = new LoginMenu();
	private static HobbyData hd = new HobbyData();
	private UserData ud;
	private UserMenu um;
	public void runHobbyList(UserData ud) {
		this.ud = ud;
		this.um = new UserMenu();
		runMenuOpt();
	}
	public void runHobbyList() {
		this.um = new UserMenu();
		runMenuOpt();
	}
	

	public void runMenuOpt() {
		while(!exit) {
			printHobbyList();
			int choice = getInput();
			hobbyList(choice);
			System.out.println("Welcome to HobbyCon!\n");
			//lm.login();
			
			this.um.runUserMenu(ud);

	   }
	}
	
	public void hobbyList(int hob) {
		switch(hob) {
		case 1:
			System.out.println("You chose Sports!");
			//hd.setHobbyAs();
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
