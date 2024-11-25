package interfaces;

public class testImp1 extends Object implements test 
{
	int i = 1111;
	public static final String s = "testImp1....Qspider";
	String name = "Aniket";
	
	{
		System.out.println("From non-static block of  testImp1 ");
	}
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public void subtract(int a, int b)
	{
		System.out.println(a-b);
	}
	
	public void write()
	{
		System.out.println("From non-static method block of  testImp1 ");
	}

	public static void show()
	{
		System.out.println("From static block of  testImp1 ..............Welcome to Qspider ............");
	}
	
}
