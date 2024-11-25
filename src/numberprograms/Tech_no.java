package numberprograms;

import java.util.Scanner;

public class Tech_no 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number..........");
		
		int ip = sc.nextInt();
		
	
		int count = count(ip);
		
		
		
		if(count % 2 ==0)
		{
			
		//	int temp = ip;
			
			//int lastHalf = ip % power(10, count/2);
			
		//	int firstHalf = ip / power(10, count/2);
			
			
			int den = power(10, count/2); 
			
			int lastHalf = ip % den;
			int firstHalf = ip / den;
			
			System.out.println("first------> "+ firstHalf);
			System.out.println("last-------> "+ lastHalf);
			
			int sum = lastHalf + firstHalf;
			
			if (sum * sum == ip)
			{
				System.out.println("The number is tech no");
			}
			else
			{
				System.out.println("The number is not tech no.");
				System.out.println("else");
			}
		}
		
		else
		{
			System.out.println("The number is not tech no.");
		}
		
	}
	
	public static int count(int num)
	{
		int ct=0;
		
		while(num>0)
		{
			ct++;
			num/=10;
		}
		System.out.println(ct);
		return ct;
	}
	

	public static int power(int base, int raise)
	{
		int power=1;
		
		for(int i =0; i < raise; i++)
		{
			power*= base;
		}
		System.out.println(power);
		
		return power;
	}
}
