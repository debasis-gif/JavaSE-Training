// SCANNER instead of BufferedReader for User Input
// BufferedReader
// Scanner

package com.pcsglobal;

import java.util.Scanner;

public class UserInputUsingScannerDemo {

	public static void main(String[] args) {
		int num = 0;
		System.out.println("Enter a number: ");
		
		Scanner sc = new Scanner(System.in);        // Scanner is advanced and much simpler to use than BufferedReader. 
													// It is also easy to understand
		try {
			num = sc.nextInt();
			System.out.println("Your Input: "+num);
		} catch(Exception e) {
			System.out.println("Only Integer expected...");
		} finally {
			sc.close();
			System.out.println("Scanner resorce closed..");
		}
	}
}
