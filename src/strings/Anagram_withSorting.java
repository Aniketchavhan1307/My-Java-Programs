package strings;

import java.util.Arrays;

public class Anagram_withSorting 
{
	public static void main(String[] args)
	{
		String s1 ="gop";
		String s2 = "dog";
		
		if(s1.length() == s2.length())
		{
			char [] ch1 = s1.toCharArray();
			char [] ch2 = new char[s2.length()];
			
			ch2 = s2.toCharArray();
			
			
//			Arrays.sort(ch1);
//			Arrays.sort(ch2);
			
			System.out.println(Arrays.toString(ch2));
			System.out.println(Arrays.toString(ch1));
			
			int i;
			for ( i = 0; i < ch2.length; i++) 
			{
				int j;
				for( j = 0 ; j<ch2.length; j++)
				{
					if(ch1[i] == ch2[j])
					{
						System.out.println("hello");
						break;
					}
				}
				if(j == ch2.length)
				{
					break;
				}
				
				
			}
			if(i == ch1.length)
			{
				System.out.println("Anagram....");
			}
			else
			{
				System.out.println("not an anagram");
			}
			
		
			
			
		}
		else
		{
			System.out.println("length is not same......not anagram");
		}
		
	}

}
