package strings;

public class CountUpLowSpecialChar 
{
	public static void main(String[] args) 
	{
		String s = "My name is ANIKET and my Phno is 7083107292 and my password is Abc@123";
		 
		//String s = "Ani@Ke7T";
		
		
		int digit = 0, uppper = 0, lower = 0, spl = 0;
		
		for (int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(ch>= 'a' && ch<= 'z')
			{
				lower++;
			}
			else if (ch>= 'A' && ch<= 'Z')
			{
				uppper++;
			}
			else if (ch>= '0' && ch<= '9')
			{
				digit ++;
			}
			else
			{
				if(ch != ' ')
				{
					spl++;
				}
			}
			
		}
		
		System.out.println(digit);
		System.out.println(uppper);
		System.out.println(lower);
		System.out.println(spl);
	}

}
