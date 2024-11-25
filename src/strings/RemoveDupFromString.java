package strings;

import java.util.Arrays;

public class RemoveDupFromString 
{
	public static void main(String[] args) 
	{
		String str = "abacdback Aniket";
		
		char[]  ch = str.toCharArray();
		
		char unique [] = removeDup(ch);
		
		System.out.println(Arrays.toString(unique));
		

		
		// System.out.println(toString(unique));
		
		String name = String.copyValueOf(unique);
		
		System.out.println(name);
		
		
		
		for(char i : unique)
		{
			if(i != ' ')
			{
				System.out.print(i);
			}
		}
		
		
		System.out.println("=========");
		String s = new String(unique);
		System.out.println(s);
		
		
		
	}
	
	public static char[] removeDup(char ch[])
	{
		
		int count[] = countOfElement(ch);
		
		int dup = 0;
		
		for(int i = 0; i<count.length; i++)
		{
			if(count[i] == -1)
			{
				dup++;
				
			}
			
		}
		
		char[] unique = new char [count.length-dup];
		
		for (int i = 0, j= 0; i < count.length; i++)
		{
			if(count[i] != -1 )
			{
				unique[j] = ch[i];
				j++;
			}
			
		}
		
		return unique;
		
		
		
		
	}
	
	public static int[] countOfElement(char ch[])
	{
		
		int count[] = new int[ch.length];
		 
		for(int i = 0; i<ch.length; i++)
		{
			int ct = 0;
			for(int j = i+1; j<ch.length; j++)
			{
				if(ch[i] == ch[j])
				{
					ct++;
					count[j] = -1;
				}
			}
			if(count[i] != -1)
			{
				count[i] = ct;
			}
		}
		
		return count;
		
	}
	

}
