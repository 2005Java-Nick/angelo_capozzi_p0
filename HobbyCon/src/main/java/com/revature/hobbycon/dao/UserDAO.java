package com.revature.hobbycon.dao;

import com.revature.hobbycon.data.UserData;

public interface UserDAO {

	public void saveUserName(String userName);
	
	public UserData getUser(String userName, String userPW);
	
	public boolean playerLog(String userName);

	public void saveUser(UserData user);
	
	public void createNewUser(UserData nu);
}
