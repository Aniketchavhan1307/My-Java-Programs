package strings;

public class PalindromString 
{
	public static void main(String[] args) 
	{
		String s ="madam";
		
		String rev ="";
		
		for (int i = s.length()-1; i >= 0; i--) 
		{
			rev = rev + s.charAt(i);
			
		}
		
		if(s.equals(rev))
		{
			System.out.println("It is a palindrom String");
		}
		else
		{
			System.out.println("It is not a Palindrom String");
		}
		
	}

}
