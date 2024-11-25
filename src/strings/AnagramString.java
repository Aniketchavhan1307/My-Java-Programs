package strings;

public class AnagramString 
{
	public static void main(String[] args)
	{
		String s1 = "madam curie";
		
		String s2 = "radium came";
		
		if(s1.length() == s2.length())
		{
			int [] count1 = new int[127];
			int [] count2 = new int [127];
			
			for (int i = 0; i < s1.length(); i++) 
			{
				count1[s1.charAt(i)]++;
				
				count2[s2.charAt(i)]++;
				
			}
			
			int i;
			for ( i = 0; i < count2.length; i++)
			{
				if(count1[i] != count2[i])
				{
					break;
				}
			}
			
			if(i==count1.length)
			{
				System.out.println("It is an anagram...");
			}
			else
			{
				System.out.println("It is not an anagram");
			}
			
		}
		else
		{
			System.out.println("not an anagram....");
		}
		
	}

}
