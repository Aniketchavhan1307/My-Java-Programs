package strings;

public class ReverseCharOfString_NotSplSymbol 
{
	public static void main(String[] args) 
	{
		String str = "Ni@te_sh$";
		
//		String temp = reverse(str);
//		
//		System.out.println(temp);
//		
//		String ans = "";
//		
//		for (int i = 0, j=0; i < str.length(); i++) 
//		{
//			char ch1 = str.charAt(i);
//			
//			if(ch1 != '@' && ch1 != '_' && ch1 != '$')
//			{
//				ans = ans + temp.charAt(j);
//				j++;
//			}
//			else
//			{
//				ans = ans + ch1;
//			}
//			
//		}
//		System.out.println(ans);
		
		
		
		
		String ans = solve(str);
		System.out.println(ans);
	}

	public static String reverse(String str)
	{
		String rev = "";
		
		for (int i = str.length()-1; i >= 0; i--)
		{
			char ch = str.charAt(i);
			
			if(ch != '@' && ch != '_' && ch != '$')
			{
				rev = rev + ch;
			}
			
		}
		return rev;
	}
	
	
	
	
	public static String solve(String str)
	{
		String temp = reverse(str);
		
		
		
		String ans = "";
		
		for (int i = 0, j=0; i < str.length(); i++) 
		{
			char ch1 = str.charAt(i);
			
			if(ch1 != '@' && ch1 != '_' && ch1 != '$')
			{
				ans = ans + temp.charAt(j);
				j++;
			}
			else
			{
				ans = ans + ch1;
			}
			
		}
		return ans;
		
		
	}

}
