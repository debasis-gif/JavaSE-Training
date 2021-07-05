
public class JumpDemo {
	// continue, 
	public static void main(String[] args) {
		// Continue  --> also use continue to print only odd or even number from 1 to 20
		for (int i=1; i<=10; i++) {
			if (i == 7 || i == 8) {
				continue;  // break will break the loop
			}
			System.out.println("Value is " + i);
		}
	}

}
