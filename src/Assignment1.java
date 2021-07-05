
public class Assignment1 {

	// Assignment
			/* 
			 * 1
			 * 1 2 
			 * 1 2 3
			 * 1 2 3 4
			 * 1 2 3 4 5
			 * 
			 * A
			 * A B
			 * A B C
			 * 
			 * $ $ $ $
			 * $     $
			 * $     $
			 * $ $ $ $
			 * 
			 */
	public static void main(String[] args) {
		// Assignment 1.
		for (int i=1; i<=5; i++) {
			for (int j=1; j <= i; j++) {
				//System.out.print(j + " ");
			}
			//System.out.println();
		}
		
		// Assignment 2.
		for (int i=65; i<=67; i++) {
			for (int j=65; j <= i; j++) {
				//System.out.print((char)j + " ");
			}
			//System.out.println();
		}
		
		// Assignment 3.
		for (int i=1; i<=4; i++) {
			for (int j=1; j <= 4; j++) {
				if ( (i==2 && (j == 2 || j == 3)) || (i==3 && (j == 2 || j == 3)) ) 
					System.out.print(" " + " ");
				else 
					System.out.print("$" + " ");
				}
			System.out.println();
			}
	}		
}
