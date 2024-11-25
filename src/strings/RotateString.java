package strings;

public class RotateString 
{
	public static void main(String[] args) 
	{
		String s = "Hello";
		
		String rot = "" + s.charAt(s.length()-1);
		
		for (int i = 0; i < s.length()-1; i++) 
		{
			rot = rot + s.charAt(i);
			System.out.println(s.charAt(i));
			
		}
		
		System.out.println(rot);
		
	}

}
