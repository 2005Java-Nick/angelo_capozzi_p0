package com.revature.hobbycon.exceptions;

public class NonLetterCharacterAdded extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 817745897866403663L;
	/**
	 * 
	 */
	
	public static final String ERR_MSG = "Please use alphbetical characters for your name...";
	
	public NonLetterCharacterAdded() {
		super(ERR_MSG);
	}
	
	public NonLetterCharacterAdded(Throwable cause) {
		super(ERR_MSG, cause);
	}

	
}
