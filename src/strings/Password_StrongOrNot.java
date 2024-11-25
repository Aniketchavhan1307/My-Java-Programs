package strings;

public class Password_StrongOrNot 
{
	public static void main(String[] args)
	{
		String s = "Aniket@123456";
		
		//String s = "Anik6";
		
		boolean upper, lower, digit, spl;
		
		upper = lower = digit = spl = false;
		
		if(s.length() > 8)
		{
			for (int i = 0; i < s.length(); i++)
			{
				char ch = s.charAt(i);
				
				if(ch>= 'a' && ch<= 'z')
				{
					lower = true;
				}
				else if(ch>= 'A' && ch<= 'Z')
				{
					upper = true;
					
				}
				else if(ch>='0' && ch<= '9')
				{
					digit = true;
				}
				else
				{
					spl = true;
				}
				
			}
			
			if( lower&& upper && digit && spl )
			{
				System.out.println("password is Strong");
			}
			else
			{
				System.out.println("Password is weak");
			}
			
			
		}
		else
		{
			System.out.println("password length should be greater than 8..");
			System.out.println("pass is weak");
		}
		
	}

}
