package com.revature.hobbycon.dao;

import com.revature.hobbycon.data.UserData;

public interface UserDAO {

	public void saveUser(UserData ud);
	
	public UserData getUser(String userName);
}
