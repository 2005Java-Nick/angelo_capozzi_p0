package com.revature.hobbycon.menus;

import java.util.Scanner;

import com.revature.hobbycon.app.MenuLogic;
import com.revature.hobbycon.dao.UserDAO;
import com.revature.hobbycon.dao.UserDAOPostgres;

import com.revature.hobbycon.data.HobbyData;
import com.revature.hobbycon.data.UserData;
import com.revature.hobbycon.exceptions.NonLetterCharacterAdded;


    

	public class SignupMenu extends UserData {	
		
		private static UserDAO userDao = new UserDAOPostgres();
		private static UserData user = new UserData();
		
		private Scanner scan = new Scanner(System.in);
		//private static final long serialVersionUID = 1L;
        //LoginMenu lm = new LoginMenu();
	    HobbyMenu hm = new HobbyMenu();
		public void signup() {
			String username;
			String password;
			String hobby;
			
			System.out.println("Signup Menu");
			System.out.println("\nWhat will be your User Name?");
			username = scan.nextLine();
			try {
				user.setUserName(username);
				
			} catch (NonLetterCharacterAdded e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("...and your Password?");
			password = scan.nextLine();
			user.setUserPW(password);
				
			
			
			userDao.createNewUser(user);
			String name = user.getUserName();
			System.out.println("Welcome " + name + "\nPick a hobby!");
			//user = new UserData(userName, userPW, hobbyName);
			hm.runHobbyList(user);
			
			
			
		}
		
	
		
		
}
