//package com.revature.hobbycon.dao;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import java.io.PrintStream;
//
//import org.apache.log4j.Logger;
//
//
//import com.revature.hobbycon.data.UserData;
//
//public class UserDAOSerialization implements UserDAO {
//
//	private static Logger log =  Logger.getRootLogger();
//	File userFile = new File(".");
//	String fileName = "usernameandpw.txt";
//	String absolutePath = "";
//	
//	
//	
//	
//	public void saveUser(UserData ud) {
//		
//	
//		try {
//			absolutePath = userFile.getCanonicalPath() + File.separator + fileName;
//		} catch(FileNotFoundException e) {
//			log.error("Cannot find file" + e);
//			e.printStackTrace();
//		} catch(IOException e) {
//			log.error("Cannot resolve file path" + e);
//			e.printStackTrace();
//		}
//		
//		try {
//			PrintStream printer = new PrintStream(new BufferedOutputStream(new FileOutputStream(absolutePath, true)));
//		    String userName = ud.getUserName();
//		    printer.print(userName);
//		    String password =  ud.getUserPW();
//		    printer.println(password);
//		    printer.close();
//		} catch (IOException e) {
//		    log.error("Cannot write to file.", e);
//		    e.printStackTrace();
//		}
//		
//				
//	}
//	//=========get user===============================
//	
//
//	public UserData getUser(String userName, String password) {
//		// TODO Auto-generated method stub
//		String fileContents = "";
//		
//		try {
//			absolutePath = userFile.getCanonicalPath() + File.separator + fileName;
//		} catch (IOException e) {
//			log.error("Cannot find file " + e);
//			e.printStackTrace();
//		}	
//	    
//		
//		try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(absolutePath))){
//			   int ch = bufferedInputStream.read();
//			    while(ch != -1) {
//			        fileContents += (char) ch;
//			        ch = bufferedInputStream.read();
//			    }
//		} catch (FileNotFoundException e) {
//			log.error("Cannot resolve file path " + e );
//			e.printStackTrace();
//		} catch (IOException e) {
//			log.error("Cannot read from file " + e);
//			e.printStackTrace();
//		} 
//		if (fileContents.contains(userName +  password )) {
//			return new UserData(userName, password);
//		}
//		return null;
//		
//	}
//
//	@Override
//	public boolean playerLog(String userName) {
//		String fileContents = "";
//		
//		try {
//			absolutePath = userFile.getCanonicalPath() + File.separator + fileName;
//		} catch (IOException e) {
//			log.error("Cannot find file " + e);
//			e.printStackTrace();
//		}	
//	    
//		
//		try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(absolutePath))){
//			   int ch = bufferedInputStream.read();
//			    while(ch != -1) {
//			        fileContents += (char) ch;
//			        ch = bufferedInputStream.read();
//			    }
//		} catch (FileNotFoundException e) {
//			log.error("Cannot resolve file path " + e );
//			e.printStackTrace();
//		} catch (IOException e) {
//			log.error("Cannot read from file " + e);
//			e.printStackTrace();
//		} 
//		if (fileContents.contains(userName)) {
//			return false;
//		}
//		
//		
//		return false;
//	}
//
//
//	@Override
//	public UserData getUser(String userName) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//
//}
