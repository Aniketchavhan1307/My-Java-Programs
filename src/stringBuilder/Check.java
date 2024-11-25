package stringBuilder;

public class Check 
{
	public static void main(String[] args) 
	{
		StringBuilder s1 = new StringBuilder("India");
		
		System.out.print(s1);
		
		StringBuilder s2 = new StringBuilder("India");
		

		System.out.println();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.toString() == s2.toString());
		
		System.out.println(s1.toString().equals(s2.toString()));
		
		System.out.println(s1.equals(s1));
		
		System.out.println(s1 == s1);
		
		
	}

}
