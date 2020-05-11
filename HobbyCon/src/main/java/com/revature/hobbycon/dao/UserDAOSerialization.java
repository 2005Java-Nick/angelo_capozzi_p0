package com.revature.hobbycon.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.revature.hobbycon.data.UserData;

public class UserDAOSerialization implements UserDAO {

	public void saveUser(UserData ud) {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(ud.getUserName());
			oos = new ObjectOutputStream(fos);
			oos.writeObject(ud);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fos.close();
			} catch(IOException e) {
				e.printStackTrace();
		    }
			try {
				oos.close();
			} catch(IOException e) {
				e.printStackTrace();
		    }
		}
		
				
	}

	public UserData getUser(String userName) {
	
		UserData ud = null;
		
		try (FileInputStream fis = new FileInputStream(userName); ObjectInputStream ois = new ObjectInputStream(fis)){
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} //catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		return ud;
	}
	

}
