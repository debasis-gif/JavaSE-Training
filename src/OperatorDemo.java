
public class OperatorDemo {
	/*
	 * Arithmetic +, -, *, /, %
	 * Bitwise
	 * Relational
	 * Logical
	 */
	public static void main(String[] args) {
		int m=6, n=2;
		int r1 = m + n; // 10
		int r2 = m - n; // 2
		int r3 = m * n; // 24
		double r4 = (double)m / n; // 1 -> type cast to double to get 1.5
		int r5 = m % n;
		
		// Shorthand operators
		m += n; // m = m + n = 8
		m -= n; // m = m - n = 6
		m *= n; // m = m * n = 12
		m /= n; // m = m / n = 
		m %= n; // m = m % n = 0
		
		n++; // n += 1  n = n + 1 -> post increment
		++n; // pre increment
		m = n++;
		System.out.println("m = "+m);
		System.out.println("n = "+n);
		m = ++n;
		System.out.println("m = "+m);
		System.out.println("n = "+n);
	}
}
