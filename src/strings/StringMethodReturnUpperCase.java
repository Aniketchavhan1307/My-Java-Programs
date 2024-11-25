package strings;

public class StringMethodReturnUpperCase 
{
	
	public static void main(String[] args)
	{
		String s = "ANikeT";
		
		System.out.println(convertToUpperCase(s));
	}
	
	public static String convertToUpperCase(String s)
	{
		String ans ="";
		
		for (int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(ch>= 'A' && ch <= 'Z')
			{
				ans = ans + (char) (ch+32);
			}
			else if (ch>= 'a' && ch<= 'z')
			{
				ans = ans + (char ) (ch-32);
			}
			else
			{
				ans += ch;
			}
			
		}
		return ans;
	}

}
