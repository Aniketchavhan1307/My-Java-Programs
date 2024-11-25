package stringBuilder;

public class First 
{
	public static void main(String[] args) 
	{
		StringBuilder s = new StringBuilder();
		
		s.append("Hello Hello hello");
		
		
		
		System.out.println(s);
		
		System.out.println(s.capacity());
		
		StringBuilder s2 = new StringBuilder("Aniket");
		
		StringBuilder s3 = s2.append(" Chavhan");
		
		System.out.println(s2);
		System.out.println(s3);
		
		String a = "pune";
		String b = a + " Deccan";
		
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
