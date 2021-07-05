// Primitive Data types -> char, byte, short, int, float, long, double, boolean
// Wrapper Class data types -> Character, Byte, Short, Integer, Float, Long, Double, Boolean
// Wrapper Classes are slow in performance than primitive data types, 
// but there are certain frameworks like Hibernate or Collection API which mandate the use of Wrapper classes

public class WrapperDemo 
{
	@SuppressWarnings(value = { "version9" })
	public static void main(String[] args) 
	{
			int i = 5; // primitive data type
			
			@SuppressWarnings(value = {"deprecation" })
			Integer ii = new Integer(5);   // Wrapper Class data type
			Integer a = new Integer(i);    // Boxing in OOPS - Wrapping in Java - a primitive datatype as argument in Wrapper Class 
										   // putting the value in an object is Boxing/Wrapping
			
			int j = a.intValue();  // put the 5 in j -> Unboxing / Unwrapping - to get the value from an wrapped object
			
			Integer value = i;    // Internally Java will create the object as Integer value = new Integer(i); -> Autoboxing / Autowrapping
			
			int k = value;        // Internally Java will create the primitive variable as int k = value.intValue(); -> Autounboxing / Autounwrapping
			
			String str = "123";
			// int n = str;  // type mismatch -> String cannot be converted to int ->
			// int n = parseInt(str); // parseInt is undefined type for WrapperDemo
			int n = Integer.parseInt(str);
			
			System.out.println("Object a: "+ a);
			System.out.println("Object ii: "+ ii);
			System.out.println("int i: "+ i);
			System.out.println("Object value: "+ value);
			System.out.println("primitive k: "+k);
			System.out.println("String converted to int n: " + n);
	}

}
