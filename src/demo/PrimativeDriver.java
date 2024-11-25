package demo;

public class PrimativeDriver 
{

	public static void main(String[] args)
	{
		Primative p1 = new Primative("redmi", "mi", "white", 30000,8);
		
		p1.showMobile();
		System.out.println(p1);
		
		Primative p2 = new Primative("redmi", "mi", "white", 30000,8);
		
		p2.showMobile();
		System.out.println(p2);
		
		Primative p3 = new Primative("oppo", "oppo", "white", 40000,8);
		
		p3.showMobile();
		System.out.println(p3);
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		System.out.println(p1.hashCode()== p2.hashCode());
		
		
		
	}
	
}
