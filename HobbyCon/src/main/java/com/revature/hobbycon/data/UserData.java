package com.revature.hobbycon.data;

import java.io.Serializable;

import org.apache.log4j.Logger;

import com.revature.hobbycon.exceptions.NonLetterCharacterAdded;

//import java.util.Scanner;

public class UserData implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1268233957836567201L;
	/**
	 * 
	 */
	private static Logger log = Logger.getRootLogger();
	
	//user variables	
	protected String firstName;
	public String lastName;	
	protected String userName;	
	protected int userId;
	protected String userPW;
	protected String hobbyName;
	protected int hobbyID;
	
	
	
	
	
	
	
	//=======get set first name==========
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) throws NonLetterCharacterAdded {
			isALetter(firstName);
			this.firstName = firstName;
			try {
				
			}catch(IllegalArgumentException e) {
				log.error("Please use only letters in your name, this isnt a chat room");
				throw new NonLetterCharacterAdded(e);
			}
			
		}
		//=========get set last name===============
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	
	//============get/set user name=============
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) throws NonLetterCharacterAdded {
		isALetter(userName);
		this.userName = userName;
		try {
			
		}catch(IllegalArgumentException e) {
			log.error("Please use only letters in your name, this isnt a chat room");
			throw new NonLetterCharacterAdded(e);
		}
		
	}
	//============get/set user ID===================
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	//============get/set user PW===================
	public String getUserPW() {
		return userPW;
	}
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	//===========get set hobby name================
	public String getHobbyName() {
		return hobbyName;
	}
	public void setHobbyName(String hobbyName) {
		this.hobbyName = hobbyName;
	}
	//===========get set hobby ID================
	public int getHobbyID() {
		return hobbyID;
	}
	public void setHobbyID(int hobbyID) {
		this.hobbyID = hobbyID;
	}
	
	public static boolean isALetter(CharSequence charSeq) {
		if(noChar(charSeq)) {
			return false;
		}
		
		final int ch = charSeq.length();
		for(int i = 0; i < ch; i++) {
			if(!Character.isLetter(charSeq.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean noChar(CharSequence charSeq) {
		return charSeq == null || charSeq.length() == 0;
	}
}
