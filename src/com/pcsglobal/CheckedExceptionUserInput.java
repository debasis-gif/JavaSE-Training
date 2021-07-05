// Checked Exception || Finally Block
// Checked Exception - Compiler is aware of the error and warns during compilation
// throws Exception in the main function resolves the issue
// Resources - BufferedReader, InputStreamReader are all resources of java.io package - these resources should be CLOSED after usage 
// Leaving the Resources open can consume huge memory, and the program can be less resource efficient and hence weak in performance
// Finally - Resources must be closed in Finally block rather than in try-catch block
// A TRY block can be done without the CATCH block, but at least need to have a FINALLY block
// Last ->
// TRY WITH RESOURCE - does not require a catch or finally block but ensures the resources are closed

package com.pcsglobal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckedExceptionUserInput {
	public static void main(String[] args) throws Exception // to overcome the Checked Exception by the compiler - in
															// this case IOException
															// Even if we have used try-catch the finally block close() might catch error
															// to overcome that without another try-catch it is best practice to use throws Exception
	{
		int n = 0;
		System.out.println("Enter a number: ");

		/*  
		// TRY-CATCH-FINALLY
		// If we want to use try catch and print the user defined Error message, we can use the following:
		try {
			BufferedReader br = null; // BufferedReader is a resource for java.io package
			br = new BufferedReader(new InputStreamReader(System.in));    // br is a resource 
			n = Integer.parseInt(br.readLine()); // It encounters a Checked Exception by compiler
													// "Unhandled exception type IOException"
			System.out.println("\n\nHere's the output: " + n);
			br.close(); 							// Resources of Java.io needs to be closed
													// But this line might not be executed if the try block catches error
		} catch (Exception e) {
			System.err.println("Error : Only valid Integer Input required (<=9 digits) : " +e);
		}
		finally {
			br.close();								// This ensures/forces the resources are closed and not kept open after try block receives error
			System.out.println("Resources are closed now");
		}	
		*/
		
		// TRY-WITH-RESOURCE
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))   // this try-with-resource syntax ensures resources are closed 
																						// even if catch-finally block is not used
		{
			n = Integer.parseInt(br.readLine());
			System.out.println("\n\nHere's the output: " + n);
		}
	}
}
