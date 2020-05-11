package com.revature.hobbycon.menus;

import java.util.Scanner;

import com.revature.hobbycon.app.MenuLogic;
import com.revature.hobbycon.data.HobbyData;
import com.revature.hobbycon.data.UserData;

	public class SignupMenu extends UserData {
		
	private Scanner scan = new Scanner(System.in);
	
//	LoginMenu lm = new LoginMenu();
	HobbyData hd = new HobbyData();
		public void signup() {
			System.out.println("Signup Menu");
			System.out.println("\nUser Name?");
			userName = scan.nextLine();
			System.out.println("Password?");
			userPW = scan.nextLine();
			System.out.println("\nPick a hobby!");
			
			hd.runHobbyList();
			
			
			
		}
		
	
		
		
}
