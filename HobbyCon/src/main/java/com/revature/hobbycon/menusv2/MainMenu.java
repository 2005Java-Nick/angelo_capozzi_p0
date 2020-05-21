package com.revature.hobbycon.menusv2;

import java.util.Scanner;

import com.revature.hobbycon.data.UserData;

public class MainMenu {
	
	private static String username;
	private static String password;
	private static String hobby;
	
	
	
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		MainMenu.username = username;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		MainMenu.password = password;
	}
	public static String getHobby() {
		return hobby;
	}
	public static void setHobby(String hobby) {
		MainMenu.hobby = hobby;
	}
	public static void main(String[] args) {  
		  char exit = 'n';
		  String input;
		  int choice;
		  Scanner scan = new Scanner(System.in);
		  while(exit != 'y') {
			  System.out.println("Please choose"
					  + "\n1.) Login"
					  + "\n2.) Sign up"
					  + "\n3.) Exit");
			  choice = scan.nextInt();
			  switch(choice) {
			  case 1: opt1(); break;
			  case 2: opt2(); break;
			  case 3: opt3(); break;
			  default: System.out.println("choose 1-3");
			  }
			  System.out.println("Would you like to exit? y/n.");
			  input = scan.next().toLowerCase();
			  exit = input.charAt(0);
		  }
	 }  
	 public static void opt1() {
		 System.out.println("Please Login");
		 loginMenu();
	 }
	 public static void opt2() {
		 System.out.println("Sign up now");
		 return;
	 }
	 public static void opt3() {
		 System.out.println("exiting...");
		 return;
	 }
	 //=====================Menus==============================
	 
	 private static void loginMenu() {
		  
		  String username;
		  String password;
		  String hobby;
		  //String choice;
		  Scanner scan = new Scanner(System.in);
			System.out.println("Login Menu");
			System.out.println("\nUser Name?");
			username = scan.nextLine();
			System.out.println("Password?");
			password = scan.nextLine();
			
			
			System.out.println("Welcome " + username + "\nPick a hobby!");
		  
	 }
}
