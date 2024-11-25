package numberprograms;

import java.util.Scanner;

public class RotatingPrimeNo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number...........");
		
		int ip = sc.nextInt();
		
		int temp = ip;
		
		if(isPrime(ip))
		{
			ip = rotate(ip);
			
			while(ip != temp)
			{
				if(isPrime(ip))
				{
					ip = rotate(ip);
				}
				else
				{
					break;
				}
			}
			
			if(ip == temp)
			{
				System.out.println("The number is circular prime no........");
			}
			else
			{
				System.out.println("The number is Not circular prime no........");
			}
			
		}
		else
		{
			System.out.println("is not prime number.......");
		}
		
		
	}
	
	public static boolean isPrime(int num)
	{
		int den = 2;
		while(num>den)
		{
			if(num%den==0)
			{
				break;
			}
			den++;
		}
		if(den==num)
		{
			return true;
		}
		return false;
		
	}
	
	public static int rotate(int num)
	{
		int last = num%10;
		num/=10;
		
		int count = count(num);
		
		int ans = last * power(10,count)+num;
		
	//	System.out.println(ans);
		
		return ans;
	}
	
	public static int count(int num)
	{
		int ct =0;
		while(num>0)
		{
			ct++;
			num/=10;
			
		}
		
		return ct;
	}
	
	public static int power(int base, int raise)
	{
		int pow=1;
		
		for(int i=0; i<raise; i++)
		{
			pow = pow * base;
		}
		
	//	System.out.println(pow);
		
		return pow;
	}
	
	
}
