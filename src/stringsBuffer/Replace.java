package stringsBuffer;

public class Replace 
{
	public static void main(String[] args) 
	{
		StringBuffer s = new StringBuffer("Aniket");
		
		System.out.println(s);
		
		s.replace(2, 5, "HELLO");
		
		System.out.println(s);
		
		s.delete(2, 5);
		System.out.println(s);
		
		s.deleteCharAt(2);
		System.out.println(s);
		
	}
}
