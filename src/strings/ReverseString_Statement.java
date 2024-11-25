package strings;

import java.util.Arrays;

public class ReverseString_Statement 
{
	public static void main(String[] aniket)
	{
		String s = "Aniket love Bharat ";
		
//		String rev = reverse(s);
//		System.out.println(rev);
		
		String sp[] = s.split(" ");
		System.out.println(Arrays.toString(sp));
		
		String ans = "";
		
		for (int i = 0; i < sp.length; i++)
		{
			sp[i] = reverse(sp[i]);
			
			if (i == sp.length-1)
			{
				ans = ans + sp[i];
			}
			else
			{
				ans = ans + sp[i] + " ";
			}
			
		}
		System.out.println(ans);
		
	}
	
	public static String reverse(String s)
	{
		String rev = "";
		
		for (int i = s.length()-1; i >= 0; i--)
		{
			
			rev = rev + s.charAt(i);
			
		}
		
		return rev;
	}

}
