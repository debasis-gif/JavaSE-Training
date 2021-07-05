// User Defined Exception - Forcing an Exception handling without actually being a compilation or runtime error


package com.pcsglobal;

public class UserDefinedExceptionDemo {
	
	public static void main(String[] args) throws Exception
	{
		
		int i=8, j=0, l=9, k=0;
		
		try {
			k = i / j;      // This Error will be handled by Unchecked Error handler through throws Exception in main
			
			k = i / l;		// This Error will be handled by User Defined Exception
			if (k == 0)   
				//throw new Exception();    // Forcing an exception to catch
			 	// throw new MyException();  // creating a user defined Exception class in the same package -> Click on the error option to create a class
				throw new MyException("Zero(0) is not expected result...");
			
		} catch(MyException e) {
			// System.err.println("Error : " +e);   				// Output: "Error : com.pcsglobal.MyException"
			System.err.println("Error : " +e.getMessage()); 	// Output: "null"
																// If I want to customize the error message, 
																// we can pass a message string as argument to MyException
		} catch(Exception e) {
			System.err.println("Error: Division by Zero...");
		}

	}

}
