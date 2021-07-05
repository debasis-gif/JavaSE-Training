
public class IterationDemo {
	// while, do while, for, for-each & Nested Loops
	public static void main(String[] args) {
		int i = 1;
		// while
		while (i <= 5) {
			// System.out.println(i + ".) Hello");
			i++;
		}

		// do while
		i = 9;
		do {
			// System.out.println(i + ".) Hello");
			i++;
		} while (i <= 5);

		// for
		for (i = 1; i <= 5; i++) {
			// System.out.println(i + ".) Hello");
		}

		// for-each (also called Enhanced For loop) -> used when using arrays/Collections -> to be discussed later
		{
			// ....
		}

		// Nested Loops -> to print this pattern
		/*
		 ****
		 ****
		 ****
		 ****
		 */
		// outer loop -> to repeat the inner loop for 4 times for 4 rows
		for (int j = 1; j <= 4; j++) {
			// inner loop -> to repeat printing * for 4 times each row
			for (i = 1; i <= 4; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Assignment
		/* 1
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
		 */
	}
}
