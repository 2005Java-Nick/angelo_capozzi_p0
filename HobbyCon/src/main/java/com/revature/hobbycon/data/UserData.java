package com.revature.hobbycon.data;

//import java.io.Serializable;

import org.apache.log4j.Logger;

import com.revature.hobbycon.exceptions.NonLetterCharacterAdded;

//import java.util.Scanner;

public class UserData {		
	
	private static Logger log = Logger.getRootLogger();	
	
	//user variables	
	
	public String userName;	
	protected int userId;
	public String userPW;
	public String hobbyName;
	protected int hobbyID;	
	public String userInfo;
	
	public UserData() {
		
	}
	
	public UserData(String userName) {
		this.userName = userName;
		
		
	}
	
	public UserData(String userName, String hobbyName) {
		this.userName = userName;
		
		this.hobbyName = hobbyName;
	}
	
	public UserData(String userName, String userPW, String hobbyName) {
		this.userName = userName;
		this.userPW = userPW;
		this.hobbyName = hobbyName;
	}	
	
	
	public String getUserInfo() {
		return userName + userPW + hobbyName;
	}
	
	
	//============get/set user name=============
	public String getUserName() {
		return userName;
	}
	public String setUserName(String userName) throws NonLetterCharacterAdded {
		isALetter(userName);
		this.userName = userName;
		try {
			
		}catch(IllegalArgumentException e) {
			log.error("Please use only letters in your name, this isnt a chat room");
			throw new NonLetterCharacterAdded(e);
		}	
		
		return null;
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
