package recursion;

public class Palindrome
{
	public static void main(String[] args)
	{
		System.out.println(isPalindrom(123251));
		
	}
	
	public static boolean isPalindrom(int num)
	{
		int temp = num;
		int reverse = 0;
		
		if(num == temp)
		{
			return true;
		}
		else if(num != 0)
		{
			int rem = num%10;
			 reverse = reverse*10+ rem;
			 num/=10;
			 
			 isPalindrom(num);
			
		}
		
		return false;
	}

}
