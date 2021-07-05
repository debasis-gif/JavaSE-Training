// User Defined Exception created
// As per Exception class a String can be passed in the Exception constructor 
// Therefore on the User defined Exception a constructor needs to be created 
// with String message an argument and call the super class (Exception) with the String argument as message

package com.pcsglobal;

public class MyException extends Exception {
	public MyException(String s) 
	{
		super(s);
	}

}
