package numberprograms;

import java.util.Scanner;

public class B 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number ......");
		
		int ip = s.nextInt();
		
		int temp = ip;
		
		if(isprime(ip))
		{
			ip = rotate(ip);
			
			while(ip != temp)
			{
				if(isprime(ip))
				{
					ip= rotate(ip);
				}
				else
				{
					break;
				}
			}
			if(ip == temp)
			{
				System.out.println("circular prime no");
			}
			else
			{
				System.out.println("not circular prime no.");
			}
			
		}
		else
		{
			System.out.println("is not prime no....");
		}
		
		
	}
	
	public static boolean isprime(int num)
	{
		int den =2;
		
		while(num>den)
		{
			if(num%den ==0)
			{
				return false;
			}
			den++;
		}
		return true;
	}
	
	public static int rotate(int num)
	{
		int last = num%10;
		num/=10;
		
		int count = count(num);
		
		int ans = last* power(10, count)+ num;
		
		return ans;
		
	}
	
	public static int count(int num)
	{
		int ct=0;
		
		while (num>0)
		{
			ct++;
			num/=10;
			
		}
		return ct;
	}
	
	public static int power(int base, int raise)
	{
		int pow=1;
		
		for ( int i=0; i<raise; i++)
		{
			pow*=base;
		}
		
		return pow;
	}
}




