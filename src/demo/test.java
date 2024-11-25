package demo;

public class test
{

	static String name = "Aniket";
	static int a = 10;
	
	int b = 20;
	
	static 
	{
		System.out.println("from test "
	  + "...........static block");
		

	}
	
	public void showtest()
	{
		System.out.println(a);
	}
	
	public void showtest2()
	{
		System.out.println(name);
		
		System.out.println(b);
	}
	

}
