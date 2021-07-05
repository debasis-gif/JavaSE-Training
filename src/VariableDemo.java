

public class VariableDemo {

	public static void main(String args[]) { // String[] or args[] is allowed

		// type decalarations -> int, short, byte, long, char, float, double
		int _$abc_ = 5; // other special characters not allowed int 4abc = 5; variables cannot start with a digit

		int num = 5; // 4 bytes -> 32 bits -> -2,147,483,648 - 2,147,483,647
		short num1 = 5; // 2 bytes -> 16 bits -> -32768 - 32767 which saves a lot of memory instead of using int for short numbers
		byte num2 = 5; // 1 byte -> 8 bits -> -128 - 127
		long num3 = 5000000000l; // is out of range for int, but adding l at end solves
		char c = 'A';
		c = 66; // It will print character equivalent of ascii value 66 = 'B'
		
		num = 50_00_00_000; // 8 zeros more than that is wrong. "_" allowed after ver 1.7
		float percent = 5.5f; // 4 bytes - cannot convert double (by default) to float unless specified by f
		double percent1 = 5.5; // double is default unlike c++ where 8 bytes

		// Casting
		double d = 5; // implicit casting -> int to double -> output 5.0
		int i = (int) 5.6; // type casting or explicit conversion -> double to int -> output 5

		// Naming convention
		/*
		 * Variable Name -> sname, stockprice/stock_price -> Snake Casing Rule does not apply as all are small
		 * Class Name -> String, Integer, Student, Worker, Engineer, MyFirstJavaClass (Noun) -> Camel Casing Rule
		 * Method -> actionPerformed, run, print, write (Verb)
		 * Constant -> PI, DENSITY, MAXPRICE/MAX_PRICE -> Snake Casing Rule applies as to distinguish between 2 words 
		 * Interface Name -> Runable, Serializable, Remote (Adjective)
		 * Constructor -> Abc() -> it is not method but a class constructor
		 */

		System.out.println(_$abc_ + num);
	}

}

