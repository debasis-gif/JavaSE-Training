// Unchecked EXCEPTION - when the compiler does not give the exception warning - basically it is runtime exception
// To check the Class declaration or implementation press CTRL and move the move over the Class
// TRY CATCH block to handle exceptions
// FINALLY to remove code redundancy
// MULTIPLE EXCEPTION CATCH Block - to avoid multiple catch blocks if the error msg and action needs to be same
// Multiple Exception Catch Block - is necessary if different activities or messages for each error needs to be processed
// catch(Exception) - needs to be the last catch in the try catch block, as it is left for unknown exception handling

package com.pcsglobal;

public class ExceptionDemo { 

	public static void main(String[] args) {
		try {
			int b[] = null;		// Introducing null pointer exception which can be handled by catch(Exception) block
			b[2] = 20;
			
			Integer i = 9 / 2; 	// This is an unchecked runtime exception, compiler does not check this.
								// Unchecked exception at runtime will break the program execution at the point
								// of exception and will not proceed further
			// System.out.println("Bye...");  	// We wanted to print Bye if there's no error, as well as Bye in catch segment if there's error
												// But this code redundancy which is a big violation of standard coding practice
												// to avoid this redundancy we use Finally block 
			
			int a[] = new int[6];				// to try simulate an Array Exception error
			a[5] = 30; 							// Valid statement
			a[4] = 22;							// Exception error out of bound array exception, we introduction another catch block for this
												// To avoid multiple catch blocks we can use ONE CATCH block with multiple Exceptions handled
			
			
		} 
		catch(ArithmeticException | ArrayIndexOutOfBoundsException  e)  // since we understand that the Exception is Arithmetic & Array out of bound
																		// Clubbing multiple exceptions in one Catch block
		{
			System.err.println("Error: "+e);      // .err. to print the Error in Red color
			System.out.println("Breaking out of the application...");
			// System.out.println("Bye...");
		}
		/* 
		catch(ArrayIndexOutOfBoundsException e)		// press CTRL + space to get the class name
		{
			System.err.println("Error: "+e);      // .err. to print the Error in Red color
		}
		*/
		catch(Exception e)							// Exception catch block should be place only at the end and never in the beginning 
													// Otherwise since it the mother of all exceptions the compiler will throw error for other exceptions
		{
			System.err.println("Something went wrong!!!");
		}
		finally
		{
			System.out.println("Bye...");
		}
	}

}
