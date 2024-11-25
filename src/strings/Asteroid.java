package strings;

public class Asteroid 
{
	public static void main(String[] args) 
	{
		String str = "unnbee*rrrr**yz*";
		
		System.out.println(solve(str));
		
	}
	
	public static String solve(String str)
	{
		String temp = "";
		
		for(int i = str.length()-1; i>=0; )
		{
			int count = 0;
			
			char ch = str.charAt(i);
			
			if(ch == '*')
			{
				while(ch == '*')
				{
					count ++;
					i--;
					ch= str.charAt(i);
				}
				
				i = i- count;
			}
			else
			{
				temp = temp + ch;
				i--;
			}
		}
		return reverse(temp);
	}
	
	
	public static String reverse(String str)
	{
		
		String rev = "";
		
		for(int i = str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
			
		}
		
		return rev;
		
		
	}

}
