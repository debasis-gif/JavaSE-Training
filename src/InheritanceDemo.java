// Inheritance -> IS-A, HAS-A composition

class Calcu				// Super
{
	public int add(int i, int j)
	{
		return (i + j);
	}
}

class CalcAdv extends Calcu    // Sub Single level inheritance IS-A inheritance
{
	public int sub(int i, int j)
	{
		return (i>j ? (i-j) : (j-i));
	}
}

class CalcVeryAdv extends CalcAdv     // Sub Multi level inheritance  IS-A inheritance
{
	public int mul(int i, int j)
	{
		return (i * j);
	}
}

public class InheritanceDemo {  // HAS-A Composition

	public static void main(String[] args) {
		CalcVeryAdv calc = new CalcVeryAdv();
		int add = calc.add(5, 4);
		int sub = calc.sub(9, 4);
		int mul = calc.mul(10, 4);
		
		System.out.println("Addition : "+ add);
		System.out.println("Subtraction : "+ sub);
		System.out.println("Multiplication : "+ mul);	
	}

}

/*
 * Multiple inheritance is not supported in Java as there is an ambiguity problem
 * class C extends A, B
 * {
 * 
 * }
 * 
 * main()
 * {
 * 		C obj = new C();
 * 		obj.show();  // fails as there is no show method in C
 * 					 // it will have an ambiguity issue as it will find show() in both the classes it extends
 * 					 // hence multiple inheritance is not supported
 * }
 * 
 * class A
 * {
 *    show()
 * }
 * 
 * class B 
 * {
 * 	  show()
 * }
 * 
*/
