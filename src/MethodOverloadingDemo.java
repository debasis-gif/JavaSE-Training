// Method OverLoading 
class Casio
{
	public void add(int i, int j)
	{
		System.out.println("Integer add with 2 parameters : "+ (i + j));
	}
	
	public void add(int i, int j, int k)
	{
		System.out.println("Integer add with 3 parameters : "+ (i + j + k));
	}
	
	public void add(double i, double j)
	{
		System.out.println("Double data type add with 2 parameters : "+(i + j));
	}
}

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		Casio obj = new Casio();
		
		obj.add(5, 2);
		obj.add(5, 4, 10);
		obj.add(5.5, 9.7);
	}

}
