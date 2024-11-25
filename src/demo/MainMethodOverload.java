package demo;

public class MainMethodOverload 
{
	public static void main(String[] args)
	{
		System.out.println("Hi.....");
		
		int []ar = new int [0];
		
		main(ar);
	}

	public static void main(int ... args) 
	{
		System.out.println("hello.....");
		
		System.out.println(args.length);
	}
}
