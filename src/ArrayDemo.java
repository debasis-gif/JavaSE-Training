// 1D Array, 2D Array, Jagged Array

public class ArrayDemo {

	public static void main(String[] args) {
		// 1D Array
		// int nums[] = new int[4]; // Array is an object -> 
		int nums[] = {20, 30, 40, 50};  // Alternate better way to assign in a 1D array
		
		/* nums[0] = 20;
		nums[1] = 30;
		nums[2] = 40;
		nums[3] = 50; */
		
		for (int i=0; i<4; i++) {
			System.out.println("Array element " + nums[i]);
		}
		
		// Enhanced FOR loop for 1D array
		for (int k : nums) 
		{
			// System.out.println(k);
		}
		// System.out.println();
		
		// 2D Arrays 
		int a[] = {1,2,3,4};  
		int b[] = {2,4,6,8};
		int c[] = {5,6,7,8};
		
		// Jagged Arrays
		int e[] = {1,2,3};  
		int f[] = {2,4,6,8,9};
		int g[] = {5,6};
		
		int d[][] = {        
						a,	b, c
					};
		
		int jag[][] = {        
						 e, f, g
					  };
		
		// Loop for 2D array
		for (int i=0;i<3; i++)
		{
			for( int j=0; j<4; j++) 
			{
				System.out.print(" " + d[i][j] + " ");  
			}
			System.out.println();
		}
		System.out.println();
		
		// Loop for Jagged arrays
		for (int i=0;i<jag.length; i++)
		{
			for( int j=0; j<jag[i].length; j++) 
			{
				System.out.print(" " + jag[i][j] + " ");  
			}
			System.out.println();
		}
		System.out.println("Normal Loop");
		
		// Enhanced FOR loop for 2D / Jagged arrays
		for (int k[] : jag)
		{
			for (int el : k)
			{
				System.out.print(" " + el + " ");
			}
			System.out.println();
		}
		System.out.println("Enhanced Loop");
	}
}
