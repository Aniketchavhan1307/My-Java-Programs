package numberprograms;

import java.util.Scanner;

public class A 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number.......");
		int ip = sc.nextInt();
		
		int count = count(ip);
		
		if(count%2 == 0)
		{
			int den = power(10, count/2);
			
			int lastHalf = ip % den;
			int firstHalf = ip / den;
			
			int sum = lastHalf + firstHalf;
			
			if(sum*sum == ip)
			{
				System.out.println("tech number..");
			}
			else
			{
				System.out.println("not tech number");
			}
					
		}
		else
		{
			System.out.println("not ");
		}
		
		
		
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


















































