
public class OperatorDemo {
	/*
	 * Arithmetic +, -, *, /, %
	 * Bitwise  (OR)|, (AND)&, (XOR)^
	 * a=5=0101; b=7=0111 5 | 7 = 0101 | 0111 = 0111 (7)
	 * a=5=0101; b=7=0111 5 & 7 = 0101 & 0111 = 0101 (5)
	 * a=5=0101; b=7=0111 5 ^ 7 = 0101 ^ 0111 = 0010 (2) 
	 * XOR -> if corresponding bits are different, it gives 1, else it gives 0. 
	 * Relational
	 * Logical
	 */
	public static void main(String[] args) {
		int m=6, n=4;
		int r1 = m + n; // 10
		int r2 = m - n; // 2
		int r3 = m * n; // 24
		double r4 = (double)m / n; // 1 -> type cast to double to get 1.5
		int r5 = m % n;
		System.out.println("r1 = " +r1+ "\nr2 = " + r2 + "\nr3 = "+r3+ "\nr4 = "+r4+ "\nr5 = "+r5);
		
		// Shorthand operators
		m += n; // m = m + n = 10
		System.out.println("m = "+m);
		m -= n; // m = m - n = 6
		System.out.println("m = "+m);
		m *= n; // m = m * n = 24
		System.out.println("m = "+m);
		m /= n; // m = m / n = 6
		System.out.println("m = "+m);
		m %= n; // m = m % n = 2
		System.out.println("m = "+m);
		
		n++; // n += 1  n = n + 1 -> post increment
		System.out.println("n = "+n);
		++n; // pre increment
		System.out.println("n = "+n);
		m = n++;
		System.out.println("m = "+m);
		System.out.println("n = "+n);
		m = ++n;
		System.out.println("m = "+m);
		System.out.println("n = "+n);
	}
}
