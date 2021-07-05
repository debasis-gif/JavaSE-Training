// Variable Arguments - Varargs
class Calc
{
	public int add(int ... n) // {4,5,6,7,8,9,10,56} Variable length arguments
	{
		int sum=0;
		for (int k : n)
		{
			sum = sum + k;
		}
		return sum;
	}
}
public class VarargsDemo {

	public static void main(String[] args) {
		Calc obj = new Calc();
		
		System.out.println("The sum = " + obj.add(4,5,6,7,8,9,10,56));

	}

}
